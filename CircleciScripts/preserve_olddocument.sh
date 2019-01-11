echo "release_version=$release_version"
previousversion=$(grep -o "AWS SDK for Android - [0-9]\+.[0-9]\+.[0-9]\+" docs/reference/allclasses-frame.html | grep -o "[0-9]\+.[0-9]\+.[0-9]\+")
echo "previousversion=$previousversion"
previousminorversion=$(echo  "$previousversion" | sed  -e 's|[0-9]*\.\([0-9]*\)\.[0-9]*$|\1|')
echo "previousminorversion=$previousminorversion"
if [ "$previousversion" == "$previousminorversion" ]
then
    previousminorversion=""
fi
echo "after verification previousminorversion=$previousminorversion"
currentminorversion=$(echo  "$release_version" | sed  -e 's|[0-9]*\.\([0-9]*\)\.[0-9]*$|\1|')
echo "currentminorversion=$currentminorversion"
if [ "$release_version" == "$currentminorversion" ]
then
    currentminorversion=""
fi
echo "after verification currentminorversion=$currentminorversion"
if  [ -z "$currentminorversion" ] 
then 
    echo "currentminorversion is empty"
    exit 1
fi
if  [ -z "$previousminorversion" ] 
then 
    echo "previousminorversion is empty"
    exit 1
fi
if [ "$previousminorversion" != "$currentminorversion" ] 
then
  echo "preserve current document to docs/$previousversion/reference"
  mkdir -p  "docs/$previousversion"
  mkdir -p "docs/$previousversion/reference"
  cp -R  docs/reference/* docs/$previousversion/reference
  git add "docs/$previousversion/reference"
else 
    echo "don't preserve old document"
fi
