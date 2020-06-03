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
 * StAX request marshaller for AttachGroupPolicyRequest
 */
public class AttachGroupPolicyRequestMarshaller implements
        Marshaller<Request<AttachGroupPolicyRequest>, AttachGroupPolicyRequest> {

    public Request<AttachGroupPolicyRequest> marshall(
            AttachGroupPolicyRequest attachGroupPolicyRequest) {
        if (attachGroupPolicyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(AttachGroupPolicyRequest)");
        }

        Request<AttachGroupPolicyRequest> request = new DefaultRequest<AttachGroupPolicyRequest>(
                attachGroupPolicyRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "AttachGroupPolicy");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (attachGroupPolicyRequest.getGroupName() != null) {
            prefix = "GroupName";
            String groupName = attachGroupPolicyRequest.getGroupName();
            request.addParameter(prefix, StringUtils.fromString(groupName));
        }
        if (attachGroupPolicyRequest.getPolicyArn() != null) {
            prefix = "PolicyArn";
            String policyArn = attachGroupPolicyRequest.getPolicyArn();
            request.addParameter(prefix, StringUtils.fromString(policyArn));
        }

        return request;
    }
}
