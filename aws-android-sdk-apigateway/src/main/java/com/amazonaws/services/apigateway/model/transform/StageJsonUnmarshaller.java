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

package com.amazonaws.services.apigateway.model.transform;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Stage
 */
class StageJsonUnmarshaller implements Unmarshaller<Stage, JsonUnmarshallerContext> {

    public Stage unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Stage stage = new Stage();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("deploymentId")) {
                stage.setDeploymentId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("clientCertificateId")) {
                stage.setClientCertificateId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("stageName")) {
                stage.setStageName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                stage.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cacheClusterEnabled")) {
                stage.setCacheClusterEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cacheClusterSize")) {
                stage.setCacheClusterSize(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cacheClusterStatus")) {
                stage.setCacheClusterStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("methodSettings")) {
                stage.setMethodSettings(new MapUnmarshaller<MethodSetting>(
                        MethodSettingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("variables")) {
                stage.setVariables(new MapUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("documentationVersion")) {
                stage.setDocumentationVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("accessLogSettings")) {
                stage.setAccessLogSettings(AccessLogSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("canarySettings")) {
                stage.setCanarySettings(CanarySettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tracingEnabled")) {
                stage.setTracingEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("webAclArn")) {
                stage.setWebAclArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                stage.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("createdDate")) {
                stage.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedDate")) {
                stage.setLastUpdatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return stage;
    }

    private static StageJsonUnmarshaller instance;

    public static StageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StageJsonUnmarshaller();
        return instance;
    }
}
