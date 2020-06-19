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
 * StAX marshaller for POJO RegionalConfiguration
 */
class RegionalConfigurationStaxMarshaller {

    public void marshall(RegionalConfiguration _regionalConfiguration, Request<?> request,
            String _prefix) {
        String prefix;
        if (_regionalConfiguration.getReplicationGroupId() != null) {
            prefix = _prefix + "ReplicationGroupId";
            String replicationGroupId = _regionalConfiguration.getReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(replicationGroupId));
        }
        if (_regionalConfiguration.getReplicationGroupRegion() != null) {
            prefix = _prefix + "ReplicationGroupRegion";
            String replicationGroupRegion = _regionalConfiguration.getReplicationGroupRegion();
            request.addParameter(prefix, StringUtils.fromString(replicationGroupRegion));
        }
        if (_regionalConfiguration.getReshardingConfiguration() != null) {
            prefix = _prefix + "ReshardingConfiguration";
            java.util.List<ReshardingConfiguration> reshardingConfiguration = _regionalConfiguration
                    .getReshardingConfiguration();
            int reshardingConfigurationIndex = 1;
            String reshardingConfigurationPrefix = prefix;
            for (ReshardingConfiguration reshardingConfigurationItem : reshardingConfiguration) {
                prefix = reshardingConfigurationPrefix + "." + reshardingConfigurationIndex;
                if (reshardingConfigurationItem != null) {
                    ReshardingConfigurationStaxMarshaller.getInstance().marshall(
                            reshardingConfigurationItem, request, prefix + ".");
                }
                reshardingConfigurationIndex++;
            }
            prefix = reshardingConfigurationPrefix;
        }
    }

    private static RegionalConfigurationStaxMarshaller instance;

    public static RegionalConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new RegionalConfigurationStaxMarshaller();
        return instance;
    }
}
