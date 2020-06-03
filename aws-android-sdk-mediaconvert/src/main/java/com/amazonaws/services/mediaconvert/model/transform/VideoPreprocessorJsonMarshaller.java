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
 * JSON marshaller for POJO VideoPreprocessor
 */
class VideoPreprocessorJsonMarshaller {

    public void marshall(VideoPreprocessor videoPreprocessor, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (videoPreprocessor.getColorCorrector() != null) {
            ColorCorrector colorCorrector = videoPreprocessor.getColorCorrector();
            jsonWriter.name("ColorCorrector");
            ColorCorrectorJsonMarshaller.getInstance().marshall(colorCorrector, jsonWriter);
        }
        if (videoPreprocessor.getDeinterlacer() != null) {
            Deinterlacer deinterlacer = videoPreprocessor.getDeinterlacer();
            jsonWriter.name("Deinterlacer");
            DeinterlacerJsonMarshaller.getInstance().marshall(deinterlacer, jsonWriter);
        }
        if (videoPreprocessor.getDolbyVision() != null) {
            DolbyVision dolbyVision = videoPreprocessor.getDolbyVision();
            jsonWriter.name("DolbyVision");
            DolbyVisionJsonMarshaller.getInstance().marshall(dolbyVision, jsonWriter);
        }
        if (videoPreprocessor.getImageInserter() != null) {
            ImageInserter imageInserter = videoPreprocessor.getImageInserter();
            jsonWriter.name("ImageInserter");
            ImageInserterJsonMarshaller.getInstance().marshall(imageInserter, jsonWriter);
        }
        if (videoPreprocessor.getNoiseReducer() != null) {
            NoiseReducer noiseReducer = videoPreprocessor.getNoiseReducer();
            jsonWriter.name("NoiseReducer");
            NoiseReducerJsonMarshaller.getInstance().marshall(noiseReducer, jsonWriter);
        }
        if (videoPreprocessor.getTimecodeBurnin() != null) {
            TimecodeBurnin timecodeBurnin = videoPreprocessor.getTimecodeBurnin();
            jsonWriter.name("TimecodeBurnin");
            TimecodeBurninJsonMarshaller.getInstance().marshall(timecodeBurnin, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static VideoPreprocessorJsonMarshaller instance;

    public static VideoPreprocessorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VideoPreprocessorJsonMarshaller();
        return instance;
    }
}
