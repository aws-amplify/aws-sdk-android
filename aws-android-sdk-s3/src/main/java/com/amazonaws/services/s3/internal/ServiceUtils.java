/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Portions copyright 2006-2009 James Murty. Please see LICENSE.txt
 * for applicable license terms and NOTICE.txt for applicable notices.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.s3.internal;

import static com.amazonaws.util.StringUtils.UTF8;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.SSEAlgorithm;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.Md5Utils;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.SocketException;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.net.ssl.SSLProtocolException;

/**
 * General utility methods used throughout the AWS S3 Java client.
 */
public class ServiceUtils {
    private static final Log log = LogFactory.getLog(ServiceUtils.class);

    private static final int DEAFAULT_BYTE_SIZE = 1024 * 10;

    /** boolean to enable append mode */
    public static final boolean APPEND_MODE = true;

    /** boolean to disable overwrite mode */
    public static final boolean OVERWRITE_MODE = false;

    @Deprecated
    protected static final DateUtils DATE_UTILS = new DateUtils();

    /**
     * Parses a date in ISO-8601 format to a Date object.
     * @param dateString the date in ISO-8601 format.
     * @return instance of Date.
     */
    public static Date parseIso8601Date(String dateString) {
        return DateUtils.parseISO8601Date(dateString);
    }

    /**
     * Formats an instance of Date to ISO-8601.
     * @param date Date
     * @return date in ISO-8601 format.
     */
    public static String formatIso8601Date(Date date) {
        return DateUtils.formatISO8601Date(date);
    }

    /**
     * Parses a date in RFC-822 format to a Date object.
     * @param dateString the date in RFC-822 format.
     * @return instance of Date.
     */
    public static Date parseRfc822Date(String dateString) {
        return DateUtils.parseRFC822Date(dateString);
    }

    /**
     * Formats an instance of Date to RFC-822.
     * @param date Date
     * @return date in RFC-822 format.
     */
    public static String formatRfc822Date(Date date) {
        return DateUtils.formatRFC822Date(date);
    }

    /**
     * Returns true if the specified ETag was from a multipart upload.
     *
     * @param eTag The ETag to test.
     * @return True if the specified ETag was from a multipart upload, otherwise
     *         false it if belongs to an object that was uploaded in a single
     *         part.
     */
    public static boolean isMultipartUploadETag(String eTag) {
        return eTag.contains("-");
    }

    /**
     * Safely converts a string to a byte array, first attempting to explicitly
     * use our preferred encoding (UTF-8), and then falling back to the
     * platform's default encoding if for some reason our preferred encoding
     * isn't supported.
     *
     * @param s The string to convert to a byte array.
     * @return The byte array contents of the specified string.
     */
    public static byte[] toByteArray(String s) {
        return s.getBytes(UTF8);
    }

    /**
     * Removes any surrounding quotes from the specified string and returns a
     * new string.
     *
     * @param s The string to check for surrounding quotes.
     * @return A new string created from the specified string, minus any
     *         surrounding quotes.
     */
    public static String removeQuotes(String s) {
        if (s == null) {
            return null;
        }

        s = s.trim();
        if (s.startsWith("\"")) {
            s = s.substring(1);
        }
        if (s.endsWith("\"")) {
            s = s.substring(0, s.length() - 1);
        }

        return s;
    }

    /**
     * Converts the specified request object into a URL, containing all the
     * specified parameters, the specified request endpoint, etc.
     *
     * @param request The request to convert into a URL.
     * @return A new URL representing the specified request.
     * @throws AmazonClientException If the request cannot be converted to a
     *             well formed URL.
     */
    public static URL convertRequestToUrl(Request<?> request) {
        // To be backward compatible, this method by default does not
        // remove the leading slash in the request resource-path.
        return convertRequestToUrl(request, false);
    }

