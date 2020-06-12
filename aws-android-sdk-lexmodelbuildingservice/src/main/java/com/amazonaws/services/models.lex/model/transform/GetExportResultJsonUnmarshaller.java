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

package com.amazonaws.services.models.lex.model.transform;

import com.amazonaws.services.models.lex.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetExportResult
 */
public class GetExportResultJsonUnmarshaller implements
        Unmarshaller<GetExportResult, JsonUnmarshallerContext> {

    public GetExportResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetExportResult getExportResult = new GetExportResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                getExportResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("version")) {
                getExportResult.setVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceType")) {
                getExportResult.setResourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("exportType")) {
                getExportResult.setExportType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("exportStatus")) {
                getExportResult.setExportStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("failureReason")) {
                getExportResult.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("url")) {
                getExportResult.setUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getExportResult;
    }

    private static GetExportResultJsonUnmarshaller instance;

    public static GetExportResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetExportResultJsonUnmarshaller();
        return instance;
    }
}
