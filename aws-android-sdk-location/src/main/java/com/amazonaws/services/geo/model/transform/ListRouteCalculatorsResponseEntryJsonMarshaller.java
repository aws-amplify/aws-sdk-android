/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model.transform;

import com.amazonaws.services.geo.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ListRouteCalculatorsResponseEntry
 */
class ListRouteCalculatorsResponseEntryJsonMarshaller {

    public void marshall(ListRouteCalculatorsResponseEntry listRouteCalculatorsResponseEntry,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (listRouteCalculatorsResponseEntry.getCalculatorName() != null) {
            String calculatorName = listRouteCalculatorsResponseEntry.getCalculatorName();
            jsonWriter.name("CalculatorName");
            jsonWriter.value(calculatorName);
        }
        if (listRouteCalculatorsResponseEntry.getCreateTime() != null) {
            java.util.Date createTime = listRouteCalculatorsResponseEntry.getCreateTime();
            jsonWriter.name("CreateTime");
            jsonWriter.value(DateUtils.formatISO8601Date(createTime));
        }
        if (listRouteCalculatorsResponseEntry.getDataSource() != null) {
            String dataSource = listRouteCalculatorsResponseEntry.getDataSource();
            jsonWriter.name("DataSource");
            jsonWriter.value(dataSource);
        }
        if (listRouteCalculatorsResponseEntry.getDescription() != null) {
            String description = listRouteCalculatorsResponseEntry.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (listRouteCalculatorsResponseEntry.getPricingPlan() != null) {
            String pricingPlan = listRouteCalculatorsResponseEntry.getPricingPlan();
            jsonWriter.name("PricingPlan");
            jsonWriter.value(pricingPlan);
        }
        if (listRouteCalculatorsResponseEntry.getUpdateTime() != null) {
            java.util.Date updateTime = listRouteCalculatorsResponseEntry.getUpdateTime();
            jsonWriter.name("UpdateTime");
            jsonWriter.value(DateUtils.formatISO8601Date(updateTime));
        }
        jsonWriter.endObject();
    }

    private static ListRouteCalculatorsResponseEntryJsonMarshaller instance;

    public static ListRouteCalculatorsResponseEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ListRouteCalculatorsResponseEntryJsonMarshaller();
        return instance;
    }
}
