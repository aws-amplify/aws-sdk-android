from utils import *
import sys
import os

test_results = sys.argv[1]
root = sys.argv[2]
testmodulelist =  sys.argv[3].split('/')

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


runcommand('echo "export testresult=0" >> $BASH_ENV')  
runcommand("rm -rf {0}".format(test_results))
runcommand("mkdir {0}".format(test_results))
exit_code = 0
for testmodule in testmodulelist:
    print("module: ", testmodule)
    ignoreFailures = None 
    if testmodule in ignored_failures_dict:
        ignoreFailures = ignored_failures_dict[testmodule]  
    if runtest(testmodule, TestTypes.IntegrationTest, test_results, ignoreFailures) != 0:
        exit_code = 1
exit(exit_code)
