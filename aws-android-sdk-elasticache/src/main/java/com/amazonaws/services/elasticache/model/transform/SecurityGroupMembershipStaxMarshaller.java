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

package com.amazonaws.services.elasticache.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO SecurityGroupMembership
 */
class SecurityGroupMembershipStaxMarshaller {

    public void marshall(SecurityGroupMembership _securityGroupMembership, Request<?> request,
            String _prefix) {
        String prefix;
        if (_securityGroupMembership.getSecurityGroupId() != null) {
            prefix = _prefix + "SecurityGroupId";
            String securityGroupId = _securityGroupMembership.getSecurityGroupId();
            request.addParameter(prefix, StringUtils.fromString(securityGroupId));
        }
        if (_securityGroupMembership.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _securityGroupMembership.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
    }

    private static SecurityGroupMembershipStaxMarshaller instance;

    public static SecurityGroupMembershipStaxMarshaller getInstance() {
        if (instance == null)
            instance = new SecurityGroupMembershipStaxMarshaller();
        return instance;
    }
}