    /**
     * Converts the specified request object into a URL, containing all the
     * specified parameters, the specified request endpoint, etc.
     *
     * @param request The request to convert into a URL.
     * @param removeLeadingSlashInResourcePath Whether the leading slash in
     *            resource-path should be removed before appending to the
     *            endpoint.
     * @return A new URL representing the specified request.
     * @throws AmazonClientException If the request cannot be converted to a
     *             well formed URL.
     */
    public static URL convertRequestToUrl(Request<?> request,
            boolean removeLeadingSlashInResourcePath) {

        String resourcePath = S3HttpUtils.urlEncode(request.getResourcePath(), true);

        // Removed the padding "/" that was already added into the request's
        // resource path.
        if (removeLeadingSlashInResourcePath
                && resourcePath.startsWith("/")) {
            resourcePath = resourcePath.substring(1);
        }

        // Some http client libraries (e.g. Apache HttpClient) cannot handle
        // consecutive "/"s between URL authority and path components.
        // So we escape "////..." into "/%2F%2F%2F...", in the same way as how
        // we treat consecutive "/"s in AmazonS3Client#presignRequest(...)
        String urlPath = "/" + resourcePath;
        urlPath = urlPath.replaceAll("(?<=/)/", "%2F");
        String urlString = request.getEndpoint() + urlPath;

        boolean firstParam = true;
        for (final String param : request.getParameters().keySet()) {
            if (firstParam) {
                urlString += "?";
                firstParam = false;
            } else {
                urlString += "&";
            }

            final String value = request.getParameters().get(param);
            urlString += param + "=" + S3HttpUtils.urlEncode(value, false);
        }

        try {
            return new URL(urlString);
        } catch (final MalformedURLException e) {
            throw new AmazonClientException(
                    "Unable to convert request to well formed URL: " + e.getMessage(), e);
        }
    }

    /**
     * Returns a new string created by joining each of the strings in the
     * specified list together, with a comma between them.
     *
     * @param strings The list of strings to join into a single, comma delimited
     *            string list.
     * @return A new string created by joining each of the strings in the
     *         specified list together, with a comma between strings.
     */
    public static String join(List<String> strings) {
        String result = "";

        boolean first = true;
        for (final String s : strings) {
            if (!first) {
                result += ", ";
            }

            result += s;
            first = false;
        }

        return result;
    }

