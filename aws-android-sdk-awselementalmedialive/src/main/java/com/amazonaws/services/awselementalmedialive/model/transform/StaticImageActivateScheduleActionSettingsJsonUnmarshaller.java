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

package com.amazonaws.services.awselementalmedialive.model.transform;

import com.amazonaws.services.awselementalmedialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO StaticImageActivateScheduleActionSettings
 */
class StaticImageActivateScheduleActionSettingsJsonUnmarshaller implements
        Unmarshaller<StaticImageActivateScheduleActionSettings, JsonUnmarshallerContext> {

    public StaticImageActivateScheduleActionSettings unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        StaticImageActivateScheduleActionSettings staticImageActivateScheduleActionSettings = new StaticImageActivateScheduleActionSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Duration")) {
                staticImageActivateScheduleActionSettings.setDuration(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FadeIn")) {
                staticImageActivateScheduleActionSettings.setFadeIn(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FadeOut")) {
                staticImageActivateScheduleActionSettings.setFadeOut(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Height")) {
                staticImageActivateScheduleActionSettings.setHeight(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Image")) {
                staticImageActivateScheduleActionSettings.setImage(InputLocationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImageX")) {
                staticImageActivateScheduleActionSettings.setImageX(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImageY")) {
                staticImageActivateScheduleActionSettings.setImageY(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Layer")) {
                staticImageActivateScheduleActionSettings.setLayer(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Opacity")) {
                staticImageActivateScheduleActionSettings.setOpacity(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Width")) {
                staticImageActivateScheduleActionSettings.setWidth(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return staticImageActivateScheduleActionSettings;
    }

    private static StaticImageActivateScheduleActionSettingsJsonUnmarshaller instance;

    public static StaticImageActivateScheduleActionSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StaticImageActivateScheduleActionSettingsJsonUnmarshaller();
        return instance;
    }
}
