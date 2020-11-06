.PHONY: help clean test bench prof tidy sniff .travis

help:                   # Displays this list
	@echo; grep "^[a-z][a-zA-Z0-9_<> -]\+:" Makefile | sed -E "s/:[^#]*?#?(.*)?/\r\t\t\1/" | sed "s/^/ make /"; echo

version:                # Display used aws-cli version
	aws --version

create-role:            # Create role with aws-cli with provided trust-policy.json
	aws iam create-role --role-name lambda-ex --assume-role-policy-document file://trust-policy.json

zip:            		# Create deployment package
	zip function.zip index.js

create-function:        # Create function with aws-cli
	aws lambda create-function --function-name my-function --zip-file fileb://function.zip --handler index.handler --runtime nodejs12.x --role arn:aws:iam::987980092179:role/lambda-ex

invoke:                 # Invoke function with aws-cli
	aws lambda invoke --function-name my-function out --log-type Tail --query 'LogResult' --output text |  base64 -d

update-function-code:                 # Invoke function with aws-cli
	aws lambda update-function-code --function-name my-function --zip-file fileb://function.zip

