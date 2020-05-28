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

package com.amazonaws.services.kafka.model.transform;

import com.amazonaws.services.kafka.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO BrokerNodeGroupInfo
 */
class BrokerNodeGroupInfoJsonUnmarshaller implements
        Unmarshaller<BrokerNodeGroupInfo, JsonUnmarshallerContext> {

    public BrokerNodeGroupInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        BrokerNodeGroupInfo brokerNodeGroupInfo = new BrokerNodeGroupInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("BrokerAZDistribution")) {
                brokerNodeGroupInfo.setBrokerAZDistribution(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ClientSubnets")) {
                brokerNodeGroupInfo.setClientSubnets(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("InstanceType")) {
                brokerNodeGroupInfo.setInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SecurityGroups")) {
                brokerNodeGroupInfo.setSecurityGroups(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("StorageInfo")) {
                brokerNodeGroupInfo.setStorageInfo(StorageInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return brokerNodeGroupInfo;
    }

    private static BrokerNodeGroupInfoJsonUnmarshaller instance;

    public static BrokerNodeGroupInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BrokerNodeGroupInfoJsonUnmarshaller();
        return instance;
    }
}
