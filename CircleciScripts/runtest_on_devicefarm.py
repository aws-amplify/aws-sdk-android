from utils import *
import sys
import os
import boto3
import datetime
import time
import demjson
from utils import runcommand
from collections import namedtuple
from send_email import *

base=sys.argv[1]
configurefile = sys.argv[2]
lastcommit = sys.argv[3]
tag = lastcommit[:10]

with open(configurefile, 'r') as jsonfile:
    jsonstring = jsonfile.read()
configure =  demjson.decode(jsonstring)

keepoldrundays = configure['keepoldrundays']
project_arn = configure['project_arn']
dummy_apk_arn = configure['dummy_apk_arn']
devicepool_arn = configure['devicepool_arn']
testspec_arn = configure['testspec_arn']
testmodulelist = configure['testmodulelist']


client = boto3.client('devicefarm', region_name='us-west-2')
 
# clean up old uploads
response = client.list_uploads(arn = project_arn, type = 'INSTRUMENTATION_TEST_PACKAGE')
while True:   
    now  = datetime.datetime.now()
    for upload in response['uploads']:

        createdtdays= (now - upload['created'].replace(tzinfo=None)).days
        status = upload['status']
        name = upload['name']
        if (createdtdays >= keepoldrundays or status != 'SUCCEEDED') and name.startswith("aws-android-sdk-") :
            print("delete old upload:", name)
            arn = upload['arn']
            client.delete_upload(arn = arn)
    if 'nextToken' in response:
        nextToken = response['nextToken']
        response = client.list_uploads(arn = project_arn, type = 'INSTRUMENTATION_TEST_PACKAGE', nextToken = nextToken)
    else:
        break;
#clean up old runs
response = client.list_runs(arn = project_arn)
while True: 
    now  = datetime.datetime.now()
    for run in response['runs']:
        name = run['name']
        createdtdays = (now - run['created'].replace(tzinfo=None)).days
        status = run['status']
        if  createdtdays >= keepoldrundays  and status != "PENDING" and status != 'RUNNING':
            print("delete old run:", name)
            arn = run['arn']
            client.delete_run(arn = arn)
    if 'nextToken' in response:
        nextToken = response['nextToken']
        response = client.list_runs(arn = project_arn, nextToken = nextToken)
    else:
        break;

failedmodule = namedtuple('failedmodule','name, reason')
failedmodulelist = []
for module in testmodulelist:
    name = module[16:]
    if name.endswith('-test'):
        name = name[:-5]    
    print("#################### {0} ####################".format(name))
    # build module for test
    command = "bash gradlew :{0}:assembleAndroidTest".format(module)
    rn = runcommand(command)
    if rn != 0 :
        print("failed to build test module:", module)
        failedmodulelist.append (
                failedmodule (
                    name = name , 
                    reason = "failed to build test module"
                    )
            )
        continue;
    apkfile = os.path.join(base, module, "build/outputs/apk/androidTest/debug/{0}-debug-androidTest.apk".format(module))
    if not os.path.isfile(apkfile) :
        print("cannot find test module apk:", apkfile)
        failedmodulelist.append (
                failedmodule (
                    name = name , 
                    reason = "cannot find test module apk"
                    )
            )
        continue
    # create an upload for the test module
    response = client.create_upload(
        projectArn = project_arn,
        name='{0}-debug-androidTest-{1}.apk'.format(module, tag),
        type='INSTRUMENTATION_TEST_PACKAGE'
    )
    uploadarn =  response['upload']['arn']
    status = response['upload']['status']
    if status != 'INITIALIZED':
        print("Failed to create upload")
        failedmodulelist.append (
                failedmodule (
                    name = name , 
                    reason = "Failed to create upload"
                    )
                )
        continue

    uploadurl = response['upload']['url']
    #upload the test module
    uploadcommand = 'curl -T "{0}"  "{1}"'.format(apkfile, uploadurl)  
    rn = runcommand(uploadcommand)
    if rn != 0 :
        print("Failed to run curl upload:", module)
        failedmodulelist.append (
                failedmodule (
                    name = name , 
                    reason = "Failed to run curl upload"
                    )
                )
        continue

    while  status != 'SUCCEEDED' and status != 'FAILED' :   
        print("upload status:", status)
        time.sleep(5)
        response = client.get_upload(arn = uploadarn)
        status = response['upload']['status']
    if status == 'FAILED':
        print("Failed to upload test apk for ", module)
        failedmodulelist.append (
                failedmodule (
                    name = name , 
                    reason = "Failed to run curl upload"
                    )
                )
        continue;
    #schedule an run for the test module
    response = client.schedule_run(
        projectArn = project_arn,
        appArn = dummy_apk_arn,
        devicePoolArn= devicepool_arn,
        name='{0}-{1}'.format(name, tag),
        test={
            'type': 'INSTRUMENTATION',
            'testPackageArn': uploadarn,
        }
    )
    print(response['run']['status'], response['run']['result'])

if len (failedmodulelist) > 0 :
    joblink = r"https://circleci.com/gh/{0}/{1}/{2}".format(os.environ.get('CIRCLE_PROJECT_USERNAME'), os.environ.get('CIRCLE_PROJECT_REPONAME'), os.environ.get('CIRCLE_BUILD_NUM'))
    htmloutput = '<a href="{0}">Details for more information.</a> <br>'.format(joblink)
    htmloutput += "<br> <br>"
    htmloutput +=  """<table> 
              <tr align="left"  bgcolor="#A9A9A9">
                <th >module name</th>
                <th >failed reason</th>
              </tr> 
              """
    for module in failedmodulelist:
        htmloutput +=  \
                """<tr  >
                    <td>{name}</td>
                    <td>{reason}</td>
                  </tr>
                """.format(name = module.name, reason = module.reason)
     
    title = "Alarm!!! Faied to run Anroid SDK Integration test on device farm"
    response = send_email(title, htmloutput , contentformat = ContentFormat.Html, fromaddress = configure['email_from'], toaddresses = configure['alarm_email_to'] )
    print(response)



print("done")




