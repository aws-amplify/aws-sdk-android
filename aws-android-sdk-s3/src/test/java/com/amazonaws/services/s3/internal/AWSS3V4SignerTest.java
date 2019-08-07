/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.services.s3.internal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.HeadBucketRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.transform.RequestXmlFactory;
import com.amazonaws.util.StringUtils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AWSS3V4SignerTest {

    @Test
    public void testSignPutObject() throws URISyntaxException {
        final AWSS3V4Signer signer = new S3SignerWithDateOverride(new Date(1431115356859L));
        // THESE ARE BOGUS CREDENTIALS
        final AWSCredentials credentials = new BasicAWSCredentials(
                "AKIAJd4scjDDmxXZTESTGOZQ", "LYd/ad4scjDDmxXZTESTtRz7xdOM1SiD6");

        final ByteArrayInputStream bais = new
                ByteArrayInputStream("content".getBytes(StringUtils.UTF8));
        final ObjectMetadata om = new ObjectMetadata();
        om.setContentLength("content".getBytes(StringUtils.UTF8).length);
        final PutObjectRequest por = new PutObjectRequest("test-bucket123456",
                "key", bais, om);
        final Request<?> pr = new DefaultRequest(por, Constants.S3_SERVICE_DISPLAY_NAME);
        pr.setContent(bais);
        pr.setResourcePath("key");
        pr.setHttpMethod(HttpMethodName.PUT);
        pr.addHeader(Headers.CONTENT_LENGTH, String.valueOf(bais.available()));
        pr.setEndpoint(new
                URI("https://test-bucket123456.s3-us-west-2.amazonaws.com"));
        pr.addHeader("Host", "test-bucket123456.s3-us-west-2.amazonaws.com");
        signer.sign(pr, credentials);
        assertEquals(getSignature(pr),
                "e0a8ac165c54dc1fc3dd987f5e00b44f1b91f3c63b05ee642432e1f3c7286d69");
    }

    @Test
    public void testSignGetObject() throws URISyntaxException {
        final AWSS3V4Signer signer = new S3SignerWithDateOverride(new Date(1431114076667L));
        // THESE ARE BOGUS CREDENTIALS
        final AWSCredentials credentials = new BasicAWSCredentials(
                "AKIAJd4scjDDmxXZTESTGOZQ", "LYd/ad4scjDDmxXZTESTtRz7xdOM1SiD6");

        // Simulates getObject
        final GetObjectRequest getRequest = new GetObjectRequest("test-bucket123456", "key");
        final Request<?> gr = new DefaultRequest(getRequest, Constants.S3_SERVICE_DISPLAY_NAME);
        gr.setEndpoint(new URI("https://test-bucket123456.s3-us-west-2.amazonaws.com"));
        gr.setHttpMethod(HttpMethodName.GET);
        gr.setResourcePath("key");
        gr.addHeader("Host", "test-bucket123456.s3-us-west-2.amazonaws.com");
        signer.sign(gr, credentials);

        assertEquals(getSignature(gr),
                "7f8a09e22f7d2899e8b41857516d16ecf10680627c35693958e6e205fda8419e");
    }

    @Test
    public void testSignMultipartUploads() throws URISyntaxException {
        final AWSS3V4Signer signer = new S3SignerWithDateOverride(new Date(1431114076800L));
        // THESE ARE BOGUS CREDENTIALS
        final AWSCredentials credentials = new BasicAWSCredentials(
                "AKIAJd4scjDDmxXZTESTGOZQ", "LYd/ad4scjDDmxXZTESTtRz7xdOM1SiD6");

        // Simulates initiateMultipartUpload
        final InitiateMultipartUploadRequest imur = new InitiateMultipartUploadRequest(
                "test-bucket123456", "multi-key");
        final Request<?> ir = new DefaultRequest(imur, Constants.S3_SERVICE_DISPLAY_NAME);
        ir.setEndpoint(new URI("https://test-bucket123456.s3-us-west-2.amazonaws.com"));
        ir.addHeader("Host", "test-bucket123456.s3-us-west-2.amazonaws.com");
        ir.addHeader(Headers.CONTENT_LENGTH, String.valueOf(0));
        ir.setResourcePath("multi-key");
        ir.addParameter("uploads", null);
        ir.setContent(new ByteArrayInputStream(new byte[0]));
        signer.sign(ir, credentials);

        assertEquals(getSignature(ir),
                "53ed8e3d923f55ae6f46974083fc6a452467ca3aac755d67a8444866aa0ecfa7");

        // Simulates uploadPart
        final ByteArrayInputStream multipartContent = new ByteArrayInputStream(
                "multipartContent".getBytes(StringUtils.UTF8));
        final UploadPartRequest upr = new UploadPartRequest();
        final String uploadId = "6E1pXqay7WGHDsWKZ2vuGlba548bNcLNnwTyTnoxiOFQ6S9hejT_dhBpvA0jLAD04oSLOy6R7hrsFFy00O15MoLYD0heUeOn6SglTE6SKWA-";
        upr.withUploadId(uploadId).withPartNumber(1)
                .withPartSize("multipartContent".getBytes(StringUtils.UTF8).length)
                .withBucketName("test-bucket123456")
                .withKey("multi-key")
                .withInputStream(multipartContent);
        final Request<?> ur = new DefaultRequest(upr, Constants.S3_SERVICE_DISPLAY_NAME);
        ur.addHeader(Headers.CONTENT_LENGTH,
                String.valueOf("multipartContent".getBytes(StringUtils.UTF8).length));
        ur.setEndpoint(new URI("https://test-bucket123456.s3-us-west-2.amazonaws.com"));
        ur.addHeader("Host", "test-bucket123456.s3-us-west-2.amazonaws.com");
        ur.setResourcePath("multi-key");
        ur.addParameter("partNumber", "1");
        ur.addParameter(
                "uploadId",
                "6E1pXqay7WGHDsWKZ2vuGlba548bNcLNnwTyTnoxiOFQ6S9hejT_dhBpvA0jLAD04oSLOy6R7hrsFFy00O15MoLYD0heUeOn6SglTE6SKWA-");
        ur.setHttpMethod(HttpMethodName.PUT);
        signer.sign(ur, credentials);
        assertEquals(getSignature(ur),
                "e7c969db60efd061381cea3c16f9906ffa521967fa45a62104b535c89928f68c");
        // Simulates completemultipartupload
        final List<PartETag> partETags = new ArrayList<PartETag>();
        partETags.add(new PartETag(1, "e6f34498060d371c4f39da1eaadceacb"));
        final CompleteMultipartUploadRequest cmur = new CompleteMultipartUploadRequest(
                "test-bucket123456", "multi-key", uploadId, partETags);
        final Request<?> cr = new DefaultRequest(cmur, Constants.S3_SERVICE_DISPLAY_NAME);
        cr.setEndpoint(new URI("https://test-bucket123456.s3-us-west-2.amazonaws.com"));
        cr.addHeader("Host", "test-bucket123456.s3-us-west-2.amazonaws.com");
        final byte[] xml = RequestXmlFactory.convertToXmlByteArray(partETags);
        cr.setContent(new ByteArrayInputStream(xml));
        cr.addHeader("Content-Length", String.valueOf(xml.length));
        cr.addParameter(
                "uploadId",
                "6E1pXqay7WGHDsWKZ2vuGlba548bNcLNnwTyTnoxiOFQ6S9hejT_dhBpvA0jLAD04oSLOy6R7hrsFFy00O15MoLYD0heUeOn6SglTE6SKWA-");

        cr.setResourcePath("multi-key");
        signer.sign(cr, credentials);

        assertEquals(getSignature(cr),
                "dc67ca67af0a19b9d70f515879631a287bc8bb18499004420aa294b8beb1b8ec");
    }

    @Test
    public void testHeadBucket() throws URISyntaxException {
        final AWSS3V4Signer signer = new S3SignerWithDateOverride(new Date(1431114075631L));
        // THESE ARE BOGUS CREDENTIALS
        final AWSCredentials credentials = new BasicAWSCredentials(
                "AKIAJd4scjDDmxXZTESTGOZQ", "LYd/ad4scjDDmxXZTESTtRz7xdOM1SiD6");

        // Simulates s3.doesBucketExist
        final Request<?> hr = new DefaultRequest(new HeadBucketRequest("test-bucket123456"),
                Constants.S3_SERVICE_DISPLAY_NAME);
        hr.setHttpMethod(HttpMethodName.HEAD);
        hr.setEndpoint(new URI("https://test-bucket123456.s3-us-west-2.amazonaws.com"));
        hr.addHeader("Host", "test-bucket123456.s3-us-west-2.amazonaws.com");
        signer.sign(hr, credentials);
        assertEquals(getSignature(hr),
                "fc4922636f1a748e0d2c197b127180c2ae7f5fc1e4a0be33732431f58f6eac51");

    }

    // Gets the Signature from the authorizaiton header
    private String getSignature(Request<?> request) {
        final String auth = request.getHeaders().get("Authorization");
        final int index = auth.indexOf("Signature=") + 10;
        final int endIndex = auth.indexOf(" ", index);
        if (endIndex != -1) {
            return auth.substring(index, endIndex);
        } else {
            return auth.substring(index);
        }
    }

    public void testGetContentLengthMarkNotSupported() throws IOException {
        final Request<?> request = new DefaultRequest<Void>("service");
        // Content doesn't support mark
        request.setContent(new MockInputStream(16, false));
        // Should throw exception as mark not supported
        AWSS3V4Signer.getContentLength(request);
    }

    @Test
    public void testGetContentLength() throws IOException {
        final long len = 5 * Constants.MB;
        final Request<?> request = new DefaultRequest<Void>("service");
        final InputStream is = new MockInputStream(len, true);
        request.setContent(is);
        assertTrue("same length", len == AWSS3V4Signer.getContentLength(request));
        assertTrue("works fine after reset", len == AWSS3V4Signer.getContentLength(request));
        is.close();
    }

    static class S3SignerWithDateOverride extends AWSS3V4Signer {

        private S3SignerWithDateOverride(Date overrideDate) {
            super();
            this.overriddenDate = overrideDate;
        }
    }

    /**
     * A simple input stream class that allows you to specify the content length
     * as well as whether it supports mark.
     */
    static class MockInputStream extends InputStream {

        private final long len;
        private final boolean markSupported;
        private long count;

        public MockInputStream(long len, boolean markSupported) {
            this.len = len;
            this.markSupported = markSupported;
        }

        @Override
        public int read() throws IOException {
            count++;
            return count <= len ? (int) (count & 0xff) : -1;
        }

        @Override
        public boolean markSupported() {
            return markSupported;
        }

        @Override
        public synchronized void reset() throws IOException {
            if (markSupported) {
                count = 0;
            } else {
                super.reset();
            }
        }
    }
}
