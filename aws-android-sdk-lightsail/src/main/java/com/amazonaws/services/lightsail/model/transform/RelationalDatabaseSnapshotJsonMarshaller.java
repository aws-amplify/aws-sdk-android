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
 * JSON marshaller for POJO RelationalDatabaseSnapshot
 */
class RelationalDatabaseSnapshotJsonMarshaller {

    public void marshall(RelationalDatabaseSnapshot relationalDatabaseSnapshot,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (relationalDatabaseSnapshot.getName() != null) {
            String name = relationalDatabaseSnapshot.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (relationalDatabaseSnapshot.getArn() != null) {
            String arn = relationalDatabaseSnapshot.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (relationalDatabaseSnapshot.getSupportCode() != null) {
            String supportCode = relationalDatabaseSnapshot.getSupportCode();
            jsonWriter.name("supportCode");
            jsonWriter.value(supportCode);
        }
        if (relationalDatabaseSnapshot.getCreatedAt() != null) {
            java.util.Date createdAt = relationalDatabaseSnapshot.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (relationalDatabaseSnapshot.getLocation() != null) {
            ResourceLocation location = relationalDatabaseSnapshot.getLocation();
            jsonWriter.name("location");
            ResourceLocationJsonMarshaller.getInstance().marshall(location, jsonWriter);
        }
        if (relationalDatabaseSnapshot.getResourceType() != null) {
            String resourceType = relationalDatabaseSnapshot.getResourceType();
            jsonWriter.name("resourceType");
            jsonWriter.value(resourceType);
        }
        if (relationalDatabaseSnapshot.getTags() != null) {
            java.util.List<Tag> tags = relationalDatabaseSnapshot.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (relationalDatabaseSnapshot.getEngine() != null) {
            String engine = relationalDatabaseSnapshot.getEngine();
            jsonWriter.name("engine");
            jsonWriter.value(engine);
        }
        if (relationalDatabaseSnapshot.getEngineVersion() != null) {
            String engineVersion = relationalDatabaseSnapshot.getEngineVersion();
            jsonWriter.name("engineVersion");
            jsonWriter.value(engineVersion);
        }
        if (relationalDatabaseSnapshot.getSizeInGb() != null) {
            Integer sizeInGb = relationalDatabaseSnapshot.getSizeInGb();
            jsonWriter.name("sizeInGb");
            jsonWriter.value(sizeInGb);
        }
        if (relationalDatabaseSnapshot.getState() != null) {
            String state = relationalDatabaseSnapshot.getState();
            jsonWriter.name("state");
            jsonWriter.value(state);
        }
        if (relationalDatabaseSnapshot.getFromRelationalDatabaseName() != null) {
            String fromRelationalDatabaseName = relationalDatabaseSnapshot
                    .getFromRelationalDatabaseName();
            jsonWriter.name("fromRelationalDatabaseName");
            jsonWriter.value(fromRelationalDatabaseName);
        }
        if (relationalDatabaseSnapshot.getFromRelationalDatabaseArn() != null) {
            String fromRelationalDatabaseArn = relationalDatabaseSnapshot
                    .getFromRelationalDatabaseArn();
            jsonWriter.name("fromRelationalDatabaseArn");
            jsonWriter.value(fromRelationalDatabaseArn);
        }
        if (relationalDatabaseSnapshot.getFromRelationalDatabaseBundleId() != null) {
            String fromRelationalDatabaseBundleId = relationalDatabaseSnapshot
                    .getFromRelationalDatabaseBundleId();
            jsonWriter.name("fromRelationalDatabaseBundleId");
            jsonWriter.value(fromRelationalDatabaseBundleId);
        }
        if (relationalDatabaseSnapshot.getFromRelationalDatabaseBlueprintId() != null) {
            String fromRelationalDatabaseBlueprintId = relationalDatabaseSnapshot
                    .getFromRelationalDatabaseBlueprintId();
            jsonWriter.name("fromRelationalDatabaseBlueprintId");
            jsonWriter.value(fromRelationalDatabaseBlueprintId);
        }
        jsonWriter.endObject();
    }

    private static RelationalDatabaseSnapshotJsonMarshaller instance;

    public static RelationalDatabaseSnapshotJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RelationalDatabaseSnapshotJsonMarshaller();
        return instance;
    }
}
