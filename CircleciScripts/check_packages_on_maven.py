from urllib.parse import urlencode
import requests
import demjson
import time 
import sys
import os
packagelist = {
    'aws-android-sdk-rekognition', 
    'aws-android-sdk-cloudwatch', 
    'aws-android-sdk-mobile-client', 
    'aws-android-sdk-core', 
    'aws-android-sdk-sdb', 
    'aws-android-sdk-polly', 
    'aws-android-sdk-kinesisvideo-archivedmedia', 
    'aws-android-sdk-ddb-document', 
    'aws-android-sdk-sns', 
    'aws-android-sdk-ec2', 
    'aws-android-sdk-ses', 
    'aws-android-sdk-lambda', 
    'aws-android-sdk-iot', 
    'aws-android-sdk-cognitoidentityprovider', 
    'aws-android-sdk-s3', 
    'aws-android-sdk-kms', 
    'aws-android-sdk-auth-core', 
    'aws-android-sdk-auth-ui', 
    'aws-android-sdk-cognito', 
    'aws-android-sdk-logs', 
    'aws-android-sdk-auth-userpools', 
    'aws-android-sdk-autoscaling', 
    'aws-android-sdk-auth-facebook', 
    'aws-android-sdk-transcribe', 
    'aws-android-sdk-cognitoauth', 
    'aws-android-sdk-ddb', 
    'aws-android-sdk-elb', 
    'aws-android-sdk-translate', 
    'aws-android-sdk-pom', 
    'aws-android-sdk-lex', 
    'aws-android-sdk-ddb-mapper', 
    'aws-android-sdk-apigateway-core', 
    'aws-android-sdk-comprehend', 
    'aws-android-sdk-kinesisvideo', 
    'aws-android-sdk-auth-google', 
    'aws-android-sdk-mobileanalytics', 
    'aws-android-sdk-kinesis', 
    'aws-android-sdk-pinpoint', 
    'aws-android-sdk-machinelearning', 
    'aws-android-sdk-sqs'
}

def IsAllPackageAvailableOnMaven(version):

    print("--------------- check packages with version {0} on maven ---------------".format(version))

    url = 'https://search.maven.org/solrsearch/select'
    data = {}
    data['q'] = 'g:com.amazonaws AND v:{0}'.format(version) 
    data['rows'] = 50

    url_values = urlencode(data)
    full_url = url + '?' + url_values
    response = requests.get(full_url)
    the_page = response.json()
    # print(the_page)

    docs = the_page["response"]["docs"]
    available_packagelist = set(map(lambda x: x['a'], docs))
    if available_packagelist:
        print ("available package list with version {0} : {1}".format(version,available_packagelist))
    else:
        print ("not packages are available on maven with version {0}".format(version))
        return False
    not_available_packagelist = packagelist - available_packagelist
    if not_available_packagelist:
        print("packages with version {0} that are not available: {1}".format(version,not_available_packagelist))
        return False
    else:
        print("all packages with version {0} are available".format(version))
        return True

version = sys.argv[1]

while not IsAllPackageAvailableOnMaven(version):
    time.sleep(300)

print("Done!")

    
 

 