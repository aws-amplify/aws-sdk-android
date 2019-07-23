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

package com.amazonaws.services.textract.model.transform;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BoundingBox
 */
class BoundingBoxJsonMarshaller {

    public void marshall(BoundingBox boundingBox, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (boundingBox.getWidth() != null) {
            Float width = boundingBox.getWidth();
            jsonWriter.name("Width");
            jsonWriter.value(width);
        }
        if (boundingBox.getHeight() != null) {
            Float height = boundingBox.getHeight();
            jsonWriter.name("Height");
            jsonWriter.value(height);
        }
        if (boundingBox.getLeft() != null) {
            Float left = boundingBox.getLeft();
            jsonWriter.name("Left");
            jsonWriter.value(left);
        }
        if (boundingBox.getTop() != null) {
            Float top = boundingBox.getTop();
            jsonWriter.name("Top");
            jsonWriter.value(top);
        }
        jsonWriter.endObject();
    }

    private static BoundingBoxJsonMarshaller instance;

    public static BoundingBoxJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BoundingBoxJsonMarshaller();
        return instance;
    }
}
