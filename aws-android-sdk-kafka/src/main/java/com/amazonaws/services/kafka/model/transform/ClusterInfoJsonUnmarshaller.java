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
 * JSON unmarshaller for POJO ClusterInfo
 */
class ClusterInfoJsonUnmarshaller implements Unmarshaller<ClusterInfo, JsonUnmarshallerContext> {

    public ClusterInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ClusterInfo clusterInfo = new ClusterInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ActiveOperationArn")) {
                clusterInfo.setActiveOperationArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BrokerNodeGroupInfo")) {
                clusterInfo.setBrokerNodeGroupInfo(BrokerNodeGroupInfoJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ClientAuthentication")) {
                clusterInfo.setClientAuthentication(ClientAuthenticationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ClusterArn")) {
                clusterInfo.setClusterArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ClusterName")) {
                clusterInfo.setClusterName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                clusterInfo.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CurrentBrokerSoftwareInfo")) {
                clusterInfo.setCurrentBrokerSoftwareInfo(BrokerSoftwareInfoJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CurrentVersion")) {
                clusterInfo.setCurrentVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EncryptionInfo")) {
                clusterInfo.setEncryptionInfo(EncryptionInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EnhancedMonitoring")) {
                clusterInfo.setEnhancedMonitoring(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OpenMonitoring")) {
                clusterInfo.setOpenMonitoring(OpenMonitoringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LoggingInfo")) {
                clusterInfo.setLoggingInfo(LoggingInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberOfBrokerNodes")) {
                clusterInfo.setNumberOfBrokerNodes(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                clusterInfo.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StateInfo")) {
                clusterInfo.setStateInfo(StateInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                clusterInfo.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ZookeeperConnectString")) {
                clusterInfo.setZookeeperConnectString(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return clusterInfo;
    }

    private static ClusterInfoJsonUnmarshaller instance;

    public static ClusterInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClusterInfoJsonUnmarshaller();
        return instance;
    }
}
