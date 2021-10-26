/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkmessaging.model.transform;

import com.amazonaws.services.chimesdkmessaging.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PushNotificationPreferences
 */
class PushNotificationPreferencesJsonMarshaller {

    public void marshall(PushNotificationPreferences pushNotificationPreferences,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (pushNotificationPreferences.getAllowNotifications() != null) {
            String allowNotifications = pushNotificationPreferences.getAllowNotifications();
            jsonWriter.name("AllowNotifications");
            jsonWriter.value(allowNotifications);
        }
        if (pushNotificationPreferences.getFilterRule() != null) {
            String filterRule = pushNotificationPreferences.getFilterRule();
            jsonWriter.name("FilterRule");
            jsonWriter.value(filterRule);
        }
        jsonWriter.endObject();
    }

    private static PushNotificationPreferencesJsonMarshaller instance;

    public static PushNotificationPreferencesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PushNotificationPreferencesJsonMarshaller();
        return instance;
    }
}
