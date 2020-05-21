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
 * StAX request marshaller for UploadPartCopyRequest
 */
public class UploadPartCopyRequestMarshaller implements
        Marshaller<Request<UploadPartCopyRequest>, UploadPartCopyRequest> {

    public Request<UploadPartCopyRequest> marshall(UploadPartCopyRequest uploadPartCopyRequest) {
        if (uploadPartCopyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UploadPartCopyRequest)");
        }

        Request<UploadPartCopyRequest> request = new DefaultRequest<UploadPartCopyRequest>(
                uploadPartCopyRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "UploadPartCopy");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (uploadPartCopyRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = uploadPartCopyRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (uploadPartCopyRequest.getCopySource() != null) {
            prefix = "x-amz-copy-source";
            String copySource = uploadPartCopyRequest.getCopySource();
            request.addParameter(prefix, StringUtils.fromString(copySource));
        }
        if (uploadPartCopyRequest.getCopySourceIfMatch() != null) {
            prefix = "x-amz-copy-source-if-match";
            String copySourceIfMatch = uploadPartCopyRequest.getCopySourceIfMatch();
            request.addParameter(prefix, StringUtils.fromString(copySourceIfMatch));
        }
        if (uploadPartCopyRequest.getCopySourceIfModifiedSince() != null) {
            prefix = "x-amz-copy-source-if-modified-since";
            java.util.Date copySourceIfModifiedSince = uploadPartCopyRequest
                    .getCopySourceIfModifiedSince();
            request.addParameter(prefix, StringUtils.fromDate(copySourceIfModifiedSince));
        }
        if (uploadPartCopyRequest.getCopySourceIfNoneMatch() != null) {
            prefix = "x-amz-copy-source-if-none-match";
            String copySourceIfNoneMatch = uploadPartCopyRequest.getCopySourceIfNoneMatch();
            request.addParameter(prefix, StringUtils.fromString(copySourceIfNoneMatch));
        }
        if (uploadPartCopyRequest.getCopySourceIfUnmodifiedSince() != null) {
            prefix = "x-amz-copy-source-if-unmodified-since";
            java.util.Date copySourceIfUnmodifiedSince = uploadPartCopyRequest
                    .getCopySourceIfUnmodifiedSince();
            request.addParameter(prefix, StringUtils.fromDate(copySourceIfUnmodifiedSince));
        }
        if (uploadPartCopyRequest.getCopySourceRange() != null) {
            prefix = "x-amz-copy-source-range";
            String copySourceRange = uploadPartCopyRequest.getCopySourceRange();
            request.addParameter(prefix, StringUtils.fromString(copySourceRange));
        }
        if (uploadPartCopyRequest.getKey() != null) {
            prefix = "Key";
            String key = uploadPartCopyRequest.getKey();
            request.addParameter(prefix, StringUtils.fromString(key));
        }
        if (uploadPartCopyRequest.getPartNumber() != null) {
            prefix = "partNumber";
            Integer partNumber = uploadPartCopyRequest.getPartNumber();
            request.addParameter(prefix, StringUtils.fromInteger(partNumber));
        }
        if (uploadPartCopyRequest.getUploadId() != null) {
            prefix = "uploadId";
            String uploadId = uploadPartCopyRequest.getUploadId();
            request.addParameter(prefix, StringUtils.fromString(uploadId));
        }
        if (uploadPartCopyRequest.getSSECustomerAlgorithm() != null) {
            prefix = "x-amz-server-side-encryption-customer-algorithm";
            String sSECustomerAlgorithm = uploadPartCopyRequest.getSSECustomerAlgorithm();
            request.addParameter(prefix, StringUtils.fromString(sSECustomerAlgorithm));
        }
        if (uploadPartCopyRequest.getSSECustomerKey() != null) {
            prefix = "x-amz-server-side-encryption-customer-key";
            String sSECustomerKey = uploadPartCopyRequest.getSSECustomerKey();
            request.addParameter(prefix, StringUtils.fromString(sSECustomerKey));
        }
        if (uploadPartCopyRequest.getSSECustomerKeyMD5() != null) {
            prefix = "x-amz-server-side-encryption-customer-key-MD5";
            String sSECustomerKeyMD5 = uploadPartCopyRequest.getSSECustomerKeyMD5();
            request.addParameter(prefix, StringUtils.fromString(sSECustomerKeyMD5));
        }
        if (uploadPartCopyRequest.getCopySourceSSECustomerAlgorithm() != null) {
            prefix = "x-amz-copy-source-server-side-encryption-customer-algorithm";
            String copySourceSSECustomerAlgorithm = uploadPartCopyRequest
                    .getCopySourceSSECustomerAlgorithm();
            request.addParameter(prefix, StringUtils.fromString(copySourceSSECustomerAlgorithm));
        }
        if (uploadPartCopyRequest.getCopySourceSSECustomerKey() != null) {
            prefix = "x-amz-copy-source-server-side-encryption-customer-key";
            String copySourceSSECustomerKey = uploadPartCopyRequest.getCopySourceSSECustomerKey();
            request.addParameter(prefix, StringUtils.fromString(copySourceSSECustomerKey));
        }
        if (uploadPartCopyRequest.getCopySourceSSECustomerKeyMD5() != null) {
            prefix = "x-amz-copy-source-server-side-encryption-customer-key-MD5";
            String copySourceSSECustomerKeyMD5 = uploadPartCopyRequest
                    .getCopySourceSSECustomerKeyMD5();
            request.addParameter(prefix, StringUtils.fromString(copySourceSSECustomerKeyMD5));
        }
        if (uploadPartCopyRequest.getRequestPayer() != null) {
            prefix = "x-amz-request-payer";
            String requestPayer = uploadPartCopyRequest.getRequestPayer();
            request.addParameter(prefix, StringUtils.fromString(requestPayer));
        }

        return request;
    }
}
