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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO BlockDeviceMapping
 */
class BlockDeviceMappingJsonUnmarshaller implements
        Unmarshaller<BlockDeviceMapping, JsonUnmarshallerContext> {

    public BlockDeviceMapping unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        BlockDeviceMapping blockDeviceMapping = new BlockDeviceMapping();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DeviceName")) {
                blockDeviceMapping.setDeviceName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VirtualName")) {
                blockDeviceMapping.setVirtualName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Ebs")) {
                blockDeviceMapping.setEbs(EbsBlockDeviceJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NoDevice")) {
                blockDeviceMapping.setNoDevice(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return blockDeviceMapping;
    }

    private static BlockDeviceMappingJsonUnmarshaller instance;

    public static BlockDeviceMappingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BlockDeviceMappingJsonUnmarshaller();
        return instance;
    }
}
