/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * StAX request marshaller for AttachInstancesRequest
 */
public class AttachInstancesRequestMarshaller implements
        Marshaller<Request<AttachInstancesRequest>, AttachInstancesRequest> {

    public Request<AttachInstancesRequest> marshall(AttachInstancesRequest attachInstancesRequest) {
        if (attachInstancesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(AttachInstancesRequest)");
        }

        Request<AttachInstancesRequest> request = new DefaultRequest<AttachInstancesRequest>(
                attachInstancesRequest, "AmazonAutoScaling");
        request.addParameter("Action", "AttachInstances");
        request.addParameter("Version", "2011-01-01");

        String prefix;
        if (attachInstancesRequest.getInstanceIds() != null) {
            prefix = "InstanceIds";
            java.util.List<String> instanceIds = attachInstancesRequest.getInstanceIds();
            int instanceIdsIndex = 1;
            String instanceIdsPrefix = prefix;
            for (String instanceIdsItem : instanceIds) {
                prefix = instanceIdsPrefix + ".member." + instanceIdsIndex;
                if (instanceIdsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(instanceIdsItem));
                }
                instanceIdsIndex++;
            }
            prefix = instanceIdsPrefix;
        }
        if (attachInstancesRequest.getAutoScalingGroupName() != null) {
            prefix = "AutoScalingGroupName";
            String autoScalingGroupName = attachInstancesRequest.getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }

        return request;
    }
}
