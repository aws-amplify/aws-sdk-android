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
 * JSON unmarshaller for POJO Scte35TimeSignalApos
 */
class Scte35TimeSignalAposJsonUnmarshaller implements
        Unmarshaller<Scte35TimeSignalApos, JsonUnmarshallerContext> {

    public Scte35TimeSignalApos unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Scte35TimeSignalApos scte35TimeSignalApos = new Scte35TimeSignalApos();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AdAvailOffset")) {
                scte35TimeSignalApos.setAdAvailOffset(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NoRegionalBlackoutFlag")) {
                scte35TimeSignalApos.setNoRegionalBlackoutFlag(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WebDeliveryAllowedFlag")) {
                scte35TimeSignalApos.setWebDeliveryAllowedFlag(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return scte35TimeSignalApos;
    }

    private static Scte35TimeSignalAposJsonUnmarshaller instance;

    public static Scte35TimeSignalAposJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Scte35TimeSignalAposJsonUnmarshaller();
        return instance;
    }
}
