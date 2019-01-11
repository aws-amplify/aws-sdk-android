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

import com.amazonaws.Request;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO BouncedRecipientInfo
 */
class BouncedRecipientInfoStaxMarshaller {

    public void marshall(BouncedRecipientInfo _bouncedRecipientInfo, Request<?> request,
            String _prefix) {
        String prefix;
        if (_bouncedRecipientInfo.getRecipient() != null) {
            prefix = _prefix + "Recipient";
            String recipient = _bouncedRecipientInfo.getRecipient();
            request.addParameter(prefix, StringUtils.fromString(recipient));
        }
        if (_bouncedRecipientInfo.getRecipientArn() != null) {
            prefix = _prefix + "RecipientArn";
            String recipientArn = _bouncedRecipientInfo.getRecipientArn();
            request.addParameter(prefix, StringUtils.fromString(recipientArn));
        }
        if (_bouncedRecipientInfo.getBounceType() != null) {
            prefix = _prefix + "BounceType";
            String bounceType = _bouncedRecipientInfo.getBounceType();
            request.addParameter(prefix, StringUtils.fromString(bounceType));
        }
        if (_bouncedRecipientInfo.getRecipientDsnFields() != null) {
            prefix = _prefix + "RecipientDsnFields";
            RecipientDsnFields recipientDsnFields = _bouncedRecipientInfo.getRecipientDsnFields();
            RecipientDsnFieldsStaxMarshaller.getInstance().marshall(recipientDsnFields, request,
                    prefix + ".");
        }
    }

    private static BouncedRecipientInfoStaxMarshaller instance;

    public static BouncedRecipientInfoStaxMarshaller getInstance() {
        if (instance == null)
            instance = new BouncedRecipientInfoStaxMarshaller();
        return instance;
    }
}
