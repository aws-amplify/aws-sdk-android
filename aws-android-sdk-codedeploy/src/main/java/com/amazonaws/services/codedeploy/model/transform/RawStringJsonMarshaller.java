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

package com.amazonaws.services.codedeploy.model.transform;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RawString
 */
class RawStringJsonMarshaller {

    public void marshall(RawString rawString, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (rawString.getContent() != null) {
            String content = rawString.getContent();
            jsonWriter.name("content");
            jsonWriter.value(content);
        }
        if (rawString.getSha256() != null) {
            String sha256 = rawString.getSha256();
            jsonWriter.name("sha256");
            jsonWriter.value(sha256);
        }
        jsonWriter.endObject();
    }

    private static RawStringJsonMarshaller instance;

    public static RawStringJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RawStringJsonMarshaller();
        return instance;
    }
}
