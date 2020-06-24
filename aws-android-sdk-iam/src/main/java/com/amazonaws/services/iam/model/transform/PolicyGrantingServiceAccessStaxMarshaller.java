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
 * StAX marshaller for POJO PolicyGrantingServiceAccess
 */
class PolicyGrantingServiceAccessStaxMarshaller {

    public void marshall(PolicyGrantingServiceAccess _policyGrantingServiceAccess,
            Request<?> request, String _prefix) {
        String prefix;
        if (_policyGrantingServiceAccess.getPolicyName() != null) {
            prefix = _prefix + "PolicyName";
            String policyName = _policyGrantingServiceAccess.getPolicyName();
            request.addParameter(prefix, StringUtils.fromString(policyName));
        }
        if (_policyGrantingServiceAccess.getPolicyType() != null) {
            prefix = _prefix + "PolicyType";
            String policyType = _policyGrantingServiceAccess.getPolicyType();
            request.addParameter(prefix, StringUtils.fromString(policyType));
        }
        if (_policyGrantingServiceAccess.getPolicyArn() != null) {
            prefix = _prefix + "PolicyArn";
            String policyArn = _policyGrantingServiceAccess.getPolicyArn();
            request.addParameter(prefix, StringUtils.fromString(policyArn));
        }
        if (_policyGrantingServiceAccess.getEntityType() != null) {
            prefix = _prefix + "EntityType";
            String entityType = _policyGrantingServiceAccess.getEntityType();
            request.addParameter(prefix, StringUtils.fromString(entityType));
        }
        if (_policyGrantingServiceAccess.getEntityName() != null) {
            prefix = _prefix + "EntityName";
            String entityName = _policyGrantingServiceAccess.getEntityName();
            request.addParameter(prefix, StringUtils.fromString(entityName));
        }
    }

    private static PolicyGrantingServiceAccessStaxMarshaller instance;

    public static PolicyGrantingServiceAccessStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PolicyGrantingServiceAccessStaxMarshaller();
        return instance;
    }
}
