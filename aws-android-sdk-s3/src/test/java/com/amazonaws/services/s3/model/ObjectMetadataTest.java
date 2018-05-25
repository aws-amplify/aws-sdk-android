package com.amazonaws.services.s3.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.amazonaws.services.s3.Headers;

public class ObjectMetadataTest {

    @Test
    public void cloneEmpty() {
        ObjectMetadata from = new ObjectMetadata();
        for (int i = 0; i < 2; i++) {
            assertNull(from.getCacheControl());
            assertNull(from.getContentDisposition());
            assertNull(from.getContentEncoding());
            assertTrue(0 == from.getContentLength());
            assertNull(from.getContentMD5());
            assertNull(from.getContentType());
            assertNull(from.getETag());
            assertNull(from.getExpirationTime());
            assertNull(from.getExpirationTimeRuleId());
            assertNull(from.getHttpExpiresDate());
            assertTrue(0 == from.getInstanceLength());
            assertNull(from.getLastModified());
            assertNull(from.getOngoingRestore());
            assertTrue(from.getRawMetadata().size() == 0);
            assertNull(from.getRestoreExpirationTime());
            assertNull(from.getSSEAlgorithm());
            assertNull(from.getSSECustomerAlgorithm());
            assertNull(from.getSSECustomerKeyMd5());
            assertTrue(0 == from.getUserMetadata().size());
            assertNull(from.getVersionId());
            assertNull(from.getStorageClass());
            // Clone an empty instance
            from = from.clone();
        }
    }

    @Test
    public void cloneNonEmpty() {
        Map<String, String> userMetadata = new HashMap<String, String>();
        userMetadata.put("u1", "uv1");
        userMetadata.put("u2", "uv2");
        Date expTime = new Date();
        Date httpExpiresDate = new Date(expTime.getTime() + 1234);
        Date lastModified = new Date(expTime.getTime() - 1234);
        Date restoreExpirationTime = new Date(expTime.getTime() + 5678);

        // Fill it up
        ObjectMetadata from = new ObjectMetadata();
        from.setCacheControl("cachecontrol");
        from.setContentDisposition("contentDisposition");
        from.setContentEncoding("contentEncoding");
        from.setContentLength(1234);
        from.setContentMD5("md5");
        from.setContentType("contentType");
        from.setExpirationTime(expTime);
        from.setExpirationTimeRuleId("expirationTimeRuleId");
        from.setHeader("k1", "v1");
        from.setHeader("k2", "v2");
        from.setHttpExpiresDate(httpExpiresDate);
        from.setLastModified(lastModified);
        from.setOngoingRestore(true);
        from.setRestoreExpirationTime(restoreExpirationTime);
        from.setSSEAlgorithm("ssealgo");
        from.setSSECustomerKeyMd5("sseCustKeyMd5");
        from.setSSECustomerAlgorithm("SSECustomerAlgorithm");
        from.setUserMetadata(userMetadata);
        from.setHeader(Headers.CONTENT_RANGE, "/9999");
        from.setHeader(Headers.S3_VERSION_ID, "versionid");
        from.setHeader(Headers.ETAG, "etag");
        from.setHeader(Headers.STORAGE_CLASS, StorageClass.ReducedRedundancy.toString());

        assertEquals("cachecontrol", from.getCacheControl());
        assertEquals("contentDisposition", from.getContentDisposition());
        assertEquals("contentEncoding", from.getContentEncoding());
        assertTrue(1234 == from.getContentLength());
        assertEquals("md5", from.getContentMD5());
        assertEquals("contentType", from.getContentType());
        assertEquals("etag", from.getETag());

        assertEquals(expTime, from.getExpirationTime());
        assertNotSame(expTime, from.getExpirationTime());

        assertEquals("expirationTimeRuleId", from.getExpirationTimeRuleId());

        assertEquals(httpExpiresDate, from.getHttpExpiresDate());
        assertNotSame(httpExpiresDate, from.getHttpExpiresDate());

        assertTrue(9999 == from.getInstanceLength());

        assertEquals(lastModified, from.getLastModified());
        assertNotSame(lastModified, from.getLastModified());

        assertTrue(from.getOngoingRestore());
        assertTrue(from.getRawMetadata().size() > 0);
        assertEquals(restoreExpirationTime, from.getRestoreExpirationTime());
        assertEquals("ssealgo", from.getSSEAlgorithm());
        assertEquals("SSECustomerAlgorithm", from.getSSECustomerAlgorithm());
        assertEquals("sseCustKeyMd5", from.getSSECustomerKeyMd5());
        assertTrue(2 == from.getUserMetadata().size());
        assertEquals("versionid", from.getVersionId());
        assertEquals(from.getStorageClass(), StorageClass.ReducedRedundancy.toString());

        // Clone it
        ObjectMetadata to = from.clone();
        assertEquals("cachecontrol", to.getCacheControl());
        assertEquals("contentDisposition", to.getContentDisposition());
        assertEquals("contentEncoding", to.getContentEncoding());
        assertTrue(1234 == to.getContentLength());
        assertEquals("md5", to.getContentMD5());
        assertEquals("contentType", to.getContentType());
        assertEquals("etag", to.getETag());
        assertEquals(expTime, to.getExpirationTime());
        assertEquals("expirationTimeRuleId", to.getExpirationTimeRuleId());
        assertEquals(httpExpiresDate, to.getHttpExpiresDate());
        assertTrue(9999 == to.getInstanceLength());
        assertEquals(lastModified, to.getLastModified());
        assertTrue(to.getOngoingRestore());
        
        assertEquals(from.getRawMetadata(), to.getRawMetadata());
        assertNotSame(from.getRawMetadata(), to.getRawMetadata());
        
        assertEquals(restoreExpirationTime, to.getRestoreExpirationTime());
        assertEquals("ssealgo", to.getSSEAlgorithm());
        assertEquals("SSECustomerAlgorithm", to.getSSECustomerAlgorithm());
        assertEquals("sseCustKeyMd5", to.getSSECustomerKeyMd5());

        assertEquals(from.getUserMetadata(), to.getUserMetadata());
        assertNotSame(from.getUserMetadata(), to.getUserMetadata());
        
        assertEquals("versionid", to.getVersionId());
        assertEquals(from.getStorageClass(), to.getStorageClass());
    }
}
