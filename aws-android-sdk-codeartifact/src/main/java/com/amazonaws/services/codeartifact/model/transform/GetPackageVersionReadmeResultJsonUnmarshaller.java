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

package com.amazonaws.services.codeartifact.model.transform;

import com.amazonaws.services.codeartifact.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetPackageVersionReadmeResult
 */
public class GetPackageVersionReadmeResultJsonUnmarshaller implements
        Unmarshaller<GetPackageVersionReadmeResult, JsonUnmarshallerContext> {

    public GetPackageVersionReadmeResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetPackageVersionReadmeResult getPackageVersionReadmeResult = new GetPackageVersionReadmeResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("format")) {
                getPackageVersionReadmeResult.setFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("namespace")) {
                getPackageVersionReadmeResult.setNamespace(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("package")) {
                getPackageVersionReadmeResult.setPackage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("version")) {
                getPackageVersionReadmeResult.setVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("versionRevision")) {
                getPackageVersionReadmeResult.setVersionRevision(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("readme")) {
                getPackageVersionReadmeResult.setReadme(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getPackageVersionReadmeResult;
    }

    private static GetPackageVersionReadmeResultJsonUnmarshaller instance;

    public static GetPackageVersionReadmeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetPackageVersionReadmeResultJsonUnmarshaller();
        return instance;
    }
}
