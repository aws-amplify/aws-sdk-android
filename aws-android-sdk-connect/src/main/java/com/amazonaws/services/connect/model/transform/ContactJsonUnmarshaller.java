/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for POJO Contact
 */
class ContactJsonUnmarshaller implements Unmarshaller<Contact, JsonUnmarshallerContext> {

    public Contact unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Contact contact = new Contact();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                contact.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                contact.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InitialContactId")) {
                contact.setInitialContactId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PreviousContactId")) {
                contact.setPreviousContactId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InitiationMethod")) {
                contact.setInitiationMethod(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                contact.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                contact.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Channel")) {
                contact.setChannel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("QueueInfo")) {
                contact.setQueueInfo(QueueInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AgentInfo")) {
                contact.setAgentInfo(AgentInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InitiationTimestamp")) {
                contact.setInitiationTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DisconnectTimestamp")) {
                contact.setDisconnectTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdateTimestamp")) {
                contact.setLastUpdateTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ScheduledTimestamp")) {
                contact.setScheduledTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return contact;
    }

    private static ContactJsonUnmarshaller instance;

    public static ContactJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContactJsonUnmarshaller();
        return instance;
    }
}
