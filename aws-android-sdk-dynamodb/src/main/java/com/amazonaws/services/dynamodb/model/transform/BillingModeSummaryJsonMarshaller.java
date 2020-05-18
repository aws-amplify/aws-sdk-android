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

package com.amazonaws.services.dynamodb.model.transform;

import com.amazonaws.services.dynamodb.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BillingModeSummary
 */
class BillingModeSummaryJsonMarshaller {

    public void marshall(BillingModeSummary billingModeSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (billingModeSummary.getBillingMode() != null) {
            String billingMode = billingModeSummary.getBillingMode();
            jsonWriter.name("BillingMode");
            jsonWriter.value(billingMode);
        }
        if (billingModeSummary.getLastUpdateToPayPerRequestDateTime() != null) {
            java.util.Date lastUpdateToPayPerRequestDateTime = billingModeSummary
                    .getLastUpdateToPayPerRequestDateTime();
            jsonWriter.name("LastUpdateToPayPerRequestDateTime");
            jsonWriter.value(lastUpdateToPayPerRequestDateTime);
        }
        jsonWriter.endObject();
    }

    private static BillingModeSummaryJsonMarshaller instance;

    public static BillingModeSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BillingModeSummaryJsonMarshaller();
        return instance;
    }
}
