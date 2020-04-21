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
 * JSON marshaller for POJO DomainSummary
 */
class DomainSummaryJsonMarshaller {

    public void marshall(DomainSummary domainSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (domainSummary.getDomainName() != null) {
            String domainName = domainSummary.getDomainName();
            jsonWriter.name("DomainName");
            jsonWriter.value(domainName);
        }
        if (domainSummary.getAutoRenew() != null) {
            Boolean autoRenew = domainSummary.getAutoRenew();
            jsonWriter.name("AutoRenew");
            jsonWriter.value(autoRenew);
        }
        if (domainSummary.getTransferLock() != null) {
            Boolean transferLock = domainSummary.getTransferLock();
            jsonWriter.name("TransferLock");
            jsonWriter.value(transferLock);
        }
        if (domainSummary.getExpiry() != null) {
            java.util.Date expiry = domainSummary.getExpiry();
            jsonWriter.name("Expiry");
            jsonWriter.value(expiry);
        }
        jsonWriter.endObject();
    }

    private static DomainSummaryJsonMarshaller instance;

    public static DomainSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DomainSummaryJsonMarshaller();
        return instance;
    }
}
