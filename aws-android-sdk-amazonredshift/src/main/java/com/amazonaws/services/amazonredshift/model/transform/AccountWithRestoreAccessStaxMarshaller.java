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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO AccountWithRestoreAccess
 */
class AccountWithRestoreAccessStaxMarshaller {

    public void marshall(AccountWithRestoreAccess _accountWithRestoreAccess, Request<?> request,
            String _prefix) {
        String prefix;
        if (_accountWithRestoreAccess.getAccountId() != null) {
            prefix = _prefix + "AccountId";
            String accountId = _accountWithRestoreAccess.getAccountId();
            request.addParameter(prefix, StringUtils.fromString(accountId));
        }
        if (_accountWithRestoreAccess.getAccountAlias() != null) {
            prefix = _prefix + "AccountAlias";
            String accountAlias = _accountWithRestoreAccess.getAccountAlias();
            request.addParameter(prefix, StringUtils.fromString(accountAlias));
        }
    }

    private static AccountWithRestoreAccessStaxMarshaller instance;

    public static AccountWithRestoreAccessStaxMarshaller getInstance() {
        if (instance == null)
            instance = new AccountWithRestoreAccessStaxMarshaller();
        return instance;
    }
}
