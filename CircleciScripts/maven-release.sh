#!/bin/bash

set -e
export PATH=$JAVA_HOME/bin:$PATH
export PATH=$ANDROID_HOME/tools:$PATH
export PATH=$ANDROID_HOME/platform-tools:$PATH
export PATH=$ANDROID_HOME:$PATH



pom="pom.xml"
settings="CircleciScripts/mvhome/settings.xml"
localrepo="${HOME}/.m2" 
skipRemoteStaging=${SkipRemoteStaging}
autoReleaseAfterClose=${AutoReleaseAfterClose}
currentdir=$(pwd)
gpg_homedir="${currentdir}/gpghome"
sonatype_username=${SonatypeUsername}
sonatype_password=${SonatypePassword}
gpg_keyname=${GpgKeyname}
gpg_passphrase="${GpgPassphrase}"

echo "enviroment:     ;  $sonatype_password  ;   "

# Perm gen space is increased for maven command
MAVEN_OPTS="-Xms1024m -Xmx2048m -XX:PermSize=512m -XX:MaxPermSize=1024m"

gpg_keyname="D5503EEA"
gpg_passphrase="%3kE}\LPf-8|F'D"
sonatype_username="amazonwebservices"
sonatype_password="qI@ia573\$0An"

mvn clean deploy -X -e -Ppublishing \
    -f "$pom" \
    --settings="${currentdir}/CircleciScripts/mvnhome/settings.xml" \
    -Dmaven.repo.local="$localrepo" \
    -DperformRelease \
    -DskipRemoteStaging=false \
    -DautoReleaseAfterClose=false \
    -Dsonatype.username="$sonatype_username" \
    -Dsonatype.password="$sonatype_password" \
    -Dgpg.homedir="$gpg_homedir" \
    -Dgpg.keyname="$gpg_keyname" \
    -Dgpg.passphrase="$gpg_passphrase" \
    -DskipTests=true  