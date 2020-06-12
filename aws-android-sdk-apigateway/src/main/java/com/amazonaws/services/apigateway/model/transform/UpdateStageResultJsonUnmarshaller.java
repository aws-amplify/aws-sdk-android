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
 * JSON unmarshaller for response UpdateStageResult
 */
public class UpdateStageResultJsonUnmarshaller implements
        Unmarshaller<UpdateStageResult, JsonUnmarshallerContext> {

    public UpdateStageResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateStageResult updateStageResult = new UpdateStageResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("deploymentId")) {
                updateStageResult.setDeploymentId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("clientCertificateId")) {
                updateStageResult.setClientCertificateId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("stageName")) {
                updateStageResult.setStageName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                updateStageResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cacheClusterEnabled")) {
                updateStageResult.setCacheClusterEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cacheClusterSize")) {
                updateStageResult.setCacheClusterSize(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cacheClusterStatus")) {
                updateStageResult.setCacheClusterStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("methodSettings")) {
                updateStageResult.setMethodSettings(new MapUnmarshaller<MethodSetting>(
                        MethodSettingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("variables")) {
                updateStageResult.setVariables(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("documentationVersion")) {
                updateStageResult.setDocumentationVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("accessLogSettings")) {
                updateStageResult.setAccessLogSettings(AccessLogSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("canarySettings")) {
                updateStageResult.setCanarySettings(CanarySettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tracingEnabled")) {
                updateStageResult.setTracingEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("webAclArn")) {
                updateStageResult.setWebAclArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                updateStageResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("createdDate")) {
                updateStageResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedDate")) {
                updateStageResult.setLastUpdatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateStageResult;
    }

    private static UpdateStageResultJsonUnmarshaller instance;

    public static UpdateStageResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateStageResultJsonUnmarshaller();
        return instance;
    }
}
