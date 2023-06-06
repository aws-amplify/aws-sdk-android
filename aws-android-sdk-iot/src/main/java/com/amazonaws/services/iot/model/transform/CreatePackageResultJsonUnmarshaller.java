/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response CreatePackageResult
 */
public class CreatePackageResultJsonUnmarshaller implements
        Unmarshaller<CreatePackageResult, JsonUnmarshallerContext> {

    public CreatePackageResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreatePackageResult createPackageResult = new CreatePackageResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("packageName")) {
                createPackageResult.setPackageName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("packageArn")) {
                createPackageResult.setPackageArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                createPackageResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createPackageResult;
    }

    private static CreatePackageResultJsonUnmarshaller instance;

    public static CreatePackageResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreatePackageResultJsonUnmarshaller();
        return instance;
    }
}
