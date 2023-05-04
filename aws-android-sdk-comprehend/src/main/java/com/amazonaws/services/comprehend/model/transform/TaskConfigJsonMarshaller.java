/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO TaskConfig
 */
class TaskConfigJsonMarshaller {

    public void marshall(TaskConfig taskConfig, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (taskConfig.getLanguageCode() != null) {
            String languageCode = taskConfig.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (taskConfig.getDocumentClassificationConfig() != null) {
            DocumentClassificationConfig documentClassificationConfig = taskConfig
                    .getDocumentClassificationConfig();
            jsonWriter.name("DocumentClassificationConfig");
            DocumentClassificationConfigJsonMarshaller.getInstance().marshall(
                    documentClassificationConfig, jsonWriter);
        }
        if (taskConfig.getEntityRecognitionConfig() != null) {
            EntityRecognitionConfig entityRecognitionConfig = taskConfig
                    .getEntityRecognitionConfig();
            jsonWriter.name("EntityRecognitionConfig");
            EntityRecognitionConfigJsonMarshaller.getInstance().marshall(entityRecognitionConfig,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TaskConfigJsonMarshaller instance;

    public static TaskConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TaskConfigJsonMarshaller();
        return instance;
    }
}
