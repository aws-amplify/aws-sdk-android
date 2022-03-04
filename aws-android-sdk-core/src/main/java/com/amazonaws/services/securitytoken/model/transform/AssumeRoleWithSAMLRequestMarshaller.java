/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * StAX request marshaller for AssumeRoleWithSAMLRequest
 */
public class AssumeRoleWithSAMLRequestMarshaller implements
        Marshaller<Request<AssumeRoleWithSAMLRequest>, AssumeRoleWithSAMLRequest> {

    public Request<AssumeRoleWithSAMLRequest> marshall(
            AssumeRoleWithSAMLRequest assumeRoleWithSAMLRequest) {
        if (assumeRoleWithSAMLRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(AssumeRoleWithSAMLRequest)");
        }

        Request<AssumeRoleWithSAMLRequest> request = new DefaultRequest<AssumeRoleWithSAMLRequest>(
                assumeRoleWithSAMLRequest, "AWSSecurityTokenService");
        request.addParameter("Action", "AssumeRoleWithSAML");
        request.addParameter("Version", "2011-06-15");

        String prefix;
        if (assumeRoleWithSAMLRequest.getRoleArn() != null) {
            prefix = "RoleArn";
            String roleArn = assumeRoleWithSAMLRequest.getRoleArn();
            request.addParameter(prefix, StringUtils.fromString(roleArn));
        }
        if (assumeRoleWithSAMLRequest.getPrincipalArn() != null) {
            prefix = "PrincipalArn";
            String principalArn = assumeRoleWithSAMLRequest.getPrincipalArn();
            request.addParameter(prefix, StringUtils.fromString(principalArn));
        }
        if (assumeRoleWithSAMLRequest.getSAMLAssertion() != null) {
            prefix = "SAMLAssertion";
            String sAMLAssertion = assumeRoleWithSAMLRequest.getSAMLAssertion();
            request.addParameter(prefix, StringUtils.fromString(sAMLAssertion));
        }
        if (assumeRoleWithSAMLRequest.getPolicyArns() != null) {
            prefix = "PolicyArns";
            java.util.List<PolicyDescriptorType> policyArns = assumeRoleWithSAMLRequest
                    .getPolicyArns();
            int policyArnsIndex = 1;
            String policyArnsPrefix = prefix;
            for (PolicyDescriptorType policyArnsItem : policyArns) {
                prefix = policyArnsPrefix + ".member." + policyArnsIndex;
                if (policyArnsItem != null) {
                    PolicyDescriptorTypeStaxMarshaller.getInstance().marshall(policyArnsItem,
                            request, prefix + ".");
                }
                policyArnsIndex++;
            }
            prefix = policyArnsPrefix;
        }
        if (assumeRoleWithSAMLRequest.getPolicy() != null) {
            prefix = "Policy";
            String policy = assumeRoleWithSAMLRequest.getPolicy();
            request.addParameter(prefix, StringUtils.fromString(policy));
        }
        if (assumeRoleWithSAMLRequest.getDurationSeconds() != null) {
            prefix = "DurationSeconds";
            Integer durationSeconds = assumeRoleWithSAMLRequest.getDurationSeconds();
            request.addParameter(prefix, StringUtils.fromInteger(durationSeconds));
        }

        return request;
    }
}
