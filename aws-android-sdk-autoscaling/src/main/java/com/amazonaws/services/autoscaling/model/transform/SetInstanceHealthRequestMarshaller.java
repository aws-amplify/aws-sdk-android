/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.autoscaling.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for SetInstanceHealthRequest
 */
public class SetInstanceHealthRequestMarshaller implements
        Marshaller<Request<SetInstanceHealthRequest>, SetInstanceHealthRequest> {

    public Request<SetInstanceHealthRequest> marshall(
            SetInstanceHealthRequest setInstanceHealthRequest) {
        if (setInstanceHealthRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SetInstanceHealthRequest)");
        }

        Request<SetInstanceHealthRequest> request = new DefaultRequest<SetInstanceHealthRequest>(
                setInstanceHealthRequest, "AmazonAutoScaling");
        request.addParameter("Action", "SetInstanceHealth");
        request.addParameter("Version", "2011-01-01");

        String prefix;
        if (setInstanceHealthRequest.getInstanceId() != null) {
            prefix = "InstanceId";
            String instanceId = setInstanceHealthRequest.getInstanceId();
            request.addParameter(prefix, StringUtils.fromString(instanceId));
        }
        if (setInstanceHealthRequest.getHealthStatus() != null) {
            prefix = "HealthStatus";
            String healthStatus = setInstanceHealthRequest.getHealthStatus();
            request.addParameter(prefix, StringUtils.fromString(healthStatus));
        }
        if (setInstanceHealthRequest.getShouldRespectGracePeriod() != null) {
            prefix = "ShouldRespectGracePeriod";
            Boolean shouldRespectGracePeriod = setInstanceHealthRequest
                    .getShouldRespectGracePeriod();
            request.addParameter(prefix, StringUtils.fromBoolean(shouldRespectGracePeriod));
        }

        return request;
    }
}
