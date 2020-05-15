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

package com.amazonaws.services.api.ecr.model.transform;

import com.amazonaws.services.api.ecr.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LayerFailure
 */
class LayerFailureJsonMarshaller {

    public void marshall(LayerFailure layerFailure, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (layerFailure.getLayerDigest() != null) {
            String layerDigest = layerFailure.getLayerDigest();
            jsonWriter.name("layerDigest");
            jsonWriter.value(layerDigest);
        }
        if (layerFailure.getFailureCode() != null) {
            String failureCode = layerFailure.getFailureCode();
            jsonWriter.name("failureCode");
            jsonWriter.value(failureCode);
        }
        if (layerFailure.getFailureReason() != null) {
            String failureReason = layerFailure.getFailureReason();
            jsonWriter.name("failureReason");
            jsonWriter.value(failureReason);
        }
        jsonWriter.endObject();
    }

    private static LayerFailureJsonMarshaller instance;

    public static LayerFailureJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LayerFailureJsonMarshaller();
        return instance;
    }
}
