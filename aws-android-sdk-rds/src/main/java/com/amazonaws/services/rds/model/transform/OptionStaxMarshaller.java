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
 * StAX marshaller for POJO Option
 */
class OptionStaxMarshaller {

    public void marshall(Option _option, Request<?> request, String _prefix) {
        String prefix;
        if (_option.getOptionName() != null) {
            prefix = _prefix + "OptionName";
            String optionName = _option.getOptionName();
            request.addParameter(prefix, StringUtils.fromString(optionName));
        }
        if (_option.getOptionDescription() != null) {
            prefix = _prefix + "OptionDescription";
            String optionDescription = _option.getOptionDescription();
            request.addParameter(prefix, StringUtils.fromString(optionDescription));
        }
        if (_option.getPersistent() != null) {
            prefix = _prefix + "Persistent";
            Boolean persistent = _option.getPersistent();
            request.addParameter(prefix, StringUtils.fromBoolean(persistent));
        }
        if (_option.getPermanent() != null) {
            prefix = _prefix + "Permanent";
            Boolean permanent = _option.getPermanent();
            request.addParameter(prefix, StringUtils.fromBoolean(permanent));
        }
        if (_option.getPort() != null) {
            prefix = _prefix + "Port";
            Integer port = _option.getPort();
            request.addParameter(prefix, StringUtils.fromInteger(port));
        }
        if (_option.getOptionVersion() != null) {
            prefix = _prefix + "OptionVersion";
            String optionVersion = _option.getOptionVersion();
            request.addParameter(prefix, StringUtils.fromString(optionVersion));
        }
        if (_option.getOptionSettings() != null) {
            prefix = _prefix + "OptionSettings";
            java.util.List<OptionSetting> optionSettings = _option.getOptionSettings();
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
        if (_option.getDBSecurityGroupMemberships() != null) {
            prefix = _prefix + "DBSecurityGroupMemberships";
            java.util.List<DBSecurityGroupMembership> dBSecurityGroupMemberships = _option
                    .getDBSecurityGroupMemberships();
            int dBSecurityGroupMembershipsIndex = 1;
            String dBSecurityGroupMembershipsPrefix = prefix;
            for (DBSecurityGroupMembership dBSecurityGroupMembershipsItem : dBSecurityGroupMemberships) {
                prefix = dBSecurityGroupMembershipsPrefix + "." + dBSecurityGroupMembershipsIndex;
                if (dBSecurityGroupMembershipsItem != null) {
                    DBSecurityGroupMembershipStaxMarshaller.getInstance().marshall(
                            dBSecurityGroupMembershipsItem, request, prefix + ".");
                }
                dBSecurityGroupMembershipsIndex++;
            }
            prefix = dBSecurityGroupMembershipsPrefix;
        }
        if (_option.getVpcSecurityGroupMemberships() != null) {
            prefix = _prefix + "VpcSecurityGroupMemberships";
            java.util.List<VpcSecurityGroupMembership> vpcSecurityGroupMemberships = _option
                    .getVpcSecurityGroupMemberships();
            int vpcSecurityGroupMembershipsIndex = 1;
            String vpcSecurityGroupMembershipsPrefix = prefix;
            for (VpcSecurityGroupMembership vpcSecurityGroupMembershipsItem : vpcSecurityGroupMemberships) {
                prefix = vpcSecurityGroupMembershipsPrefix + "." + vpcSecurityGroupMembershipsIndex;
                if (vpcSecurityGroupMembershipsItem != null) {
                    VpcSecurityGroupMembershipStaxMarshaller.getInstance().marshall(
                            vpcSecurityGroupMembershipsItem, request, prefix + ".");
                }
                vpcSecurityGroupMembershipsIndex++;
            }
            prefix = vpcSecurityGroupMembershipsPrefix;
        }
    }

    private static OptionStaxMarshaller instance;

    public static OptionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new OptionStaxMarshaller();
        return instance;
    }
}
