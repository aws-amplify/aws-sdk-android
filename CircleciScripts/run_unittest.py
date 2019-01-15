from functions import runcommand
from functions import runtest
from functions import TestTypes
from functions import getmodules
import sys
import os

test_results = sys.argv[1]
root = sys.argv[2]
print(root)
testmodules =  getmodules(root)


runcommand("rm -rf {0}".format(test_results))
runcommand("mkdir {0}".format(test_results))
runcommand('echo "export testresult=0" >> $BASH_ENV')
for module in testmodules:
    testfolder = os.path.join(root, module, "src/test")
    if (os.path.isdir(testfolder)):
        if runtest(module, TestTypes.UnitTest, test_results) != 0 :
            exit(1)
