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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TagScopeTerm
 */
class TagScopeTermJsonMarshaller {

    public void marshall(TagScopeTerm tagScopeTerm, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (tagScopeTerm.getComparator() != null) {
            String comparator = tagScopeTerm.getComparator();
            jsonWriter.name("comparator");
            jsonWriter.value(comparator);
        }
        if (tagScopeTerm.getKey() != null) {
            String key = tagScopeTerm.getKey();
            jsonWriter.name("key");
            jsonWriter.value(key);
        }
        if (tagScopeTerm.getTagValues() != null) {
            java.util.List<TagValuePair> tagValues = tagScopeTerm.getTagValues();
            jsonWriter.name("tagValues");
            jsonWriter.beginArray();
            for (TagValuePair tagValuesItem : tagValues) {
                if (tagValuesItem != null) {
                    TagValuePairJsonMarshaller.getInstance().marshall(tagValuesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (tagScopeTerm.getTarget() != null) {
            String target = tagScopeTerm.getTarget();
            jsonWriter.name("target");
            jsonWriter.value(target);
        }
        jsonWriter.endObject();
    }

    private static TagScopeTermJsonMarshaller instance;

    public static TagScopeTermJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TagScopeTermJsonMarshaller();
        return instance;
    }
}
