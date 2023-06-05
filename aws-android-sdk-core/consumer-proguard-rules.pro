# Class names are needed in reflection
-keepnames class com.amazonaws.**
-keepnames class com.amazon.**

# Enums are not obfuscated correctly in combination with Gson
-keepclassmembers enum * { *; }

# Request handlers defined in request.handlers
-keep class com.amazonaws.services.**.*Handler

# The following are referenced but aren't required to run
-dontwarn com.fasterxml.jackson.**

# Android 6.0 release removes support for the Apache HTTP client
-dontwarn org.apache.http.**

# The SDK has several references of Apache HTTP client
-dontwarn com.amazonaws.http.**
-dontwarn com.amazonaws.metrics.**

# AGP 8 enables R8 full-mode optimization, which will remove constructors of classes that are only
# instantiated via reflection. These classes are instantiated via reflection in the SignerFactory.
-keep class com.amazonaws.auth.AWS4Signer { *; }
-keep class com.amazonaws.auth.QueryStringSigner { *; }
-keep class com.amazonaws.auth.NoOpSigner { *; }
