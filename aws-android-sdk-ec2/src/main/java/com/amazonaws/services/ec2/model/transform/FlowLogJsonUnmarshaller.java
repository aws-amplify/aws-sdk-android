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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO FlowLog
 */
class FlowLogJsonUnmarshaller implements Unmarshaller<FlowLog, JsonUnmarshallerContext> {

    public FlowLog unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FlowLog flowLog = new FlowLog();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CreationTime")) {
                flowLog.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeliverLogsErrorMessage")) {
                flowLog.setDeliverLogsErrorMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeliverLogsPermissionArn")) {
                flowLog.setDeliverLogsPermissionArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeliverLogsStatus")) {
                flowLog.setDeliverLogsStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FlowLogId")) {
                flowLog.setFlowLogId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FlowLogStatus")) {
                flowLog.setFlowLogStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LogGroupName")) {
                flowLog.setLogGroupName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceId")) {
                flowLog.setResourceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrafficType")) {
                flowLog.setTrafficType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LogDestinationType")) {
                flowLog.setLogDestinationType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LogDestination")) {
                flowLog.setLogDestination(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LogFormat")) {
                flowLog.setLogFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                flowLog.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("MaxAggregationInterval")) {
                flowLog.setMaxAggregationInterval(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return flowLog;
    }

    private static FlowLogJsonUnmarshaller instance;

    public static FlowLogJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FlowLogJsonUnmarshaller();
        return instance;
    }
}
