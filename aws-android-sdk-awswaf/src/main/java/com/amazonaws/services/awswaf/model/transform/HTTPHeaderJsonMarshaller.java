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

package com.amazonaws.services.awswaf.model.transform;

import com.amazonaws.services.awswaf.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HTTPHeader
 */
class HTTPHeaderJsonMarshaller {

    public void marshall(HTTPHeader hTTPHeader, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (hTTPHeader.getName() != null) {
            String name = hTTPHeader.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (hTTPHeader.getValue() != null) {
            String value = hTTPHeader.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        jsonWriter.endObject();
    }

    private static HTTPHeaderJsonMarshaller instance;

    public static HTTPHeaderJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HTTPHeaderJsonMarshaller();
        return instance;
    }
}
