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

package com.amazonaws.services.amplify.model.transform;

import com.amazonaws.services.amplify.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AutoBranchCreationConfig
 */
class AutoBranchCreationConfigJsonUnmarshaller implements
        Unmarshaller<AutoBranchCreationConfig, JsonUnmarshallerContext> {

    public AutoBranchCreationConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AutoBranchCreationConfig autoBranchCreationConfig = new AutoBranchCreationConfig();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("stage")) {
                autoBranchCreationConfig.setStage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("framework")) {
                autoBranchCreationConfig.setFramework(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("enableAutoBuild")) {
                autoBranchCreationConfig.setEnableAutoBuild(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("environmentVariables")) {
                autoBranchCreationConfig.setEnvironmentVariables(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("basicAuthCredentials")) {
                autoBranchCreationConfig.setBasicAuthCredentials(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("enableBasicAuth")) {
                autoBranchCreationConfig.setEnableBasicAuth(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("buildSpec")) {
                autoBranchCreationConfig.setBuildSpec(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("enablePullRequestPreview")) {
                autoBranchCreationConfig.setEnablePullRequestPreview(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("pullRequestEnvironmentName")) {
                autoBranchCreationConfig.setPullRequestEnvironmentName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return autoBranchCreationConfig;
    }

    private static AutoBranchCreationConfigJsonUnmarshaller instance;

    public static AutoBranchCreationConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AutoBranchCreationConfigJsonUnmarshaller();
        return instance;
    }
}
