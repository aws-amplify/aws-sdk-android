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

package com.amazonaws.services.codecommit.model.transform;

import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetFolderResult
 */
public class GetFolderResultJsonUnmarshaller implements
        Unmarshaller<GetFolderResult, JsonUnmarshallerContext> {

    public GetFolderResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetFolderResult getFolderResult = new GetFolderResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("commitId")) {
                getFolderResult.setCommitId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("folderPath")) {
                getFolderResult.setFolderPath(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("treeId")) {
                getFolderResult.setTreeId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("subFolders")) {
                getFolderResult.setSubFolders(new ListUnmarshaller<Folder>(FolderJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("files")) {
                getFolderResult.setFiles(new ListUnmarshaller<File>(FileJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("symbolicLinks")) {
                getFolderResult.setSymbolicLinks(new ListUnmarshaller<SymbolicLink>(
                        SymbolicLinkJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("subModules")) {
                getFolderResult.setSubModules(new ListUnmarshaller<SubModule>(
                        SubModuleJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getFolderResult;
    }

    private static GetFolderResultJsonUnmarshaller instance;

    public static GetFolderResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetFolderResultJsonUnmarshaller();
        return instance;
    }
}
