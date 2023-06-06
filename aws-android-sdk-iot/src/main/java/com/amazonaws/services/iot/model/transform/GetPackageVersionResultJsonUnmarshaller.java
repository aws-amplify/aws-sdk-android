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
 * JSON unmarshaller for response GetPackageVersionResult
 */
public class GetPackageVersionResultJsonUnmarshaller implements
        Unmarshaller<GetPackageVersionResult, JsonUnmarshallerContext> {

    public GetPackageVersionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetPackageVersionResult getPackageVersionResult = new GetPackageVersionResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("packageVersionArn")) {
                getPackageVersionResult.setPackageVersionArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("packageName")) {
                getPackageVersionResult.setPackageName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("versionName")) {
                getPackageVersionResult.setVersionName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                getPackageVersionResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("attributes")) {
                getPackageVersionResult.setAttributes(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("status")) {
                getPackageVersionResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("errorReason")) {
                getPackageVersionResult.setErrorReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationDate")) {
                getPackageVersionResult.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastModifiedDate")) {
                getPackageVersionResult.setLastModifiedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getPackageVersionResult;
    }

    private static GetPackageVersionResultJsonUnmarshaller instance;

    public static GetPackageVersionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetPackageVersionResultJsonUnmarshaller();
        return instance;
    }
}
