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

package com.amazonaws.services.appmesh.model.transform;

import com.amazonaws.services.appmesh.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HttpTimeout
 */
class HttpTimeoutJsonMarshaller {

    public void marshall(HttpTimeout httpTimeout, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (httpTimeout.getIdle() != null) {
            Duration idle = httpTimeout.getIdle();
            jsonWriter.name("idle");
            DurationJsonMarshaller.getInstance().marshall(idle, jsonWriter);
        }
        if (httpTimeout.getPerRequest() != null) {
            Duration perRequest = httpTimeout.getPerRequest();
            jsonWriter.name("perRequest");
            DurationJsonMarshaller.getInstance().marshall(perRequest, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static HttpTimeoutJsonMarshaller instance;

    public static HttpTimeoutJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HttpTimeoutJsonMarshaller();
        return instance;
    }
}
