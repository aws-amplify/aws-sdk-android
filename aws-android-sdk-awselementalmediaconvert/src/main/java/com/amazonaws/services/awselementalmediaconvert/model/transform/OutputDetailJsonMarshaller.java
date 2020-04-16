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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO OutputDetail
 */
class OutputDetailJsonMarshaller {

    public void marshall(OutputDetail outputDetail, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (outputDetail.getDurationInMs() != null) {
            Integer durationInMs = outputDetail.getDurationInMs();
            jsonWriter.name("DurationInMs");
            jsonWriter.value(durationInMs);
        }
        if (outputDetail.getVideoDetails() != null) {
            VideoDetail videoDetails = outputDetail.getVideoDetails();
            jsonWriter.name("VideoDetails");
            VideoDetailJsonMarshaller.getInstance().marshall(videoDetails, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static OutputDetailJsonMarshaller instance;

    public static OutputDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OutputDetailJsonMarshaller();
        return instance;
    }
}
