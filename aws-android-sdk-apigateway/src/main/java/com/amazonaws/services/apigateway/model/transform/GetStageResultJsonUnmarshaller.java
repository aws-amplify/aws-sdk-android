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
 * JSON unmarshaller for response GetStageResult
 */
public class GetStageResultJsonUnmarshaller implements
        Unmarshaller<GetStageResult, JsonUnmarshallerContext> {

    public GetStageResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetStageResult getStageResult = new GetStageResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("deploymentId")) {
                getStageResult.setDeploymentId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("clientCertificateId")) {
                getStageResult.setClientCertificateId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("stageName")) {
                getStageResult.setStageName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                getStageResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cacheClusterEnabled")) {
                getStageResult.setCacheClusterEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cacheClusterSize")) {
                getStageResult.setCacheClusterSize(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cacheClusterStatus")) {
                getStageResult.setCacheClusterStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("methodSettings")) {
                getStageResult.setMethodSettings(new MapUnmarshaller<MethodSetting>(
                        MethodSettingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("variables")) {
                getStageResult.setVariables(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("documentationVersion")) {
                getStageResult.setDocumentationVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("accessLogSettings")) {
                getStageResult.setAccessLogSettings(AccessLogSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("canarySettings")) {
                getStageResult.setCanarySettings(CanarySettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tracingEnabled")) {
                getStageResult.setTracingEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("webAclArn")) {
                getStageResult.setWebAclArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                getStageResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("createdDate")) {
                getStageResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedDate")) {
                getStageResult.setLastUpdatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getStageResult;
    }

    private static GetStageResultJsonUnmarshaller instance;

    public static GetStageResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetStageResultJsonUnmarshaller();
        return instance;
    }
}
