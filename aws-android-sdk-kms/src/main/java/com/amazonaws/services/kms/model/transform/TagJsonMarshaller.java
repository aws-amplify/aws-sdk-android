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

package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Tag
 */
class TagJsonMarshaller {

    public void marshall(Tag tag, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (tag.getTagKey() != null) {
            String tagKey = tag.getTagKey();
            jsonWriter.name("TagKey");
            jsonWriter.value(tagKey);
        }
        if (tag.getTagValue() != null) {
            String tagValue = tag.getTagValue();
            jsonWriter.name("TagValue");
            jsonWriter.value(tagValue);
        }
        jsonWriter.endObject();
    }

    private static TagJsonMarshaller instance;

    public static TagJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TagJsonMarshaller();
        return instance;
    }
}
