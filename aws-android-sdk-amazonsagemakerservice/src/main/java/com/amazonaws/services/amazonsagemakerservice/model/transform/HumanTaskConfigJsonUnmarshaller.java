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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO HumanTaskConfig
 */
class HumanTaskConfigJsonUnmarshaller implements
        Unmarshaller<HumanTaskConfig, JsonUnmarshallerContext> {

    public HumanTaskConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HumanTaskConfig humanTaskConfig = new HumanTaskConfig();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("WorkteamArn")) {
                humanTaskConfig.setWorkteamArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UiConfig")) {
                humanTaskConfig.setUiConfig(UiConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PreHumanTaskLambdaArn")) {
                humanTaskConfig.setPreHumanTaskLambdaArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TaskKeywords")) {
                humanTaskConfig.setTaskKeywords(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TaskTitle")) {
                humanTaskConfig.setTaskTitle(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TaskDescription")) {
                humanTaskConfig.setTaskDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberOfHumanWorkersPerDataObject")) {
                humanTaskConfig.setNumberOfHumanWorkersPerDataObject(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TaskTimeLimitInSeconds")) {
                humanTaskConfig.setTaskTimeLimitInSeconds(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TaskAvailabilityLifetimeInSeconds")) {
                humanTaskConfig.setTaskAvailabilityLifetimeInSeconds(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxConcurrentTaskCount")) {
                humanTaskConfig.setMaxConcurrentTaskCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AnnotationConsolidationConfig")) {
                humanTaskConfig
                        .setAnnotationConsolidationConfig(AnnotationConsolidationConfigJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("PublicWorkforceTaskPrice")) {
                humanTaskConfig
                        .setPublicWorkforceTaskPrice(PublicWorkforceTaskPriceJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return humanTaskConfig;
    }

    private static HumanTaskConfigJsonUnmarshaller instance;

    public static HumanTaskConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HumanTaskConfigJsonUnmarshaller();
        return instance;
    }
}
