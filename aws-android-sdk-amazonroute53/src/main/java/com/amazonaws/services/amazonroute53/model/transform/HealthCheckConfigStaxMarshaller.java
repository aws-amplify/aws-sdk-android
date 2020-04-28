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

package com.amazonaws.services.amazonroute53.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonroute53.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO HealthCheckConfig
 */
class HealthCheckConfigStaxMarshaller {

    public void marshall(HealthCheckConfig _healthCheckConfig, Request<?> request, String _prefix) {
        String prefix;
        if (_healthCheckConfig.getIPAddress() != null) {
            prefix = _prefix + "IPAddress";
            String iPAddress = _healthCheckConfig.getIPAddress();
            request.addParameter(prefix, StringUtils.fromString(iPAddress));
        }
        if (_healthCheckConfig.getPort() != null) {
            prefix = _prefix + "Port";
            Integer port = _healthCheckConfig.getPort();
            request.addParameter(prefix, StringUtils.fromInteger(port));
        }
        if (_healthCheckConfig.getType() != null) {
            prefix = _prefix + "Type";
            String type = _healthCheckConfig.getType();
            request.addParameter(prefix, StringUtils.fromString(type));
        }
        if (_healthCheckConfig.getResourcePath() != null) {
            prefix = _prefix + "ResourcePath";
            String resourcePath = _healthCheckConfig.getResourcePath();
            request.addParameter(prefix, StringUtils.fromString(resourcePath));
        }
        if (_healthCheckConfig.getFullyQualifiedDomainName() != null) {
            prefix = _prefix + "FullyQualifiedDomainName";
            String fullyQualifiedDomainName = _healthCheckConfig.getFullyQualifiedDomainName();
            request.addParameter(prefix, StringUtils.fromString(fullyQualifiedDomainName));
        }
        if (_healthCheckConfig.getSearchString() != null) {
            prefix = _prefix + "SearchString";
            String searchString = _healthCheckConfig.getSearchString();
            request.addParameter(prefix, StringUtils.fromString(searchString));
        }
        if (_healthCheckConfig.getRequestInterval() != null) {
            prefix = _prefix + "RequestInterval";
            Integer requestInterval = _healthCheckConfig.getRequestInterval();
            request.addParameter(prefix, StringUtils.fromInteger(requestInterval));
        }
        if (_healthCheckConfig.getFailureThreshold() != null) {
            prefix = _prefix + "FailureThreshold";
            Integer failureThreshold = _healthCheckConfig.getFailureThreshold();
            request.addParameter(prefix, StringUtils.fromInteger(failureThreshold));
        }
        if (_healthCheckConfig.getMeasureLatency() != null) {
            prefix = _prefix + "MeasureLatency";
            Boolean measureLatency = _healthCheckConfig.getMeasureLatency();
            request.addParameter(prefix, StringUtils.fromBoolean(measureLatency));
        }
        if (_healthCheckConfig.getInverted() != null) {
            prefix = _prefix + "Inverted";
            Boolean inverted = _healthCheckConfig.getInverted();
            request.addParameter(prefix, StringUtils.fromBoolean(inverted));
        }
        if (_healthCheckConfig.getDisabled() != null) {
            prefix = _prefix + "Disabled";
            Boolean disabled = _healthCheckConfig.getDisabled();
            request.addParameter(prefix, StringUtils.fromBoolean(disabled));
        }
        if (_healthCheckConfig.getHealthThreshold() != null) {
            prefix = _prefix + "HealthThreshold";
            Integer healthThreshold = _healthCheckConfig.getHealthThreshold();
            request.addParameter(prefix, StringUtils.fromInteger(healthThreshold));
        }
        if (_healthCheckConfig.getChildHealthChecks() != null) {
            prefix = _prefix + "ChildHealthChecks";
            java.util.List<String> childHealthChecks = _healthCheckConfig.getChildHealthChecks();
            int childHealthChecksIndex = 1;
            String childHealthChecksPrefix = prefix;
            for (String childHealthChecksItem : childHealthChecks) {
                prefix = childHealthChecksPrefix + "." + childHealthChecksIndex;
                if (childHealthChecksItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(childHealthChecksItem));
                }
                childHealthChecksIndex++;
            }
            prefix = childHealthChecksPrefix;
        }
        if (_healthCheckConfig.getEnableSNI() != null) {
            prefix = _prefix + "EnableSNI";
            Boolean enableSNI = _healthCheckConfig.getEnableSNI();
            request.addParameter(prefix, StringUtils.fromBoolean(enableSNI));
        }
        if (_healthCheckConfig.getRegions() != null) {
            prefix = _prefix + "Regions";
            java.util.List<String> regions = _healthCheckConfig.getRegions();
            int regionsIndex = 1;
            String regionsPrefix = prefix;
            for (String regionsItem : regions) {
                prefix = regionsPrefix + "." + regionsIndex;
                if (regionsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(regionsItem));
                }
                regionsIndex++;
            }
            prefix = regionsPrefix;
        }
        if (_healthCheckConfig.getAlarmIdentifier() != null) {
            prefix = _prefix + "AlarmIdentifier";
            AlarmIdentifier alarmIdentifier = _healthCheckConfig.getAlarmIdentifier();
            AlarmIdentifierStaxMarshaller.getInstance().marshall(alarmIdentifier, request,
                    prefix + ".");
        }
        if (_healthCheckConfig.getInsufficientDataHealthStatus() != null) {
            prefix = _prefix + "InsufficientDataHealthStatus";
            String insufficientDataHealthStatus = _healthCheckConfig
                    .getInsufficientDataHealthStatus();
            request.addParameter(prefix, StringUtils.fromString(insufficientDataHealthStatus));
        }
    }

    private static HealthCheckConfigStaxMarshaller instance;

    public static HealthCheckConfigStaxMarshaller getInstance() {
        if (instance == null)
            instance = new HealthCheckConfigStaxMarshaller();
        return instance;
    }
}
