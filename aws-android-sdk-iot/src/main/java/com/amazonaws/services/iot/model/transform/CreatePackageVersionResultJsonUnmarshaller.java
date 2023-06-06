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
 * JSON unmarshaller for response CreatePackageVersionResult
 */
public class CreatePackageVersionResultJsonUnmarshaller implements
        Unmarshaller<CreatePackageVersionResult, JsonUnmarshallerContext> {

    public CreatePackageVersionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreatePackageVersionResult createPackageVersionResult = new CreatePackageVersionResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("packageVersionArn")) {
                createPackageVersionResult.setPackageVersionArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("packageName")) {
                createPackageVersionResult.setPackageName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("versionName")) {
                createPackageVersionResult.setVersionName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                createPackageVersionResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("attributes")) {
                createPackageVersionResult.setAttributes(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("status")) {
                createPackageVersionResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("errorReason")) {
                createPackageVersionResult.setErrorReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createPackageVersionResult;
    }

    private static CreatePackageVersionResultJsonUnmarshaller instance;

    public static CreatePackageVersionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreatePackageVersionResultJsonUnmarshaller();
        return instance;
    }
}
