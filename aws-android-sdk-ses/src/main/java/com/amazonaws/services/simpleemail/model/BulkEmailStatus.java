/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Bulk Email Status
 */
public enum BulkEmailStatus {

    Success("Success"),
    MessageRejected("MessageRejected"),
    MailFromDomainNotVerified("MailFromDomainNotVerified"),
    ConfigurationSetDoesNotExist("ConfigurationSetDoesNotExist"),
    TemplateDoesNotExist("TemplateDoesNotExist"),
    AccountSuspended("AccountSuspended"),
    AccountThrottled("AccountThrottled"),
    AccountDailyQuotaExceeded("AccountDailyQuotaExceeded"),
    InvalidSendingPoolName("InvalidSendingPoolName"),
    AccountSendingPaused("AccountSendingPaused"),
    ConfigurationSetSendingPaused("ConfigurationSetSendingPaused"),
    InvalidParameterValue("InvalidParameterValue"),
    TransientFailure("TransientFailure"),
    Failed("Failed");

    private String value;

    private BulkEmailStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, BulkEmailStatus> enumMap;
    static {
        enumMap = new HashMap<String, BulkEmailStatus>();
        enumMap.put("Success", Success);
        enumMap.put("MessageRejected", MessageRejected);
        enumMap.put("MailFromDomainNotVerified", MailFromDomainNotVerified);
        enumMap.put("ConfigurationSetDoesNotExist", ConfigurationSetDoesNotExist);
        enumMap.put("TemplateDoesNotExist", TemplateDoesNotExist);
        enumMap.put("AccountSuspended", AccountSuspended);
        enumMap.put("AccountThrottled", AccountThrottled);
        enumMap.put("AccountDailyQuotaExceeded", AccountDailyQuotaExceeded);
        enumMap.put("InvalidSendingPoolName", InvalidSendingPoolName);
        enumMap.put("AccountSendingPaused", AccountSendingPaused);
        enumMap.put("ConfigurationSetSendingPaused", ConfigurationSetSendingPaused);
        enumMap.put("InvalidParameterValue", InvalidParameterValue);
        enumMap.put("TransientFailure", TransientFailure);
        enumMap.put("Failed", Failed);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return BulkEmailStatus corresponding to the value
     */
    public static BulkEmailStatus fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
