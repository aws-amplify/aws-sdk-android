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
 * StAX request marshaller for SetIdentityMailFromDomainRequest
 */
public class SetIdentityMailFromDomainRequestMarshaller implements
        Marshaller<Request<SetIdentityMailFromDomainRequest>, SetIdentityMailFromDomainRequest> {

    public Request<SetIdentityMailFromDomainRequest> marshall(
            SetIdentityMailFromDomainRequest setIdentityMailFromDomainRequest) {
        if (setIdentityMailFromDomainRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SetIdentityMailFromDomainRequest)");
        }

        Request<SetIdentityMailFromDomainRequest> request = new DefaultRequest<SetIdentityMailFromDomainRequest>(
                setIdentityMailFromDomainRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "SetIdentityMailFromDomain");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (setIdentityMailFromDomainRequest.getIdentity() != null) {
            prefix = "Identity";
            String identity = setIdentityMailFromDomainRequest.getIdentity();
            request.addParameter(prefix, StringUtils.fromString(identity));
        }
        if (setIdentityMailFromDomainRequest.getMailFromDomain() != null) {
            prefix = "MailFromDomain";
            String mailFromDomain = setIdentityMailFromDomainRequest.getMailFromDomain();
            request.addParameter(prefix, StringUtils.fromString(mailFromDomain));
        }
        if (setIdentityMailFromDomainRequest.getBehaviorOnMXFailure() != null) {
            prefix = "BehaviorOnMXFailure";
            String behaviorOnMXFailure = setIdentityMailFromDomainRequest.getBehaviorOnMXFailure();
            request.addParameter(prefix, StringUtils.fromString(behaviorOnMXFailure));
        }

        return request;
    }
}
