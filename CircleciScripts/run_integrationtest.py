from utils import *
import sys
import os

test_results = sys.argv[1]
root = sys.argv[2]
testmodule =  sys.argv[3]


ignored_failures_dict = {
	'aws-android-sdk-ddb-mapper-test' : [
		"com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.BinaryAttributesIntegrationTest#testUpdate" ,
		'com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.ScanIntegrationTest#testParallelScanPerformance', 
		'com.amazonaws.services.dynamodbv2.ServiceIntegrationTest#testServiceOperations'
	] ,
	'aws-android-sdk-mobile-client' : [
		"com.amazonaws.mobile.client.AWSMobileClientTest#testSignOut",
	],
	'aws-android-sdk-kinesis-test' : [
		"com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.KinesisRecorderIntegrationTest#testReadCorruptLines"
	], 
	'aws-android-sdk-s3-test' : [
		"com.amazonaws.services.s3.CleanupBucketIntegrationTests#testCleanup"
	]
}
print("module: ", testmodule)
ignoreFailures = None 
if testmodule in ignored_failures_dict:
	ignoreFailures = ignored_failures_dict[testmodule]

runcommand('echo "export testresult=0" >> $BASH_ENV')  
runcommand("rm -rf {0}".format(test_results))
runcommand("mkdir {0}".format(test_results))

if runtest(testmodule, TestTypes.IntegrationTest, test_results, ignoreFailures) != 0:
    exit(1)
