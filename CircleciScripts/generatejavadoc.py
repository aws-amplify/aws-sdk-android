
import os
import sys
import demjson
import glob
from functions import runcommand

def getCommandline(dest, root, modules, packages, sourthfiles, subpackages,excludes, groups, otheroptions, otherargs):


    commandline = "javadoc " + \
                " -d '{0}'".format(dest) + \
                " -sourcepath  '{0}'".format(':'.join(map(lambda module: (root + "/" + module + "/src/main/java/"), modules)))  + \
                " " + ' '.join(packages)  +  \
                " " + ' '.join(map(lambda sourthfile:("'{0}'".format(sourthfile)), sourthfiles))  +  \
                " -subpackages '{0}' ".format(':'.join(subpackages)) + \
                " -exclude '{0}' ".format(':'.join(excludes)) + \
                " ".join(map(lambda group:(" -group '{0}' '{1}' ".format(group['title'], ':'.join(group['packages']))), groups)) +  \
                " ".join(map(lambda otheroption:(' -{0} "{1}" '.format(otheroption[0], otheroption[1])), otheroptions.items()))  + \
                " ".join(map(lambda otherarg: ('-' + otherarg), otherargs))
    return commandline 

def  getWords(pattern):
    firstPos = pattern.find(".")
    if firstPos == -1 :
        firstWord = pattern
    else:
        firstWord = pattern[0:firstPos]
    if firstPos == -1 :
        secondWord = ""
        leftWord = ""
    else:
        leftWord = pattern[firstPos+1 : len(pattern)]
        secondPos = pattern.find(".",firstPos + 1)
        if secondPos == -1 :
            secondWord = leftWord
        else:
            secondWord = pattern[firstPos+1 : secondPos]

    return (firstWord, secondWord, leftWord)

def getPackagesWithPattern(root, pattern):
    # ipdb.set_trace()  ######### Break Point ###########
    packages = set()
    (firstWord, secondWord, leftWord) = getWords(pattern)
    for folder in os.listdir(root):
        folderpath = os.path.join(root,folder)
        if os.path.isdir(folderpath):
            if firstWord == "**" :
                if leftWord == "" :
                    packages.add(folder)
                elif secondWord == folder:
                    (firstWord1, secondWord1, leftWord1) = getWords(leftWord)
                    if leftWord1 == "" :
                        packages.add(folder)
                    else :
                        subpackages = getPackagesWithPattern(folderpath, leftWord1)
                        for subpackage in subpackages:
                            packages.add(folder + "." + subpackage)
                else:
                    subpackages = getPackagesWithPattern(folderpath, pattern)
                    for subpackage in subpackages:
                        packages.add(folder + "." + subpackage)
            elif firstWord == folder  or firstWord == "*":
                if leftWord == "" :
                    packages.add(folder)
                else :
                    subpackages = getPackagesWithPattern(folderpath, leftWord)
                    for subpackage in subpackages:
                        packages.add(folder + "." + subpackage)
    return packages

def getAllPackagesWithPattern(root, modules, pattern):
    packages = set()
    sourthpaths = ""
    for module in modules:
        sourthpath = os.path.join(root, module ,  "src/main/java/")
        p = getPackagesWithPattern(sourthpath, pattern);
        packages.update(p);
    return packages
def getSourthFilesWithPattern(root, module, patterns):
    files = []
    sourthpaths = ""
    for module in modules:
        for pattern in patterns:
            sourthpath =os.path.join(root , module , "src/main/java/", pattern)
            files.extend(list(filter(lambda x:x.endswith('.html') or x.endswith('.java'), glob.glob(sourthpath))))

    return files

variableDict = {}
def resolveVaraibles(str):
    for k,v in variableDict.items():
        str = str.replace("${" + k + "}" , v)
    return str
def resolveList(list):
    newlist = []
    for e in list:
        newlist.append(resolveVaraibles(e))
    return newlist


def resolveDict(dict):
    for k in dict:
        dict[k] = resolveVaraibles(dict[k])      
    return dict

def printset(s):
    for e in s:
        print(e)

def getJARs(root, libs):

    jars=[]
    for path, subdirs, files in os.walk(os.path.join(root, libs)):
        for name in files:
            if (name.endswith(".jar")):
                jars.append(os.path.join(path, name))    
    return jars


def copylib(root, modules, target):
    for module in modules:
        sourthpath = os.path.join(root, module, "build/libs")
        if os.path.isdir(sourthpath):
            runcommand('cp {0}/*.jar "{1}"'.format(sourthpath, target))



####################
if (len(sys.argv) < 6  or sys.argv[1] == '-h' or sys.argv[1] == '--help') : 
    print("Usage: \r\n {0} <configuration json file path> <project root path> <destination path> <dependency libarary path> <sdkVersion>".format(sys.argv[0])) ;
    exit(1)

jsonfilename=sys.argv[1]
root = sys.argv[2]
dest = sys.argv[3]
libs = sys.argv[4]
sdkVersion = sys.argv[5] 
print("jsonfilename={0};root={1};dest={2};libs={3};sdkVersion={4}".format(jsonfilename,root,dest,libs,sdkVersion))

with open(jsonfilename, 'r') as jsonfile:
    jsonstring = jsonfile.read()
rootelement =  demjson.decode(jsonstring)
docConfigure =  rootelement["JavaDoc"]
variableDict = docConfigure["variables"] 



modules = resolveList(docConfigure["modules"])
packages = set()
# packagess = docConfigure["packages"]
# print(packagess)
for package in resolveList(docConfigure["packages"]):
    if package.find("*") == -1 :
        packages.add(package);
    else:
        packageset = getAllPackagesWithPattern(root, modules, package);
        packages.update(packageset) 

subpackages = set()
for subpackage in resolveList(docConfigure["subpackages"]):
    if subpackage.find("*") == -1 :
        subpackages.add(subpackage);
    else:
        subpackageset = getAllPackagesWithPattern(root, modules, subpackage);
        subpackages.update(subpackageset)

excludes = set()
for exclude in resolveList(docConfigure["excludes"]):
    if exclude.find("*") == -1 :
        excludes.add(exclude);
    else:
        excludepackageset = getAllPackagesWithPattern(root, modules, exclude);
        excludes.update(excludepackageset)

sourthfiles = getSourthFilesWithPattern(root, modules, docConfigure["sourthfiles"])
print("sourthfiles: ", sourthfiles)
groups = docConfigure["groups"]
for group in groups:
    group['packages'] = resolveList(group['packages'])

otheroptions = resolveDict(docConfigure["otheroptions"])
otherargs = resolveList(docConfigure["otherargs"])

jarlist = getJARs(root, libs)
if "CLASSPATH" in os.environ:
    jarlist.append(os.environ["CLASSPATH"])
os.environ["CLASSPATH"]=':'.join(jarlist)
os.environ["sdkVersion"]=sdkVersion
commandline = getCommandline(dest, root, modules, packages,sourthfiles, subpackages,excludes, groups, otheroptions, otherargs)
returncode = runcommand(commandline)
print("return code:" , returncode)
exit(returncode)
#print(commandline)
