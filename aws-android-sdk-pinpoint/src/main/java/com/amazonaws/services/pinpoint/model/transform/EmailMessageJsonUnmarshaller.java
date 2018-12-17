/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO EmailMessage
 */
class EmailMessageJsonUnmarshaller implements Unmarshaller<EmailMessage, JsonUnmarshallerContext> {

    public EmailMessage unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EmailMessage emailMessage = new EmailMessage();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Body")) {
                emailMessage.setBody(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FeedbackForwardingAddress")) {
                emailMessage.setFeedbackForwardingAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FromAddress")) {
                emailMessage.setFromAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RawEmail")) {
                emailMessage.setRawEmail(RawEmailJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplyToAddresses")) {
                emailMessage.setReplyToAddresses(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SimpleEmail")) {
                emailMessage.setSimpleEmail(SimpleEmailJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Substitutions")) {
                emailMessage.setSubstitutions(new MapUnmarshaller<java.util.List<String>>(
                        new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return emailMessage;
    }

    private static EmailMessageJsonUnmarshaller instance;

    public static EmailMessageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EmailMessageJsonUnmarshaller();
        return instance;
    }
}
