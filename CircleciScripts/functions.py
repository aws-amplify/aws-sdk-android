import sys
from subprocess import Popen, PIPE
import subprocess
import xml.etree.ElementTree as ET
import os
from datetime import datetime
from enum import Enum
from collections import namedtuple
import re
import demjson

TestType  = namedtuple('TestType', ['value', 'testAction', 'displayString'])
class TestTypes(Enum):
    UnitTest = TestType(1, 'test -PexcludeTests=**/*IntegrationTest.class', 'unit test'),
    IntegrationTest = TestType(2, 'connectedAndroidTest', 'integration test')
    @property
    def displayString(self):
        return self.value.displayString

    @property
    def testAction(self):
        return self.value.testAction
        

def runcommand(command, timeout=0,pipein=None, pipeout =  None, logcommandline = True):
    if logcommandline:
        print("running command: ", command, "......")
    process = Popen(command, shell=True, stdin=pipein, stdout = pipeout)
    wait_times = 0 
    while True:
        try:
            process.communicate(timeout = 10)
        except subprocess.TimeoutExpired:        
            #tell circleci I am still alive, don't kill me
            if wait_times % 30 == 0 :
                print(str(datetime.now())+ ": I am still alive")
            # if time costed exceed timeout, quit
            if timeout >0 and wait_times > timeout * 6 :
                print(str(datetime.now())+ ": time out")
                return 1
            wait_times+=1 

            continue
        break
    exit_code = process.wait()    
    return exit_code


def runtest(module, testtype, results):

    
    testcommand = "bash gradlew {0}:{1} ".format(module, testtype.testAction)
    print("Running {0} for {1} .......".format(testtype.displayString, module))   
    exit_code = runcommand(testcommand)   
    print("test failed for {0}".format(module))
    dest = "{0}/{1}".format(results, module)
    runcommand('mkdir -p "{0}"'.format(dest))
    source = "{0}/build/reports/*".format(module)             
    if runcommand("cp -rf {0} {1}".format(source,dest)) != 0 :
        return 1
    if exit_code != 0 :    
        runcommand('echo "export testresult=1" >> $BASH_ENV')  

    return 0

def getmodules(root):
    with open(os.path.join(root, "settings.gradle")) as f:
        lines = f.readlines()
    modules = []
    for line in lines:
        m = re.match(".*':(aws-android-sdk-.*).*'", line)
        if m is not None:
            modules.append(m.group(1))
        else:
            print("{0} is not a sdk module ".format(line)) 
    return modules ;

def replacefiles(root, replaces):
    for replaceaction in replaces:
        match = replaceaction["match"]
        replace = replaceaction["replace"]
        files = replaceaction["files"]
        for file in files:
            targetfile = os.path.join(root, file)
            runcommand(command = "sed -r -i'' 's/{0}/{1}/' '{2}'".format(match, replace, targetfile), logcommandline = True) 
            print("replace ", match, replace, targetfile)


def testreplacefiles(root, replacesjson):
    with open(replacesjson, 'r') as jsonfile:
        jsonstring = jsonfile.read()
    rootelement =  demjson.decode(jsonstring)
    replaces =  rootelement["replaces"]
    print(replaces)
    replacefiles(root, replaces)
def testre(root):
    replaces = [
        {
            "match" : 'public static final String EMAIL = ".*";', 
            "replace" : 'public static final String EMAIL = "bimin@amazon.com"; ',
            "files" : [
                "aws-android-sdk-mobile-client/src/androidTest/java/com/amazonaws/mobile/client/AWSMobileClientTest.java",
                "aws-android-sdk-mobile-client/src/androidTest/java/com/amazonaws/mobile/client/AWSMobileClientTest.java"
            ]       
        } ,

        {
            "match" : 'public static final String BLURRED_EMAIL = ".*";', 
            "replace" : 'public static final String BLURRED_EMAIL = "b***@a***.com";',
            "files" : [
                "aws-android-sdk-mobile-client/src/androidTest/java/com/amazonaws/mobile/client/AWSMobileClientTest.java",
                "aws-android-sdk-mobile-client/src/androidTest/java/com/amazonaws/mobile/client/AWSMobileClientTest.java"
            ]       
        } ,

        {
            "match" : 'public static final String USERNAME = ".*";', 
            "replace" : 'public static final String USERNAME = "bimin";',
            "files" : [
                "aws-android-sdk-mobile-client/src/androidTest/java/com/amazonaws/mobile/client/AWSMobileClientTest.java",
                "aws-android-sdk-mobile-client/src/androidTest/java/com/amazonaws/mobile/client/AWSMobileClientTest.java"
            ]       
        } ,

        {
            "match" : 'public static final String PASSWORD = ".*!";', 
            "replace" : 'public static final String PASSWORD = "1234Password!";',
            "files" : [
                "aws-android-sdk-mobile-client/src/androidTest/java/com/amazonaws/mobile/client/AWSMobileClientTest.java",
                "aws-android-sdk-mobile-client/src/androidTest/java/com/amazonaws/mobile/client/AWSMobileClientTest.java"
            ]       
        } ,

        {
            "match" : 'public static final String IDENTITY_ID = ".*";', 
            "replace" : 'public static final String IDENTITY_ID = "us-east-1:ed81e85c-6f1e-49ce-841c-7bba60370a7d";',
            "files" : [
                "aws-android-sdk-mobile-client/src/androidTest/java/com/amazonaws/mobile/client/AWSMobileClientTest.java",
                "aws-android-sdk-mobile-client/src/androidTest/java/com/amazonaws/mobile/client/AWSMobileClientTest.java"
            ]       
        } ,

        {
            "match" : 'public static final String NEW_PASSWORD = ".*";', 
            "replace" : 'public static final String NEW_PASSWORD = "new1234Password!";',
            "files" : [
                "aws-android-sdk-mobile-client/src/androidTest/java/com/amazonaws/mobile/client/AWSMobileClientTest.java",
                "aws-android-sdk-mobile-client/src/androidTest/java/com/amazonaws/mobile/client/AWSMobileClientTest.java",
                "aws-android-sdk-mobile-client/src/androidTest/java/com/amazonaws/mobile/client/AWSMobileClientTestBase.java"
            ]       
        } ,
    ]
    replacefiles(root, replaces)




