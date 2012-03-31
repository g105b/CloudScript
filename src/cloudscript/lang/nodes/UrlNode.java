package cloudscript.lang.nodes;

import cloudscript.lang.*;

import java.net.*;
import java.io.*;
import java.util.*;

import org.json.simple.*;
import org.json.simple.parser.*;

public class UrlNode extends Node {
	public String content;
	private JSONParser parser;
	private Map<String, String> data;
  
  public UrlNode(String location) {
	parser = new JSONParser();
    try {
		try {
			URLConnection conn = new URL(location).openConnection();
		    InputStream response = conn.getInputStream();
			
			// STUPID hack to convert an InputStream to a String in one line:
			InputStream input = conn.getInputStream();
			try {
				this.content = new java.util.Scanner(input).useDelimiter("\\A").next();
				ContainerFactory containerFactory = new ContainerFactory() {
					public List creatArrayContainer() {
						return new LinkedList();
					}
					public Map createObjectContainer() {
						return new LinkedHashMap();
					}
				};

				try {
					Map json = (Map)parser.parse(content, containerFactory);
					Iterator iter = json.entrySet().iterator();
					data = new HashMap<String, String>();
					while(iter.hasNext()) {
						Map.Entry entry = (Map.Entry)iter.next();
						data.put(entry.getKey().toString(), entry.getValue().toString());
					}
				}
				catch(ParseException pe) {
				}
			}
			catch (java.util.NoSuchElementException e) {
			  this.content = "{\"Error\": \"NO CONTENT\"}";
			}
		}
		catch(MalformedURLException e) {
		}
	}
	catch(IOException e) {
	}
  }
  
  public CloudScriptObject eval(Context context) throws CloudScriptException {
	CloudScriptClass clazz = context.getCurrentClass();

	for(Map.Entry<String, String> entry : data.entrySet()) {
		final String key = entry.getKey();
		final String value = entry.getValue();

		if(!clazz.hasMethod(key)) {
			clazz.addMethod(key, new Method() {
				public CloudScriptObject call(CloudScriptObject receiver, CloudScriptObject arguments[]) throws CloudScriptException {
					ValueObject content = new ValueObject(value);
					int numValue;

					try {
						numValue = Integer.parseInt(value);
						content = new ValueObject(numValue);
					}
					catch(NumberFormatException e) {}

					return content;
				}
			});
		}
	}
	return new ValueObject(this.content);
  }
}
