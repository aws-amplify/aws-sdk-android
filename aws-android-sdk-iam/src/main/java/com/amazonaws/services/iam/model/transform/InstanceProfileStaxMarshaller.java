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
 * StAX marshaller for POJO InstanceProfile
 */
class InstanceProfileStaxMarshaller {

    public void marshall(InstanceProfile _instanceProfile, Request<?> request, String _prefix) {
        String prefix;
        if (_instanceProfile.getPath() != null) {
            prefix = _prefix + "Path";
            String path = _instanceProfile.getPath();
            request.addParameter(prefix, StringUtils.fromString(path));
        }
        if (_instanceProfile.getInstanceProfileName() != null) {
            prefix = _prefix + "InstanceProfileName";
            String instanceProfileName = _instanceProfile.getInstanceProfileName();
            request.addParameter(prefix, StringUtils.fromString(instanceProfileName));
        }
        if (_instanceProfile.getInstanceProfileId() != null) {
            prefix = _prefix + "InstanceProfileId";
            String instanceProfileId = _instanceProfile.getInstanceProfileId();
            request.addParameter(prefix, StringUtils.fromString(instanceProfileId));
        }
        if (_instanceProfile.getArn() != null) {
            prefix = _prefix + "Arn";
            String arn = _instanceProfile.getArn();
            request.addParameter(prefix, StringUtils.fromString(arn));
        }
        if (_instanceProfile.getCreateDate() != null) {
            prefix = _prefix + "CreateDate";
            java.util.Date createDate = _instanceProfile.getCreateDate();
            request.addParameter(prefix, StringUtils.fromDate(createDate));
        }
        if (_instanceProfile.getRoles() != null) {
            prefix = _prefix + "Roles";
            java.util.List<Role> roles = _instanceProfile.getRoles();
            int rolesIndex = 1;
            String rolesPrefix = prefix;
            for (Role rolesItem : roles) {
                prefix = rolesPrefix + ".member." + rolesIndex;
                if (rolesItem != null) {
                    RoleStaxMarshaller.getInstance().marshall(rolesItem, request, prefix + ".");
                }
                rolesIndex++;
            }
            prefix = rolesPrefix;
        }
    }

    private static InstanceProfileStaxMarshaller instance;

    public static InstanceProfileStaxMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceProfileStaxMarshaller();
        return instance;
    }
}
