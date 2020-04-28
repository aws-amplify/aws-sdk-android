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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Command
 */
class CommandJsonUnmarshaller implements Unmarshaller<Command, JsonUnmarshallerContext> {

    public Command unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Command command = new Command();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CommandId")) {
                command.setCommandId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DocumentName")) {
                command.setDocumentName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DocumentVersion")) {
                command.setDocumentVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Comment")) {
                command.setComment(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExpiresAfter")) {
                command.setExpiresAfter(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Parameters")) {
                command.setParameters(new MapUnmarshaller<java.util.List<String>>(
                        new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                        )
                                .unmarshall(context));
            } else if (name.equals("InstanceIds")) {
                command.setInstanceIds(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Targets")) {
                command.setTargets(new ListUnmarshaller<Target>(TargetJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RequestedDateTime")) {
                command.setRequestedDateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                command.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusDetails")) {
                command.setStatusDetails(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutputS3Region")) {
                command.setOutputS3Region(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutputS3BucketName")) {
                command.setOutputS3BucketName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutputS3KeyPrefix")) {
                command.setOutputS3KeyPrefix(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxConcurrency")) {
                command.setMaxConcurrency(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxErrors")) {
                command.setMaxErrors(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetCount")) {
                command.setTargetCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompletedCount")) {
                command.setCompletedCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ErrorCount")) {
                command.setErrorCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeliveryTimedOutCount")) {
                command.setDeliveryTimedOutCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServiceRole")) {
                command.setServiceRole(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NotificationConfig")) {
                command.setNotificationConfig(NotificationConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CloudWatchOutputConfig")) {
                command.setCloudWatchOutputConfig(CloudWatchOutputConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return command;
    }

    private static CommandJsonUnmarshaller instance;

    public static CommandJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CommandJsonUnmarshaller();
        return instance;
    }
}
