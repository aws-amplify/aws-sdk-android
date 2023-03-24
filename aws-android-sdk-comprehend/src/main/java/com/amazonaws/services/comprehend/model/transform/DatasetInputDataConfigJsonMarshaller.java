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
 * JSON marshaller for POJO DatasetInputDataConfig
 */
class DatasetInputDataConfigJsonMarshaller {

    public void marshall(DatasetInputDataConfig datasetInputDataConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (datasetInputDataConfig.getAugmentedManifests() != null) {
            java.util.List<DatasetAugmentedManifestsListItem> augmentedManifests = datasetInputDataConfig
                    .getAugmentedManifests();
            jsonWriter.name("AugmentedManifests");
            jsonWriter.beginArray();
            for (DatasetAugmentedManifestsListItem augmentedManifestsItem : augmentedManifests) {
                if (augmentedManifestsItem != null) {
                    DatasetAugmentedManifestsListItemJsonMarshaller.getInstance().marshall(
                            augmentedManifestsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (datasetInputDataConfig.getDataFormat() != null) {
            String dataFormat = datasetInputDataConfig.getDataFormat();
            jsonWriter.name("DataFormat");
            jsonWriter.value(dataFormat);
        }
        if (datasetInputDataConfig.getDocumentClassifierInputDataConfig() != null) {
            DatasetDocumentClassifierInputDataConfig documentClassifierInputDataConfig = datasetInputDataConfig
                    .getDocumentClassifierInputDataConfig();
            jsonWriter.name("DocumentClassifierInputDataConfig");
            DatasetDocumentClassifierInputDataConfigJsonMarshaller.getInstance().marshall(
                    documentClassifierInputDataConfig, jsonWriter);
        }
        if (datasetInputDataConfig.getEntityRecognizerInputDataConfig() != null) {
            DatasetEntityRecognizerInputDataConfig entityRecognizerInputDataConfig = datasetInputDataConfig
                    .getEntityRecognizerInputDataConfig();
            jsonWriter.name("EntityRecognizerInputDataConfig");
            DatasetEntityRecognizerInputDataConfigJsonMarshaller.getInstance().marshall(
                    entityRecognizerInputDataConfig, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DatasetInputDataConfigJsonMarshaller instance;

    public static DatasetInputDataConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DatasetInputDataConfigJsonMarshaller();
        return instance;
    }
}
