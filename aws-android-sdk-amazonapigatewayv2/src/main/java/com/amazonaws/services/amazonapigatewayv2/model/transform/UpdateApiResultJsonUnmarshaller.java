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

package com.amazonaws.services.amazonapigatewayv2.model.transform;

import com.amazonaws.services.amazonapigatewayv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response UpdateApiResult
 */
public class UpdateApiResultJsonUnmarshaller implements
        Unmarshaller<UpdateApiResult, JsonUnmarshallerContext> {

    public UpdateApiResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateApiResult updateApiResult = new UpdateApiResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ApiEndpoint")) {
                updateApiResult.setApiEndpoint(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ApiId")) {
                updateApiResult.setApiId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ApiKeySelectionExpression")) {
                updateApiResult.setApiKeySelectionExpression(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CorsConfiguration")) {
                updateApiResult.setCorsConfiguration(CorsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedDate")) {
                updateApiResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                updateApiResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DisableSchemaValidation")) {
                updateApiResult.setDisableSchemaValidation(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImportInfo")) {
                updateApiResult.setImportInfo(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Name")) {
                updateApiResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProtocolType")) {
                updateApiResult.setProtocolType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RouteSelectionExpression")) {
                updateApiResult.setRouteSelectionExpression(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                updateApiResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Version")) {
                updateApiResult.setVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Warnings")) {
                updateApiResult.setWarnings(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateApiResult;
    }

    private static UpdateApiResultJsonUnmarshaller instance;

    public static UpdateApiResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateApiResultJsonUnmarshaller();
        return instance;
    }
}
