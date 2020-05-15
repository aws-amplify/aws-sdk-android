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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DatabaseInput
 */
class DatabaseInputJsonMarshaller {

    public void marshall(DatabaseInput databaseInput, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (databaseInput.getName() != null) {
            String name = databaseInput.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (databaseInput.getDescription() != null) {
            String description = databaseInput.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (databaseInput.getLocationUri() != null) {
            String locationUri = databaseInput.getLocationUri();
            jsonWriter.name("LocationUri");
            jsonWriter.value(locationUri);
        }
        if (databaseInput.getParameters() != null) {
            java.util.Map<String, String> parameters = databaseInput.getParameters();
            jsonWriter.name("Parameters");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> parametersEntry : parameters.entrySet()) {
                String parametersValue = parametersEntry.getValue();
                if (parametersValue != null) {
                    jsonWriter.name(parametersEntry.getKey());
                    jsonWriter.value(parametersValue);
                }
            }
            jsonWriter.endObject();
        }
        if (databaseInput.getCreateTableDefaultPermissions() != null) {
            java.util.List<PrincipalPermissions> createTableDefaultPermissions = databaseInput
                    .getCreateTableDefaultPermissions();
            jsonWriter.name("CreateTableDefaultPermissions");
            jsonWriter.beginArray();
            for (PrincipalPermissions createTableDefaultPermissionsItem : createTableDefaultPermissions) {
                if (createTableDefaultPermissionsItem != null) {
                    PrincipalPermissionsJsonMarshaller.getInstance().marshall(
                            createTableDefaultPermissionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static DatabaseInputJsonMarshaller instance;

    public static DatabaseInputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DatabaseInputJsonMarshaller();
        return instance;
    }
}
