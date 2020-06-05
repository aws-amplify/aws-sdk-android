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
 * JSON marshaller for POJO AutoMLConfig
 */
class AutoMLConfigJsonMarshaller {

    public void marshall(AutoMLConfig autoMLConfig, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (autoMLConfig.getMetricName() != null) {
            String metricName = autoMLConfig.getMetricName();
            jsonWriter.name("metricName");
            jsonWriter.value(metricName);
        }
        if (autoMLConfig.getRecipeList() != null) {
            java.util.List<String> recipeList = autoMLConfig.getRecipeList();
            jsonWriter.name("recipeList");
            jsonWriter.beginArray();
            for (String recipeListItem : recipeList) {
                if (recipeListItem != null) {
                    jsonWriter.value(recipeListItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AutoMLConfigJsonMarshaller instance;

    public static AutoMLConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AutoMLConfigJsonMarshaller();
        return instance;
    }
}
