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

package com.amazonaws.services.awscostexplorerservice.model.transform;

import com.amazonaws.services.awscostexplorerservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO EC2ResourceDetails
 */
class EC2ResourceDetailsJsonUnmarshaller implements
        Unmarshaller<EC2ResourceDetails, JsonUnmarshallerContext> {

    public EC2ResourceDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EC2ResourceDetails eC2ResourceDetails = new EC2ResourceDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("HourlyOnDemandRate")) {
                eC2ResourceDetails.setHourlyOnDemandRate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceType")) {
                eC2ResourceDetails.setInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Platform")) {
                eC2ResourceDetails.setPlatform(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Region")) {
                eC2ResourceDetails.setRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Sku")) {
                eC2ResourceDetails.setSku(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Memory")) {
                eC2ResourceDetails.setMemory(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NetworkPerformance")) {
                eC2ResourceDetails.setNetworkPerformance(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Storage")) {
                eC2ResourceDetails.setStorage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Vcpu")) {
                eC2ResourceDetails.setVcpu(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return eC2ResourceDetails;
    }

    private static EC2ResourceDetailsJsonUnmarshaller instance;

    public static EC2ResourceDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EC2ResourceDetailsJsonUnmarshaller();
        return instance;
    }
}
