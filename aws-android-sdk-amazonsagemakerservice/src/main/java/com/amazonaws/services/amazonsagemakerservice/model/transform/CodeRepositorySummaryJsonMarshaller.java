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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CodeRepositorySummary
 */
class CodeRepositorySummaryJsonMarshaller {

    public void marshall(CodeRepositorySummary codeRepositorySummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (codeRepositorySummary.getCodeRepositoryName() != null) {
            String codeRepositoryName = codeRepositorySummary.getCodeRepositoryName();
            jsonWriter.name("CodeRepositoryName");
            jsonWriter.value(codeRepositoryName);
        }
        if (codeRepositorySummary.getCodeRepositoryArn() != null) {
            String codeRepositoryArn = codeRepositorySummary.getCodeRepositoryArn();
            jsonWriter.name("CodeRepositoryArn");
            jsonWriter.value(codeRepositoryArn);
        }
        if (codeRepositorySummary.getCreationTime() != null) {
            java.util.Date creationTime = codeRepositorySummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (codeRepositorySummary.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = codeRepositorySummary.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (codeRepositorySummary.getGitConfig() != null) {
            GitConfig gitConfig = codeRepositorySummary.getGitConfig();
            jsonWriter.name("GitConfig");
            GitConfigJsonMarshaller.getInstance().marshall(gitConfig, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static CodeRepositorySummaryJsonMarshaller instance;

    public static CodeRepositorySummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CodeRepositorySummaryJsonMarshaller();
        return instance;
    }
}
