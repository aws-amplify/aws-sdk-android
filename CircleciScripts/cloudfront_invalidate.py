import os
import sys
import datetime
from functions import runcommand

awsprofile = sys.argv[1]
distribution_id = sys.argv[2]
path = sys.argv[3]
invalidation='{{"Paths":{{"Quantity":1,"Items":["/{0}"]}},"CallerReference":"{0}{1}"}}'.format('path',  datetime.datetime.now())
returncode = runcommand(command="aws cloudfront create-invalidation --distribution-id {0} --invalidation-batch '{1}'".format(distribution_id, invalidation), logcommandline = True)
print("returncode=", returncode)
exit(returncode)


