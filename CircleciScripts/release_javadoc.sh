# Make sure the release_version was passed as an argument
if [ $# -eq 0 ]; then
    echo "Missing release_version argument."
    echo "Usage: CircleciScripts/release_javadoc.sh major.minor.patch"
    exit 1
fi

release_version=$1

# Make sure the git repo is not dirty, since this script switches branches and commits changes.
if [ "$(git status --porcelain)" ]; then
    echo "Your git repo is dirty.  Commit or revert all changes before running this script."
    exit 1
fi

# Make sure this script is run from the project root.
if [[ ! -d "CircleciScripts" ]]
then
    echo "No CircleciScripts folder found.  This script must be run from the project root."
    exit 1
fi  

# generate documents
projectRoot=$(pwd)
configFile="CircleciScripts/ReleaseConfiguration.json"
destinationPath="build/javadoc"
sdkPath="$HOME/Library/Android/sdk/platforms/android-29/"

## Make sure the Android SDK is installed at the expected place
if [[ ! -f "${sdkPath}android.jar" ]]
then
    echo "Failed to find Android library at ${sdkPath}android.jar."
    exit 1
fi  

python3 CircleciScripts/generate_javadoc.py "$configFile" "$projectRoot" "$destinationPath" "$sdkPath" "$release_version"

# check out gh-pages and preserve old document
git fetch
git branch -D gh-pages
git checkout gh-pages
git checkout main CircleciScripts/preserve_olddocument.sh
release_version=$release_version bash CircleciScripts/preserve_olddocument.sh

# copy new document
rm -rf docs/reference
mkdir -p docs/reference
cp -R build/javadoc/* docs/reference/

# check in documents
git add docs/reference
git rm --cached  preserve_olddocument.sh
git commit -m "AWS SDK for Android $release_version"
git push

# Add documentation tags to gh-pages
git tag -a "docs_v$release_version"  -m "Add documentation tags to version $release_version"
git push --tags

# Switch back to the main branch
git checkout main
git branch -D gh-pages
rm -rf docs
