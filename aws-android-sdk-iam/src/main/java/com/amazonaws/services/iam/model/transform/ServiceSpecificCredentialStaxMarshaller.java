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
 * StAX marshaller for POJO ServiceSpecificCredential
 */
class ServiceSpecificCredentialStaxMarshaller {

    public void marshall(ServiceSpecificCredential _serviceSpecificCredential, Request<?> request,
            String _prefix) {
        String prefix;
        if (_serviceSpecificCredential.getCreateDate() != null) {
            prefix = _prefix + "CreateDate";
            java.util.Date createDate = _serviceSpecificCredential.getCreateDate();
            request.addParameter(prefix, StringUtils.fromDate(createDate));
        }
        if (_serviceSpecificCredential.getServiceName() != null) {
            prefix = _prefix + "ServiceName";
            String serviceName = _serviceSpecificCredential.getServiceName();
            request.addParameter(prefix, StringUtils.fromString(serviceName));
        }
        if (_serviceSpecificCredential.getServiceUserName() != null) {
            prefix = _prefix + "ServiceUserName";
            String serviceUserName = _serviceSpecificCredential.getServiceUserName();
            request.addParameter(prefix, StringUtils.fromString(serviceUserName));
        }
        if (_serviceSpecificCredential.getServicePassword() != null) {
            prefix = _prefix + "ServicePassword";
            String servicePassword = _serviceSpecificCredential.getServicePassword();
            request.addParameter(prefix, StringUtils.fromString(servicePassword));
        }
        if (_serviceSpecificCredential.getServiceSpecificCredentialId() != null) {
            prefix = _prefix + "ServiceSpecificCredentialId";
            String serviceSpecificCredentialId = _serviceSpecificCredential
                    .getServiceSpecificCredentialId();
            request.addParameter(prefix, StringUtils.fromString(serviceSpecificCredentialId));
        }
        if (_serviceSpecificCredential.getUserName() != null) {
            prefix = _prefix + "UserName";
            String userName = _serviceSpecificCredential.getUserName();
            request.addParameter(prefix, StringUtils.fromString(userName));
        }
        if (_serviceSpecificCredential.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _serviceSpecificCredential.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
    }

    private static ServiceSpecificCredentialStaxMarshaller instance;

    public static ServiceSpecificCredentialStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ServiceSpecificCredentialStaxMarshaller();
        return instance;
    }
}
