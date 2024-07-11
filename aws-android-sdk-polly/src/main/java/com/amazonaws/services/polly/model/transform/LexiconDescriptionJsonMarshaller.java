/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.polly.model.transform;

import com.amazonaws.services.polly.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LexiconDescription
 */
class LexiconDescriptionJsonMarshaller {

    public void marshall(LexiconDescription lexiconDescription, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (lexiconDescription.getName() != null) {
            String name = lexiconDescription.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (lexiconDescription.getAttributes() != null) {
            LexiconAttributes attributes = lexiconDescription.getAttributes();
            jsonWriter.name("Attributes");
            LexiconAttributesJsonMarshaller.getInstance().marshall(attributes, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static LexiconDescriptionJsonMarshaller instance;

    public static LexiconDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LexiconDescriptionJsonMarshaller();
        return instance;
    }
}
