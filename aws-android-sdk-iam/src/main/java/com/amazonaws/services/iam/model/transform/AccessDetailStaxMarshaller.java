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
 * StAX marshaller for POJO AccessDetail
 */
class AccessDetailStaxMarshaller {

    public void marshall(AccessDetail _accessDetail, Request<?> request, String _prefix) {
        String prefix;
        if (_accessDetail.getServiceName() != null) {
            prefix = _prefix + "ServiceName";
            String serviceName = _accessDetail.getServiceName();
            request.addParameter(prefix, StringUtils.fromString(serviceName));
        }
        if (_accessDetail.getServiceNamespace() != null) {
            prefix = _prefix + "ServiceNamespace";
            String serviceNamespace = _accessDetail.getServiceNamespace();
            request.addParameter(prefix, StringUtils.fromString(serviceNamespace));
        }
        if (_accessDetail.getRegion() != null) {
            prefix = _prefix + "Region";
            String region = _accessDetail.getRegion();
            request.addParameter(prefix, StringUtils.fromString(region));
        }
        if (_accessDetail.getEntityPath() != null) {
            prefix = _prefix + "EntityPath";
            String entityPath = _accessDetail.getEntityPath();
            request.addParameter(prefix, StringUtils.fromString(entityPath));
        }
        if (_accessDetail.getLastAuthenticatedTime() != null) {
            prefix = _prefix + "LastAuthenticatedTime";
            java.util.Date lastAuthenticatedTime = _accessDetail.getLastAuthenticatedTime();
            request.addParameter(prefix, StringUtils.fromDate(lastAuthenticatedTime));
        }
        if (_accessDetail.getTotalAuthenticatedEntities() != null) {
            prefix = _prefix + "TotalAuthenticatedEntities";
            Integer totalAuthenticatedEntities = _accessDetail.getTotalAuthenticatedEntities();
            request.addParameter(prefix, StringUtils.fromInteger(totalAuthenticatedEntities));
        }
    }

    private static AccessDetailStaxMarshaller instance;

    public static AccessDetailStaxMarshaller getInstance() {
        if (instance == null)
            instance = new AccessDetailStaxMarshaller();
        return instance;
    }
}
