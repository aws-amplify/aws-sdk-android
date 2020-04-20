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
 * JSON unmarshaller for response GetApiResult
 */
public class GetApiResultJsonUnmarshaller implements
        Unmarshaller<GetApiResult, JsonUnmarshallerContext> {

    public GetApiResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetApiResult getApiResult = new GetApiResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ApiEndpoint")) {
                getApiResult.setApiEndpoint(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ApiId")) {
                getApiResult.setApiId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ApiKeySelectionExpression")) {
                getApiResult.setApiKeySelectionExpression(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CorsConfiguration")) {
                getApiResult.setCorsConfiguration(CorsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedDate")) {
                getApiResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                getApiResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DisableSchemaValidation")) {
                getApiResult.setDisableSchemaValidation(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImportInfo")) {
                getApiResult.setImportInfo(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Name")) {
                getApiResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProtocolType")) {
                getApiResult.setProtocolType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RouteSelectionExpression")) {
                getApiResult.setRouteSelectionExpression(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                getApiResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Version")) {
                getApiResult.setVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Warnings")) {
                getApiResult.setWarnings(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getApiResult;
    }

    private static GetApiResultJsonUnmarshaller instance;

    public static GetApiResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetApiResultJsonUnmarshaller();
        return instance;
    }
}
