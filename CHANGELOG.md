# Change Log - AWS SDK for Android

## [Release 2.6.17](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.17)

### Bug Fixes

* **Amazon Pinpoint**
  * Issue with Android API level 23 causing crashes when generating notification icon from a bitmap. Updated SDK behavior to only generate icon from a bitmap on API level 24 and above.
  * Fixed an issue when the userId was unset, registering for notifications would clobber the userId on the server. This overwrote any value set by `updateEndpointProfile`. Set user id to empty string to reset server user id, null to retain server value.
  * Issue with ANRs (Application Not Responding) when downloading images for notifications. Updated SDK behavior to background download image tasks.
  * Added an option to specify a custom ExecutorService through PinpointConfiguration for the TargetingClient. Use `PinpointConfiguration.withExecutor(ExecutorService)` to choose an Executor to register for Pinpoint notifications and to run handlers. Choosing a single thread Executor can be used when running handlers sequentially on the same thread after registration.

* **Amazon S3**
  * Optimized the `TransferService.loadAndResumeTransfersFromDB` to minimize the time holding the database connection.

## [Release 2.6.16](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.16)

### Enhancements

* **Amazon S3**
  * Added `TransferUtilityOptions` to configure the size of the transfer thread pool and the time interval in `TransferService` to check for unfinished transfers and resume them.
  * Fixed bugs and added some performance improvements.

## [Release 2.6.15](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.15)

### New Features

* **Amazon Cognito Identity Provider**
  * Support for user migration over lambda trigger in Cognito User Pools.

### Enhancements

* **Amazon Kinesis Video Streams**
  * **Breaking API  Changes**: Added `uploadHandle` parameter to the following APIs.
      * `KinesisVideoProducerStream.getDataStream()`
      * `KinesisVideoProducerStream.fragmentAck()`
      * `KinesisVideoProducerStream.streamTerminated()`
      * `StremCallbacks.streamDataAvailable()`
      * `StremCallbacks.streamClosed()`
      * `NativeKinesisVideoProducerJni.streamClosed()`
      * `NativeKinesisVideoProducerJni.fragmentAck()`
      * `NativeKinesisVideoProducerJni.streamDataAvailable()`
      * `NativeKinesisVideoProducerJni.streamTerminated()`
      * `NativeKinesisVideoProducerStream.getDataStream()`
      * `NativeKinesisVideoProducerStream.fragmentAck()`
      * `NativeKinesisVideoProducerStream.parseFragmentAck()`
      * `NativeKinesisVideoProducerStream.streamTerminated()`
      * `NativeKinesisVideoProducerStream.streamDataAvailable()`
      * `NativeKinesisVideoProducerStream.streamClosed()`
      * `DefaultStreamCallbacks.streamDataAvailable()`
      * `DefaultStreamCallbacks.streamClosed()`
      * `AckConsumer.AckConsumer()`
      * `DefaultServiceCallbacksImpl.CompletionCallback()`

## [Release 2.6.14](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.14)

### Bug Fixes

