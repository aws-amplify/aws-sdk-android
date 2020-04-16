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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AlgorithmValidationProfile
 */
class AlgorithmValidationProfileJsonMarshaller {

    public void marshall(AlgorithmValidationProfile algorithmValidationProfile,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (algorithmValidationProfile.getProfileName() != null) {
            String profileName = algorithmValidationProfile.getProfileName();
            jsonWriter.name("ProfileName");
            jsonWriter.value(profileName);
        }
        if (algorithmValidationProfile.getTrainingJobDefinition() != null) {
            TrainingJobDefinition trainingJobDefinition = algorithmValidationProfile
                    .getTrainingJobDefinition();
            jsonWriter.name("TrainingJobDefinition");
            TrainingJobDefinitionJsonMarshaller.getInstance().marshall(trainingJobDefinition,
                    jsonWriter);
        }
        if (algorithmValidationProfile.getTransformJobDefinition() != null) {
            TransformJobDefinition transformJobDefinition = algorithmValidationProfile
                    .getTransformJobDefinition();
            jsonWriter.name("TransformJobDefinition");
            TransformJobDefinitionJsonMarshaller.getInstance().marshall(transformJobDefinition,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AlgorithmValidationProfileJsonMarshaller instance;

    public static AlgorithmValidationProfileJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AlgorithmValidationProfileJsonMarshaller();
        return instance;
    }
}
