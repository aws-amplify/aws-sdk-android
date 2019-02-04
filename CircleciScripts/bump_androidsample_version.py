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
        "match" : r"(com.amazonaws:aws-android-sdk-.+:)[0-9]+\.[0-9]+\.\+", 
        "replace" : r"\1[maxminorversion].+",
        "files" : [
            "AmazonCognitoAuthDemo/app/build.gradle",
            "AmazonCognitoYourUserPoolsDemo/app/build.gradle",

        ]       
    } ,
    {
        "match" : r'def[[:space:]]+aws_version[[:space:]]*=[[:space:]]*"[0-9]+\.[0-9]+\.\+"', 
        "replace" : r'def aws_version = "[maxminorversion].+"',
        "files" : [
            "AmazonKinesisVideoDemoApp/build.gradle",
            "AndroidPubSub/build.gradle",
            "AndroidPubSubWebSocket/build.gradle",
            "LexSample/app/build.gradle",
            "PollyDemo/app/build.gradle",
            "S3TransferUtilitySample/build.gradle"
        ]       
    } ,
]
for replaceaction in replaces:
    replaceaction["replace"] = replaceaction["replace"].replace("[maxminorversion]", maxminorversion)
replacefiles(root, replaces)
