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
 * JSON marshaller for POJO CustomDetection
 */
class CustomDetectionJsonMarshaller {

    public void marshall(CustomDetection customDetection, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (customDetection.getArn() != null) {
            String arn = customDetection.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (customDetection.getCount() != null) {
            Long count = customDetection.getCount();
            jsonWriter.name("count");
            jsonWriter.value(count);
        }
        if (customDetection.getName() != null) {
            String name = customDetection.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        jsonWriter.endObject();
    }

    private static CustomDetectionJsonMarshaller instance;

    public static CustomDetectionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CustomDetectionJsonMarshaller();
        return instance;
    }
}
