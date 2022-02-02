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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DocumentClass
 */
class DocumentClassJsonMarshaller {

    public void marshall(DocumentClass documentClass, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (documentClass.getName() != null) {
            String name = documentClass.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (documentClass.getScore() != null) {
            Float score = documentClass.getScore();
            jsonWriter.name("Score");
            jsonWriter.value(score);
        }
        jsonWriter.endObject();
    }

    private static DocumentClassJsonMarshaller instance;

    public static DocumentClassJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DocumentClassJsonMarshaller();
        return instance;
    }
}
