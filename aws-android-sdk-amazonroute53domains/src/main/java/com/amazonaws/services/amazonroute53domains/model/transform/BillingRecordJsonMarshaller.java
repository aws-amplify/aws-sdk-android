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

package com.amazonaws.services.amazonroute53domains.model.transform;

import com.amazonaws.services.amazonroute53domains.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BillingRecord
 */
class BillingRecordJsonMarshaller {

    public void marshall(BillingRecord billingRecord, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (billingRecord.getDomainName() != null) {
            String domainName = billingRecord.getDomainName();
            jsonWriter.name("DomainName");
            jsonWriter.value(domainName);
        }
        if (billingRecord.getOperation() != null) {
            String operation = billingRecord.getOperation();
            jsonWriter.name("Operation");
            jsonWriter.value(operation);
        }
        if (billingRecord.getInvoiceId() != null) {
            String invoiceId = billingRecord.getInvoiceId();
            jsonWriter.name("InvoiceId");
            jsonWriter.value(invoiceId);
        }
        if (billingRecord.getBillDate() != null) {
            java.util.Date billDate = billingRecord.getBillDate();
            jsonWriter.name("BillDate");
            jsonWriter.value(billDate);
        }
        if (billingRecord.getPrice() != null) {
            Double price = billingRecord.getPrice();
            jsonWriter.name("Price");
            jsonWriter.value(price);
        }
        jsonWriter.endObject();
    }

    private static BillingRecordJsonMarshaller instance;

    public static BillingRecordJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BillingRecordJsonMarshaller();
        return instance;
    }
}
