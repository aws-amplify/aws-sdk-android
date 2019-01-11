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
 * JSON marshaller for POJO Point
 */
class PointJsonMarshaller {

    public void marshall(Point point, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (point.getX() != null) {
            Float x = point.getX();
            jsonWriter.name("X");
            jsonWriter.value(x);
        }
        if (point.getY() != null) {
            Float y = point.getY();
            jsonWriter.name("Y");
            jsonWriter.value(y);
        }
        jsonWriter.endObject();
    }

    private static PointJsonMarshaller instance;

    public static PointJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PointJsonMarshaller();
        return instance;
    }
}
