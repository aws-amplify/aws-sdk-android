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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CategoryProperties
 */
class CategoryPropertiesJsonUnmarshaller implements
        Unmarshaller<CategoryProperties, JsonUnmarshallerContext> {

    public CategoryProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CategoryProperties categoryProperties = new CategoryProperties();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CategoryName")) {
                categoryProperties.setCategoryName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Rules")) {
                categoryProperties.setRules(new ListUnmarshaller<Rule>(RuleJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("CreateTime")) {
                categoryProperties.setCreateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdateTime")) {
                categoryProperties.setLastUpdateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return categoryProperties;
    }

    private static CategoryPropertiesJsonUnmarshaller instance;

    public static CategoryPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CategoryPropertiesJsonUnmarshaller();
        return instance;
    }
}
