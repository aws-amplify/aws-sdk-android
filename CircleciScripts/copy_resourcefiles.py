import os
import sys
from functions import runcommand
from shutil import copyfile

root = sys.argv[1]
dest = sys.argv[2]
files = {
"LICENSE.AMAZON.txt":"LICENSE.AMAZON.txt",
"LICENSE.txt":"LICENSE.txt",
"NOTICE.txt":"NOTICE.txt",
"README.md":"README.md",
"CircleciScripts/source.html":"src/source.html",
"LICENSE.APACHE.txt":"LICENSE.APACHE.txt",
"Logging.html":"Logging.html",
"Proguard.html":"Proguard.html",
"CircleciScripts/samples.html":"samples/samples.html"

}

for source,target in files.items(): 
    s = os.path.join(root, source)
    t = os.path.join(dest, target)
    runcommand("mkdir -p '{0}'".format(os.path.dirname(t)))
    copyfile(s,t)

