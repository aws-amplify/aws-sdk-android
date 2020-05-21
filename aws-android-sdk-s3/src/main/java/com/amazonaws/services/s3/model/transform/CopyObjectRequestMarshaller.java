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
 * StAX request marshaller for CopyObjectRequest
 */
public class CopyObjectRequestMarshaller implements
        Marshaller<Request<CopyObjectRequest>, CopyObjectRequest> {

    public Request<CopyObjectRequest> marshall(CopyObjectRequest copyObjectRequest) {
        if (copyObjectRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CopyObjectRequest)");
        }

        Request<CopyObjectRequest> request = new DefaultRequest<CopyObjectRequest>(
                copyObjectRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "CopyObject");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (copyObjectRequest.getACL() != null) {
            prefix = "x-amz-acl";
            String aCL = copyObjectRequest.getACL();
            request.addParameter(prefix, StringUtils.fromString(aCL));
        }
        if (copyObjectRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = copyObjectRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (copyObjectRequest.getCacheControl() != null) {
            prefix = "Cache-Control";
            String cacheControl = copyObjectRequest.getCacheControl();
            request.addParameter(prefix, StringUtils.fromString(cacheControl));
        }
        if (copyObjectRequest.getContentDisposition() != null) {
            prefix = "Content-Disposition";
            String contentDisposition = copyObjectRequest.getContentDisposition();
            request.addParameter(prefix, StringUtils.fromString(contentDisposition));
        }
        if (copyObjectRequest.getContentEncoding() != null) {
            prefix = "Content-Encoding";
            String contentEncoding = copyObjectRequest.getContentEncoding();
            request.addParameter(prefix, StringUtils.fromString(contentEncoding));
        }
        if (copyObjectRequest.getContentLanguage() != null) {
            prefix = "Content-Language";
            String contentLanguage = copyObjectRequest.getContentLanguage();
            request.addParameter(prefix, StringUtils.fromString(contentLanguage));
        }
        if (copyObjectRequest.getContentType() != null) {
            prefix = "Content-Type";
            String contentType = copyObjectRequest.getContentType();
            request.addParameter(prefix, StringUtils.fromString(contentType));
        }
        if (copyObjectRequest.getCopySource() != null) {
            prefix = "x-amz-copy-source";
            String copySource = copyObjectRequest.getCopySource();
            request.addParameter(prefix, StringUtils.fromString(copySource));
        }
        if (copyObjectRequest.getCopySourceIfMatch() != null) {
            prefix = "x-amz-copy-source-if-match";
            String copySourceIfMatch = copyObjectRequest.getCopySourceIfMatch();
            request.addParameter(prefix, StringUtils.fromString(copySourceIfMatch));
        }
        if (copyObjectRequest.getCopySourceIfModifiedSince() != null) {
            prefix = "x-amz-copy-source-if-modified-since";
            java.util.Date copySourceIfModifiedSince = copyObjectRequest
                    .getCopySourceIfModifiedSince();
            request.addParameter(prefix, StringUtils.fromDate(copySourceIfModifiedSince));
        }
        if (copyObjectRequest.getCopySourceIfNoneMatch() != null) {
            prefix = "x-amz-copy-source-if-none-match";
            String copySourceIfNoneMatch = copyObjectRequest.getCopySourceIfNoneMatch();
            request.addParameter(prefix, StringUtils.fromString(copySourceIfNoneMatch));
        }
        if (copyObjectRequest.getCopySourceIfUnmodifiedSince() != null) {
            prefix = "x-amz-copy-source-if-unmodified-since";
            java.util.Date copySourceIfUnmodifiedSince = copyObjectRequest
                    .getCopySourceIfUnmodifiedSince();
            request.addParameter(prefix, StringUtils.fromDate(copySourceIfUnmodifiedSince));
        }
        if (copyObjectRequest.getExpires() != null) {
            prefix = "Expires";
            java.util.Date expires = copyObjectRequest.getExpires();
            request.addParameter(prefix, StringUtils.fromDate(expires));
        }
        if (copyObjectRequest.getGrantFullControl() != null) {
            prefix = "x-amz-grant-full-control";
            String grantFullControl = copyObjectRequest.getGrantFullControl();
            request.addParameter(prefix, StringUtils.fromString(grantFullControl));
        }
        if (copyObjectRequest.getGrantRead() != null) {
            prefix = "x-amz-grant-read";
            String grantRead = copyObjectRequest.getGrantRead();
            request.addParameter(prefix, StringUtils.fromString(grantRead));
        }
        if (copyObjectRequest.getGrantReadACP() != null) {
            prefix = "x-amz-grant-read-acp";
            String grantReadACP = copyObjectRequest.getGrantReadACP();
            request.addParameter(prefix, StringUtils.fromString(grantReadACP));
        }
        if (copyObjectRequest.getGrantWriteACP() != null) {
            prefix = "x-amz-grant-write-acp";
            String grantWriteACP = copyObjectRequest.getGrantWriteACP();
            request.addParameter(prefix, StringUtils.fromString(grantWriteACP));
        }
        if (copyObjectRequest.getKey() != null) {
            prefix = "Key";
            String key = copyObjectRequest.getKey();
            request.addParameter(prefix, StringUtils.fromString(key));
        }
        if (copyObjectRequest.getMetadata() != null) {
            prefix = "x-amz-meta-";
            java.util.Map<String, String> metadata = copyObjectRequest.getMetadata();
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
        if (copyObjectRequest.getMetadataDirective() != null) {
            prefix = "x-amz-metadata-directive";
            String metadataDirective = copyObjectRequest.getMetadataDirective();
            request.addParameter(prefix, StringUtils.fromString(metadataDirective));
        }
        if (copyObjectRequest.getTaggingDirective() != null) {
            prefix = "x-amz-tagging-directive";
            String taggingDirective = copyObjectRequest.getTaggingDirective();
            request.addParameter(prefix, StringUtils.fromString(taggingDirective));
        }
        if (copyObjectRequest.getServerSideEncryption() != null) {
            prefix = "x-amz-server-side-encryption";
            String serverSideEncryption = copyObjectRequest.getServerSideEncryption();
            request.addParameter(prefix, StringUtils.fromString(serverSideEncryption));
        }
        if (copyObjectRequest.getStorageClass() != null) {
            prefix = "x-amz-storage-class";
            String storageClass = copyObjectRequest.getStorageClass();
            request.addParameter(prefix, StringUtils.fromString(storageClass));
        }
        if (copyObjectRequest.getWebsiteRedirectLocation() != null) {
            prefix = "x-amz-website-redirect-location";
            String websiteRedirectLocation = copyObjectRequest.getWebsiteRedirectLocation();
            request.addParameter(prefix, StringUtils.fromString(websiteRedirectLocation));
        }
        if (copyObjectRequest.getSSECustomerAlgorithm() != null) {
            prefix = "x-amz-server-side-encryption-customer-algorithm";
            String sSECustomerAlgorithm = copyObjectRequest.getSSECustomerAlgorithm();
            request.addParameter(prefix, StringUtils.fromString(sSECustomerAlgorithm));
        }
        if (copyObjectRequest.getSSECustomerKey() != null) {
            prefix = "x-amz-server-side-encryption-customer-key";
            String sSECustomerKey = copyObjectRequest.getSSECustomerKey();
            request.addParameter(prefix, StringUtils.fromString(sSECustomerKey));
        }
        if (copyObjectRequest.getSSECustomerKeyMD5() != null) {
            prefix = "x-amz-server-side-encryption-customer-key-MD5";
            String sSECustomerKeyMD5 = copyObjectRequest.getSSECustomerKeyMD5();
            request.addParameter(prefix, StringUtils.fromString(sSECustomerKeyMD5));
        }
        if (copyObjectRequest.getSSEKMSKeyId() != null) {
            prefix = "x-amz-server-side-encryption-aws-kms-key-id";
            String sSEKMSKeyId = copyObjectRequest.getSSEKMSKeyId();
            request.addParameter(prefix, StringUtils.fromString(sSEKMSKeyId));
        }
        if (copyObjectRequest.getSSEKMSEncryptionContext() != null) {
            prefix = "x-amz-server-side-encryption-context";
            String sSEKMSEncryptionContext = copyObjectRequest.getSSEKMSEncryptionContext();
            request.addParameter(prefix, StringUtils.fromString(sSEKMSEncryptionContext));
        }
        if (copyObjectRequest.getCopySourceSSECustomerAlgorithm() != null) {
            prefix = "x-amz-copy-source-server-side-encryption-customer-algorithm";
            String copySourceSSECustomerAlgorithm = copyObjectRequest
                    .getCopySourceSSECustomerAlgorithm();
            request.addParameter(prefix, StringUtils.fromString(copySourceSSECustomerAlgorithm));
        }
        if (copyObjectRequest.getCopySourceSSECustomerKey() != null) {
            prefix = "x-amz-copy-source-server-side-encryption-customer-key";
            String copySourceSSECustomerKey = copyObjectRequest.getCopySourceSSECustomerKey();
            request.addParameter(prefix, StringUtils.fromString(copySourceSSECustomerKey));
        }
        if (copyObjectRequest.getCopySourceSSECustomerKeyMD5() != null) {
            prefix = "x-amz-copy-source-server-side-encryption-customer-key-MD5";
            String copySourceSSECustomerKeyMD5 = copyObjectRequest.getCopySourceSSECustomerKeyMD5();
            request.addParameter(prefix, StringUtils.fromString(copySourceSSECustomerKeyMD5));
        }
        if (copyObjectRequest.getRequestPayer() != null) {
            prefix = "x-amz-request-payer";
            String requestPayer = copyObjectRequest.getRequestPayer();
            request.addParameter(prefix, StringUtils.fromString(requestPayer));
        }
        if (copyObjectRequest.getTagging() != null) {
            prefix = "x-amz-tagging";
            String tagging = copyObjectRequest.getTagging();
            request.addParameter(prefix, StringUtils.fromString(tagging));
        }
        if (copyObjectRequest.getObjectLockMode() != null) {
            prefix = "x-amz-object-lock-mode";
            String objectLockMode = copyObjectRequest.getObjectLockMode();
            request.addParameter(prefix, StringUtils.fromString(objectLockMode));
        }
        if (copyObjectRequest.getObjectLockRetainUntilDate() != null) {
            prefix = "x-amz-object-lock-retain-until-date";
            java.util.Date objectLockRetainUntilDate = copyObjectRequest
                    .getObjectLockRetainUntilDate();
            request.addParameter(prefix, StringUtils.fromDate(objectLockRetainUntilDate));
        }
        if (copyObjectRequest.getObjectLockLegalHoldStatus() != null) {
            prefix = "x-amz-object-lock-legal-hold";
            String objectLockLegalHoldStatus = copyObjectRequest.getObjectLockLegalHoldStatus();
            request.addParameter(prefix, StringUtils.fromString(objectLockLegalHoldStatus));
        }

        return request;
    }
}
