/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ContactSearchSummary
 */
class ContactSearchSummaryJsonUnmarshaller implements
        Unmarshaller<ContactSearchSummary, JsonUnmarshallerContext> {

    public ContactSearchSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ContactSearchSummary contactSearchSummary = new ContactSearchSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                contactSearchSummary.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                contactSearchSummary.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InitialContactId")) {
                contactSearchSummary.setInitialContactId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PreviousContactId")) {
                contactSearchSummary.setPreviousContactId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InitiationMethod")) {
                contactSearchSummary.setInitiationMethod(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Channel")) {
                contactSearchSummary.setChannel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("QueueInfo")) {
                contactSearchSummary.setQueueInfo(ContactSearchSummaryQueueInfoJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AgentInfo")) {
                contactSearchSummary.setAgentInfo(ContactSearchSummaryAgentInfoJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("InitiationTimestamp")) {
                contactSearchSummary.setInitiationTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DisconnectTimestamp")) {
                contactSearchSummary.setDisconnectTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ScheduledTimestamp")) {
                contactSearchSummary.setScheduledTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return contactSearchSummary;
    }

    private static ContactSearchSummaryJsonUnmarshaller instance;

    public static ContactSearchSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContactSearchSummaryJsonUnmarshaller();
        return instance;
    }
}