    /**
     * Downloads an S3Object, as returned from
     * {@link AmazonS3Client#getObject(com.amazonaws.services.s3.model.GetObjectRequest)}
     * , to the specified file.
     *
     * @param s3Object The S3Object containing a reference to an InputStream
     *            containing the object's data.
     * @param destinationFile The file to store the object's data in.
     * @param performIntegrityCheck Boolean valuable to indicate whether to
     *            perform integrity check
     * @param appendData appends the data to end of the file.
     */
    public static void downloadObjectToFile(S3Object s3Object,
            File destinationFile, boolean performIntegrityCheck,
            boolean appendData) {

        // attempt to create the parent if it doesn't exist
        final File parentDirectory = destinationFile.getParentFile();
        if (parentDirectory != null && !parentDirectory.exists()) {
            parentDirectory.mkdirs();
        }

        OutputStream outputStream = null;
        try {
            outputStream = new BufferedOutputStream(new FileOutputStream(
                    destinationFile, appendData));
            final byte[] buffer = new byte[DEAFAULT_BYTE_SIZE];
            int bytesRead;
            while ((bytesRead = s3Object.getObjectContent().read(buffer)) > -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        } catch (final IOException e) {
            s3Object.getObjectContent().abort();
            throw new AmazonClientException(
                    "Unable to store object contents to disk: " + e.getMessage(), e);
        } finally {
            try {
                outputStream.close();
            } catch (final Exception e) {
                log.debug("Caught exception. Ignoring.");
            }
            try {
                s3Object.getObjectContent().close();
            } catch (final Exception e) {
                log.debug("Caught exception. Ignoring.");
            }
        }

        byte[] clientSideHash = null;
        byte[] serverSideHash = null;
        try {
            // Multipart Uploads don't have an MD5 calculated on the service
            // side
            if (!ServiceUtils.isMultipartUploadETag(s3Object.getObjectMetadata().getETag())) {
                clientSideHash = Md5Utils.computeMD5Hash(new FileInputStream(destinationFile));
                serverSideHash = BinaryUtils.fromHex(s3Object.getObjectMetadata().getETag());
            }
        } catch (final Exception e) {
            log.warn("Unable to calculate MD5 hash to validate download: " + e.getMessage(), e);
        }

        if (performIntegrityCheck && clientSideHash != null && serverSideHash != null
                && !Arrays.equals(clientSideHash, serverSideHash)) {
            throw new AmazonClientException("Unable to verify integrity of data download.  " +
                    "Client calculated content hash didn't match hash calculated by Amazon S3.  " +
                    "The data stored in '" + destinationFile.getAbsolutePath()
                    + "' may be corrupt.");
        }
    }

    /**
     * Interface for the task of downloading object from S3 to a specific file,
     * enabling one-time retry mechanism after integrity check failure on the
     * downloaded file.
     */
    public interface RetryableS3DownloadTask {
        /**
         * User defines how to get the S3Object from S3 for this
         * RetryableS3DownloadTask.
         *
         * @return The S3Object containing a reference to an InputStream
         *         containing the object's data.
         */
        public S3Object getS3ObjectStream();

        /**
         * User defines whether integrity check is needed for this
         * RetryableS3DownloadTask.
         *
         * @return Boolean value indicating whether this task requires integrity
         *         check after downloading the S3 object to file.
         */
        public boolean needIntegrityCheck();
    }

    /**
     * Gets an object stored in S3 and downloads it into the specified file.
     * This method includes the one-time retry mechanism after integrity check
     * failure on the downloaded file. It will also return immediately after
     * getting null valued S3Object (when getObject request does not meet the
     * specified constraints).
     *
     * @param file The file to store the object's data in.
     * @param retryableS3DownloadTask the task for download.
     * @param appendData boolean to indicate if append data is enabled.
     * @return S3Object.
     */
    public static S3Object retryableDownloadS3ObjectToFile(File file,
            RetryableS3DownloadTask retryableS3DownloadTask, boolean appendData) {
        boolean hasRetried = false;
        boolean needRetry;
        S3Object s3Object;
        do {
            needRetry = false;
            s3Object = retryableS3DownloadTask.getS3ObjectStream();
            if (s3Object == null) {
                return null;
            }

            try {
                ServiceUtils.downloadObjectToFile(s3Object, file,
                        retryableS3DownloadTask.needIntegrityCheck(),
                        appendData);
            } catch (final AmazonClientException ace) {
                if (!ace.isRetryable()) {
                    throw ace;
                }
                // Determine whether an immediate retry is needed according to
                // the captured AmazonClientException.
                // (There are three cases when downloadObjectToFile() throws
                // AmazonClientException:
                // 1) SocketException or SSLProtocolException when writing to
                // disk (e.g. when user aborts the download)
                // 2) Other IOException when writing to disk
                // 3) MD5 hashes don't match
                // The current code will retry the download only when case 2) or
                // 3) happens.
                if (ace.getCause() instanceof SocketException
                        || ace.getCause() instanceof SSLProtocolException) {
                    throw ace;
                } else {
                    needRetry = true;
                    if (hasRetried) {
                        throw ace;
                    } else {
                        log.info("Retry the download of object " + s3Object.getKey() + " (bucket "
                                + s3Object.getBucketName() + ")", ace);
                        hasRetried = true;
                    }
                }
            } finally {
                s3Object.getObjectContent().abort();
            }
        } while (needRetry);
        return s3Object;
    }

    /**
     * Based on the given metadata of an S3 response, Returns whether the
     * specified request should skip MD5 check on the requested object content.
     * Specifically, MD5 check should be skipped if either SSE-KMS or SSE-C is
     * involved.
     * <p>
     * The reason is that when SSE-KMS or SSE-C is involved, the MD5 returned
     * from the server side is the MD5 of the ciphertext, which will by
     * definition mismatch the MD5 on the client side which is computed based on
     * the plaintext.
     * @param metadata the ObjectMetadata of an S3 response.
     * @return true if the specified response should skip MD5
     *         check on the requested object content.
     */
    public static boolean skipMd5CheckPerResponse(ObjectMetadata metadata) {
        if (metadata == null) {
            return false;
        }
        final boolean sseKMS = (SSEAlgorithm.KMS.toString().equals(metadata
                .getSSEAlgorithm()));
        return (metadata.getSSECustomerAlgorithm() != null)
                || sseKMS;
    }

    /**
     * Returns whether the specified request should skip MD5 check on the
     * requested object content.
     * @param request the AmazonWebServiceRequest.
     * @return true if the specified request should skip MD5
     *         check on the requested object content.
     */
    public static boolean skipMd5CheckPerRequest(AmazonWebServiceRequest request) {
        if (System.getProperty("com.amazonaws.services.s3.disableGetObjectMD5Validation") != null) {
            return true;
        }

        if (request instanceof GetObjectRequest) {
            final GetObjectRequest getObjectRequest = (GetObjectRequest) request;
            // Skip MD5 check for range get
            if (getObjectRequest.getRange() != null) {
                return true;
            }
            if (getObjectRequest.getSSECustomerKey() != null) {
                return true;
            }
        } else if (request instanceof PutObjectRequest) {
            final PutObjectRequest putObjectRequest = (PutObjectRequest) request;
            final ObjectMetadata om = putObjectRequest.getMetadata();
            if (om != null && om.getSSEAlgorithm() != null) {
                return true;
            }
            return putObjectRequest.getSSECustomerKey() != null;
        } else if (request instanceof UploadPartRequest) {
            final UploadPartRequest uploadPartRequest = (UploadPartRequest) request;
            return uploadPartRequest.getSSECustomerKey() != null;
        }

        return false;
    }
}
