/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO QuickConnectConfig
 */
class QuickConnectConfigJsonMarshaller {

    public void marshall(QuickConnectConfig quickConnectConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (quickConnectConfig.getQuickConnectType() != null) {
            String quickConnectType = quickConnectConfig.getQuickConnectType();
            jsonWriter.name("QuickConnectType");
            jsonWriter.value(quickConnectType);
        }
        if (quickConnectConfig.getUserConfig() != null) {
            UserQuickConnectConfig userConfig = quickConnectConfig.getUserConfig();
            jsonWriter.name("UserConfig");
            UserQuickConnectConfigJsonMarshaller.getInstance().marshall(userConfig, jsonWriter);
        }
        if (quickConnectConfig.getQueueConfig() != null) {
            QueueQuickConnectConfig queueConfig = quickConnectConfig.getQueueConfig();
            jsonWriter.name("QueueConfig");
            QueueQuickConnectConfigJsonMarshaller.getInstance().marshall(queueConfig, jsonWriter);
        }
        if (quickConnectConfig.getPhoneConfig() != null) {
            PhoneNumberQuickConnectConfig phoneConfig = quickConnectConfig.getPhoneConfig();
            jsonWriter.name("PhoneConfig");
            PhoneNumberQuickConnectConfigJsonMarshaller.getInstance().marshall(phoneConfig,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static QuickConnectConfigJsonMarshaller instance;

    public static QuickConnectConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new QuickConnectConfigJsonMarshaller();
        return instance;
    }
}
