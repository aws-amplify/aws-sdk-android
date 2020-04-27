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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LabelingJobDataAttributes
 */
class LabelingJobDataAttributesJsonMarshaller {

    public void marshall(LabelingJobDataAttributes labelingJobDataAttributes,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (labelingJobDataAttributes.getContentClassifiers() != null) {
            java.util.List<String> contentClassifiers = labelingJobDataAttributes
                    .getContentClassifiers();
            jsonWriter.name("ContentClassifiers");
            jsonWriter.beginArray();
            for (String contentClassifiersItem : contentClassifiers) {
                if (contentClassifiersItem != null) {
                    jsonWriter.value(contentClassifiersItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static LabelingJobDataAttributesJsonMarshaller instance;

    public static LabelingJobDataAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LabelingJobDataAttributesJsonMarshaller();
        return instance;
    }
}
