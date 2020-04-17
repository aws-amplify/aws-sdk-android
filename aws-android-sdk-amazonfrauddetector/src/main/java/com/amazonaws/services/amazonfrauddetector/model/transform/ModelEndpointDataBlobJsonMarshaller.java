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

package com.amazonaws.services.amazonfrauddetector.model.transform;

import com.amazonaws.services.amazonfrauddetector.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ModelEndpointDataBlob
 */
class ModelEndpointDataBlobJsonMarshaller {

    public void marshall(ModelEndpointDataBlob modelEndpointDataBlob, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (modelEndpointDataBlob.getByteBuffer() != null) {
            java.nio.ByteBuffer byteBufferValue = modelEndpointDataBlob.getByteBuffer();
            jsonWriter.name("byteBuffer");
            jsonWriter.value(byteBufferValue);
        }
        if (modelEndpointDataBlob.getContentType() != null) {
            String contentType = modelEndpointDataBlob.getContentType();
            jsonWriter.name("contentType");
            jsonWriter.value(contentType);
        }
        jsonWriter.endObject();
    }

    private static ModelEndpointDataBlobJsonMarshaller instance;

    public static ModelEndpointDataBlobJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ModelEndpointDataBlobJsonMarshaller();
        return instance;
    }
}
