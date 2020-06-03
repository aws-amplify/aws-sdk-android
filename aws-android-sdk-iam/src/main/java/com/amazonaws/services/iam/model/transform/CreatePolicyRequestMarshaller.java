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
 * StAX request marshaller for CreatePolicyRequest
 */
public class CreatePolicyRequestMarshaller implements
        Marshaller<Request<CreatePolicyRequest>, CreatePolicyRequest> {

    public Request<CreatePolicyRequest> marshall(CreatePolicyRequest createPolicyRequest) {
        if (createPolicyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreatePolicyRequest)");
        }

        Request<CreatePolicyRequest> request = new DefaultRequest<CreatePolicyRequest>(
                createPolicyRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "CreatePolicy");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (createPolicyRequest.getPolicyName() != null) {
            prefix = "PolicyName";
            String policyName = createPolicyRequest.getPolicyName();
            request.addParameter(prefix, StringUtils.fromString(policyName));
        }
        if (createPolicyRequest.getPath() != null) {
            prefix = "Path";
            String path = createPolicyRequest.getPath();
            request.addParameter(prefix, StringUtils.fromString(path));
        }
        if (createPolicyRequest.getPolicyDocument() != null) {
            prefix = "PolicyDocument";
            String policyDocument = createPolicyRequest.getPolicyDocument();
            request.addParameter(prefix, StringUtils.fromString(policyDocument));
        }
        if (createPolicyRequest.getDescription() != null) {
            prefix = "Description";
            String description = createPolicyRequest.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }

        return request;
    }
}
