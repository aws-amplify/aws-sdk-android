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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LastError
 */
class LastErrorJsonMarshaller {

    public void marshall(LastError lastError, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (lastError.getMessage() != null) {
            String message = lastError.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (lastError.getCode() != null) {
            String code = lastError.getCode();
            jsonWriter.name("Code");
            jsonWriter.value(code);
        }
        jsonWriter.endObject();
    }

    private static LastErrorJsonMarshaller instance;

    public static LastErrorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LastErrorJsonMarshaller();
        return instance;
    }
}
