from functions import getmodules
from functions import replacefiles
import sys
import os

root = sys.argv[1]
newsdkversion = sys.argv[2]
lastdot = newsdkversion.rfind('.')
maxminorversion = newsdkversion[0:lastdot]

replaces = [
    {
        "exclude" : "com.amazonaws:aws-android-sdk-appsync",
        "match" : r"(com.amazonaws:aws-android-sdk-.+:)[0-9]+\.[0-9]+\.\+", 
        "replace" : r"\1[maxminorversion].+",
        "files" : [
            "analytics.md",
            "api.md",
            "authentication.md",
            "how-to-cognito-integrate-an-existing-identity-pool-android.md",
            "interactions.md",
            "manualsetup.md",
            "pubsub.md",
            "push-notifications.md",
            "start.md",
            "storage.md",
        ]       
    } 
]
for replaceaction in replaces:
    replaceaction["replace"] = replaceaction["replace"].replace("[maxminorversion]", maxminorversion)
replacefiles(root, replaces)
