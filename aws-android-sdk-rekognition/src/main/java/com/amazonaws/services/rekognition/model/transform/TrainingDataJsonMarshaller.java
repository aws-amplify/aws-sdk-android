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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TrainingData
 */
class TrainingDataJsonMarshaller {

    public void marshall(TrainingData trainingData, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (trainingData.getAssets() != null) {
            java.util.List<Asset> assets = trainingData.getAssets();
            jsonWriter.name("Assets");
            jsonWriter.beginArray();
            for (Asset assetsItem : assets) {
                if (assetsItem != null) {
                    AssetJsonMarshaller.getInstance().marshall(assetsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static TrainingDataJsonMarshaller instance;

    public static TrainingDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrainingDataJsonMarshaller();
        return instance;
    }
}
