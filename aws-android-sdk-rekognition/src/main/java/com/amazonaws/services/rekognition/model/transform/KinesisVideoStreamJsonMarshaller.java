/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO KinesisVideoStream
 */
class KinesisVideoStreamJsonMarshaller {

    public void marshall(KinesisVideoStream kinesisVideoStream, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (kinesisVideoStream.getArn() != null) {
            String arn = kinesisVideoStream.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        jsonWriter.endObject();
    }

    private static KinesisVideoStreamJsonMarshaller instance;

    public static KinesisVideoStreamJsonMarshaller getInstance() {
        if (instance == null)
            instance = new KinesisVideoStreamJsonMarshaller();
        return instance;
    }
}
