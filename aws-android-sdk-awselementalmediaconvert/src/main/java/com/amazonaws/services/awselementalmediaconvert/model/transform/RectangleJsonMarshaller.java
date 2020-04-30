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

package com.amazonaws.services.awselementalmediaconvert.model.transform;

import com.amazonaws.services.awselementalmediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Rectangle
 */
class RectangleJsonMarshaller {

    public void marshall(Rectangle rectangle, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (rectangle.getHeight() != null) {
            Integer height = rectangle.getHeight();
            jsonWriter.name("Height");
            jsonWriter.value(height);
        }
        if (rectangle.getWidth() != null) {
            Integer width = rectangle.getWidth();
            jsonWriter.name("Width");
            jsonWriter.value(width);
        }
        if (rectangle.getX() != null) {
            Integer x = rectangle.getX();
            jsonWriter.name("X");
            jsonWriter.value(x);
        }
        if (rectangle.getY() != null) {
            Integer y = rectangle.getY();
            jsonWriter.name("Y");
            jsonWriter.value(y);
        }
        jsonWriter.endObject();
    }

    private static RectangleJsonMarshaller instance;

    public static RectangleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RectangleJsonMarshaller();
        return instance;
    }
}
