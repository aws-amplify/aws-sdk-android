# Change Log - AWS SDK for Android

## [Release 2.12.4](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.12.4)

* **AWS Core**
  * Fixed a crash in initializing `CognitoCachingCredentialsProvider` while migrating the data stored under `expirationDate`.

## [Release 2.12.3](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.12.3)

### Enhancements

* **AWS Core**
  * Persistence of client state including user credentials is now enabled and encrypted by default.
  * Added a method `CognitoCachingCredentialsProvider.setPersistenceEnabled(boolean)`, which is enabled (set to true) by default therefore the information is persisted in SharedPreferences. When disabled (set to false), the information will only be kept in memory.

* **Amazon CognitoIdentityProvider**
  * Persistence of client state including user credentials is now enabled and encrypted by default. 
  * Added a method `CognitoUserPool.setPersistenceEnabled(boolean)`, which is enabled (set to true) by default therefore the information is persisted in SharedPreferences. When disabled (set to false), the information will only be kept in memory.

* **Amazon CognitoAuth**
  * Persistence of client state including user credentials is now enabled and encrypted by default. 
  * Added a method `Auth.setPersistenceEnabled(boolean)`, which is enabled (set to true) by default therefore the information is persisted in SharedPreferences. When disabled (set to false), the information will only be kept in memory.

* **AWSMobileClient**
  * Persistence of client state including user credentials is now enabled and encrypted by default.
  * Added an option through `awsconfiguration.json` to disable persistence. **Note:** The Amplify CLI (as of March 8th 2019) does not support this configuration and will remove it when auto-generating the `awsconfiguration.json`.
    ```
    {
      "Auth": {
        "Default": {
          "Persistence": false
        }
      }
    }
    ```

## [Release 2.12.2](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.12.2)

### Misc. Updates

* Model updates for the following services
  * Amazon S3

## [Release 2.12.1](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.12.1)

### Bug Fixes

* **AWS Mobile Client**
  * Fixed a bug that cause `changePassword(String, String, Callback)` to return error when successful. The error returned was null and will now call `onResult(Void)`

### Enhancements

