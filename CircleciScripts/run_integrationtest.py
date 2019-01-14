from functions import runcommand
from functions import runtest
from functions import TestTypes
from functions import getmodules
import sys
import os

test_results = sys.argv[1]
root = sys.argv[2]
print(root)
testmodules =  ["apigatewaycoretest"]


runcommand("rm -rf {0}".format(test_results))
runcommand("mkdir {0}".format(test_results))
for module in testmodules:
    if runtest(module, TestTypes.IntegrationTest, test_results) != 0 :
        exit(1)
