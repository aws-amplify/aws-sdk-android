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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO AccountQuota
 */
class AccountQuotaStaxMarshaller {

    public void marshall(AccountQuota _accountQuota, Request<?> request, String _prefix) {
        String prefix;
        if (_accountQuota.getAccountQuotaName() != null) {
            prefix = _prefix + "AccountQuotaName";
            String accountQuotaName = _accountQuota.getAccountQuotaName();
            request.addParameter(prefix, StringUtils.fromString(accountQuotaName));
        }
        if (_accountQuota.getUsed() != null) {
            prefix = _prefix + "Used";
            Long used = _accountQuota.getUsed();
            request.addParameter(prefix, StringUtils.fromLong(used));
        }
        if (_accountQuota.getMax() != null) {
            prefix = _prefix + "Max";
            Long max = _accountQuota.getMax();
            request.addParameter(prefix, StringUtils.fromLong(max));
        }
    }

    private static AccountQuotaStaxMarshaller instance;

    public static AccountQuotaStaxMarshaller getInstance() {
        if (instance == null)
            instance = new AccountQuotaStaxMarshaller();
        return instance;
    }
}
