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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CreateXMLClassifierRequest
 */
class CreateXMLClassifierRequestJsonMarshaller {

    public void marshall(CreateXMLClassifierRequest createXMLClassifierRequest,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (createXMLClassifierRequest.getClassification() != null) {
            String classification = createXMLClassifierRequest.getClassification();
            jsonWriter.name("Classification");
            jsonWriter.value(classification);
        }
        if (createXMLClassifierRequest.getName() != null) {
            String name = createXMLClassifierRequest.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (createXMLClassifierRequest.getRowTag() != null) {
            String rowTag = createXMLClassifierRequest.getRowTag();
            jsonWriter.name("RowTag");
            jsonWriter.value(rowTag);
        }
        jsonWriter.endObject();
    }

    private static CreateXMLClassifierRequestJsonMarshaller instance;

    public static CreateXMLClassifierRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CreateXMLClassifierRequestJsonMarshaller();
        return instance;
    }
}
