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
 * JSON unmarshaller for response DeletePackageVersionsResult
 */
public class DeletePackageVersionsResultJsonUnmarshaller implements
        Unmarshaller<DeletePackageVersionsResult, JsonUnmarshallerContext> {

    public DeletePackageVersionsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeletePackageVersionsResult deletePackageVersionsResult = new DeletePackageVersionsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("successfulVersions")) {
                deletePackageVersionsResult
                        .setSuccessfulVersions(new MapUnmarshaller<SuccessfulPackageVersionInfo>(
                                SuccessfulPackageVersionInfoJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("failedVersions")) {
                deletePackageVersionsResult
                        .setFailedVersions(new MapUnmarshaller<PackageVersionError>(
                                PackageVersionErrorJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return deletePackageVersionsResult;
    }

    private static DeletePackageVersionsResultJsonUnmarshaller instance;

    public static DeletePackageVersionsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeletePackageVersionsResultJsonUnmarshaller();
        return instance;
    }
}
