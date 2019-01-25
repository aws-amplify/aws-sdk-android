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

package com.amazonaws.services.simpleemail.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for PutIdentityPolicyRequest
 */
public class PutIdentityPolicyRequestMarshaller implements
        Marshaller<Request<PutIdentityPolicyRequest>, PutIdentityPolicyRequest> {

    public Request<PutIdentityPolicyRequest> marshall(
            PutIdentityPolicyRequest putIdentityPolicyRequest) {
        if (putIdentityPolicyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutIdentityPolicyRequest)");
        }

        Request<PutIdentityPolicyRequest> request = new DefaultRequest<PutIdentityPolicyRequest>(
                putIdentityPolicyRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "PutIdentityPolicy");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (putIdentityPolicyRequest.getIdentity() != null) {
            prefix = "Identity";
            String identity = putIdentityPolicyRequest.getIdentity();
            request.addParameter(prefix, StringUtils.fromString(identity));
        }
        if (putIdentityPolicyRequest.getPolicyName() != null) {
            prefix = "PolicyName";
            String policyName = putIdentityPolicyRequest.getPolicyName();
            request.addParameter(prefix, StringUtils.fromString(policyName));
        }
        if (putIdentityPolicyRequest.getPolicy() != null) {
            prefix = "Policy";
            String policy = putIdentityPolicyRequest.getPolicy();
            request.addParameter(prefix, StringUtils.fromString(policy));
        }

        return request;
    }
}
