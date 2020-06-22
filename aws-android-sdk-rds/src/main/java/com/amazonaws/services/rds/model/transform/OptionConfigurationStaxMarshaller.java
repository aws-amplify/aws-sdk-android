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
 * StAX marshaller for POJO OptionConfiguration
 */
class OptionConfigurationStaxMarshaller {

    public void marshall(OptionConfiguration _optionConfiguration, Request<?> request,
            String _prefix) {
        String prefix;
        if (_optionConfiguration.getOptionName() != null) {
            prefix = _prefix + "OptionName";
            String optionName = _optionConfiguration.getOptionName();
            request.addParameter(prefix, StringUtils.fromString(optionName));
        }
        if (_optionConfiguration.getPort() != null) {
            prefix = _prefix + "Port";
            Integer port = _optionConfiguration.getPort();
            request.addParameter(prefix, StringUtils.fromInteger(port));
        }
        if (_optionConfiguration.getOptionVersion() != null) {
            prefix = _prefix + "OptionVersion";
            String optionVersion = _optionConfiguration.getOptionVersion();
            request.addParameter(prefix, StringUtils.fromString(optionVersion));
        }
        if (_optionConfiguration.getDBSecurityGroupMemberships() != null) {
            prefix = _prefix + "DBSecurityGroupMemberships";
            java.util.List<String> dBSecurityGroupMemberships = _optionConfiguration
                    .getDBSecurityGroupMemberships();
            int dBSecurityGroupMembershipsIndex = 1;
            String dBSecurityGroupMembershipsPrefix = prefix;
            for (String dBSecurityGroupMembershipsItem : dBSecurityGroupMemberships) {
                prefix = dBSecurityGroupMembershipsPrefix + "." + dBSecurityGroupMembershipsIndex;
                if (dBSecurityGroupMembershipsItem != null) {
                    request.addParameter(prefix,
                            StringUtils.fromString(dBSecurityGroupMembershipsItem));
                }
                dBSecurityGroupMembershipsIndex++;
            }
            prefix = dBSecurityGroupMembershipsPrefix;
        }
        if (_optionConfiguration.getVpcSecurityGroupMemberships() != null) {
            prefix = _prefix + "VpcSecurityGroupMemberships";
            java.util.List<String> vpcSecurityGroupMemberships = _optionConfiguration
                    .getVpcSecurityGroupMemberships();
            int vpcSecurityGroupMembershipsIndex = 1;
            String vpcSecurityGroupMembershipsPrefix = prefix;
            for (String vpcSecurityGroupMembershipsItem : vpcSecurityGroupMemberships) {
                prefix = vpcSecurityGroupMembershipsPrefix + "." + vpcSecurityGroupMembershipsIndex;
                if (vpcSecurityGroupMembershipsItem != null) {
                    request.addParameter(prefix,
                            StringUtils.fromString(vpcSecurityGroupMembershipsItem));
                }
                vpcSecurityGroupMembershipsIndex++;
            }
            prefix = vpcSecurityGroupMembershipsPrefix;
        }
        if (_optionConfiguration.getOptionSettings() != null) {
            prefix = _prefix + "OptionSettings";
            java.util.List<OptionSetting> optionSettings = _optionConfiguration.getOptionSettings();
            int optionSettingsIndex = 1;
            String optionSettingsPrefix = prefix;
            for (OptionSetting optionSettingsItem : optionSettings) {
                prefix = optionSettingsPrefix + "." + optionSettingsIndex;
                if (optionSettingsItem != null) {
                    OptionSettingStaxMarshaller.getInstance().marshall(optionSettingsItem, request,
                            prefix + ".");
                }
                optionSettingsIndex++;
            }
            prefix = optionSettingsPrefix;
        }
    }

    private static OptionConfigurationStaxMarshaller instance;

    public static OptionConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new OptionConfigurationStaxMarshaller();
        return instance;
    }
}
