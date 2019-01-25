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
 * StAX marshaller for POJO IdentityDkimAttributes
 */
class IdentityDkimAttributesStaxMarshaller {

    public void marshall(IdentityDkimAttributes _identityDkimAttributes, Request<?> request,
            String _prefix) {
        String prefix;
        if (_identityDkimAttributes.getDkimEnabled() != null) {
            prefix = _prefix + "DkimEnabled";
            Boolean dkimEnabled = _identityDkimAttributes.getDkimEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(dkimEnabled));
        }
        if (_identityDkimAttributes.getDkimVerificationStatus() != null) {
            prefix = _prefix + "DkimVerificationStatus";
            String dkimVerificationStatus = _identityDkimAttributes.getDkimVerificationStatus();
            request.addParameter(prefix, StringUtils.fromString(dkimVerificationStatus));
        }
        if (_identityDkimAttributes.getDkimTokens() != null) {
            prefix = _prefix + "DkimTokens";
            java.util.List<String> dkimTokens = _identityDkimAttributes.getDkimTokens();
            int dkimTokensIndex = 1;
            String dkimTokensPrefix = prefix;
            for (String dkimTokensItem : dkimTokens) {
                prefix = dkimTokensPrefix + ".member." + dkimTokensIndex;
                if (dkimTokensItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(dkimTokensItem));
                }
                dkimTokensIndex++;
            }
            prefix = dkimTokensPrefix;
        }
    }

    private static IdentityDkimAttributesStaxMarshaller instance;

    public static IdentityDkimAttributesStaxMarshaller getInstance() {
        if (instance == null)
            instance = new IdentityDkimAttributesStaxMarshaller();
        return instance;
    }
}
