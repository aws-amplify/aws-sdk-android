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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UpdateAttributesRequest
 */
class UpdateAttributesRequestJsonMarshaller {

    public void marshall(UpdateAttributesRequest updateAttributesRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (updateAttributesRequest.getBlacklist() != null) {
            java.util.List<String> blacklist = updateAttributesRequest.getBlacklist();
            jsonWriter.name("Blacklist");
            jsonWriter.beginArray();
            for (String blacklistItem : blacklist) {
                if (blacklistItem != null) {
                    jsonWriter.value(blacklistItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static UpdateAttributesRequestJsonMarshaller instance;

    public static UpdateAttributesRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UpdateAttributesRequestJsonMarshaller();
        return instance;
    }
}
