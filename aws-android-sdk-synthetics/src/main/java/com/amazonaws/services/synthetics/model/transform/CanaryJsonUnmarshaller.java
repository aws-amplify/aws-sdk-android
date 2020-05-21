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

package com.amazonaws.services.synthetics.model.transform;

import com.amazonaws.services.synthetics.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Canary
 */
class CanaryJsonUnmarshaller implements Unmarshaller<Canary, JsonUnmarshallerContext> {

    public Canary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Canary canary = new Canary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Id")) {
                canary.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                canary.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Code")) {
                canary.setCode(CanaryCodeOutputJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExecutionRoleArn")) {
                canary.setExecutionRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Schedule")) {
                canary.setSchedule(CanaryScheduleOutputJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RunConfig")) {
                canary.setRunConfig(CanaryRunConfigOutputJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SuccessRetentionPeriodInDays")) {
                canary.setSuccessRetentionPeriodInDays(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureRetentionPeriodInDays")) {
                canary.setFailureRetentionPeriodInDays(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                canary.setStatus(CanaryStatusJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Timeline")) {
                canary.setTimeline(CanaryTimelineJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ArtifactS3Location")) {
                canary.setArtifactS3Location(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EngineArn")) {
                canary.setEngineArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RuntimeVersion")) {
                canary.setRuntimeVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcConfig")) {
                canary.setVpcConfig(VpcConfigOutputJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                canary.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return canary;
    }

    private static CanaryJsonUnmarshaller instance;

    public static CanaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CanaryJsonUnmarshaller();
        return instance;
    }
}
