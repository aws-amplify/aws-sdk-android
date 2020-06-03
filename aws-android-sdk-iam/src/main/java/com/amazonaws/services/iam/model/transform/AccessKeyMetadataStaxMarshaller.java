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
 * StAX marshaller for POJO AccessKeyMetadata
 */
class AccessKeyMetadataStaxMarshaller {

    public void marshall(AccessKeyMetadata _accessKeyMetadata, Request<?> request, String _prefix) {
        String prefix;
        if (_accessKeyMetadata.getUserName() != null) {
            prefix = _prefix + "UserName";
            String userName = _accessKeyMetadata.getUserName();
            request.addParameter(prefix, StringUtils.fromString(userName));
        }
        if (_accessKeyMetadata.getAccessKeyId() != null) {
            prefix = _prefix + "AccessKeyId";
            String accessKeyId = _accessKeyMetadata.getAccessKeyId();
            request.addParameter(prefix, StringUtils.fromString(accessKeyId));
        }
        if (_accessKeyMetadata.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _accessKeyMetadata.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_accessKeyMetadata.getCreateDate() != null) {
            prefix = _prefix + "CreateDate";
            java.util.Date createDate = _accessKeyMetadata.getCreateDate();
            request.addParameter(prefix, StringUtils.fromDate(createDate));
        }
    }

    private static AccessKeyMetadataStaxMarshaller instance;

    public static AccessKeyMetadataStaxMarshaller getInstance() {
        if (instance == null)
            instance = new AccessKeyMetadataStaxMarshaller();
        return instance;
    }
}
