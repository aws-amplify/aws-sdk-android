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

package com.amazonaws.services.shield.model.transform;

import com.amazonaws.services.shield.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Limit
 */
class LimitJsonMarshaller {

    public void marshall(Limit limit, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (limit.getType() != null) {
            String type = limit.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (limit.getMax() != null) {
            Long max = limit.getMax();
            jsonWriter.name("Max");
            jsonWriter.value(max);
        }
        jsonWriter.endObject();
    }

    private static LimitJsonMarshaller instance;

    public static LimitJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LimitJsonMarshaller();
        return instance;
    }
}
