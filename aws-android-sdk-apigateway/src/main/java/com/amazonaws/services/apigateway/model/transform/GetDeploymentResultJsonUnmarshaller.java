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
 * JSON unmarshaller for response GetDeploymentResult
 */
public class GetDeploymentResultJsonUnmarshaller implements
        Unmarshaller<GetDeploymentResult, JsonUnmarshallerContext> {

    public GetDeploymentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDeploymentResult getDeploymentResult = new GetDeploymentResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("id")) {
                getDeploymentResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                getDeploymentResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdDate")) {
                getDeploymentResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("apiSummary")) {
                getDeploymentResult
                        .setApiSummary(new MapUnmarshaller<java.util.Map<String, MethodSnapshot>>(
                                new MapUnmarshaller<MethodSnapshot>(MethodSnapshotJsonUnmarshaller
                                        .getInstance()
                                )
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getDeploymentResult;
    }

    private static GetDeploymentResultJsonUnmarshaller instance;

    public static GetDeploymentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDeploymentResultJsonUnmarshaller();
        return instance;
    }
}
