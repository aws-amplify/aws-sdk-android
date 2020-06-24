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
 * JSON marshaller for POJO SubModule
 */
class SubModuleJsonMarshaller {

    public void marshall(SubModule subModule, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (subModule.getCommitId() != null) {
            String commitId = subModule.getCommitId();
            jsonWriter.name("commitId");
            jsonWriter.value(commitId);
        }
        if (subModule.getAbsolutePath() != null) {
            String absolutePath = subModule.getAbsolutePath();
            jsonWriter.name("absolutePath");
            jsonWriter.value(absolutePath);
        }
        if (subModule.getRelativePath() != null) {
            String relativePath = subModule.getRelativePath();
            jsonWriter.name("relativePath");
            jsonWriter.value(relativePath);
        }
        jsonWriter.endObject();
    }

    private static SubModuleJsonMarshaller instance;

    public static SubModuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SubModuleJsonMarshaller();
        return instance;
    }
}
