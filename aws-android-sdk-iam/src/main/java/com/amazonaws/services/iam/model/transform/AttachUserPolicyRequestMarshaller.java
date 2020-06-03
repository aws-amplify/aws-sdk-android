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
 * StAX request marshaller for AttachUserPolicyRequest
 */
public class AttachUserPolicyRequestMarshaller implements
        Marshaller<Request<AttachUserPolicyRequest>, AttachUserPolicyRequest> {

    public Request<AttachUserPolicyRequest> marshall(AttachUserPolicyRequest attachUserPolicyRequest) {
        if (attachUserPolicyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(AttachUserPolicyRequest)");
        }

        Request<AttachUserPolicyRequest> request = new DefaultRequest<AttachUserPolicyRequest>(
                attachUserPolicyRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "AttachUserPolicy");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (attachUserPolicyRequest.getUserName() != null) {
            prefix = "UserName";
            String userName = attachUserPolicyRequest.getUserName();
            request.addParameter(prefix, StringUtils.fromString(userName));
        }
        if (attachUserPolicyRequest.getPolicyArn() != null) {
            prefix = "PolicyArn";
            String policyArn = attachUserPolicyRequest.getPolicyArn();
            request.addParameter(prefix, StringUtils.fromString(policyArn));
        }

        return request;
    }
}
