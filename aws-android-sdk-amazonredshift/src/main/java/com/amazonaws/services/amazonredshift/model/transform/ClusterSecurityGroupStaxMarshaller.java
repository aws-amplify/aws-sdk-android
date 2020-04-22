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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ClusterSecurityGroup
 */
class ClusterSecurityGroupStaxMarshaller {

    public void marshall(ClusterSecurityGroup _clusterSecurityGroup, Request<?> request,
            String _prefix) {
        String prefix;
        if (_clusterSecurityGroup.getClusterSecurityGroupName() != null) {
            prefix = _prefix + "ClusterSecurityGroupName";
            String clusterSecurityGroupName = _clusterSecurityGroup.getClusterSecurityGroupName();
            request.addParameter(prefix, StringUtils.fromString(clusterSecurityGroupName));
        }
        if (_clusterSecurityGroup.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _clusterSecurityGroup.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_clusterSecurityGroup.getEC2SecurityGroups() != null) {
            prefix = _prefix + "EC2SecurityGroups";
            java.util.List<EC2SecurityGroup> eC2SecurityGroups = _clusterSecurityGroup
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
        if (_clusterSecurityGroup.getIPRanges() != null) {
            prefix = _prefix + "IPRanges";
            java.util.List<IPRange> iPRanges = _clusterSecurityGroup.getIPRanges();
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
        if (_clusterSecurityGroup.getTags() != null) {
            prefix = _prefix + "Tags";
            java.util.List<Tag> tags = _clusterSecurityGroup.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix;
            for (Tag tagsItem : tags) {
                prefix = tagsPrefix + "." + tagsIndex;
                if (tagsItem != null) {
                    TagStaxMarshaller.getInstance().marshall(tagsItem, request, prefix + ".");
                }
                tagsIndex++;
            }
            prefix = tagsPrefix;
        }
    }

    private static ClusterSecurityGroupStaxMarshaller instance;

    public static ClusterSecurityGroupStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ClusterSecurityGroupStaxMarshaller();
        return instance;
    }
}
