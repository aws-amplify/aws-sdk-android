# Using Proguard with the AWS SDK for Android

## Modifying proguard-project.txt for the AWS SDK for Android

When exporting your app using the AWS SDK for Android with the default, empty _proguard-project.txt_ file, you may notice that Eclipse reports errors. In order to correct these errors, add the following lines to the end of your _proguard-project.txt_ file:

```
# Class names are needed in reflection
-keepnames class com.amazonaws.**
# Request handlers defined in request.handlers
-keep class com.amazonaws.services.**.*Handler
# The following are referenced but aren't required to run
-dontwarn com.fasterxml.jackson.**
-dontwarn org.apache.commons.logging.**
# Android 6.0 release removes support for the Apache HTTP client
-dontwarn org.apache.http.**
# The SDK has several references of Apache HTTP client
-dontwarn com.amazonaws.http.**
-dontwarn com.amazonaws.metrics.**
```

**Note:** This configuration applies only to the AWS SDK for Android; if you are using other third-party libraries, you need to consult the documentation for those libraries to see if they require additional configuration to support the use of Proguard.

## Additional Resources

The configuration provided in this article allows developers to ship apps using the AWS SDK for Android that use less of the user's storage.

All samples in the AWS SDK for Android starting with version 1.3.0 ship with functional Proguard configuration. You can download the latest version of the AWS SDK for Android [here](http://aws.amazon.com/sdkforandroid).

## Questions?

Please feel free to ask questions or provide comments in the [Mobile Development Forum](https://forums.aws.amazon.com/forum.jspa?forumID=88).
