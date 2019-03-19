function canbedeleted() {
	declare -a deletablebuckets=("transferservice-integration" "mobilehub" "java-get-object-integ-test" "integrationtest" "java-requester-pays-test" "normal-key-bucket-" "integ-test-bucket-" "java-get-object-integ-test-" "put-object-integ-test" "special-key-bucket-" "special-key-test-bucket-" "lifecycle-versioning-integration-test-" "bucket-replication-integ-test-" "list-objects-integ-test-" "java-s3-version-iteration-test-" "java-versioning-integ-test-" "java-sdk-mp-upload-" "java-storage-class-integ-test-" "java-sdk" "java-bucket-cross-origin-integ-test" "java-custom-bucket-policy-integ-test" "java-get-object-integ-test" "java-multiget-object-iteration-test" "amazon-s3-client-integ-test" "android-sdk-mp-upload" "java-sts-integ-test" "s3-low-level-presigned-url" "java-bucket-policy-integ-test" "copy-object-integ-test" "java-server-side-encryption-integ-test")
	for b in "${deletablebuckets[@]}"
	do 
	  if [[ $1 = $b* ]]
	  then
	    return 0
	  fi
	done
	return 1
}	
aws s3 ls --profile android_sdk_test |  awk '{print $3}' | while read bucket ; do
    if  canbedeleted $bucket; then 
    	echo "deleting bucket $bucket ..."
	    	aws s3 rb s3://$bucket --force  --profile android_sdk_test
    fi
done	