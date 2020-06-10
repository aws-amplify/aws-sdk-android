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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RelationalDatabase
 */
class RelationalDatabaseJsonMarshaller {

    public void marshall(RelationalDatabase relationalDatabase, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (relationalDatabase.getName() != null) {
            String name = relationalDatabase.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (relationalDatabase.getArn() != null) {
            String arn = relationalDatabase.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (relationalDatabase.getSupportCode() != null) {
            String supportCode = relationalDatabase.getSupportCode();
            jsonWriter.name("supportCode");
            jsonWriter.value(supportCode);
        }
        if (relationalDatabase.getCreatedAt() != null) {
            java.util.Date createdAt = relationalDatabase.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (relationalDatabase.getLocation() != null) {
            ResourceLocation location = relationalDatabase.getLocation();
            jsonWriter.name("location");
            ResourceLocationJsonMarshaller.getInstance().marshall(location, jsonWriter);
        }
        if (relationalDatabase.getResourceType() != null) {
            String resourceType = relationalDatabase.getResourceType();
            jsonWriter.name("resourceType");
            jsonWriter.value(resourceType);
        }
        if (relationalDatabase.getTags() != null) {
            java.util.List<Tag> tags = relationalDatabase.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (relationalDatabase.getRelationalDatabaseBlueprintId() != null) {
            String relationalDatabaseBlueprintId = relationalDatabase
                    .getRelationalDatabaseBlueprintId();
            jsonWriter.name("relationalDatabaseBlueprintId");
            jsonWriter.value(relationalDatabaseBlueprintId);
        }
        if (relationalDatabase.getRelationalDatabaseBundleId() != null) {
            String relationalDatabaseBundleId = relationalDatabase.getRelationalDatabaseBundleId();
            jsonWriter.name("relationalDatabaseBundleId");
            jsonWriter.value(relationalDatabaseBundleId);
        }
        if (relationalDatabase.getMasterDatabaseName() != null) {
            String masterDatabaseName = relationalDatabase.getMasterDatabaseName();
            jsonWriter.name("masterDatabaseName");
            jsonWriter.value(masterDatabaseName);
        }
        if (relationalDatabase.getHardware() != null) {
            RelationalDatabaseHardware hardware = relationalDatabase.getHardware();
            jsonWriter.name("hardware");
            RelationalDatabaseHardwareJsonMarshaller.getInstance().marshall(hardware, jsonWriter);
        }
        if (relationalDatabase.getState() != null) {
            String state = relationalDatabase.getState();
            jsonWriter.name("state");
            jsonWriter.value(state);
        }
        if (relationalDatabase.getSecondaryAvailabilityZone() != null) {
            String secondaryAvailabilityZone = relationalDatabase.getSecondaryAvailabilityZone();
            jsonWriter.name("secondaryAvailabilityZone");
            jsonWriter.value(secondaryAvailabilityZone);
        }
        if (relationalDatabase.getBackupRetentionEnabled() != null) {
            Boolean backupRetentionEnabled = relationalDatabase.getBackupRetentionEnabled();
            jsonWriter.name("backupRetentionEnabled");
            jsonWriter.value(backupRetentionEnabled);
        }
        if (relationalDatabase.getPendingModifiedValues() != null) {
            PendingModifiedRelationalDatabaseValues pendingModifiedValues = relationalDatabase
                    .getPendingModifiedValues();
            jsonWriter.name("pendingModifiedValues");
            PendingModifiedRelationalDatabaseValuesJsonMarshaller.getInstance().marshall(
                    pendingModifiedValues, jsonWriter);
        }
        if (relationalDatabase.getEngine() != null) {
            String engine = relationalDatabase.getEngine();
            jsonWriter.name("engine");
            jsonWriter.value(engine);
        }
        if (relationalDatabase.getEngineVersion() != null) {
            String engineVersion = relationalDatabase.getEngineVersion();
            jsonWriter.name("engineVersion");
            jsonWriter.value(engineVersion);
        }
        if (relationalDatabase.getLatestRestorableTime() != null) {
            java.util.Date latestRestorableTime = relationalDatabase.getLatestRestorableTime();
            jsonWriter.name("latestRestorableTime");
            jsonWriter.value(latestRestorableTime);
        }
        if (relationalDatabase.getMasterUsername() != null) {
            String masterUsername = relationalDatabase.getMasterUsername();
            jsonWriter.name("masterUsername");
            jsonWriter.value(masterUsername);
        }
        if (relationalDatabase.getParameterApplyStatus() != null) {
            String parameterApplyStatus = relationalDatabase.getParameterApplyStatus();
            jsonWriter.name("parameterApplyStatus");
            jsonWriter.value(parameterApplyStatus);
        }
        if (relationalDatabase.getPreferredBackupWindow() != null) {
            String preferredBackupWindow = relationalDatabase.getPreferredBackupWindow();
            jsonWriter.name("preferredBackupWindow");
            jsonWriter.value(preferredBackupWindow);
        }
        if (relationalDatabase.getPreferredMaintenanceWindow() != null) {
            String preferredMaintenanceWindow = relationalDatabase.getPreferredMaintenanceWindow();
            jsonWriter.name("preferredMaintenanceWindow");
            jsonWriter.value(preferredMaintenanceWindow);
        }
        if (relationalDatabase.getPubliclyAccessible() != null) {
            Boolean publiclyAccessible = relationalDatabase.getPubliclyAccessible();
            jsonWriter.name("publiclyAccessible");
            jsonWriter.value(publiclyAccessible);
        }
        if (relationalDatabase.getMasterEndpoint() != null) {
            RelationalDatabaseEndpoint masterEndpoint = relationalDatabase.getMasterEndpoint();
            jsonWriter.name("masterEndpoint");
            RelationalDatabaseEndpointJsonMarshaller.getInstance().marshall(masterEndpoint,
                    jsonWriter);
        }
        if (relationalDatabase.getPendingMaintenanceActions() != null) {
            java.util.List<PendingMaintenanceAction> pendingMaintenanceActions = relationalDatabase
                    .getPendingMaintenanceActions();
            jsonWriter.name("pendingMaintenanceActions");
            jsonWriter.beginArray();
            for (PendingMaintenanceAction pendingMaintenanceActionsItem : pendingMaintenanceActions) {
                if (pendingMaintenanceActionsItem != null) {
                    PendingMaintenanceActionJsonMarshaller.getInstance().marshall(
                            pendingMaintenanceActionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (relationalDatabase.getCaCertificateIdentifier() != null) {
            String caCertificateIdentifier = relationalDatabase.getCaCertificateIdentifier();
            jsonWriter.name("caCertificateIdentifier");
            jsonWriter.value(caCertificateIdentifier);
        }
        jsonWriter.endObject();
    }

    private static RelationalDatabaseJsonMarshaller instance;

    public static RelationalDatabaseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RelationalDatabaseJsonMarshaller();
        return instance;
    }
}
