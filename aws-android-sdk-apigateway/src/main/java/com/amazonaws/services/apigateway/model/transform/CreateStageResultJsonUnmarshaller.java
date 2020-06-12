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
 * JSON unmarshaller for response CreateStageResult
 */
public class CreateStageResultJsonUnmarshaller implements
        Unmarshaller<CreateStageResult, JsonUnmarshallerContext> {

    public CreateStageResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateStageResult createStageResult = new CreateStageResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("deploymentId")) {
                createStageResult.setDeploymentId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("clientCertificateId")) {
                createStageResult.setClientCertificateId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("stageName")) {
                createStageResult.setStageName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                createStageResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cacheClusterEnabled")) {
                createStageResult.setCacheClusterEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cacheClusterSize")) {
                createStageResult.setCacheClusterSize(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cacheClusterStatus")) {
                createStageResult.setCacheClusterStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("methodSettings")) {
                createStageResult.setMethodSettings(new MapUnmarshaller<MethodSetting>(
                        MethodSettingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("variables")) {
                createStageResult.setVariables(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("documentationVersion")) {
                createStageResult.setDocumentationVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("accessLogSettings")) {
                createStageResult.setAccessLogSettings(AccessLogSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("canarySettings")) {
                createStageResult.setCanarySettings(CanarySettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tracingEnabled")) {
                createStageResult.setTracingEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("webAclArn")) {
                createStageResult.setWebAclArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                createStageResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("createdDate")) {
                createStageResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedDate")) {
                createStageResult.setLastUpdatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createStageResult;
    }

    private static CreateStageResultJsonUnmarshaller instance;

    public static CreateStageResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateStageResultJsonUnmarshaller();
        return instance;
    }
}
