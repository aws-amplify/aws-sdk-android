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
 * JSON unmarshaller for response ListPackageVersionAssetsResult
 */
public class ListPackageVersionAssetsResultJsonUnmarshaller implements
        Unmarshaller<ListPackageVersionAssetsResult, JsonUnmarshallerContext> {

    public ListPackageVersionAssetsResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        ListPackageVersionAssetsResult listPackageVersionAssetsResult = new ListPackageVersionAssetsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("format")) {
                listPackageVersionAssetsResult.setFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("namespace")) {
                listPackageVersionAssetsResult.setNamespace(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("package")) {
                listPackageVersionAssetsResult.setPackage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("version")) {
                listPackageVersionAssetsResult.setVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("versionRevision")) {
                listPackageVersionAssetsResult.setVersionRevision(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("nextToken")) {
                listPackageVersionAssetsResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("assets")) {
                listPackageVersionAssetsResult.setAssets(new ListUnmarshaller<AssetSummary>(
                        AssetSummaryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listPackageVersionAssetsResult;
    }

    private static ListPackageVersionAssetsResultJsonUnmarshaller instance;

    public static ListPackageVersionAssetsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListPackageVersionAssetsResultJsonUnmarshaller();
        return instance;
    }
}
