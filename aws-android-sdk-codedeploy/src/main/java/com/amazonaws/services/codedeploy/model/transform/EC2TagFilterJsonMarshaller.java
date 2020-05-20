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

package com.amazonaws.services.codedeploy.model.transform;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EC2TagFilter
 */
class EC2TagFilterJsonMarshaller {

    public void marshall(EC2TagFilter eC2TagFilter, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (eC2TagFilter.getKey() != null) {
            String key = eC2TagFilter.getKey();
            jsonWriter.name("Key");
            jsonWriter.value(key);
        }
        if (eC2TagFilter.getValue() != null) {
            String value = eC2TagFilter.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        if (eC2TagFilter.getType() != null) {
            String type = eC2TagFilter.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static EC2TagFilterJsonMarshaller instance;

    public static EC2TagFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EC2TagFilterJsonMarshaller();
        return instance;
    }
}
