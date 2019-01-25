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

package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO KeySchemaElement
 */
class KeySchemaElementJsonMarshaller {

    public void marshall(KeySchemaElement keySchemaElement, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (keySchemaElement.getAttributeName() != null) {
            String attributeName = keySchemaElement.getAttributeName();
            jsonWriter.name("AttributeName");
            jsonWriter.value(attributeName);
        }
        if (keySchemaElement.getKeyType() != null) {
            String keyType = keySchemaElement.getKeyType();
            jsonWriter.name("KeyType");
            jsonWriter.value(keyType);
        }
        jsonWriter.endObject();
    }

    private static KeySchemaElementJsonMarshaller instance;

    public static KeySchemaElementJsonMarshaller getInstance() {
        if (instance == null)
            instance = new KeySchemaElementJsonMarshaller();
        return instance;
    }
}
