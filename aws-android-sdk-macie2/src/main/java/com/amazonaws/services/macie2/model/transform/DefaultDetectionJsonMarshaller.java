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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DefaultDetection
 */
class DefaultDetectionJsonMarshaller {

    public void marshall(DefaultDetection defaultDetection, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (defaultDetection.getCount() != null) {
            Long count = defaultDetection.getCount();
            jsonWriter.name("count");
            jsonWriter.value(count);
        }
        if (defaultDetection.getType() != null) {
            String type = defaultDetection.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static DefaultDetectionJsonMarshaller instance;

    public static DefaultDetectionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DefaultDetectionJsonMarshaller();
        return instance;
    }
}
