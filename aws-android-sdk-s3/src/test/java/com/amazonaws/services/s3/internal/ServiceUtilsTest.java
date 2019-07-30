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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.S3ClientOptions;
import com.amazonaws.services.s3.internal.ServiceUtils.RetryableS3DownloadTask;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.SSEAlgorithm;
import com.amazonaws.services.s3.model.SSECustomerKey;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.util.Base64;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;

import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.SocketException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceUtilsTest {

    private final DateTimeZone GMT = new FixedDateTimeZone("GMT", "GMT", 0, 0);
    private final DateTimeFormatter iso8601DateFormat = ISODateTimeFormat.dateTime().withZone(GMT);
    private final DateTimeFormatter alternateIso8601DateFormat = DateTimeFormat
            .forPattern(DateUtils.ALTERNATE_ISO8601_DATE_PATTERN).withZone(GMT);

    @Test
    public void testConvertRequestToURL() throws URISyntaxException, MalformedURLException {
        /**
         * Request which generates this presigned URL Request: GET
         * https://test-bucket1234.s3.amazonaws.com /TestFile.txt Parameters:
         * (AWSAccessKeyId: TESTJDND73Z2EOXMTEST, Expires: 1430878121,
         * Signature: SxXP9iKzsnIeCjYBKFS8iW/9Bus=, ) 05-05 18:08:41.265:
         * I/System.out(28304): URL:
         * https://test-bucket1234.s3.amazonaws.com/TestFile
         * .txt?AWSAccessKeyId=TESTJDND73Z2EOXMTEST
         * &Expires=1430878121&Signature=SxXP9iKzsnIeCjYBKFS8iW%2F9Bus%3D
         */
        final Request<String> req = new DefaultRequest<String>("s3");
        req.setHttpMethod(HttpMethodName.GET);
        req.setEndpoint(new URI("https://test-bucket1234.s3.amazonaws.com"));
        req.setResourcePath("/TestFile.txt");
        req.withParameter("AWSAccessKeyId", "TESTJDND73Z2EOXMTEST");
        req.withParameter("Expires", "1430878121");
        req.withParameter("Signature", "SxXP9iKzsnIeCjYBKFS8iW/9Bus=");

        final URL craftedURL = ServiceUtils.convertRequestToUrl(req, true);
        assertEquals(
                new URL(
                        "https://test-bucket1234.s3.amazonaws.com/TestFile.txt?AWSAccessKeyId=TESTJDND73Z2EOXMTEST&Expires=1430878121&Signature=SxXP9iKzsnIeCjYBKFS8iW%2F9Bus%3D"),
                craftedURL);

        final URL url = ServiceUtils.convertRequestToUrl(req);
        assertEquals(
                new URL(
                        "https://test-bucket1234.s3.amazonaws.com/%2FTestFile.txt?AWSAccessKeyId=TESTJDND73Z2EOXMTEST&Expires=1430878121&Signature=SxXP9iKzsnIeCjYBKFS8iW%2F9Bus%3D"),
                url);
    }

    @Test(expected = AmazonClientException.class)
    public void testConvertRequestUrlThrow() throws URISyntaxException {
        final Request<String> req = new DefaultRequest<String>("s3");
        req.setHttpMethod(HttpMethodName.GET);
        req.setEndpoint(new URI("htps://test-bucket1234.s3.amazonaws.com"));
        req.setResourcePath("/TestFile.txt");
        req.withParameter("AWSAccessKeyId", "TESTJDND73Z2EOXMTEST");
        req.withParameter("Expires", "1430878121");
        req.withParameter("Signature", "SxXP9iKzsnIeCjYBKFS8iW/9Bus=");

        final URL craftedURL = ServiceUtils.convertRequestToUrl(req, true);
    }

    @Test
    public void testJoin() {
        final ServiceUtils utils = new ServiceUtils();

        final List<String> list = new ArrayList<String>();
        final String one = "1";
        list.add(one);
        assertEquals("1", ServiceUtils.join(list));
        final String two = "2";
        list.add(two);
        assertEquals("1, 2", ServiceUtils.join(list));
        final String three = "3";
        list.add(three);
        assertEquals("1, 2, 3", ServiceUtils.join(list));
    }

    @Test
    public void removeQuotes() {
        final String noQuote = "noQuote";
        assertEquals("noQuote", ServiceUtils.removeQuotes(noQuote));
        final String quotes = "\"quotes\"";
        assertEquals("quotes", ServiceUtils.removeQuotes(quotes));

        assertTrue(StringUtils.isBlank(ServiceUtils.removeQuotes(null)));
    }

    @Test
    public void isMultipartUploadETagTest() {
        assertTrue(ServiceUtils.isMultipartUploadETag("123456789-0"));
    }

    @Test
    public void skipMd5CheckPerResponseTest() {
        final S3ClientOptions clientOptions = S3ClientOptions.builder().skipContentMd5Check(true).build();
        final ObjectMetadata metadata = new ObjectMetadata();
        metadata.setSSEAlgorithm(SSEAlgorithm.KMS.toString());

        assertTrue(ServiceUtils.skipMd5CheckPerResponse(null, clientOptions));
        assertFalse(ServiceUtils.skipMd5CheckPerResponse(null));
        assertTrue(ServiceUtils.skipMd5CheckPerResponse(metadata));
    }

    @Test
    public void skipMd5CheckPerRequestTest() throws Throwable {
        final S3ClientOptions clientOptions = S3ClientOptions.builder().skipContentMd5Check(true).build();
        assertTrue(ServiceUtils.skipMd5CheckPerRequest(null, clientOptions));

        System.setProperty("com.amazonaws.services.s3.disableGetObjectMD5Validation", "true");
        assertTrue(ServiceUtils.skipMd5CheckPerRequest(null));

        System.clearProperty("com.amazonaws.services.s3.disableGetObjectMD5Validation");
        GetObjectRequest getObjectRequest = new GetObjectRequest("bucket", "key");
        getObjectRequest.setRange(100);

        assertTrue(ServiceUtils.skipMd5CheckPerRequest(getObjectRequest));

        getObjectRequest = new GetObjectRequest("bucket", "key");
        getObjectRequest.setSSECustomerKey(new SSECustomerKey("testKey"));
        assertTrue(ServiceUtils.skipMd5CheckPerRequest(getObjectRequest));

        getObjectRequest = new GetObjectRequest("bucket", "key");
        assertFalse(ServiceUtils.skipMd5CheckPerRequest(getObjectRequest));

        PutObjectRequest putObjectRequest = new PutObjectRequest("bucket", "key",
                File.createTempFile("test", "test2"));
        final ObjectMetadata metadata = new ObjectMetadata();
        metadata.setSSEAlgorithm(SSEAlgorithm.KMS.toString());
        putObjectRequest.setMetadata(metadata);

        assertTrue(ServiceUtils.skipMd5CheckPerRequest(putObjectRequest));

        putObjectRequest = new PutObjectRequest("bucket", "key",
                File.createTempFile("test", "test2"));
        putObjectRequest.setSSECustomerKey(new SSECustomerKey("testKey"));

        assertTrue(ServiceUtils.skipMd5CheckPerRequest(putObjectRequest));

        putObjectRequest = new PutObjectRequest("bucket", "key",
                File.createTempFile("test", "test2"));
        assertFalse(ServiceUtils.skipMd5CheckPerRequest(putObjectRequest));

        UploadPartRequest partRequest = new UploadPartRequest();
        partRequest.setSSECustomerKey(new SSECustomerKey("testKey"));
        assertTrue(ServiceUtils.skipMd5CheckPerRequest(partRequest));

        partRequest = new UploadPartRequest();
        assertFalse(ServiceUtils.skipMd5CheckPerRequest(partRequest));
    }

    @Test
    public void downloadObjectToFileTest() throws Throwable {
        final S3Object s3Object = new S3Object();
        final String input = "test input";
        s3Object.setObjectContent(new StringInputStream(input));
        final ObjectMetadata metadata = new ObjectMetadata();
        metadata.setHeader(Headers.ETAG, "5eed650258ee02f6a77c87b748b764ec");
        s3Object.setObjectMetadata(metadata);

        ServiceUtils.downloadObjectToFile(s3Object, File.createTempFile("temp1", "temp2"), true,
                false);
    }

    @Test
    public void testDateParse() {
        final Date date = new Date();
        final String expected = iso8601DateFormat.print(date.getTime());
        final String actual = ServiceUtils.formatIso8601Date(date);
        assertEquals(expected, actual);

        final Date expectedDate = new Date(iso8601DateFormat.parseMillis(expected));
        final Date actualDate = ServiceUtils.parseIso8601Date(expected);
        assertEquals(expectedDate, actualDate);
    }

    @Test(expected = AmazonClientException.class)
    public void retryableDownloadS3ObjectToFileTest() throws IOException {
        final RetryableS3DownloadTask task = new RetryableS3DownloadTask() {
            private int count = 0;

            @Override
            public boolean needIntegrityCheck() {
                return false;
            }

            @Override
            public S3Object getS3ObjectStream() {
                try {
                    if (count == 0) {
                        return null;
                    } else if (count == 1) {
                        final S3Object s3Object = new S3Object();
                        final String input = "test input";
                        s3Object.setObjectContent(new StringInputStream(input));
                        final ObjectMetadata metadata = new ObjectMetadata();
                        metadata.setHeader(Headers.ETAG, "5eed650258ee02f6a77c87b748b764ec");
                        s3Object.setObjectMetadata(metadata);

                        return s3Object;
                    } else if (count == 2) {
                        throw new AmazonClientException("test exception") {
                            @Override
                            public Throwable getCause() {
                                return new SocketException();
                            };

                            @Override
                            public boolean isRetryable() {
                                return false;
                            };
                        };
                    }
                } catch (final UnsupportedEncodingException e) {

                } finally {
                    count++;
                }

                return null;
            }
        };

        ServiceUtils.retryableDownloadS3ObjectToFile(File.createTempFile("temp1", "temp2"), task,
                false);

        ServiceUtils.retryableDownloadS3ObjectToFile(File.createTempFile("temp1", "temp2"), task,
                false);


        ServiceUtils.retryableDownloadS3ObjectToFile(File.createTempFile("temp1", "temp2"), task,
                false);

    }

    @Test
    public void testToBytes() {
        assertEquals("dGVzdA==", new String(Base64.encode(ServiceUtils.toByteArray("test"))));
    }

}
