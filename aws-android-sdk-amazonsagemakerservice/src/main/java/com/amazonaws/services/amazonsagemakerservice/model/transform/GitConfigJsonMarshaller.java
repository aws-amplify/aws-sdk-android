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
 * JSON marshaller for POJO GitConfig
 */
class GitConfigJsonMarshaller {

    public void marshall(GitConfig gitConfig, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (gitConfig.getRepositoryUrl() != null) {
            String repositoryUrl = gitConfig.getRepositoryUrl();
            jsonWriter.name("RepositoryUrl");
            jsonWriter.value(repositoryUrl);
        }
        if (gitConfig.getBranch() != null) {
            String branch = gitConfig.getBranch();
            jsonWriter.name("Branch");
            jsonWriter.value(branch);
        }
        if (gitConfig.getSecretArn() != null) {
            String secretArn = gitConfig.getSecretArn();
            jsonWriter.name("SecretArn");
            jsonWriter.value(secretArn);
        }
        jsonWriter.endObject();
    }

    private static GitConfigJsonMarshaller instance;

    public static GitConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GitConfigJsonMarshaller();
        return instance;
    }
}
