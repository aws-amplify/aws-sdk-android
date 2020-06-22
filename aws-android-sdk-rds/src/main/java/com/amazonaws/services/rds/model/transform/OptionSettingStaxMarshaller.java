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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO OptionSetting
 */
class OptionSettingStaxMarshaller {

    public void marshall(OptionSetting _optionSetting, Request<?> request, String _prefix) {
        String prefix;
        if (_optionSetting.getName() != null) {
            prefix = _prefix + "Name";
            String name = _optionSetting.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (_optionSetting.getValue() != null) {
            prefix = _prefix + "Value";
            String value = _optionSetting.getValue();
            request.addParameter(prefix, StringUtils.fromString(value));
        }
        if (_optionSetting.getDefaultValue() != null) {
            prefix = _prefix + "DefaultValue";
            String defaultValue = _optionSetting.getDefaultValue();
            request.addParameter(prefix, StringUtils.fromString(defaultValue));
        }
        if (_optionSetting.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _optionSetting.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_optionSetting.getApplyType() != null) {
            prefix = _prefix + "ApplyType";
            String applyType = _optionSetting.getApplyType();
            request.addParameter(prefix, StringUtils.fromString(applyType));
        }
        if (_optionSetting.getDataType() != null) {
            prefix = _prefix + "DataType";
            String dataType = _optionSetting.getDataType();
            request.addParameter(prefix, StringUtils.fromString(dataType));
        }
        if (_optionSetting.getAllowedValues() != null) {
            prefix = _prefix + "AllowedValues";
            String allowedValues = _optionSetting.getAllowedValues();
            request.addParameter(prefix, StringUtils.fromString(allowedValues));
        }
        if (_optionSetting.getIsModifiable() != null) {
            prefix = _prefix + "IsModifiable";
            Boolean isModifiable = _optionSetting.getIsModifiable();
            request.addParameter(prefix, StringUtils.fromBoolean(isModifiable));
        }
        if (_optionSetting.getIsCollection() != null) {
            prefix = _prefix + "IsCollection";
            Boolean isCollection = _optionSetting.getIsCollection();
            request.addParameter(prefix, StringUtils.fromBoolean(isCollection));
        }
    }

    private static OptionSettingStaxMarshaller instance;

    public static OptionSettingStaxMarshaller getInstance() {
        if (instance == null)
            instance = new OptionSettingStaxMarshaller();
        return instance;
    }
}
