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
 * JSON marshaller for POJO StreamProcessorOutput
 */
class StreamProcessorOutputJsonMarshaller {

    public void marshall(StreamProcessorOutput streamProcessorOutput, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (streamProcessorOutput.getKinesisDataStream() != null) {
            KinesisDataStream kinesisDataStream = streamProcessorOutput.getKinesisDataStream();
            jsonWriter.name("KinesisDataStream");
            KinesisDataStreamJsonMarshaller.getInstance().marshall(kinesisDataStream, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static StreamProcessorOutputJsonMarshaller instance;

    public static StreamProcessorOutputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StreamProcessorOutputJsonMarshaller();
        return instance;
    }
}
