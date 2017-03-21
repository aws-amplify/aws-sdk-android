package com.amazonaws.services.s3.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.metrics.RequestMetricCollector;

import org.junit.Test;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PutObjectRequestTest {

    @Test
    public void clonePutObjectRequest() {
        final File file = new File("somefile");
        doTestClone(new PutObjectRequest("bucket", "key", file), "bucket", "key", file);
    }

    @Test
    public void cloneEncryptedPutObjectRequest() {
        final File file = new File("somefile");
        // null material description

        EncryptedPutObjectRequest clone = doTestClone(
                new EncryptedPutObjectRequest("bucket", "key", file),
                "bucket", "key", file);
        assertNull(clone.getMaterialsDescription());

        // non-null material description
        Map<String,String> md = new HashMap<String, String>();
        md.put("foo", "bar");
        md = Collections.unmodifiableMap(md);
        clone = doTestClone(
                new EncryptedPutObjectRequest("bucket", "key", file).withMaterialsDescription(md),
                "bucket", "key", file);
        assertEquals(clone.getMaterialsDescription(), md);
        assertNotSame(clone.getMaterialsDescription(), md);
    }


    /**
     * Returns the cloned object.
     */
    private <T extends PutObjectRequest> T doTestClone(T from, String bucket, String key,
            File file) {
        assertNull(from.getAccessControlList());
        assertEquals("bucket", from.getBucketName());
        assertNull(from.getCannedAcl());
        assertEquals(file, from.getFile());
        assertNull(from.getInputStream());
        assertNull(from.getRedirectLocation());
        assertNull(from.getStorageClass());

        // Fill it up - the base
        final ProgressListener listener = new ProgressListener() {
            @Override
            public void progressChanged(ProgressEvent progressEvent) {
            }
        };
        final AWSCredentials credentials = new BasicAWSCredentials("accesskey",
                "accessid");
        final RequestMetricCollector collector = new RequestMetricCollector() {
            @Override
            public void collectMetrics(Request<?> request, Response<?> response) {
            }
        };

        from.setGeneralProgressListener(listener);
        from.setRequestCredentials(credentials);
        from.setRequestMetricCollector(collector);

        final AccessControlList accessControlList = new AccessControlList();
        final ObjectMetadata metadata = new ObjectMetadata();
        metadata.addUserMetadata("um_k1", "um_v1");
        metadata.addUserMetadata("um_k2", "um_v2");
        final SSECustomerKey sseKey = new SSECustomerKey(new byte[32]);

        // Fill it up - the rest
        from.setAccessControlList(accessControlList);
        from.setCannedAcl(CannedAccessControlList.Private);
        from.setInputStream(System.in);
        from.setMetadata(metadata);
        from.setSSECustomerKey(sseKey);
        from.setRedirectLocation("redirectLocation");
        from.setStorageClass(StorageClass.Standard);

        assertSame(metadata, from.getMetadata());

        // Clone it
        final T to = (T) from.clone();

        // Verify
        assertSame(accessControlList, to.getAccessControlList());
        assertSame(CannedAccessControlList.Private, to.getCannedAcl());
        assertSame(System.in, to.getInputStream());

        assertNotSame(from.getMetadata(), to.getMetadata());
        final ObjectMetadata toOMD = to.getMetadata();
        assertEquals("um_v1", toOMD.getUserMetaDataOf("um_k1"));
        assertEquals("um_v2", toOMD.getUserMetaDataOf("um_k2"));

        assertSame(sseKey, to.getSSECustomerKey());
        assertEquals("redirectLocation", to.getRedirectLocation());
        assertEquals(StorageClass.Standard.toString(), to.getStorageClass());

        return to;
    }
}
