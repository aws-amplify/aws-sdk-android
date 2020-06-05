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
 * JSON unmarshaller for POJO PushMessageActivity
 */
class PushMessageActivityJsonUnmarshaller implements
        Unmarshaller<PushMessageActivity, JsonUnmarshallerContext> {

    public PushMessageActivity unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PushMessageActivity pushMessageActivity = new PushMessageActivity();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("MessageConfig")) {
                pushMessageActivity.setMessageConfig(JourneyPushMessageJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("NextActivity")) {
                pushMessageActivity.setNextActivity(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TemplateName")) {
                pushMessageActivity.setTemplateName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TemplateVersion")) {
                pushMessageActivity.setTemplateVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return pushMessageActivity;
    }

    private static PushMessageActivityJsonUnmarshaller instance;

    public static PushMessageActivityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PushMessageActivityJsonUnmarshaller();
        return instance;
    }
}
