# Using Proguard with the AWS SDK for Android

Proguard is an open source project whose aim is to help Java developers shrink, optimize, and obfuscate their Java code. With storage on mobile devices at a premium, Proguard has become a popular option for Android developers looking to minimize the size of their apps and also protect their code from prying eyes. You can learn more about Proguard and its features at the project's [official site](http://proguard.sourceforge.net/).

Starting with version 1.3.0 of the AWS SDK for Android, AWS will be actively supporting users who want to make use of Proguard in their Android projects. This article discusses how developers can optimally configure Proguard to shrink, optimize, and obfuscate their code and still use the AWS SDK for Android for all services it supports.

## Creating a Proguard Config

Proguard is now integrated into the Eclipse IDE by means of the ADT plug-in. Starting with ADT versions 17 and later, a default config ships with the toolkit and can be included in your Android app. A project customization file _proguard-project.txt_ will also be created where additional options can be supplied as needed.

If you are adding Proguard to an existing app, you can place your _proguard-project.txt_ anywhere in the project folder, but typically it is placed at the root of your project, alongside the _AndroidManifest.xml_ and _project.properties_ files.

Regardless of whether you created the file yourself or used the default config when you created a new project, you still need to enable Proguard for your app. As noted on the [Android Tools Project Site](http://tools.android.com/recent/proguardimprovements), you do this by adding a line similar to the following in your _project.properties_ file:

```
proguard.config=${sdk.dir}/tools/proguard/proguard-android.txt:proguard-project.txt
```

If you did not create your _proguard-project.txt_ file at the root of your project directory, you need to supply the path to the file as well.

```
proguard.config=${sdk.dir}/tools/proguard/proguard-android.txt:<path_to_proguard>/proguard-project.txt
```

You may also choose to completely override the default proguard configuration as supplied by ADT by simply excluding it from your project.properties. You can than copy the portions of the default _proguard-android.txt_ you want into your _proguard-project.txt_ **Note:** This is not recommended by the ADT developers and it will prevent your app from receiving updates released with ADT updates and may generate a warning during lint processing.

```
proguard.config=proguard-project.txt
```

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

## Conclusion and Additional Resources

Proguard is a valuable tool for Android developers who care about the size of their apps. The configuration provided in this article allows developers to ship apps using the AWS SDK for Android that use less of the user's storage.

All samples in the AWS SDK for Android starting with version 1.3.0 ship with functional Proguard configuration. You can download the latest version of the AWS SDK for Android [here](http://aws.amazon.com/sdkforandroid).

## Questions?

Please feel free to ask questions or provide comments in the [Mobile Development Forum](https://forums.aws.amazon.com/forum.jspa?forumID=88).
