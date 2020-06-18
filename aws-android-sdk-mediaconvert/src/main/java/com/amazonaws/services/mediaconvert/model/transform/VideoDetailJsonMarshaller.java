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
 * JSON marshaller for POJO VideoDetail
 */
class VideoDetailJsonMarshaller {

    public void marshall(VideoDetail videoDetail, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (videoDetail.getHeightInPx() != null) {
            Integer heightInPx = videoDetail.getHeightInPx();
            jsonWriter.name("HeightInPx");
            jsonWriter.value(heightInPx);
        }
        if (videoDetail.getWidthInPx() != null) {
            Integer widthInPx = videoDetail.getWidthInPx();
            jsonWriter.name("WidthInPx");
            jsonWriter.value(widthInPx);
        }
        jsonWriter.endObject();
    }

    private static VideoDetailJsonMarshaller instance;

    public static VideoDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VideoDetailJsonMarshaller();
        return instance;
    }
}
