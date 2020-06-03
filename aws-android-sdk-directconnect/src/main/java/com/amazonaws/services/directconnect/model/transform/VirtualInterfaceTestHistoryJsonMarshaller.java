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

package com.amazonaws.services.directconnect.model.transform;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO VirtualInterfaceTestHistory
 */
class VirtualInterfaceTestHistoryJsonMarshaller {

    public void marshall(VirtualInterfaceTestHistory virtualInterfaceTestHistory,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (virtualInterfaceTestHistory.getTestId() != null) {
            String testId = virtualInterfaceTestHistory.getTestId();
            jsonWriter.name("testId");
            jsonWriter.value(testId);
        }
        if (virtualInterfaceTestHistory.getVirtualInterfaceId() != null) {
            String virtualInterfaceId = virtualInterfaceTestHistory.getVirtualInterfaceId();
            jsonWriter.name("virtualInterfaceId");
            jsonWriter.value(virtualInterfaceId);
        }
        if (virtualInterfaceTestHistory.getBgpPeers() != null) {
            java.util.List<String> bgpPeers = virtualInterfaceTestHistory.getBgpPeers();
            jsonWriter.name("bgpPeers");
            jsonWriter.beginArray();
            for (String bgpPeersItem : bgpPeers) {
                if (bgpPeersItem != null) {
                    jsonWriter.value(bgpPeersItem);
                }
            }
            jsonWriter.endArray();
        }
        if (virtualInterfaceTestHistory.getStatus() != null) {
            String status = virtualInterfaceTestHistory.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (virtualInterfaceTestHistory.getOwnerAccount() != null) {
            String ownerAccount = virtualInterfaceTestHistory.getOwnerAccount();
            jsonWriter.name("ownerAccount");
            jsonWriter.value(ownerAccount);
        }
        if (virtualInterfaceTestHistory.getTestDurationInMinutes() != null) {
            Integer testDurationInMinutes = virtualInterfaceTestHistory.getTestDurationInMinutes();
            jsonWriter.name("testDurationInMinutes");
            jsonWriter.value(testDurationInMinutes);
        }
        if (virtualInterfaceTestHistory.getStartTime() != null) {
            java.util.Date startTime = virtualInterfaceTestHistory.getStartTime();
            jsonWriter.name("startTime");
            jsonWriter.value(startTime);
        }
        if (virtualInterfaceTestHistory.getEndTime() != null) {
            java.util.Date endTime = virtualInterfaceTestHistory.getEndTime();
            jsonWriter.name("endTime");
            jsonWriter.value(endTime);
        }
        jsonWriter.endObject();
    }

    private static VirtualInterfaceTestHistoryJsonMarshaller instance;

    public static VirtualInterfaceTestHistoryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VirtualInterfaceTestHistoryJsonMarshaller();
        return instance;
    }
}
