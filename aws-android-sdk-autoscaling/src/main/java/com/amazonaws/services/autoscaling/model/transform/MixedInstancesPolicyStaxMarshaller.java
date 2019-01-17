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
 * StAX marshaller for POJO MixedInstancesPolicy
 */
class MixedInstancesPolicyStaxMarshaller {

    public void marshall(MixedInstancesPolicy _mixedInstancesPolicy, Request<?> request,
            String _prefix) {
        String prefix;
        if (_mixedInstancesPolicy.getLaunchTemplate() != null) {
            prefix = _prefix + "LaunchTemplate";
            LaunchTemplate launchTemplate = _mixedInstancesPolicy.getLaunchTemplate();
            LaunchTemplateStaxMarshaller.getInstance().marshall(launchTemplate, request,
                    prefix + ".");
        }
        if (_mixedInstancesPolicy.getInstancesDistribution() != null) {
            prefix = _prefix + "InstancesDistribution";
            InstancesDistribution instancesDistribution = _mixedInstancesPolicy
                    .getInstancesDistribution();
            InstancesDistributionStaxMarshaller.getInstance().marshall(instancesDistribution,
                    request, prefix + ".");
        }
    }

    private static MixedInstancesPolicyStaxMarshaller instance;

    public static MixedInstancesPolicyStaxMarshaller getInstance() {
        if (instance == null)
            instance = new MixedInstancesPolicyStaxMarshaller();
        return instance;
    }
}
