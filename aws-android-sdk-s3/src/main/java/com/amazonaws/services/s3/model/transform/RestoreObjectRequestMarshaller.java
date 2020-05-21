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
 * StAX request marshaller for RestoreObjectRequest
 */
public class RestoreObjectRequestMarshaller implements
        Marshaller<Request<RestoreObjectRequest>, RestoreObjectRequest> {

    public Request<RestoreObjectRequest> marshall(RestoreObjectRequest restoreObjectRequest) {
        if (restoreObjectRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RestoreObjectRequest)");
        }

        Request<RestoreObjectRequest> request = new DefaultRequest<RestoreObjectRequest>(
                restoreObjectRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "RestoreObject");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (restoreObjectRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = restoreObjectRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (restoreObjectRequest.getKey() != null) {
            prefix = "Key";
            String key = restoreObjectRequest.getKey();
            request.addParameter(prefix, StringUtils.fromString(key));
        }
        if (restoreObjectRequest.getVersionId() != null) {
            prefix = "versionId";
            String versionId = restoreObjectRequest.getVersionId();
            request.addParameter(prefix, StringUtils.fromString(versionId));
        }
        if (restoreObjectRequest.getRestoreRequest() != null) {
            prefix = "RestoreRequest";
            RestoreRequest restoreRequest = restoreObjectRequest.getRestoreRequest();
            RestoreRequestStaxMarshaller.getInstance().marshall(restoreRequest, request,
                    prefix + ".");
        }
        if (restoreObjectRequest.getRequestPayer() != null) {
            prefix = "x-amz-request-payer";
            String requestPayer = restoreObjectRequest.getRequestPayer();
            request.addParameter(prefix, StringUtils.fromString(requestPayer));
        }

        return request;
    }
}
