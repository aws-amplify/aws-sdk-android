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
 * StAX marshaller for POJO UserDetail
 */
class UserDetailStaxMarshaller {

    public void marshall(UserDetail _userDetail, Request<?> request, String _prefix) {
        String prefix;
        if (_userDetail.getPath() != null) {
            prefix = _prefix + "Path";
            String path = _userDetail.getPath();
            request.addParameter(prefix, StringUtils.fromString(path));
        }
        if (_userDetail.getUserName() != null) {
            prefix = _prefix + "UserName";
            String userName = _userDetail.getUserName();
            request.addParameter(prefix, StringUtils.fromString(userName));
        }
        if (_userDetail.getUserId() != null) {
            prefix = _prefix + "UserId";
            String userId = _userDetail.getUserId();
            request.addParameter(prefix, StringUtils.fromString(userId));
        }
        if (_userDetail.getArn() != null) {
            prefix = _prefix + "Arn";
            String arn = _userDetail.getArn();
            request.addParameter(prefix, StringUtils.fromString(arn));
        }
        if (_userDetail.getCreateDate() != null) {
            prefix = _prefix + "CreateDate";
            java.util.Date createDate = _userDetail.getCreateDate();
            request.addParameter(prefix, StringUtils.fromDate(createDate));
        }
        if (_userDetail.getUserPolicyList() != null) {
            prefix = _prefix + "UserPolicyList";
            java.util.List<PolicyDetail> userPolicyList = _userDetail.getUserPolicyList();
            int userPolicyListIndex = 1;
            String userPolicyListPrefix = prefix;
            for (PolicyDetail userPolicyListItem : userPolicyList) {
                prefix = userPolicyListPrefix + ".member." + userPolicyListIndex;
                if (userPolicyListItem != null) {
                    PolicyDetailStaxMarshaller.getInstance().marshall(userPolicyListItem, request,
                            prefix + ".");
                }
                userPolicyListIndex++;
            }
            prefix = userPolicyListPrefix;
        }
        if (_userDetail.getGroupList() != null) {
            prefix = _prefix + "GroupList";
            java.util.List<String> groupList = _userDetail.getGroupList();
            int groupListIndex = 1;
            String groupListPrefix = prefix;
            for (String groupListItem : groupList) {
                prefix = groupListPrefix + ".member." + groupListIndex;
                if (groupListItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(groupListItem));
                }
                groupListIndex++;
            }
            prefix = groupListPrefix;
        }
        if (_userDetail.getAttachedManagedPolicies() != null) {
            prefix = _prefix + "AttachedManagedPolicies";
            java.util.List<AttachedPolicy> attachedManagedPolicies = _userDetail
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
        if (_userDetail.getPermissionsBoundary() != null) {
            prefix = _prefix + "PermissionsBoundary";
            AttachedPermissionsBoundary permissionsBoundary = _userDetail.getPermissionsBoundary();
            AttachedPermissionsBoundaryStaxMarshaller.getInstance().marshall(permissionsBoundary,
                    request, prefix + ".");
        }
        if (_userDetail.getTags() != null) {
            prefix = _prefix + "Tags";
            java.util.List<Tag> tags = _userDetail.getTags();
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
    }

    private static UserDetailStaxMarshaller instance;

    public static UserDetailStaxMarshaller getInstance() {
        if (instance == null)
            instance = new UserDetailStaxMarshaller();
        return instance;
    }
}
