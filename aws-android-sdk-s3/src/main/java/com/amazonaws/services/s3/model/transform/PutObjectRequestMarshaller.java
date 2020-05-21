/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for PutObjectRequest
 */
public class PutObjectRequestMarshaller implements
        Marshaller<Request<PutObjectRequest>, PutObjectRequest> {

    public Request<PutObjectRequest> marshall(PutObjectRequest putObjectRequest) {
        if (putObjectRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(PutObjectRequest)");
        }

        Request<PutObjectRequest> request = new DefaultRequest<PutObjectRequest>(putObjectRequest,
                "AmazonSimpleStorageService");
        request.addParameter("Action", "PutObject");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (putObjectRequest.getACL() != null) {
            prefix = "x-amz-acl";
            String aCL = putObjectRequest.getACL();
            request.addParameter(prefix, StringUtils.fromString(aCL));
        }
        if (putObjectRequest.getBody() != null) {
            prefix = "Body";
            java.nio.ByteBuffer body = putObjectRequest.getBody();
            request.addParameter(prefix, StringUtils.fromByteBuffer(body));
        }
        if (putObjectRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = putObjectRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (putObjectRequest.getCacheControl() != null) {
            prefix = "Cache-Control";
            String cacheControl = putObjectRequest.getCacheControl();
            request.addParameter(prefix, StringUtils.fromString(cacheControl));
        }
        if (putObjectRequest.getContentDisposition() != null) {
            prefix = "Content-Disposition";
            String contentDisposition = putObjectRequest.getContentDisposition();
            request.addParameter(prefix, StringUtils.fromString(contentDisposition));
        }
        if (putObjectRequest.getContentEncoding() != null) {
            prefix = "Content-Encoding";
            String contentEncoding = putObjectRequest.getContentEncoding();
            request.addParameter(prefix, StringUtils.fromString(contentEncoding));
        }
        if (putObjectRequest.getContentLanguage() != null) {
            prefix = "Content-Language";
            String contentLanguage = putObjectRequest.getContentLanguage();
            request.addParameter(prefix, StringUtils.fromString(contentLanguage));
        }
        if (putObjectRequest.getContentLength() != null) {
            prefix = "Content-Length";
            Long contentLength = putObjectRequest.getContentLength();
            request.addParameter(prefix, StringUtils.fromLong(contentLength));
        }
        if (putObjectRequest.getContentMD5() != null) {
            prefix = "Content-MD5";
            String contentMD5 = putObjectRequest.getContentMD5();
            request.addParameter(prefix, StringUtils.fromString(contentMD5));
        }
        if (putObjectRequest.getContentType() != null) {
            prefix = "Content-Type";
            String contentType = putObjectRequest.getContentType();
            request.addParameter(prefix, StringUtils.fromString(contentType));
        }
        if (putObjectRequest.getExpires() != null) {
            prefix = "Expires";
            java.util.Date expires = putObjectRequest.getExpires();
            request.addParameter(prefix, StringUtils.fromDate(expires));
        }
        if (putObjectRequest.getGrantFullControl() != null) {
            prefix = "x-amz-grant-full-control";
            String grantFullControl = putObjectRequest.getGrantFullControl();
            request.addParameter(prefix, StringUtils.fromString(grantFullControl));
        }
        if (putObjectRequest.getGrantRead() != null) {
            prefix = "x-amz-grant-read";
            String grantRead = putObjectRequest.getGrantRead();
            request.addParameter(prefix, StringUtils.fromString(grantRead));
        }
        if (putObjectRequest.getGrantReadACP() != null) {
            prefix = "x-amz-grant-read-acp";
            String grantReadACP = putObjectRequest.getGrantReadACP();
            request.addParameter(prefix, StringUtils.fromString(grantReadACP));
        }
        if (putObjectRequest.getGrantWriteACP() != null) {
            prefix = "x-amz-grant-write-acp";
            String grantWriteACP = putObjectRequest.getGrantWriteACP();
            request.addParameter(prefix, StringUtils.fromString(grantWriteACP));
        }
        if (putObjectRequest.getKey() != null) {
            prefix = "Key";
            String key = putObjectRequest.getKey();
            request.addParameter(prefix, StringUtils.fromString(key));
        }
        if (putObjectRequest.getMetadata() != null) {
            prefix = "x-amz-meta-";
            java.util.Map<String, String> metadata = putObjectRequest.getMetadata();
            int metadataIndex = 1;
            String metadataPrefix = prefix + ".entry.";
            for (java.util.Map.Entry<String, String> metadataEntry : metadata.entrySet()) {
                prefix = metadataPrefix + metadataIndex;
                if (metadataEntry.getKey() != null) {
                    request.addParameter(prefix + ".key",
                            StringUtils.fromString(metadataEntry.getKey()));
                }
                prefix += ".value";
                if (metadataEntry.getValue() != null) {
                    String metadataValue = metadataEntry.getValue();
                    request.addParameter(prefix, StringUtils.fromString(metadataValue));
                }
                metadataIndex++;
            }
            prefix = metadataPrefix;
        }
        if (putObjectRequest.getServerSideEncryption() != null) {
            prefix = "x-amz-server-side-encryption";
            String serverSideEncryption = putObjectRequest.getServerSideEncryption();
            request.addParameter(prefix, StringUtils.fromString(serverSideEncryption));
        }
        if (putObjectRequest.getStorageClass() != null) {
            prefix = "x-amz-storage-class";
            String storageClass = putObjectRequest.getStorageClass();
            request.addParameter(prefix, StringUtils.fromString(storageClass));
        }
        if (putObjectRequest.getWebsiteRedirectLocation() != null) {
            prefix = "x-amz-website-redirect-location";
            String websiteRedirectLocation = putObjectRequest.getWebsiteRedirectLocation();
            request.addParameter(prefix, StringUtils.fromString(websiteRedirectLocation));
        }
        if (putObjectRequest.getSSECustomerAlgorithm() != null) {
            prefix = "x-amz-server-side-encryption-customer-algorithm";
            String sSECustomerAlgorithm = putObjectRequest.getSSECustomerAlgorithm();
            request.addParameter(prefix, StringUtils.fromString(sSECustomerAlgorithm));
        }
        if (putObjectRequest.getSSECustomerKey() != null) {
            prefix = "x-amz-server-side-encryption-customer-key";
            String sSECustomerKey = putObjectRequest.getSSECustomerKey();
            request.addParameter(prefix, StringUtils.fromString(sSECustomerKey));
        }
        if (putObjectRequest.getSSECustomerKeyMD5() != null) {
            prefix = "x-amz-server-side-encryption-customer-key-MD5";
            String sSECustomerKeyMD5 = putObjectRequest.getSSECustomerKeyMD5();
            request.addParameter(prefix, StringUtils.fromString(sSECustomerKeyMD5));
        }
        if (putObjectRequest.getSSEKMSKeyId() != null) {
            prefix = "x-amz-server-side-encryption-aws-kms-key-id";
            String sSEKMSKeyId = putObjectRequest.getSSEKMSKeyId();
            request.addParameter(prefix, StringUtils.fromString(sSEKMSKeyId));
        }
        if (putObjectRequest.getSSEKMSEncryptionContext() != null) {
            prefix = "x-amz-server-side-encryption-context";
            String sSEKMSEncryptionContext = putObjectRequest.getSSEKMSEncryptionContext();
            request.addParameter(prefix, StringUtils.fromString(sSEKMSEncryptionContext));
        }
        if (putObjectRequest.getRequestPayer() != null) {
            prefix = "x-amz-request-payer";
            String requestPayer = putObjectRequest.getRequestPayer();
            request.addParameter(prefix, StringUtils.fromString(requestPayer));
        }
        if (putObjectRequest.getTagging() != null) {
            prefix = "x-amz-tagging";
            String tagging = putObjectRequest.getTagging();
            request.addParameter(prefix, StringUtils.fromString(tagging));
        }
        if (putObjectRequest.getObjectLockMode() != null) {
            prefix = "x-amz-object-lock-mode";
            String objectLockMode = putObjectRequest.getObjectLockMode();
            request.addParameter(prefix, StringUtils.fromString(objectLockMode));
        }
        if (putObjectRequest.getObjectLockRetainUntilDate() != null) {
            prefix = "x-amz-object-lock-retain-until-date";
            java.util.Date objectLockRetainUntilDate = putObjectRequest
                    .getObjectLockRetainUntilDate();
            request.addParameter(prefix, StringUtils.fromDate(objectLockRetainUntilDate));
        }
        if (putObjectRequest.getObjectLockLegalHoldStatus() != null) {
            prefix = "x-amz-object-lock-legal-hold";
            String objectLockLegalHoldStatus = putObjectRequest.getObjectLockLegalHoldStatus();
            request.addParameter(prefix, StringUtils.fromString(objectLockLegalHoldStatus));
        }

        return request;
    }
}
