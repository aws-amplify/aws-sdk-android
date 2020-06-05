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
 * StAX marshaller for POJO EnvironmentDescription
 */
class EnvironmentDescriptionStaxMarshaller {

    public void marshall(EnvironmentDescription _environmentDescription, Request<?> request,
            String _prefix) {
        String prefix;
        if (_environmentDescription.getEnvironmentName() != null) {
            prefix = _prefix + "EnvironmentName";
            String environmentName = _environmentDescription.getEnvironmentName();
            request.addParameter(prefix, StringUtils.fromString(environmentName));
        }
        if (_environmentDescription.getEnvironmentId() != null) {
            prefix = _prefix + "EnvironmentId";
            String environmentId = _environmentDescription.getEnvironmentId();
            request.addParameter(prefix, StringUtils.fromString(environmentId));
        }
        if (_environmentDescription.getApplicationName() != null) {
            prefix = _prefix + "ApplicationName";
            String applicationName = _environmentDescription.getApplicationName();
            request.addParameter(prefix, StringUtils.fromString(applicationName));
        }
        if (_environmentDescription.getVersionLabel() != null) {
            prefix = _prefix + "VersionLabel";
            String versionLabel = _environmentDescription.getVersionLabel();
            request.addParameter(prefix, StringUtils.fromString(versionLabel));
        }
        if (_environmentDescription.getSolutionStackName() != null) {
            prefix = _prefix + "SolutionStackName";
            String solutionStackName = _environmentDescription.getSolutionStackName();
            request.addParameter(prefix, StringUtils.fromString(solutionStackName));
        }
        if (_environmentDescription.getPlatformArn() != null) {
            prefix = _prefix + "PlatformArn";
            String platformArn = _environmentDescription.getPlatformArn();
            request.addParameter(prefix, StringUtils.fromString(platformArn));
        }
        if (_environmentDescription.getTemplateName() != null) {
            prefix = _prefix + "TemplateName";
            String templateName = _environmentDescription.getTemplateName();
            request.addParameter(prefix, StringUtils.fromString(templateName));
        }
        if (_environmentDescription.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _environmentDescription.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_environmentDescription.getEndpointURL() != null) {
            prefix = _prefix + "EndpointURL";
            String endpointURL = _environmentDescription.getEndpointURL();
            request.addParameter(prefix, StringUtils.fromString(endpointURL));
        }
        if (_environmentDescription.getCNAME() != null) {
            prefix = _prefix + "CNAME";
            String cNAME = _environmentDescription.getCNAME();
            request.addParameter(prefix, StringUtils.fromString(cNAME));
        }
        if (_environmentDescription.getDateCreated() != null) {
            prefix = _prefix + "DateCreated";
            java.util.Date dateCreated = _environmentDescription.getDateCreated();
            request.addParameter(prefix, StringUtils.fromDate(dateCreated));
        }
        if (_environmentDescription.getDateUpdated() != null) {
            prefix = _prefix + "DateUpdated";
            java.util.Date dateUpdated = _environmentDescription.getDateUpdated();
            request.addParameter(prefix, StringUtils.fromDate(dateUpdated));
        }
        if (_environmentDescription.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _environmentDescription.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_environmentDescription.getAbortableOperationInProgress() != null) {
            prefix = _prefix + "AbortableOperationInProgress";
            Boolean abortableOperationInProgress = _environmentDescription
                    .getAbortableOperationInProgress();
            request.addParameter(prefix, StringUtils.fromBoolean(abortableOperationInProgress));
        }
        if (_environmentDescription.getHealth() != null) {
            prefix = _prefix + "Health";
            String health = _environmentDescription.getHealth();
            request.addParameter(prefix, StringUtils.fromString(health));
        }
        if (_environmentDescription.getHealthStatus() != null) {
            prefix = _prefix + "HealthStatus";
            String healthStatus = _environmentDescription.getHealthStatus();
            request.addParameter(prefix, StringUtils.fromString(healthStatus));
        }
        if (_environmentDescription.getResources() != null) {
            prefix = _prefix + "Resources";
            EnvironmentResourcesDescription resources = _environmentDescription.getResources();
            EnvironmentResourcesDescriptionStaxMarshaller.getInstance().marshall(resources,
                    request, prefix + ".");
        }
        if (_environmentDescription.getTier() != null) {
            prefix = _prefix + "Tier";
            EnvironmentTier tier = _environmentDescription.getTier();
            EnvironmentTierStaxMarshaller.getInstance().marshall(tier, request, prefix + ".");
        }
        if (_environmentDescription.getEnvironmentLinks() != null) {
            prefix = _prefix + "EnvironmentLinks";
            java.util.List<EnvironmentLink> environmentLinks = _environmentDescription
                    .getEnvironmentLinks();
            int environmentLinksIndex = 1;
            String environmentLinksPrefix = prefix;
            for (EnvironmentLink environmentLinksItem : environmentLinks) {
                prefix = environmentLinksPrefix + ".member." + environmentLinksIndex;
                if (environmentLinksItem != null) {
                    EnvironmentLinkStaxMarshaller.getInstance().marshall(environmentLinksItem,
                            request, prefix + ".");
                }
                environmentLinksIndex++;
            }
            prefix = environmentLinksPrefix;
        }
        if (_environmentDescription.getEnvironmentArn() != null) {
            prefix = _prefix + "EnvironmentArn";
            String environmentArn = _environmentDescription.getEnvironmentArn();
            request.addParameter(prefix, StringUtils.fromString(environmentArn));
        }
        if (_environmentDescription.getOperationsRole() != null) {
            prefix = _prefix + "OperationsRole";
            String operationsRole = _environmentDescription.getOperationsRole();
            request.addParameter(prefix, StringUtils.fromString(operationsRole));
        }
    }

    private static EnvironmentDescriptionStaxMarshaller instance;

    public static EnvironmentDescriptionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new EnvironmentDescriptionStaxMarshaller();
        return instance;
    }
}
