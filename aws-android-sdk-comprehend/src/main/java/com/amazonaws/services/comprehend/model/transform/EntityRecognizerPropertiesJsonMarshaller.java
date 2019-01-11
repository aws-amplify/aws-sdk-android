/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EntityRecognizerProperties
 */
class EntityRecognizerPropertiesJsonMarshaller {

    public void marshall(EntityRecognizerProperties entityRecognizerProperties,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (entityRecognizerProperties.getEntityRecognizerArn() != null) {
            String entityRecognizerArn = entityRecognizerProperties.getEntityRecognizerArn();
            jsonWriter.name("EntityRecognizerArn");
            jsonWriter.value(entityRecognizerArn);
        }
        if (entityRecognizerProperties.getLanguageCode() != null) {
            String languageCode = entityRecognizerProperties.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (entityRecognizerProperties.getStatus() != null) {
            String status = entityRecognizerProperties.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (entityRecognizerProperties.getMessage() != null) {
            String message = entityRecognizerProperties.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (entityRecognizerProperties.getSubmitTime() != null) {
            java.util.Date submitTime = entityRecognizerProperties.getSubmitTime();
            jsonWriter.name("SubmitTime");
            jsonWriter.value(submitTime);
        }
        if (entityRecognizerProperties.getEndTime() != null) {
            java.util.Date endTime = entityRecognizerProperties.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (entityRecognizerProperties.getTrainingStartTime() != null) {
            java.util.Date trainingStartTime = entityRecognizerProperties.getTrainingStartTime();
            jsonWriter.name("TrainingStartTime");
            jsonWriter.value(trainingStartTime);
        }
        if (entityRecognizerProperties.getTrainingEndTime() != null) {
            java.util.Date trainingEndTime = entityRecognizerProperties.getTrainingEndTime();
            jsonWriter.name("TrainingEndTime");
            jsonWriter.value(trainingEndTime);
        }
        if (entityRecognizerProperties.getInputDataConfig() != null) {
            EntityRecognizerInputDataConfig inputDataConfig = entityRecognizerProperties
                    .getInputDataConfig();
            jsonWriter.name("InputDataConfig");
            EntityRecognizerInputDataConfigJsonMarshaller.getInstance().marshall(inputDataConfig,
                    jsonWriter);
        }
        if (entityRecognizerProperties.getRecognizerMetadata() != null) {
            EntityRecognizerMetadata recognizerMetadata = entityRecognizerProperties
                    .getRecognizerMetadata();
            jsonWriter.name("RecognizerMetadata");
            EntityRecognizerMetadataJsonMarshaller.getInstance().marshall(recognizerMetadata,
                    jsonWriter);
        }
        if (entityRecognizerProperties.getDataAccessRoleArn() != null) {
            String dataAccessRoleArn = entityRecognizerProperties.getDataAccessRoleArn();
            jsonWriter.name("DataAccessRoleArn");
            jsonWriter.value(dataAccessRoleArn);
        }
        jsonWriter.endObject();
    }

    private static EntityRecognizerPropertiesJsonMarshaller instance;

    public static EntityRecognizerPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EntityRecognizerPropertiesJsonMarshaller();
        return instance;
    }
}
