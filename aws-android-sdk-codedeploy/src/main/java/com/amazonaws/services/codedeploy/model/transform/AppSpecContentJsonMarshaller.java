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
 * JSON marshaller for POJO AppSpecContent
 */
class AppSpecContentJsonMarshaller {

    public void marshall(AppSpecContent appSpecContent, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (appSpecContent.getContent() != null) {
            String content = appSpecContent.getContent();
            jsonWriter.name("content");
            jsonWriter.value(content);
        }
        if (appSpecContent.getSha256() != null) {
            String sha256 = appSpecContent.getSha256();
            jsonWriter.name("sha256");
            jsonWriter.value(sha256);
        }
        jsonWriter.endObject();
    }

    private static AppSpecContentJsonMarshaller instance;

    public static AppSpecContentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AppSpecContentJsonMarshaller();
        return instance;
    }
}
