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
 * JSON marshaller for POJO Connection
 */
class ConnectionJsonMarshaller {

    public void marshall(Connection connection, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (connection.getName() != null) {
            String name = connection.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (connection.getDescription() != null) {
            String description = connection.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (connection.getConnectionType() != null) {
            String connectionType = connection.getConnectionType();
            jsonWriter.name("ConnectionType");
            jsonWriter.value(connectionType);
        }
        if (connection.getMatchCriteria() != null) {
            java.util.List<String> matchCriteria = connection.getMatchCriteria();
            jsonWriter.name("MatchCriteria");
            jsonWriter.beginArray();
            for (String matchCriteriaItem : matchCriteria) {
                if (matchCriteriaItem != null) {
                    jsonWriter.value(matchCriteriaItem);
                }
            }
            jsonWriter.endArray();
        }
        if (connection.getConnectionProperties() != null) {
            java.util.Map<String, String> connectionProperties = connection
                    .getConnectionProperties();
            jsonWriter.name("ConnectionProperties");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> connectionPropertiesEntry : connectionProperties
                    .entrySet()) {
                String connectionPropertiesValue = connectionPropertiesEntry.getValue();
                if (connectionPropertiesValue != null) {
                    jsonWriter.name(connectionPropertiesEntry.getKey());
                    jsonWriter.value(connectionPropertiesValue);
                }
            }
            jsonWriter.endObject();
        }
        if (connection.getPhysicalConnectionRequirements() != null) {
            PhysicalConnectionRequirements physicalConnectionRequirements = connection
                    .getPhysicalConnectionRequirements();
            jsonWriter.name("PhysicalConnectionRequirements");
            PhysicalConnectionRequirementsJsonMarshaller.getInstance().marshall(
                    physicalConnectionRequirements, jsonWriter);
        }
        if (connection.getCreationTime() != null) {
            java.util.Date creationTime = connection.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (connection.getLastUpdatedTime() != null) {
            java.util.Date lastUpdatedTime = connection.getLastUpdatedTime();
            jsonWriter.name("LastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        if (connection.getLastUpdatedBy() != null) {
            String lastUpdatedBy = connection.getLastUpdatedBy();
            jsonWriter.name("LastUpdatedBy");
            jsonWriter.value(lastUpdatedBy);
        }
        jsonWriter.endObject();
    }

    private static ConnectionJsonMarshaller instance;

    public static ConnectionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConnectionJsonMarshaller();
        return instance;
    }
}
