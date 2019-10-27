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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PushNotificationTemplateRequest
 */
class PushNotificationTemplateRequestJsonMarshaller {

    public void marshall(PushNotificationTemplateRequest pushNotificationTemplateRequest,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (pushNotificationTemplateRequest.getADM() != null) {
            AndroidPushNotificationTemplate aDM = pushNotificationTemplateRequest.getADM();
            jsonWriter.name("ADM");
            AndroidPushNotificationTemplateJsonMarshaller.getInstance().marshall(aDM, jsonWriter);
        }
        if (pushNotificationTemplateRequest.getAPNS() != null) {
            APNSPushNotificationTemplate aPNS = pushNotificationTemplateRequest.getAPNS();
            jsonWriter.name("APNS");
            APNSPushNotificationTemplateJsonMarshaller.getInstance().marshall(aPNS, jsonWriter);
        }
        if (pushNotificationTemplateRequest.getBaidu() != null) {
            AndroidPushNotificationTemplate baidu = pushNotificationTemplateRequest.getBaidu();
            jsonWriter.name("Baidu");
            AndroidPushNotificationTemplateJsonMarshaller.getInstance().marshall(baidu, jsonWriter);
        }
        if (pushNotificationTemplateRequest.getDefault() != null) {
            DefaultPushNotificationTemplate defaultValue = pushNotificationTemplateRequest
                    .getDefault();
            jsonWriter.name("Default");
            DefaultPushNotificationTemplateJsonMarshaller.getInstance().marshall(defaultValue,
                    jsonWriter);
        }
        if (pushNotificationTemplateRequest.getGCM() != null) {
            AndroidPushNotificationTemplate gCM = pushNotificationTemplateRequest.getGCM();
            jsonWriter.name("GCM");
            AndroidPushNotificationTemplateJsonMarshaller.getInstance().marshall(gCM, jsonWriter);
        }
        if (pushNotificationTemplateRequest.getTags() != null) {
            java.util.Map<String, String> tags = pushNotificationTemplateRequest.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static PushNotificationTemplateRequestJsonMarshaller instance;

    public static PushNotificationTemplateRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PushNotificationTemplateRequestJsonMarshaller();
        return instance;
    }
}
