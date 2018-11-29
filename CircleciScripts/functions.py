import sys
from subprocess import Popen, PIPE
import subprocess
import xml.etree.ElementTree as ET
import os
from datetime import datetime
from enum import Enum
from collections import namedtuple

TestType  = namedtuple('TestType', ['value', 'testAction', 'displayString'])
class TestTypes(Enum):
    UnitTest = TestType(1, 'test', 'unit test')
    integration = TestType(2, 'connectedAndroidTest', 'integration test')
    @property
    def displayString(self):
        return self.value.displayString

    @property
    def testAction(self):
        return self.value.testAction
        

def runcommand(command, timeout=0,pipein=None, pipeout =  None):
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

    
    testcommand = "bash gradlew {0}:{1}".format(module, testtype.testAction)
    print("Running {0} for {1} .......".format(testtype.displayString, module))   
    exit_code = runcommand(testcommand)   
    if exit_code != 0 :
        desc = "{0}/{1}".format(results, module)
        runcommand("mkdir {0} ".format(desc))
        source = "{0}/build/reports/tests/*".format(module)
        if runcommand("mv {0} {1}".format(source,desc)) != 0 :
            return 1

    return 0
   # xcprettyoutput.close()


