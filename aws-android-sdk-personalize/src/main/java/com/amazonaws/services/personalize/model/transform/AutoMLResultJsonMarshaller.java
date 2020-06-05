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
 * JSON marshaller for POJO AutoMLResult
 */
class AutoMLResultJsonMarshaller {

    public void marshall(AutoMLResult autoMLResult, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (autoMLResult.getBestRecipeArn() != null) {
            String bestRecipeArn = autoMLResult.getBestRecipeArn();
            jsonWriter.name("bestRecipeArn");
            jsonWriter.value(bestRecipeArn);
        }
        jsonWriter.endObject();
    }

    private static AutoMLResultJsonMarshaller instance;

    public static AutoMLResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AutoMLResultJsonMarshaller();
        return instance;
    }
}
