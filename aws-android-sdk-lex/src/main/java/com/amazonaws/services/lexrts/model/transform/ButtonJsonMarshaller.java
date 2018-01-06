/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.lexrts.model.transform;

import com.amazonaws.services.lexrts.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Button
 */
class ButtonJsonMarshaller {

    public void marshall(Button button, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (button.getText() != null) {
            String text = button.getText();
            jsonWriter.name("text");
            jsonWriter.value(text);
        }
        if (button.getValue() != null) {
            String value = button.getValue();
            jsonWriter.name("value");
            jsonWriter.value(value);
        }
        jsonWriter.endObject();
    }

    private static ButtonJsonMarshaller instance;

    public static ButtonJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ButtonJsonMarshaller();
        return instance;
    }
}
