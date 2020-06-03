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
 * StAX marshaller for POJO ServiceSpecificCredentialMetadata
 */
class ServiceSpecificCredentialMetadataStaxMarshaller {

    public void marshall(ServiceSpecificCredentialMetadata _serviceSpecificCredentialMetadata,
            Request<?> request, String _prefix) {
        String prefix;
        if (_serviceSpecificCredentialMetadata.getUserName() != null) {
            prefix = _prefix + "UserName";
            String userName = _serviceSpecificCredentialMetadata.getUserName();
            request.addParameter(prefix, StringUtils.fromString(userName));
        }
        if (_serviceSpecificCredentialMetadata.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _serviceSpecificCredentialMetadata.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_serviceSpecificCredentialMetadata.getServiceUserName() != null) {
            prefix = _prefix + "ServiceUserName";
            String serviceUserName = _serviceSpecificCredentialMetadata.getServiceUserName();
            request.addParameter(prefix, StringUtils.fromString(serviceUserName));
        }
        if (_serviceSpecificCredentialMetadata.getCreateDate() != null) {
            prefix = _prefix + "CreateDate";
            java.util.Date createDate = _serviceSpecificCredentialMetadata.getCreateDate();
            request.addParameter(prefix, StringUtils.fromDate(createDate));
        }
        if (_serviceSpecificCredentialMetadata.getServiceSpecificCredentialId() != null) {
            prefix = _prefix + "ServiceSpecificCredentialId";
            String serviceSpecificCredentialId = _serviceSpecificCredentialMetadata
                    .getServiceSpecificCredentialId();
            request.addParameter(prefix, StringUtils.fromString(serviceSpecificCredentialId));
        }
        if (_serviceSpecificCredentialMetadata.getServiceName() != null) {
            prefix = _prefix + "ServiceName";
            String serviceName = _serviceSpecificCredentialMetadata.getServiceName();
            request.addParameter(prefix, StringUtils.fromString(serviceName));
        }
    }

    private static ServiceSpecificCredentialMetadataStaxMarshaller instance;

    public static ServiceSpecificCredentialMetadataStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ServiceSpecificCredentialMetadataStaxMarshaller();
        return instance;
    }
}
