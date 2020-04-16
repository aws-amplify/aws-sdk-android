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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Channel
 */
class ChannelJsonUnmarshaller implements Unmarshaller<Channel, JsonUnmarshallerContext> {

    public Channel unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Channel channel = new Channel();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ChannelName")) {
                channel.setChannelName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DataSource")) {
                channel.setDataSource(DataSourceJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ContentType")) {
                channel.setContentType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompressionType")) {
                channel.setCompressionType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RecordWrapperType")) {
                channel.setRecordWrapperType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputMode")) {
                channel.setInputMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ShuffleConfig")) {
                channel.setShuffleConfig(ShuffleConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return channel;
    }

    private static ChannelJsonUnmarshaller instance;

    public static ChannelJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ChannelJsonUnmarshaller();
        return instance;
    }
}
