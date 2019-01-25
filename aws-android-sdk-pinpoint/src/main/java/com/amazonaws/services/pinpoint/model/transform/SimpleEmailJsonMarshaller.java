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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SimpleEmail
 */
class SimpleEmailJsonMarshaller {

    public void marshall(SimpleEmail simpleEmail, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (simpleEmail.getHtmlPart() != null) {
            SimpleEmailPart htmlPart = simpleEmail.getHtmlPart();
            jsonWriter.name("HtmlPart");
            SimpleEmailPartJsonMarshaller.getInstance().marshall(htmlPart, jsonWriter);
        }
        if (simpleEmail.getSubject() != null) {
            SimpleEmailPart subject = simpleEmail.getSubject();
            jsonWriter.name("Subject");
            SimpleEmailPartJsonMarshaller.getInstance().marshall(subject, jsonWriter);
        }
        if (simpleEmail.getTextPart() != null) {
            SimpleEmailPart textPart = simpleEmail.getTextPart();
            jsonWriter.name("TextPart");
            SimpleEmailPartJsonMarshaller.getInstance().marshall(textPart, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static SimpleEmailJsonMarshaller instance;

    public static SimpleEmailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SimpleEmailJsonMarshaller();
        return instance;
    }
}
