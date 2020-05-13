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
 * StAX marshaller for POJO ReshardingConfiguration
 */
class ReshardingConfigurationStaxMarshaller {

    public void marshall(ReshardingConfiguration _reshardingConfiguration, Request<?> request,
            String _prefix) {
        String prefix;
        if (_reshardingConfiguration.getNodeGroupId() != null) {
            prefix = _prefix + "NodeGroupId";
            String nodeGroupId = _reshardingConfiguration.getNodeGroupId();
            request.addParameter(prefix, StringUtils.fromString(nodeGroupId));
        }
        if (_reshardingConfiguration.getPreferredAvailabilityZones() != null) {
            prefix = _prefix + "PreferredAvailabilityZones";
            java.util.List<String> preferredAvailabilityZones = _reshardingConfiguration
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

    private static ReshardingConfigurationStaxMarshaller instance;

    public static ReshardingConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ReshardingConfigurationStaxMarshaller();
        return instance;
    }
}
