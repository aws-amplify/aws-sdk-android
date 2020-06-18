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

package com.amazonaws.services.mediaconvert.model.transform;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MotionImageInserter
 */
class MotionImageInserterJsonMarshaller {

    public void marshall(MotionImageInserter motionImageInserter, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (motionImageInserter.getFramerate() != null) {
            MotionImageInsertionFramerate framerate = motionImageInserter.getFramerate();
            jsonWriter.name("Framerate");
            MotionImageInsertionFramerateJsonMarshaller.getInstance().marshall(framerate,
                    jsonWriter);
        }
        if (motionImageInserter.getInput() != null) {
            String input = motionImageInserter.getInput();
            jsonWriter.name("Input");
            jsonWriter.value(input);
        }
        if (motionImageInserter.getInsertionMode() != null) {
            String insertionMode = motionImageInserter.getInsertionMode();
            jsonWriter.name("InsertionMode");
            jsonWriter.value(insertionMode);
        }
        if (motionImageInserter.getOffset() != null) {
            MotionImageInsertionOffset offset = motionImageInserter.getOffset();
            jsonWriter.name("Offset");
            MotionImageInsertionOffsetJsonMarshaller.getInstance().marshall(offset, jsonWriter);
        }
        if (motionImageInserter.getPlayback() != null) {
            String playback = motionImageInserter.getPlayback();
            jsonWriter.name("Playback");
            jsonWriter.value(playback);
        }
        if (motionImageInserter.getStartTime() != null) {
            String startTime = motionImageInserter.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        jsonWriter.endObject();
    }

    private static MotionImageInserterJsonMarshaller instance;

    public static MotionImageInserterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MotionImageInserterJsonMarshaller();
        return instance;
    }
}
