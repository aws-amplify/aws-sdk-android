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
    public void setup() {
        setUpCredentials();
        s3 = new AmazonS3Client(credentials, Region.getRegion(Regions.US_WEST_1));
    }

    @Test
    public void testCleanup() {
        final List<Bucket> buckets = s3.listBuckets();
        for (final Bucket bucket : buckets) {
            final String bucket_name = bucket.getName();
            if (bucket_name.startsWith("android-sdk-")) {
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
