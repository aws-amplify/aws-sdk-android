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
 * StAX request marshaller for SendTemplatedEmailRequest
 */
public class SendTemplatedEmailRequestMarshaller implements
        Marshaller<Request<SendTemplatedEmailRequest>, SendTemplatedEmailRequest> {

    public Request<SendTemplatedEmailRequest> marshall(
            SendTemplatedEmailRequest sendTemplatedEmailRequest) {
        if (sendTemplatedEmailRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SendTemplatedEmailRequest)");
        }

        Request<SendTemplatedEmailRequest> request = new DefaultRequest<SendTemplatedEmailRequest>(
                sendTemplatedEmailRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "SendTemplatedEmail");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (sendTemplatedEmailRequest.getSource() != null) {
            prefix = "Source";
            String source = sendTemplatedEmailRequest.getSource();
            request.addParameter(prefix, StringUtils.fromString(source));
        }
        if (sendTemplatedEmailRequest.getDestination() != null) {
            prefix = "Destination";
            Destination destination = sendTemplatedEmailRequest.getDestination();
            DestinationStaxMarshaller.getInstance().marshall(destination, request, prefix + ".");
        }
        if (sendTemplatedEmailRequest.getReplyToAddresses() != null) {
            prefix = "ReplyToAddresses";
            java.util.List<String> replyToAddresses = sendTemplatedEmailRequest
                    .getReplyToAddresses();
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
        if (sendTemplatedEmailRequest.getReturnPath() != null) {
            prefix = "ReturnPath";
            String returnPath = sendTemplatedEmailRequest.getReturnPath();
            request.addParameter(prefix, StringUtils.fromString(returnPath));
        }
        if (sendTemplatedEmailRequest.getSourceArn() != null) {
            prefix = "SourceArn";
            String sourceArn = sendTemplatedEmailRequest.getSourceArn();
            request.addParameter(prefix, StringUtils.fromString(sourceArn));
        }
        if (sendTemplatedEmailRequest.getReturnPathArn() != null) {
            prefix = "ReturnPathArn";
            String returnPathArn = sendTemplatedEmailRequest.getReturnPathArn();
            request.addParameter(prefix, StringUtils.fromString(returnPathArn));
        }
        if (sendTemplatedEmailRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<MessageTag> tags = sendTemplatedEmailRequest.getTags();
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
        if (sendTemplatedEmailRequest.getConfigurationSetName() != null) {
            prefix = "ConfigurationSetName";
            String configurationSetName = sendTemplatedEmailRequest.getConfigurationSetName();
            request.addParameter(prefix, StringUtils.fromString(configurationSetName));
        }
        if (sendTemplatedEmailRequest.getTemplate() != null) {
            prefix = "Template";
            String template = sendTemplatedEmailRequest.getTemplate();
            request.addParameter(prefix, StringUtils.fromString(template));
        }
        if (sendTemplatedEmailRequest.getTemplateArn() != null) {
            prefix = "TemplateArn";
            String templateArn = sendTemplatedEmailRequest.getTemplateArn();
            request.addParameter(prefix, StringUtils.fromString(templateArn));
        }
        if (sendTemplatedEmailRequest.getTemplateData() != null) {
            prefix = "TemplateData";
            String templateData = sendTemplatedEmailRequest.getTemplateData();
            request.addParameter(prefix, StringUtils.fromString(templateData));
        }

        return request;
    }
}
