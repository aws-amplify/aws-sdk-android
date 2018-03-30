# AWS SDK for Android 

[![Build Status](https://travis-ci.org/aws/aws-sdk-android.png?branch=master)](https://travis-ci.org/aws/aws-sdk-android)
[![GitHub release](https://img.shields.io/github/release/aws/aws-sdk-android.svg)](https://github.com/aws/aws-sdk-android/releases)
[![Maven Central](https://img.shields.io/maven-central/v/com.amazonaws/aws-android-sdk-pom.svg)]()
[![Twitter Follow](https://img.shields.io/twitter/follow/awsformobile.svg?style=social&label=Follow)]()

The [AWS SDK for Android](https://aws.amazon.com/mobile/resources/) provides a library and documentation for developers to build connected mobile applications using AWS.



## Resources


* **[Code Samples](https://github.com/awslabs/aws-sdk-android-samples)** - Repository of example projects using the SDK.
* **[AWS Mobile Forum](https://forums.aws.amazon.com/forum.jspa?forumID=88)** – Ask questions, get help, and give feedback
* **[Developer Guide](https://docs.aws.amazon.com/aws-mobile/latest/developerguide/getting-started.html)** - For in-depth getting started and usage information.
* **[Javadoc](http://docs.aws.amazon.com/AWSAndroidSDK/latest/javadoc/)** - For operations, parameters, responses, and examples
* **[AWS Mobile Developer Blog](http://mobile.awsblog.com/)** - For updates and guidance on using the AWS SDK for Android
* **[Release Notes](https://aws.amazon.com/releasenotes/Android)** - To see the latest features, bug fixes, and changes in the SDK
* **[Issues](https://github.com/aws/aws-sdk-android/issues)** - Report issues and submit pull requests (see [Apache 2.0 License](http://aws.amazon.com/apache-2-0/))
* **[@awsformobile](https://twitter.com/awsformobile)** - Follow us on Twitter

## Understanding the SDK

This section explains how to understand and work with the various components of the SDK.  The SDK provides direct access to many AWS service API's.  It also has a collection higher level API's (called mobile connectors) which make mobile development easier.

### Supported AWS Services

The AWS SDK for Android supports the following AWS services:

* [Amazon API Gateway](https://aws.amazon.com/api-gateway/)
* [Amazon Auto Scaling](https://aws.amazon.com/autoscaling/)
* [Amazon CloudWatch](https://aws.amazon.com/cloudwatch/)
* [Amazon CloudWatch Logs](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_GettingStarted.html)
* [Amazon Cognito](https://aws.amazon.com/cognito/)
* [Amazon Cognito Auth](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-userpools-server-contract-reference.html)
* [Amazon DynamoDB](https://aws.amazon.com/dynamodb/)
* [Amazon Elastic Compute Cloud (EC2)](https://aws.amazon.com/ec2/)
* [Amazon Elastic Load Balancing (ELB)](https://aws.amazon.com/elasticloadbalancing/)
* [AWS IoT](https://aws.amazon.com/iot/)
* [AWS Key Management Service (KMS)](https://aws.amazon.com/kms/)
* [Amazon Kinesis Firehose](https://aws.amazon.com/kinesis/firehose/)
* [Amazon Kinesis Streams](https://aws.amazon.com/kinesis/streams/)
* [Amazon Kinesis Video Streams](https://aws.amazon.com/kinesis/video-streams/)
* [AWS Lambda](https://aws.amazon.com/lambda/)
* [Amazon Lex](https://aws.amazon.com/lex)
* [Amazon Machine Learning](https://aws.amazon.com/machine-learning/)
* [Amazon Mobile Analytics](https://aws.amazon.com/mobileanalytics/)
* [Amazon Pinpoint](https://aws.amazon.com/pinpoint/)
* [Amazon Polly](https://aws.amazon.com/polly/)
* [Amazon Rekoginiton](https://aws.amazon.com/rekognition/)
* [Amazon S3](https://aws.amazon.com/s3/)
* [Amazon Security Token Service (STS)](https://docs.aws.amazon.com/STS/latest/APIReference/Welcome.html)
* [Amazon Simple Email Service (SES)](https://aws.amazon.com/ses/)
* [Amazon Simple Notification Service (SNS)](https://aws.amazon.com/sns/)
* [Amazon Simple Queue Service (SQS)](https://aws.amazon.com/sqs/)
* [Amazon SimpleDB](https://aws.amazon.com/simpledb/)

### A Quick Code Example

**Uploading a File to Amazon S3, and then downloading it using Async Task**


```

private class S3Example extends AsyncTask<Void,Void,Void>{
        @Override
        protected Void doInBackground(Void... params) {
        
            // Initialize the Amazon Cognito credentials provider
            CognitoCachingCredentialsProvider credentialsProvider = new CognitoCachingCredentialsProvider(
                MY-ACTIVITY.getApplicationContext(), // Application Context
                "MY-IDENTITY-POOL-ID", // Identity Pool ID
                Regions.SELECT_YOUR_REGION // Region enum
            );

            AmazonS3Client s3Client = new AmazonS3Client(credentialsProvider);
            File fileToUpload = YOUR_FILE;
            //(Replace "MY-BUCKET" with your S3 bucket name, and "MY-OBJECT-KEY" with whatever you would like to name the file in S3)
            PutObjectRequest putRequest = new PutObjectRequest("MY-BUCKET", "MY-OBJECT-KEY",
                        fileToUpload);
            PutObjectResult putResponse = s3Client.putObject(putRequest);

            GetObjectRequest getRequest = new GetObjectRequest("MY-BUCKET", "MY-OBJECT-KEY");
            S3Object getResponse = s3Client.getObject(getRequest);
            InputStream myObjectBytes = getResponse.getObjectContent();

            // Do what you want with the object
            
            myObjectBytes.close();

            return null;
        }
}

```

### SDK Fundamentals
There are only a few fundamentals that are helpful to know when developing against the AWS SDK for Android.

* Never embed credentrials in an Android application.  It is trivially easy to decompile applications and steal embedded credentials.  Always use temporarily vended credentials from services such as [Amazon Cognito Identity](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-identity.html).
* Unless explicitly stated, calls are synchronous and must be taken off of the main thread.
* Unless explicitly stated, calls can always throw an AmazonServiceException or an AmazonClientException (depending on if the exception is generated by the client or the service).
* The SDK will handle re-trying requests automatically, but unless explicitly stated will throw an exception if it cannot contact AWS.
* We are always looking to help, please feel free to contact us on our [forum](https://forums.aws.amazon.com/forum.jspa?forumID=88).


### Basic Service API Calls

The SDK provides access to many AWS Services.  At the most basic level the SDK provides a request/response model for many of the various service methods.  At this level, for a given service, you will have a client that accepts request objects and will pass back a response object, or throw an error.  This basic model is shown in the above example.  Looking at the [Javadoc](http://docs.aws.amazon.com/AWSAndroidSDK/latest/javadoc/) you will notice that services typically have a com.amazonaws.services.*servicename* package and com.amazonaws.services.*servicename*.model package .  This *servicename* package contains the client that you will pass request/response objects to in order to make service calls.  The *servicename*.model package contains classes that model the request and response parameters of calls to and from AWS services.


### Mobile Connectors  

The SDK also provides a higher level experience for many services.

### S3 Transfer Utility

The TransferUtility adds convenience and reliability on top of using the standard `AmazonS3Client` when uploading and downloading data to S3:

* Enhances performance by automatically converting  upload transfers > 5MB to multi-part uploads, using multiple threads.
* Provides the ability to pause/resume/cancel upload/download transfers, which is useful if the app is being killed or loses internet connectivity.
* Automatically pauses/resumes upload/download transfers when network connectivity changes.

### S3 Transfer Manager (Deprecated)

The Transfer Manager adds convenience and reliability on top of using the standard `AmazonS3Client` when uploading and downloading binary data to S3:

* Enhances performance by automatically converting large requests to multi-part uploads, using multiple threads.
* Allows developers to pause/resume uploads/downloads, which is especially useful if the app is being killed or loses internet connectivity.
* Provides additional convenience methods for things such as uploading directories recursively.

### DynamoDB Object Mapper

DynamoDB Object Mapper lets you map client-side classes to DynamoDB tables similar to standard ORM techniques.  With it you can:

* Perform various create, read, update, and delete (CRUD) operations, as well as execute queries which automatically return the classes you specify.  
* Use S3 link if the class you are mapping contains large blob data.  With S3 Links you can store large chunks of bytes, such as avatar images, in S3 while storing the rest of the class data, such as primitives and strings in DynamoDB.

Note:  The DynamoDB Mapper is in a separate jar (and Maven package), but requires the DynamoDB jar to be on the classpath.  If you want to use S3 Links, you will also need the Amazon S3 jar on the classpath.


### Lambda Invoker
The Lambda Invoker helps calling code in the cloud via AWS Lambda by:

* Automatically providing your Lambda functions with data about the device, app, and end user identity for personalized responses.
* Allowing you to annotate Java interfaces, denoting them as proxies to Lambda fuctions, letting you stay in the Java paradigm.

### Amazon Cognito

The Amazon Cognito mobile connector provides the ability to:

* Authenticate users from login providers such Amazon, Facebook, Google, Twitter, or your own custom identity provider.
* Synchronize user profile data, app preferences or game state across devices and across login providers.
* Record and update user data while offline.

**Note**: The Amazon Cognito Federated Identities classes are part of `AWS SDK for Android - Core` (`aws-android-sdk-core` Maven package) and can be found [here](https://github.com/aws/aws-sdk-android/tree/master/aws-android-sdk-core). The Amazon Cognito Sync code can be found [here](https://github.com/aws/aws-sdk-android/tree/master/aws-android-sdk-cognito).


### Amazon Mobile Analytics
Using Amazon Mobile Analytics, you can:

* Record custom events
* Automatically track customer behaviors, aggregate metrics, and generate data visualizations.
* Record events to disk, and select when to send batches of recorded events to AWS.  (This allows saving of events while offline, and saves battery life by infrequently waking up the network.)
* Specify the maximum amount of storage space you want to dedicate to event storage.



### Kinesis Recorder
Amazon Kinesis allows for real-time processing of streaming data at massive scale.  Unlike Amazon Mobile Analytics, using Amazon Kinesis developers write server side code to process data sent to Kinesis.  An example would be recording click stream data.  

* The Kinesis Recorder allows developers to save PutRecordRequests to disk and send them in batches.  (This allows saving of records while offline, and saves battery life by infrequently waking up the network.)



## Getting Started Using the SDK

Follow these step-by-step instructions to get up and running with the SDK.  Please note the AWS SDK for Android supports Android API level 10+.

### Sign up for AWS
Before you begin, you need to sign up for an AWS account [here](http://aws.amazon.com/), click 'Sign In to the Console', and select new user.

### Create an Amazon Cognito Identity pool 
Amazon Cognito Identity allows you to authenticate users to access your AWS resources without having to place your credentials within the applicaiton itself (which is *very* insecure).

To create a Identity Pool

1.  Log into the [Cognito Console](https://console.aws.amazon.com/cognito/home) and click the Get Started button (or the New Identity Pool button if your account already has an identity pool).
2.  Give your Identity Pool a unique name and either enable access to unauthenticated identities or follow the guides presented in the console to setup an authentication provider (Such as Amazon, Facebook, Google, Twitter, or be your own authentication provider).  Then click create pool.
3.  You will need to create a role associated with your Identity Pool.  This role specifies the actions that users in the identity pool are allowed to make.  By default the console provides you with a role that allows the synchronization of user data from Cognito Sync and recording user events using Amazon Mobile Analytics.  For some example ways to allow other services, or to revoke the permission for these default services see the [Getting Started Guide](http://docs.aws.amazon.com/mobile/sdkforandroid/developerguide/getting-started-android.html) and navigate to the service you are interested in to see an example of how to create an appropriate role.
4.  The Cognito console will then present you with a code snippet for getting AWS Credentials to your application.  Keep this open as you may find it useful once you are ready to start coding with the SDK.

### Depend on the AWS SDK for Android in your application

The following 3 sections describe how you can depend on the SDK in your application using Gradle with Android Studio, Maven, or by downloading the Jar files from our website.  If you use Maven or Gradle you can automatically get new versions of the SDK when they are released.

#### Using Gradle with Android Studio

The AWS Android SDK (since version 2.1.3) is hosted in the Maven central repository.  Gradle with Android Studio allows you to declare dependencies on packages in the Maven central repository right out of the box.  Simply add "compile 'com.amazonaws:aws-android-sdk-SERVICE:2.x.x'"to your app's build.gradle (Module)'s dependencies{ } section, without the double quotes, but with the single quotes and replacing x.x with the version you want and  SERVICE with any of the following


(hint: you can specify 2.+ or 2.x.+ to automatically get the latest version where the + is specified.  Remember for version 2.X.Y an increase in X may indicate a breaking change or new features, while increases in Y are likely bug fixes, or small feature improvements)
 
Note: Cognito Identity authentication abilities are included in the aws-android-sdk-core which all of the following packages depend on.

* cognito (Amazon Cognito Sync),
* s3 (Amazon S3),
* ddb (Amazon DynamoDB),
* kinesis (Amazon Kinesis),
* ddb-mapper (Amazon DynamoDB Object Mapper),
* mobileanalytics (Amazon Mobile Analytics),
* machinelearning (Amazon Machine Learning),
* sqs (Amazon SQS),
* sns (Amazon SNS),
* elb (Elastic Load Balancing),
* ses (Amazon SES),
* cloudwatch (Amazon CloudWatch),
* autoscaling (Auto Scaling),
* ec2 (Amazon EC2),
* sdb (Amazon Simple DB),
* polly (Amazon Polly)

#### Using Maven 

The AWS Mobile SDK for Android (since version 2.1.3) supports Apache Maven. A Maven project contains a pom.xml file where you can specify the Amazon Web Services that you want to use in your app. Maven then includes the services in your project, so that you don't have to download the entire AWS Mobile SDK and manually include JAR files. If you're new to Maven and you'd like to learn more about it, see the [Maven documentation](http://maven.apache.org/what-is-maven.html).


Here's an example pom.xm showing how you can add Amazon Cognito Identity, Amazon S3, and Amazon Pinpoint to your project:


```
<dependencies>
    <dependency>
        <groupid>com.amazonaws</groupid>
        <artifactid>aws-android-sdk-core</artifactid>
        <version>[2.2,3.0)</version>
    </dependency>
    <dependency>
        <groupid>com.amazonaws</groupid>
        <artifactid>aws-android-sdk-s3</artifactid>
        <version>[2.2,3.0)</version>
    </dependency>
    <dependency>
        <groupid>com.amazonaws</groupid>
        <artifactid>aws-android-sdk-pinpoint</artifactid>
        <version>[2.2,3.0)</version>
    </dependency>
</dependencies>
```

#### Including the Jars

You can also download the .zip file containing the jars files of the SDK [here](http://aws.amazon.com/mobile/sdk/).  How you include these in your project will depend on the editor you are using.  

For an Eclipse project, add the jar files to a folder in your project called 'libs' (creating one if it doesn't already exist).  The Eclipse Android plug-in will usually add this to your classpath by default. If it does not right click your project --> properties --> Java build path (Libraries tab), add Jar and select the Jars you want to add

For Android studio, in the project view.  Add the jars, under YourApp/app/libs, and right click the jar 'Add as Library'


 
## Building the SDK
This section describes how you can compile the SDK source code on your own.


You can build the source via Maven, which can be downloaded and installed from [here](https://maven.apache.org/run-maven/). Building the SDK requires the Java 7 JDK. 

After installing Java and Maven, clone this repository

#### Developing

The recommended IDE is Eclipse, but you should be able to use your favorite IDE as long as it supports Maven. You can import the cloned repository as 'Existing Maven Projects' and then start to make changes. In order to standardize formatting, please import `eclipse-formatting.xml` into `Java -> Code Stype -> Formatter` and `eclipse.importorder` into `Java -> Code Style -> Organize Imports`.

#### Compiling

In a terminal, go inside the respository you just cloned and type

    mvn package

from the repository directory and you will get the resulting JAR in the target folders of each service.

Note: that if you want to use the DynamoDB Object Mapper (dynamodbmapper) you will need to also include ddb (and optionally S3 if you want to use the S3 link capabilities). Also, if you want to use Cognito Sync, you will have to include it separately since it is not part of this repo.  It can be found in [here](https://github.com/aws/amazon-cognito-android).

#### Issues with JAVA_HOME on Mac

If you are using a Mac, you may run into issues when trying to compile, because certain Java installations do not set your JAVA_HOME environment variable, which is referenced in pom.xml. To fix this, you can run the command below, and then run 'mvn package'.

    export JAVA_HOME=`/usr/libexec/java_home -v 1.7`

## To learn more about Android Development

For more information on Android development, see the Android developer site at: [developer.android.com](http://developer.android.com/index.html)