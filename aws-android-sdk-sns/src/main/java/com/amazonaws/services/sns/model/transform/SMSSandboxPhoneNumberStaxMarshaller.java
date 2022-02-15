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

package com.amazonaws.services.sns.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO SMSSandboxPhoneNumber
 */
class SMSSandboxPhoneNumberStaxMarshaller {

    public void marshall(SMSSandboxPhoneNumber _sMSSandboxPhoneNumber, Request<?> request,
            String _prefix) {
        String prefix;
        if (_sMSSandboxPhoneNumber.getPhoneNumber() != null) {
            prefix = _prefix + "PhoneNumber";
            String phoneNumber = _sMSSandboxPhoneNumber.getPhoneNumber();
            request.addParameter(prefix, StringUtils.fromString(phoneNumber));
        }
        if (_sMSSandboxPhoneNumber.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _sMSSandboxPhoneNumber.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
    }

    private static SMSSandboxPhoneNumberStaxMarshaller instance;

    public static SMSSandboxPhoneNumberStaxMarshaller getInstance() {
        if (instance == null)
            instance = new SMSSandboxPhoneNumberStaxMarshaller();
        return instance;
    }
}
