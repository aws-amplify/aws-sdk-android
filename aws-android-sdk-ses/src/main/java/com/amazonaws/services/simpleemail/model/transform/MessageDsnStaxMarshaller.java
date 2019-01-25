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
 * StAX marshaller for POJO MessageDsn
 */
class MessageDsnStaxMarshaller {

    public void marshall(MessageDsn _messageDsn, Request<?> request, String _prefix) {
        String prefix;
        if (_messageDsn.getReportingMta() != null) {
            prefix = _prefix + "ReportingMta";
            String reportingMta = _messageDsn.getReportingMta();
            request.addParameter(prefix, StringUtils.fromString(reportingMta));
        }
        if (_messageDsn.getArrivalDate() != null) {
            prefix = _prefix + "ArrivalDate";
            java.util.Date arrivalDate = _messageDsn.getArrivalDate();
            request.addParameter(prefix, StringUtils.fromDate(arrivalDate));
        }
        if (_messageDsn.getExtensionFields() != null) {
            prefix = _prefix + "ExtensionFields";
            java.util.List<ExtensionField> extensionFields = _messageDsn.getExtensionFields();
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

    private static MessageDsnStaxMarshaller instance;

    public static MessageDsnStaxMarshaller getInstance() {
        if (instance == null)
            instance = new MessageDsnStaxMarshaller();
        return instance;
    }
}
