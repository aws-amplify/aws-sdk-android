# AWS SDK for Android

The [AWS SDK for Android](http://aws.amazon.com/sdkforandroid) provides a library, code samples, and documentation for developers to build connected mobile applications using AWS.

To learn more about using the SDK, see the  [documentation](http://aws.amazon.com/documentation/sdkforandroid/). 

For updates and guidance on using the AWS SDK for Android, please consider following our [AWS Mobile Developer Blog](http://mobile.awsblog.com/).

## Version 2 of the AWS Mobile SDK now Generally Available

Version 2 of the AWS Mobile SDK for Android has reached General Availability (GA) and is no longer in Developer Preview.  Version 1 is deprecated as of September 29, 2014 and will continue to be available until December 31, 2014 in our [aws-sdk-android-v1](https://github.com/aws/aws-sdk-android-v1) repository. If you are building new apps, we recommend you use Version 2.

## Version 2 highlights

* **Amazon Cognito** - is a simple user identity and synchronization service that helps you securely manage and synchronize app data for your users across their mobile devices. With Amazon Cognito, you can save any kind of data, such as app preferences or game state, in the AWS Cloud without writing any backend code or managing any infrastructure.
* **Amazon Mobile Analytics** - is a service for collecting, visualizing and understanding app usage data at scale. Amazon Mobile Analytics reports are typically updated within 60 minutes from when data are received. Amazon Mobile Analytics is built to scale with the business and can collect and process billions of events from millions of endpoints.
* **Amazon Kinesis Recorder** - enables you to reliably record data to an Amazon Kinesis data stream from your mobile app. Kinesis Recorder batches requests to handle intermittent network connection and enable you to record events even when the device is offline.
* **Amazon S3 Transfer Manager** - We have added the ability to pause and resume downloads/uploads to make transferring files to S3 faster and easier.
* **AWS Lambda Invoker** - AWS Lambda is now included in the AWS Mobile SDK, making it easy to build mobile applications that use Lambda functions as their app backend. You can now create AWS Lambda functions that respond to events from your application synchronously (real time) as well as asynchronously, making it easy for any application or web service to use Lambda to create back-end functionality. When invoked through the mobile SDK, the Lambda function automatically has access to data about the device, app, and end user identity, making it easy to create rich, personalized responses to in-app activity. To learn more about SDK support for Lambda, visit the [AWS Mobile SDK](http://aws.amazon.com/mobile/sdk/) page. To learn more about the new capabilities from Lambda, visit the [What's new](http://aws.amazon.com/lambda/whatsnew/) page for AWS Lambda.
* **Amazon Machine Learning** - Amazon Machine Learning is a service that makes it easy for developers of all skill levels to use machine learning technology. This release adds Amazon Machine Learning support into AWS Mobile SDK for Android. You can use the mobile SDK to retrieve Amazon ML model metadata, including the real-time endpoint URL, and to request real-time predictions from Amazon ML. To learn more about Amazon ML, visit [http://aws.amazon.com/machine-learning](http://aws.amazon.com/machine-learning).

## Building the SDK

You can build from source via Maven. Building the SDK requires the Java 7 SDK. Note that if you build from source you will only have one JAR. You will have to configure which of the services you want to include in that JAR via the proguard.cfg file. The process is explained below.

#### Specifying packages
In the proguard.cfg, you should see 

        #autoscaling
        !com.amazonaws.services.autoscaling.**,
        #cloudwatch
        !com.amazonaws.services.cloudwatch.**,
        #ddb mapper
        !com.amazonaws.services.dynamodbv2.datamodeling.**,
        !com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.**,
        #ddb
        !com.amazonaws.services.dynamodbv2.**,
        #ec2
        !com.amazonaws.services.ec2.**,
        #elb
        !com.amazonaws.services.elasticloadbalancing.**,
        #kinesis
        !com.amazonaws.services.kinesis.**,
        !com.amazonaws.mobileconnectors.kinesis.**,
        #analytics
        !com.amazonaws.services.mobileanalytics.**,
        !com.amazonaws.mobileconnectors.amazonmobileanalytics.**,
        #s3
        !com.amazonaws.services.s3.**,
        !com.amazonaws.mobileconnectors.s3.**,
        #sdb
        !com.amazonaws.services.simpledb.**,
        #ses
        !com.amazonaws.services.simpleemail,
        #sns
        !com.amazonaws.services.sns.**,
        #sqs
        !com.amazonaws.services.sqs.**,

These lines tell ProGuard that it is allowed to remove the code associated with the services. So, if you want to use any of these services, you just need to comment out (or remove) the lines associated with that service.

For example, if you want to use S3, you would change the section above to

        #s3
        #!com.amazonaws.services.s3.**,
        #!com.amazonaws.mobileconnectors.s3.**,

Note that if you want to use the DynamoDB Object Mapper (dynamodbmapper) you will need to also include ddb. Also, if you want to use Cognito Sync, you will have to include it separately since it is not part of this repo.

#### Compiling

After specifying the packages you want to use, you can just run

    mvn package

from the project directory and you will get the resulting JAR in the target folder.

#### Issues with JAVA_HOME on Mac

If you are using a Mac, you may run into issues when trying to compile because certain Java installations do not set your JAVA_HOME environment variable, which is referenced in pom.xml. To fix this, you can run the command,

    export JAVA_HOME=`/usr/libexec/java_home -v 1.7`

## To learn more about Android Development

For more information on Andorid development, see the Android developer site at: [developer.android.com](http://developer.android.com/index.html)
