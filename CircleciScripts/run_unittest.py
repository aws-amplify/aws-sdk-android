from functions import runcommand
from functions import runtest
from functions import TestTypes
import sys

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
runcommand("mkdir {0}".format(test_results))
for module in testmodules:
	if runtest(module, TestTypes.UnitTest, test_results) != 0 :
		exit(1)
