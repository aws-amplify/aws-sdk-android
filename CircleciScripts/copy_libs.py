import os
import sys
from functions import getmodules
from functions import runcommand
from shutil import copyfile

root = sys.argv[1]
dest = sys.argv[2]
if not os.path.exists(dest):
    os.makedirs(dest)
modules = getmodules(root)
for module in modules:
    print(module)
    jarfile = os.path.join(root,module,"build/libs/{0}.jar".format(module))
    if os.path.isfile(jarfile) :
        destfile = os.path.join(dest, "{0}.jar".format(module))
        copyfile(jarfile, destfile)
    else:
        aarfile = os.path.join(root,module,"build/outputs/aar/{0}-release.aar".format(module))
        if os.path.isfile(aarfile) :
            destfile = os.path.join(dest, "{0}.aar".format(module))
            copyfile(aarfile, destfile)
            print("copied {0} to {1}".format(aarfile, destfile))
        else:
            print("Did not find build result for {0}".format(module))
            exit(1)

