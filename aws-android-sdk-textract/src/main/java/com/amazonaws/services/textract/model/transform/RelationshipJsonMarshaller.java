/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model.transform;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Relationship
 */
class RelationshipJsonMarshaller {

    public void marshall(Relationship relationship, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (relationship.getType() != null) {
            String type = relationship.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (relationship.getIds() != null) {
            java.util.List<String> ids = relationship.getIds();
            jsonWriter.name("Ids");
            jsonWriter.beginArray();
            for (String idsItem : ids) {
                if (idsItem != null) {
                    jsonWriter.value(idsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static RelationshipJsonMarshaller instance;

    public static RelationshipJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RelationshipJsonMarshaller();
        return instance;
    }
}
