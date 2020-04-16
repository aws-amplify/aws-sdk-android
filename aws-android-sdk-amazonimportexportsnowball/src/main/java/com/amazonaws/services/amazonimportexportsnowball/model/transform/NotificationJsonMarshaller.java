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

package com.amazonaws.services.amazonimportexportsnowball.model.transform;

import com.amazonaws.services.amazonimportexportsnowball.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Notification
 */
class NotificationJsonMarshaller {

    public void marshall(Notification notification, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (notification.getSnsTopicARN() != null) {
            String snsTopicARN = notification.getSnsTopicARN();
            jsonWriter.name("SnsTopicARN");
            jsonWriter.value(snsTopicARN);
        }
        if (notification.getJobStatesToNotify() != null) {
            java.util.List<String> jobStatesToNotify = notification.getJobStatesToNotify();
            jsonWriter.name("JobStatesToNotify");
            jsonWriter.beginArray();
            for (String jobStatesToNotifyItem : jobStatesToNotify) {
                if (jobStatesToNotifyItem != null) {
                    jsonWriter.value(jobStatesToNotifyItem);
                }
            }
            jsonWriter.endArray();
        }
        if (notification.getNotifyAll() != null) {
            Boolean notifyAll = notification.getNotifyAll();
            jsonWriter.name("NotifyAll");
            jsonWriter.value(notifyAll);
        }
        jsonWriter.endObject();
    }

    private static NotificationJsonMarshaller instance;

    public static NotificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NotificationJsonMarshaller();
        return instance;
    }
}
