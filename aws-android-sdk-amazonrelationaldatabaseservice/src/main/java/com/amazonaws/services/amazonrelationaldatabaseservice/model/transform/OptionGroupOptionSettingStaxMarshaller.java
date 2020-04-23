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
 * StAX marshaller for POJO OptionGroupOptionSetting
 */
class OptionGroupOptionSettingStaxMarshaller {

    public void marshall(OptionGroupOptionSetting _optionGroupOptionSetting, Request<?> request,
            String _prefix) {
        String prefix;
        if (_optionGroupOptionSetting.getSettingName() != null) {
            prefix = _prefix + "SettingName";
            String settingName = _optionGroupOptionSetting.getSettingName();
            request.addParameter(prefix, StringUtils.fromString(settingName));
        }
        if (_optionGroupOptionSetting.getSettingDescription() != null) {
            prefix = _prefix + "SettingDescription";
            String settingDescription = _optionGroupOptionSetting.getSettingDescription();
            request.addParameter(prefix, StringUtils.fromString(settingDescription));
        }
        if (_optionGroupOptionSetting.getDefaultValue() != null) {
            prefix = _prefix + "DefaultValue";
            String defaultValue = _optionGroupOptionSetting.getDefaultValue();
            request.addParameter(prefix, StringUtils.fromString(defaultValue));
        }
        if (_optionGroupOptionSetting.getApplyType() != null) {
            prefix = _prefix + "ApplyType";
            String applyType = _optionGroupOptionSetting.getApplyType();
            request.addParameter(prefix, StringUtils.fromString(applyType));
        }
        if (_optionGroupOptionSetting.getAllowedValues() != null) {
            prefix = _prefix + "AllowedValues";
            String allowedValues = _optionGroupOptionSetting.getAllowedValues();
            request.addParameter(prefix, StringUtils.fromString(allowedValues));
        }
        if (_optionGroupOptionSetting.getIsModifiable() != null) {
            prefix = _prefix + "IsModifiable";
            Boolean isModifiable = _optionGroupOptionSetting.getIsModifiable();
            request.addParameter(prefix, StringUtils.fromBoolean(isModifiable));
        }
        if (_optionGroupOptionSetting.getIsRequired() != null) {
            prefix = _prefix + "IsRequired";
            Boolean isRequired = _optionGroupOptionSetting.getIsRequired();
            request.addParameter(prefix, StringUtils.fromBoolean(isRequired));
        }
        if (_optionGroupOptionSetting.getMinimumEngineVersionPerAllowedValue() != null) {
            prefix = _prefix + "MinimumEngineVersionPerAllowedValue";
            java.util.List<MinimumEngineVersionPerAllowedValue> minimumEngineVersionPerAllowedValue = _optionGroupOptionSetting
                    .getMinimumEngineVersionPerAllowedValue();
            int minimumEngineVersionPerAllowedValueIndex = 1;
            String minimumEngineVersionPerAllowedValuePrefix = prefix;
            for (MinimumEngineVersionPerAllowedValue minimumEngineVersionPerAllowedValueItem : minimumEngineVersionPerAllowedValue) {
                prefix = minimumEngineVersionPerAllowedValuePrefix + "."
                        + minimumEngineVersionPerAllowedValueIndex;
                if (minimumEngineVersionPerAllowedValueItem != null) {
                    MinimumEngineVersionPerAllowedValueStaxMarshaller.getInstance().marshall(
                            minimumEngineVersionPerAllowedValueItem, request, prefix + ".");
                }
                minimumEngineVersionPerAllowedValueIndex++;
            }
            prefix = minimumEngineVersionPerAllowedValuePrefix;
        }
    }

    private static OptionGroupOptionSettingStaxMarshaller instance;

    public static OptionGroupOptionSettingStaxMarshaller getInstance() {
        if (instance == null)
            instance = new OptionGroupOptionSettingStaxMarshaller();
        return instance;
    }
}
