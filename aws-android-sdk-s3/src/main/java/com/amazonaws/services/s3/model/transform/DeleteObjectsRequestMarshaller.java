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
 * StAX request marshaller for DeleteObjectsRequest
 */
public class DeleteObjectsRequestMarshaller implements
        Marshaller<Request<DeleteObjectsRequest>, DeleteObjectsRequest> {

    public Request<DeleteObjectsRequest> marshall(DeleteObjectsRequest deleteObjectsRequest) {
        if (deleteObjectsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeleteObjectsRequest)");
        }

        Request<DeleteObjectsRequest> request = new DefaultRequest<DeleteObjectsRequest>(
                deleteObjectsRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "DeleteObjects");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (deleteObjectsRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = deleteObjectsRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (deleteObjectsRequest.getDelete() != null) {
            prefix = "Delete";
            Delete delete = deleteObjectsRequest.getDelete();
            DeleteStaxMarshaller.getInstance().marshall(delete, request, prefix + ".");
        }
        if (deleteObjectsRequest.getMFA() != null) {
            prefix = "x-amz-mfa";
            String mFA = deleteObjectsRequest.getMFA();
            request.addParameter(prefix, StringUtils.fromString(mFA));
        }
        if (deleteObjectsRequest.getRequestPayer() != null) {
            prefix = "x-amz-request-payer";
            String requestPayer = deleteObjectsRequest.getRequestPayer();
            request.addParameter(prefix, StringUtils.fromString(requestPayer));
        }
        if (deleteObjectsRequest.getBypassGovernanceRetention() != null) {
            prefix = "x-amz-bypass-governance-retention";
            Boolean bypassGovernanceRetention = deleteObjectsRequest.getBypassGovernanceRetention();
            request.addParameter(prefix, StringUtils.fromBoolean(bypassGovernanceRetention));
        }

        return request;
    }
}
