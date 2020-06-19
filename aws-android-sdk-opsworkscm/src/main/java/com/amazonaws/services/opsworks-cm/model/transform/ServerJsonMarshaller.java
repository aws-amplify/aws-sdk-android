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
package com.amazonaws.services.opsworks-cm.model.transform;

import com.amazonaws.services.opsworks-cm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Server
 */
class ServerJsonMarshaller {

    public void marshall(Server server, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (server.getAssociatePublicIpAddress() != null) {
            Boolean associatePublicIpAddress = server.getAssociatePublicIpAddress();
            jsonWriter.name("AssociatePublicIpAddress");
            jsonWriter.value(associatePublicIpAddress);
        }
        if (server.getBackupRetentionCount() != null) {
            Integer backupRetentionCount = server.getBackupRetentionCount();
            jsonWriter.name("BackupRetentionCount");
            jsonWriter.value(backupRetentionCount);
        }
        if (server.getServerName() != null) {
            String serverName = server.getServerName();
            jsonWriter.name("ServerName");
            jsonWriter.value(serverName);
        }
        if (server.getCreatedAt() != null) {
            java.util.Date createdAt = server.getCreatedAt();
            jsonWriter.name("CreatedAt");
            jsonWriter.value(createdAt);
        }
        if (server.getCloudFormationStackArn() != null) {
            String cloudFormationStackArn = server.getCloudFormationStackArn();
            jsonWriter.name("CloudFormationStackArn");
            jsonWriter.value(cloudFormationStackArn);
        }
        if (server.getCustomDomain() != null) {
            String customDomain = server.getCustomDomain();
            jsonWriter.name("CustomDomain");
            jsonWriter.value(customDomain);
        }
        if (server.getDisableAutomatedBackup() != null) {
            Boolean disableAutomatedBackup = server.getDisableAutomatedBackup();
            jsonWriter.name("DisableAutomatedBackup");
            jsonWriter.value(disableAutomatedBackup);
        }
        if (server.getEndpoint() != null) {
            String endpoint = server.getEndpoint();
            jsonWriter.name("Endpoint");
            jsonWriter.value(endpoint);
        }
        if (server.getEngine() != null) {
            String engine = server.getEngine();
            jsonWriter.name("Engine");
            jsonWriter.value(engine);
        }
        if (server.getEngineModel() != null) {
            String engineModel = server.getEngineModel();
            jsonWriter.name("EngineModel");
            jsonWriter.value(engineModel);
        }
        if (server.getEngineAttributes() != null) {
            java.util.List<EngineAttribute> engineAttributes = server.getEngineAttributes();
            jsonWriter.name("EngineAttributes");
            jsonWriter.beginArray();
            for (EngineAttribute engineAttributesItem : engineAttributes) {
                if (engineAttributesItem != null) {
            EngineAttributeJsonMarshaller.getInstance().marshall(engineAttributesItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        if (server.getEngineVersion() != null) {
            String engineVersion = server.getEngineVersion();
            jsonWriter.name("EngineVersion");
            jsonWriter.value(engineVersion);
        }
        if (server.getInstanceProfileArn() != null) {
            String instanceProfileArn = server.getInstanceProfileArn();
            jsonWriter.name("InstanceProfileArn");
            jsonWriter.value(instanceProfileArn);
        }
        if (server.getInstanceType() != null) {
            String instanceType = server.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (server.getKeyPair() != null) {
            String keyPair = server.getKeyPair();
            jsonWriter.name("KeyPair");
            jsonWriter.value(keyPair);
        }
        if (server.getMaintenanceStatus() != null) {
            String maintenanceStatus = server.getMaintenanceStatus();
            jsonWriter.name("MaintenanceStatus");
            jsonWriter.value(maintenanceStatus);
        }
        if (server.getPreferredMaintenanceWindow() != null) {
            String preferredMaintenanceWindow = server.getPreferredMaintenanceWindow();
            jsonWriter.name("PreferredMaintenanceWindow");
            jsonWriter.value(preferredMaintenanceWindow);
        }
        if (server.getPreferredBackupWindow() != null) {
            String preferredBackupWindow = server.getPreferredBackupWindow();
            jsonWriter.name("PreferredBackupWindow");
            jsonWriter.value(preferredBackupWindow);
        }
        if (server.getSecurityGroupIds() != null) {
            java.util.List<String> securityGroupIds = server.getSecurityGroupIds();
            jsonWriter.name("SecurityGroupIds");
            jsonWriter.beginArray();
            for (String securityGroupIdsItem : securityGroupIds) {
                if (securityGroupIdsItem != null) {
            jsonWriter.value(securityGroupIdsItem);
                    }
            }
            jsonWriter.endArray();
        }
        if (server.getServiceRoleArn() != null) {
            String serviceRoleArn = server.getServiceRoleArn();
            jsonWriter.name("ServiceRoleArn");
            jsonWriter.value(serviceRoleArn);
        }
        if (server.getStatus() != null) {
            String status = server.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (server.getStatusReason() != null) {
            String statusReason = server.getStatusReason();
            jsonWriter.name("StatusReason");
            jsonWriter.value(statusReason);
        }
        if (server.getSubnetIds() != null) {
            java.util.List<String> subnetIds = server.getSubnetIds();
            jsonWriter.name("SubnetIds");
            jsonWriter.beginArray();
            for (String subnetIdsItem : subnetIds) {
                if (subnetIdsItem != null) {
            jsonWriter.value(subnetIdsItem);
                    }
            }
            jsonWriter.endArray();
        }
        if (server.getServerArn() != null) {
            String serverArn = server.getServerArn();
            jsonWriter.name("ServerArn");
            jsonWriter.value(serverArn);
        }
        jsonWriter.endObject();
    }

    private static ServerJsonMarshaller instance;
    public static ServerJsonMarshaller getInstance() {
        if (instance == null) instance = new ServerJsonMarshaller();
        return instance;
    }
}
