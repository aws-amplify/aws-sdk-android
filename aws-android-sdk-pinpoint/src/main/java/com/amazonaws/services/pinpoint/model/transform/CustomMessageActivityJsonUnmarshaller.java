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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CustomMessageActivity
 */
class CustomMessageActivityJsonUnmarshaller implements
        Unmarshaller<CustomMessageActivity, JsonUnmarshallerContext> {

    public CustomMessageActivity unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CustomMessageActivity customMessageActivity = new CustomMessageActivity();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DeliveryUri")) {
                customMessageActivity.setDeliveryUri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndpointTypes")) {
                customMessageActivity.setEndpointTypes(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("MessageConfig")) {
                customMessageActivity.setMessageConfig(JourneyCustomMessageJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("NextActivity")) {
                customMessageActivity.setNextActivity(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TemplateName")) {
                customMessageActivity.setTemplateName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TemplateVersion")) {
                customMessageActivity.setTemplateVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return customMessageActivity;
    }

    private static CustomMessageActivityJsonUnmarshaller instance;

    public static CustomMessageActivityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CustomMessageActivityJsonUnmarshaller();
        return instance;
    }
}
