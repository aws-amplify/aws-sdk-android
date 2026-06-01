/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Endpoint
 */
class EndpointJsonMarshaller {

    public void marshall(Endpoint endpoint, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (endpoint.getType() != null) {
            String type = endpoint.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (endpoint.getAddress() != null) {
            String address = endpoint.getAddress();
            jsonWriter.name("Address");
            jsonWriter.value(address);
        }
        jsonWriter.endObject();
    }

    private static EndpointJsonMarshaller instance;

    public static EndpointJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EndpointJsonMarshaller();
        return instance;
    }
}
