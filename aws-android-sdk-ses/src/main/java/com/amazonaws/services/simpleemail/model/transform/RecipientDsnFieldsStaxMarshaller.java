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
 * StAX marshaller for POJO RecipientDsnFields
 */
class RecipientDsnFieldsStaxMarshaller {

    public void marshall(RecipientDsnFields _recipientDsnFields, Request<?> request, String _prefix) {
        String prefix;
        if (_recipientDsnFields.getFinalRecipient() != null) {
            prefix = _prefix + "FinalRecipient";
            String finalRecipient = _recipientDsnFields.getFinalRecipient();
            request.addParameter(prefix, StringUtils.fromString(finalRecipient));
        }
        if (_recipientDsnFields.getAction() != null) {
            prefix = _prefix + "Action";
            String action = _recipientDsnFields.getAction();
            request.addParameter(prefix, StringUtils.fromString(action));
        }
        if (_recipientDsnFields.getRemoteMta() != null) {
            prefix = _prefix + "RemoteMta";
            String remoteMta = _recipientDsnFields.getRemoteMta();
            request.addParameter(prefix, StringUtils.fromString(remoteMta));
        }
        if (_recipientDsnFields.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _recipientDsnFields.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_recipientDsnFields.getDiagnosticCode() != null) {
            prefix = _prefix + "DiagnosticCode";
            String diagnosticCode = _recipientDsnFields.getDiagnosticCode();
            request.addParameter(prefix, StringUtils.fromString(diagnosticCode));
        }
        if (_recipientDsnFields.getLastAttemptDate() != null) {
            prefix = _prefix + "LastAttemptDate";
            java.util.Date lastAttemptDate = _recipientDsnFields.getLastAttemptDate();
            request.addParameter(prefix, StringUtils.fromDate(lastAttemptDate));
        }
        if (_recipientDsnFields.getExtensionFields() != null) {
            prefix = _prefix + "ExtensionFields";
            java.util.List<ExtensionField> extensionFields = _recipientDsnFields
                    .getExtensionFields();
            int extensionFieldsIndex = 1;
            String extensionFieldsPrefix = prefix;
            for (ExtensionField extensionFieldsItem : extensionFields) {
                prefix = extensionFieldsPrefix + ".member." + extensionFieldsIndex;
                if (extensionFieldsItem != null) {
                    ExtensionFieldStaxMarshaller.getInstance().marshall(extensionFieldsItem,
                            request, prefix + ".");
                }
                extensionFieldsIndex++;
            }
            prefix = extensionFieldsPrefix;
        }
    }

    private static RecipientDsnFieldsStaxMarshaller instance;

    public static RecipientDsnFieldsStaxMarshaller getInstance() {
        if (instance == null)
            instance = new RecipientDsnFieldsStaxMarshaller();
        return instance;
    }
}
