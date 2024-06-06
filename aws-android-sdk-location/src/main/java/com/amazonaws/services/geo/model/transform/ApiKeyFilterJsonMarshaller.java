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

package com.amazonaws.services.geo.model.transform;

import com.amazonaws.services.geo.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ApiKeyFilter
 */
class ApiKeyFilterJsonMarshaller {

    public void marshall(ApiKeyFilter apiKeyFilter, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (apiKeyFilter.getKeyStatus() != null) {
            String keyStatus = apiKeyFilter.getKeyStatus();
            jsonWriter.name("KeyStatus");
            jsonWriter.value(keyStatus);
        }
        jsonWriter.endObject();
    }

    private static ApiKeyFilterJsonMarshaller instance;

    public static ApiKeyFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ApiKeyFilterJsonMarshaller();
        return instance;
    }
}
