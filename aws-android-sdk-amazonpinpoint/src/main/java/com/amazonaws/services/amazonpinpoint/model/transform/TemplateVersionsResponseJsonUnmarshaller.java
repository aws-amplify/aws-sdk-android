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

package com.amazonaws.services.amazonpinpoint.model.transform;

import com.amazonaws.services.amazonpinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO TemplateVersionsResponse
 */
class TemplateVersionsResponseJsonUnmarshaller implements
        Unmarshaller<TemplateVersionsResponse, JsonUnmarshallerContext> {

    public TemplateVersionsResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TemplateVersionsResponse templateVersionsResponse = new TemplateVersionsResponse();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Item")) {
                templateVersionsResponse.setItem(new ListUnmarshaller<TemplateVersionResponse>(
                        TemplateVersionResponseJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Message")) {
                templateVersionsResponse.setMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NextToken")) {
                templateVersionsResponse.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequestID")) {
                templateVersionsResponse.setRequestID(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return templateVersionsResponse;
    }

    private static TemplateVersionsResponseJsonUnmarshaller instance;

    public static TemplateVersionsResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TemplateVersionsResponseJsonUnmarshaller();
        return instance;
    }
}
