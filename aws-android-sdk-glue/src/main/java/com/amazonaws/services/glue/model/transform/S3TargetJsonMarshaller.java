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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO S3Target
 */
class S3TargetJsonMarshaller {

    public void marshall(S3Target s3Target, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (s3Target.getPath() != null) {
            String path = s3Target.getPath();
            jsonWriter.name("Path");
            jsonWriter.value(path);
        }
        if (s3Target.getExclusions() != null) {
            java.util.List<String> exclusions = s3Target.getExclusions();
            jsonWriter.name("Exclusions");
            jsonWriter.beginArray();
            for (String exclusionsItem : exclusions) {
                if (exclusionsItem != null) {
                    jsonWriter.value(exclusionsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static S3TargetJsonMarshaller instance;

    public static S3TargetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3TargetJsonMarshaller();
        return instance;
    }
}
