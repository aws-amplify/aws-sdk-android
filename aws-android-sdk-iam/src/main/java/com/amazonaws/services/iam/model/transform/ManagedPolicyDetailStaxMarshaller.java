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
 * StAX marshaller for POJO ManagedPolicyDetail
 */
class ManagedPolicyDetailStaxMarshaller {

    public void marshall(ManagedPolicyDetail _managedPolicyDetail, Request<?> request,
            String _prefix) {
        String prefix;
        if (_managedPolicyDetail.getPolicyName() != null) {
            prefix = _prefix + "PolicyName";
            String policyName = _managedPolicyDetail.getPolicyName();
            request.addParameter(prefix, StringUtils.fromString(policyName));
        }
        if (_managedPolicyDetail.getPolicyId() != null) {
            prefix = _prefix + "PolicyId";
            String policyId = _managedPolicyDetail.getPolicyId();
            request.addParameter(prefix, StringUtils.fromString(policyId));
        }
        if (_managedPolicyDetail.getArn() != null) {
            prefix = _prefix + "Arn";
            String arn = _managedPolicyDetail.getArn();
            request.addParameter(prefix, StringUtils.fromString(arn));
        }
        if (_managedPolicyDetail.getPath() != null) {
            prefix = _prefix + "Path";
            String path = _managedPolicyDetail.getPath();
            request.addParameter(prefix, StringUtils.fromString(path));
        }
        if (_managedPolicyDetail.getDefaultVersionId() != null) {
            prefix = _prefix + "DefaultVersionId";
            String defaultVersionId = _managedPolicyDetail.getDefaultVersionId();
            request.addParameter(prefix, StringUtils.fromString(defaultVersionId));
        }
        if (_managedPolicyDetail.getAttachmentCount() != null) {
            prefix = _prefix + "AttachmentCount";
            Integer attachmentCount = _managedPolicyDetail.getAttachmentCount();
            request.addParameter(prefix, StringUtils.fromInteger(attachmentCount));
        }
        if (_managedPolicyDetail.getPermissionsBoundaryUsageCount() != null) {
            prefix = _prefix + "PermissionsBoundaryUsageCount";
            Integer permissionsBoundaryUsageCount = _managedPolicyDetail
                    .getPermissionsBoundaryUsageCount();
            request.addParameter(prefix, StringUtils.fromInteger(permissionsBoundaryUsageCount));
        }
        if (_managedPolicyDetail.getIsAttachable() != null) {
            prefix = _prefix + "IsAttachable";
            Boolean isAttachable = _managedPolicyDetail.getIsAttachable();
            request.addParameter(prefix, StringUtils.fromBoolean(isAttachable));
        }
        if (_managedPolicyDetail.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _managedPolicyDetail.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_managedPolicyDetail.getCreateDate() != null) {
            prefix = _prefix + "CreateDate";
            java.util.Date createDate = _managedPolicyDetail.getCreateDate();
            request.addParameter(prefix, StringUtils.fromDate(createDate));
        }
        if (_managedPolicyDetail.getUpdateDate() != null) {
            prefix = _prefix + "UpdateDate";
            java.util.Date updateDate = _managedPolicyDetail.getUpdateDate();
            request.addParameter(prefix, StringUtils.fromDate(updateDate));
        }
        if (_managedPolicyDetail.getPolicyVersionList() != null) {
            prefix = _prefix + "PolicyVersionList";
            java.util.List<PolicyVersion> policyVersionList = _managedPolicyDetail
                    .getPolicyVersionList();
            int policyVersionListIndex = 1;
            String policyVersionListPrefix = prefix;
            for (PolicyVersion policyVersionListItem : policyVersionList) {
                prefix = policyVersionListPrefix + ".member." + policyVersionListIndex;
                if (policyVersionListItem != null) {
                    PolicyVersionStaxMarshaller.getInstance().marshall(policyVersionListItem,
                            request, prefix + ".");
                }
                policyVersionListIndex++;
            }
            prefix = policyVersionListPrefix;
        }
    }

    private static ManagedPolicyDetailStaxMarshaller instance;

    public static ManagedPolicyDetailStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ManagedPolicyDetailStaxMarshaller();
        return instance;
    }
}
