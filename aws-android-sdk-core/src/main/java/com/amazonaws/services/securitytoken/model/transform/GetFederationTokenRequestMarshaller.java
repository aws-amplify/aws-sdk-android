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

package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.securitytoken.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for GetFederationTokenRequest
 */
public class GetFederationTokenRequestMarshaller implements
        Marshaller<Request<GetFederationTokenRequest>, GetFederationTokenRequest> {

    public Request<GetFederationTokenRequest> marshall(
            GetFederationTokenRequest getFederationTokenRequest) {
        if (getFederationTokenRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetFederationTokenRequest)");
        }

        Request<GetFederationTokenRequest> request = new DefaultRequest<GetFederationTokenRequest>(
                getFederationTokenRequest, "AWSSecurityTokenService");
        request.addParameter("Action", "GetFederationToken");
        request.addParameter("Version", "2011-06-15");

        String prefix;
        if (getFederationTokenRequest.getName() != null) {
            prefix = "Name";
            String name = getFederationTokenRequest.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (getFederationTokenRequest.getPolicy() != null) {
            prefix = "Policy";
            String policy = getFederationTokenRequest.getPolicy();
            request.addParameter(prefix, StringUtils.fromString(policy));
        }
        if (getFederationTokenRequest.getDurationSeconds() != null) {
            prefix = "DurationSeconds";
            Integer durationSeconds = getFederationTokenRequest.getDurationSeconds();
            request.addParameter(prefix, StringUtils.fromInteger(durationSeconds));
        }

        return request;
    }
}
