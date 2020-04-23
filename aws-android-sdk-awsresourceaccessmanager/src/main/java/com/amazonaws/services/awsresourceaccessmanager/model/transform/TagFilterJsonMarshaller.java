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

package com.amazonaws.services.awsresourceaccessmanager.model.transform;

import com.amazonaws.services.awsresourceaccessmanager.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TagFilter
 */
class TagFilterJsonMarshaller {

    public void marshall(TagFilter tagFilter, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (tagFilter.getTagKey() != null) {
            String tagKey = tagFilter.getTagKey();
            jsonWriter.name("tagKey");
            jsonWriter.value(tagKey);
        }
        if (tagFilter.getTagValues() != null) {
            java.util.List<String> tagValues = tagFilter.getTagValues();
            jsonWriter.name("tagValues");
            jsonWriter.beginArray();
            for (String tagValuesItem : tagValues) {
                if (tagValuesItem != null) {
                    jsonWriter.value(tagValuesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static TagFilterJsonMarshaller instance;

    public static TagFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TagFilterJsonMarshaller();
        return instance;
    }
}
