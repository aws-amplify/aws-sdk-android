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
 * JSON marshaller for POJO UpdateXMLClassifierRequest
 */
class UpdateXMLClassifierRequestJsonMarshaller {

    public void marshall(UpdateXMLClassifierRequest updateXMLClassifierRequest,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (updateXMLClassifierRequest.getName() != null) {
            String name = updateXMLClassifierRequest.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (updateXMLClassifierRequest.getClassification() != null) {
            String classification = updateXMLClassifierRequest.getClassification();
            jsonWriter.name("Classification");
            jsonWriter.value(classification);
        }
        if (updateXMLClassifierRequest.getRowTag() != null) {
            String rowTag = updateXMLClassifierRequest.getRowTag();
            jsonWriter.name("RowTag");
            jsonWriter.value(rowTag);
        }
        jsonWriter.endObject();
    }

    private static UpdateXMLClassifierRequestJsonMarshaller instance;

    public static UpdateXMLClassifierRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UpdateXMLClassifierRequestJsonMarshaller();
        return instance;
    }
}
