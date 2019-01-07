import xml.etree.ElementTree as ET 

from xml.parsers import expat

class DisableXmlNamespaces:
    def __enter__(self):
            self.oldcreate = expat.ParserCreate
            expat.ParserCreate = lambda encoding, sep: self.oldcreate(encoding, None)
    def __exit__(self, type, value, traceback):
            expat.ParserCreate = self.oldcreate

def update_pom(pomfile):
    with DisableXmlNamespaces():
        tree = ET.parse(pomfile) 
        root = tree.getroot() 
        e = root.findall("./properties")
        print(e)


update_pom("/Users/sdechunq/Documents/github/android/bk/aws-sdk-android/aws-android-sdk-mobile-client/pom.xml")



