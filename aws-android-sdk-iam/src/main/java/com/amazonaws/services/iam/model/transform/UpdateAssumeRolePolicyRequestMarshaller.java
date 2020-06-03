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
 * StAX request marshaller for UpdateAssumeRolePolicyRequest
 */
public class UpdateAssumeRolePolicyRequestMarshaller implements
        Marshaller<Request<UpdateAssumeRolePolicyRequest>, UpdateAssumeRolePolicyRequest> {

    public Request<UpdateAssumeRolePolicyRequest> marshall(
            UpdateAssumeRolePolicyRequest updateAssumeRolePolicyRequest) {
        if (updateAssumeRolePolicyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateAssumeRolePolicyRequest)");
        }

        Request<UpdateAssumeRolePolicyRequest> request = new DefaultRequest<UpdateAssumeRolePolicyRequest>(
                updateAssumeRolePolicyRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "UpdateAssumeRolePolicy");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (updateAssumeRolePolicyRequest.getRoleName() != null) {
            prefix = "RoleName";
            String roleName = updateAssumeRolePolicyRequest.getRoleName();
            request.addParameter(prefix, StringUtils.fromString(roleName));
        }
        if (updateAssumeRolePolicyRequest.getPolicyDocument() != null) {
            prefix = "PolicyDocument";
            String policyDocument = updateAssumeRolePolicyRequest.getPolicyDocument();
            request.addParameter(prefix, StringUtils.fromString(policyDocument));
        }

        return request;
    }
}
