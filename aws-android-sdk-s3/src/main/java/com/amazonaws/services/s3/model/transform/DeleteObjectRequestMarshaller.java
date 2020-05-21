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
 * StAX request marshaller for DeleteObjectRequest
 */
public class DeleteObjectRequestMarshaller implements
        Marshaller<Request<DeleteObjectRequest>, DeleteObjectRequest> {

    public Request<DeleteObjectRequest> marshall(DeleteObjectRequest deleteObjectRequest) {
        if (deleteObjectRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeleteObjectRequest)");
        }

        Request<DeleteObjectRequest> request = new DefaultRequest<DeleteObjectRequest>(
                deleteObjectRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "DeleteObject");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (deleteObjectRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = deleteObjectRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (deleteObjectRequest.getKey() != null) {
            prefix = "Key";
            String key = deleteObjectRequest.getKey();
            request.addParameter(prefix, StringUtils.fromString(key));
        }
        if (deleteObjectRequest.getMFA() != null) {
            prefix = "x-amz-mfa";
            String mFA = deleteObjectRequest.getMFA();
            request.addParameter(prefix, StringUtils.fromString(mFA));
        }
        if (deleteObjectRequest.getVersionId() != null) {
            prefix = "versionId";
            String versionId = deleteObjectRequest.getVersionId();
            request.addParameter(prefix, StringUtils.fromString(versionId));
        }
        if (deleteObjectRequest.getRequestPayer() != null) {
            prefix = "x-amz-request-payer";
            String requestPayer = deleteObjectRequest.getRequestPayer();
            request.addParameter(prefix, StringUtils.fromString(requestPayer));
        }
        if (deleteObjectRequest.getBypassGovernanceRetention() != null) {
            prefix = "x-amz-bypass-governance-retention";
            Boolean bypassGovernanceRetention = deleteObjectRequest.getBypassGovernanceRetention();
            request.addParameter(prefix, StringUtils.fromBoolean(bypassGovernanceRetention));
        }

        return request;
    }
}
