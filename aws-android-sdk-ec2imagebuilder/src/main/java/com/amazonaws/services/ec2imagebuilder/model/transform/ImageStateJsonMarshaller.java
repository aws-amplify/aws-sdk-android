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

package com.amazonaws.services.ec2imagebuilder.model.transform;

import com.amazonaws.services.ec2imagebuilder.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ImageState
 */
class ImageStateJsonMarshaller {

    public void marshall(ImageState imageState, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (imageState.getStatus() != null) {
            String status = imageState.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (imageState.getReason() != null) {
            String reason = imageState.getReason();
            jsonWriter.name("reason");
            jsonWriter.value(reason);
        }
        jsonWriter.endObject();
    }

    private static ImageStateJsonMarshaller instance;

    public static ImageStateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImageStateJsonMarshaller();
        return instance;
    }
}
