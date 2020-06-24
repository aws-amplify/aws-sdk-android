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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MergeHunkDetail
 */
class MergeHunkDetailJsonMarshaller {

    public void marshall(MergeHunkDetail mergeHunkDetail, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (mergeHunkDetail.getStartLine() != null) {
            Integer startLine = mergeHunkDetail.getStartLine();
            jsonWriter.name("startLine");
            jsonWriter.value(startLine);
        }
        if (mergeHunkDetail.getEndLine() != null) {
            Integer endLine = mergeHunkDetail.getEndLine();
            jsonWriter.name("endLine");
            jsonWriter.value(endLine);
        }
        if (mergeHunkDetail.getHunkContent() != null) {
            String hunkContent = mergeHunkDetail.getHunkContent();
            jsonWriter.name("hunkContent");
            jsonWriter.value(hunkContent);
        }
        jsonWriter.endObject();
    }

    private static MergeHunkDetailJsonMarshaller instance;

    public static MergeHunkDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MergeHunkDetailJsonMarshaller();
        return instance;
    }
}
