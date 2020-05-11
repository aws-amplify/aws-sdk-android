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
package com.amazonaws.services.codeguru-reviewer.model.transform;

import com.amazonaws.services.codeguru-reviewer.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CommitDiffSourceCodeType
 */
class CommitDiffSourceCodeTypeJsonMarshaller {

    public void marshall(CommitDiffSourceCodeType commitDiffSourceCodeType, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (commitDiffSourceCodeType.getSourceCommit() != null) {
            String sourceCommit = commitDiffSourceCodeType.getSourceCommit();
            jsonWriter.name("SourceCommit");
            jsonWriter.value(sourceCommit);
        }
        if (commitDiffSourceCodeType.getDestinationCommit() != null) {
            String destinationCommit = commitDiffSourceCodeType.getDestinationCommit();
            jsonWriter.name("DestinationCommit");
            jsonWriter.value(destinationCommit);
        }
        jsonWriter.endObject();
    }

    private static CommitDiffSourceCodeTypeJsonMarshaller instance;
    public static CommitDiffSourceCodeTypeJsonMarshaller getInstance() {
        if (instance == null) instance = new CommitDiffSourceCodeTypeJsonMarshaller();
        return instance;
    }
}
