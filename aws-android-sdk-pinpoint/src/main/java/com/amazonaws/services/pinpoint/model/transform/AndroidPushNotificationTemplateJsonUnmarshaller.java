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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AndroidPushNotificationTemplate
 */
class AndroidPushNotificationTemplateJsonUnmarshaller implements
        Unmarshaller<AndroidPushNotificationTemplate, JsonUnmarshallerContext> {

    public AndroidPushNotificationTemplate unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AndroidPushNotificationTemplate androidPushNotificationTemplate = new AndroidPushNotificationTemplate();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Action")) {
                androidPushNotificationTemplate.setAction(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Body")) {
                androidPushNotificationTemplate.setBody(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImageIconUrl")) {
                androidPushNotificationTemplate.setImageIconUrl(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImageUrl")) {
                androidPushNotificationTemplate.setImageUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SmallImageIconUrl")) {
                androidPushNotificationTemplate.setSmallImageIconUrl(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Sound")) {
                androidPushNotificationTemplate.setSound(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Title")) {
                androidPushNotificationTemplate.setTitle(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Url")) {
                androidPushNotificationTemplate.setUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return androidPushNotificationTemplate;
    }

    private static AndroidPushNotificationTemplateJsonUnmarshaller instance;

    public static AndroidPushNotificationTemplateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AndroidPushNotificationTemplateJsonUnmarshaller();
        return instance;
    }
}
