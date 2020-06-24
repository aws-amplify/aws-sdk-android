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

package com.amazonaws.services.fsx.model.transform;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DeleteFileSystemResult
 */
public class DeleteFileSystemResultJsonUnmarshaller implements
        Unmarshaller<DeleteFileSystemResult, JsonUnmarshallerContext> {

    public DeleteFileSystemResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteFileSystemResult deleteFileSystemResult = new DeleteFileSystemResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("FileSystemId")) {
                deleteFileSystemResult.setFileSystemId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Lifecycle")) {
                deleteFileSystemResult.setLifecycle(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WindowsResponse")) {
                deleteFileSystemResult
                        .setWindowsResponse(DeleteFileSystemWindowsResponseJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("LustreResponse")) {
                deleteFileSystemResult
                        .setLustreResponse(DeleteFileSystemLustreResponseJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return deleteFileSystemResult;
    }

    private static DeleteFileSystemResultJsonUnmarshaller instance;

    public static DeleteFileSystemResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteFileSystemResultJsonUnmarshaller();
        return instance;
    }
}
