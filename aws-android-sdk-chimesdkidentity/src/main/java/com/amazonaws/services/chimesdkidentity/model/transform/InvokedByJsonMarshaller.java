/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkidentity.model.transform;

import com.amazonaws.services.chimesdkidentity.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InvokedBy
 */
class InvokedByJsonMarshaller {

    public void marshall(InvokedBy invokedBy, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (invokedBy.getStandardMessages() != null) {
            String standardMessages = invokedBy.getStandardMessages();
            jsonWriter.name("StandardMessages");
            jsonWriter.value(standardMessages);
        }
        if (invokedBy.getTargetedMessages() != null) {
            String targetedMessages = invokedBy.getTargetedMessages();
            jsonWriter.name("TargetedMessages");
            jsonWriter.value(targetedMessages);
        }
        jsonWriter.endObject();
    }

    private static InvokedByJsonMarshaller instance;

    public static InvokedByJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InvokedByJsonMarshaller();
        return instance;
    }
}
