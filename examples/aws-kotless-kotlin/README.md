# aws-kotless-kotlin

1. Use Gradle Wrapper `gradlew init` to initialise projekt
2. Install the Kotless plugin
3. Install the Kotless DSL dependency
4. Use Kotless DSL annotations, e.g. `@Get` or `@StaticGet`
5. Configure AWS Connection via `kotless` configuration in `build.gradle.kts`
6. Start local `./gradlew local`
7. Please do not forget to scan classpath, as seen in config `build.gradle.kts:kotless:webapp:lambda:kotless` :)
8. For deployment in AWS you need:
    1. the name of an S3 bucket, configured in `build.gradle.kts`
    2. a user, which name is configured in `build.gradle.kts` and its credentials are in aws-client config path (default: `~\.aws\credentials`)
    3. make sure the user has enough access rights, to deploy to lambda, use the bucket, create crons, etc.
    4. the region you want to deploy in, configured in `build.gradle.kts`
8. Start deployment with `./gradlew deploy` directly to aws lambda
