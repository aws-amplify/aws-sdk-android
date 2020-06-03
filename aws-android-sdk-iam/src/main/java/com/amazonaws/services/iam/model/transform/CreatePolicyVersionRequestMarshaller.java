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
 * StAX request marshaller for CreatePolicyVersionRequest
 */
public class CreatePolicyVersionRequestMarshaller implements
        Marshaller<Request<CreatePolicyVersionRequest>, CreatePolicyVersionRequest> {

    public Request<CreatePolicyVersionRequest> marshall(
            CreatePolicyVersionRequest createPolicyVersionRequest) {
        if (createPolicyVersionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreatePolicyVersionRequest)");
        }

        Request<CreatePolicyVersionRequest> request = new DefaultRequest<CreatePolicyVersionRequest>(
                createPolicyVersionRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "CreatePolicyVersion");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (createPolicyVersionRequest.getPolicyArn() != null) {
            prefix = "PolicyArn";
            String policyArn = createPolicyVersionRequest.getPolicyArn();
            request.addParameter(prefix, StringUtils.fromString(policyArn));
        }
        if (createPolicyVersionRequest.getPolicyDocument() != null) {
            prefix = "PolicyDocument";
            String policyDocument = createPolicyVersionRequest.getPolicyDocument();
            request.addParameter(prefix, StringUtils.fromString(policyDocument));
        }
        if (createPolicyVersionRequest.getSetAsDefault() != null) {
            prefix = "SetAsDefault";
            Boolean setAsDefault = createPolicyVersionRequest.getSetAsDefault();
            request.addParameter(prefix, StringUtils.fromBoolean(setAsDefault));
        }

        return request;
    }
}
