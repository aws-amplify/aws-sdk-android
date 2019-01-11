/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.services.kinesis.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response EnableEnhancedMonitoringResult
 */
public class EnableEnhancedMonitoringResultJsonUnmarshaller implements
        Unmarshaller<EnableEnhancedMonitoringResult, JsonUnmarshallerContext> {

    public EnableEnhancedMonitoringResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        EnableEnhancedMonitoringResult enableEnhancedMonitoringResult = new EnableEnhancedMonitoringResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("StreamName")) {
                enableEnhancedMonitoringResult.setStreamName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CurrentShardLevelMetrics")) {
                enableEnhancedMonitoringResult
                        .setCurrentShardLevelMetrics(new ListUnmarshaller<String>(
                                StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DesiredShardLevelMetrics")) {
                enableEnhancedMonitoringResult
                        .setDesiredShardLevelMetrics(new ListUnmarshaller<String>(
                                StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return enableEnhancedMonitoringResult;
    }

    private static EnableEnhancedMonitoringResultJsonUnmarshaller instance;

    public static EnableEnhancedMonitoringResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EnableEnhancedMonitoringResultJsonUnmarshaller();
        return instance;
    }
}
