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
 * StAX request marshaller for GetSessionTokenRequest
 */
public class GetSessionTokenRequestMarshaller implements
        Marshaller<Request<GetSessionTokenRequest>, GetSessionTokenRequest> {

    public Request<GetSessionTokenRequest> marshall(GetSessionTokenRequest getSessionTokenRequest) {
        if (getSessionTokenRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetSessionTokenRequest)");
        }

        Request<GetSessionTokenRequest> request = new DefaultRequest<GetSessionTokenRequest>(
                getSessionTokenRequest, "AWSSecurityTokenService");
        request.addParameter("Action", "GetSessionToken");
        request.addParameter("Version", "2011-06-15");

        String prefix;
        if (getSessionTokenRequest.getDurationSeconds() != null) {
            prefix = "DurationSeconds";
            Integer durationSeconds = getSessionTokenRequest.getDurationSeconds();
            request.addParameter(prefix, StringUtils.fromInteger(durationSeconds));
        }
        if (getSessionTokenRequest.getSerialNumber() != null) {
            prefix = "SerialNumber";
            String serialNumber = getSessionTokenRequest.getSerialNumber();
            request.addParameter(prefix, StringUtils.fromString(serialNumber));
        }
        if (getSessionTokenRequest.getTokenCode() != null) {
            prefix = "TokenCode";
            String tokenCode = getSessionTokenRequest.getTokenCode();
            request.addParameter(prefix, StringUtils.fromString(tokenCode));
        }

        return request;
    }
}
