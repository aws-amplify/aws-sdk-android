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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO RelationalDatabase
 */
class RelationalDatabaseJsonUnmarshaller implements
        Unmarshaller<RelationalDatabase, JsonUnmarshallerContext> {

    public RelationalDatabase unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RelationalDatabase relationalDatabase = new RelationalDatabase();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                relationalDatabase.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("arn")) {
                relationalDatabase.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("supportCode")) {
                relationalDatabase.setSupportCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdAt")) {
                relationalDatabase.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                relationalDatabase.setLocation(ResourceLocationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceType")) {
                relationalDatabase.setResourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                relationalDatabase.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("relationalDatabaseBlueprintId")) {
                relationalDatabase.setRelationalDatabaseBlueprintId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("relationalDatabaseBundleId")) {
                relationalDatabase.setRelationalDatabaseBundleId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("masterDatabaseName")) {
                relationalDatabase.setMasterDatabaseName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("hardware")) {
                relationalDatabase.setHardware(RelationalDatabaseHardwareJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("state")) {
                relationalDatabase.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("secondaryAvailabilityZone")) {
                relationalDatabase.setSecondaryAvailabilityZone(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("backupRetentionEnabled")) {
                relationalDatabase.setBackupRetentionEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("pendingModifiedValues")) {
                relationalDatabase
                        .setPendingModifiedValues(PendingModifiedRelationalDatabaseValuesJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("engine")) {
                relationalDatabase.setEngine(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("engineVersion")) {
                relationalDatabase.setEngineVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("latestRestorableTime")) {
                relationalDatabase.setLatestRestorableTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("masterUsername")) {
                relationalDatabase.setMasterUsername(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("parameterApplyStatus")) {
                relationalDatabase.setParameterApplyStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("preferredBackupWindow")) {
                relationalDatabase.setPreferredBackupWindow(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("preferredMaintenanceWindow")) {
                relationalDatabase.setPreferredMaintenanceWindow(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("publiclyAccessible")) {
                relationalDatabase.setPubliclyAccessible(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("masterEndpoint")) {
                relationalDatabase.setMasterEndpoint(RelationalDatabaseEndpointJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("pendingMaintenanceActions")) {
                relationalDatabase
                        .setPendingMaintenanceActions(new ListUnmarshaller<PendingMaintenanceAction>(
                                PendingMaintenanceActionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("caCertificateIdentifier")) {
                relationalDatabase.setCaCertificateIdentifier(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return relationalDatabase;
    }

    private static RelationalDatabaseJsonUnmarshaller instance;

    public static RelationalDatabaseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RelationalDatabaseJsonUnmarshaller();
        return instance;
    }
}
