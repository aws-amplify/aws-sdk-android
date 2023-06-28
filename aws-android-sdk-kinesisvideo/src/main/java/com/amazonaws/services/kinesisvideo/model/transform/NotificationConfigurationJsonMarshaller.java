/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo.model.transform;

import com.amazonaws.services.kinesisvideo.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NotificationConfiguration
 */
class NotificationConfigurationJsonMarshaller {

    public void marshall(NotificationConfiguration notificationConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (notificationConfiguration.getStatus() != null) {
            String status = notificationConfiguration.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (notificationConfiguration.getDestinationConfig() != null) {
            NotificationDestinationConfig destinationConfig = notificationConfiguration
                    .getDestinationConfig();
            jsonWriter.name("DestinationConfig");
            NotificationDestinationConfigJsonMarshaller.getInstance().marshall(destinationConfig,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static NotificationConfigurationJsonMarshaller instance;

    public static NotificationConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NotificationConfigurationJsonMarshaller();
        return instance;
    }
}
