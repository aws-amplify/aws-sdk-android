/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EndpointProperties
 */
class EndpointPropertiesJsonMarshaller {

    public void marshall(EndpointProperties endpointProperties, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (endpointProperties.getEndpointArn() != null) {
            String endpointArn = endpointProperties.getEndpointArn();
            jsonWriter.name("EndpointArn");
            jsonWriter.value(endpointArn);
        }
        if (endpointProperties.getStatus() != null) {
            String status = endpointProperties.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (endpointProperties.getMessage() != null) {
            String message = endpointProperties.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (endpointProperties.getModelArn() != null) {
            String modelArn = endpointProperties.getModelArn();
            jsonWriter.name("ModelArn");
            jsonWriter.value(modelArn);
        }
        if (endpointProperties.getDesiredModelArn() != null) {
            String desiredModelArn = endpointProperties.getDesiredModelArn();
            jsonWriter.name("DesiredModelArn");
            jsonWriter.value(desiredModelArn);
        }
        if (endpointProperties.getDesiredInferenceUnits() != null) {
            Integer desiredInferenceUnits = endpointProperties.getDesiredInferenceUnits();
            jsonWriter.name("DesiredInferenceUnits");
            jsonWriter.value(desiredInferenceUnits);
        }
        if (endpointProperties.getCurrentInferenceUnits() != null) {
            Integer currentInferenceUnits = endpointProperties.getCurrentInferenceUnits();
            jsonWriter.name("CurrentInferenceUnits");
            jsonWriter.value(currentInferenceUnits);
        }
        if (endpointProperties.getCreationTime() != null) {
            java.util.Date creationTime = endpointProperties.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (endpointProperties.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = endpointProperties.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (endpointProperties.getDataAccessRoleArn() != null) {
            String dataAccessRoleArn = endpointProperties.getDataAccessRoleArn();
            jsonWriter.name("DataAccessRoleArn");
            jsonWriter.value(dataAccessRoleArn);
        }
        if (endpointProperties.getDesiredDataAccessRoleArn() != null) {
            String desiredDataAccessRoleArn = endpointProperties.getDesiredDataAccessRoleArn();
            jsonWriter.name("DesiredDataAccessRoleArn");
            jsonWriter.value(desiredDataAccessRoleArn);
        }
        jsonWriter.endObject();
    }

    private static EndpointPropertiesJsonMarshaller instance;

    public static EndpointPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EndpointPropertiesJsonMarshaller();
        return instance;
    }
}
