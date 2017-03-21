package com.amazonaws.services.s3.model;

import org.junit.Test;

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
        new GeneratePresignedUrlRequest("bucket", "key").rejectIllegalArguments();
    }

}
