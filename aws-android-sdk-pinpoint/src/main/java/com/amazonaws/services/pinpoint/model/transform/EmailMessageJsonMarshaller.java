/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EmailMessage
 */
class EmailMessageJsonMarshaller {

    public void marshall(EmailMessage emailMessage, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (emailMessage.getBody() != null) {
            String body = emailMessage.getBody();
            jsonWriter.name("Body");
            jsonWriter.value(body);
        }
        if (emailMessage.getFeedbackForwardingAddress() != null) {
            String feedbackForwardingAddress = emailMessage.getFeedbackForwardingAddress();
            jsonWriter.name("FeedbackForwardingAddress");
            jsonWriter.value(feedbackForwardingAddress);
        }
        if (emailMessage.getFromAddress() != null) {
            String fromAddress = emailMessage.getFromAddress();
            jsonWriter.name("FromAddress");
            jsonWriter.value(fromAddress);
        }
        if (emailMessage.getRawEmail() != null) {
            RawEmail rawEmail = emailMessage.getRawEmail();
            jsonWriter.name("RawEmail");
            RawEmailJsonMarshaller.getInstance().marshall(rawEmail, jsonWriter);
        }
        if (emailMessage.getReplyToAddresses() != null) {
            java.util.List<String> replyToAddresses = emailMessage.getReplyToAddresses();
            jsonWriter.name("ReplyToAddresses");
            jsonWriter.beginArray();
            for (String replyToAddressesItem : replyToAddresses) {
                if (replyToAddressesItem != null) {
                    jsonWriter.value(replyToAddressesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (emailMessage.getSimpleEmail() != null) {
            SimpleEmail simpleEmail = emailMessage.getSimpleEmail();
            jsonWriter.name("SimpleEmail");
            SimpleEmailJsonMarshaller.getInstance().marshall(simpleEmail, jsonWriter);
        }
        if (emailMessage.getSubstitutions() != null) {
            java.util.Map<String, java.util.List<String>> substitutions = emailMessage
                    .getSubstitutions();
            jsonWriter.name("Substitutions");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, java.util.List<String>> substitutionsEntry : substitutions
                    .entrySet()) {
                java.util.List<String> substitutionsValue = substitutionsEntry.getValue();
                if (substitutionsValue != null) {
                    jsonWriter.name(substitutionsEntry.getKey());
                    jsonWriter.beginArray();
                    for (String substitutionsValueItem : substitutionsValue) {
                        if (substitutionsValueItem != null) {
                            jsonWriter.value(substitutionsValueItem);
                        }
                    }
                    jsonWriter.endArray();
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static EmailMessageJsonMarshaller instance;

    public static EmailMessageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EmailMessageJsonMarshaller();
        return instance;
    }
}
