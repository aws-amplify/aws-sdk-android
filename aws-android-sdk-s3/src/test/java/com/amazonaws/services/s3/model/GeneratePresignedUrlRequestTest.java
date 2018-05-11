package com.amazonaws.services.s3.model;

import com.amazonaws.HttpMethod;
import com.amazonaws.services.s3.model.GeneratePresignedUrlRequest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratePresignedUrlRequestTest {

    @Test
    public void nullKey() {
        new GeneratePresignedUrlRequest("bucket", null).rejectIllegalArguments();
    }

    @Test(expected=IllegalArgumentException.class)
    public void nullBucket() {
        new GeneratePresignedUrlRequest(null, "key").rejectIllegalArguments();
    }

    @Test(expected=IllegalArgumentException.class)
    public void nullMethod() {
        new GeneratePresignedUrlRequest("bucket", "key").withMethod(null)
                .rejectIllegalArguments();
    }

    @Test
    public void defaultGetMethod() {
    	    final GeneratePresignedUrlRequest generatePresignedUrlRequest 
    	        = new GeneratePresignedUrlRequest("bucket", "key");
    	    generatePresignedUrlRequest.rejectIllegalArguments();
    	    assertEquals(generatePresignedUrlRequest.getBucketName(), "bucket");
    	    assertEquals(generatePresignedUrlRequest.getKey(), "key");
    	    assertEquals(generatePresignedUrlRequest.getMethod(), HttpMethod.GET);
    }
    
    @Test
    public void putMethod() {
    	    final GeneratePresignedUrlRequest generatePresignedUrlRequest
            = new GeneratePresignedUrlRequest("bucket", "key", HttpMethod.PUT);
    	    assertEquals(generatePresignedUrlRequest.getBucketName(), "bucket");
    	    assertEquals(generatePresignedUrlRequest.getKey(), "key");
    	    assertEquals(generatePresignedUrlRequest.getMethod(), HttpMethod.PUT);
    }

    @Test
    public void testCustomQueryParameters() {
    	    final GeneratePresignedUrlRequest generatePresignedUrlRequest
            = new GeneratePresignedUrlRequest("bucket", "key", HttpMethod.PUT);
    	    
    	    assertEquals(generatePresignedUrlRequest.getBucketName(), "bucket");
    	    assertEquals(generatePresignedUrlRequest.getKey(), "key");
    	    assertEquals(generatePresignedUrlRequest.getMethod(), HttpMethod.PUT);
    	    assertNull(generatePresignedUrlRequest.getCustomQueryParameters());
    	    
    	    generatePresignedUrlRequest.addCustomQueryParameter("param1", "value1");
    	    generatePresignedUrlRequest.addCustomQueryParameter("param2", "value2");
    	    generatePresignedUrlRequest.addCustomQueryParameter("param3", "value3");
    	    
    	    assert(generatePresignedUrlRequest.getCustomQueryParameters().size() == 3);
    }
    
    @Test
    public void testVersionId() {
    	    final GeneratePresignedUrlRequest generatePresignedUrlRequest
            = new GeneratePresignedUrlRequest("bucket", "key")
                .withMethod(HttpMethod.PUT)
                .withVersionId("123")
                .withZeroByteContent(false);
    	    
    	    assert(generatePresignedUrlRequest.getVersionId() == "123");
    }
}
