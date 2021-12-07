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
 * JSON marshaller for POJO ChannelMembershipPreferences
 */
class ChannelMembershipPreferencesJsonMarshaller {

    public void marshall(ChannelMembershipPreferences channelMembershipPreferences,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (channelMembershipPreferences.getPushNotifications() != null) {
            PushNotificationPreferences pushNotifications = channelMembershipPreferences
                    .getPushNotifications();
            jsonWriter.name("PushNotifications");
            PushNotificationPreferencesJsonMarshaller.getInstance().marshall(pushNotifications,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ChannelMembershipPreferencesJsonMarshaller instance;

    public static ChannelMembershipPreferencesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ChannelMembershipPreferencesJsonMarshaller();
        return instance;
    }
}
