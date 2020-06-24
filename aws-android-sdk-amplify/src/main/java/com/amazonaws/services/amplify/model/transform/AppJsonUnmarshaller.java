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
 * JSON unmarshaller for POJO App
 */
class AppJsonUnmarshaller implements Unmarshaller<App, JsonUnmarshallerContext> {

    public App unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        App app = new App();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("appId")) {
                app.setAppId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("appArn")) {
                app.setAppArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("name")) {
                app.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                app.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("description")) {
                app.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("repository")) {
                app.setRepository(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("platform")) {
                app.setPlatform(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createTime")) {
                app.setCreateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("updateTime")) {
                app.setUpdateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("iamServiceRoleArn")) {
                app.setIamServiceRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("environmentVariables")) {
                app.setEnvironmentVariables(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("defaultDomain")) {
                app.setDefaultDomain(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("enableBranchAutoBuild")) {
                app.setEnableBranchAutoBuild(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("enableBranchAutoDeletion")) {
                app.setEnableBranchAutoDeletion(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("enableBasicAuth")) {
                app.setEnableBasicAuth(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("basicAuthCredentials")) {
                app.setBasicAuthCredentials(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("customRules")) {
                app.setCustomRules(new ListUnmarshaller<CustomRule>(CustomRuleJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("productionBranch")) {
                app.setProductionBranch(ProductionBranchJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("buildSpec")) {
                app.setBuildSpec(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("enableAutoBranchCreation")) {
                app.setEnableAutoBranchCreation(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("autoBranchCreationPatterns")) {
                app.setAutoBranchCreationPatterns(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("autoBranchCreationConfig")) {
                app.setAutoBranchCreationConfig(AutoBranchCreationConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return app;
    }

    private static AppJsonUnmarshaller instance;

    public static AppJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AppJsonUnmarshaller();
        return instance;
    }
}
