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
 * StAX marshaller for POJO EC2SecurityGroup
 */
class EC2SecurityGroupStaxMarshaller {

    public void marshall(EC2SecurityGroup _eC2SecurityGroup, Request<?> request, String _prefix) {
        String prefix;
        if (_eC2SecurityGroup.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _eC2SecurityGroup.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_eC2SecurityGroup.getEC2SecurityGroupName() != null) {
            prefix = _prefix + "EC2SecurityGroupName";
            String eC2SecurityGroupName = _eC2SecurityGroup.getEC2SecurityGroupName();
            request.addParameter(prefix, StringUtils.fromString(eC2SecurityGroupName));
        }
        if (_eC2SecurityGroup.getEC2SecurityGroupOwnerId() != null) {
            prefix = _prefix + "EC2SecurityGroupOwnerId";
            String eC2SecurityGroupOwnerId = _eC2SecurityGroup.getEC2SecurityGroupOwnerId();
            request.addParameter(prefix, StringUtils.fromString(eC2SecurityGroupOwnerId));
        }
    }

    private static EC2SecurityGroupStaxMarshaller instance;

    public static EC2SecurityGroupStaxMarshaller getInstance() {
        if (instance == null)
            instance = new EC2SecurityGroupStaxMarshaller();
        return instance;
    }
}
