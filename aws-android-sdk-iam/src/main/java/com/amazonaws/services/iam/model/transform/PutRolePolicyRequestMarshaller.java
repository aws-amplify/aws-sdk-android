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

package com.amazonaws.services.iam.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.iam.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for PutRolePolicyRequest
 */
public class PutRolePolicyRequestMarshaller implements
        Marshaller<Request<PutRolePolicyRequest>, PutRolePolicyRequest> {

    public Request<PutRolePolicyRequest> marshall(PutRolePolicyRequest putRolePolicyRequest) {
        if (putRolePolicyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutRolePolicyRequest)");
        }

        Request<PutRolePolicyRequest> request = new DefaultRequest<PutRolePolicyRequest>(
                putRolePolicyRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "PutRolePolicy");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (putRolePolicyRequest.getRoleName() != null) {
            prefix = "RoleName";
            String roleName = putRolePolicyRequest.getRoleName();
            request.addParameter(prefix, StringUtils.fromString(roleName));
        }
        if (putRolePolicyRequest.getPolicyName() != null) {
            prefix = "PolicyName";
            String policyName = putRolePolicyRequest.getPolicyName();
            request.addParameter(prefix, StringUtils.fromString(policyName));
        }
        if (putRolePolicyRequest.getPolicyDocument() != null) {
            prefix = "PolicyDocument";
            String policyDocument = putRolePolicyRequest.getPolicyDocument();
            request.addParameter(prefix, StringUtils.fromString(policyDocument));
        }

        return request;
    }
}
