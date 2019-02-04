from functions import replacefiles
import demjson
import sys

root = sys.argv[1]
replacesjson = sys.argv[2]

with open(replacesjson, 'r') as jsonfile:
	jsonstring = jsonfile.read()
rootelement =  demjson.decode(jsonstring)
replaces =  rootelement["replaces"]
print(replaces)
replacefiles(root, replaces)
