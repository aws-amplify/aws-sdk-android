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

package com.amazonaws.services.elasticbeanstalk.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ConfigurationOptionSetting
 */
class ConfigurationOptionSettingStaxMarshaller {

    public void marshall(ConfigurationOptionSetting _configurationOptionSetting,
            Request<?> request, String _prefix) {
        String prefix;
        if (_configurationOptionSetting.getResourceName() != null) {
            prefix = _prefix + "ResourceName";
            String resourceName = _configurationOptionSetting.getResourceName();
            request.addParameter(prefix, StringUtils.fromString(resourceName));
        }
        if (_configurationOptionSetting.getNamespace() != null) {
            prefix = _prefix + "Namespace";
            String namespace = _configurationOptionSetting.getNamespace();
            request.addParameter(prefix, StringUtils.fromString(namespace));
        }
        if (_configurationOptionSetting.getOptionName() != null) {
            prefix = _prefix + "OptionName";
            String optionName = _configurationOptionSetting.getOptionName();
            request.addParameter(prefix, StringUtils.fromString(optionName));
        }
        if (_configurationOptionSetting.getValue() != null) {
            prefix = _prefix + "Value";
            String value = _configurationOptionSetting.getValue();
            request.addParameter(prefix, StringUtils.fromString(value));
        }
    }

    private static ConfigurationOptionSettingStaxMarshaller instance;

    public static ConfigurationOptionSettingStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ConfigurationOptionSettingStaxMarshaller();
        return instance;
    }
}
