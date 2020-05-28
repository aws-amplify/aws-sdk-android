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
 * JSON unmarshaller for POJO MutableClusterInfo
 */
class MutableClusterInfoJsonUnmarshaller implements
        Unmarshaller<MutableClusterInfo, JsonUnmarshallerContext> {

    public MutableClusterInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MutableClusterInfo mutableClusterInfo = new MutableClusterInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("BrokerEBSVolumeInfo")) {
                mutableClusterInfo
                        .setBrokerEBSVolumeInfo(new ListUnmarshaller<BrokerEBSVolumeInfo>(
                                BrokerEBSVolumeInfoJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ConfigurationInfo")) {
                mutableClusterInfo.setConfigurationInfo(ConfigurationInfoJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberOfBrokerNodes")) {
                mutableClusterInfo.setNumberOfBrokerNodes(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EnhancedMonitoring")) {
                mutableClusterInfo.setEnhancedMonitoring(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OpenMonitoring")) {
                mutableClusterInfo.setOpenMonitoring(OpenMonitoringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KafkaVersion")) {
                mutableClusterInfo.setKafkaVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LoggingInfo")) {
                mutableClusterInfo.setLoggingInfo(LoggingInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return mutableClusterInfo;
    }

    private static MutableClusterInfoJsonUnmarshaller instance;

    public static MutableClusterInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MutableClusterInfoJsonUnmarshaller();
        return instance;
    }
}
