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

package com.amazonaws.services.codedeploy.model.transform;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ECSTaskSet
 */
class ECSTaskSetJsonMarshaller {

    public void marshall(ECSTaskSet eCSTaskSet, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (eCSTaskSet.getIdentifer() != null) {
            String identifer = eCSTaskSet.getIdentifer();
            jsonWriter.name("identifer");
            jsonWriter.value(identifer);
        }
        if (eCSTaskSet.getDesiredCount() != null) {
            Long desiredCount = eCSTaskSet.getDesiredCount();
            jsonWriter.name("desiredCount");
            jsonWriter.value(desiredCount);
        }
        if (eCSTaskSet.getPendingCount() != null) {
            Long pendingCount = eCSTaskSet.getPendingCount();
            jsonWriter.name("pendingCount");
            jsonWriter.value(pendingCount);
        }
        if (eCSTaskSet.getRunningCount() != null) {
            Long runningCount = eCSTaskSet.getRunningCount();
            jsonWriter.name("runningCount");
            jsonWriter.value(runningCount);
        }
        if (eCSTaskSet.getStatus() != null) {
            String status = eCSTaskSet.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (eCSTaskSet.getTrafficWeight() != null) {
            Double trafficWeight = eCSTaskSet.getTrafficWeight();
            jsonWriter.name("trafficWeight");
            jsonWriter.value(trafficWeight);
        }
        if (eCSTaskSet.getTargetGroup() != null) {
            TargetGroupInfo targetGroup = eCSTaskSet.getTargetGroup();
            jsonWriter.name("targetGroup");
            TargetGroupInfoJsonMarshaller.getInstance().marshall(targetGroup, jsonWriter);
        }
        if (eCSTaskSet.getTaskSetLabel() != null) {
            String taskSetLabel = eCSTaskSet.getTaskSetLabel();
            jsonWriter.name("taskSetLabel");
            jsonWriter.value(taskSetLabel);
        }
        jsonWriter.endObject();
    }

    private static ECSTaskSetJsonMarshaller instance;

    public static ECSTaskSetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ECSTaskSetJsonMarshaller();
        return instance;
    }
}
