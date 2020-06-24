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
 * StAX marshaller for POJO RoleDetail
 */
class RoleDetailStaxMarshaller {

    public void marshall(RoleDetail _roleDetail, Request<?> request, String _prefix) {
        String prefix;
        if (_roleDetail.getPath() != null) {
            prefix = _prefix + "Path";
            String path = _roleDetail.getPath();
            request.addParameter(prefix, StringUtils.fromString(path));
        }
        if (_roleDetail.getRoleName() != null) {
            prefix = _prefix + "RoleName";
            String roleName = _roleDetail.getRoleName();
            request.addParameter(prefix, StringUtils.fromString(roleName));
        }
        if (_roleDetail.getRoleId() != null) {
            prefix = _prefix + "RoleId";
            String roleId = _roleDetail.getRoleId();
            request.addParameter(prefix, StringUtils.fromString(roleId));
        }
        if (_roleDetail.getArn() != null) {
            prefix = _prefix + "Arn";
            String arn = _roleDetail.getArn();
            request.addParameter(prefix, StringUtils.fromString(arn));
        }
        if (_roleDetail.getCreateDate() != null) {
            prefix = _prefix + "CreateDate";
            java.util.Date createDate = _roleDetail.getCreateDate();
            request.addParameter(prefix, StringUtils.fromDate(createDate));
        }
        if (_roleDetail.getAssumeRolePolicyDocument() != null) {
            prefix = _prefix + "AssumeRolePolicyDocument";
            String assumeRolePolicyDocument = _roleDetail.getAssumeRolePolicyDocument();
            request.addParameter(prefix, StringUtils.fromString(assumeRolePolicyDocument));
        }
        if (_roleDetail.getInstanceProfileList() != null) {
            prefix = _prefix + "InstanceProfileList";
            java.util.List<InstanceProfile> instanceProfileList = _roleDetail
                    .getInstanceProfileList();
            int instanceProfileListIndex = 1;
            String instanceProfileListPrefix = prefix;
            for (InstanceProfile instanceProfileListItem : instanceProfileList) {
                prefix = instanceProfileListPrefix + ".member." + instanceProfileListIndex;
                if (instanceProfileListItem != null) {
                    InstanceProfileStaxMarshaller.getInstance().marshall(instanceProfileListItem,
                            request, prefix + ".");
                }
                instanceProfileListIndex++;
            }
            prefix = instanceProfileListPrefix;
        }
        if (_roleDetail.getRolePolicyList() != null) {
            prefix = _prefix + "RolePolicyList";
            java.util.List<PolicyDetail> rolePolicyList = _roleDetail.getRolePolicyList();
            int rolePolicyListIndex = 1;
            String rolePolicyListPrefix = prefix;
            for (PolicyDetail rolePolicyListItem : rolePolicyList) {
                prefix = rolePolicyListPrefix + ".member." + rolePolicyListIndex;
                if (rolePolicyListItem != null) {
                    PolicyDetailStaxMarshaller.getInstance().marshall(rolePolicyListItem, request,
                            prefix + ".");
                }
                rolePolicyListIndex++;
            }
            prefix = rolePolicyListPrefix;
        }
        if (_roleDetail.getAttachedManagedPolicies() != null) {
            prefix = _prefix + "AttachedManagedPolicies";
            java.util.List<AttachedPolicy> attachedManagedPolicies = _roleDetail
                    .getAttachedManagedPolicies();
            int attachedManagedPoliciesIndex = 1;
            String attachedManagedPoliciesPrefix = prefix;
            for (AttachedPolicy attachedManagedPoliciesItem : attachedManagedPolicies) {
                prefix = attachedManagedPoliciesPrefix + ".member." + attachedManagedPoliciesIndex;
                if (attachedManagedPoliciesItem != null) {
                    AttachedPolicyStaxMarshaller.getInstance().marshall(
                            attachedManagedPoliciesItem, request, prefix + ".");
                }
                attachedManagedPoliciesIndex++;
            }
            prefix = attachedManagedPoliciesPrefix;
        }
        if (_roleDetail.getPermissionsBoundary() != null) {
            prefix = _prefix + "PermissionsBoundary";
            AttachedPermissionsBoundary permissionsBoundary = _roleDetail.getPermissionsBoundary();
            AttachedPermissionsBoundaryStaxMarshaller.getInstance().marshall(permissionsBoundary,
                    request, prefix + ".");
        }
        if (_roleDetail.getTags() != null) {
            prefix = _prefix + "Tags";
            java.util.List<Tag> tags = _roleDetail.getTags();
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
        if (_roleDetail.getRoleLastUsed() != null) {
            prefix = _prefix + "RoleLastUsed";
            RoleLastUsed roleLastUsed = _roleDetail.getRoleLastUsed();
            RoleLastUsedStaxMarshaller.getInstance().marshall(roleLastUsed, request, prefix + ".");
        }
    }

    private static RoleDetailStaxMarshaller instance;

    public static RoleDetailStaxMarshaller getInstance() {
        if (instance == null)
            instance = new RoleDetailStaxMarshaller();
        return instance;
    }
}
