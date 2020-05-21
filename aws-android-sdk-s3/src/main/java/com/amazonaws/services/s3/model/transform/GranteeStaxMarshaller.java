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

package com.amazonaws.services.s3.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO Grantee
 */
class GranteeStaxMarshaller {

    public void marshall(Grantee _grantee, Request<?> request, String _prefix) {
        String prefix;
        if (_grantee.getDisplayName() != null) {
            prefix = _prefix + "DisplayName";
            String displayName = _grantee.getDisplayName();
            request.addParameter(prefix, StringUtils.fromString(displayName));
        }
        if (_grantee.getEmailAddress() != null) {
            prefix = _prefix + "EmailAddress";
            String emailAddress = _grantee.getEmailAddress();
            request.addParameter(prefix, StringUtils.fromString(emailAddress));
        }
        if (_grantee.getID() != null) {
            prefix = _prefix + "ID";
            String iD = _grantee.getID();
            request.addParameter(prefix, StringUtils.fromString(iD));
        }
        if (_grantee.getType() != null) {
            prefix = _prefix + "xsi:type";
            String type = _grantee.getType();
            request.addParameter(prefix, StringUtils.fromString(type));
        }
        if (_grantee.getURI() != null) {
            prefix = _prefix + "URI";
            String uRI = _grantee.getURI();
            request.addParameter(prefix, StringUtils.fromString(uRI));
        }
    }

    private static GranteeStaxMarshaller instance;

    public static GranteeStaxMarshaller getInstance() {
        if (instance == null)
            instance = new GranteeStaxMarshaller();
        return instance;
    }
}
