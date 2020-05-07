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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO InstancePortInfo
 */
class InstancePortInfoJsonUnmarshaller implements
        Unmarshaller<InstancePortInfo, JsonUnmarshallerContext> {

    public InstancePortInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InstancePortInfo instancePortInfo = new InstancePortInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("fromPort")) {
                instancePortInfo.setFromPort(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("toPort")) {
                instancePortInfo.setToPort(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("protocol")) {
                instancePortInfo.setProtocol(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("accessFrom")) {
                instancePortInfo.setAccessFrom(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("accessType")) {
                instancePortInfo.setAccessType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("commonName")) {
                instancePortInfo.setCommonName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("accessDirection")) {
                instancePortInfo.setAccessDirection(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cidrs")) {
                instancePortInfo.setCidrs(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("cidrListAliases")) {
                instancePortInfo.setCidrListAliases(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return instancePortInfo;
    }

    private static InstancePortInfoJsonUnmarshaller instance;

    public static InstancePortInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstancePortInfoJsonUnmarshaller();
        return instance;
    }
}
