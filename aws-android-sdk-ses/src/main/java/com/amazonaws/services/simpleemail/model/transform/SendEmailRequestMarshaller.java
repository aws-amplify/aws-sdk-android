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

package com.amazonaws.services.simpleemail.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for SendEmailRequest
 */
public class SendEmailRequestMarshaller implements
        Marshaller<Request<SendEmailRequest>, SendEmailRequest> {

    public Request<SendEmailRequest> marshall(SendEmailRequest sendEmailRequest) {
        if (sendEmailRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(SendEmailRequest)");
        }

        Request<SendEmailRequest> request = new DefaultRequest<SendEmailRequest>(sendEmailRequest,
                "AmazonSimpleEmailService");
        request.addParameter("Action", "SendEmail");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (sendEmailRequest.getSource() != null) {
            prefix = "Source";
            String source = sendEmailRequest.getSource();
            request.addParameter(prefix, StringUtils.fromString(source));
        }
        if (sendEmailRequest.getDestination() != null) {
            prefix = "Destination";
            Destination destination = sendEmailRequest.getDestination();
            DestinationStaxMarshaller.getInstance().marshall(destination, request, prefix + ".");
        }
        if (sendEmailRequest.getMessage() != null) {
            prefix = "Message";
            Message message = sendEmailRequest.getMessage();
            MessageStaxMarshaller.getInstance().marshall(message, request, prefix + ".");
        }
        if (sendEmailRequest.getReplyToAddresses() != null) {
            prefix = "ReplyToAddresses";
            java.util.List<String> replyToAddresses = sendEmailRequest.getReplyToAddresses();
            int replyToAddressesIndex = 1;
            String replyToAddressesPrefix = prefix;
            for (String replyToAddressesItem : replyToAddresses) {
                prefix = replyToAddressesPrefix + ".member." + replyToAddressesIndex;
                if (replyToAddressesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(replyToAddressesItem));
                }
                replyToAddressesIndex++;
            }
            prefix = replyToAddressesPrefix;
        }
        if (sendEmailRequest.getReturnPath() != null) {
            prefix = "ReturnPath";
            String returnPath = sendEmailRequest.getReturnPath();
            request.addParameter(prefix, StringUtils.fromString(returnPath));
        }
        if (sendEmailRequest.getSourceArn() != null) {
            prefix = "SourceArn";
            String sourceArn = sendEmailRequest.getSourceArn();
            request.addParameter(prefix, StringUtils.fromString(sourceArn));
        }
        if (sendEmailRequest.getReturnPathArn() != null) {
            prefix = "ReturnPathArn";
            String returnPathArn = sendEmailRequest.getReturnPathArn();
            request.addParameter(prefix, StringUtils.fromString(returnPathArn));
        }
        if (sendEmailRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<MessageTag> tags = sendEmailRequest.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix;
            for (MessageTag tagsItem : tags) {
                prefix = tagsPrefix + ".member." + tagsIndex;
                if (tagsItem != null) {
                    MessageTagStaxMarshaller.getInstance()
                            .marshall(tagsItem, request, prefix + ".");
                }
                tagsIndex++;
            }
            prefix = tagsPrefix;
        }
        if (sendEmailRequest.getConfigurationSetName() != null) {
            prefix = "ConfigurationSetName";
            String configurationSetName = sendEmailRequest.getConfigurationSetName();
            request.addParameter(prefix, StringUtils.fromString(configurationSetName));
        }

        return request;
    }
}
