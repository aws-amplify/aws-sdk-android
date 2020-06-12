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

package com.amazonaws.services.cloudformation.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO StackInstance
 */
class StackInstanceStaxMarshaller {

    public void marshall(StackInstance _stackInstance, Request<?> request, String _prefix) {
        String prefix;
        if (_stackInstance.getStackSetId() != null) {
            prefix = _prefix + "StackSetId";
            String stackSetId = _stackInstance.getStackSetId();
            request.addParameter(prefix, StringUtils.fromString(stackSetId));
        }
        if (_stackInstance.getRegion() != null) {
            prefix = _prefix + "Region";
            String region = _stackInstance.getRegion();
            request.addParameter(prefix, StringUtils.fromString(region));
        }
        if (_stackInstance.getAccount() != null) {
            prefix = _prefix + "Account";
            String account = _stackInstance.getAccount();
            request.addParameter(prefix, StringUtils.fromString(account));
        }
        if (_stackInstance.getStackId() != null) {
            prefix = _prefix + "StackId";
            String stackId = _stackInstance.getStackId();
            request.addParameter(prefix, StringUtils.fromString(stackId));
        }
        if (_stackInstance.getParameterOverrides() != null) {
            prefix = _prefix + "ParameterOverrides";
            java.util.List<Parameter> parameterOverrides = _stackInstance.getParameterOverrides();
            int parameterOverridesIndex = 1;
            String parameterOverridesPrefix = prefix;
            for (Parameter parameterOverridesItem : parameterOverrides) {
                prefix = parameterOverridesPrefix + ".member." + parameterOverridesIndex;
                if (parameterOverridesItem != null) {
                    ParameterStaxMarshaller.getInstance().marshall(parameterOverridesItem, request,
                            prefix + ".");
                }
                parameterOverridesIndex++;
            }
            prefix = parameterOverridesPrefix;
        }
        if (_stackInstance.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _stackInstance.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_stackInstance.getStatusReason() != null) {
            prefix = _prefix + "StatusReason";
            String statusReason = _stackInstance.getStatusReason();
            request.addParameter(prefix, StringUtils.fromString(statusReason));
        }
        if (_stackInstance.getOrganizationalUnitId() != null) {
            prefix = _prefix + "OrganizationalUnitId";
            String organizationalUnitId = _stackInstance.getOrganizationalUnitId();
            request.addParameter(prefix, StringUtils.fromString(organizationalUnitId));
        }
        if (_stackInstance.getDriftStatus() != null) {
            prefix = _prefix + "DriftStatus";
            String driftStatus = _stackInstance.getDriftStatus();
            request.addParameter(prefix, StringUtils.fromString(driftStatus));
        }
        if (_stackInstance.getLastDriftCheckTimestamp() != null) {
            prefix = _prefix + "LastDriftCheckTimestamp";
            java.util.Date lastDriftCheckTimestamp = _stackInstance.getLastDriftCheckTimestamp();
            request.addParameter(prefix, StringUtils.fromDate(lastDriftCheckTimestamp));
        }
    }

    private static StackInstanceStaxMarshaller instance;

    public static StackInstanceStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StackInstanceStaxMarshaller();
        return instance;
    }
}
