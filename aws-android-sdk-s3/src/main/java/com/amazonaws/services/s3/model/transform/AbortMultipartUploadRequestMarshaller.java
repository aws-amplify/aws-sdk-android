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
 * StAX request marshaller for AbortMultipartUploadRequest
 */
public class AbortMultipartUploadRequestMarshaller implements
        Marshaller<Request<AbortMultipartUploadRequest>, AbortMultipartUploadRequest> {

    public Request<AbortMultipartUploadRequest> marshall(
            AbortMultipartUploadRequest abortMultipartUploadRequest) {
        if (abortMultipartUploadRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(AbortMultipartUploadRequest)");
        }

        Request<AbortMultipartUploadRequest> request = new DefaultRequest<AbortMultipartUploadRequest>(
                abortMultipartUploadRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "AbortMultipartUpload");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (abortMultipartUploadRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = abortMultipartUploadRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (abortMultipartUploadRequest.getKey() != null) {
            prefix = "Key";
            String key = abortMultipartUploadRequest.getKey();
            request.addParameter(prefix, StringUtils.fromString(key));
        }
        if (abortMultipartUploadRequest.getUploadId() != null) {
            prefix = "uploadId";
            String uploadId = abortMultipartUploadRequest.getUploadId();
            request.addParameter(prefix, StringUtils.fromString(uploadId));
        }
        if (abortMultipartUploadRequest.getRequestPayer() != null) {
            prefix = "x-amz-request-payer";
            String requestPayer = abortMultipartUploadRequest.getRequestPayer();
            request.addParameter(prefix, StringUtils.fromString(requestPayer));
        }

        return request;
    }
}
