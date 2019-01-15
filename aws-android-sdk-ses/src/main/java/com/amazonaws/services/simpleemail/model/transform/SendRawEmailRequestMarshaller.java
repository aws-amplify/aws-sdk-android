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
 * StAX request marshaller for SendRawEmailRequest
 */
public class SendRawEmailRequestMarshaller implements
        Marshaller<Request<SendRawEmailRequest>, SendRawEmailRequest> {

    public Request<SendRawEmailRequest> marshall(SendRawEmailRequest sendRawEmailRequest) {
        if (sendRawEmailRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SendRawEmailRequest)");
        }

        Request<SendRawEmailRequest> request = new DefaultRequest<SendRawEmailRequest>(
                sendRawEmailRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "SendRawEmail");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (sendRawEmailRequest.getSource() != null) {
            prefix = "Source";
            String source = sendRawEmailRequest.getSource();
            request.addParameter(prefix, StringUtils.fromString(source));
        }
        if (sendRawEmailRequest.getDestinations() != null) {
            prefix = "Destinations";
            java.util.List<String> destinations = sendRawEmailRequest.getDestinations();
            int destinationsIndex = 1;
            String destinationsPrefix = prefix;
            for (String destinationsItem : destinations) {
                prefix = destinationsPrefix + ".member." + destinationsIndex;
                if (destinationsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(destinationsItem));
                }
                destinationsIndex++;
            }
            prefix = destinationsPrefix;
        }
        if (sendRawEmailRequest.getRawMessage() != null) {
            prefix = "RawMessage";
            RawMessage rawMessage = sendRawEmailRequest.getRawMessage();
            RawMessageStaxMarshaller.getInstance().marshall(rawMessage, request, prefix + ".");
        }
        if (sendRawEmailRequest.getFromArn() != null) {
            prefix = "FromArn";
            String fromArn = sendRawEmailRequest.getFromArn();
            request.addParameter(prefix, StringUtils.fromString(fromArn));
        }
        if (sendRawEmailRequest.getSourceArn() != null) {
            prefix = "SourceArn";
            String sourceArn = sendRawEmailRequest.getSourceArn();
            request.addParameter(prefix, StringUtils.fromString(sourceArn));
        }
        if (sendRawEmailRequest.getReturnPathArn() != null) {
            prefix = "ReturnPathArn";
            String returnPathArn = sendRawEmailRequest.getReturnPathArn();
            request.addParameter(prefix, StringUtils.fromString(returnPathArn));
        }
        if (sendRawEmailRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<MessageTag> tags = sendRawEmailRequest.getTags();
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
        if (sendRawEmailRequest.getConfigurationSetName() != null) {
            prefix = "ConfigurationSetName";
            String configurationSetName = sendRawEmailRequest.getConfigurationSetName();
            request.addParameter(prefix, StringUtils.fromString(configurationSetName));
        }

        return request;
    }
}
