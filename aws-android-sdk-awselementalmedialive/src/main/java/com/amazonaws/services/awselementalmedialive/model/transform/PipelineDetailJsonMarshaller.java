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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PipelineDetail
 */
class PipelineDetailJsonMarshaller {

    public void marshall(PipelineDetail pipelineDetail, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (pipelineDetail.getActiveInputAttachmentName() != null) {
            String activeInputAttachmentName = pipelineDetail.getActiveInputAttachmentName();
            jsonWriter.name("ActiveInputAttachmentName");
            jsonWriter.value(activeInputAttachmentName);
        }
        if (pipelineDetail.getActiveInputSwitchActionName() != null) {
            String activeInputSwitchActionName = pipelineDetail.getActiveInputSwitchActionName();
            jsonWriter.name("ActiveInputSwitchActionName");
            jsonWriter.value(activeInputSwitchActionName);
        }
        if (pipelineDetail.getPipelineId() != null) {
            String pipelineId = pipelineDetail.getPipelineId();
            jsonWriter.name("PipelineId");
            jsonWriter.value(pipelineId);
        }
        jsonWriter.endObject();
    }

    private static PipelineDetailJsonMarshaller instance;

    public static PipelineDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PipelineDetailJsonMarshaller();
        return instance;
    }
}
