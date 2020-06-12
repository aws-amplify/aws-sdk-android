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

package com.amazonaws.services.cloudformation.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DetectStackSetDriftRequest
 */
public class DetectStackSetDriftRequestMarshaller implements
        Marshaller<Request<DetectStackSetDriftRequest>, DetectStackSetDriftRequest> {

    public Request<DetectStackSetDriftRequest> marshall(
            DetectStackSetDriftRequest detectStackSetDriftRequest) {
        if (detectStackSetDriftRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DetectStackSetDriftRequest)");
        }

        Request<DetectStackSetDriftRequest> request = new DefaultRequest<DetectStackSetDriftRequest>(
                detectStackSetDriftRequest, "AWSCloudFormation");
        request.addParameter("Action", "DetectStackSetDrift");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (detectStackSetDriftRequest.getStackSetName() != null) {
            prefix = "StackSetName";
            String stackSetName = detectStackSetDriftRequest.getStackSetName();
            request.addParameter(prefix, StringUtils.fromString(stackSetName));
        }
        if (detectStackSetDriftRequest.getOperationPreferences() != null) {
            prefix = "OperationPreferences";
            StackSetOperationPreferences operationPreferences = detectStackSetDriftRequest
                    .getOperationPreferences();
            StackSetOperationPreferencesStaxMarshaller.getInstance().marshall(operationPreferences,
                    request, prefix + ".");
        }
        if (detectStackSetDriftRequest.getOperationId() != null) {
            prefix = "OperationId";
            String operationId = detectStackSetDriftRequest.getOperationId();
            request.addParameter(prefix, StringUtils.fromString(operationId));
        }

        return request;
    }
}
