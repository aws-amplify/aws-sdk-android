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
 * StAX marshaller for POJO LaunchTemplate
 */
class LaunchTemplateStaxMarshaller {

    public void marshall(LaunchTemplate _launchTemplate, Request<?> request, String _prefix) {
        String prefix;
        if (_launchTemplate.getLaunchTemplateSpecification() != null) {
            prefix = _prefix + "LaunchTemplateSpecification";
            LaunchTemplateSpecification launchTemplateSpecification = _launchTemplate
                    .getLaunchTemplateSpecification();
            LaunchTemplateSpecificationStaxMarshaller.getInstance().marshall(
                    launchTemplateSpecification, request, prefix + ".");
        }
        if (_launchTemplate.getOverrides() != null) {
            prefix = _prefix + "Overrides";
            java.util.List<LaunchTemplateOverrides> overrides = _launchTemplate.getOverrides();
            int overridesIndex = 1;
            String overridesPrefix = prefix;
            for (LaunchTemplateOverrides overridesItem : overrides) {
                prefix = overridesPrefix + ".member." + overridesIndex;
                if (overridesItem != null) {
                    LaunchTemplateOverridesStaxMarshaller.getInstance().marshall(overridesItem,
                            request, prefix + ".");
                }
                overridesIndex++;
            }
            prefix = overridesPrefix;
        }
    }

    private static LaunchTemplateStaxMarshaller instance;

    public static LaunchTemplateStaxMarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateStaxMarshaller();
        return instance;
    }
}
