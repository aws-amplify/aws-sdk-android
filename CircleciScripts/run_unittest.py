from functions import runcommand
from functions import runtest
from functions import TestTypes
import sys
import re

with open("settings.gradle") as f:
    lines = f.readlines()
# you may also want to remove whitespace characters like `\n` at the end of each line
testmodules = []
for line in lines:
    m = re.match(".*':(.*).*'", line)
    if m is not None:
        testmodules.append(m.group(1))
    else:
        print(line)

 
testmodules = [
    "aws-android-sdk-sdb",
    "aws-android-sdk-polly",
    "aws-android-sdk-kinesis",
    "aws-android-sdk-pinpoint",
    "aws-android-sdk-ddb-mapper",
    "aws-android-sdk-mobileanalytics",
    "aws-android-sdk-core",
    "aws-android-sdk-lambda",
    "aws-android-sdk-s3"
] 
 
test_results = sys.argv[1]
runcommand("rm -rf {0}".format(test_results))
runcommand("mkdir {0}".format(test_results))
for module in testmodules:
	if runtest(module, TestTypes.UnitTest, test_results) != 0 :
		exit(1)
