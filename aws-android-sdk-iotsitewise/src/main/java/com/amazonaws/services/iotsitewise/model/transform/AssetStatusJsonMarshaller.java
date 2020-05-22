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

package com.amazonaws.services.iotsitewise.model.transform;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AssetStatus
 */
class AssetStatusJsonMarshaller {

    public void marshall(AssetStatus assetStatus, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (assetStatus.getState() != null) {
            String state = assetStatus.getState();
            jsonWriter.name("state");
            jsonWriter.value(state);
        }
        if (assetStatus.getError() != null) {
            ErrorDetails error = assetStatus.getError();
            jsonWriter.name("error");
            ErrorDetailsJsonMarshaller.getInstance().marshall(error, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AssetStatusJsonMarshaller instance;

    public static AssetStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AssetStatusJsonMarshaller();
        return instance;
    }
}
