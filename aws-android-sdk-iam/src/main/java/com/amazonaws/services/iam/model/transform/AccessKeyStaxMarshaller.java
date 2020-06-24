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
 * StAX marshaller for POJO AccessKey
 */
class AccessKeyStaxMarshaller {

    public void marshall(AccessKey _accessKey, Request<?> request, String _prefix) {
        String prefix;
        if (_accessKey.getUserName() != null) {
            prefix = _prefix + "UserName";
            String userName = _accessKey.getUserName();
            request.addParameter(prefix, StringUtils.fromString(userName));
        }
        if (_accessKey.getAccessKeyId() != null) {
            prefix = _prefix + "AccessKeyId";
            String accessKeyId = _accessKey.getAccessKeyId();
            request.addParameter(prefix, StringUtils.fromString(accessKeyId));
        }
        if (_accessKey.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _accessKey.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_accessKey.getSecretAccessKey() != null) {
            prefix = _prefix + "SecretAccessKey";
            String secretAccessKey = _accessKey.getSecretAccessKey();
            request.addParameter(prefix, StringUtils.fromString(secretAccessKey));
        }
        if (_accessKey.getCreateDate() != null) {
            prefix = _prefix + "CreateDate";
            java.util.Date createDate = _accessKey.getCreateDate();
            request.addParameter(prefix, StringUtils.fromDate(createDate));
        }
    }

    private static AccessKeyStaxMarshaller instance;

    public static AccessKeyStaxMarshaller getInstance() {
        if (instance == null)
            instance = new AccessKeyStaxMarshaller();
        return instance;
    }
}
