import sys
from subprocess import Popen, PIPE
import subprocess
import xml.etree.ElementTree as ET
import os
from datetime import datetime
from enum import Enum
from collections import namedtuple
import re
import platform

TestType  = namedtuple('TestType', ['value', 'testAction', 'displayString'])
class TestTypes(Enum):
    UnitTest = TestType(1, 'test -PexcludeTests=**/*IntegrationTest.class', 'unit test')
    IntegrationTest = TestType(2, 'connectedAndroidTest', 'integration test')   
    @property
    def displayString(self):
        return self.value.displayString

    @property
    def testAction(self):
        return self.value.testAction
        

def runcommand(command, timeout=0,pipein=None, pipeout =  None, logcommandline = True,  workingdirectory=None):
    if logcommandline:
        print("running command: ", command, "......")
    process = Popen(command, shell=True, stdin=pipein, stdout = pipeout, cwd = workingdirectory)
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
    dest = "{0}/{1}".format(results, module)
    runcommand('mkdir -p "{0}"'.format(dest))
    source = "{0}/build/reports/*".format(module)             
    if runcommand("cp -rf {0} {1}".format(source,dest)) != 0 :
        return 1
    if exit_code != 0 :    
        print("test failed for {0}".format(module))
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
 #replace is a dictionary. it has a format 
 #{
 # "exclude:string"
 # "match":string,
 # "replace":string 
 # "files" : [
 # string,
 # ]
 # match and replace will be used by sed command like  sed -E 's/{match}/{replace}/'
 # please check with sed document to see how to handle escape characaters in match and replace
 #}
def replacefiles(root, replaces):
    for replaceaction in replaces:
        match = replaceaction["match"]
        replace = replaceaction["replace"]
        files = replaceaction["files"]
        paramters = "-r -i''"
        if platform.system() == "Darwin":
            paramters = "-E -i ''"
        exclude=""
        if 'exclude' in replaceaction:
            exclude = "/{0}/ ! ".format(replaceaction['exclude'])       
        for file in files:
            targetfile = os.path.join(root, file)           
            runcommand(command = "sed {4}   '{3}s/{0}/{1}/'  '{2}'".format(match, replace, targetfile, exclude, paramters), logcommandline = True) 



