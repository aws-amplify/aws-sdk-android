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
 * StAX marshaller for POJO CacheSubnetGroup
 */
class CacheSubnetGroupStaxMarshaller {

    public void marshall(CacheSubnetGroup _cacheSubnetGroup, Request<?> request, String _prefix) {
        String prefix;
        if (_cacheSubnetGroup.getCacheSubnetGroupName() != null) {
            prefix = _prefix + "CacheSubnetGroupName";
            String cacheSubnetGroupName = _cacheSubnetGroup.getCacheSubnetGroupName();
            request.addParameter(prefix, StringUtils.fromString(cacheSubnetGroupName));
        }
        if (_cacheSubnetGroup.getCacheSubnetGroupDescription() != null) {
            prefix = _prefix + "CacheSubnetGroupDescription";
            String cacheSubnetGroupDescription = _cacheSubnetGroup.getCacheSubnetGroupDescription();
            request.addParameter(prefix, StringUtils.fromString(cacheSubnetGroupDescription));
        }
        if (_cacheSubnetGroup.getVpcId() != null) {
            prefix = _prefix + "VpcId";
            String vpcId = _cacheSubnetGroup.getVpcId();
            request.addParameter(prefix, StringUtils.fromString(vpcId));
        }
        if (_cacheSubnetGroup.getSubnets() != null) {
            prefix = _prefix + "Subnets";
            java.util.List<Subnet> subnets = _cacheSubnetGroup.getSubnets();
            int subnetsIndex = 1;
            String subnetsPrefix = prefix;
            for (Subnet subnetsItem : subnets) {
                prefix = subnetsPrefix + "." + subnetsIndex;
                if (subnetsItem != null) {
                    SubnetStaxMarshaller.getInstance().marshall(subnetsItem, request, prefix + ".");
                }
                subnetsIndex++;
            }
            prefix = subnetsPrefix;
        }
    }

    private static CacheSubnetGroupStaxMarshaller instance;

    public static CacheSubnetGroupStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CacheSubnetGroupStaxMarshaller();
        return instance;
    }
}
