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
 * StAX marshaller for POJO CacheSecurityGroup
 */
class CacheSecurityGroupStaxMarshaller {

    public void marshall(CacheSecurityGroup _cacheSecurityGroup, Request<?> request, String _prefix) {
        String prefix;
        if (_cacheSecurityGroup.getOwnerId() != null) {
            prefix = _prefix + "OwnerId";
            String ownerId = _cacheSecurityGroup.getOwnerId();
            request.addParameter(prefix, StringUtils.fromString(ownerId));
        }
        if (_cacheSecurityGroup.getCacheSecurityGroupName() != null) {
            prefix = _prefix + "CacheSecurityGroupName";
            String cacheSecurityGroupName = _cacheSecurityGroup.getCacheSecurityGroupName();
            request.addParameter(prefix, StringUtils.fromString(cacheSecurityGroupName));
        }
        if (_cacheSecurityGroup.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _cacheSecurityGroup.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_cacheSecurityGroup.getEC2SecurityGroups() != null) {
            prefix = _prefix + "EC2SecurityGroups";
            java.util.List<EC2SecurityGroup> eC2SecurityGroups = _cacheSecurityGroup
                    .getEC2SecurityGroups();
            int eC2SecurityGroupsIndex = 1;
            String eC2SecurityGroupsPrefix = prefix;
            for (EC2SecurityGroup eC2SecurityGroupsItem : eC2SecurityGroups) {
                prefix = eC2SecurityGroupsPrefix + "." + eC2SecurityGroupsIndex;
                if (eC2SecurityGroupsItem != null) {
                    EC2SecurityGroupStaxMarshaller.getInstance().marshall(eC2SecurityGroupsItem,
                            request, prefix + ".");
                }
                eC2SecurityGroupsIndex++;
            }
            prefix = eC2SecurityGroupsPrefix;
        }
        if (_cacheSecurityGroup.getARN() != null) {
            prefix = _prefix + "ARN";
            String aRN = _cacheSecurityGroup.getARN();
            request.addParameter(prefix, StringUtils.fromString(aRN));
        }
    }

    private static CacheSecurityGroupStaxMarshaller instance;

    public static CacheSecurityGroupStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CacheSecurityGroupStaxMarshaller();
        return instance;
    }
}
