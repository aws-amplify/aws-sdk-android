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
 * JSON marshaller for POJO MergeHunk
 */
class MergeHunkJsonMarshaller {

    public void marshall(MergeHunk mergeHunk, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (mergeHunk.getIsConflict() != null) {
            Boolean isConflict = mergeHunk.getIsConflict();
            jsonWriter.name("isConflict");
            jsonWriter.value(isConflict);
        }
        if (mergeHunk.getSource() != null) {
            MergeHunkDetail source = mergeHunk.getSource();
            jsonWriter.name("source");
            MergeHunkDetailJsonMarshaller.getInstance().marshall(source, jsonWriter);
        }
        if (mergeHunk.getDestination() != null) {
            MergeHunkDetail destination = mergeHunk.getDestination();
            jsonWriter.name("destination");
            MergeHunkDetailJsonMarshaller.getInstance().marshall(destination, jsonWriter);
        }
        if (mergeHunk.getBase() != null) {
            MergeHunkDetail base = mergeHunk.getBase();
            jsonWriter.name("base");
            MergeHunkDetailJsonMarshaller.getInstance().marshall(base, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static MergeHunkJsonMarshaller instance;

    public static MergeHunkJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MergeHunkJsonMarshaller();
        return instance;
    }
}
