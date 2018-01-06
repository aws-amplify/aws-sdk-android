/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DeleteStreamProcessorResult
 */
public class DeleteStreamProcessorResultJsonUnmarshaller implements
        Unmarshaller<DeleteStreamProcessorResult, JsonUnmarshallerContext> {

    public DeleteStreamProcessorResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteStreamProcessorResult deleteStreamProcessorResult = new DeleteStreamProcessorResult();

        return deleteStreamProcessorResult;
    }

    private static DeleteStreamProcessorResultJsonUnmarshaller instance;

    public static DeleteStreamProcessorResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteStreamProcessorResultJsonUnmarshaller();
        return instance;
    }
}
