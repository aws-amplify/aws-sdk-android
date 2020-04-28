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
 * JSON unmarshaller for response DeleteMultiplexProgramResult
 */
public class DeleteMultiplexProgramResultJsonUnmarshaller implements
        Unmarshaller<DeleteMultiplexProgramResult, JsonUnmarshallerContext> {

    public DeleteMultiplexProgramResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DeleteMultiplexProgramResult deleteMultiplexProgramResult = new DeleteMultiplexProgramResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ChannelId")) {
                deleteMultiplexProgramResult.setChannelId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MultiplexProgramSettings")) {
                deleteMultiplexProgramResult
                        .setMultiplexProgramSettings(MultiplexProgramSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("PacketIdentifiersMap")) {
                deleteMultiplexProgramResult
                        .setPacketIdentifiersMap(MultiplexProgramPacketIdentifiersMapJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("ProgramName")) {
                deleteMultiplexProgramResult.setProgramName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return deleteMultiplexProgramResult;
    }

    private static DeleteMultiplexProgramResultJsonUnmarshaller instance;

    public static DeleteMultiplexProgramResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteMultiplexProgramResultJsonUnmarshaller();
        return instance;
    }
}
