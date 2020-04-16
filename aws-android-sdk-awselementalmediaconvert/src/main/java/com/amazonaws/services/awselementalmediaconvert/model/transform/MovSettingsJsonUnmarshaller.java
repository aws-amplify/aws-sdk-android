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

package com.amazonaws.services.awselementalmediaconvert.model.transform;

import com.amazonaws.services.awselementalmediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO MovSettings
 */
class MovSettingsJsonUnmarshaller implements Unmarshaller<MovSettings, JsonUnmarshallerContext> {

    public MovSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MovSettings movSettings = new MovSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ClapAtom")) {
                movSettings.setClapAtom(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CslgAtom")) {
                movSettings.setCslgAtom(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Mpeg2FourCCControl")) {
                movSettings.setMpeg2FourCCControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PaddingControl")) {
                movSettings.setPaddingControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Reference")) {
                movSettings.setReference(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return movSettings;
    }

    private static MovSettingsJsonUnmarshaller instance;

    public static MovSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MovSettingsJsonUnmarshaller();
        return instance;
    }
}
