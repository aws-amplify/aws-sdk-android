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
 * StAX request marshaller for CompleteMultipartUploadRequest
 */
public class CompleteMultipartUploadRequestMarshaller implements
        Marshaller<Request<CompleteMultipartUploadRequest>, CompleteMultipartUploadRequest> {

    public Request<CompleteMultipartUploadRequest> marshall(
            CompleteMultipartUploadRequest completeMultipartUploadRequest) {
        if (completeMultipartUploadRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CompleteMultipartUploadRequest)");
        }

        Request<CompleteMultipartUploadRequest> request = new DefaultRequest<CompleteMultipartUploadRequest>(
                completeMultipartUploadRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "CompleteMultipartUpload");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (completeMultipartUploadRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = completeMultipartUploadRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (completeMultipartUploadRequest.getKey() != null) {
            prefix = "Key";
            String key = completeMultipartUploadRequest.getKey();
            request.addParameter(prefix, StringUtils.fromString(key));
        }
        if (completeMultipartUploadRequest.getMultipartUpload() != null) {
            prefix = "CompleteMultipartUpload";
            CompletedMultipartUpload multipartUpload = completeMultipartUploadRequest
                    .getMultipartUpload();
            CompletedMultipartUploadStaxMarshaller.getInstance().marshall(multipartUpload, request,
                    prefix + ".");
        }
        if (completeMultipartUploadRequest.getUploadId() != null) {
            prefix = "uploadId";
            String uploadId = completeMultipartUploadRequest.getUploadId();
            request.addParameter(prefix, StringUtils.fromString(uploadId));
        }
        if (completeMultipartUploadRequest.getRequestPayer() != null) {
            prefix = "x-amz-request-payer";
            String requestPayer = completeMultipartUploadRequest.getRequestPayer();
            request.addParameter(prefix, StringUtils.fromString(requestPayer));
        }

        return request;
    }
}
