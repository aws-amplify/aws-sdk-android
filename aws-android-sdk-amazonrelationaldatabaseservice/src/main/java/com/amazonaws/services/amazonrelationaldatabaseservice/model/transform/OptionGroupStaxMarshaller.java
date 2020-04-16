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
 * StAX marshaller for POJO OptionGroup
 */
class OptionGroupStaxMarshaller {

    public void marshall(OptionGroup _optionGroup, Request<?> request, String _prefix) {
        String prefix;
        if (_optionGroup.getOptionGroupName() != null) {
            prefix = _prefix + "OptionGroupName";
            String optionGroupName = _optionGroup.getOptionGroupName();
            request.addParameter(prefix, StringUtils.fromString(optionGroupName));
        }
        if (_optionGroup.getOptionGroupDescription() != null) {
            prefix = _prefix + "OptionGroupDescription";
            String optionGroupDescription = _optionGroup.getOptionGroupDescription();
            request.addParameter(prefix, StringUtils.fromString(optionGroupDescription));
        }
        if (_optionGroup.getEngineName() != null) {
            prefix = _prefix + "EngineName";
            String engineName = _optionGroup.getEngineName();
            request.addParameter(prefix, StringUtils.fromString(engineName));
        }
        if (_optionGroup.getMajorEngineVersion() != null) {
            prefix = _prefix + "MajorEngineVersion";
            String majorEngineVersion = _optionGroup.getMajorEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(majorEngineVersion));
        }
        if (_optionGroup.getOptions() != null) {
            prefix = _prefix + "Options";
            java.util.List<Option> options = _optionGroup.getOptions();
            int optionsIndex = 1;
            String optionsPrefix = prefix;
            for (Option optionsItem : options) {
                prefix = optionsPrefix + "." + optionsIndex;
                if (optionsItem != null) {
                    OptionStaxMarshaller.getInstance().marshall(optionsItem, request, prefix + ".");
                }
                optionsIndex++;
            }
            prefix = optionsPrefix;
        }
        if (_optionGroup.getAllowsVpcAndNonVpcInstanceMemberships() != null) {
            prefix = _prefix + "AllowsVpcAndNonVpcInstanceMemberships";
            Boolean allowsVpcAndNonVpcInstanceMemberships = _optionGroup
                    .getAllowsVpcAndNonVpcInstanceMemberships();
            request.addParameter(prefix,
                    StringUtils.fromBoolean(allowsVpcAndNonVpcInstanceMemberships));
        }
        if (_optionGroup.getVpcId() != null) {
            prefix = _prefix + "VpcId";
            String vpcId = _optionGroup.getVpcId();
            request.addParameter(prefix, StringUtils.fromString(vpcId));
        }
        if (_optionGroup.getOptionGroupArn() != null) {
            prefix = _prefix + "OptionGroupArn";
            String optionGroupArn = _optionGroup.getOptionGroupArn();
            request.addParameter(prefix, StringUtils.fromString(optionGroupArn));
        }
    }

    private static OptionGroupStaxMarshaller instance;

    public static OptionGroupStaxMarshaller getInstance() {
        if (instance == null)
            instance = new OptionGroupStaxMarshaller();
        return instance;
    }
}
