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

import com.amazonaws.Request;
import com.amazonaws.services.iam.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO Role
 */
class RoleStaxMarshaller {

    public void marshall(Role _role, Request<?> request, String _prefix) {
        String prefix;
        if (_role.getPath() != null) {
            prefix = _prefix + "Path";
            String path = _role.getPath();
            request.addParameter(prefix, StringUtils.fromString(path));
        }
        if (_role.getRoleName() != null) {
            prefix = _prefix + "RoleName";
            String roleName = _role.getRoleName();
            request.addParameter(prefix, StringUtils.fromString(roleName));
        }
        if (_role.getRoleId() != null) {
            prefix = _prefix + "RoleId";
            String roleId = _role.getRoleId();
            request.addParameter(prefix, StringUtils.fromString(roleId));
        }
        if (_role.getArn() != null) {
            prefix = _prefix + "Arn";
            String arn = _role.getArn();
            request.addParameter(prefix, StringUtils.fromString(arn));
        }
        if (_role.getCreateDate() != null) {
            prefix = _prefix + "CreateDate";
            java.util.Date createDate = _role.getCreateDate();
            request.addParameter(prefix, StringUtils.fromDate(createDate));
        }
        if (_role.getAssumeRolePolicyDocument() != null) {
            prefix = _prefix + "AssumeRolePolicyDocument";
            String assumeRolePolicyDocument = _role.getAssumeRolePolicyDocument();
            request.addParameter(prefix, StringUtils.fromString(assumeRolePolicyDocument));
        }
        if (_role.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _role.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_role.getMaxSessionDuration() != null) {
            prefix = _prefix + "MaxSessionDuration";
            Integer maxSessionDuration = _role.getMaxSessionDuration();
            request.addParameter(prefix, StringUtils.fromInteger(maxSessionDuration));
        }
        if (_role.getPermissionsBoundary() != null) {
            prefix = _prefix + "PermissionsBoundary";
            AttachedPermissionsBoundary permissionsBoundary = _role.getPermissionsBoundary();
            AttachedPermissionsBoundaryStaxMarshaller.getInstance().marshall(permissionsBoundary,
                    request, prefix + ".");
        }
        if (_role.getTags() != null) {
            prefix = _prefix + "Tags";
            java.util.List<Tag> tags = _role.getTags();
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
        if (_role.getRoleLastUsed() != null) {
            prefix = _prefix + "RoleLastUsed";
            RoleLastUsed roleLastUsed = _role.getRoleLastUsed();
            RoleLastUsedStaxMarshaller.getInstance().marshall(roleLastUsed, request, prefix + ".");
        }
    }

    private static RoleStaxMarshaller instance;

    public static RoleStaxMarshaller getInstance() {
        if (instance == null)
            instance = new RoleStaxMarshaller();
        return instance;
    }
}
