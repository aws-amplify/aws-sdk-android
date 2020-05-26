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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PriceSchedule
 */
class PriceScheduleJsonMarshaller {

    public void marshall(PriceSchedule priceSchedule, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (priceSchedule.getActive() != null) {
            Boolean active = priceSchedule.getActive();
            jsonWriter.name("Active");
            jsonWriter.value(active);
        }
        if (priceSchedule.getCurrencyCode() != null) {
            String currencyCode = priceSchedule.getCurrencyCode();
            jsonWriter.name("CurrencyCode");
            jsonWriter.value(currencyCode);
        }
        if (priceSchedule.getPrice() != null) {
            Double price = priceSchedule.getPrice();
            jsonWriter.name("Price");
            jsonWriter.value(price);
        }
        if (priceSchedule.getTerm() != null) {
            Long term = priceSchedule.getTerm();
            jsonWriter.name("Term");
            jsonWriter.value(term);
        }
        jsonWriter.endObject();
    }

    private static PriceScheduleJsonMarshaller instance;

    public static PriceScheduleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PriceScheduleJsonMarshaller();
        return instance;
    }
}
