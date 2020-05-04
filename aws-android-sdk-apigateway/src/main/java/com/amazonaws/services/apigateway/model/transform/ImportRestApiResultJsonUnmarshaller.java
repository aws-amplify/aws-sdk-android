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
 * JSON unmarshaller for response ImportRestApiResult
 */
public class ImportRestApiResultJsonUnmarshaller implements
        Unmarshaller<ImportRestApiResult, JsonUnmarshallerContext> {

    public ImportRestApiResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ImportRestApiResult importRestApiResult = new ImportRestApiResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("id")) {
                importRestApiResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("name")) {
                importRestApiResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                importRestApiResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdDate")) {
                importRestApiResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("version")) {
                importRestApiResult.setVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("warnings")) {
                importRestApiResult.setWarnings(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("binaryMediaTypes")) {
                importRestApiResult.setBinaryMediaTypes(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("minimumCompressionSize")) {
                importRestApiResult.setMinimumCompressionSize(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("apiKeySource")) {
                importRestApiResult.setApiKeySource(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("endpointConfiguration")) {
                importRestApiResult.setEndpointConfiguration(EndpointConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("policy")) {
                importRestApiResult.setPolicy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                importRestApiResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return importRestApiResult;
    }

    private static ImportRestApiResultJsonUnmarshaller instance;

    public static ImportRestApiResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImportRestApiResultJsonUnmarshaller();
        return instance;
    }
}