* **Amazon Cognito Identity Provider**
  * The Amazon Cognito Identity Provider SDK now supports all Amazon Cognito Identity Provider APIs, including "CreateUserPool", "DescribeUserPool", "UpdateUserPool", "ListUserPools", "AdminEnableUser", "AdminDisableUser", "AdminConfirmRegisterUser", "AdminResetUserPassword", "AdminGetUser", "AdminUpdateUserAttributes", "AdminDeleteUserAttributes", "AdminDeleteUser". All admin APIs require developer credentials. Note that by using admin APIs, you are inherently dealing with privileged functions that could result in data loss, if improperly used.
  * Fixed `initiateUserAuthentication()` to respect `runInBackground` flag for network calls. See [pr #702](https://github.com/aws-amplify/aws-sdk-android/pull/702)

* **AWS Core Runtime**
  * Add templated callback structure for async methods across SDKs. Internal `ReturningRunnable` added to facilitate support for synchronous and asynchronous methods.

### Misc. Updates

* Model updates for the following services
  * AWS IoT
  * Amazon Lambda

## [Release 2.12.0](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.12.0)

### Enhancements

* **Amazon Cognito Auth**
  * Allow user to unbind the service after being done with authentication. See [pr #615](https://github.com/aws-amplify/aws-sdk-android/pull/615). Thanks @rlatapy-luna!

* **Amazon Cognito User Pools**
  * Adds support for the SRP protocol at the beginning of custom auth. Please use `AuthenticationDetails(String, String, Map<String, String>, Map<String, String>)` to trigger custom auth flow with SRP protocol as the first step.

* **Amazon S3**
    * **Note:** AWS Signature Version 4 (`SigV4`) is recommended for signing Amazon S3 API requests over AWS Signature Version 2 (`SigV2`) as it provides improved security by using a signing key rather than your secret access key. SigV4 is currently supported in all AWS regions while SigV2 is only supported in regions launched prior to Jan 2014. Amazon S3 will stop accepting requests signed using SigV2 in all regions on June 24, 2019, any
requests signed using SigV2 made after this time will fail. Please visit the S3 documentation site to get more information on using SigV4: [Signing Aamzon S3 requests using SigV4](https://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html). You can find the list of
changes between versions here: [Changes in SigV4](https://docs.aws.amazon.com/general/latest/gr/sigv4_changes.html).
   * Deprecated the existing constructors in `AmazonS3Client` and introduced equivalent constructors that require the AWS region, because a valid AWS region is required to sign the request using SigV4. Please use the following constructors to specify the AWS region in order to sign the request to Amazon S3 using SigV4.

2.11.1 | 2.12.0
---------- | -------------
AmazonS3Client(AWSCredentials) | AmazonS3Client(AWSCredentials, com.amazonaws.regions.Region)
AmazonS3Client(AWSCredentials, ClientConfiguration) | AmazonS3Client(AWSCredentials, ClientConfiguration, com.amazonaws.regions.Region)
AmazonS3Client(AWSCredentialsProvider) | AmazonS3Client(AWSCredentialsProvider, com.amazonaws.regions.Region)
AmazonS3Client(AWSCredentialsProvider, ClientConfiguration) | AmazonS3Client(AWSCredentialsProvider, ClientConfiguration, com.amazonaws.regions.Region)
AmazonS3Client(AWSCredentialsProvider, ClientConfiguration, HttpClient) | AmazonS3Client(AWSCredentialsProvider, ClientConfiguration, HttpClient, com.amazonaws.regions.Region)
AmazonS3Client(ClientConfiguration) | AmazonS3Client(ClientConfiguration, com.amazonaws.regions.Region)

## [Release 2.11.1](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.11.1)

### New Features

* **Amazon S3**
  * Add the ability to specify the type of network connection (`TransferNetworkConnectionType.ANY` - any network, `TransferNetworkConnectionType.MOBILE` - mobile only, `TransferNetworkConnectionType.WIFI` - WiFi only) for the transfers through `TransferUtilityOptions`. The `TransferUtilityOptions` is passed to the `TransferUtility` object and is used for all the transfers that are initiated through this object. The network connection type can be passed while constructing the `TransferUtilityOptions` object through `TransferUtilityOptions(int, TransferNetworkConnectionType)`. See [pr #575](https://github.com/aws-amplify/aws-sdk-android/pull/575). Thanks @nasdf!

### Bug Fixes

* **Amazon Cognito Identity Provider**
  * Fixed a bug that used a null username during custom auth challenge. See [issue #657](https://github.com/aws-amplify/aws-sdk-android/issues/657) & [issue #583](https://github.com/aws-amplify/aws-sdk-android/issues/583)

* **AWS IoT**
  - Fixed a bug that caused some IoT connections to not reconnect after errors.
    [See PR #660](https://github.com/aws-amplify/aws-sdk-android/pull/660).
    Thanks @sklikowicz!

* **Amazon S3**
  * Improved the state, progress and error reporting when the transfers are interrupted.
      * When the transfer is paused or cancelled by the user, the state is reported correctly.
      * When the transfer is interrupted because of a network drop, the state is set to WAITING_FOR_NETWORK when the `TransferNetworkLossHandler` is used.
      * When the transfer is interrupted otherwise, the transfer is set to FAILED and the exception is reported via `TransferListener.onError` callback.
  * Fixed the bug where progress is reported inaccurately (over 100%) when a transfer is paused by user or network drop and resumed before completion. See [issue #677](https://github.com/aws-amplify/aws-sdk-android/issues/677), [issue #667](https://github.com/aws-amplify/aws-sdk-android/issues/667), [issue #616](https://github.com/aws-amplify/aws-sdk-android/issues/616), [issue #406](https://github.com/aws-amplify/aws-sdk-android/issues/406)

### Enhancements

* **Amazon Cognito Identity**
  - The Amazon Cognito Identity SDK now supports all Amazon Cognito Identity
    APIs, including admin APIs that require developer credentials. Note that by
    using admin APIs, you are inherently dealing with privileged functions that
    could result in data loss of data if improperly used. [See issue
    #645](https://github.com/aws-amplify/aws-sdk-android/issues/645)

### Misc. Updates

* Model updates for the following services
  * AWS IoT
  * Amazon Comprehend
  * Amazon Cognito Identity Provider
  * Amazon Kinesis Firehose
  * Amazon Transcribe
  * Amazon Pinpoint
 
## [Release 2.11.0](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.11.0)

### Enhancements

* **Amazon S3**
  * Introduced `TransferNetworkLossHandler`, a utility that listens for network connectivity changes. `TransferNetworkLossHandler` pauses the on-going transfers when the network goes offline and resumes the transfers that were paused when the network comes back online.
  * `TransferService` will be moved to foreground state when the device is running Android Oreo (API Level 26) and above. 
      * Transitioning to the foreground state requires a valid on-going `Notification` object, identifier for on-going notification and the flag that determines the ability to remove the on-going notification when the service transitions out of foreground state. If a valid notification object is not passed in, the service will not be transitioned into the foreground state.
      * The `TransferService` can now be started using `startForegroundService` method to move the service to foreground state. The service can be invoked in the following way to transition the service to foreground state: `getApplicationContext().startForegroundService(intent);`.

### Bug Fixes

* **Amazon S3**
  * Fixed a bug in `TransferUtility` where the state is not set to '`WAITING_FOR_NETWORK` when network goes offline during execution of transfers.
  * Fixed a bug where objects with key name containing characters that require special handling are uploaded with URL encoded key name on the S3 bucket.
      * Since `2.4.0` version of the SDK, the key name containing characters that require special handling are URL encoded and escaped `( space, %2A, ~, /, :, ', (, ), !, [, ] )` by the `AmazonS3Client`, after which the AWS Android Core Runtime encodes the URL resulting in double encoding of the key name.
      * Starting `2.11.0`, the additional layer of encoding and escaping done by `AmazonS3Client` is removed. The key name will not be encoded and escaped by `AmazonS3Client`. Now, the key name that is given to `AmazonS3Client` or `TransferUtility` will appear on the Amazon S3 console as is.
      * See [issue #526](https://github.com/aws-amplify/aws-sdk-android/issues/526), [issue #321](https://github.com/aws-amplify/aws-sdk-android/issues/321), [issue #360](https://github.com/aws-amplify/aws-sdk-android/issues/360)
, [issue #545](https://github.com/aws-amplify/aws-sdk-android/issues/545), [issue #597](https://github.com/aws-amplify/aws-sdk-android/issues/597).
  * Fixed a bug where `AmazonS3Client.listObjects` operation executed on a bucket, with key names containing characters that require special handling, returns the `ListObjectsResponse` with the key names being URL encoded.
      * When a S3 bucket contans objects with key names containing characters that require special handling, and since the SDK has an XML parser,  (XML 1.0 parser) which cannot parse some characters, the SDK is required to request that Amazon S3 encode the keys in the response. This can be done by passing in `url` as `encodingType` in the `ListObjectsRequest`.
      * Since `2.4.0`, there was a bug where the SDK did not decode the key names which are encoded by S3 when `url` is requested as the `encodingType`. This is fixed in `2.11.0`, where the SDK will decode the key names in the `ListObjectsResponse` sent by S3.
      * If you have objects in S3 bucket that has a key name containing characters that require special handling, you need to pass the `encodingType` as `url` in the `ListObjectsRequest`.

### Misc. Updates

* **Amazon S3**
  * Allow requester-pays access for `listObjects` and `listObjectsV2` requests.

## [Release 2.10.1](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.10.1)

### Bug Fixes

* **Amazon Pinpoint**
  * Fixed a bug where `Attributes` were not being sent in the `Event` payload while submitting events to Pinpoint. See [PR #641](https://github.com/aws-amplify/aws-sdk-android/pull/641)

## [Release 2.10.0](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.10.0)

### Misc. Updates

* Model updates for the following services
    * Amazon Lex
        * Added overrides to various `InteractionClient` and `LexServiceContinuation` methods, to allow passing request attributes
        * **Breaking API Changes:** The following APIs have been changed:
            * `PostContentRequest`, `PostContentResponse`
                * Certain properties which used to have a type of `Map<String, String>` are now `String`. This requires your calling code to 
                  JSON serialize and base64-encode the value. The `get`, `set` and `with` APIs of the following properties are affected:
                  - `PostContentRequest.requestAttributes`
                  - `PostContentRequest.sessionAttributes`
                  - `PostContentRequest.slots`
                  - `PostContentResponse.requestAttributes`
                  - `PostContentResponse.sessionAttributes`
                  - `PostContentResponse.slots`

## [Release 2.9.2](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.9.2)

### Bug Fixes

* **AWS IoT**
  * `AWSIotMqttManager` passes publish exceptions via the callback. If callback is not provided it throws `AmazonClientException`.
  * `AWSIotMqttManager` logs the reconnection errors and pass it to the user provided connection callback.

* **Amazon Pinpoint**
  * Fixed bug that could potentially cause rejected events to be dropped incorrectly because service response could not be unmarshalled. The response will now be processed correctly and events rejected by the service will be retried.

* **Amazon S3**
  * Fixed a bug where a disk operation to remove completed transfers from database was performed on the main thread. See [issue #603](https://github.com/aws-amplify/aws-sdk-android/issues/603)

## [Release 2.9.1](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.9.1)

### New Features

* **Amazon Cognito Auth**
  * Added customization for CustomTabs through `setCustomTabsExtras()` in the builder. See [PR #608](https://github.com/aws-amplify/aws-sdk-android/pull/608)

### Bug Fixes

* **AWS IoT**
  * Fixed bug that leaked threads during reconnect. See [PR #601](https://github.com/aws-amplify/aws-sdk-android/pull/601)
  * Fixed reporting of failed message publishes during reconnect. See [PR #407](https://github.com/aws-amplify/aws-sdk-android/pull/407)
  * Fix reconnection failure upon network disconnect. Any subsequent reconnect honors the value passed to the cleanSession flag. See [issue #584](https://github.com/aws-amplify/aws-sdk-android/issues/584) and [PR #612](https://github.com/aws-amplify/aws-sdk-android/pull/612)

* **AWS Mobile Client**
  * Fixed exception being thrown from `getCredentials()` and `refresh()` to adhere to `AmazonClientException` to allow other portions of SDK to catch properly. Previously a generic `RuntimeException` was being thrown; `AmazonClientException` is a subclass of `RuntimeException`. See [issue #588](https://github.com/aws-amplify/aws-sdk-android/issues/588)

## [Release 2.9.0](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.9.0)

### New Features

* **AWS Core Runtime**
  * Added support for EU (Stockholm) region - `eu-north-1`.

### Bug Fixes

* **Amazon Pinpoint**
    * `AppPackageName`, `AppTitle`, `AppVersionCode`, `SdkName` fields will now be accepted as part of the `Event` when submitting events from your app to Amazon Pinpoint. This fixes the issue where the event when exported by Amazon Kinesis Streams was missing these fields in the exported event.

### Misc. Updates

* Model updates for the following services
    * Amazon Pinpoint
        * **Breaking API Changes:** The following APIs have been changed:
            * `PutEventsRequest`
                * The type of `Endpoint` field is now changed back from `EndpointRequest` to `PublicEndpoint`.
            * `PutEventsResponse`
                * `PutEventsResponse` will have an `EventsResponse` field. The `Results` object in the `PutEventsResponse` is now nested under `EventsResponse`.

* **Amazon Cognito Sync**
  * This library is deprecated. Please use [AWS AppSync](https://aws-amplify.github.io/docs/android/api#graphql-realtime-and-offline) for synchronizing data across devices.

* **Amazon Mobile Analytics**
  * This library is deprecated. Please use [Amazon Pinpoint](https://aws-amplify.github.io/docs/android/analytics#using-amazon-pinpoint) for analytics.

## [Release 2.8.5](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.8.5)

### New Features

* **AWS Mobile Client**
  * Support `showSignIn` without Cognito Identity Pool configured. See [issue #592](https://github.com/aws-amplify/aws-sdk-android/issues/592)

* **Amazon Cognito Auth**
  * Support identity provider identifier setting. See [PR #602](https://github.com/aws-amplify/aws-sdk-android/pull/602)

### Bug Fixes

* **AWS Mobile Client**
  * Fix state change to `GUEST` mode which was not being triggered previously and would stay in `SIGNED_OUT` mode. This state is triggered by calling `getCredentials` or `getIdentityId` while signed-out and unauthenticated access is enabled in Cognito Identity Pools.

* **AWS Auth SDK**
  * Fix forced change password view's IDs to prevent crash. See [issue #586](https://github.com/aws-amplify/aws-sdk-android/issues/586)

* **Amazon Cognito Identity Provider**
  * Fix secret hash generation for empty value of client secret. Allows for operations such as sign-up to occur without client secret. See [issue #587](https://github.com/aws-amplify/aws-sdk-android/issues/587) [PR #593](https://github.com/aws-amplify/aws-sdk-android/pull/593)

* **Amazon Lex**
  * Fix race condition for microphone access when no speech is detected during interaction.

### Misc. Updates

* Model updates for the following services
  * AWS IoT
  * AWS Lambda

## [Release 2.8.4](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.8.4)

### Bug Fixes

* **AWS Mobile Client**
  * Fix an issue persisting the username between launches. The method `getUsername()` should retain the username while signed-in.

* **AWS IoT**
  * Removed validation for IoT endpoint.
  * Fix an issue in parsing the region from ATS enabled endpoint. See [PR #580](https://github.com/aws-amplify/aws-sdk-android/pull/580)

## [Release 2.8.3](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.8.3)

### Enhancements

* **Amazon Polly**
  * Add support for new voices `Bianca`, `Lucia` and `Mia`.

### Bug Fixes

* **Amazon DynamoDB Document Model**
  * Fixed the typo (`defination` -> `definition`) in the following `IllegalStateException` messages.
      * `hash key type does not match the one in table definition`
      * `range key type does not match that of table definition`

* **Amazon Pinpoint**
  *  Fix an issue where the consecutive direct send messages / send user messages (excluding campaign) replaces the previous notifications. Now the request identifier for the notification is changed from the hashcode of `<campaign_id>:<campaign_activity_id>` to the hashcode of a unique identifier for Direct send messages / send user messages (excluding campaign), so that the notifications are unique within the application. See [AWS Forums Post](https://forums.aws.amazon.com/thread.jspa?threadID=291743)

### Misc. Updates

* Model updates for the following services
  * Amazon Auto Scaling
  * Amazon Comprehend
  * Amazon Kinesis Firehose
  * Amazon Polly

## [Release 2.8.2](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.8.2)

### Bug Fixes

* **AWS Core Runtime**
  * Fix logging detection to prevent crash during initialization on Android Oreo and above. [issue #562](https://github.com/aws-amplify/aws-sdk-android/issues/562)

## [Release 2.8.1](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.8.1)

### New Features

* **AWS Core Runtime**
  * Added support for GovCloud US East region `us-gov-east-1`.

### Enhancements

* **AWS Mobile Client**
  * General improvements to synchronization, null checking, and state management.

## [Release 2.8.0](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.8.0)

### New Features

* **AWS Mobile Client**
  * The `AWSMobileClient` provides client APIs and building blocks for developers who want to create user authentication experiences.  It supports the following new features:
    - User state tracking: `AWSMobileClient` offers on-demand querying for the “login state” of a user in the application.
    - Credentials management: Automatic refreshing of `Cognito User Pools` `JWT Token` and `AWS Credentials` from `Cognito Identity`.
    - Offline support: `AWSMobileClient` is optimized to account for applications transitioning from offline to online connectivity, and refreshing credentials at the appropriate time so that errors do not occur when actions are taken and connectivity is not available.
    - Drop-in Auth UI: `AWSMobileClient` client supports easy “drop-in” UI for your application.
    - Simple, declarative APIs `signUp`, `signIn`, `confirmSignIn`, etc.

> Note: The existing methods of `AWSMobileClient` are deprecated and will be removed in a future minor version. `AWSMobileClient` now takes a dependency on `AWSCognitoIdentityProvider`(Cognito User Pools SDK) package to offer integration with `CognitoUserPools`. When using the new drop-in UI, `AWSAuthUI` and `Social sign-in` features continue to be pluggable dependencies for `AWSMobileClient`.

All documentation is now centralized at https://aws-amplify.github.io/

### Enhancements

* **Amazon Kinesis Video Streams**
  * Improve exception handling.
  * Lower default memory allocation to 385MB to reduce crashes from over-allocation.
  * **Breaking API Changes**
    * Remove `streamName` parameter from `KinesisVideoClient.registerMediaSource()` as `MediaSource` already has the stream name in `StreamInfo`.
    * Add `KinesisVideoClient.unregisterMediaSource()` to remove `MediaSource` to `KinesisVideoProducerStream` binding from `KinesisVideoClient`. Customers can use `unregisterMediaSource()` after they stop streaming, so `MediaSource` data will not to be sent to Kinesis Video Streams.
    * Add `getStreamInfo()` to `MediaSource` instead of `MediaSourceConfiguration`. If customers have implemented their own `MediaSource` and `MediaSourceConfiguration`, they would need to provide stream information via `MediaSource.getStreamInfo()`. The `MediaSourceConfiguration.getStreamInfo()` will not work.
    * The following classes are no longer publicly available.
      * `MediaSource`
      * `MediaSourceConfiguration`
      * `MediaSourceSink`
      * `AbstractKinesisVideoClient`
      * `NativeKinesisVideoClient`
      * `BytesGenerator`
      * `BytesMediaSource`
      * `BytesMediaSourceConfiguration`
      * `ProducerStreamSink`
      * `KinesisVideoServiceClient`
      * `NativeKinesisVideoProducerJni`
      * `NativeKinesisVideoProducerStream`
      * `NativeLibraryLoader`
      * `KinesisVideoMetrics`
      * `KinesisVideoProducer`
      * `KinesisVideoProducerStream`
      * `KinesisVideoStreamMetrics`
      * `ReadResult`
      * `ServiceCallbacks`
      * `com.amazonaws.kinesisvideo.service.exception.AccessDeniedException`
      * `com.amazonaws.kinesisvideo.service.exception.AmazonServiceException`
      * `com.amazonaws.kinesisvideo.service.exception.ResourceInUseException`
      * `com.amazonaws.kinesisvideo.service.exception.ResourceNotFoundException`
      * `AckConsumer`
      * `BlockingAckConsumer`
      * `DefaultServiceCallbacksImpl`

## [Release 2.7.7](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.7.7)

### Bug Fixes

* **AWS IoT**
  * Handle exception during `AWSIotMqttManager.connect` call and pass it through the status callback. See [issue #556](https://github.com/aws/aws-sdk-android/issues/556)

### Misc. Updates

* Generate Javadoc for Amazon Kinesis and Amazon Kinesis Firehose clients. See [issue #560](https://github.com/aws/aws-sdk-android/issues/560)
* Model updates for the following services
  * AWS IoT

## [Release 2.7.6](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.7.6)

### Bug Fixes
* **Amazon S3**
  * Fixed the regression introduced in `2.7.4` to support transfer objects with name containing special characters.

### Enhancements

* **AWS Auth SDK**
  * Added support for forced changed password in the sign-in flow of the UI. [issue #374](https://github.com/aws/aws-sdk-android/issues/374)
  * UI activities will show keyboard by default when requesting input from the end-user. [issue #550](https://github.com/aws/aws-sdk-android/issues/550)
  * Preserve sign-up form fields when sign-up validation fails so that end-users can correct and try again. [issue #460](https://github.com/aws/aws-sdk-android/issues/460)
  * Automatically sign-in user after actions such as sign-up or forgot password. [issue #460](https://github.com/aws/aws-sdk-android/issues/460)
  * Show the partially redacted destination of the MFA code on the screen when end-user needs to input a code.

### Misc. Updates

* Model updates for the following services
  * Amazon Comprehend
  * Amazon Transcribe

## [Release 2.7.5](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.7.5)

### Bug Fixes

* **Amazon Cognito Identity Provider**
  * Synchronize to reduce network calls when refreshing the Cognito User session. See [pr #272](https://github.com/aws/aws-sdk-android/pull/272)

* **AWS IoT**
  * Fix a bug to prevent crashes when concurrent threads publish messages. See [pr #532](https://github.com/aws/aws-sdk-android/pull/532/)

## [Release 2.7.4](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.7.4)

### Bug Fixes

* **Amazon S3**
  * Fix a bug in specifying a custom Security Provider for client-side encryption.
  * `AmazonS3EncryptionClient` (Client-side encryption) is deprecated. You can secure your content in S3 in two ways: a) For uploads, you can encrypt the file locally using an algorithm of your choice and use the TransferUtility API to upload the encrypted file to S3. For downloads, you can use the TransferUtility API to download the file and then decrypt it using the algorithm that you used to upload the file. b) `ServerSideEncryption`: There are multiple options available for ServerSide Encryption. You can setup encryption at the S3 bucket level using the AWS S3 console. When encryption is setup at the bucket level, all objects in the bucket are encrypted. You can also use the AWS console to encrypt individual objects after they have been uploaded. Another option is to request ServerSide encryption for the object being uploaded using the SDK.
  * Fix a bug to support transfer objects with name containing special characters. '+', '*', '%7E' and '%2F' characters are URL-encoded.

## [Release 2.7.3](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.7.3)

### Bug Fixes

* **Amazon Kinesis**
  * Use different patition keys for each record within a single batch when partition key is not specified by caller.

## [Release 2.7.2](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.7.2)

### Bug Fixes

* **Amazon Pinpoint**
  * Fix notifications from not showing when notification image could not be loaded. Notifications are now expandable.

## [Release 2.7.1](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.7.1)

### Enhancements

* **AWS IoT**
  * Added support for new BJS endpoint serving ATS server cert in format: [customer_id.ats.iot.cn-north-1.amazonaws.com.cn]

### Misc. Updates

* Model updates for the following services
  * Amazon CloudWatch Logs
  * Amazon DynamoDB
  * Amazon Elastic Load Balancing(ELB)
  * Amazon Parrot
  * Amazon Simple Email Service (SES)

## [Release 2.7.0](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.7.0)

### Enhancements

* **Amazon S3**
  * Starting version `2.7.0` of the SDK, `TransferService` logic has been refactored. This service now will be responsible only for monitoring network connectivity changes. When the network goes offline, the transfers that are in progress will be paused. When the network comes back online, the transfers that are paused will be resumed. If you expect your app to perform long-running transfers in the background, you need to initiate the transfers from a background service of your choice.

  * The `TransferService` will not be started or stopped by `TransferUtility` anymore. You have to start `TransferService` manually from your application. A recommended way is to start the service upon Application startup. One way you can do this is to include the following line in the `onCreate` method of your app's Application class.
  		  
	```java
	getApplicationContext().startService(new Intent(getApplicationContext(), TransferService.class));
	```

## [Release 2.6.31](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.31)

### Enhancements

* **Amazon Polly**
  * Added support for new voice `Zhiyu`.

## [Release 2.6.30](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.30)

### Bug Fixes

* **Amazon Cognito Identity Provider**
  * Compute and send secret hash when client secret is present for Custom Authentication Flow.

* **AWS Core**
  * Fixed a bug where getting a logger using Apache Commons Logging would crash starting Android 9.0 (Pie / API Level 28). See [pull #521](ttps://github.com/aws/aws-sdk-android/pull/521). Now, Apache Commons Logging would be used if it's being added as a dependency, otherwise `android.util.Log` will be used.

## [Release 2.6.29](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.29)

### Bug Fixes

* **AWS IoT**
  * `setMaxAutoReconnectAttepts` method in `AWSIotMqttManager` is deprecated. Please use `setMaxAutoReconnectAttempts` instead.

### Misc. Updates

* Model updates for the following services
  * Amazon Cognito Identity Provider
  * Amazon DynamoDB
  * Amazon Lex
  * Amazon Rekognition

## [Release 2.6.28](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.28)

### Bug Fixes

* **Amazon Cognito Auth**
  * Fix an issue where `getAppWebDomain` was used instead of  `getAppId`  which caused the SDK to return isAuthenticated as false for a logged in user. See [issue #508](https://github.com/aws/aws-sdk-android/issues/508)
  * Added identity provider as parameter to the CognitoAuth builder to allow developers to launch hosted UI directly to a certain social provider. See [issue ##494](https://github.com/aws/aws-sdk-android/issues/494) and [issue ##230](https://github.com/awslabs/aws-sdk-android-samples/issues/230)

### Misc. Updates

* Model updates for the following services
  * Amazon CloudWatch Logs
  * Amazon DynamoDB
  * Amazon KMS
  * Amazon Pinpoint
  * Amazon Transcribe

## [Release 2.6.27](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.27)

### New Features

* **Amazon Polly**
  * Amazon Polly enables female voice Aditi to speak Hindi language.

### Bug Fixes

* **AWS IoT**
  * Add customer callback when exception is thrown in client connect.

* **Amazon Cognito Identity**
  * Fixes developer authentication flow in the `cn-north-1` region.

* **AWS Lambda**
  * Fix a bug in `LambdaInvocationHandler` where the `InvocationType` is always set to `RequestResponse` even if `LogType` is `None`. See [issue #459](https://github.com/aws/aws-sdk-android/issues/459)

### Misc. Updates

* Model updates for the following services
  * Amazon DynamoDB

## [Release 2.6.26](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.26)

### Enhancements

* **Amazon Polly**
  * Added support for new `SynthesisTask` feature which allows asynchronous and batch processing.

### Misc. Updates

* Model updates for the following services
  * Amazon Comprehend
  * Amazon DynamoDB
  * AWS IoT
  * Amazon Pinpoint
  * Amazon Polly
  * Amazon Rekognition
  * Amazon Transcribe

## [Release 2.6.25](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.25)

## New Features

* **Amazon Kinesis Video Streams**
  * Updated models for HLS streaming feature. Add `AWSKinesisVideoArchivedMediaClient`and dependency `implementation 'com.amazonaws:aws-android-sdk-kinesisvideo-archivedmedia:2.6.25'` to access HLS streaming feature.

## [Release 2.6.24](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.24)

### Bug Fixes

* **Amazon Cognito Identity Provider**
  * Fix bug that prevents authentication with the username and password flow. See (issue #484)[https://github.com/aws/aws-sdk-android/issues/484]

## [Release 2.6.23](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.23)

### Enhancements

* **Amazon S3**
  * Support user metadata headers.

## [Release 2.6.22](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.22)

### Enhancements

- **Amazon Polly**
  - Added support for new voice - `Lea`.

## [Release 2.6.21](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.21)

### Enhancements

* **Amazon Kinesis Streams** and **Amazon Kinesis Firehose**
  * Added `DeadLetterListener` to allow for records that cannot be retried or exceeded the retry limit to be handled.
  * Added one automatic retry for unmarshall errors when submitting all records.

### Misc. Updates

* Model updates for the following services
  * Amazon Auto Scaling
  * Amazon Cognito Identity
  * Amazon Cognito Identity Provider
  * Amazon Cognito Sync
  * Amazon DynamoDB
  * Amazon Elastic Load Balancing (ELB)
  * Amazon Kinesis Firehose
  * Amazon Kinesis Streams
  * Amazon Kinesis Video Streams
  * Amazon Lex
  * Amazon Machine Learning
  * Amazon Pinpoint
  * Amazon Polly
  * Amazon Rekoginiton
  * Amazon Security Token Service (STS)
  * Amazon Simple Email Service (SES)
  * AWS IoT
  * AWS Key Management Service (KMS)
  * AWS Lambda

## [Release 2.6.20](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.20)

### New Features

 * **Amazon Comprehend**
  * Amazon Comprehend is a natural language processing (NLP) service that uses machine learning to find insights and relationships in text.

* **Amazon Translate**
  * Amazon Translate is a neural machine translation service that delivers fast, high-quality, and affordable language translation.

### Misc. Updates

* **Amazon CloudWatch Logs**
  * Update Amazon CloudWatch Logs client to the latest service model.

* **Amazon Cognito Identity**
  * Update Amazon Cognito Identity client to the latest service model.

* **Amazon Lex**
  * Update Amazon Lex client to the latest service model.

### Bug Fixes

* **Amazon S3**
  * Support Storage Class in `TransferUtility`. See [pr #398](https://github.com/aws/aws-sdk-android/pull/398/)

## [Release 2.6.19](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.19)

### New Features

* **Amazon Transcribe**
  * Amazon Transcribe is an automatic speech recognition (ASR) service that makes it easy for developers to add speech to text capability to their applications.

### Bug Fixes

* **Amazon CloudWatch Logs**
  * Fix signing issue for `AmazonCloudWatchLogsClient`.  See [issue #453](https://github.com/aws/aws-sdk-android/issues/453)
  
* **AWS IoT**
  * Use `ConcurrentHashMap` to avoid `ConcurrentModificationException`. See [PR #330](https://github.com/aws/aws-sdk-android/issues/330)

## [Release 2.6.18](https://github.com/aws/aws-sdk-android/releases/tag/release_v2.6.18)

### Enhancements

* **Amazon Kinesis Video Streams**
  * Add handling of token rotation, error recovery and the re-streaming in general.
  * **Breaking API Changes**

	|Class|2.6.17 API|2.6.18 API
	|-----|----------|----------
	| KinesisVideoProducerStream|getStreamData(byte[], int, int)<br />return type: int|getStreamData(byte[], int, int, ReadResult)<br />return type: void
	| NativeKinesisVideoProducerJni|getStreamData(long, byte[], int, int)<br />return type: int|getStreamData(long, byte[], int, int , ReadResult)<br />return type: void
	| NativeKinesisVideoProducerStream|getStreamData(@ byte[], int, int)<br />return type: int|getStreamData(@ byte[], int, int, ReadResult)<br />return type: void

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
1
