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
 * StAX request marshaller for CreateMultipartUploadRequest
 */
public class CreateMultipartUploadRequestMarshaller implements
        Marshaller<Request<CreateMultipartUploadRequest>, CreateMultipartUploadRequest> {

    public Request<CreateMultipartUploadRequest> marshall(
            CreateMultipartUploadRequest createMultipartUploadRequest) {
        if (createMultipartUploadRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateMultipartUploadRequest)");
        }

        Request<CreateMultipartUploadRequest> request = new DefaultRequest<CreateMultipartUploadRequest>(
                createMultipartUploadRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "CreateMultipartUpload");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (createMultipartUploadRequest.getACL() != null) {
            prefix = "x-amz-acl";
            String aCL = createMultipartUploadRequest.getACL();
            request.addParameter(prefix, StringUtils.fromString(aCL));
        }
        if (createMultipartUploadRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = createMultipartUploadRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (createMultipartUploadRequest.getCacheControl() != null) {
            prefix = "Cache-Control";
            String cacheControl = createMultipartUploadRequest.getCacheControl();
            request.addParameter(prefix, StringUtils.fromString(cacheControl));
        }
        if (createMultipartUploadRequest.getContentDisposition() != null) {
            prefix = "Content-Disposition";
            String contentDisposition = createMultipartUploadRequest.getContentDisposition();
            request.addParameter(prefix, StringUtils.fromString(contentDisposition));
        }
        if (createMultipartUploadRequest.getContentEncoding() != null) {
            prefix = "Content-Encoding";
            String contentEncoding = createMultipartUploadRequest.getContentEncoding();
            request.addParameter(prefix, StringUtils.fromString(contentEncoding));
        }
        if (createMultipartUploadRequest.getContentLanguage() != null) {
            prefix = "Content-Language";
            String contentLanguage = createMultipartUploadRequest.getContentLanguage();
            request.addParameter(prefix, StringUtils.fromString(contentLanguage));
        }
        if (createMultipartUploadRequest.getContentType() != null) {
            prefix = "Content-Type";
            String contentType = createMultipartUploadRequest.getContentType();
            request.addParameter(prefix, StringUtils.fromString(contentType));
        }
        if (createMultipartUploadRequest.getExpires() != null) {
            prefix = "Expires";
            java.util.Date expires = createMultipartUploadRequest.getExpires();
            request.addParameter(prefix, StringUtils.fromDate(expires));
        }
        if (createMultipartUploadRequest.getGrantFullControl() != null) {
            prefix = "x-amz-grant-full-control";
            String grantFullControl = createMultipartUploadRequest.getGrantFullControl();
            request.addParameter(prefix, StringUtils.fromString(grantFullControl));
        }
        if (createMultipartUploadRequest.getGrantRead() != null) {
            prefix = "x-amz-grant-read";
            String grantRead = createMultipartUploadRequest.getGrantRead();
            request.addParameter(prefix, StringUtils.fromString(grantRead));
        }
        if (createMultipartUploadRequest.getGrantReadACP() != null) {
            prefix = "x-amz-grant-read-acp";
            String grantReadACP = createMultipartUploadRequest.getGrantReadACP();
            request.addParameter(prefix, StringUtils.fromString(grantReadACP));
        }
        if (createMultipartUploadRequest.getGrantWriteACP() != null) {
            prefix = "x-amz-grant-write-acp";
            String grantWriteACP = createMultipartUploadRequest.getGrantWriteACP();
            request.addParameter(prefix, StringUtils.fromString(grantWriteACP));
        }
        if (createMultipartUploadRequest.getKey() != null) {
            prefix = "Key";
            String key = createMultipartUploadRequest.getKey();
            request.addParameter(prefix, StringUtils.fromString(key));
        }
        if (createMultipartUploadRequest.getMetadata() != null) {
            prefix = "x-amz-meta-";
            java.util.Map<String, String> metadata = createMultipartUploadRequest.getMetadata();
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
        if (createMultipartUploadRequest.getServerSideEncryption() != null) {
            prefix = "x-amz-server-side-encryption";
            String serverSideEncryption = createMultipartUploadRequest.getServerSideEncryption();
            request.addParameter(prefix, StringUtils.fromString(serverSideEncryption));
        }
        if (createMultipartUploadRequest.getStorageClass() != null) {
            prefix = "x-amz-storage-class";
            String storageClass = createMultipartUploadRequest.getStorageClass();
            request.addParameter(prefix, StringUtils.fromString(storageClass));
        }
        if (createMultipartUploadRequest.getWebsiteRedirectLocation() != null) {
            prefix = "x-amz-website-redirect-location";
            String websiteRedirectLocation = createMultipartUploadRequest
                    .getWebsiteRedirectLocation();
            request.addParameter(prefix, StringUtils.fromString(websiteRedirectLocation));
        }
        if (createMultipartUploadRequest.getSSECustomerAlgorithm() != null) {
            prefix = "x-amz-server-side-encryption-customer-algorithm";
            String sSECustomerAlgorithm = createMultipartUploadRequest.getSSECustomerAlgorithm();
            request.addParameter(prefix, StringUtils.fromString(sSECustomerAlgorithm));
        }
        if (createMultipartUploadRequest.getSSECustomerKey() != null) {
            prefix = "x-amz-server-side-encryption-customer-key";
            String sSECustomerKey = createMultipartUploadRequest.getSSECustomerKey();
            request.addParameter(prefix, StringUtils.fromString(sSECustomerKey));
        }
        if (createMultipartUploadRequest.getSSECustomerKeyMD5() != null) {
            prefix = "x-amz-server-side-encryption-customer-key-MD5";
            String sSECustomerKeyMD5 = createMultipartUploadRequest.getSSECustomerKeyMD5();
            request.addParameter(prefix, StringUtils.fromString(sSECustomerKeyMD5));
        }
        if (createMultipartUploadRequest.getSSEKMSKeyId() != null) {
            prefix = "x-amz-server-side-encryption-aws-kms-key-id";
            String sSEKMSKeyId = createMultipartUploadRequest.getSSEKMSKeyId();
            request.addParameter(prefix, StringUtils.fromString(sSEKMSKeyId));
        }
        if (createMultipartUploadRequest.getSSEKMSEncryptionContext() != null) {
            prefix = "x-amz-server-side-encryption-context";
            String sSEKMSEncryptionContext = createMultipartUploadRequest
                    .getSSEKMSEncryptionContext();
            request.addParameter(prefix, StringUtils.fromString(sSEKMSEncryptionContext));
        }
        if (createMultipartUploadRequest.getRequestPayer() != null) {
            prefix = "x-amz-request-payer";
            String requestPayer = createMultipartUploadRequest.getRequestPayer();
            request.addParameter(prefix, StringUtils.fromString(requestPayer));
        }
        if (createMultipartUploadRequest.getTagging() != null) {
            prefix = "x-amz-tagging";
            String tagging = createMultipartUploadRequest.getTagging();
            request.addParameter(prefix, StringUtils.fromString(tagging));
        }
        if (createMultipartUploadRequest.getObjectLockMode() != null) {
            prefix = "x-amz-object-lock-mode";
            String objectLockMode = createMultipartUploadRequest.getObjectLockMode();
            request.addParameter(prefix, StringUtils.fromString(objectLockMode));
        }
        if (createMultipartUploadRequest.getObjectLockRetainUntilDate() != null) {
            prefix = "x-amz-object-lock-retain-until-date";
            java.util.Date objectLockRetainUntilDate = createMultipartUploadRequest
                    .getObjectLockRetainUntilDate();
            request.addParameter(prefix, StringUtils.fromDate(objectLockRetainUntilDate));
        }
        if (createMultipartUploadRequest.getObjectLockLegalHoldStatus() != null) {
            prefix = "x-amz-object-lock-legal-hold";
            String objectLockLegalHoldStatus = createMultipartUploadRequest
                    .getObjectLockLegalHoldStatus();
            request.addParameter(prefix, StringUtils.fromString(objectLockLegalHoldStatus));
        }

        return request;
    }
}
