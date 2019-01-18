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
 * StAX request marshaller for AssumeRoleWithWebIdentityRequest
 */
public class AssumeRoleWithWebIdentityRequestMarshaller implements
        Marshaller<Request<AssumeRoleWithWebIdentityRequest>, AssumeRoleWithWebIdentityRequest> {

    public Request<AssumeRoleWithWebIdentityRequest> marshall(
            AssumeRoleWithWebIdentityRequest assumeRoleWithWebIdentityRequest) {
        if (assumeRoleWithWebIdentityRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(AssumeRoleWithWebIdentityRequest)");
        }

        Request<AssumeRoleWithWebIdentityRequest> request = new DefaultRequest<AssumeRoleWithWebIdentityRequest>(
                assumeRoleWithWebIdentityRequest, "AWSSecurityTokenService");
        request.addParameter("Action", "AssumeRoleWithWebIdentity");
        request.addParameter("Version", "2011-06-15");

        String prefix;
        if (assumeRoleWithWebIdentityRequest.getRoleArn() != null) {
            prefix = "RoleArn";
            String roleArn = assumeRoleWithWebIdentityRequest.getRoleArn();
            request.addParameter(prefix, StringUtils.fromString(roleArn));
        }
        if (assumeRoleWithWebIdentityRequest.getRoleSessionName() != null) {
            prefix = "RoleSessionName";
            String roleSessionName = assumeRoleWithWebIdentityRequest.getRoleSessionName();
            request.addParameter(prefix, StringUtils.fromString(roleSessionName));
        }
        if (assumeRoleWithWebIdentityRequest.getWebIdentityToken() != null) {
            prefix = "WebIdentityToken";
            String webIdentityToken = assumeRoleWithWebIdentityRequest.getWebIdentityToken();
            request.addParameter(prefix, StringUtils.fromString(webIdentityToken));
        }
        if (assumeRoleWithWebIdentityRequest.getProviderId() != null) {
            prefix = "ProviderId";
            String providerId = assumeRoleWithWebIdentityRequest.getProviderId();
            request.addParameter(prefix, StringUtils.fromString(providerId));
        }
        if (assumeRoleWithWebIdentityRequest.getPolicy() != null) {
            prefix = "Policy";
            String policy = assumeRoleWithWebIdentityRequest.getPolicy();
            request.addParameter(prefix, StringUtils.fromString(policy));
        }
        if (assumeRoleWithWebIdentityRequest.getDurationSeconds() != null) {
            prefix = "DurationSeconds";
            Integer durationSeconds = assumeRoleWithWebIdentityRequest.getDurationSeconds();
            request.addParameter(prefix, StringUtils.fromInteger(durationSeconds));
        }

        return request;
    }
}
