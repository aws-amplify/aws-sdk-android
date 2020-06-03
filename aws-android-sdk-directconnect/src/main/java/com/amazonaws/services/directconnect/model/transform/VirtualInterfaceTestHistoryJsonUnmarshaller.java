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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO VirtualInterfaceTestHistory
 */
class VirtualInterfaceTestHistoryJsonUnmarshaller implements
        Unmarshaller<VirtualInterfaceTestHistory, JsonUnmarshallerContext> {

    public VirtualInterfaceTestHistory unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        VirtualInterfaceTestHistory virtualInterfaceTestHistory = new VirtualInterfaceTestHistory();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("testId")) {
                virtualInterfaceTestHistory.setTestId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualInterfaceId")) {
                virtualInterfaceTestHistory.setVirtualInterfaceId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("bgpPeers")) {
                virtualInterfaceTestHistory.setBgpPeers(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("status")) {
                virtualInterfaceTestHistory.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ownerAccount")) {
                virtualInterfaceTestHistory.setOwnerAccount(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("testDurationInMinutes")) {
                virtualInterfaceTestHistory.setTestDurationInMinutes(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("startTime")) {
                virtualInterfaceTestHistory.setStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("endTime")) {
                virtualInterfaceTestHistory.setEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return virtualInterfaceTestHistory;
    }

    private static VirtualInterfaceTestHistoryJsonUnmarshaller instance;

    public static VirtualInterfaceTestHistoryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VirtualInterfaceTestHistoryJsonUnmarshaller();
        return instance;
    }
}
