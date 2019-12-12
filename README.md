# Sample SCF for deploying to AWS Lambda

A very basics SCF starting project for Lambda.

## Instructions

* Set the Handler to "com.example.scf.lambda.DefaultLambdaHandler"
* Add the Environment variable: FUNCTION_NAME = uppercase

## TODO
* The `spring-boot-thin-layout` seems to be required to get the JAR to be fully
"flattened" out for AWS.