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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AutoMLChannel
 */
class AutoMLChannelJsonUnmarshaller implements Unmarshaller<AutoMLChannel, JsonUnmarshallerContext> {

    public AutoMLChannel unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AutoMLChannel autoMLChannel = new AutoMLChannel();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DataSource")) {
                autoMLChannel.setDataSource(AutoMLDataSourceJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompressionType")) {
                autoMLChannel.setCompressionType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetAttributeName")) {
                autoMLChannel.setTargetAttributeName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return autoMLChannel;
    }

    private static AutoMLChannelJsonUnmarshaller instance;

    public static AutoMLChannelJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AutoMLChannelJsonUnmarshaller();
        return instance;
    }
}
