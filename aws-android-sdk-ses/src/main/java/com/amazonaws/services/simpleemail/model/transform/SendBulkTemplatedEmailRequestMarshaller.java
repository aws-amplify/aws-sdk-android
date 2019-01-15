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
 * StAX request marshaller for SendBulkTemplatedEmailRequest
 */
public class SendBulkTemplatedEmailRequestMarshaller implements
        Marshaller<Request<SendBulkTemplatedEmailRequest>, SendBulkTemplatedEmailRequest> {

    public Request<SendBulkTemplatedEmailRequest> marshall(
            SendBulkTemplatedEmailRequest sendBulkTemplatedEmailRequest) {
        if (sendBulkTemplatedEmailRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SendBulkTemplatedEmailRequest)");
        }

        Request<SendBulkTemplatedEmailRequest> request = new DefaultRequest<SendBulkTemplatedEmailRequest>(
                sendBulkTemplatedEmailRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "SendBulkTemplatedEmail");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (sendBulkTemplatedEmailRequest.getSource() != null) {
            prefix = "Source";
            String source = sendBulkTemplatedEmailRequest.getSource();
            request.addParameter(prefix, StringUtils.fromString(source));
        }
        if (sendBulkTemplatedEmailRequest.getSourceArn() != null) {
            prefix = "SourceArn";
            String sourceArn = sendBulkTemplatedEmailRequest.getSourceArn();
            request.addParameter(prefix, StringUtils.fromString(sourceArn));
        }
        if (sendBulkTemplatedEmailRequest.getReplyToAddresses() != null) {
            prefix = "ReplyToAddresses";
            java.util.List<String> replyToAddresses = sendBulkTemplatedEmailRequest
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
        if (sendBulkTemplatedEmailRequest.getReturnPath() != null) {
            prefix = "ReturnPath";
            String returnPath = sendBulkTemplatedEmailRequest.getReturnPath();
            request.addParameter(prefix, StringUtils.fromString(returnPath));
        }
        if (sendBulkTemplatedEmailRequest.getReturnPathArn() != null) {
            prefix = "ReturnPathArn";
            String returnPathArn = sendBulkTemplatedEmailRequest.getReturnPathArn();
            request.addParameter(prefix, StringUtils.fromString(returnPathArn));
        }
        if (sendBulkTemplatedEmailRequest.getConfigurationSetName() != null) {
            prefix = "ConfigurationSetName";
            String configurationSetName = sendBulkTemplatedEmailRequest.getConfigurationSetName();
            request.addParameter(prefix, StringUtils.fromString(configurationSetName));
        }
        if (sendBulkTemplatedEmailRequest.getDefaultTags() != null) {
            prefix = "DefaultTags";
            java.util.List<MessageTag> defaultTags = sendBulkTemplatedEmailRequest.getDefaultTags();
            int defaultTagsIndex = 1;
            String defaultTagsPrefix = prefix;
            for (MessageTag defaultTagsItem : defaultTags) {
                prefix = defaultTagsPrefix + ".member." + defaultTagsIndex;
                if (defaultTagsItem != null) {
                    MessageTagStaxMarshaller.getInstance().marshall(defaultTagsItem, request,
                            prefix + ".");
                }
                defaultTagsIndex++;
            }
            prefix = defaultTagsPrefix;
        }
        if (sendBulkTemplatedEmailRequest.getTemplate() != null) {
            prefix = "Template";
            String template = sendBulkTemplatedEmailRequest.getTemplate();
            request.addParameter(prefix, StringUtils.fromString(template));
        }
        if (sendBulkTemplatedEmailRequest.getTemplateArn() != null) {
            prefix = "TemplateArn";
            String templateArn = sendBulkTemplatedEmailRequest.getTemplateArn();
            request.addParameter(prefix, StringUtils.fromString(templateArn));
        }
        if (sendBulkTemplatedEmailRequest.getDefaultTemplateData() != null) {
            prefix = "DefaultTemplateData";
            String defaultTemplateData = sendBulkTemplatedEmailRequest.getDefaultTemplateData();
            request.addParameter(prefix, StringUtils.fromString(defaultTemplateData));
        }
        if (sendBulkTemplatedEmailRequest.getDestinations() != null) {
            prefix = "Destinations";
            java.util.List<BulkEmailDestination> destinations = sendBulkTemplatedEmailRequest
                    .getDestinations();
            int destinationsIndex = 1;
            String destinationsPrefix = prefix;
            for (BulkEmailDestination destinationsItem : destinations) {
                prefix = destinationsPrefix + ".member." + destinationsIndex;
                if (destinationsItem != null) {
                    BulkEmailDestinationStaxMarshaller.getInstance().marshall(destinationsItem,
                            request, prefix + ".");
                }
                destinationsIndex++;
            }
            prefix = destinationsPrefix;
        }

        return request;
    }
}
