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
 * JSON marshaller for POJO VideoSelector
 */
class VideoSelectorJsonMarshaller {

    public void marshall(VideoSelector videoSelector, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (videoSelector.getAlphaBehavior() != null) {
            String alphaBehavior = videoSelector.getAlphaBehavior();
            jsonWriter.name("AlphaBehavior");
            jsonWriter.value(alphaBehavior);
        }
        if (videoSelector.getColorSpace() != null) {
            String colorSpace = videoSelector.getColorSpace();
            jsonWriter.name("ColorSpace");
            jsonWriter.value(colorSpace);
        }
        if (videoSelector.getColorSpaceUsage() != null) {
            String colorSpaceUsage = videoSelector.getColorSpaceUsage();
            jsonWriter.name("ColorSpaceUsage");
            jsonWriter.value(colorSpaceUsage);
        }
        if (videoSelector.getHdr10Metadata() != null) {
            Hdr10Metadata hdr10Metadata = videoSelector.getHdr10Metadata();
            jsonWriter.name("Hdr10Metadata");
            Hdr10MetadataJsonMarshaller.getInstance().marshall(hdr10Metadata, jsonWriter);
        }
        if (videoSelector.getPid() != null) {
            Integer pid = videoSelector.getPid();
            jsonWriter.name("Pid");
            jsonWriter.value(pid);
        }
        if (videoSelector.getProgramNumber() != null) {
            Integer programNumber = videoSelector.getProgramNumber();
            jsonWriter.name("ProgramNumber");
            jsonWriter.value(programNumber);
        }
        if (videoSelector.getRotate() != null) {
            String rotate = videoSelector.getRotate();
            jsonWriter.name("Rotate");
            jsonWriter.value(rotate);
        }
        jsonWriter.endObject();
    }

    private static VideoSelectorJsonMarshaller instance;

    public static VideoSelectorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VideoSelectorJsonMarshaller();
        return instance;
    }
}
