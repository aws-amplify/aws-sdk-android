# AWS SDK for Android 

[![GitHub release](https://img.shields.io/github/release/aws-amplify/aws-sdk-android.svg)](https://github.com/aws-amplify/aws-sdk-android/releases)
[![Maven Central](https://img.shields.io/maven-central/v/com.amazonaws/aws-android-sdk-pom.svg)](https://search.maven.org/search?q=a:aws-android-sdk-pom)

The AWS SDK for Android provides a library and documentation for developers to build connected mobile applications using AWS.

### Features / APIs

- [__Authentication__](https://aws-amplify.github.io/docs/android/authentication): APIs and building blocks for developers who want to create user authentication experiences.  
- [__Analytics__](https://aws-amplify.github.io/docs/android/analytics): Easily collect analytics data for your app. Analytics data includes user sessions and other custom events that you want to track in your app.  
- [__API__](https://aws-amplify.github.io/docs/android/api): Provides a simple solution when making HTTP requests. It provides an automatic, lightweight signing process which complies with AWS Signature Version 4.
- [__Storage__](https://aws-amplify.github.io/docs/android/storage): Provides a simple mechanism for managing user content for your app in public, protected or private storage buckets.  
- [__Push Notifications__](https://aws-amplify.github.io/docs/android/push-notifications): Allows you to integrate push notifications in your app with Amazon Pinpoint targeting and campaign management support.
- [__PubSub__](https://aws-amplify.github.io/docs/android/pubsub): Provides connectivity with cloud-based message-oriented middleware.  
- [__Generated AWS Service Interfaces__](https://aws-amplify.github.io/docs/android/manualsetup): Provides direct interaction with any AWS service. 

#### Visit our [Web Site](https://aws-amplify.github.io) to learn more about Amplify Framework.

* [Documentation](https://aws-amplify.github.io/docs)
* [Setup](#setup)
* [Examples](https://github.com/awslabs/aws-sdk-android-samples)

## Setup

Please note the AWS SDK for Android supports Android API level 10+ and newer libraries may require higher API level 21+ and 23+.

### Include the SDK for Android in an Existing Application

The following 3 sections describe how you can depend on the SDK in your application using Gradle with Android Studio, Maven, or by downloading the Jar files from our website.
If you use Maven or Gradle you can automatically get new versions of the SDK when they are released.

#### Using Gradle with Android Studio

<details>
<summary>Click for More Info</summary>
The AWS Android SDK (since version 2.1.3) is hosted in the Maven central repository.
Gradle with Android Studio allows you to declare dependencies on packages in the Maven central repository right out of the box.
</details>

Simply add to your app's build.gradle (Module)'s dependencies{ } section

```groovy
    dependencies {
        implementation 'com.amazonaws:aws-android-sdk-SERVICE:2.x.y'
    }
```

SERVICE can be `s3`, `ddb`, `pinpoint`, etc.

(hint: you can specify 2.+ or 2.x.+ to automatically get the latest version where the + is specified.
Remember for version 2.X.Y an increase in X may indicate a breaking change or new features, while increases in Y are likely bug fixes, or small feature improvements)
 
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

<details>
<summary>Click for More Info</summary>
The AWS Mobile SDK for Android (since version 2.1.3) supports Apache Maven.
A Maven project contains a pom.xml file where you can specify the Amazon Web Services that you want to use in your app.
Maven then includes the services in your project, so that you don't have to download the entire AWS Mobile SDK and manually include JAR files.
If you're new to Maven and you'd like to learn more about it, see the [Maven documentation](http://maven.apache.org/what-is-maven.html).
</details>

Here's an example pom.xml showing how you can add Amazon Cognito Identity, Amazon S3, and Amazon Pinpoint to your project:

```xml
<dependencies>
    <dependency>
        <groupid>com.amazonaws</groupid>
        <artifactid>aws-android-sdk-core</artifactid>
        <version>[2.6,3.0)</version>
    </dependency>
    <dependency>
        <groupid>com.amazonaws</groupid>
        <artifactid>aws-android-sdk-s3</artifactid>
        <version>[2.6,3.0)</version>
    </dependency>
    <dependency>
        <groupid>com.amazonaws</groupid>
        <artifactid>aws-android-sdk-pinpoint</artifactid>
        <version>[2.6,3.0)</version>
    </dependency>
</dependencies>
```

#### Including the Jars

You can also download the .zip file containing the jars files of the SDK [here](https://sdk-for-android.amazonwebservices.com/latest/aws-android-sdk.zip).
How you include these in your project will depend on the editor you are using.

For an Eclipse project, add the jar files to a folder in your project called 'libs' (create one if it doesn't already exist).  The Eclipse Android plug-in will usually add this to your classpath by default. If it does not right click your project --> properties --> Java build path (Libraries tab), add Jar and select the Jars you want to add

For Android studio, in the project view. Add the jars, under YourApp/app/libs, and right click the jar 'Add as Library'

## Understanding the SDK

This section explains how to understand and work with the various components of the SDK.
The SDK provides direct access to many AWS service API's.
It also has a collection higher level API's (called mobile connectors) which make mobile development easier.

### A Quick Code Example

**Uploading a File to Amazon S3, and then downloading it using Async Task**

```java
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

* Never embed credentrials in an Android application.  It is trivially easy to decompile applications and steal embedded credentials.  Always use temporarily vended credentials from services such as Amazon Cognito Identity.
* Unless explicitly stated, calls are synchronous and must be taken off of the main thread.
* Unless explicitly stated, calls can always throw an AmazonServiceException or an AmazonClientException (depending on if the exception is generated by the client or the service).
* The SDK will handle re-trying requests automatically, but unless explicitly stated will throw an exception if it cannot contact AWS.
* We are always looking to help, please feel free to open an [issue](https://github.com/aws-amplify/aws-sdk-android/issues).

## Building the SDK
This section describes how you can compile the SDK source code on your own.

For command line approach, you can build the source via Gradle, which can be downloaded and installed from [here](https://gradle.org/install/).
After installing Gradle, clone this repository and run

    gradlew build

Otherwise, use Android Studio to open the project and build the sub-project(s) of your choice and check the `build` folder for `libs` or `output/aar`.

#### Issues with unit tests on Windows

If you are using a Windows machine, unit tests that involve file deletion can fail because the filesystem does not respond well to `file.delete()`.

## To learn more about Android Development

For more information on Android development, see the Android developer site at: [developer.android.com](http://developer.android.com/index.html)

## Talk to Us

Visit our GitHub [Issues](https://github.com/aws-amplify/aws-sdk-android/issues) to leave feedback and to connect with other users of the SDK.

## Author

Amazon Web Services

## License

See the **LICENSE** file for more info.