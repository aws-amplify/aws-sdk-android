/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo.model.transform;

import com.amazonaws.services.kinesisvideo.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RecorderConfig
 */
class RecorderConfigJsonMarshaller {

    public void marshall(RecorderConfig recorderConfig, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (recorderConfig.getMediaSourceConfig() != null) {
            MediaSourceConfig mediaSourceConfig = recorderConfig.getMediaSourceConfig();
            jsonWriter.name("MediaSourceConfig");
            MediaSourceConfigJsonMarshaller.getInstance().marshall(mediaSourceConfig, jsonWriter);
        }
        if (recorderConfig.getScheduleConfig() != null) {
            ScheduleConfig scheduleConfig = recorderConfig.getScheduleConfig();
            jsonWriter.name("ScheduleConfig");
            ScheduleConfigJsonMarshaller.getInstance().marshall(scheduleConfig, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static RecorderConfigJsonMarshaller instance;

    public static RecorderConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RecorderConfigJsonMarshaller();
        return instance;
    }
}
