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
 * JSON marshaller for POJO ConnectionInput
 */
class ConnectionInputJsonMarshaller {

    public void marshall(ConnectionInput connectionInput, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (connectionInput.getName() != null) {
            String name = connectionInput.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (connectionInput.getDescription() != null) {
            String description = connectionInput.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (connectionInput.getConnectionType() != null) {
            String connectionType = connectionInput.getConnectionType();
            jsonWriter.name("ConnectionType");
            jsonWriter.value(connectionType);
        }
        if (connectionInput.getMatchCriteria() != null) {
            java.util.List<String> matchCriteria = connectionInput.getMatchCriteria();
            jsonWriter.name("MatchCriteria");
            jsonWriter.beginArray();
            for (String matchCriteriaItem : matchCriteria) {
                if (matchCriteriaItem != null) {
                    jsonWriter.value(matchCriteriaItem);
                }
            }
            jsonWriter.endArray();
        }
        if (connectionInput.getConnectionProperties() != null) {
            java.util.Map<String, String> connectionProperties = connectionInput
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
        if (connectionInput.getPhysicalConnectionRequirements() != null) {
            PhysicalConnectionRequirements physicalConnectionRequirements = connectionInput
                    .getPhysicalConnectionRequirements();
            jsonWriter.name("PhysicalConnectionRequirements");
            PhysicalConnectionRequirementsJsonMarshaller.getInstance().marshall(
                    physicalConnectionRequirements, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ConnectionInputJsonMarshaller instance;

    public static ConnectionInputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConnectionInputJsonMarshaller();
        return instance;
    }
}
