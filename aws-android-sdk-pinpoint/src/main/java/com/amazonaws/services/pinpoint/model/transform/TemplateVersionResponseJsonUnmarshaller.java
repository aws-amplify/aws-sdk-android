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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO TemplateVersionResponse
 */
class TemplateVersionResponseJsonUnmarshaller implements
        Unmarshaller<TemplateVersionResponse, JsonUnmarshallerContext> {

    public TemplateVersionResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TemplateVersionResponse templateVersionResponse = new TemplateVersionResponse();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CreationDate")) {
                templateVersionResponse.setCreationDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultSubstitutions")) {
                templateVersionResponse.setDefaultSubstitutions(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedDate")) {
                templateVersionResponse.setLastModifiedDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TemplateDescription")) {
                templateVersionResponse.setTemplateDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TemplateName")) {
                templateVersionResponse.setTemplateName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TemplateType")) {
                templateVersionResponse.setTemplateType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Version")) {
                templateVersionResponse.setVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return templateVersionResponse;
    }

    private static TemplateVersionResponseJsonUnmarshaller instance;

    public static TemplateVersionResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TemplateVersionResponseJsonUnmarshaller();
        return instance;
    }
}
