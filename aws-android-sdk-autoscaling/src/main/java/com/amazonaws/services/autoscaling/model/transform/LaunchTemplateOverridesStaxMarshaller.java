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
 * StAX marshaller for POJO LaunchTemplateOverrides
 */
class LaunchTemplateOverridesStaxMarshaller {

    public void marshall(LaunchTemplateOverrides _launchTemplateOverrides, Request<?> request,
            String _prefix) {
        String prefix;
        if (_launchTemplateOverrides.getInstanceType() != null) {
            prefix = _prefix + "InstanceType";
            String instanceType = _launchTemplateOverrides.getInstanceType();
            request.addParameter(prefix, StringUtils.fromString(instanceType));
        }
    }

    private static LaunchTemplateOverridesStaxMarshaller instance;

    public static LaunchTemplateOverridesStaxMarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateOverridesStaxMarshaller();
        return instance;
    }
}
