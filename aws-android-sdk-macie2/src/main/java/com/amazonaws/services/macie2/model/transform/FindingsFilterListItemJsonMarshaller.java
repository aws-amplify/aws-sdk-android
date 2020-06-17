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
 * JSON marshaller for POJO FindingsFilterListItem
 */
class FindingsFilterListItemJsonMarshaller {

    public void marshall(FindingsFilterListItem findingsFilterListItem, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (findingsFilterListItem.getArn() != null) {
            String arn = findingsFilterListItem.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (findingsFilterListItem.getId() != null) {
            String id = findingsFilterListItem.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (findingsFilterListItem.getName() != null) {
            String name = findingsFilterListItem.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (findingsFilterListItem.getTags() != null) {
            java.util.Map<String, String> tags = findingsFilterListItem.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static FindingsFilterListItemJsonMarshaller instance;

    public static FindingsFilterListItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FindingsFilterListItemJsonMarshaller();
        return instance;
    }
}
