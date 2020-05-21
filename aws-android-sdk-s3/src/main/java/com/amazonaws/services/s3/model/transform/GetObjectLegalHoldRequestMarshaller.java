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
 * StAX request marshaller for GetObjectLegalHoldRequest
 */
public class GetObjectLegalHoldRequestMarshaller implements
        Marshaller<Request<GetObjectLegalHoldRequest>, GetObjectLegalHoldRequest> {

    public Request<GetObjectLegalHoldRequest> marshall(
            GetObjectLegalHoldRequest getObjectLegalHoldRequest) {
        if (getObjectLegalHoldRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetObjectLegalHoldRequest)");
        }

        Request<GetObjectLegalHoldRequest> request = new DefaultRequest<GetObjectLegalHoldRequest>(
                getObjectLegalHoldRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "GetObjectLegalHold");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (getObjectLegalHoldRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = getObjectLegalHoldRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (getObjectLegalHoldRequest.getKey() != null) {
            prefix = "Key";
            String key = getObjectLegalHoldRequest.getKey();
            request.addParameter(prefix, StringUtils.fromString(key));
        }
        if (getObjectLegalHoldRequest.getVersionId() != null) {
            prefix = "versionId";
            String versionId = getObjectLegalHoldRequest.getVersionId();
            request.addParameter(prefix, StringUtils.fromString(versionId));
        }
        if (getObjectLegalHoldRequest.getRequestPayer() != null) {
            prefix = "x-amz-request-payer";
            String requestPayer = getObjectLegalHoldRequest.getRequestPayer();
            request.addParameter(prefix, StringUtils.fromString(requestPayer));
        }

        return request;
    }
}
