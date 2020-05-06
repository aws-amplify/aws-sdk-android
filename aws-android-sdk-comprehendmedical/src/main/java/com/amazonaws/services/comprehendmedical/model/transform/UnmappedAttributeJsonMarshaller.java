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

package com.amazonaws.services.comprehendmedical.model.transform;

import com.amazonaws.services.comprehendmedical.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UnmappedAttribute
 */
class UnmappedAttributeJsonMarshaller {

    public void marshall(UnmappedAttribute unmappedAttribute, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (unmappedAttribute.getType() != null) {
            String type = unmappedAttribute.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (unmappedAttribute.getAttribute() != null) {
            Attribute attribute = unmappedAttribute.getAttribute();
            jsonWriter.name("Attribute");
            AttributeJsonMarshaller.getInstance().marshall(attribute, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static UnmappedAttributeJsonMarshaller instance;

    public static UnmappedAttributeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UnmappedAttributeJsonMarshaller();
        return instance;
    }
}
