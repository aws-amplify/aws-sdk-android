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
 * StAX marshaller for POJO NodeGroupConfiguration
 */
class NodeGroupConfigurationStaxMarshaller {

    public void marshall(NodeGroupConfiguration _nodeGroupConfiguration, Request<?> request,
            String _prefix) {
        String prefix;
        if (_nodeGroupConfiguration.getNodeGroupId() != null) {
            prefix = _prefix + "NodeGroupId";
            String nodeGroupId = _nodeGroupConfiguration.getNodeGroupId();
            request.addParameter(prefix, StringUtils.fromString(nodeGroupId));
        }
        if (_nodeGroupConfiguration.getSlots() != null) {
            prefix = _prefix + "Slots";
            String slots = _nodeGroupConfiguration.getSlots();
            request.addParameter(prefix, StringUtils.fromString(slots));
        }
        if (_nodeGroupConfiguration.getReplicaCount() != null) {
            prefix = _prefix + "ReplicaCount";
            Integer replicaCount = _nodeGroupConfiguration.getReplicaCount();
            request.addParameter(prefix, StringUtils.fromInteger(replicaCount));
        }
        if (_nodeGroupConfiguration.getPrimaryAvailabilityZone() != null) {
            prefix = _prefix + "PrimaryAvailabilityZone";
            String primaryAvailabilityZone = _nodeGroupConfiguration.getPrimaryAvailabilityZone();
            request.addParameter(prefix, StringUtils.fromString(primaryAvailabilityZone));
        }
        if (_nodeGroupConfiguration.getReplicaAvailabilityZones() != null) {
            prefix = _prefix + "ReplicaAvailabilityZones";
            java.util.List<String> replicaAvailabilityZones = _nodeGroupConfiguration
                    .getReplicaAvailabilityZones();
            int replicaAvailabilityZonesIndex = 1;
            String replicaAvailabilityZonesPrefix = prefix;
            for (String replicaAvailabilityZonesItem : replicaAvailabilityZones) {
                prefix = replicaAvailabilityZonesPrefix + "." + replicaAvailabilityZonesIndex;
                if (replicaAvailabilityZonesItem != null) {
                    request.addParameter(prefix,
                            StringUtils.fromString(replicaAvailabilityZonesItem));
                }
                replicaAvailabilityZonesIndex++;
            }
            prefix = replicaAvailabilityZonesPrefix;
        }
    }

    private static NodeGroupConfigurationStaxMarshaller instance;

    public static NodeGroupConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new NodeGroupConfigurationStaxMarshaller();
        return instance;
    }
}
