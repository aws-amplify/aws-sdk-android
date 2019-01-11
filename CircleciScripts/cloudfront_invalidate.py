import os
import sys
import datetime
from functions import runcommand

awsprofile = sys.args[1]
distribution_id = sys.args[2]
path = sys.args[3]

invalidation='{"Paths":{"Quantity":1,"Items":["/{0}"]},"CallerReference":"{0}{1}"}'.format(path,datetime.datetime.now())
returncode = runcommand("aws cloudfront invalidation --distribution-id {0} --invalidation-batch '{1}'".format(distribution_id, invalidation))
exit(returncode)


