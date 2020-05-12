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

package com.amazonaws.services.workmail.model.transform;

import com.amazonaws.services.workmail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Delegate
 */
class DelegateJsonMarshaller {

    public void marshall(Delegate delegate, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (delegate.getId() != null) {
            String id = delegate.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (delegate.getType() != null) {
            String type = delegate.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static DelegateJsonMarshaller instance;

    public static DelegateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DelegateJsonMarshaller();
        return instance;
    }
}
