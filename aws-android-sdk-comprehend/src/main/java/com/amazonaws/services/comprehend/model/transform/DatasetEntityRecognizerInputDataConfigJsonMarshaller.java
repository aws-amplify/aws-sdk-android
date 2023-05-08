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
 * JSON marshaller for POJO DatasetEntityRecognizerInputDataConfig
 */
class DatasetEntityRecognizerInputDataConfigJsonMarshaller {

    public void marshall(
            DatasetEntityRecognizerInputDataConfig datasetEntityRecognizerInputDataConfig,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (datasetEntityRecognizerInputDataConfig.getAnnotations() != null) {
            DatasetEntityRecognizerAnnotations annotations = datasetEntityRecognizerInputDataConfig
                    .getAnnotations();
            jsonWriter.name("Annotations");
            DatasetEntityRecognizerAnnotationsJsonMarshaller.getInstance().marshall(annotations,
                    jsonWriter);
        }
        if (datasetEntityRecognizerInputDataConfig.getDocuments() != null) {
            DatasetEntityRecognizerDocuments documents = datasetEntityRecognizerInputDataConfig
                    .getDocuments();
            jsonWriter.name("Documents");
            DatasetEntityRecognizerDocumentsJsonMarshaller.getInstance().marshall(documents,
                    jsonWriter);
        }
        if (datasetEntityRecognizerInputDataConfig.getEntityList() != null) {
            DatasetEntityRecognizerEntityList entityList = datasetEntityRecognizerInputDataConfig
                    .getEntityList();
            jsonWriter.name("EntityList");
            DatasetEntityRecognizerEntityListJsonMarshaller.getInstance().marshall(entityList,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DatasetEntityRecognizerInputDataConfigJsonMarshaller instance;

    public static DatasetEntityRecognizerInputDataConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DatasetEntityRecognizerInputDataConfigJsonMarshaller();
        return instance;
    }
}
