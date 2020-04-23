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

package com.amazonaws.services.amazonrelationaldatabaseservice.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO DBSubnetGroup
 */
class DBSubnetGroupStaxMarshaller {

    public void marshall(DBSubnetGroup _dBSubnetGroup, Request<?> request, String _prefix) {
        String prefix;
        if (_dBSubnetGroup.getDBSubnetGroupName() != null) {
            prefix = _prefix + "DBSubnetGroupName";
            String dBSubnetGroupName = _dBSubnetGroup.getDBSubnetGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBSubnetGroupName));
        }
        if (_dBSubnetGroup.getDBSubnetGroupDescription() != null) {
            prefix = _prefix + "DBSubnetGroupDescription";
            String dBSubnetGroupDescription = _dBSubnetGroup.getDBSubnetGroupDescription();
            request.addParameter(prefix, StringUtils.fromString(dBSubnetGroupDescription));
        }
        if (_dBSubnetGroup.getVpcId() != null) {
            prefix = _prefix + "VpcId";
            String vpcId = _dBSubnetGroup.getVpcId();
            request.addParameter(prefix, StringUtils.fromString(vpcId));
        }
        if (_dBSubnetGroup.getSubnetGroupStatus() != null) {
            prefix = _prefix + "SubnetGroupStatus";
            String subnetGroupStatus = _dBSubnetGroup.getSubnetGroupStatus();
            request.addParameter(prefix, StringUtils.fromString(subnetGroupStatus));
        }
        if (_dBSubnetGroup.getSubnets() != null) {
            prefix = _prefix + "Subnets";
            java.util.List<Subnet> subnets = _dBSubnetGroup.getSubnets();
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
        if (_dBSubnetGroup.getDBSubnetGroupArn() != null) {
            prefix = _prefix + "DBSubnetGroupArn";
            String dBSubnetGroupArn = _dBSubnetGroup.getDBSubnetGroupArn();
            request.addParameter(prefix, StringUtils.fromString(dBSubnetGroupArn));
        }
    }

    private static DBSubnetGroupStaxMarshaller instance;

    public static DBSubnetGroupStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DBSubnetGroupStaxMarshaller();
        return instance;
    }
}
