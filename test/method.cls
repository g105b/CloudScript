# Methoc definition

# Method names can end with ? or !
# If no parameters, parenthesis can be skipped.
fn no_args?
  print("indeed")
end

no_args?
# => indeed

fn call_me!(name, calling)
  print(name, "driiiing!", calling)
end

call_me!("bob", "bill")
# => bob
# => driiiing!
# => bill
