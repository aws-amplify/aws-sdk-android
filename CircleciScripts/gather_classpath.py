from os import listdir

only_valid_names = lambda name: name[0] != '.'

def gather_classpath():
    paths = filter(only_valid_names, listdir("."))
    classpath = ""
    for path in paths:
        #print(path)
        if path[:3] != 'aws':
            continue
        if path[-4:] == 'test':
            continue
        if path[-9:] == 'testutils':
            continue
        f = open(path + "/build/tmp/androidJavadocs/javadoc.options", "r")
        lines = f.readlines()
        classpath += lines[0][12:-2] + ":"
        f.close()
    return classpath
