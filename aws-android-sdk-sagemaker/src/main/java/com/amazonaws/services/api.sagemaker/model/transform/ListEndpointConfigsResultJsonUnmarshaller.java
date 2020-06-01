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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListEndpointConfigsResult
 */
public class ListEndpointConfigsResultJsonUnmarshaller implements
        Unmarshaller<ListEndpointConfigsResult, JsonUnmarshallerContext> {

    public ListEndpointConfigsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListEndpointConfigsResult listEndpointConfigsResult = new ListEndpointConfigsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("EndpointConfigs")) {
                listEndpointConfigsResult
                        .setEndpointConfigs(new ListUnmarshaller<EndpointConfigSummary>(
                                EndpointConfigSummaryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                listEndpointConfigsResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listEndpointConfigsResult;
    }

    private static ListEndpointConfigsResultJsonUnmarshaller instance;

    public static ListEndpointConfigsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListEndpointConfigsResultJsonUnmarshaller();
        return instance;
    }
}
