/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.elasticloadbalancing.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO SourceSecurityGroup
 */
class SourceSecurityGroupStaxMarshaller {

    public void marshall(SourceSecurityGroup _sourceSecurityGroup, Request<?> request,
            String _prefix) {
        String prefix;
        if (_sourceSecurityGroup.getOwnerAlias() != null) {
            prefix = _prefix + "OwnerAlias";
            String ownerAlias = _sourceSecurityGroup.getOwnerAlias();
            request.addParameter(prefix, StringUtils.fromString(ownerAlias));
        }
        if (_sourceSecurityGroup.getGroupName() != null) {
            prefix = _prefix + "GroupName";
            String groupName = _sourceSecurityGroup.getGroupName();
            request.addParameter(prefix, StringUtils.fromString(groupName));
        }
    }

    private static SourceSecurityGroupStaxMarshaller instance;

    public static SourceSecurityGroupStaxMarshaller getInstance() {
        if (instance == null)
            instance = new SourceSecurityGroupStaxMarshaller();
        return instance;
    }
}
