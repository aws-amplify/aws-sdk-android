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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InstanceInformation
 */
class InstanceInformationJsonMarshaller {

    public void marshall(InstanceInformation instanceInformation, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instanceInformation.getInstanceId() != null) {
            String instanceId = instanceInformation.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (instanceInformation.getPingStatus() != null) {
            String pingStatus = instanceInformation.getPingStatus();
            jsonWriter.name("PingStatus");
            jsonWriter.value(pingStatus);
        }
        if (instanceInformation.getLastPingDateTime() != null) {
            java.util.Date lastPingDateTime = instanceInformation.getLastPingDateTime();
            jsonWriter.name("LastPingDateTime");
            jsonWriter.value(lastPingDateTime);
        }
        if (instanceInformation.getAgentVersion() != null) {
            String agentVersion = instanceInformation.getAgentVersion();
            jsonWriter.name("AgentVersion");
            jsonWriter.value(agentVersion);
        }
        if (instanceInformation.getIsLatestVersion() != null) {
            Boolean isLatestVersion = instanceInformation.getIsLatestVersion();
            jsonWriter.name("IsLatestVersion");
            jsonWriter.value(isLatestVersion);
        }
        if (instanceInformation.getPlatformType() != null) {
            String platformType = instanceInformation.getPlatformType();
            jsonWriter.name("PlatformType");
            jsonWriter.value(platformType);
        }
        if (instanceInformation.getPlatformName() != null) {
            String platformName = instanceInformation.getPlatformName();
            jsonWriter.name("PlatformName");
            jsonWriter.value(platformName);
        }
        if (instanceInformation.getPlatformVersion() != null) {
            String platformVersion = instanceInformation.getPlatformVersion();
            jsonWriter.name("PlatformVersion");
            jsonWriter.value(platformVersion);
        }
        if (instanceInformation.getActivationId() != null) {
            String activationId = instanceInformation.getActivationId();
            jsonWriter.name("ActivationId");
            jsonWriter.value(activationId);
        }
        if (instanceInformation.getIamRole() != null) {
            String iamRole = instanceInformation.getIamRole();
            jsonWriter.name("IamRole");
            jsonWriter.value(iamRole);
        }
        if (instanceInformation.getRegistrationDate() != null) {
            java.util.Date registrationDate = instanceInformation.getRegistrationDate();
            jsonWriter.name("RegistrationDate");
            jsonWriter.value(registrationDate);
        }
        if (instanceInformation.getResourceType() != null) {
            String resourceType = instanceInformation.getResourceType();
            jsonWriter.name("ResourceType");
            jsonWriter.value(resourceType);
        }
        if (instanceInformation.getName() != null) {
            String name = instanceInformation.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (instanceInformation.getIPAddress() != null) {
            String iPAddress = instanceInformation.getIPAddress();
            jsonWriter.name("IPAddress");
            jsonWriter.value(iPAddress);
        }
        if (instanceInformation.getComputerName() != null) {
            String computerName = instanceInformation.getComputerName();
            jsonWriter.name("ComputerName");
            jsonWriter.value(computerName);
        }
        if (instanceInformation.getAssociationStatus() != null) {
            String associationStatus = instanceInformation.getAssociationStatus();
            jsonWriter.name("AssociationStatus");
            jsonWriter.value(associationStatus);
        }
        if (instanceInformation.getLastAssociationExecutionDate() != null) {
            java.util.Date lastAssociationExecutionDate = instanceInformation.getLastAssociationExecutionDate();
            jsonWriter.name("LastAssociationExecutionDate");
            jsonWriter.value(lastAssociationExecutionDate);
        }
        if (instanceInformation.getLastSuccessfulAssociationExecutionDate() != null) {
            java.util.Date lastSuccessfulAssociationExecutionDate = instanceInformation.getLastSuccessfulAssociationExecutionDate();
            jsonWriter.name("LastSuccessfulAssociationExecutionDate");
            jsonWriter.value(lastSuccessfulAssociationExecutionDate);
        }
        if (instanceInformation.getAssociationOverview() != null) {
            InstanceAggregatedAssociationOverview associationOverview = instanceInformation.getAssociationOverview();
            jsonWriter.name("AssociationOverview");
            InstanceAggregatedAssociationOverviewJsonMarshaller.getInstance().marshall(associationOverview, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static InstanceInformationJsonMarshaller instance;
    public static InstanceInformationJsonMarshaller getInstance() {
        if (instance == null) instance = new InstanceInformationJsonMarshaller();
        return instance;
    }
}
