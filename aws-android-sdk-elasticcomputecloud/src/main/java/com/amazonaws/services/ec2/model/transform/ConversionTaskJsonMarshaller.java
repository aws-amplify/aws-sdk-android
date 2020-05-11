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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ConversionTask
 */
class ConversionTaskJsonMarshaller {

    public void marshall(ConversionTask conversionTask, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (conversionTask.getConversionTaskId() != null) {
            String conversionTaskId = conversionTask.getConversionTaskId();
            jsonWriter.name("ConversionTaskId");
            jsonWriter.value(conversionTaskId);
        }
        if (conversionTask.getExpirationTime() != null) {
            String expirationTime = conversionTask.getExpirationTime();
            jsonWriter.name("ExpirationTime");
            jsonWriter.value(expirationTime);
        }
        if (conversionTask.getImportInstance() != null) {
            ImportInstanceTaskDetails importInstance = conversionTask.getImportInstance();
            jsonWriter.name("ImportInstance");
            ImportInstanceTaskDetailsJsonMarshaller.getInstance().marshall(importInstance,
                    jsonWriter);
        }
        if (conversionTask.getImportVolume() != null) {
            ImportVolumeTaskDetails importVolume = conversionTask.getImportVolume();
            jsonWriter.name("ImportVolume");
            ImportVolumeTaskDetailsJsonMarshaller.getInstance().marshall(importVolume, jsonWriter);
        }
        if (conversionTask.getState() != null) {
            String state = conversionTask.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (conversionTask.getStatusMessage() != null) {
            String statusMessage = conversionTask.getStatusMessage();
            jsonWriter.name("StatusMessage");
            jsonWriter.value(statusMessage);
        }
        if (conversionTask.getTags() != null) {
            java.util.List<Tag> tags = conversionTask.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ConversionTaskJsonMarshaller instance;

    public static ConversionTaskJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConversionTaskJsonMarshaller();
        return instance;
    }
}
