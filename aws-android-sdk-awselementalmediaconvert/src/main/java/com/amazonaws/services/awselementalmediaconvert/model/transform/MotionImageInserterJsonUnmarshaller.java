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
 * JSON unmarshaller for POJO MotionImageInserter
 */
class MotionImageInserterJsonUnmarshaller implements
        Unmarshaller<MotionImageInserter, JsonUnmarshallerContext> {

    public MotionImageInserter unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MotionImageInserter motionImageInserter = new MotionImageInserter();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Framerate")) {
                motionImageInserter.setFramerate(MotionImageInsertionFramerateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Input")) {
                motionImageInserter.setInput(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InsertionMode")) {
                motionImageInserter.setInsertionMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Offset")) {
                motionImageInserter.setOffset(MotionImageInsertionOffsetJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Playback")) {
                motionImageInserter.setPlayback(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartTime")) {
                motionImageInserter.setStartTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return motionImageInserter;
    }

    private static MotionImageInserterJsonUnmarshaller instance;

    public static MotionImageInserterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MotionImageInserterJsonUnmarshaller();
        return instance;
    }
}
