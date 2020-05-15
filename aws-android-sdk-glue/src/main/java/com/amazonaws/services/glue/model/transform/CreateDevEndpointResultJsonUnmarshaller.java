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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response CreateDevEndpointResult
 */
public class CreateDevEndpointResultJsonUnmarshaller implements
        Unmarshaller<CreateDevEndpointResult, JsonUnmarshallerContext> {

    public CreateDevEndpointResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateDevEndpointResult createDevEndpointResult = new CreateDevEndpointResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("EndpointName")) {
                createDevEndpointResult.setEndpointName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                createDevEndpointResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SecurityGroupIds")) {
                createDevEndpointResult.setSecurityGroupIds(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SubnetId")) {
                createDevEndpointResult.setSubnetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoleArn")) {
                createDevEndpointResult.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("YarnEndpointAddress")) {
                createDevEndpointResult.setYarnEndpointAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ZeppelinRemoteSparkInterpreterPort")) {
                createDevEndpointResult
                        .setZeppelinRemoteSparkInterpreterPort(IntegerJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("NumberOfNodes")) {
                createDevEndpointResult.setNumberOfNodes(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WorkerType")) {
                createDevEndpointResult.setWorkerType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GlueVersion")) {
                createDevEndpointResult.setGlueVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberOfWorkers")) {
                createDevEndpointResult.setNumberOfWorkers(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailabilityZone")) {
                createDevEndpointResult.setAvailabilityZone(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcId")) {
                createDevEndpointResult.setVpcId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExtraPythonLibsS3Path")) {
                createDevEndpointResult.setExtraPythonLibsS3Path(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExtraJarsS3Path")) {
                createDevEndpointResult.setExtraJarsS3Path(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                createDevEndpointResult.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SecurityConfiguration")) {
                createDevEndpointResult.setSecurityConfiguration(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedTimestamp")) {
                createDevEndpointResult.setCreatedTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Arguments")) {
                createDevEndpointResult.setArguments(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createDevEndpointResult;
    }

    private static CreateDevEndpointResultJsonUnmarshaller instance;

    public static CreateDevEndpointResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateDevEndpointResultJsonUnmarshaller();
        return instance;
    }
}
