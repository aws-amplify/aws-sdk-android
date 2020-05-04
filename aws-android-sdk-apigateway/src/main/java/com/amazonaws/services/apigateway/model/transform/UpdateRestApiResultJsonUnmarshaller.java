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

package com.amazonaws.services.apigateway.model.transform;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response UpdateRestApiResult
 */
public class UpdateRestApiResultJsonUnmarshaller implements
        Unmarshaller<UpdateRestApiResult, JsonUnmarshallerContext> {

    public UpdateRestApiResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateRestApiResult updateRestApiResult = new UpdateRestApiResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("id")) {
                updateRestApiResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("name")) {
                updateRestApiResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                updateRestApiResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdDate")) {
                updateRestApiResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("version")) {
                updateRestApiResult.setVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("warnings")) {
                updateRestApiResult.setWarnings(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("binaryMediaTypes")) {
                updateRestApiResult.setBinaryMediaTypes(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("minimumCompressionSize")) {
                updateRestApiResult.setMinimumCompressionSize(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("apiKeySource")) {
                updateRestApiResult.setApiKeySource(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("endpointConfiguration")) {
                updateRestApiResult.setEndpointConfiguration(EndpointConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("policy")) {
                updateRestApiResult.setPolicy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                updateRestApiResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateRestApiResult;
    }

    private static UpdateRestApiResultJsonUnmarshaller instance;

    public static UpdateRestApiResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateRestApiResultJsonUnmarshaller();
        return instance;
    }
}
