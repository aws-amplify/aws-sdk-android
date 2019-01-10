import os
import sys
from functions import getmodules
from functions import runcommand
from shutil import copyfile
from pathlib import Path
root = sys.argv[1]
version = sys.argv[2]
s3profile = sys.argv[3]
s3prefix=sys.argv[4]
#"aws-android-sdk-stage-csun/com/amazonaws"

modules = getmodules(root)
for module in modules:
    target = os.path.join(root, module, "target")
    s3maven = os.path.join(target, "s3maven")
    runcommand("mkdir -p '{0}'".format(s3maven))
    for file in os.listdir(target):
        sourcefile = os.path.join(target, file)
        if os.path.isfile(sourcefile) and  (version in file):
            targetfile = os.path.join(s3maven, file)
            copyfile(sourcefile, targetfile)
            print("copy file {0} to {1}".format(sourcefile, targetfile))
    print("upload module {0} ...".format(module))
    runcommand('aws s3 sync "{0}"  s3://{1}/{2}/{3} --profile {4}'.format(s3maven, s3prefix, module,version,s3profile))
