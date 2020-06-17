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

package com.amazonaws.services.route53.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for UpdateHealthCheckRequest
 */
public class UpdateHealthCheckRequestMarshaller implements
        Marshaller<Request<UpdateHealthCheckRequest>, UpdateHealthCheckRequest> {

    public Request<UpdateHealthCheckRequest> marshall(
            UpdateHealthCheckRequest updateHealthCheckRequest) {
        if (updateHealthCheckRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateHealthCheckRequest)");
        }

        Request<UpdateHealthCheckRequest> request = new DefaultRequest<UpdateHealthCheckRequest>(
                updateHealthCheckRequest, "AmazonRoute53");
        request.addParameter("Action", "UpdateHealthCheck");
        request.addParameter("Version", "2013-04-01");

        String prefix;
        if (updateHealthCheckRequest.getHealthCheckId() != null) {
            prefix = "HealthCheckId";
            String healthCheckId = updateHealthCheckRequest.getHealthCheckId();
            request.addParameter(prefix, StringUtils.fromString(healthCheckId));
        }
        if (updateHealthCheckRequest.getHealthCheckVersion() != null) {
            prefix = "HealthCheckVersion";
            Long healthCheckVersion = updateHealthCheckRequest.getHealthCheckVersion();
            request.addParameter(prefix, StringUtils.fromLong(healthCheckVersion));
        }
        if (updateHealthCheckRequest.getIPAddress() != null) {
            prefix = "IPAddress";
            String iPAddress = updateHealthCheckRequest.getIPAddress();
            request.addParameter(prefix, StringUtils.fromString(iPAddress));
        }
        if (updateHealthCheckRequest.getPort() != null) {
            prefix = "Port";
            Integer port = updateHealthCheckRequest.getPort();
            request.addParameter(prefix, StringUtils.fromInteger(port));
        }
        if (updateHealthCheckRequest.getResourcePath() != null) {
            prefix = "ResourcePath";
            String resourcePath = updateHealthCheckRequest.getResourcePath();
            request.addParameter(prefix, StringUtils.fromString(resourcePath));
        }
        if (updateHealthCheckRequest.getFullyQualifiedDomainName() != null) {
            prefix = "FullyQualifiedDomainName";
            String fullyQualifiedDomainName = updateHealthCheckRequest
                    .getFullyQualifiedDomainName();
            request.addParameter(prefix, StringUtils.fromString(fullyQualifiedDomainName));
        }
        if (updateHealthCheckRequest.getSearchString() != null) {
            prefix = "SearchString";
            String searchString = updateHealthCheckRequest.getSearchString();
            request.addParameter(prefix, StringUtils.fromString(searchString));
        }
        if (updateHealthCheckRequest.getFailureThreshold() != null) {
            prefix = "FailureThreshold";
            Integer failureThreshold = updateHealthCheckRequest.getFailureThreshold();
            request.addParameter(prefix, StringUtils.fromInteger(failureThreshold));
        }
        if (updateHealthCheckRequest.getInverted() != null) {
            prefix = "Inverted";
            Boolean inverted = updateHealthCheckRequest.getInverted();
            request.addParameter(prefix, StringUtils.fromBoolean(inverted));
        }
        if (updateHealthCheckRequest.getDisabled() != null) {
            prefix = "Disabled";
            Boolean disabled = updateHealthCheckRequest.getDisabled();
            request.addParameter(prefix, StringUtils.fromBoolean(disabled));
        }
        if (updateHealthCheckRequest.getHealthThreshold() != null) {
            prefix = "HealthThreshold";
            Integer healthThreshold = updateHealthCheckRequest.getHealthThreshold();
            request.addParameter(prefix, StringUtils.fromInteger(healthThreshold));
        }
        if (updateHealthCheckRequest.getChildHealthChecks() != null) {
            prefix = "ChildHealthChecks";
            java.util.List<String> childHealthChecks = updateHealthCheckRequest
                    .getChildHealthChecks();
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
        if (updateHealthCheckRequest.getEnableSNI() != null) {
            prefix = "EnableSNI";
            Boolean enableSNI = updateHealthCheckRequest.getEnableSNI();
            request.addParameter(prefix, StringUtils.fromBoolean(enableSNI));
        }
        if (updateHealthCheckRequest.getRegions() != null) {
            prefix = "Regions";
            java.util.List<String> regions = updateHealthCheckRequest.getRegions();
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
        if (updateHealthCheckRequest.getAlarmIdentifier() != null) {
            prefix = "AlarmIdentifier";
            AlarmIdentifier alarmIdentifier = updateHealthCheckRequest.getAlarmIdentifier();
            AlarmIdentifierStaxMarshaller.getInstance().marshall(alarmIdentifier, request,
                    prefix + ".");
        }
        if (updateHealthCheckRequest.getInsufficientDataHealthStatus() != null) {
            prefix = "InsufficientDataHealthStatus";
            String insufficientDataHealthStatus = updateHealthCheckRequest
                    .getInsufficientDataHealthStatus();
            request.addParameter(prefix, StringUtils.fromString(insufficientDataHealthStatus));
        }
        if (updateHealthCheckRequest.getResetElements() != null) {
            prefix = "ResetElements";
            java.util.List<String> resetElements = updateHealthCheckRequest.getResetElements();
            int resetElementsIndex = 1;
            String resetElementsPrefix = prefix;
            for (String resetElementsItem : resetElements) {
                prefix = resetElementsPrefix + "." + resetElementsIndex;
                if (resetElementsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(resetElementsItem));
                }
                resetElementsIndex++;
            }
            prefix = resetElementsPrefix;
        }

        return request;
    }
}
