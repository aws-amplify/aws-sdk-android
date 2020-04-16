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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CommandFilter
 */
class CommandFilterJsonMarshaller {

    public void marshall(CommandFilter commandFilter, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (commandFilter.getKey() != null) {
            String key = commandFilter.getKey();
            jsonWriter.name("key");
            jsonWriter.value(key);
        }
        if (commandFilter.getValue() != null) {
            String value = commandFilter.getValue();
            jsonWriter.name("value");
            jsonWriter.value(value);
        }
        jsonWriter.endObject();
    }

    private static CommandFilterJsonMarshaller instance;

    public static CommandFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CommandFilterJsonMarshaller();
        return instance;
    }
}
