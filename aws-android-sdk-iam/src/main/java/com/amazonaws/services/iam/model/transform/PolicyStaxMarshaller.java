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
 * StAX marshaller for POJO Policy
 */
class PolicyStaxMarshaller {

    public void marshall(Policy _policy, Request<?> request, String _prefix) {
        String prefix;
        if (_policy.getPolicyName() != null) {
            prefix = _prefix + "PolicyName";
            String policyName = _policy.getPolicyName();
            request.addParameter(prefix, StringUtils.fromString(policyName));
        }
        if (_policy.getPolicyId() != null) {
            prefix = _prefix + "PolicyId";
            String policyId = _policy.getPolicyId();
            request.addParameter(prefix, StringUtils.fromString(policyId));
        }
        if (_policy.getArn() != null) {
            prefix = _prefix + "Arn";
            String arn = _policy.getArn();
            request.addParameter(prefix, StringUtils.fromString(arn));
        }
        if (_policy.getPath() != null) {
            prefix = _prefix + "Path";
            String path = _policy.getPath();
            request.addParameter(prefix, StringUtils.fromString(path));
        }
        if (_policy.getDefaultVersionId() != null) {
            prefix = _prefix + "DefaultVersionId";
            String defaultVersionId = _policy.getDefaultVersionId();
            request.addParameter(prefix, StringUtils.fromString(defaultVersionId));
        }
        if (_policy.getAttachmentCount() != null) {
            prefix = _prefix + "AttachmentCount";
            Integer attachmentCount = _policy.getAttachmentCount();
            request.addParameter(prefix, StringUtils.fromInteger(attachmentCount));
        }
        if (_policy.getPermissionsBoundaryUsageCount() != null) {
            prefix = _prefix + "PermissionsBoundaryUsageCount";
            Integer permissionsBoundaryUsageCount = _policy.getPermissionsBoundaryUsageCount();
            request.addParameter(prefix, StringUtils.fromInteger(permissionsBoundaryUsageCount));
        }
        if (_policy.getIsAttachable() != null) {
            prefix = _prefix + "IsAttachable";
            Boolean isAttachable = _policy.getIsAttachable();
            request.addParameter(prefix, StringUtils.fromBoolean(isAttachable));
        }
        if (_policy.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _policy.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_policy.getCreateDate() != null) {
            prefix = _prefix + "CreateDate";
            java.util.Date createDate = _policy.getCreateDate();
            request.addParameter(prefix, StringUtils.fromDate(createDate));
        }
        if (_policy.getUpdateDate() != null) {
            prefix = _prefix + "UpdateDate";
            java.util.Date updateDate = _policy.getUpdateDate();
            request.addParameter(prefix, StringUtils.fromDate(updateDate));
        }
    }

    private static PolicyStaxMarshaller instance;

    public static PolicyStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PolicyStaxMarshaller();
        return instance;
    }
}
