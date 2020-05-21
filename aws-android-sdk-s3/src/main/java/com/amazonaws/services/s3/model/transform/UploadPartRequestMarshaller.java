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
 * StAX request marshaller for UploadPartRequest
 */
public class UploadPartRequestMarshaller implements
        Marshaller<Request<UploadPartRequest>, UploadPartRequest> {

    public Request<UploadPartRequest> marshall(UploadPartRequest uploadPartRequest) {
        if (uploadPartRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UploadPartRequest)");
        }

        Request<UploadPartRequest> request = new DefaultRequest<UploadPartRequest>(
                uploadPartRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "UploadPart");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (uploadPartRequest.getBody() != null) {
            prefix = "Body";
            java.nio.ByteBuffer body = uploadPartRequest.getBody();
            request.addParameter(prefix, StringUtils.fromByteBuffer(body));
        }
        if (uploadPartRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = uploadPartRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (uploadPartRequest.getContentLength() != null) {
            prefix = "Content-Length";
            Long contentLength = uploadPartRequest.getContentLength();
            request.addParameter(prefix, StringUtils.fromLong(contentLength));
        }
        if (uploadPartRequest.getContentMD5() != null) {
            prefix = "Content-MD5";
            String contentMD5 = uploadPartRequest.getContentMD5();
            request.addParameter(prefix, StringUtils.fromString(contentMD5));
        }
        if (uploadPartRequest.getKey() != null) {
            prefix = "Key";
            String key = uploadPartRequest.getKey();
            request.addParameter(prefix, StringUtils.fromString(key));
        }
        if (uploadPartRequest.getPartNumber() != null) {
            prefix = "partNumber";
            Integer partNumber = uploadPartRequest.getPartNumber();
            request.addParameter(prefix, StringUtils.fromInteger(partNumber));
        }
        if (uploadPartRequest.getUploadId() != null) {
            prefix = "uploadId";
            String uploadId = uploadPartRequest.getUploadId();
            request.addParameter(prefix, StringUtils.fromString(uploadId));
        }
        if (uploadPartRequest.getSSECustomerAlgorithm() != null) {
            prefix = "x-amz-server-side-encryption-customer-algorithm";
            String sSECustomerAlgorithm = uploadPartRequest.getSSECustomerAlgorithm();
            request.addParameter(prefix, StringUtils.fromString(sSECustomerAlgorithm));
        }
        if (uploadPartRequest.getSSECustomerKey() != null) {
            prefix = "x-amz-server-side-encryption-customer-key";
            String sSECustomerKey = uploadPartRequest.getSSECustomerKey();
            request.addParameter(prefix, StringUtils.fromString(sSECustomerKey));
        }
        if (uploadPartRequest.getSSECustomerKeyMD5() != null) {
            prefix = "x-amz-server-side-encryption-customer-key-MD5";
            String sSECustomerKeyMD5 = uploadPartRequest.getSSECustomerKeyMD5();
            request.addParameter(prefix, StringUtils.fromString(sSECustomerKeyMD5));
        }
        if (uploadPartRequest.getRequestPayer() != null) {
            prefix = "x-amz-request-payer";
            String requestPayer = uploadPartRequest.getRequestPayer();
            request.addParameter(prefix, StringUtils.fromString(requestPayer));
        }

        return request;
    }
}
