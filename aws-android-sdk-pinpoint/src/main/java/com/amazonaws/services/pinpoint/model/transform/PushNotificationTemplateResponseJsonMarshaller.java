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
 * JSON marshaller for POJO PushNotificationTemplateResponse
 */
class PushNotificationTemplateResponseJsonMarshaller {

    public void marshall(PushNotificationTemplateResponse pushNotificationTemplateResponse,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (pushNotificationTemplateResponse.getADM() != null) {
            AndroidPushNotificationTemplate aDM = pushNotificationTemplateResponse.getADM();
            jsonWriter.name("ADM");
            AndroidPushNotificationTemplateJsonMarshaller.getInstance().marshall(aDM, jsonWriter);
        }
        if (pushNotificationTemplateResponse.getAPNS() != null) {
            APNSPushNotificationTemplate aPNS = pushNotificationTemplateResponse.getAPNS();
            jsonWriter.name("APNS");
            APNSPushNotificationTemplateJsonMarshaller.getInstance().marshall(aPNS, jsonWriter);
        }
        if (pushNotificationTemplateResponse.getArn() != null) {
            String arn = pushNotificationTemplateResponse.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (pushNotificationTemplateResponse.getBaidu() != null) {
            AndroidPushNotificationTemplate baidu = pushNotificationTemplateResponse.getBaidu();
            jsonWriter.name("Baidu");
            AndroidPushNotificationTemplateJsonMarshaller.getInstance().marshall(baidu, jsonWriter);
        }
        if (pushNotificationTemplateResponse.getCreationDate() != null) {
            String creationDate = pushNotificationTemplateResponse.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (pushNotificationTemplateResponse.getDefault() != null) {
            DefaultPushNotificationTemplate defaultValue = pushNotificationTemplateResponse
                    .getDefault();
            jsonWriter.name("Default");
            DefaultPushNotificationTemplateJsonMarshaller.getInstance().marshall(defaultValue,
                    jsonWriter);
        }
        if (pushNotificationTemplateResponse.getGCM() != null) {
            AndroidPushNotificationTemplate gCM = pushNotificationTemplateResponse.getGCM();
            jsonWriter.name("GCM");
            AndroidPushNotificationTemplateJsonMarshaller.getInstance().marshall(gCM, jsonWriter);
        }
        if (pushNotificationTemplateResponse.getLastModifiedDate() != null) {
            String lastModifiedDate = pushNotificationTemplateResponse.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (pushNotificationTemplateResponse.getTags() != null) {
            java.util.Map<String, String> tags = pushNotificationTemplateResponse.getTags();
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
        if (pushNotificationTemplateResponse.getTemplateName() != null) {
            String templateName = pushNotificationTemplateResponse.getTemplateName();
            jsonWriter.name("TemplateName");
            jsonWriter.value(templateName);
        }
        if (pushNotificationTemplateResponse.getTemplateType() != null) {
            String templateType = pushNotificationTemplateResponse.getTemplateType();
            jsonWriter.name("TemplateType");
            jsonWriter.value(templateType);
        }
        jsonWriter.endObject();
    }

    private static PushNotificationTemplateResponseJsonMarshaller instance;

    public static PushNotificationTemplateResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PushNotificationTemplateResponseJsonMarshaller();
        return instance;
    }
}
