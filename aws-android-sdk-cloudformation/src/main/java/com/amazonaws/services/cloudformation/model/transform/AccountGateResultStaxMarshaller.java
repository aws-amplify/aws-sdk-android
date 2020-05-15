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
 * StAX marshaller for POJO AccountGateResult
 */
class AccountGateResultStaxMarshaller {

    public void marshall(AccountGateResult _accountGateResult, Request<?> request, String _prefix) {
        String prefix;
        if (_accountGateResult.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _accountGateResult.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_accountGateResult.getStatusReason() != null) {
            prefix = _prefix + "StatusReason";
            String statusReason = _accountGateResult.getStatusReason();
            request.addParameter(prefix, StringUtils.fromString(statusReason));
        }
    }

    private static AccountGateResultStaxMarshaller instance;

    public static AccountGateResultStaxMarshaller getInstance() {
        if (instance == null)
            instance = new AccountGateResultStaxMarshaller();
        return instance;
    }
}
