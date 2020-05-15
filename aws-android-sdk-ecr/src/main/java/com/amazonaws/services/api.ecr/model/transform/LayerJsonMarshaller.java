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
 * JSON marshaller for POJO Layer
 */
class LayerJsonMarshaller {

    public void marshall(Layer layer, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (layer.getLayerDigest() != null) {
            String layerDigest = layer.getLayerDigest();
            jsonWriter.name("layerDigest");
            jsonWriter.value(layerDigest);
        }
        if (layer.getLayerAvailability() != null) {
            String layerAvailability = layer.getLayerAvailability();
            jsonWriter.name("layerAvailability");
            jsonWriter.value(layerAvailability);
        }
        if (layer.getLayerSize() != null) {
            Long layerSize = layer.getLayerSize();
            jsonWriter.name("layerSize");
            jsonWriter.value(layerSize);
        }
        if (layer.getMediaType() != null) {
            String mediaType = layer.getMediaType();
            jsonWriter.name("mediaType");
            jsonWriter.value(mediaType);
        }
        jsonWriter.endObject();
    }

    private static LayerJsonMarshaller instance;

    public static LayerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LayerJsonMarshaller();
        return instance;
    }
}
