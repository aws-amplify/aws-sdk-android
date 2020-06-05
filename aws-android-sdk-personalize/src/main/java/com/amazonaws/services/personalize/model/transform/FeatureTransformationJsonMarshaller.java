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

package com.amazonaws.services.personalize.model.transform;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FeatureTransformation
 */
class FeatureTransformationJsonMarshaller {

    public void marshall(FeatureTransformation featureTransformation, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (featureTransformation.getName() != null) {
            String name = featureTransformation.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (featureTransformation.getFeatureTransformationArn() != null) {
            String featureTransformationArn = featureTransformation.getFeatureTransformationArn();
            jsonWriter.name("featureTransformationArn");
            jsonWriter.value(featureTransformationArn);
        }
        if (featureTransformation.getDefaultParameters() != null) {
            java.util.Map<String, String> defaultParameters = featureTransformation
                    .getDefaultParameters();
            jsonWriter.name("defaultParameters");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> defaultParametersEntry : defaultParameters
                    .entrySet()) {
                String defaultParametersValue = defaultParametersEntry.getValue();
                if (defaultParametersValue != null) {
                    jsonWriter.name(defaultParametersEntry.getKey());
                    jsonWriter.value(defaultParametersValue);
                }
            }
            jsonWriter.endObject();
        }
        if (featureTransformation.getCreationDateTime() != null) {
            java.util.Date creationDateTime = featureTransformation.getCreationDateTime();
            jsonWriter.name("creationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (featureTransformation.getLastUpdatedDateTime() != null) {
            java.util.Date lastUpdatedDateTime = featureTransformation.getLastUpdatedDateTime();
            jsonWriter.name("lastUpdatedDateTime");
            jsonWriter.value(lastUpdatedDateTime);
        }
        if (featureTransformation.getStatus() != null) {
            String status = featureTransformation.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static FeatureTransformationJsonMarshaller instance;

    public static FeatureTransformationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FeatureTransformationJsonMarshaller();
        return instance;
    }
}
