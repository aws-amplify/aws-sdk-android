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
 * StAX marshaller for POJO OptionGroupOption
 */
class OptionGroupOptionStaxMarshaller {

    public void marshall(OptionGroupOption _optionGroupOption, Request<?> request, String _prefix) {
        String prefix;
        if (_optionGroupOption.getName() != null) {
            prefix = _prefix + "Name";
            String name = _optionGroupOption.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (_optionGroupOption.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _optionGroupOption.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_optionGroupOption.getEngineName() != null) {
            prefix = _prefix + "EngineName";
            String engineName = _optionGroupOption.getEngineName();
            request.addParameter(prefix, StringUtils.fromString(engineName));
        }
        if (_optionGroupOption.getMajorEngineVersion() != null) {
            prefix = _prefix + "MajorEngineVersion";
            String majorEngineVersion = _optionGroupOption.getMajorEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(majorEngineVersion));
        }
        if (_optionGroupOption.getMinimumRequiredMinorEngineVersion() != null) {
            prefix = _prefix + "MinimumRequiredMinorEngineVersion";
            String minimumRequiredMinorEngineVersion = _optionGroupOption
                    .getMinimumRequiredMinorEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(minimumRequiredMinorEngineVersion));
        }
        if (_optionGroupOption.getPortRequired() != null) {
            prefix = _prefix + "PortRequired";
            Boolean portRequired = _optionGroupOption.getPortRequired();
            request.addParameter(prefix, StringUtils.fromBoolean(portRequired));
        }
        if (_optionGroupOption.getDefaultPort() != null) {
            prefix = _prefix + "DefaultPort";
            Integer defaultPort = _optionGroupOption.getDefaultPort();
            request.addParameter(prefix, StringUtils.fromInteger(defaultPort));
        }
        if (_optionGroupOption.getOptionsDependedOn() != null) {
            prefix = _prefix + "OptionsDependedOn";
            java.util.List<String> optionsDependedOn = _optionGroupOption.getOptionsDependedOn();
            int optionsDependedOnIndex = 1;
            String optionsDependedOnPrefix = prefix;
            for (String optionsDependedOnItem : optionsDependedOn) {
                prefix = optionsDependedOnPrefix + "." + optionsDependedOnIndex;
                if (optionsDependedOnItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(optionsDependedOnItem));
                }
                optionsDependedOnIndex++;
            }
            prefix = optionsDependedOnPrefix;
        }
        if (_optionGroupOption.getOptionsConflictsWith() != null) {
            prefix = _prefix + "OptionsConflictsWith";
            java.util.List<String> optionsConflictsWith = _optionGroupOption
                    .getOptionsConflictsWith();
            int optionsConflictsWithIndex = 1;
            String optionsConflictsWithPrefix = prefix;
            for (String optionsConflictsWithItem : optionsConflictsWith) {
                prefix = optionsConflictsWithPrefix + "." + optionsConflictsWithIndex;
                if (optionsConflictsWithItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(optionsConflictsWithItem));
                }
                optionsConflictsWithIndex++;
            }
            prefix = optionsConflictsWithPrefix;
        }
        if (_optionGroupOption.getPersistent() != null) {
            prefix = _prefix + "Persistent";
            Boolean persistent = _optionGroupOption.getPersistent();
            request.addParameter(prefix, StringUtils.fromBoolean(persistent));
        }
        if (_optionGroupOption.getPermanent() != null) {
            prefix = _prefix + "Permanent";
            Boolean permanent = _optionGroupOption.getPermanent();
            request.addParameter(prefix, StringUtils.fromBoolean(permanent));
        }
        if (_optionGroupOption.getRequiresAutoMinorEngineVersionUpgrade() != null) {
            prefix = _prefix + "RequiresAutoMinorEngineVersionUpgrade";
            Boolean requiresAutoMinorEngineVersionUpgrade = _optionGroupOption
                    .getRequiresAutoMinorEngineVersionUpgrade();
            request.addParameter(prefix,
                    StringUtils.fromBoolean(requiresAutoMinorEngineVersionUpgrade));
        }
        if (_optionGroupOption.getVpcOnly() != null) {
            prefix = _prefix + "VpcOnly";
            Boolean vpcOnly = _optionGroupOption.getVpcOnly();
            request.addParameter(prefix, StringUtils.fromBoolean(vpcOnly));
        }
        if (_optionGroupOption.getSupportsOptionVersionDowngrade() != null) {
            prefix = _prefix + "SupportsOptionVersionDowngrade";
            Boolean supportsOptionVersionDowngrade = _optionGroupOption
                    .getSupportsOptionVersionDowngrade();
            request.addParameter(prefix, StringUtils.fromBoolean(supportsOptionVersionDowngrade));
        }
        if (_optionGroupOption.getOptionGroupOptionSettings() != null) {
            prefix = _prefix + "OptionGroupOptionSettings";
            java.util.List<OptionGroupOptionSetting> optionGroupOptionSettings = _optionGroupOption
                    .getOptionGroupOptionSettings();
            int optionGroupOptionSettingsIndex = 1;
            String optionGroupOptionSettingsPrefix = prefix;
            for (OptionGroupOptionSetting optionGroupOptionSettingsItem : optionGroupOptionSettings) {
                prefix = optionGroupOptionSettingsPrefix + "." + optionGroupOptionSettingsIndex;
                if (optionGroupOptionSettingsItem != null) {
                    OptionGroupOptionSettingStaxMarshaller.getInstance().marshall(
                            optionGroupOptionSettingsItem, request, prefix + ".");
                }
                optionGroupOptionSettingsIndex++;
            }
            prefix = optionGroupOptionSettingsPrefix;
        }
        if (_optionGroupOption.getOptionGroupOptionVersions() != null) {
            prefix = _prefix + "OptionGroupOptionVersions";
            java.util.List<OptionVersion> optionGroupOptionVersions = _optionGroupOption
                    .getOptionGroupOptionVersions();
            int optionGroupOptionVersionsIndex = 1;
            String optionGroupOptionVersionsPrefix = prefix;
            for (OptionVersion optionGroupOptionVersionsItem : optionGroupOptionVersions) {
                prefix = optionGroupOptionVersionsPrefix + "." + optionGroupOptionVersionsIndex;
                if (optionGroupOptionVersionsItem != null) {
                    OptionVersionStaxMarshaller.getInstance().marshall(
                            optionGroupOptionVersionsItem, request, prefix + ".");
                }
                optionGroupOptionVersionsIndex++;
            }
            prefix = optionGroupOptionVersionsPrefix;
        }
    }

    private static OptionGroupOptionStaxMarshaller instance;

    public static OptionGroupOptionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new OptionGroupOptionStaxMarshaller();
        return instance;
    }
}
