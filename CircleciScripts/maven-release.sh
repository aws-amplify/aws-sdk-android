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
gpg_homedir="${HOME}/code/gpghome"
sonatype_username=${SonatypeUsername}
sonatype_password=${SonatypePassword}
gpg_keyname=${GpgKeyname}
gpg_passphrase="${GpgPassphrase}"
echo "gpg_passphrase:$gpg_passphrase"

# Perm gen space is increased for maven command
MAVEN_OPTS="-Xms2048m -Xmx2048m -XX:PermSize=2048m -XX:MaxPermSize=2048m"

mvn clean deploy -X -e -Ppublishing \
    -f "$pom" \
    --settings="CircleciScripts/mvnhome/settings.xml" \
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
    

