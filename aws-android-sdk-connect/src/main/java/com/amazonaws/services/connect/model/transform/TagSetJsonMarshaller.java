/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO TagSet
 */
class TagSetJsonMarshaller {

    public void marshall(TagSet tagSet, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (tagSet.getKey() != null) {
            String key = tagSet.getKey();
            jsonWriter.name("key");
            jsonWriter.value(key);
        }
        if (tagSet.getValue() != null) {
            String value = tagSet.getValue();
            jsonWriter.name("value");
            jsonWriter.value(value);
        }
        jsonWriter.endObject();
    }

    private static TagSetJsonMarshaller instance;

    public static TagSetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TagSetJsonMarshaller();
        return instance;
    }
}
