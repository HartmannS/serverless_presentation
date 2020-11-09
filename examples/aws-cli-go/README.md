# AWS CLI
## Example Project

1. Install AWS CLI
    1. either use with docker container, `~/.aws` config files are mounted
    2. or install locally (Ubuntu 20.04: `sudo apt-get install awscli` only delivers version 1)
    3. https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-install.html
2. Create AWS User (IAM Management)
    1. https://console.aws.amazon.com/iam/
3. Configure AWS CLI with `aws configure`
    1. https://docs.aws.amazon.com/cli/latest/userguide/cli-configure-quickstart.html
4. Create Role with `aws iam create-role` and `trust-policy.json`
    1. example output in `create-role-output.yaml`
5. Create `main.go`
6. Build `main` binary from `main.go`
7. Zip `main` binary into `function.zip`
8. Create function with `aws lambda create-function`
    1. example output in `create-function-output.yaml`
9. Invoke function with `aws lambda invoke`
10. Update function code with `aws lambda update-function-code`
