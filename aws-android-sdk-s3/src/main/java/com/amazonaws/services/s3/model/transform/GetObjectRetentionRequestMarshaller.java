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
 * StAX request marshaller for GetObjectRetentionRequest
 */
public class GetObjectRetentionRequestMarshaller implements
        Marshaller<Request<GetObjectRetentionRequest>, GetObjectRetentionRequest> {

    public Request<GetObjectRetentionRequest> marshall(
            GetObjectRetentionRequest getObjectRetentionRequest) {
        if (getObjectRetentionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetObjectRetentionRequest)");
        }

        Request<GetObjectRetentionRequest> request = new DefaultRequest<GetObjectRetentionRequest>(
                getObjectRetentionRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "GetObjectRetention");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (getObjectRetentionRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = getObjectRetentionRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (getObjectRetentionRequest.getKey() != null) {
            prefix = "Key";
            String key = getObjectRetentionRequest.getKey();
            request.addParameter(prefix, StringUtils.fromString(key));
        }
        if (getObjectRetentionRequest.getVersionId() != null) {
            prefix = "versionId";
            String versionId = getObjectRetentionRequest.getVersionId();
            request.addParameter(prefix, StringUtils.fromString(versionId));
        }
        if (getObjectRetentionRequest.getRequestPayer() != null) {
            prefix = "x-amz-request-payer";
            String requestPayer = getObjectRetentionRequest.getRequestPayer();
            request.addParameter(prefix, StringUtils.fromString(requestPayer));
        }

        return request;
    }
}
