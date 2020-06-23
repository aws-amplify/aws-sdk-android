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

package com.amazonaws.services.organizations.model.transform;

import com.amazonaws.services.organizations.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Parent
 */
class ParentJsonMarshaller {

    public void marshall(Parent parent, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (parent.getId() != null) {
            String id = parent.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (parent.getType() != null) {
            String type = parent.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static ParentJsonMarshaller instance;

    public static ParentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ParentJsonMarshaller();
        return instance;
    }
}
