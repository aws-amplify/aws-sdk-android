package com.amazonaws.services.s3;

import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.ListVersionsRequest;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.amazonaws.services.s3.model.S3VersionSummary;
import com.amazonaws.services.s3.model.VersionListing;
import com.amazonaws.testutils.AWSTestBase;

import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class CleanupBucketIntegrationTests extends AWSTestBase {

    private AmazonS3 s3;

    @Before
    public void setup() throws FileNotFoundException, IOException {
        setUpCredentials();
        s3 = new AmazonS3Client(credentials);
        s3.setRegion(Region.getRegion(Regions.US_WEST_1));
    }

    @Test
    public void testCleanup() {
        final List<Bucket> buckets = s3.listBuckets();
        for (final Bucket bucket : buckets) {
            if (bucket.getName().startsWith("transferservice-integration")
                    || bucket.getName().contains("mobilehub")
                    || bucket.getName().startsWith("java-get-object-integ-test")
                    || bucket.getName().contains("integrationtest")
                    || bucket.getName().contains("java-requester-pays-test")
                    || bucket.getName().contains("normal-key-bucket-")
                    || bucket.getName().contains("integ-test-bucket-")
                    || bucket.getName().contains("java-get-object-integ-test-")
                    || bucket.getName().contains("put-object-integ-test")
                    || bucket.getName().contains("special-key-bucket-")
                    || bucket.getName().contains("special-key-test-bucket-")
                    || bucket.getName().contains("lifecycle-versioning-integration-test-")
                    || bucket.getName().contains("bucket-replication-integ-test-")
                    || bucket.getName().contains("list-objects-integ-test-")
                    || bucket.getName().startsWith("java-s3-version-iteration-test-")
                    || bucket.getName().startsWith("java-versioning-integ-test-")
                    || bucket.getName().startsWith("java-sdk-mp-upload-")
                    || bucket.getName().startsWith("java-storage-class-integ-test-")
                    || bucket.getName().startsWith("java-sdk")
                    || bucket.getName().startsWith("java-bucket-cross-origin-integ-test")
                    || bucket.getName().startsWith("java-custom-bucket-policy-integ-test")
                    || bucket.getName().startsWith("java-get-object-integ-test")
                    || bucket.getName().startsWith("java-multiget-object-iteration-test")
                    || bucket.getName().startsWith("amazon-s3-client-integ-test")
                    || bucket.getName().startsWith("android-sdk-mp-upload")
                    || bucket.getName().startsWith("java-sts-integ-test")
                    || bucket.getName().startsWith("s3-low-level-presigned-url")
                    || bucket.getName().startsWith("java-bucket-policy-integ-test")
                    || bucket.getName().startsWith("copy-object-integ-test")
                    || bucket.getName().startsWith("java-server-side-encryption-integ-test")) {

                final String bucket_name = bucket.getName();
                try {

                    ObjectListing object_listing = s3.listObjects(bucket_name);
                    while (true) {
                        for (final Iterator<?> iterator = object_listing.getObjectSummaries()
                                .iterator(); iterator.hasNext();) {
                            final S3ObjectSummary summary = (S3ObjectSummary) iterator.next();
                            s3.deleteObject(bucket_name, summary.getKey());
                        }

                        // more object_listing to retrieve?
                        if (object_listing.isTruncated()) {
                            object_listing = s3.listNextBatchOfObjects(object_listing);
                        } else {
                            break;
                        }
                    }

                    System.out.println(" - removing versions from bucket");
                    VersionListing version_listing = s3.listVersions(
                            new ListVersionsRequest().withBucketName(bucket_name));
                    while (true) {
                        for (final Iterator<?> iterator = version_listing.getVersionSummaries()
                                .iterator(); iterator.hasNext();) {
                            final S3VersionSummary vs = (S3VersionSummary) iterator.next();
                            s3.deleteVersion(bucket_name, vs.getKey(), vs.getVersionId());
                        }

                        if (version_listing.isTruncated()) {
                            version_listing = s3.listNextBatchOfVersions(
                                    version_listing);
                        } else {
                            break;
                        }
                    }

                    System.out.println(" OK, bucket ready to delete!");
                    s3.deleteBucket(bucket_name);
                } catch (final Exception e) {
                    System.out.println("cannot delete bucket " + bucket_name);
                }
            }
        }
    }
}
