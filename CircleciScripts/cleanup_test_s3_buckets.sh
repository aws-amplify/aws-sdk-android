# Script to clean up s3 buckets created by android integration tests
# By convention, these buckets have names starting with "android-sdk-"

_test_bucket_prefix="android-sdk-"
aws s3 ls --profile android_sdk_test | awk '{print $3}' | while read bucket ; do
    if  [[ $bucket = $_test_bucket_prefix* ]]
    then
      echo "deleting bucket $bucket ..."
      aws s3 rb s3://$bucket --force  --profile android_sdk_test
    fi
done