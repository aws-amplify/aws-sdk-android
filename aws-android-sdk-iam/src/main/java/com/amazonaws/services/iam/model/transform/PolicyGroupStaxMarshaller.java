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
 * StAX marshaller for POJO PolicyGroup
 */
class PolicyGroupStaxMarshaller {

    public void marshall(PolicyGroup _policyGroup, Request<?> request, String _prefix) {
        String prefix;
        if (_policyGroup.getGroupName() != null) {
            prefix = _prefix + "GroupName";
            String groupName = _policyGroup.getGroupName();
            request.addParameter(prefix, StringUtils.fromString(groupName));
        }
        if (_policyGroup.getGroupId() != null) {
            prefix = _prefix + "GroupId";
            String groupId = _policyGroup.getGroupId();
            request.addParameter(prefix, StringUtils.fromString(groupId));
        }
    }

    private static PolicyGroupStaxMarshaller instance;

    public static PolicyGroupStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PolicyGroupStaxMarshaller();
        return instance;
    }
}
