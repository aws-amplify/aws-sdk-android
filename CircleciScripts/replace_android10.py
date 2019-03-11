from utils import replacefiles
import demjson
import sys
import re
import os
root = sys.argv[1]

replaces = [
    {
        "match" : 'android-23', 
        "replace" : 'android-10',
        "files" : [
            "aws-android-sdk-core/build.gradle"
        ]       
    } ,
    {
        "match" : 'android-23.jar', 
        "replace" : 'android-10.jar',
        "files" : [
            "aws-android-sdk-core/build.gradle"
        ]       
    } ,
]
replacefiles(root, replaces)




AWSKeyValueStoreFile = os.path.join(root,"aws-android-sdk-core/src/main/java/com/amazonaws/internal/keyvaluestore/AWSKeyValueStore.java")
newcontent = ""
with open(AWSKeyValueStoreFile, 'r') as myfile:
    content = myfile.read() 
    pattern = r'if\s*\(apiLevel >= ANDROID_API_LEVEL_23\)\s*\{[^\}]+\}\s*else if\s*\(apiLevel >= ANDROID_API_LEVEL_18\)\s*\{[^\}]+\}'
    repl = r"if (apiLevel >= ANDROID_API_LEVEL_23) {}\r\n else if (apiLevel >= ANDROID_API_LEVEL_18) {}\r\n"     
    newcontent = re.sub(pattern, repl, content)
   
    pattern = r'apiLevel\s*>=\s*ANDROID_API_LEVEL_23[^\?\(\)]+\?[^:]+:\s*new IvParameterSpec\(iv\)'
    repl = r"new IvParameterSpec(iv)"
    newcontent = re.sub(pattern, repl, newcontent)    
    newcontent = re.sub(pattern, repl, newcontent)   

with open(AWSKeyValueStoreFile,"w") as myfile:
    myfile.write(newcontent)
  

