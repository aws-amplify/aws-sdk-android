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
 * StAX marshaller for POJO DBSecurityGroup
 */
class DBSecurityGroupStaxMarshaller {

    public void marshall(DBSecurityGroup _dBSecurityGroup, Request<?> request, String _prefix) {
        String prefix;
        if (_dBSecurityGroup.getOwnerId() != null) {
            prefix = _prefix + "OwnerId";
            String ownerId = _dBSecurityGroup.getOwnerId();
            request.addParameter(prefix, StringUtils.fromString(ownerId));
        }
        if (_dBSecurityGroup.getDBSecurityGroupName() != null) {
            prefix = _prefix + "DBSecurityGroupName";
            String dBSecurityGroupName = _dBSecurityGroup.getDBSecurityGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBSecurityGroupName));
        }
        if (_dBSecurityGroup.getDBSecurityGroupDescription() != null) {
            prefix = _prefix + "DBSecurityGroupDescription";
            String dBSecurityGroupDescription = _dBSecurityGroup.getDBSecurityGroupDescription();
            request.addParameter(prefix, StringUtils.fromString(dBSecurityGroupDescription));
        }
        if (_dBSecurityGroup.getVpcId() != null) {
            prefix = _prefix + "VpcId";
            String vpcId = _dBSecurityGroup.getVpcId();
            request.addParameter(prefix, StringUtils.fromString(vpcId));
        }
        if (_dBSecurityGroup.getEC2SecurityGroups() != null) {
            prefix = _prefix + "EC2SecurityGroups";
            java.util.List<EC2SecurityGroup> eC2SecurityGroups = _dBSecurityGroup
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
        if (_dBSecurityGroup.getIPRanges() != null) {
            prefix = _prefix + "IPRanges";
            java.util.List<IPRange> iPRanges = _dBSecurityGroup.getIPRanges();
            int iPRangesIndex = 1;
            String iPRangesPrefix = prefix;
            for (IPRange iPRangesItem : iPRanges) {
                prefix = iPRangesPrefix + "." + iPRangesIndex;
                if (iPRangesItem != null) {
                    IPRangeStaxMarshaller.getInstance().marshall(iPRangesItem, request,
                            prefix + ".");
                }
                iPRangesIndex++;
            }
            prefix = iPRangesPrefix;
        }
        if (_dBSecurityGroup.getDBSecurityGroupArn() != null) {
            prefix = _prefix + "DBSecurityGroupArn";
            String dBSecurityGroupArn = _dBSecurityGroup.getDBSecurityGroupArn();
            request.addParameter(prefix, StringUtils.fromString(dBSecurityGroupArn));
        }
    }

    private static DBSecurityGroupStaxMarshaller instance;

    public static DBSecurityGroupStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DBSecurityGroupStaxMarshaller();
        return instance;
    }
}
