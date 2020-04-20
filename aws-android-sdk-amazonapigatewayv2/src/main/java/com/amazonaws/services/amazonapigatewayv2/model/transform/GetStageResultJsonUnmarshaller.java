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
            if (name.equals("AccessLogSettings")) {
                getStageResult.setAccessLogSettings(AccessLogSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ApiGatewayManaged")) {
                getStageResult.setApiGatewayManaged(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AutoDeploy")) {
                getStageResult.setAutoDeploy(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ClientCertificateId")) {
                getStageResult.setClientCertificateId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedDate")) {
                getStageResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultRouteSettings")) {
                getStageResult.setDefaultRouteSettings(RouteSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeploymentId")) {
                getStageResult.setDeploymentId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                getStageResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastDeploymentStatusMessage")) {
                getStageResult.setLastDeploymentStatusMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdatedDate")) {
                getStageResult.setLastUpdatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RouteSettings")) {
                getStageResult.setRouteSettings(new MapUnmarshaller<RouteSettings>(
                        RouteSettingsJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("StageName")) {
                getStageResult.setStageName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StageVariables")) {
                getStageResult.setStageVariables(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Tags")) {
                getStageResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
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
