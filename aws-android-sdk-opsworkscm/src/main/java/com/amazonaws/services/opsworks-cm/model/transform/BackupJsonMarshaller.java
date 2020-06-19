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
 * JSON marshaller for POJO Backup
 */
class BackupJsonMarshaller {

    public void marshall(Backup backup, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (backup.getBackupArn() != null) {
            String backupArn = backup.getBackupArn();
            jsonWriter.name("BackupArn");
            jsonWriter.value(backupArn);
        }
        if (backup.getBackupId() != null) {
            String backupId = backup.getBackupId();
            jsonWriter.name("BackupId");
            jsonWriter.value(backupId);
        }
        if (backup.getBackupType() != null) {
            String backupType = backup.getBackupType();
            jsonWriter.name("BackupType");
            jsonWriter.value(backupType);
        }
        if (backup.getCreatedAt() != null) {
            java.util.Date createdAt = backup.getCreatedAt();
            jsonWriter.name("CreatedAt");
            jsonWriter.value(createdAt);
        }
        if (backup.getDescription() != null) {
            String description = backup.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (backup.getEngine() != null) {
            String engine = backup.getEngine();
            jsonWriter.name("Engine");
            jsonWriter.value(engine);
        }
        if (backup.getEngineModel() != null) {
            String engineModel = backup.getEngineModel();
            jsonWriter.name("EngineModel");
            jsonWriter.value(engineModel);
        }
        if (backup.getEngineVersion() != null) {
            String engineVersion = backup.getEngineVersion();
            jsonWriter.name("EngineVersion");
            jsonWriter.value(engineVersion);
        }
        if (backup.getInstanceProfileArn() != null) {
            String instanceProfileArn = backup.getInstanceProfileArn();
            jsonWriter.name("InstanceProfileArn");
            jsonWriter.value(instanceProfileArn);
        }
        if (backup.getInstanceType() != null) {
            String instanceType = backup.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (backup.getKeyPair() != null) {
            String keyPair = backup.getKeyPair();
            jsonWriter.name("KeyPair");
            jsonWriter.value(keyPair);
        }
        if (backup.getPreferredBackupWindow() != null) {
            String preferredBackupWindow = backup.getPreferredBackupWindow();
            jsonWriter.name("PreferredBackupWindow");
            jsonWriter.value(preferredBackupWindow);
        }
        if (backup.getPreferredMaintenanceWindow() != null) {
            String preferredMaintenanceWindow = backup.getPreferredMaintenanceWindow();
            jsonWriter.name("PreferredMaintenanceWindow");
            jsonWriter.value(preferredMaintenanceWindow);
        }
        if (backup.getS3DataSize() != null) {
            Integer s3DataSize = backup.getS3DataSize();
            jsonWriter.name("S3DataSize");
            jsonWriter.value(s3DataSize);
        }
        if (backup.getS3DataUrl() != null) {
            String s3DataUrl = backup.getS3DataUrl();
            jsonWriter.name("S3DataUrl");
            jsonWriter.value(s3DataUrl);
        }
        if (backup.getS3LogUrl() != null) {
            String s3LogUrl = backup.getS3LogUrl();
            jsonWriter.name("S3LogUrl");
            jsonWriter.value(s3LogUrl);
        }
        if (backup.getSecurityGroupIds() != null) {
            java.util.List<String> securityGroupIds = backup.getSecurityGroupIds();
            jsonWriter.name("SecurityGroupIds");
            jsonWriter.beginArray();
            for (String securityGroupIdsItem : securityGroupIds) {
                if (securityGroupIdsItem != null) {
            jsonWriter.value(securityGroupIdsItem);
                    }
            }
            jsonWriter.endArray();
        }
        if (backup.getServerName() != null) {
            String serverName = backup.getServerName();
            jsonWriter.name("ServerName");
            jsonWriter.value(serverName);
        }
        if (backup.getServiceRoleArn() != null) {
            String serviceRoleArn = backup.getServiceRoleArn();
            jsonWriter.name("ServiceRoleArn");
            jsonWriter.value(serviceRoleArn);
        }
        if (backup.getStatus() != null) {
            String status = backup.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (backup.getStatusDescription() != null) {
            String statusDescription = backup.getStatusDescription();
            jsonWriter.name("StatusDescription");
            jsonWriter.value(statusDescription);
        }
        if (backup.getSubnetIds() != null) {
            java.util.List<String> subnetIds = backup.getSubnetIds();
            jsonWriter.name("SubnetIds");
            jsonWriter.beginArray();
            for (String subnetIdsItem : subnetIds) {
                if (subnetIdsItem != null) {
            jsonWriter.value(subnetIdsItem);
                    }
            }
            jsonWriter.endArray();
        }
        if (backup.getToolsVersion() != null) {
            String toolsVersion = backup.getToolsVersion();
            jsonWriter.name("ToolsVersion");
            jsonWriter.value(toolsVersion);
        }
        if (backup.getUserArn() != null) {
            String userArn = backup.getUserArn();
            jsonWriter.name("UserArn");
            jsonWriter.value(userArn);
        }
        jsonWriter.endObject();
    }

    private static BackupJsonMarshaller instance;
    public static BackupJsonMarshaller getInstance() {
        if (instance == null) instance = new BackupJsonMarshaller();
        return instance;
    }
}
