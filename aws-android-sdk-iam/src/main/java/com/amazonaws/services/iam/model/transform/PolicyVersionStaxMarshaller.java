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
 * StAX marshaller for POJO PolicyVersion
 */
class PolicyVersionStaxMarshaller {

    public void marshall(PolicyVersion _policyVersion, Request<?> request, String _prefix) {
        String prefix;
        if (_policyVersion.getDocument() != null) {
            prefix = _prefix + "Document";
            String document = _policyVersion.getDocument();
            request.addParameter(prefix, StringUtils.fromString(document));
        }
        if (_policyVersion.getVersionId() != null) {
            prefix = _prefix + "VersionId";
            String versionId = _policyVersion.getVersionId();
            request.addParameter(prefix, StringUtils.fromString(versionId));
        }
        if (_policyVersion.getIsDefaultVersion() != null) {
            prefix = _prefix + "IsDefaultVersion";
            Boolean isDefaultVersion = _policyVersion.getIsDefaultVersion();
            request.addParameter(prefix, StringUtils.fromBoolean(isDefaultVersion));
        }
        if (_policyVersion.getCreateDate() != null) {
            prefix = _prefix + "CreateDate";
            java.util.Date createDate = _policyVersion.getCreateDate();
            request.addParameter(prefix, StringUtils.fromDate(createDate));
        }
    }

    private static PolicyVersionStaxMarshaller instance;

    public static PolicyVersionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PolicyVersionStaxMarshaller();
        return instance;
    }
}
