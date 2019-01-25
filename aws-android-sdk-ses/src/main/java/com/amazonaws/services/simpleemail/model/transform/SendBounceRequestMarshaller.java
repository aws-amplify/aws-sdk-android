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
 * StAX request marshaller for SendBounceRequest
 */
public class SendBounceRequestMarshaller implements
        Marshaller<Request<SendBounceRequest>, SendBounceRequest> {

    public Request<SendBounceRequest> marshall(SendBounceRequest sendBounceRequest) {
        if (sendBounceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SendBounceRequest)");
        }

        Request<SendBounceRequest> request = new DefaultRequest<SendBounceRequest>(
                sendBounceRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "SendBounce");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (sendBounceRequest.getOriginalMessageId() != null) {
            prefix = "OriginalMessageId";
            String originalMessageId = sendBounceRequest.getOriginalMessageId();
            request.addParameter(prefix, StringUtils.fromString(originalMessageId));
        }
        if (sendBounceRequest.getBounceSender() != null) {
            prefix = "BounceSender";
            String bounceSender = sendBounceRequest.getBounceSender();
            request.addParameter(prefix, StringUtils.fromString(bounceSender));
        }
        if (sendBounceRequest.getExplanation() != null) {
            prefix = "Explanation";
            String explanation = sendBounceRequest.getExplanation();
            request.addParameter(prefix, StringUtils.fromString(explanation));
        }
        if (sendBounceRequest.getMessageDsn() != null) {
            prefix = "MessageDsn";
            MessageDsn messageDsn = sendBounceRequest.getMessageDsn();
            MessageDsnStaxMarshaller.getInstance().marshall(messageDsn, request, prefix + ".");
        }
        if (sendBounceRequest.getBouncedRecipientInfoList() != null) {
            prefix = "BouncedRecipientInfoList";
            java.util.List<BouncedRecipientInfo> bouncedRecipientInfoList = sendBounceRequest
                    .getBouncedRecipientInfoList();
            int bouncedRecipientInfoListIndex = 1;
            String bouncedRecipientInfoListPrefix = prefix;
            for (BouncedRecipientInfo bouncedRecipientInfoListItem : bouncedRecipientInfoList) {
                prefix = bouncedRecipientInfoListPrefix + ".member."
                        + bouncedRecipientInfoListIndex;
                if (bouncedRecipientInfoListItem != null) {
                    BouncedRecipientInfoStaxMarshaller.getInstance().marshall(
                            bouncedRecipientInfoListItem, request, prefix + ".");
                }
                bouncedRecipientInfoListIndex++;
            }
            prefix = bouncedRecipientInfoListPrefix;
        }
        if (sendBounceRequest.getBounceSenderArn() != null) {
            prefix = "BounceSenderArn";
            String bounceSenderArn = sendBounceRequest.getBounceSenderArn();
            request.addParameter(prefix, StringUtils.fromString(bounceSenderArn));
        }

        return request;
    }
}
