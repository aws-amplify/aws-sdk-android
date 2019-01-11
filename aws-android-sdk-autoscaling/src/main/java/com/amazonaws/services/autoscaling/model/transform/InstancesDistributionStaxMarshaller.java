/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.autoscaling.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO InstancesDistribution
 */
class InstancesDistributionStaxMarshaller {

    public void marshall(InstancesDistribution _instancesDistribution, Request<?> request,
            String _prefix) {
        String prefix;
        if (_instancesDistribution.getOnDemandAllocationStrategy() != null) {
            prefix = _prefix + "OnDemandAllocationStrategy";
            String onDemandAllocationStrategy = _instancesDistribution
                    .getOnDemandAllocationStrategy();
            request.addParameter(prefix, StringUtils.fromString(onDemandAllocationStrategy));
        }
        if (_instancesDistribution.getOnDemandBaseCapacity() != null) {
            prefix = _prefix + "OnDemandBaseCapacity";
            Integer onDemandBaseCapacity = _instancesDistribution.getOnDemandBaseCapacity();
            request.addParameter(prefix, StringUtils.fromInteger(onDemandBaseCapacity));
        }
        if (_instancesDistribution.getOnDemandPercentageAboveBaseCapacity() != null) {
            prefix = _prefix + "OnDemandPercentageAboveBaseCapacity";
            Integer onDemandPercentageAboveBaseCapacity = _instancesDistribution
                    .getOnDemandPercentageAboveBaseCapacity();
            request.addParameter(prefix,
                    StringUtils.fromInteger(onDemandPercentageAboveBaseCapacity));
        }
        if (_instancesDistribution.getSpotAllocationStrategy() != null) {
            prefix = _prefix + "SpotAllocationStrategy";
            String spotAllocationStrategy = _instancesDistribution.getSpotAllocationStrategy();
            request.addParameter(prefix, StringUtils.fromString(spotAllocationStrategy));
        }
        if (_instancesDistribution.getSpotInstancePools() != null) {
            prefix = _prefix + "SpotInstancePools";
            Integer spotInstancePools = _instancesDistribution.getSpotInstancePools();
            request.addParameter(prefix, StringUtils.fromInteger(spotInstancePools));
        }
        if (_instancesDistribution.getSpotMaxPrice() != null) {
            prefix = _prefix + "SpotMaxPrice";
            String spotMaxPrice = _instancesDistribution.getSpotMaxPrice();
            request.addParameter(prefix, StringUtils.fromString(spotMaxPrice));
        }
    }

    private static InstancesDistributionStaxMarshaller instance;

    public static InstancesDistributionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new InstancesDistributionStaxMarshaller();
        return instance;
    }
}
