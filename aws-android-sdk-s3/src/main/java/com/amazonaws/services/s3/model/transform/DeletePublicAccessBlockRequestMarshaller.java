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
 * StAX request marshaller for DeletePublicAccessBlockRequest
 */
public class DeletePublicAccessBlockRequestMarshaller implements
        Marshaller<Request<DeletePublicAccessBlockRequest>, DeletePublicAccessBlockRequest> {

    public Request<DeletePublicAccessBlockRequest> marshall(
            DeletePublicAccessBlockRequest deletePublicAccessBlockRequest) {
        if (deletePublicAccessBlockRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeletePublicAccessBlockRequest)");
        }

        Request<DeletePublicAccessBlockRequest> request = new DefaultRequest<DeletePublicAccessBlockRequest>(
                deletePublicAccessBlockRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "DeletePublicAccessBlock");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (deletePublicAccessBlockRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = deletePublicAccessBlockRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }

        return request;
    }
}
