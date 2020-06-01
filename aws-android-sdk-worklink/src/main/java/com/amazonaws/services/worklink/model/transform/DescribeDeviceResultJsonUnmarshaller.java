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

package com.amazonaws.services.worklink.model.transform;

import com.amazonaws.services.worklink.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeDeviceResult
 */
public class DescribeDeviceResultJsonUnmarshaller implements
        Unmarshaller<DescribeDeviceResult, JsonUnmarshallerContext> {

    public DescribeDeviceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeDeviceResult describeDeviceResult = new DescribeDeviceResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Status")) {
                describeDeviceResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Model")) {
                describeDeviceResult.setModel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Manufacturer")) {
                describeDeviceResult.setManufacturer(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OperatingSystem")) {
                describeDeviceResult.setOperatingSystem(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OperatingSystemVersion")) {
                describeDeviceResult.setOperatingSystemVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PatchLevel")) {
                describeDeviceResult.setPatchLevel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FirstAccessedTime")) {
                describeDeviceResult.setFirstAccessedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastAccessedTime")) {
                describeDeviceResult.setLastAccessedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Username")) {
                describeDeviceResult.setUsername(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeDeviceResult;
    }

    private static DescribeDeviceResultJsonUnmarshaller instance;

    public static DescribeDeviceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDeviceResultJsonUnmarshaller();
        return instance;
    }
}
