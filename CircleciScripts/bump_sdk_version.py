from lxml import etree
from utils import getmodules
from utils import replacefiles
import sys
import os
def bump_pomxml(filename, newsdkversion):
    tree = etree.parse(filename)
    root = tree.getroot()
    namespaces = root.nsmap
    rootversion = root.find("version",namespaces)
    groupIdFilter = "groupId='com.amazonaws'"
    if rootversion is not None:
        rootversion.text = newsdkversion
    parent = root.find("./parent/[{0}]".format(groupIdFilter), namespaces)

    if parent is not None:
        parentversion = parent.find("version", namespaces)
        if parentversion is not None:
            parentversion.text = newsdkversion
    for dependency in root.findall("./dependencies/dependency[{0}]".format(groupIdFilter), namespaces):
        newversion = newsdkversion
        if dependency.find("artifactId",namespaces).text == "aws-android-sdk-cognitoidentityprovider-asf":
            continue
        dependencyVersion = dependency.find("version", namespaces)
        if dependencyVersion is not None:
            dependencyVersion.text = newversion
    tree.write(filename)



    

############ main ###################

root = sys.argv[1]
newsdkversion = sys.argv[2]
 

#replace version number in pom.xml
modules = getmodules(root)
modules.append('') # add root pom.xml
for module in modules:
    pomfile = os.path.join(root,module, "pom.xml")
    if os.path.isfile(pomfile):
        bump_pomxml(pomfile, newsdkversion)


#define which files whose version number should be replaced and how to replace
replaces = [
    {
        "match" : 'fabric-version=.*', 
        "replace" : 'fabric-version=[version]',
        "files" : [
            "aws-android-sdk-cognito/src/main/resources/fabric/com.amazonaws.aws-android-sdk-cognito.properties"
        ]       
    } ,
    {
        "match" : 'private static volatile String version = ".*";', 
        "replace" : 'private static volatile String version = "[version]";',
        "files" : [
            "aws-android-sdk-core/src/main/java/com/amazonaws/util/VersionInfoUtils.java"
        ]       
    } ,  
    {
        "match" : '".*", VersionInfoUtils.getVersion', 
        "replace" : '"[version]", VersionInfoUtils.getVersion',
        "files" : [
            "aws-android-sdk-core/src/test/java/com/amazonaws/util/VersionInfoUtilsTest.java"
        ]       
    } ,

]

#replace version number in other files
for replaceaction in replaces:
    replaceaction["replace"] = replaceaction["replace"].replace("[version]", newsdkversion)
replacefiles(root, replaces)
