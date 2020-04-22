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
 * StAX marshaller for POJO ClusterSubnetGroup
 */
class ClusterSubnetGroupStaxMarshaller {

    public void marshall(ClusterSubnetGroup _clusterSubnetGroup, Request<?> request, String _prefix) {
        String prefix;
        if (_clusterSubnetGroup.getClusterSubnetGroupName() != null) {
            prefix = _prefix + "ClusterSubnetGroupName";
            String clusterSubnetGroupName = _clusterSubnetGroup.getClusterSubnetGroupName();
            request.addParameter(prefix, StringUtils.fromString(clusterSubnetGroupName));
        }
        if (_clusterSubnetGroup.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _clusterSubnetGroup.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_clusterSubnetGroup.getVpcId() != null) {
            prefix = _prefix + "VpcId";
            String vpcId = _clusterSubnetGroup.getVpcId();
            request.addParameter(prefix, StringUtils.fromString(vpcId));
        }
        if (_clusterSubnetGroup.getSubnetGroupStatus() != null) {
            prefix = _prefix + "SubnetGroupStatus";
            String subnetGroupStatus = _clusterSubnetGroup.getSubnetGroupStatus();
            request.addParameter(prefix, StringUtils.fromString(subnetGroupStatus));
        }
        if (_clusterSubnetGroup.getSubnets() != null) {
            prefix = _prefix + "Subnets";
            java.util.List<Subnet> subnets = _clusterSubnetGroup.getSubnets();
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
        if (_clusterSubnetGroup.getTags() != null) {
            prefix = _prefix + "Tags";
            java.util.List<Tag> tags = _clusterSubnetGroup.getTags();
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

    private static ClusterSubnetGroupStaxMarshaller instance;

    public static ClusterSubnetGroupStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ClusterSubnetGroupStaxMarshaller();
        return instance;
    }
}
