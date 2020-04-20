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

package com.amazonaws.services.amazonapigatewayv2.model.transform;

import com.amazonaws.services.amazonapigatewayv2.model.*;
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
            if (name.equals("AccessLogSettings")) {
                createStageResult.setAccessLogSettings(AccessLogSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ApiGatewayManaged")) {
                createStageResult.setApiGatewayManaged(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AutoDeploy")) {
                createStageResult.setAutoDeploy(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ClientCertificateId")) {
                createStageResult.setClientCertificateId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedDate")) {
                createStageResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultRouteSettings")) {
                createStageResult.setDefaultRouteSettings(RouteSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeploymentId")) {
                createStageResult.setDeploymentId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                createStageResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastDeploymentStatusMessage")) {
                createStageResult.setLastDeploymentStatusMessage(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdatedDate")) {
                createStageResult.setLastUpdatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RouteSettings")) {
                createStageResult.setRouteSettings(new MapUnmarshaller<RouteSettings>(
                        RouteSettingsJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("StageName")) {
                createStageResult.setStageName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StageVariables")) {
                createStageResult.setStageVariables(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Tags")) {
                createStageResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
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
