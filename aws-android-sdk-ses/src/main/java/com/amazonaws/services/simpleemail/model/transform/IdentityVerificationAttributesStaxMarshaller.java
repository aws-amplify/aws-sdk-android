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
 * StAX marshaller for POJO IdentityVerificationAttributes
 */
class IdentityVerificationAttributesStaxMarshaller {

    public void marshall(IdentityVerificationAttributes _identityVerificationAttributes,
            Request<?> request, String _prefix) {
        String prefix;
        if (_identityVerificationAttributes.getVerificationStatus() != null) {
            prefix = _prefix + "VerificationStatus";
            String verificationStatus = _identityVerificationAttributes.getVerificationStatus();
            request.addParameter(prefix, StringUtils.fromString(verificationStatus));
        }
        if (_identityVerificationAttributes.getVerificationToken() != null) {
            prefix = _prefix + "VerificationToken";
            String verificationToken = _identityVerificationAttributes.getVerificationToken();
            request.addParameter(prefix, StringUtils.fromString(verificationToken));
        }
    }

    private static IdentityVerificationAttributesStaxMarshaller instance;

    public static IdentityVerificationAttributesStaxMarshaller getInstance() {
        if (instance == null)
            instance = new IdentityVerificationAttributesStaxMarshaller();
        return instance;
    }
}
