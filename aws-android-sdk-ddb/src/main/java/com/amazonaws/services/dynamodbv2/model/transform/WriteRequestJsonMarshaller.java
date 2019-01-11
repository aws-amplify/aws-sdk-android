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
 * JSON marshaller for POJO WriteRequest
 */
class WriteRequestJsonMarshaller {

    public void marshall(WriteRequest writeRequest, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (writeRequest.getPutRequest() != null) {
            PutRequest putRequest = writeRequest.getPutRequest();
            jsonWriter.name("PutRequest");
            PutRequestJsonMarshaller.getInstance().marshall(putRequest, jsonWriter);
        }
        if (writeRequest.getDeleteRequest() != null) {
            DeleteRequest deleteRequest = writeRequest.getDeleteRequest();
            jsonWriter.name("DeleteRequest");
            DeleteRequestJsonMarshaller.getInstance().marshall(deleteRequest, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static WriteRequestJsonMarshaller instance;

    public static WriteRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WriteRequestJsonMarshaller();
        return instance;
    }
}
