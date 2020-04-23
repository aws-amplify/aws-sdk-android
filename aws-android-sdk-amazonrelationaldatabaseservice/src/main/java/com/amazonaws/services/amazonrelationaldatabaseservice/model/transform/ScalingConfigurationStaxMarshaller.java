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

package com.amazonaws.services.amazonrelationaldatabaseservice.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ScalingConfiguration
 */
class ScalingConfigurationStaxMarshaller {

    public void marshall(ScalingConfiguration _scalingConfiguration, Request<?> request,
            String _prefix) {
        String prefix;
        if (_scalingConfiguration.getMinCapacity() != null) {
            prefix = _prefix + "MinCapacity";
            Integer minCapacity = _scalingConfiguration.getMinCapacity();
            request.addParameter(prefix, StringUtils.fromInteger(minCapacity));
        }
        if (_scalingConfiguration.getMaxCapacity() != null) {
            prefix = _prefix + "MaxCapacity";
            Integer maxCapacity = _scalingConfiguration.getMaxCapacity();
            request.addParameter(prefix, StringUtils.fromInteger(maxCapacity));
        }
        if (_scalingConfiguration.getAutoPause() != null) {
            prefix = _prefix + "AutoPause";
            Boolean autoPause = _scalingConfiguration.getAutoPause();
            request.addParameter(prefix, StringUtils.fromBoolean(autoPause));
        }
        if (_scalingConfiguration.getSecondsUntilAutoPause() != null) {
            prefix = _prefix + "SecondsUntilAutoPause";
            Integer secondsUntilAutoPause = _scalingConfiguration.getSecondsUntilAutoPause();
            request.addParameter(prefix, StringUtils.fromInteger(secondsUntilAutoPause));
        }
        if (_scalingConfiguration.getTimeoutAction() != null) {
            prefix = _prefix + "TimeoutAction";
            String timeoutAction = _scalingConfiguration.getTimeoutAction();
            request.addParameter(prefix, StringUtils.fromString(timeoutAction));
        }
    }

    private static ScalingConfigurationStaxMarshaller instance;

    public static ScalingConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ScalingConfigurationStaxMarshaller();
        return instance;
    }
}
