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
 * JSON marshaller for POJO DocumentClassifierProperties
 */
class DocumentClassifierPropertiesJsonMarshaller {

    public void marshall(DocumentClassifierProperties documentClassifierProperties,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (documentClassifierProperties.getDocumentClassifierArn() != null) {
            String documentClassifierArn = documentClassifierProperties.getDocumentClassifierArn();
            jsonWriter.name("DocumentClassifierArn");
            jsonWriter.value(documentClassifierArn);
        }
        if (documentClassifierProperties.getLanguageCode() != null) {
            String languageCode = documentClassifierProperties.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (documentClassifierProperties.getStatus() != null) {
            String status = documentClassifierProperties.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (documentClassifierProperties.getMessage() != null) {
            String message = documentClassifierProperties.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (documentClassifierProperties.getSubmitTime() != null) {
            java.util.Date submitTime = documentClassifierProperties.getSubmitTime();
            jsonWriter.name("SubmitTime");
            jsonWriter.value(submitTime);
        }
        if (documentClassifierProperties.getEndTime() != null) {
            java.util.Date endTime = documentClassifierProperties.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (documentClassifierProperties.getTrainingStartTime() != null) {
            java.util.Date trainingStartTime = documentClassifierProperties.getTrainingStartTime();
            jsonWriter.name("TrainingStartTime");
            jsonWriter.value(trainingStartTime);
        }
        if (documentClassifierProperties.getTrainingEndTime() != null) {
            java.util.Date trainingEndTime = documentClassifierProperties.getTrainingEndTime();
            jsonWriter.name("TrainingEndTime");
            jsonWriter.value(trainingEndTime);
        }
        if (documentClassifierProperties.getInputDataConfig() != null) {
            DocumentClassifierInputDataConfig inputDataConfig = documentClassifierProperties
                    .getInputDataConfig();
            jsonWriter.name("InputDataConfig");
            DocumentClassifierInputDataConfigJsonMarshaller.getInstance().marshall(inputDataConfig,
                    jsonWriter);
        }
        if (documentClassifierProperties.getClassifierMetadata() != null) {
            ClassifierMetadata classifierMetadata = documentClassifierProperties
                    .getClassifierMetadata();
            jsonWriter.name("ClassifierMetadata");
            ClassifierMetadataJsonMarshaller.getInstance().marshall(classifierMetadata, jsonWriter);
        }
        if (documentClassifierProperties.getDataAccessRoleArn() != null) {
            String dataAccessRoleArn = documentClassifierProperties.getDataAccessRoleArn();
            jsonWriter.name("DataAccessRoleArn");
            jsonWriter.value(dataAccessRoleArn);
        }
        jsonWriter.endObject();
    }

    private static DocumentClassifierPropertiesJsonMarshaller instance;

    public static DocumentClassifierPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DocumentClassifierPropertiesJsonMarshaller();
        return instance;
    }
}
