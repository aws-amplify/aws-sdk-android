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
 * JSON unmarshaller for POJO HostProperties
 */
class HostPropertiesJsonUnmarshaller implements
        Unmarshaller<HostProperties, JsonUnmarshallerContext> {

    public HostProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HostProperties hostProperties = new HostProperties();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Cores")) {
                hostProperties.setCores(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceType")) {
                hostProperties.setInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceFamily")) {
                hostProperties.setInstanceFamily(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Sockets")) {
                hostProperties.setSockets(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TotalVCpus")) {
                hostProperties.setTotalVCpus(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return hostProperties;
    }

    private static HostPropertiesJsonUnmarshaller instance;

    public static HostPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HostPropertiesJsonUnmarshaller();
        return instance;
    }
}
