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

package com.amazonaws.services.accessanalyzer.model.transform;

import com.amazonaws.services.accessanalyzer.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO StatusReason
 */
class StatusReasonJsonMarshaller {

    public void marshall(StatusReason statusReason, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (statusReason.getCode() != null) {
            String code = statusReason.getCode();
            jsonWriter.name("code");
            jsonWriter.value(code);
        }
        jsonWriter.endObject();
    }

    private static StatusReasonJsonMarshaller instance;

    public static StatusReasonJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StatusReasonJsonMarshaller();
        return instance;
    }
}
