/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.transcribe.model.transform;

import com.amazonaws.services.transcribe.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CategoryProperties
 */
class CategoryPropertiesJsonMarshaller {

    public void marshall(CategoryProperties categoryProperties, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (categoryProperties.getCategoryName() != null) {
            String categoryName = categoryProperties.getCategoryName();
            jsonWriter.name("CategoryName");
            jsonWriter.value(categoryName);
        }
        if (categoryProperties.getRules() != null) {
            java.util.List<Rule> rules = categoryProperties.getRules();
            jsonWriter.name("Rules");
            jsonWriter.beginArray();
            for (Rule rulesItem : rules) {
                if (rulesItem != null) {
                    RuleJsonMarshaller.getInstance().marshall(rulesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (categoryProperties.getCreateTime() != null) {
            java.util.Date createTime = categoryProperties.getCreateTime();
            jsonWriter.name("CreateTime");
            jsonWriter.value(createTime);
        }
        if (categoryProperties.getLastUpdateTime() != null) {
            java.util.Date lastUpdateTime = categoryProperties.getLastUpdateTime();
            jsonWriter.name("LastUpdateTime");
            jsonWriter.value(lastUpdateTime);
        }
        jsonWriter.endObject();
    }

    private static CategoryPropertiesJsonMarshaller instance;

    public static CategoryPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CategoryPropertiesJsonMarshaller();
        return instance;
    }
}
