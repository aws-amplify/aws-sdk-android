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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HttpActionHeader
 */
class HttpActionHeaderJsonMarshaller {

    public void marshall(HttpActionHeader httpActionHeader, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (httpActionHeader.getKey() != null) {
            String key = httpActionHeader.getKey();
            jsonWriter.name("key");
            jsonWriter.value(key);
        }
        if (httpActionHeader.getValue() != null) {
            String value = httpActionHeader.getValue();
            jsonWriter.name("value");
            jsonWriter.value(value);
        }
        jsonWriter.endObject();
    }

    private static HttpActionHeaderJsonMarshaller instance;

    public static HttpActionHeaderJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HttpActionHeaderJsonMarshaller();
        return instance;
    }
}
