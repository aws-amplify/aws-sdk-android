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
 * StAX marshaller for POJO ConfigurationOptionDescription
 */
class ConfigurationOptionDescriptionStaxMarshaller {

    public void marshall(ConfigurationOptionDescription _configurationOptionDescription,
            Request<?> request, String _prefix) {
        String prefix;
        if (_configurationOptionDescription.getNamespace() != null) {
            prefix = _prefix + "Namespace";
            String namespace = _configurationOptionDescription.getNamespace();
            request.addParameter(prefix, StringUtils.fromString(namespace));
        }
        if (_configurationOptionDescription.getName() != null) {
            prefix = _prefix + "Name";
            String name = _configurationOptionDescription.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (_configurationOptionDescription.getDefaultValue() != null) {
            prefix = _prefix + "DefaultValue";
            String defaultValue = _configurationOptionDescription.getDefaultValue();
            request.addParameter(prefix, StringUtils.fromString(defaultValue));
        }
        if (_configurationOptionDescription.getChangeSeverity() != null) {
            prefix = _prefix + "ChangeSeverity";
            String changeSeverity = _configurationOptionDescription.getChangeSeverity();
            request.addParameter(prefix, StringUtils.fromString(changeSeverity));
        }
        if (_configurationOptionDescription.getUserDefined() != null) {
            prefix = _prefix + "UserDefined";
            Boolean userDefined = _configurationOptionDescription.getUserDefined();
            request.addParameter(prefix, StringUtils.fromBoolean(userDefined));
        }
        if (_configurationOptionDescription.getValueType() != null) {
            prefix = _prefix + "ValueType";
            String valueType = _configurationOptionDescription.getValueType();
            request.addParameter(prefix, StringUtils.fromString(valueType));
        }
        if (_configurationOptionDescription.getValueOptions() != null) {
            prefix = _prefix + "ValueOptions";
            java.util.List<String> valueOptions = _configurationOptionDescription.getValueOptions();
            int valueOptionsIndex = 1;
            String valueOptionsPrefix = prefix;
            for (String valueOptionsItem : valueOptions) {
                prefix = valueOptionsPrefix + ".member." + valueOptionsIndex;
                if (valueOptionsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(valueOptionsItem));
                }
                valueOptionsIndex++;
            }
            prefix = valueOptionsPrefix;
        }
        if (_configurationOptionDescription.getMinValue() != null) {
            prefix = _prefix + "MinValue";
            Integer minValue = _configurationOptionDescription.getMinValue();
            request.addParameter(prefix, StringUtils.fromInteger(minValue));
        }
        if (_configurationOptionDescription.getMaxValue() != null) {
            prefix = _prefix + "MaxValue";
            Integer maxValue = _configurationOptionDescription.getMaxValue();
            request.addParameter(prefix, StringUtils.fromInteger(maxValue));
        }
        if (_configurationOptionDescription.getMaxLength() != null) {
            prefix = _prefix + "MaxLength";
            Integer maxLength = _configurationOptionDescription.getMaxLength();
            request.addParameter(prefix, StringUtils.fromInteger(maxLength));
        }
        if (_configurationOptionDescription.getRegex() != null) {
            prefix = _prefix + "Regex";
            OptionRestrictionRegex regex = _configurationOptionDescription.getRegex();
            OptionRestrictionRegexStaxMarshaller.getInstance().marshall(regex, request,
                    prefix + ".");
        }
    }

    private static ConfigurationOptionDescriptionStaxMarshaller instance;

    public static ConfigurationOptionDescriptionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ConfigurationOptionDescriptionStaxMarshaller();
        return instance;
    }
}
