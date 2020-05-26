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
 * StAX marshaller for POJO ConfigureShard
 */
class ConfigureShardStaxMarshaller {

    public void marshall(ConfigureShard _configureShard, Request<?> request, String _prefix) {
        String prefix;
        if (_configureShard.getNodeGroupId() != null) {
            prefix = _prefix + "NodeGroupId";
            String nodeGroupId = _configureShard.getNodeGroupId();
            request.addParameter(prefix, StringUtils.fromString(nodeGroupId));
        }
        if (_configureShard.getNewReplicaCount() != null) {
            prefix = _prefix + "NewReplicaCount";
            Integer newReplicaCount = _configureShard.getNewReplicaCount();
            request.addParameter(prefix, StringUtils.fromInteger(newReplicaCount));
        }
        if (_configureShard.getPreferredAvailabilityZones() != null) {
            prefix = _prefix + "PreferredAvailabilityZones";
            java.util.List<String> preferredAvailabilityZones = _configureShard
                    .getPreferredAvailabilityZones();
            int preferredAvailabilityZonesIndex = 1;
            String preferredAvailabilityZonesPrefix = prefix;
            for (String preferredAvailabilityZonesItem : preferredAvailabilityZones) {
                prefix = preferredAvailabilityZonesPrefix + "." + preferredAvailabilityZonesIndex;
                if (preferredAvailabilityZonesItem != null) {
                    request.addParameter(prefix,
                            StringUtils.fromString(preferredAvailabilityZonesItem));
                }
                preferredAvailabilityZonesIndex++;
            }
            prefix = preferredAvailabilityZonesPrefix;
        }
    }

    private static ConfigureShardStaxMarshaller instance;

    public static ConfigureShardStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ConfigureShardStaxMarshaller();
        return instance;
    }
}
