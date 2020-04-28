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
 * StAX request marshaller for GetReusableDelegationSetLimitRequest
 */
public class GetReusableDelegationSetLimitRequestMarshaller
        implements
        Marshaller<Request<GetReusableDelegationSetLimitRequest>, GetReusableDelegationSetLimitRequest> {

    public Request<GetReusableDelegationSetLimitRequest> marshall(
            GetReusableDelegationSetLimitRequest getReusableDelegationSetLimitRequest) {
        if (getReusableDelegationSetLimitRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetReusableDelegationSetLimitRequest)");
        }

        Request<GetReusableDelegationSetLimitRequest> request = new DefaultRequest<GetReusableDelegationSetLimitRequest>(
                getReusableDelegationSetLimitRequest, "AmazonRoute53");
        request.addParameter("Action", "GetReusableDelegationSetLimit");
        request.addParameter("Version", "2013-04-01");

        String prefix;
        if (getReusableDelegationSetLimitRequest.getType() != null) {
            prefix = "Type";
            String type = getReusableDelegationSetLimitRequest.getType();
            request.addParameter(prefix, StringUtils.fromString(type));
        }
        if (getReusableDelegationSetLimitRequest.getDelegationSetId() != null) {
            prefix = "Id";
            String delegationSetId = getReusableDelegationSetLimitRequest.getDelegationSetId();
            request.addParameter(prefix, StringUtils.fromString(delegationSetId));
        }

        return request;
    }
}
