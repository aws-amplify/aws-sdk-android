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
 * StAX marshaller for POJO GroupDetail
 */
class GroupDetailStaxMarshaller {

    public void marshall(GroupDetail _groupDetail, Request<?> request, String _prefix) {
        String prefix;
        if (_groupDetail.getPath() != null) {
            prefix = _prefix + "Path";
            String path = _groupDetail.getPath();
            request.addParameter(prefix, StringUtils.fromString(path));
        }
        if (_groupDetail.getGroupName() != null) {
            prefix = _prefix + "GroupName";
            String groupName = _groupDetail.getGroupName();
            request.addParameter(prefix, StringUtils.fromString(groupName));
        }
        if (_groupDetail.getGroupId() != null) {
            prefix = _prefix + "GroupId";
            String groupId = _groupDetail.getGroupId();
            request.addParameter(prefix, StringUtils.fromString(groupId));
        }
        if (_groupDetail.getArn() != null) {
            prefix = _prefix + "Arn";
            String arn = _groupDetail.getArn();
            request.addParameter(prefix, StringUtils.fromString(arn));
        }
        if (_groupDetail.getCreateDate() != null) {
            prefix = _prefix + "CreateDate";
            java.util.Date createDate = _groupDetail.getCreateDate();
            request.addParameter(prefix, StringUtils.fromDate(createDate));
        }
        if (_groupDetail.getGroupPolicyList() != null) {
            prefix = _prefix + "GroupPolicyList";
            java.util.List<PolicyDetail> groupPolicyList = _groupDetail.getGroupPolicyList();
            int groupPolicyListIndex = 1;
            String groupPolicyListPrefix = prefix;
            for (PolicyDetail groupPolicyListItem : groupPolicyList) {
                prefix = groupPolicyListPrefix + ".member." + groupPolicyListIndex;
                if (groupPolicyListItem != null) {
                    PolicyDetailStaxMarshaller.getInstance().marshall(groupPolicyListItem, request,
                            prefix + ".");
                }
                groupPolicyListIndex++;
            }
            prefix = groupPolicyListPrefix;
        }
        if (_groupDetail.getAttachedManagedPolicies() != null) {
            prefix = _prefix + "AttachedManagedPolicies";
            java.util.List<AttachedPolicy> attachedManagedPolicies = _groupDetail
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
    }

    private static GroupDetailStaxMarshaller instance;

    public static GroupDetailStaxMarshaller getInstance() {
        if (instance == null)
            instance = new GroupDetailStaxMarshaller();
        return instance;
    }
}
