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
 * StAX request marshaller for CreateRoleRequest
 */
public class CreateRoleRequestMarshaller implements
        Marshaller<Request<CreateRoleRequest>, CreateRoleRequest> {

    public Request<CreateRoleRequest> marshall(CreateRoleRequest createRoleRequest) {
        if (createRoleRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateRoleRequest)");
        }

        Request<CreateRoleRequest> request = new DefaultRequest<CreateRoleRequest>(
                createRoleRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "CreateRole");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (createRoleRequest.getPath() != null) {
            prefix = "Path";
            String path = createRoleRequest.getPath();
            request.addParameter(prefix, StringUtils.fromString(path));
        }
        if (createRoleRequest.getRoleName() != null) {
            prefix = "RoleName";
            String roleName = createRoleRequest.getRoleName();
            request.addParameter(prefix, StringUtils.fromString(roleName));
        }
        if (createRoleRequest.getAssumeRolePolicyDocument() != null) {
            prefix = "AssumeRolePolicyDocument";
            String assumeRolePolicyDocument = createRoleRequest.getAssumeRolePolicyDocument();
            request.addParameter(prefix, StringUtils.fromString(assumeRolePolicyDocument));
        }
        if (createRoleRequest.getDescription() != null) {
            prefix = "Description";
            String description = createRoleRequest.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (createRoleRequest.getMaxSessionDuration() != null) {
            prefix = "MaxSessionDuration";
            Integer maxSessionDuration = createRoleRequest.getMaxSessionDuration();
            request.addParameter(prefix, StringUtils.fromInteger(maxSessionDuration));
        }
        if (createRoleRequest.getPermissionsBoundary() != null) {
            prefix = "PermissionsBoundary";
            String permissionsBoundary = createRoleRequest.getPermissionsBoundary();
            request.addParameter(prefix, StringUtils.fromString(permissionsBoundary));
        }
        if (createRoleRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createRoleRequest.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix;
            for (Tag tagsItem : tags) {
                prefix = tagsPrefix + ".member." + tagsIndex;
                if (tagsItem != null) {
                    TagStaxMarshaller.getInstance().marshall(tagsItem, request, prefix + ".");
                }
                tagsIndex++;
            }
            prefix = tagsPrefix;
        }

        return request;
    }
}
