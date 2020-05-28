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
 * JSON unmarshaller for POJO ClusterOperationInfo
 */
class ClusterOperationInfoJsonUnmarshaller implements
        Unmarshaller<ClusterOperationInfo, JsonUnmarshallerContext> {

    public ClusterOperationInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ClusterOperationInfo clusterOperationInfo = new ClusterOperationInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ClientRequestId")) {
                clusterOperationInfo.setClientRequestId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ClusterArn")) {
                clusterOperationInfo.setClusterArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                clusterOperationInfo.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndTime")) {
                clusterOperationInfo.setEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ErrorInfo")) {
                clusterOperationInfo.setErrorInfo(ErrorInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OperationArn")) {
                clusterOperationInfo.setOperationArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OperationState")) {
                clusterOperationInfo.setOperationState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OperationSteps")) {
                clusterOperationInfo.setOperationSteps(new ListUnmarshaller<ClusterOperationStep>(
                        ClusterOperationStepJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("OperationType")) {
                clusterOperationInfo.setOperationType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceClusterInfo")) {
                clusterOperationInfo.setSourceClusterInfo(MutableClusterInfoJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetClusterInfo")) {
                clusterOperationInfo.setTargetClusterInfo(MutableClusterInfoJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return clusterOperationInfo;
    }

    private static ClusterOperationInfoJsonUnmarshaller instance;

    public static ClusterOperationInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClusterOperationInfoJsonUnmarshaller();
        return instance;
    }
}
