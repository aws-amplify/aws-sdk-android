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

package com.amazonaws.services.simpleemail.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ReceiptRule
 */
class ReceiptRuleStaxMarshaller {

    public void marshall(ReceiptRule _receiptRule, Request<?> request, String _prefix) {
        String prefix;
        if (_receiptRule.getName() != null) {
            prefix = _prefix + "Name";
            String name = _receiptRule.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (_receiptRule.getEnabled() != null) {
            prefix = _prefix + "Enabled";
            Boolean enabled = _receiptRule.getEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(enabled));
        }
        if (_receiptRule.getTlsPolicy() != null) {
            prefix = _prefix + "TlsPolicy";
            String tlsPolicy = _receiptRule.getTlsPolicy();
            request.addParameter(prefix, StringUtils.fromString(tlsPolicy));
        }
        if (_receiptRule.getRecipients() != null) {
            prefix = _prefix + "Recipients";
            java.util.List<String> recipients = _receiptRule.getRecipients();
            int recipientsIndex = 1;
            String recipientsPrefix = prefix;
            for (String recipientsItem : recipients) {
                prefix = recipientsPrefix + ".member." + recipientsIndex;
                if (recipientsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(recipientsItem));
                }
                recipientsIndex++;
            }
            prefix = recipientsPrefix;
        }
        if (_receiptRule.getActions() != null) {
            prefix = _prefix + "Actions";
            java.util.List<ReceiptAction> actions = _receiptRule.getActions();
            int actionsIndex = 1;
            String actionsPrefix = prefix;
            for (ReceiptAction actionsItem : actions) {
                prefix = actionsPrefix + ".member." + actionsIndex;
                if (actionsItem != null) {
                    ReceiptActionStaxMarshaller.getInstance().marshall(actionsItem, request,
                            prefix + ".");
                }
                actionsIndex++;
            }
            prefix = actionsPrefix;
        }
        if (_receiptRule.getScanEnabled() != null) {
            prefix = _prefix + "ScanEnabled";
            Boolean scanEnabled = _receiptRule.getScanEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(scanEnabled));
        }
    }

    private static ReceiptRuleStaxMarshaller instance;

    public static ReceiptRuleStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ReceiptRuleStaxMarshaller();
        return instance;
    }
}
