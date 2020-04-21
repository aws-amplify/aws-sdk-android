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

package com.amazonaws.services.amazonelasticmapreduce.model.transform;

import com.amazonaws.services.amazonelasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InstanceGroupDetail
 */
class InstanceGroupDetailJsonMarshaller {

    public void marshall(InstanceGroupDetail instanceGroupDetail, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instanceGroupDetail.getInstanceGroupId() != null) {
            String instanceGroupId = instanceGroupDetail.getInstanceGroupId();
            jsonWriter.name("InstanceGroupId");
            jsonWriter.value(instanceGroupId);
        }
        if (instanceGroupDetail.getName() != null) {
            String name = instanceGroupDetail.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (instanceGroupDetail.getMarket() != null) {
            String market = instanceGroupDetail.getMarket();
            jsonWriter.name("Market");
            jsonWriter.value(market);
        }
        if (instanceGroupDetail.getInstanceRole() != null) {
            String instanceRole = instanceGroupDetail.getInstanceRole();
            jsonWriter.name("InstanceRole");
            jsonWriter.value(instanceRole);
        }
        if (instanceGroupDetail.getBidPrice() != null) {
            String bidPrice = instanceGroupDetail.getBidPrice();
            jsonWriter.name("BidPrice");
            jsonWriter.value(bidPrice);
        }
        if (instanceGroupDetail.getInstanceType() != null) {
            String instanceType = instanceGroupDetail.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (instanceGroupDetail.getInstanceRequestCount() != null) {
            Integer instanceRequestCount = instanceGroupDetail.getInstanceRequestCount();
            jsonWriter.name("InstanceRequestCount");
            jsonWriter.value(instanceRequestCount);
        }
        if (instanceGroupDetail.getInstanceRunningCount() != null) {
            Integer instanceRunningCount = instanceGroupDetail.getInstanceRunningCount();
            jsonWriter.name("InstanceRunningCount");
            jsonWriter.value(instanceRunningCount);
        }
        if (instanceGroupDetail.getState() != null) {
            String state = instanceGroupDetail.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (instanceGroupDetail.getLastStateChangeReason() != null) {
            String lastStateChangeReason = instanceGroupDetail.getLastStateChangeReason();
            jsonWriter.name("LastStateChangeReason");
            jsonWriter.value(lastStateChangeReason);
        }
        if (instanceGroupDetail.getCreationDateTime() != null) {
            java.util.Date creationDateTime = instanceGroupDetail.getCreationDateTime();
            jsonWriter.name("CreationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (instanceGroupDetail.getStartDateTime() != null) {
            java.util.Date startDateTime = instanceGroupDetail.getStartDateTime();
            jsonWriter.name("StartDateTime");
            jsonWriter.value(startDateTime);
        }
        if (instanceGroupDetail.getReadyDateTime() != null) {
            java.util.Date readyDateTime = instanceGroupDetail.getReadyDateTime();
            jsonWriter.name("ReadyDateTime");
            jsonWriter.value(readyDateTime);
        }
        if (instanceGroupDetail.getEndDateTime() != null) {
            java.util.Date endDateTime = instanceGroupDetail.getEndDateTime();
            jsonWriter.name("EndDateTime");
            jsonWriter.value(endDateTime);
        }
        jsonWriter.endObject();
    }

    private static InstanceGroupDetailJsonMarshaller instance;

    public static InstanceGroupDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceGroupDetailJsonMarshaller();
        return instance;
    }
}
