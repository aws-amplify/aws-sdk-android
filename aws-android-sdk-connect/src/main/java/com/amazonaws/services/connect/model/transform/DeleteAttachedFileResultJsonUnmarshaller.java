/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DeleteAttachedFileResult
 */
public class DeleteAttachedFileResultJsonUnmarshaller implements
        Unmarshaller<DeleteAttachedFileResult, JsonUnmarshallerContext> {

    public DeleteAttachedFileResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteAttachedFileResult deleteAttachedFileResult = new DeleteAttachedFileResult();

        return deleteAttachedFileResult;
    }

    private static DeleteAttachedFileResultJsonUnmarshaller instance;

    public static DeleteAttachedFileResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteAttachedFileResultJsonUnmarshaller();
        return instance;
    }
}
