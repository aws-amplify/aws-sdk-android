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
 * JSON marshaller for POJO RelationalDatabaseBlueprint
 */
class RelationalDatabaseBlueprintJsonMarshaller {

    public void marshall(RelationalDatabaseBlueprint relationalDatabaseBlueprint,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (relationalDatabaseBlueprint.getBlueprintId() != null) {
            String blueprintId = relationalDatabaseBlueprint.getBlueprintId();
            jsonWriter.name("blueprintId");
            jsonWriter.value(blueprintId);
        }
        if (relationalDatabaseBlueprint.getEngine() != null) {
            String engine = relationalDatabaseBlueprint.getEngine();
            jsonWriter.name("engine");
            jsonWriter.value(engine);
        }
        if (relationalDatabaseBlueprint.getEngineVersion() != null) {
            String engineVersion = relationalDatabaseBlueprint.getEngineVersion();
            jsonWriter.name("engineVersion");
            jsonWriter.value(engineVersion);
        }
        if (relationalDatabaseBlueprint.getEngineDescription() != null) {
            String engineDescription = relationalDatabaseBlueprint.getEngineDescription();
            jsonWriter.name("engineDescription");
            jsonWriter.value(engineDescription);
        }
        if (relationalDatabaseBlueprint.getEngineVersionDescription() != null) {
            String engineVersionDescription = relationalDatabaseBlueprint
                    .getEngineVersionDescription();
            jsonWriter.name("engineVersionDescription");
            jsonWriter.value(engineVersionDescription);
        }
        if (relationalDatabaseBlueprint.getIsEngineDefault() != null) {
            Boolean isEngineDefault = relationalDatabaseBlueprint.getIsEngineDefault();
            jsonWriter.name("isEngineDefault");
            jsonWriter.value(isEngineDefault);
        }
        jsonWriter.endObject();
    }

    private static RelationalDatabaseBlueprintJsonMarshaller instance;

    public static RelationalDatabaseBlueprintJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RelationalDatabaseBlueprintJsonMarshaller();
        return instance;
    }
}
