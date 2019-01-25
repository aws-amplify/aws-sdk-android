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
 * StAX request marshaller for AssumeRoleRequest
 */
public class AssumeRoleRequestMarshaller implements
        Marshaller<Request<AssumeRoleRequest>, AssumeRoleRequest> {

    public Request<AssumeRoleRequest> marshall(AssumeRoleRequest assumeRoleRequest) {
        if (assumeRoleRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(AssumeRoleRequest)");
        }

        Request<AssumeRoleRequest> request = new DefaultRequest<AssumeRoleRequest>(
                assumeRoleRequest, "AWSSecurityTokenService");
        request.addParameter("Action", "AssumeRole");
        request.addParameter("Version", "2011-06-15");

        String prefix;
        if (assumeRoleRequest.getRoleArn() != null) {
            prefix = "RoleArn";
            String roleArn = assumeRoleRequest.getRoleArn();
            request.addParameter(prefix, StringUtils.fromString(roleArn));
        }
        if (assumeRoleRequest.getRoleSessionName() != null) {
            prefix = "RoleSessionName";
            String roleSessionName = assumeRoleRequest.getRoleSessionName();
            request.addParameter(prefix, StringUtils.fromString(roleSessionName));
        }
        if (assumeRoleRequest.getPolicy() != null) {
            prefix = "Policy";
            String policy = assumeRoleRequest.getPolicy();
            request.addParameter(prefix, StringUtils.fromString(policy));
        }
        if (assumeRoleRequest.getDurationSeconds() != null) {
            prefix = "DurationSeconds";
            Integer durationSeconds = assumeRoleRequest.getDurationSeconds();
            request.addParameter(prefix, StringUtils.fromInteger(durationSeconds));
        }
        if (assumeRoleRequest.getExternalId() != null) {
            prefix = "ExternalId";
            String externalId = assumeRoleRequest.getExternalId();
            request.addParameter(prefix, StringUtils.fromString(externalId));
        }
        if (assumeRoleRequest.getSerialNumber() != null) {
            prefix = "SerialNumber";
            String serialNumber = assumeRoleRequest.getSerialNumber();
            request.addParameter(prefix, StringUtils.fromString(serialNumber));
        }
        if (assumeRoleRequest.getTokenCode() != null) {
            prefix = "TokenCode";
            String tokenCode = assumeRoleRequest.getTokenCode();
            request.addParameter(prefix, StringUtils.fromString(tokenCode));
        }

        return request;
    }
}
