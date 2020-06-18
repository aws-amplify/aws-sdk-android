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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO DomainMembership
 */
class DomainMembershipStaxMarshaller {

    public void marshall(DomainMembership _domainMembership, Request<?> request, String _prefix) {
        String prefix;
        if (_domainMembership.getDomain() != null) {
            prefix = _prefix + "Domain";
            String domain = _domainMembership.getDomain();
            request.addParameter(prefix, StringUtils.fromString(domain));
        }
        if (_domainMembership.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _domainMembership.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_domainMembership.getFQDN() != null) {
            prefix = _prefix + "FQDN";
            String fQDN = _domainMembership.getFQDN();
            request.addParameter(prefix, StringUtils.fromString(fQDN));
        }
        if (_domainMembership.getIAMRoleName() != null) {
            prefix = _prefix + "IAMRoleName";
            String iAMRoleName = _domainMembership.getIAMRoleName();
            request.addParameter(prefix, StringUtils.fromString(iAMRoleName));
        }
    }

    private static DomainMembershipStaxMarshaller instance;

    public static DomainMembershipStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DomainMembershipStaxMarshaller();
        return instance;
    }
}
