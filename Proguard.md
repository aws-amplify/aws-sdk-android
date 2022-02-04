# Using ProGuard with the AWS SDK for Android

Users should receive ProGuard rules automatically.
See [the `aws-android-sdk-core` package](aws-android-sdk-core/consumer-proguard-rules.pro) and
[Android considerations](https://developer.android.com/studio/projects/android-library#Considerations).

**Note:** The ProGuard configuration mentioned above applies to the AWS SDK for Android.
If you are using other third-party libraries, you need to consult the documentation
for those libraries to see if they require additional configuration to support the use of ProGuard.

# (Optional) Additional proguard rules
If you are facing warnings like `Warning: com.amazonaws.mobile.client.AWSMobileClient: can't find referenced class` you can ignore them by using the following in your proguard-rules.pro file

`
-dontwarn com.amazonaws.mobileconnectors.cognitoauth.**
-dontwarn com.amazonaws.mobile.auth.**
`

## Additional Resources

The configuration provided in this article allows developers to ship apps using the AWS SDK for Android
that use less of the user’s storage.

All samples in the AWS SDK for Android starting with version 1.3.0 ship with functional ProGuard configurations.
You can download the latest version of the AWS SDK for Android [here](https://aws.amazon.com/amplify/).

## Questions?

Please feel free to ask questions or provide comments in the [Mobile Development Forum](https://forums.aws.amazon.com/forum.jspa?forumID=88).
