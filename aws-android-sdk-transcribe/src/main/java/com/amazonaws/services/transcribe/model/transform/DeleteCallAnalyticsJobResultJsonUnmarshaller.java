/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.transcribe.model.transform;

import com.amazonaws.services.transcribe.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DeleteCallAnalyticsJobResult
 */
public class DeleteCallAnalyticsJobResultJsonUnmarshaller implements
        Unmarshaller<DeleteCallAnalyticsJobResult, JsonUnmarshallerContext> {

    public DeleteCallAnalyticsJobResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DeleteCallAnalyticsJobResult deleteCallAnalyticsJobResult = new DeleteCallAnalyticsJobResult();

        return deleteCallAnalyticsJobResult;
    }

    private static DeleteCallAnalyticsJobResultJsonUnmarshaller instance;

    public static DeleteCallAnalyticsJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteCallAnalyticsJobResultJsonUnmarshaller();
        return instance;
    }
}
