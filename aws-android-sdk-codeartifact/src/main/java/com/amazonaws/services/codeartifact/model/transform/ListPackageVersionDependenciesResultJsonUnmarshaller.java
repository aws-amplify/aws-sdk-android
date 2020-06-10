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
 * JSON unmarshaller for response ListPackageVersionDependenciesResult
 */
public class ListPackageVersionDependenciesResultJsonUnmarshaller implements
        Unmarshaller<ListPackageVersionDependenciesResult, JsonUnmarshallerContext> {

    public ListPackageVersionDependenciesResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        ListPackageVersionDependenciesResult listPackageVersionDependenciesResult = new ListPackageVersionDependenciesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("format")) {
                listPackageVersionDependenciesResult.setFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("namespace")) {
                listPackageVersionDependenciesResult.setNamespace(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("package")) {
                listPackageVersionDependenciesResult.setPackage(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("version")) {
                listPackageVersionDependenciesResult.setVersion(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("versionRevision")) {
                listPackageVersionDependenciesResult.setVersionRevision(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("nextToken")) {
                listPackageVersionDependenciesResult.setNextToken(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("dependencies")) {
                listPackageVersionDependenciesResult
                        .setDependencies(new ListUnmarshaller<PackageDependency>(
                                PackageDependencyJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listPackageVersionDependenciesResult;
    }

    private static ListPackageVersionDependenciesResultJsonUnmarshaller instance;

    public static ListPackageVersionDependenciesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListPackageVersionDependenciesResultJsonUnmarshaller();
        return instance;
    }
}
