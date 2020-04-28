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

package com.amazonaws.services.amazonroute53.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonroute53.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for UpdateTrafficPolicyInstanceRequest
 */
public class UpdateTrafficPolicyInstanceRequestMarshaller implements
        Marshaller<Request<UpdateTrafficPolicyInstanceRequest>, UpdateTrafficPolicyInstanceRequest> {

    public Request<UpdateTrafficPolicyInstanceRequest> marshall(
            UpdateTrafficPolicyInstanceRequest updateTrafficPolicyInstanceRequest) {
        if (updateTrafficPolicyInstanceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateTrafficPolicyInstanceRequest)");
        }

        Request<UpdateTrafficPolicyInstanceRequest> request = new DefaultRequest<UpdateTrafficPolicyInstanceRequest>(
                updateTrafficPolicyInstanceRequest, "AmazonRoute53");
        request.addParameter("Action", "UpdateTrafficPolicyInstance");
        request.addParameter("Version", "2013-04-01");

        String prefix;
        if (updateTrafficPolicyInstanceRequest.getId() != null) {
            prefix = "Id";
            String id = updateTrafficPolicyInstanceRequest.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (updateTrafficPolicyInstanceRequest.getTTL() != null) {
            prefix = "TTL";
            Long tTL = updateTrafficPolicyInstanceRequest.getTTL();
            request.addParameter(prefix, StringUtils.fromLong(tTL));
        }
        if (updateTrafficPolicyInstanceRequest.getTrafficPolicyId() != null) {
            prefix = "TrafficPolicyId";
            String trafficPolicyId = updateTrafficPolicyInstanceRequest.getTrafficPolicyId();
            request.addParameter(prefix, StringUtils.fromString(trafficPolicyId));
        }
        if (updateTrafficPolicyInstanceRequest.getTrafficPolicyVersion() != null) {
            prefix = "TrafficPolicyVersion";
            Integer trafficPolicyVersion = updateTrafficPolicyInstanceRequest
                    .getTrafficPolicyVersion();
            request.addParameter(prefix, StringUtils.fromInteger(trafficPolicyVersion));
        }

        return request;
    }
}
