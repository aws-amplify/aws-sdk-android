import os
import sys
from functions import runcommand
from shutil import copyfile

files = {
"LICENSE.AMAZON.txt":"LICENSE.AMAZON.txt",
"LICENSE.txt":"LICENSE.txt",
"NOTICE.txt":"NOTICE.txt",
"README.md":"README.md",
"CircleciScripts/source.htmlcat":"src/source.htmlcat",
"LICENSE.APACHE.txt":"LICENSE.APACHE.txt",
"Logging.html":"Logging.html",
"Proguard.htm":"Proguard.htm",
"CircleciScripts/samples.html":"samples/samples.html"

}

for source,target in files.items: 
	s = os.path.join(root, source)
	t = os.path.join(root,t)
	runcommand("mkdir -p '{0}'".format(os.path.dirname(t)))
	rn = copyfile(s,t)
	if rn != 0 :
		print("failed to copy {0} to {1}".format(s,t))
		exit(1)
