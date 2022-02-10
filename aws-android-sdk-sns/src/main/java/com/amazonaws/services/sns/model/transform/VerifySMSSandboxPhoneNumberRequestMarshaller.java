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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for VerifySMSSandboxPhoneNumberRequest
 */
public class VerifySMSSandboxPhoneNumberRequestMarshaller implements
        Marshaller<Request<VerifySMSSandboxPhoneNumberRequest>, VerifySMSSandboxPhoneNumberRequest> {

    public Request<VerifySMSSandboxPhoneNumberRequest> marshall(
            VerifySMSSandboxPhoneNumberRequest verifySMSSandboxPhoneNumberRequest) {
        if (verifySMSSandboxPhoneNumberRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(VerifySMSSandboxPhoneNumberRequest)");
        }

        Request<VerifySMSSandboxPhoneNumberRequest> request = new DefaultRequest<VerifySMSSandboxPhoneNumberRequest>(
                verifySMSSandboxPhoneNumberRequest, "AmazonSNS");
        request.addParameter("Action", "VerifySMSSandboxPhoneNumber");
        request.addParameter("Version", "2010-03-31");

        String prefix;
        if (verifySMSSandboxPhoneNumberRequest.getPhoneNumber() != null) {
            prefix = "PhoneNumber";
            String phoneNumber = verifySMSSandboxPhoneNumberRequest.getPhoneNumber();
            request.addParameter(prefix, StringUtils.fromString(phoneNumber));
        }
        if (verifySMSSandboxPhoneNumberRequest.getOneTimePassword() != null) {
            prefix = "OneTimePassword";
            String oneTimePassword = verifySMSSandboxPhoneNumberRequest.getOneTimePassword();
            request.addParameter(prefix, StringUtils.fromString(oneTimePassword));
        }

        return request;
    }
}
