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
 * StAX request marshaller for GetTrafficPolicyRequest
 */
public class GetTrafficPolicyRequestMarshaller implements
        Marshaller<Request<GetTrafficPolicyRequest>, GetTrafficPolicyRequest> {

    public Request<GetTrafficPolicyRequest> marshall(GetTrafficPolicyRequest getTrafficPolicyRequest) {
        if (getTrafficPolicyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetTrafficPolicyRequest)");
        }

        Request<GetTrafficPolicyRequest> request = new DefaultRequest<GetTrafficPolicyRequest>(
                getTrafficPolicyRequest, "AmazonRoute53");
        request.addParameter("Action", "GetTrafficPolicy");
        request.addParameter("Version", "2013-04-01");

        String prefix;
        if (getTrafficPolicyRequest.getId() != null) {
            prefix = "Id";
            String id = getTrafficPolicyRequest.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (getTrafficPolicyRequest.getVersion() != null) {
            prefix = "Version";
            Integer version = getTrafficPolicyRequest.getVersion();
            request.addParameter(prefix, StringUtils.fromInteger(version));
        }

        return request;
    }
}
