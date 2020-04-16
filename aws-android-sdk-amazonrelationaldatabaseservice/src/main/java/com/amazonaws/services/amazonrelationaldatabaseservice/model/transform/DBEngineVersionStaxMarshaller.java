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
 * StAX marshaller for POJO DBEngineVersion
 */
class DBEngineVersionStaxMarshaller {

    public void marshall(DBEngineVersion _dBEngineVersion, Request<?> request, String _prefix) {
        String prefix;
        if (_dBEngineVersion.getEngine() != null) {
            prefix = _prefix + "Engine";
            String engine = _dBEngineVersion.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (_dBEngineVersion.getEngineVersion() != null) {
            prefix = _prefix + "EngineVersion";
            String engineVersion = _dBEngineVersion.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (_dBEngineVersion.getDBParameterGroupFamily() != null) {
            prefix = _prefix + "DBParameterGroupFamily";
            String dBParameterGroupFamily = _dBEngineVersion.getDBParameterGroupFamily();
            request.addParameter(prefix, StringUtils.fromString(dBParameterGroupFamily));
        }
        if (_dBEngineVersion.getDBEngineDescription() != null) {
            prefix = _prefix + "DBEngineDescription";
            String dBEngineDescription = _dBEngineVersion.getDBEngineDescription();
            request.addParameter(prefix, StringUtils.fromString(dBEngineDescription));
        }
        if (_dBEngineVersion.getDBEngineVersionDescription() != null) {
            prefix = _prefix + "DBEngineVersionDescription";
            String dBEngineVersionDescription = _dBEngineVersion.getDBEngineVersionDescription();
            request.addParameter(prefix, StringUtils.fromString(dBEngineVersionDescription));
        }
        if (_dBEngineVersion.getDefaultCharacterSet() != null) {
            prefix = _prefix + "DefaultCharacterSet";
            CharacterSet defaultCharacterSet = _dBEngineVersion.getDefaultCharacterSet();
            CharacterSetStaxMarshaller.getInstance().marshall(defaultCharacterSet, request,
                    prefix + ".");
        }
        if (_dBEngineVersion.getSupportedCharacterSets() != null) {
            prefix = _prefix + "SupportedCharacterSets";
            java.util.List<CharacterSet> supportedCharacterSets = _dBEngineVersion
                    .getSupportedCharacterSets();
            int supportedCharacterSetsIndex = 1;
            String supportedCharacterSetsPrefix = prefix;
            for (CharacterSet supportedCharacterSetsItem : supportedCharacterSets) {
                prefix = supportedCharacterSetsPrefix + "." + supportedCharacterSetsIndex;
                if (supportedCharacterSetsItem != null) {
                    CharacterSetStaxMarshaller.getInstance().marshall(supportedCharacterSetsItem,
                            request, prefix + ".");
                }
                supportedCharacterSetsIndex++;
            }
            prefix = supportedCharacterSetsPrefix;
        }
        if (_dBEngineVersion.getValidUpgradeTarget() != null) {
            prefix = _prefix + "ValidUpgradeTarget";
            java.util.List<UpgradeTarget> validUpgradeTarget = _dBEngineVersion
                    .getValidUpgradeTarget();
            int validUpgradeTargetIndex = 1;
            String validUpgradeTargetPrefix = prefix;
            for (UpgradeTarget validUpgradeTargetItem : validUpgradeTarget) {
                prefix = validUpgradeTargetPrefix + "." + validUpgradeTargetIndex;
                if (validUpgradeTargetItem != null) {
                    UpgradeTargetStaxMarshaller.getInstance().marshall(validUpgradeTargetItem,
                            request, prefix + ".");
                }
                validUpgradeTargetIndex++;
            }
            prefix = validUpgradeTargetPrefix;
        }
        if (_dBEngineVersion.getSupportedTimezones() != null) {
            prefix = _prefix + "SupportedTimezones";
            java.util.List<Timezone> supportedTimezones = _dBEngineVersion.getSupportedTimezones();
            int supportedTimezonesIndex = 1;
            String supportedTimezonesPrefix = prefix;
            for (Timezone supportedTimezonesItem : supportedTimezones) {
                prefix = supportedTimezonesPrefix + "." + supportedTimezonesIndex;
                if (supportedTimezonesItem != null) {
                    TimezoneStaxMarshaller.getInstance().marshall(supportedTimezonesItem, request,
                            prefix + ".");
                }
                supportedTimezonesIndex++;
            }
            prefix = supportedTimezonesPrefix;
        }
        if (_dBEngineVersion.getExportableLogTypes() != null) {
            prefix = _prefix + "ExportableLogTypes";
            java.util.List<String> exportableLogTypes = _dBEngineVersion.getExportableLogTypes();
            int exportableLogTypesIndex = 1;
            String exportableLogTypesPrefix = prefix;
            for (String exportableLogTypesItem : exportableLogTypes) {
                prefix = exportableLogTypesPrefix + ".member." + exportableLogTypesIndex;
                if (exportableLogTypesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(exportableLogTypesItem));
                }
                exportableLogTypesIndex++;
            }
            prefix = exportableLogTypesPrefix;
        }
        if (_dBEngineVersion.getSupportsLogExportsToCloudwatchLogs() != null) {
            prefix = _prefix + "SupportsLogExportsToCloudwatchLogs";
            Boolean supportsLogExportsToCloudwatchLogs = _dBEngineVersion
                    .getSupportsLogExportsToCloudwatchLogs();
            request.addParameter(prefix,
                    StringUtils.fromBoolean(supportsLogExportsToCloudwatchLogs));
        }
        if (_dBEngineVersion.getSupportsReadReplica() != null) {
            prefix = _prefix + "SupportsReadReplica";
            Boolean supportsReadReplica = _dBEngineVersion.getSupportsReadReplica();
            request.addParameter(prefix, StringUtils.fromBoolean(supportsReadReplica));
        }
        if (_dBEngineVersion.getSupportedEngineModes() != null) {
            prefix = _prefix + "SupportedEngineModes";
            java.util.List<String> supportedEngineModes = _dBEngineVersion
                    .getSupportedEngineModes();
            int supportedEngineModesIndex = 1;
            String supportedEngineModesPrefix = prefix;
            for (String supportedEngineModesItem : supportedEngineModes) {
                prefix = supportedEngineModesPrefix + ".member." + supportedEngineModesIndex;
                if (supportedEngineModesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(supportedEngineModesItem));
                }
                supportedEngineModesIndex++;
            }
            prefix = supportedEngineModesPrefix;
        }
        if (_dBEngineVersion.getSupportedFeatureNames() != null) {
            prefix = _prefix + "SupportedFeatureNames";
            java.util.List<String> supportedFeatureNames = _dBEngineVersion
                    .getSupportedFeatureNames();
            int supportedFeatureNamesIndex = 1;
            String supportedFeatureNamesPrefix = prefix;
            for (String supportedFeatureNamesItem : supportedFeatureNames) {
                prefix = supportedFeatureNamesPrefix + ".member." + supportedFeatureNamesIndex;
                if (supportedFeatureNamesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(supportedFeatureNamesItem));
                }
                supportedFeatureNamesIndex++;
            }
            prefix = supportedFeatureNamesPrefix;
        }
        if (_dBEngineVersion.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _dBEngineVersion.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
    }

    private static DBEngineVersionStaxMarshaller instance;

    public static DBEngineVersionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DBEngineVersionStaxMarshaller();
        return instance;
    }
}
