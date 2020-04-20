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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Database
 */
class DatabaseJsonMarshaller {

    public void marshall(Database database, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (database.getName() != null) {
            String name = database.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (database.getDescription() != null) {
            String description = database.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (database.getLocationUri() != null) {
            String locationUri = database.getLocationUri();
            jsonWriter.name("LocationUri");
            jsonWriter.value(locationUri);
        }
        if (database.getParameters() != null) {
            java.util.Map<String, String> parameters = database.getParameters();
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
        if (database.getCreateTime() != null) {
            java.util.Date createTime = database.getCreateTime();
            jsonWriter.name("CreateTime");
            jsonWriter.value(createTime);
        }
        if (database.getCreateTableDefaultPermissions() != null) {
            java.util.List<PrincipalPermissions> createTableDefaultPermissions = database
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

    private static DatabaseJsonMarshaller instance;

    public static DatabaseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DatabaseJsonMarshaller();
        return instance;
    }
}
