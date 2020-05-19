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

package com.amazonaws.services.chime.model.transform;

import com.amazonaws.services.chime.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MeetingNotificationConfiguration
 */
class MeetingNotificationConfigurationJsonMarshaller {

    public void marshall(MeetingNotificationConfiguration meetingNotificationConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (meetingNotificationConfiguration.getSnsTopicArn() != null) {
            String snsTopicArn = meetingNotificationConfiguration.getSnsTopicArn();
            jsonWriter.name("SnsTopicArn");
            jsonWriter.value(snsTopicArn);
        }
        if (meetingNotificationConfiguration.getSqsQueueArn() != null) {
            String sqsQueueArn = meetingNotificationConfiguration.getSqsQueueArn();
            jsonWriter.name("SqsQueueArn");
            jsonWriter.value(sqsQueueArn);
        }
        jsonWriter.endObject();
    }

    private static MeetingNotificationConfigurationJsonMarshaller instance;

    public static MeetingNotificationConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MeetingNotificationConfigurationJsonMarshaller();
        return instance;
    }
}
