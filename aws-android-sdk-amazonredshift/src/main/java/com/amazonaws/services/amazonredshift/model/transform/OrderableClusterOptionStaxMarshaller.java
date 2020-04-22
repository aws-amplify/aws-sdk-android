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
 * StAX marshaller for POJO OrderableClusterOption
 */
class OrderableClusterOptionStaxMarshaller {

    public void marshall(OrderableClusterOption _orderableClusterOption, Request<?> request,
            String _prefix) {
        String prefix;
        if (_orderableClusterOption.getClusterVersion() != null) {
            prefix = _prefix + "ClusterVersion";
            String clusterVersion = _orderableClusterOption.getClusterVersion();
            request.addParameter(prefix, StringUtils.fromString(clusterVersion));
        }
        if (_orderableClusterOption.getClusterType() != null) {
            prefix = _prefix + "ClusterType";
            String clusterType = _orderableClusterOption.getClusterType();
            request.addParameter(prefix, StringUtils.fromString(clusterType));
        }
        if (_orderableClusterOption.getNodeType() != null) {
            prefix = _prefix + "NodeType";
            String nodeType = _orderableClusterOption.getNodeType();
            request.addParameter(prefix, StringUtils.fromString(nodeType));
        }
        if (_orderableClusterOption.getAvailabilityZones() != null) {
            prefix = _prefix + "AvailabilityZones";
            java.util.List<AvailabilityZone> availabilityZones = _orderableClusterOption
                    .getAvailabilityZones();
            int availabilityZonesIndex = 1;
            String availabilityZonesPrefix = prefix;
            for (AvailabilityZone availabilityZonesItem : availabilityZones) {
                prefix = availabilityZonesPrefix + "." + availabilityZonesIndex;
                if (availabilityZonesItem != null) {
                    AvailabilityZoneStaxMarshaller.getInstance().marshall(availabilityZonesItem,
                            request, prefix + ".");
                }
                availabilityZonesIndex++;
            }
            prefix = availabilityZonesPrefix;
        }
    }

    private static OrderableClusterOptionStaxMarshaller instance;

    public static OrderableClusterOptionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new OrderableClusterOptionStaxMarshaller();
        return instance;
    }
}
