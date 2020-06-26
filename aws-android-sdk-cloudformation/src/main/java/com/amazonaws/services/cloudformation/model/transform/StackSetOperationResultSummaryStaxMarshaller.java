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
 * StAX marshaller for POJO StackSetOperationResultSummary
 */
class StackSetOperationResultSummaryStaxMarshaller {

    public void marshall(StackSetOperationResultSummary _stackSetOperationResultSummary,
            Request<?> request, String _prefix) {
        String prefix;
        if (_stackSetOperationResultSummary.getAccount() != null) {
            prefix = _prefix + "Account";
            String account = _stackSetOperationResultSummary.getAccount();
            request.addParameter(prefix, StringUtils.fromString(account));
        }
        if (_stackSetOperationResultSummary.getRegion() != null) {
            prefix = _prefix + "Region";
            String region = _stackSetOperationResultSummary.getRegion();
            request.addParameter(prefix, StringUtils.fromString(region));
        }
        if (_stackSetOperationResultSummary.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _stackSetOperationResultSummary.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_stackSetOperationResultSummary.getStatusReason() != null) {
            prefix = _prefix + "StatusReason";
            String statusReason = _stackSetOperationResultSummary.getStatusReason();
            request.addParameter(prefix, StringUtils.fromString(statusReason));
        }
        if (_stackSetOperationResultSummary.getAccountGateResult() != null) {
            prefix = _prefix + "AccountGateResult";
            AccountGateResult accountGateResult = _stackSetOperationResultSummary
                    .getAccountGateResult();
            AccountGateResultStaxMarshaller.getInstance().marshall(accountGateResult, request,
                    prefix + ".");
        }
        if (_stackSetOperationResultSummary.getOrganizationalUnitId() != null) {
            prefix = _prefix + "OrganizationalUnitId";
            String organizationalUnitId = _stackSetOperationResultSummary.getOrganizationalUnitId();
            request.addParameter(prefix, StringUtils.fromString(organizationalUnitId));
        }
    }

    private static StackSetOperationResultSummaryStaxMarshaller instance;

    public static StackSetOperationResultSummaryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StackSetOperationResultSummaryStaxMarshaller();
        return instance;
    }
}
