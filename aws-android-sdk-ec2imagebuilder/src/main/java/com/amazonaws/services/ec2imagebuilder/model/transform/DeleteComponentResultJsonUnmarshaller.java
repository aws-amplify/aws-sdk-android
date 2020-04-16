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

package com.amazonaws.services.ec2imagebuilder.model.transform;

import com.amazonaws.services.ec2imagebuilder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DeleteComponentResult
 */
public class DeleteComponentResultJsonUnmarshaller implements
        Unmarshaller<DeleteComponentResult, JsonUnmarshallerContext> {

    public DeleteComponentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteComponentResult deleteComponentResult = new DeleteComponentResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("requestId")) {
                deleteComponentResult.setRequestId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("componentBuildVersionArn")) {
                deleteComponentResult.setComponentBuildVersionArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return deleteComponentResult;
    }

    private static DeleteComponentResultJsonUnmarshaller instance;

    public static DeleteComponentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteComponentResultJsonUnmarshaller();
        return instance;
    }
}