* **Amazon CloudWatch Logs**
  * Allow `Amazon CloudWatch Logs` SDK to be fetched via maven. See [issue #392](https://github.com/aws/aws-sdk-android/issues/392)

### Enhancements

* **Amazon Cognito Identity Provider**
  * Repackaged Amazon Cognito Identity Service Provider Android SDK to change dependency for ASF components.

* **Amazon Cognito Auth**
  * Repackaged Amazon Cognito Auth Android SDK to change dependency for ASF components. Use `{ transitive = true; }` while importing `aws-android-sdk-cognitoauth` via maven in gradle.

## [Release 2.6.13](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.13)

### Bug Fixes

* **Amazon S3**
  * Fix the upload method with CannedAccessControlList and TransferListener in TransferUtility. See [issue #388](https://github.com/aws/aws-sdk-android/issues/388)

* **Amazon Cognito Auth**
  * Fixes bug - "Unexpected char 0x0a at 82 in header value" error, when using App clients with an associated secret. See [pr #367](https://github.com/aws/aws-sdk-android/pull/367)
  * Added `minSdkVersion` and `targetSdkVersion` in `AndroidManifest`

* **AWS Mobile Client**
  * Added `minSdkVersion` and `targetSdkVersion` in `AndroidManifest`

### New Features

* **AWS IoT**
  * Starting from this release, AWS IoT SDK by default sends metrics indicating which language and version of the SDK is being used. However, user may disable this by calling `setMetricsEnabled(false)` before calling `connect` method, if they do not want metrics to be sent.

## [Release 2.6.12](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.12)

### New Features

* **AWS Core Runtime**
  * Added support for Europe (Paris) region `eu-west-3`.

### Bug Fixes

* **AWS Auth SDK**
  * Added minimum sdks and target sdk version.

* **Amazon Kinesis Video Streams**
  * Added minimum sdks and target sdk version.

## [Release 2.6.11](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.11)

### New Features

* **AWS Core Runtime**
  * Added support for China (Ningxia) region `cn-northwest-1`.

## [Release 2.6.10](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.10)

### New Features

* **Amazon Rekognition**
  * **Breaking API Change**
    * The `GenderType` enum entries have changed from `MALE` `FEMALE` to `Male` `Female`.
    * The `LandmarkType` enum entries have changed to camelcase. i.e. `EYE_LEFT` `LEFT_EYEBROW_LEFT` to `EyeLeft` `LeftEyebrowLeft`
  * Update the enum value of LandmarkType and GenderType to be consistent with service response.
  * Update to add face and text detection.
  * Update to Amazon Rekognition in general to latest API specifications.

### Bug Fixes:

- **Amazon Pinpoint**
  - Improve error handling during event submission to ensure DB event corruption is handled gracefully (without crashing the app due to an uncaught exception).

- **Amazon Kinesis Video Streams**
  - **Breaking API Change** `KinesisVideoAndroidServiceClient.getAwsAcuityClient()` is renamed to `KinesisVideoAndroidServiceClient.getAwsKinesisVideoClient()` for consistency.

## [Release 2.6.9](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.9)

### Bug Fixes:

- **AWS Auth Core**
  - Fixed a bug where the `doStartupAuth` method in `IdentityManager` method introduced in 2.6.0 was misspelled as `doStartUpAuth` in SDK versions 2.6.7 and 2.6.8. The method now continues to have the name `doStartupAuth` from SDK version 2.6.9.

## [Release 2.6.8](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.8)

### New Features

- **Support for Amazon Kinesis Video Streams**: Amazon Kinesis Video Streams is a fully managed video ingestion and storage service. It enables you to securely ingest, process, and store video at any scale for applications that power robots, smart cities, industrial automation, security monitoring, machine learning (ML), and more. Kinesis Video Streams also ingests other kinds of time-encoded data like audio, RADAR, and LIDAR signals. Kinesis Video Streams provides you SDKs to install on your devices to make it easy to securely stream video to AWS. Kinesis Video Streams automatically provisions and elastically scales all the infrastructure needed to ingest video streams from millions of devices. It also durably stores, encrypts, and indexes the video streams and provides easy-to-use APIs so that applications can access and retrieve indexed video fragments based on tags and timestamps. Kinesis Video Streams provides a library to integrate ML frameworks such as Apache MxNet, TensorFlow, and OpenCV with video streams to build machine learning applications.

- **Amazon Cognito Auth**
  - Add support for the adaptive authentication feature of Amazon Cognito advanced security features (Beta).

- **Amazon Cognito Identity Provider**
  - Add support for Time-based One-time Passcode multi-factor authentication.
  - Add support for the adaptive authentication feature of Amazon Cognito advanced security features (Beta).

## [Release 2.6.7](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.7)

### New Features

- **AWS MobileClient**
  - Added `AWSMobileClient` to initialize the SDK and create instances of other SDK clients. Currently support is limited to `SignInUI`. AWSMobileClient creates the `AWSConfiguration` based on `awsconfiguration.json`, fetches the Cognito Identity and registers the SignIn providers with the permissions based on the  `AWSConfiguration`.

### Enhancements

- **Amazon Polly**
  - Added support for new voices - `Aditi` and `Seoyeon`.
  - Added support for new language code - `ko-KR`.

- **Amazon Pinpoint**
  - Added support for notification channel on Android SDK 26 (Oreo).
  - On Android SDK 23 (Marshmallow) and newer devices, the large icon is not set if it is not present from the push payload and a small icon is set in the push payload. This allows setting only the small icon from the campaign in the Pinpoint console.
  - On Android SDK 23 and newer devices, if the small icon is set in a format that is an opaque color image, it is now converted to greyscale to prevent displaying a grey box. Small icons in the correct format of opaque white with a transparent background will still render appropriately.

### Bug Fixes:

- **General**
  - Fixed domain returned for `cn-north-1` region and region parsing for `amazonaws.com.cn` domains. See [pr #362](https://github.com/aws/aws-sdk-android/pull/362).

- **AWS IoT**
  - Increased default time to keep alive to 300 seconds.

## [Release 2.6.6](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.6)

### Bug Fixes:

- **Amazon Pinpoint**
  - Fix locale issue for endpoint profile updates. See [issue #355](https://github.com/aws/aws-sdk-android/issues/355) and see [issue #354](https://github.com/aws/aws-sdk-android/issues/354)

- **Amazon S3**
  - Fixed a bug in the download progress reporting for large files where the last status update could be a jump of 75% or more. The default for notification used to be 8K bytes chunks, it has been changed to 1024K bytes.  The value can be changed using the `setNotificationThreshold` method of AmazonS3Client instead of being a constant.  See [issue #333](https://github.com/aws/aws-sdk-android/issues/333)

- **AWS IoT**
  - Fix validation for endpoint in China that ends with ".cn". See [issue #337](https://github.com/aws/aws-sdk-android/issues/337)

## [Release 2.6.5](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.5)

### Enhancements:

- **Amazon Polly**
  - Added support for new voices - `Matthew` and `Takumi`.
  - Polly is now available in `ap-northeast-1` region.

### Bug Fixes:

- **Amazon Cognito Identity Provider**
  - Fixed a bug in the deletion of CognitoUser where the callback function is not invoked when deletion is successful. See [issue #304](https://github.com/aws/aws-sdk-android/issues/304)

## [Release 2.6.4](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.4)

### Bug Fixes:

- **Amazon Kinesis Firehose & Amazon Kinesis Streams**
  - Fixed a bug that caused infinite loops while reading local cache of streams used for batching. See [issue #182](https://github.com/aws/aws-sdk-android/issues/182)

## [Release 2.6.3](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.3)

### New Features:

- **Amazon Pinpoint**
  - Add support for ADM and Baidu channels. Now Android developers will be able to target devices that leverage Amazon Device messaging and Baidu Cloud messaging. 
- **Amazon Cognito Identity Provider**
  - Support for Pinpoint Analytics integration in Cognito User Pools.

## [Release 2.6.2](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.2)

### Bug Fixes:

- **AWS Auth SDK**
  - Fixed a bug in the creation of SignInButton.
  - Removed the manifest entries for Facebook Application ID and Google Play Services version.

## [Release 2.6.1](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.1)

### Bug Fixes:

- **AWS Auth SDK**
  - Fixed border and shadow for Facebook and Google SignIn buttons.
  - Fixed the Android Support Package dependencies of the different auth clients. The Android Support Packages support-v4 and appcompat-v7 of all the auth clients now have the same version 23.0.1 and are optional dependencies. Apps consuming the auth clients will now declare the appcompat-v7 and support-v4 dependencies in the gradle manually.

- **Amazon Pinpoint**
  - Notification icon handling has been improved. By default, when the Notification icon uses the app icon, the icon will now be shown in color on Apps targeting SDK version 21 or greater. This will be achieved by setting the large icon to the app icon and generating the small icon by converting the app icon image to gray scale. For Apps targeting SDK version below 21, the behavior remains the same and the color icon is shown.

## [Release 2.6.0](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.0)

### New Features:

- **AWS Auth SDK**
  - Added new SDK for configurable User SignIn Screen with Amazon Cognito UserPools, Facebook SignIn and Google SignIn.

- **AWS Core Runtime**
  - Added support for a configuration file `awsconfiguration.json` that can be used to construct:
    - `CognitoCredentialsProvider`, `CognitoCachingCredentialsProvider`, `CognitoUserPool`, `TransferUtility`, `DynamoDBMapper`, `PinpointConfiguration`, `CognitoSyncManager`, and `LambdaInvokerFactory`.

### Improvements:

- **AWS S3**
  - Add builder pattern constructor to `TransferUtility`.
  - Add default bucket property in `TransferUtility` builder. The default bucket will be used when no bucket is specified.

- **AWS Lambda**
  - Add builder pattern constructor to `LambdaInvokerFactory`.

- **Amazon DynamoDB**
  - Add builder pattern constructor to `DynamoDBMapper`.

- **Amazon Pinpoint**
  - Add configuration option to post notifications even if the app is in the foreground.

### Bug Fixes:

- **Amazon Pinpoint**
  - Fixed bug that caused Pinpoint endpoint profile to incorrectly calculate the number of profile attributes and metrics.

- **Amazon Lex**
  - Fixed aar file and added new architecture support arm64-v8a, mips, mips64, x86, x86_64. See [issue #298](https://github.com/aws/aws-sdk-android/issues/298)

## [Release 2.4.7](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.4.7)

### Improvements:

- **Amazon Cognito Auth**
  - Making Cognito App Integration and Federation feature generally available

- **AWS IoT**
  - Add API to enable/disable auto-resubscribe feature.

### Bug Fixes:

- **AWS IoT**
  - Fixed bug that caused reconnecting to the session to throw an exception due to failure to obtain credentials.

## [Release 2.4.6](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.4.6)

### Bug Fixes:

- **Amazon Cognito Identity Provider**
  - Fixed bug that caused `CognitoDeviceHelper.getDeviceKey` to return null on certain cases. See [issue #259](https://github.com/aws/aws-sdk-android/issues/259)
  - Fixed bug where `onSuccess` callback was missing from `verifyAttribute` function. See [issue #266](https://github.com/aws/aws-sdk-android/issues/266)

- **Amazon Pinpoint**
  - Fix crash in Pinpoint SDK when getting locale's country code.

## [Release 2.4.5](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.4.5)

### Bug Fixes:

- **Amazon S3**
  - Fixed bug that caused keys to convert spaces to url encoded characters. See [issue #310](https://github.com/aws/aws-sdk-android/issues/310)

- **Amazon DynamoDB Document Model (Beta)**
  - Fixed bug that caused item updates to fail due to equality check error.

## [Release 2.4.4](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.4.4)

### New Features:
- **Amazon DynamoDB Document Model (Beta)**
  - Added DynamoDB Document API: The Document API provides full JSON data support, use of Document Path to access part of a document, and new data types such as Map, Primitive, List, and Boolean. More information and sample code can be found in the [blog](https://aws.amazon.com/blogs/mobile/using-amazon-dynamodb-document-api-with-aws-mobile-sdk-for-android-part-1/).

* **Amazon Cognito Auth (Beta)**
  - A new SDK that enables sign-up and sign-in for Amazon Cognito Your User Pools via a lightweight hosted UI.

### Bug Fixes:
- **Amazon Pinpoint**
  - Change Pinpoint notification client to be a strong reference in Pinpoint notification receiver
  - **Breaking API Change** Please use `PinpointNotificationReceiver.setNotificationClient()` API instead of `setWeakNotificationClient`.

- **Amazon S3**
  - Fixed bug in `TransferUtility` which caused the app to crash due to a race condition when loading Transfer Records from Transfer Database. See [issue #288](https://github.com/aws/aws-sdk-android/issues/288)

## [Release 2.4.3](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.4.3)

### Improvements:
- **AWS IoT**
  - Update API to latest spec.

- **Amazon Polly**
  - Added support for new voice id - `Vicki`.

- **Amazon Pinpoint**
  - Update logging to be more restrictive.
  - Added support for app-level opt-out.

### Bug Fixes:
- **All Services**
  - Fixed an issue where endpoint URLs were incorrectly set after using `setRegion.`. See [issue #290](https://github.com/aws/aws-sdk-android/issues/290)
- **Amazon S3**
  - Fixed bug which caused gradle build error on commons-io. See [issue #282](https://github.com/aws/aws-sdk-android/issues/282)
  - Fixed NPE error while resuming transfers using `TransferUtility`. See [issue #299](https://github.com/aws/aws-sdk-android/issues/299)
  - Fixed `TransferUtility` observer progress tracking bug. See [issue #257](https://github.com/aws/aws-sdk-android/issues/257)

## [Release 2.4.2](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.4.2)

### Improvements:
- **Amazon Lex**
  - Amazon Lex is now Generally Available.
  - Added support for input transcripts.

- **Amazon Polly**
  - Added support for multiple Lexicons in presigned request.
  - Added support for speech marks.

- **Amazon Rekognition**
  - Added support for content moderation and age range estimation. See [issue #281](https://github.com/aws/aws-sdk-android/issues/281)

### Bug Fixes:
- **Amazon DynamoDB**
  - Fixed bug which did not use credentials provider when available in method `getClient(Region)`.
- **Amazon S3**
  - Fixed bug which caused gradle build error on commons-io. See [issue #282](https://github.com/aws/aws-sdk-android/issues/282)

## [Release 2.4.1](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.4.1)

### New Features:
- **Support for Amazon Cloudwatch Logs**: Amazon CloudWatch is a monitoring service for AWS cloud resources and the applications you run on AWS. You can use Amazon CloudWatch to collect and track metrics, collect and monitor log files, and set alarms.

### Bug Fixes:
- **Amazon IoT**: fix an issue which triggers `NetworkOnMainThreadException` when calling `reconnectToSession()`. See [issue #261](https://github.com/aws/aws-sdk-android/issues/261)
- **Amazon S3**: fixed maven dependencies. See [issue #276](https://github.com/aws/aws-sdk-android/issues/276) & [issue #268](https://github.com/aws/aws-sdk-android/issues/268)
- **Amazon S3**: fixed an issue which caused resource path to be incorrectly encoded.See [AWS Forum Post](https://forums.aws.amazon.com/thread.jspa?threadID=252898)
- **General**: checkstyle fixes across the sdk.
- **General**: move all sdk's to use commons logging instead of LogCat.

## [Release 2.4.0](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.4.0) (03/21/2017)

### Improvements:
- **Amazon Lex**:`LexVoiceButton` will now show an image of a bot when audio response from lex is being played.

### Bug Fixes:

- **Amazon API Gateway**: Allow marshalling alternative date formats in API Gateway.
- **Amazon Cognito Identity Provider**: Bug fix for missing required attribute Exception
- **Amazon IoT**: fix typo's with variable names in `AWSIoTMQTTManager`. See [issue #220](https://github.com/aws/aws-sdk-android/pull/220).
- **Amazon Lex**: Fix a bug which caused `readyToFulfill` to not file in `InteractionListener`.
- **Amazon Pinpoint**:Fix cursor leakage in Pinpoint.
- **Amazon Pinpoint**:Bug fixes for campaign open rate.
- **Amazon Pinpoint**:`PinpointEndpointClient` to retain instance of endpoint.
- **Amazon Pinpoint**:corrected the implemented for `optout` for profile.
- **Amazon Pinpoint**:Deprecated formatted price in `MonetizationEventBuilder`.
- **Amazon S3**: Bug Fixes with encryption client.
- **Amazon S3**: SigV4 signing is now default for S3. See [issue 234](https://github.com/aws/aws-sdk-android/issues/234) & [issue #108](https://github.com/awslabs/aws-sdk-android-samples/issues/108).
- **Amazon S3**: Added feature to specify listener in `TransferUtility.upload()`. See [issue #210](https://github.com/aws/aws-sdk-android/issues/210).
- **Amazon S3**: Fixed a bug where when using `setAccelerateModeEnabled` caused uploads to fail. See [issue #264](https://github.com/aws/aws-sdk-android/issues/264).
- **General** : Fixed a bug which caused incompatibility between maven releases and releases on [marketing page](https://aws.amazon.com/mobile/sdk).

## [Release 2.3.9](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.3.9) (02/02/2017)

### Improvements:

- **Amazon Kinesis Firehose & Amazon Kinesis Streams**: Allow setting a static partition key in the KinesisRecorderConfig. See [issue #228](https://github.com/aws/aws-sdk-android/pull/228).
- **AWS KMS**: Updated service to latest spec.

### Bug Fixes:

- **Amazon Cognito Identity**: Fixed a bug that could cause a NullPointerException if credential refresh occured while another thread signed in with a provider. See [issue #247](https://github.com/aws/aws-sdk-android/pull/247).
- **Amazon Cognito Identity Provider**: Fixed bugs in SRP and exception handling.
- **Amazon Kinesis Firehose & Amazon Kinesis Streams**: Prevent KinesisRecorder.submitAllRecords() from potentially losing data if the service is killed by waiting until the data is transferred before removing it from the cache. See [issue #225](https://github.com/aws/aws-sdk-android/pull/225).
- **Amazon Pinpoint**: Fixed a bug that caused a crash when opening a deep link. See [issue #246](https://github.com/aws/aws-sdk-android/pull/246).
- **Amazon Lex**: Fix incorrect comparison for dialog states. See [issue #245](https://github.com/aws/aws-sdk-android/pull/245).

## [Release 2.3.8] (https://github.com/aws/aws-sdk-android/release/tag/release_v2.3.8) (12/20/2016)

### Bug Fixes:

- **Amazon Pinpoint**: Fixed incorrect signer config in Pinpoint Analytics.
- **Amazon S3**: Fixed a bug that caused TransferObserver.getBytesTransferred() to always return 0. See [issue #217](https://github.com/aws/aws-sdk-android/pull/217).
- **Amazon S3**: Fixed a race condition in TransferService. See [issue #197](https://github.com/aws/aws-sdk-android/pull/197).

## [Release 2.3.7](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.3.7) (12/13/2016)

### New Features
- **Support for Amazon Rekognition**: Rekognition is a deep-learning based service to search, verify and organize images. With Rekognition, you can detect objects, scenes, and faces in images. You can also search and compare faces.
- **AWS Core Runtime**: Added Support for `eu-west-2`/LHR region in the SDK.

### Improvements
- **AWS Core Runtime**: Added support for enabling curl logging in the SDK. See [issue](https://github.com/aws/aws-sdk-android/pull/200)
- **AWS Lambda**: Update to Latest Models.

### Bug Fixes:
- **Amazon Pinpoint**: Fixed a bug that caused setting wrong endpoint for pinpoint client.
- **Amazon S3**: Fixed a bug that could cause NPE in Transfer Service. See [issue](https://github.com/aws/aws-sdk-android/issues/223).
- **Amazon Cognito Identity Provider**: Fix incorrect exception being thrown in `CognitoDevice`. See [issue](https://github.com/aws/aws-sdk-android/pull/224).
- **Amazon Cognito Identity Provider**: Fix a bug where `NewPasswordContinuation` throws `CognitoParameterInvalidException: Missing required attribute` even when the required user attributes have been set. See [issue](https://github.com/aws/aws-sdk-android/pull/216).


## [Release 2.3.6](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.3.6) (12/07/2016)

### Improvements
- **AWS Core Runtime**: Added Support for `ca-central-1`/YUL region in the SDK.

### Bug Fixes
- **Amazon SQS**: Fixed a bug that caused SQS send message to fail. See [issue](https://github.com/aws/aws-sdk-android/issues/218).
- **Amazon Lex Runtime**: Fixed a bug where requests were not getting signed correctly.
- **Amazon Pinpoint**: Fix serialization of endpoint profile bug.
- **Amazon Mobile Analytics**: Ensure session file directories exist before saving


## [Release 2.3.5](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.3.5) (12/01/2016)

### New Features
- **Support for Amazon Pinpoint**: Amazon Pinpoint makes it easy to run targeted campaigns to improve user engagement. Pinpoint helps you understand your users behavior, define who to target, what messages to send, when to deliver them, and tracks the results of the campaigns.


## [Release 2.3.4](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.3.4) (11/30/2016)

### New Features
- **Support for Amazon Lex - Beta**: Amazon Lex is a service for building conversational interactions into any application using voice and text. With Lex, the same conversational engine that powers Amazon Alexa is now available to any developer, enabling you to build sophisticated, natural language, conversational bots (chatbots) into your new and existing applications. Amazon Lex provides the deep functionality and flexibility of automatic speech recognition (ASR) for converting speech to text and natural language understanding (NLU) to understand the intent of the text. This allows you to build highly engaging user experiences with lifelike, conversational interactions.

- **Support for Amazon Polly**: Amazon Polly is a service that turns text into lifelike speech, making it easy to develop applications that use high-quality speech to increase engagement and accessibility. With Amazon Polly the developers can build speech-enabled apps that work in multiple geographies.

## [Release 2.3.3](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.3.3) (10/11/2016)

### Improvements
- **AWS Core Runtime Library**: Support for `us-east-2/CMH` region in SDK.

## [Release 2.3.2](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.3.2) (10/06/2016)

### Improvements
- **Amazon Cognito Identity Provider**: 
- Support for Admin Create User feature.
- Allow SDK to refresh tokens which are about to expire within a pre-set threshold.

## [Release 2.3.1](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.3.1) (09/08/2016)

### Improvements
- **API Gateway**: Added a generic invoker to execute requests for any path.

### Bug Fixes
- **Amazon Cognito Identity Provider**: 
- Fixed a bug introduced by StandardCharsets that caused the Android SDK to be unavailable for API 18 and below.

## [Release 2.3.0](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.3.0) (07/28/2016)

### Improvements
- **AWS Core Runtime Library**: Added support for `us-west-2/PDX` region for cognito identity.
- **Amazon Cognito Identity Provider**: 
- Support for Custom authentication flows. Developers can implement custom authentication flows around Cognito Your User Pools.
- Support for devices.
- Global sign-out users, to sign-out from all devices.
- **Amazon Cognito Sync**: Added support for `us-west-2/PDX` region.

### Bug Fixes
- **Amazon Cognito Identity Provider**: 
- Authentication flow in Android SDK now uses Custom Authentication API.
- Two new exceptions added for getSession API. These exceptions have been added to accurately represent the user state when the username is invalid and when the user is not confirmed. You will have to update your application to handle these exceptions.
- UserNotFoundException: Returned when the username user does not exist.
- UserNotConfirmedException: Returned when the user has not been confirmed.

## [Release 2.2.22](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.2.22) (07/27/2016)

### Bug Fixes
- **Amazon Simple Email Service**: Resolved an issue where some SES APIs were missing from the 2.2.21. [#179](https://github.com/aws/aws-sdk-android/issues/179)

## [Release 2.2.21](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.2.21) (07/21/2016)

### Improvements
- **Amazon Web Services**: General service updates and documentation improvements.
- **AWS Core Runtime Library**: Allow custom `TrustManager` on `ClientConfiguration`. [#165](https://github.com/aws/aws-sdk-android/pull/165)
- **AWS IoT**: Updated Eclipse Paho MQTT client to v1.1.0. [#145](https://github.com/aws/aws-sdk-android/issues/145)

### Bug Fixes
- **Amazon Mobile Analytics**: Fixed crash while creating the base directory. [#126](https://github.com/aws/aws-sdk-android/issues/126)
- **Amazon Cognito**: Fixed a token refresh bug in Your User Pools.


## [Release 2.2.20](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.2.20) (06/27/2016)

### New Features
- **Amazon Web Services**: Introducing new AWS region Asia Pacific (Mumbai) region, endpoint ap-south-1.

### Improvements
- **Amazon Web Services**: General service updates and documentation improvements.
- **API Gateway**: Expose client configuration through ApiFactory. [#158](https://github.com/aws/aws-sdk-android/issues/158)
- **Amazon Web Services**: Service clients are now generated with a new code gen system. Some trivial changes are listed below
- List members in POJO are defaulted to null instead of an empty list to align with map members. Please perform null check to avoid NPE. When marshalling a list member, a null list will be omitted and an empty list will result in an empty array.
- In `ListRecordsRequest` of Cognito Sync, the data type of `lastSyncCount` is changed from String to Long and that of `maxResult` from String to Integer.
- In DynamoDB, the method `setKey(java.util.Map.Entry<String, AttributeValue> hashKey, java.util.Map.Entry<String, AttributeValue> rangeKey)` is removed from `GetItemRequest`, `UpdateItemRequest`, `DeleteItemRequest`, and `DeleteRequest`. Use `addKeyEntry(String key, AttributeValue value)` instead. `setExclusiveStartKey(java.util.Map.Entry<String, AttributeValue> hashKey, java.util.Map.Entry<String, AttributeValue> rangeKey)` is also removed from `QueryRequest` and `ScanRequest`. The alternative is `addExclusiveStartKeyEntry(String key, AttributeValue value)`.

### Bug Fixes
- **API Gateway**: Fixed a bug where user agent is overwritten by `ApiHandler`. [#159](https://github.com/aws/aws-sdk-android/issues/159) 


## [Release 2.2.19](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.2.19) (06/23/2016)

### New Features
- **Amazon Cognito Identity**: Added support for SAML role resolution.


## [Release 2.2.18](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.2.18) (06/02/2016)

### Bug Fixes
- **AWS Core Runtime Library**: Removed testing implementation for `X509TrustManager`, for more information [see](https://support.google.com/faqs/answer/6346016).


## [Release 2.2.17](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.2.17) (05/20/2016)

### New Features
- **Amazon S3**:
- Introducing a new version of the ListObjects (ListObjectsV2) API that allows listing objects with a large number of delete markers. See [GET Bucket (List Objects) Version 2](http://docs.aws.amazon.com/AmazonS3/latest/API/v2-RESTBucketGET.html) for more details.
- Added support for a new configuration named BucketAccelerateConfiguration which supports faster uploads/downloads to S3 buckets. See [Amazon S3 Transfer Acceleration](http://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html).
- Amazon S3 now supports cross-region replication, which provides automatic, asynchronous copying of objects across buckets in different AWS regions. For more information, see [Cross-Region Replication](https://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html) in the Amazon S3 Developer Guide.

### Bug Fixes
- **AWS Core Runtime Library**: Fixed a potential bug during retry where content input stream is not reset correctly.
- **Amazon Cognito**: Fixed a bug where Cognito Sign-in may fail on non US locale environment. [aws-sdk-android-samples #129](https://github.com/awslabs/aws-sdk-android-samples/issues/54)


## [Release 2.2.16](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.2.16) (05/10/2016)

### New Features
- **AWS IoT**: The AWS IoT Device Gateway now supports MQTT over WebSockets. Build real-time mobile and web applications that interact over WebSockets, and easily scale to millions of simultaneous users. You can use WebSockets with Amazon Cognito to securely authenticate end-users to your apps and devices.

### Improvements
- **Amazon Web Services**: General service updates and documentation improvements.
- **AWS Core Runtime Library**: Removed verbose logging of errors in retries.
- **AWS IoT**: Added MQTT message delivery callback.

### Bug Fixes
- **Amazon S3**: Fixed a bug in TransferUtility caused by socket timeout exception. The exception is incorrectly treated as manually interrupt and thus is not reported to `TransferListener.onError(Exception)`. [#119](https://github.com/aws/aws-sdk-android/issues/119) and [#120](https://github.com/aws/aws-sdk-android/issues/120)
- **Amazon Cognito**: Fixed a bug caused by `StandardCharsets` which is available from API level 19. [#129](https://github.com/aws/aws-sdk-android/issues/129)


## [Release 2.2.15](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.2.15) (04/19/2016)

### New Features
- **Amazon Cognito Identity Provider**: You can now use Amazon Cognito to easily add user sign-up and sign-in to your mobile and web apps. Your User Pool in Amazon Cognito is a fully managed user directory that can scale to hundreds of millions of users, so you don’t have to worry about building, securing, and scaling a solution to handle user management and authentication.
- **Amazon S3**: Canned ACL support when uploading objects to S3 with TransferUtility. [#63](https://github.com/aws/aws-sdk-android/issues/63)

### Bug Fixes
- **Amazon S3**: A NPE bug in TransferUtility caused by network receiver. [#117](https://github.com/aws/aws-sdk-android/issues/117) and [#118](https://github.com/aws/aws-sdk-android/issues/118)


## [Release 2.2.14](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.2.14) (03/31/2016)

### New Features
- **AWS Iot**: Added support for LWT (last will and testimony).
- **Amazon SES**: Added support for custom MAIL FROM domains.

### Improvements
- **Amazon S3**: Improved performance of S3 TransferUtility.
- Now the number of parallel transfers is set to the number of processors (cores) + 1. [#111](https://github.com/aws/aws-sdk-android/issues/111)
- Removed unnecessary network requests in download task.

### Bug Fixes
- **AWS Core Runtime Library**: Addressed a potential bug in Cognito credentials provider.
- **Amazon S3**: Fixed RejectedExecutionException in TransferUtility which may occur when the service is shutting down. [#113](https://github.com/aws/aws-sdk-android/issues/113)


## [Release 2.2.13](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.2.13) (02/25/2016)

### Improvements
- **Amazon S3**: Tweaked the usage of TransferListener in S3 TransferUtility.
- Now listeners are kept as strong references. They will be removed when transfers are completed. However user are still encouraged to clean up listeners themselves to prevent memory leak. [#93](https://github.com/aws/aws-sdk-android/issues/93) and [#101](https://github.com/aws/aws-sdk-android/issues/101)
- Transfers in WAITING_FOR_NETWORK state can now be paused or canceled. [#102](https://github.com/aws/aws-sdk-android/issues/102)
- Improved the experience to delete a transfer. [#104](https://github.com/aws/aws-sdk-android/issues/104)

### Bug Fixes
- **AWS Core Runtime Library**: Addressed potential internalization bugs. [#96](https://github.com/aws/aws-sdk-android/issues/96)
- **Amazon S3**: Fixed a ConcurrentModificationException bug caused by listeners being removed in their callbacks. [#103](https://github.com/aws/aws-sdk-android/issues/103)


## [Release 2.2.12](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.2.12) (02/12/2016)

### New Features
- **AWS IoT**: [AWS IoT](https://aws.amazon.com/iot/) is now supported by the SDK. AWS IoT is a managed cloud platform that lets connected devices easily and securely interact with cloud applications and other devices. AWS IoT can support billions of devices and trillions of messages, and can process and route those messages to AWS endpoints and to other devices reliably and securely. With AWS IoT, your applications can keep track of and communicate with all your devices, all the time, even when they aren't connected.

### Improvements
- **Amazon Web Services**: General service updates and documentation improvements.


## [Release 2.2.11](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.2.11) (01/28/2016)

### New Features
- **AWS Key Management Service**: [AWS Key Management Service (KMS)](https://aws.amazon.com/kms/) is now supported by the SDK. AWS Key Management Service (KMS) is a managed service that makes it easy for you to create and control the encryption keys used to encrypt your data, and uses Hardware Security Modules (HSMs) to protect the security of your keys. AWS Key Management Service is integrated with several other AWS services to help you protect your data you store with these services. AWS Key Management Service is also integrated with AWS CloudTrail to provide you with logs of all key usage to help meet your regulatory and compliance needs.

### Improvements
- **Amazon S3**: Revamped S3 TransferUtility. Huge performance boost and lots of enhancements.
- Offload most database operations to background thread.
- Re-architected transfer listeners. Moved away from ContentObserver.
- Reduced the frequency of writing transfer states to database.
- Better error reporting. Now the original exception is passed to [TransferListener.onError(int, Exception)](http://docs.aws.amazon.com/AWSAndroidSDK/latest/javadoc/com/amazonaws/mobileconnectors/s3/transferutility/TransferListener.html#onError(int,%20java.lang.Exception)). [#61](https://github.com/aws/aws-sdk-android/issues/61)
- Allow user to resume a transfer in any state other than `TransferState.COMPLETED`. [#81](https://github.com/aws/aws-sdk-android/issues/81) and [#87](https://github.com/aws/aws-sdk-android/issues/87)
- Better diagnostics of TransferService. You can dump its status with `adb shell dumpsys activity service com.amazonaws.mobileconnectors.s3.transferutility.TransferService`. It works only if the app is debuggable.
- Better handling of network connectivity changes.
- Other cleanups, bug fixes and improvements.
- **Amazon S3**: Adds support of server-side encryption with AWS Key Management Service. See [Amazon S3 developer guide](http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html) for more information.
- **Amazon S3**: Signature Version 4 is now the default signing methods for all S3 requests as long as a region is specified or can be easily determined from the given endpoint.


## [Release 2.2.10](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.2.10) (01/06/2016)

### New Features
- **Amazon Web Services**: Added support for new AWS region in South Korea (ap-northeast-2).
- **Amazon Kinesis Firehose**: [Amazon Kinesis Firehose](https://aws.amazon.com/kinesis/firehose/) is the easiest way to load streaming data into AWS. It can capture and automatically load streaming data into Amazon S3 and Amazon Redshift, enabling near real-time analytics with existing business intelligence tools and dashboards you are already using today. See the [developer guide](http://docs.aws.amazon.com/mobile/sdkforandroid/developerguide/kinesis.html) for instructions about using `KinesisFirehoseRecorder`.

### Improvements
- **Amazon S3**: Allow user to add or overwrite file extension to MIME type mapping so that AmazonS3 can identify the MIME type of consequent uploads and set the content type correctly. [#83](https://github.com/aws/aws-sdk-android/issues/83)
- **AWS Lambda**: Added a method to access the installation id of the client context that is sent to AWS Lambda. [#74](https://github.com/aws/aws-sdk-android/issues/74)
- **Amazon Web Services**: General service updates and documentation improvements.

### Bug Fixes
- **Amazon S3**: Fixed the termination condition of TransferService so that it stays alive when there are active transfers waiting for network. [#70](https://github.com/aws/aws-sdk-android/issues/70)
- **Amazon S3**: Fixed a resource leak issue in TransferUtility caused by unclosed cursor.
- **AWS Lambda**: Fixed a potential issue with Lambda when invoking methods with no args. [#80](https://github.com/aws/aws-sdk-android/pull/80)
- **API Gateway**: Updated the message of ApiClientException to match exactly what the API responds. [#78](https://github.com/aws/aws-sdk-android/pull/78)


## [Release 2.2.9](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.2.9) (11/18/2015)

### New Features
- **Amazon Web Services**: General service updates and documentation improvements.

### Bug Fixes
- **Amazon S3**: Fixed slow initialization of Amazon S3 client. [#69](https://github.com/aws/aws-sdk-android/issues/69)
- **General**: Updated instruction for proguard.

## [Release 2.2.8](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.2.8) (11/05/2015)

### New Features
- **Amazon Web Services**: General service updates and documentation improvements.

### Bug Fixes
- **AWS Core Runtime Library**: Improved retry logic so that aborting a request will not cause a retry.


## [Release 2.2.7](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.2.7) (10/08/2015)

### New Features
- **AWS Lambda**: You can now maintain multiple versions of your Lambda function code. Versioning allows you to control which Lambda function version is executed in your different environments (e.g., development, testing, or production).  You can also set up your Lambda functions to run for up to five minutes allowing longer running functions such as large volume data ingestion and processing jobs.

### Bug Fixes
- **Amazon S3**: Resolved a hostname verification issue when there is a . in the bucket name. [#59](https://github.com/aws/aws-sdk-android/issues/59) 
- **Amazon S3**: Resolved an issue when using  SSE-C with Transfer Manager 
- **Amazon API Gateway**: Fixed an issue where the incorrect content length was sent to the service when the body contained UTF-8 characters that were multiple bytes in length. [#62](https://github.com/aws/aws-sdk-android/issues/62)


## [Release 2.2.6](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.2.6) (09/17/2015)

### New Features
- **Amazon Web Services**: General service updates and documentation improvements.
- **Amazon S3**: Added support of ObjectMetadata for upload in Amazon S3 `TransferUtility`. [#56](https://github.com/aws/aws-sdk-android/issues/56)

### Bug Fixes
- **AWS Core Runtime Library**: Fixed a potential NPE issue caused by ResponseCache by explicitly disabling HTTP response cache.
- **Amazon API Gateway**: Fixed a bug where the region for SigV4 signing is pinned to us-east-1. Now the region is deduced from API's invoke URL and can optionally be overwritten via `ApiClientFactory.region(String)`.


## [Release 2.2.5](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.2.5) (08/07/2015)

### New Features
- **Amazon Web Services**: General service updates and documentation improvements on Amazon Elastic Compute Cloud (EC2) and Auto Scaling.
- **Github**: Open sourced unit tests and added this changelog.

### Bug Fixes
- **Amazon S3**: Fixed a bug when using Amazon S3 `TransferUtility` on a worker thread. [#51](https://github.com/aws/aws-sdk-android/issues/51)
- **AWS Core Runtime Library**: Fixed a bug caused by improper closing of a GZIP encoded content stream. See [AWS forum](https://forums.aws.amazon.com/thread.jspa?threadID=204659).
- **Maven**: Changed the dependency scope of Apache Commons Logging to [`provided`](https://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html) which can remove compilation warnings and improve capability with Gradle.


## [Release 2.2.4](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.2.4) (07/22/2015)

### New Features
- **Amazon S3**: The S3 transfer utility has been added to the SDK, which replaces the now deprecated transfer manager. This utility automatically pauses and resumes transfers when internet connectivity is lost and reestablished. The utility also automatically pauses transfers if an app crashes. Developers can manually pause and resume transfers without having to persist any data themselves. For more information, see our [blog](http://mobile.awsblog.com/post/Tx2KF0YUQITA164/AWS-SDK-for-Android-Transfer-Manager-to-Transfer-Utility-Migration-Guide) and [Getting Started documentation](http://docs.aws.amazon.com/mobile/sdkforandroid/developerguide/s3transferutility.html) for more info.
- **Amazon Mobile Analytics**: A new simpler constructor has been added to the MobileAnalyticsManager, and transmission of events over WAN is now enabled by default.


## [Release 2.2.3](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.2.3) (07/09/2015)

### New Features
- **Amazon API Gateway**: Added a runtime library for the generated SDK of Amazon API Gateway. Amazon API Gateway makes it easy for AWS customers to publish, maintain, monitor, and secure application programming interfaces (APIs) at any scale. To know more please visit [Amazon API Gateway]( http://aws.amazon.com/api-gateway/).

### Bug Fixes
- **Amazon S3**: Fixed an issue in Amazon S3 where the range information is incorrect in PersistableTransfer. [#35](https://github.com/aws/aws-sdk-android/issues/35)
- **AWS Core Runtime Library**: Fixed an issue in `CognitoCachingCredentialsProvider` where the credentials might not be cached when using developer-authenticated identities. [#48](https://github.com/aws/aws-sdk-android/issues/48)


## [Release 2.2.2](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.2.2) (06/11/2015)

### New Features
- **AWS Core Runtime Library**: Enabled HTTP compression by adding "Accept-Encoding:gzip" header. If the target AWS service (for example, Amazon DynamoDB) supports compression and returns compressed data, the SDK will handle the content correctly. [#41](https://github.com/aws/aws-sdk-android/issues/41)
- **Amazon Kinesis**: KinesisRecorder now sends compressed records to Amazon Kinesis.
- **Amazon Mobile Analytics**: Analytics events are compressed prior to sending the service in order to save network bandwidth.

### Bug Fixes
- **Amazon S3**: Fixed an issue that occurs when required headers are not properly signed. This issue affects S3 in two regions: Frankfurt (eu-central-1) and China (cn-north-1). [#42](https://github.com/aws/aws-sdk-android/issues/42)
- **AWS Core Runtime Library**: Fixed an issue in Maven distribution where an incorrect version string is set in "User-Agent".
