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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO EmailTemplateResponse
 */
class EmailTemplateResponseJsonUnmarshaller implements
        Unmarshaller<EmailTemplateResponse, JsonUnmarshallerContext> {

    public EmailTemplateResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EmailTemplateResponse emailTemplateResponse = new EmailTemplateResponse();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                emailTemplateResponse.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDate")) {
                emailTemplateResponse.setCreationDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HtmlPart")) {
                emailTemplateResponse.setHtmlPart(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedDate")) {
                emailTemplateResponse.setLastModifiedDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Subject")) {
                emailTemplateResponse.setSubject(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                emailTemplateResponse.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TemplateName")) {
                emailTemplateResponse.setTemplateName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TemplateType")) {
                emailTemplateResponse.setTemplateType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TextPart")) {
                emailTemplateResponse.setTextPart(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return emailTemplateResponse;
    }

    private static EmailTemplateResponseJsonUnmarshaller instance;

    public static EmailTemplateResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EmailTemplateResponseJsonUnmarshaller();
        return instance;
    }
}
