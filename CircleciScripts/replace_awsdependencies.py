import os
import sys

START_FLAG = "//BEGIN AWS DEPENDENCIES"
END_FLAG = "//END AWS DEPENDENCIES"

originfile = sys.argv[1]
replacewords = sys.argv[2]
tempfile=originfile + 'bak'
with open(originfile) as source_file:  
    line = source_file.readline()
    startreplace = False
    with open(tempfile, 'a') as target_file:
        while line:
            if  START_FLAG in line :
                if startreplace:
                    exit(1)
                startreplace = True;
                target_file.write("{0}\n".format(replacewords))
                line = source_file.readline()
                continue
            if END_FLAG in line:
                if not startreplace:
                    exit(1)
                startreplace = False
                line = source_file.readline()
                continue               
            if startreplace :
                line = source_file.readline()
                continue
            target_file.write("{0}".format(line))
            line = source_file.readline()
            print(line)


os.remove(originfile)
os.rename(tempfile, originfile)