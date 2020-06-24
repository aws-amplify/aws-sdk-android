/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iam.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.iam.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO SAMLProviderListEntry
 */
class SAMLProviderListEntryStaxMarshaller {

    public void marshall(SAMLProviderListEntry _sAMLProviderListEntry, Request<?> request,
            String _prefix) {
        String prefix;
        if (_sAMLProviderListEntry.getArn() != null) {
            prefix = _prefix + "Arn";
            String arn = _sAMLProviderListEntry.getArn();
            request.addParameter(prefix, StringUtils.fromString(arn));
        }
        if (_sAMLProviderListEntry.getValidUntil() != null) {
            prefix = _prefix + "ValidUntil";
            java.util.Date validUntil = _sAMLProviderListEntry.getValidUntil();
            request.addParameter(prefix, StringUtils.fromDate(validUntil));
        }
        if (_sAMLProviderListEntry.getCreateDate() != null) {
            prefix = _prefix + "CreateDate";
            java.util.Date createDate = _sAMLProviderListEntry.getCreateDate();
            request.addParameter(prefix, StringUtils.fromDate(createDate));
        }
    }

    private static SAMLProviderListEntryStaxMarshaller instance;

    public static SAMLProviderListEntryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new SAMLProviderListEntryStaxMarshaller();
        return instance;
    }
}
