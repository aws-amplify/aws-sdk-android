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
 * JSON marshaller for POJO ListPlaceIndexesResponseEntry
 */
class ListPlaceIndexesResponseEntryJsonMarshaller {

    public void marshall(ListPlaceIndexesResponseEntry listPlaceIndexesResponseEntry,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (listPlaceIndexesResponseEntry.getCreateTime() != null) {
            java.util.Date createTime = listPlaceIndexesResponseEntry.getCreateTime();
            jsonWriter.name("CreateTime");
            jsonWriter.value(DateUtils.formatISO8601Date(createTime));
        }
        if (listPlaceIndexesResponseEntry.getDataSource() != null) {
            String dataSource = listPlaceIndexesResponseEntry.getDataSource();
            jsonWriter.name("DataSource");
            jsonWriter.value(dataSource);
        }
        if (listPlaceIndexesResponseEntry.getDescription() != null) {
            String description = listPlaceIndexesResponseEntry.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (listPlaceIndexesResponseEntry.getIndexName() != null) {
            String indexName = listPlaceIndexesResponseEntry.getIndexName();
            jsonWriter.name("IndexName");
            jsonWriter.value(indexName);
        }
        if (listPlaceIndexesResponseEntry.getPricingPlan() != null) {
            String pricingPlan = listPlaceIndexesResponseEntry.getPricingPlan();
            jsonWriter.name("PricingPlan");
            jsonWriter.value(pricingPlan);
        }
        if (listPlaceIndexesResponseEntry.getUpdateTime() != null) {
            java.util.Date updateTime = listPlaceIndexesResponseEntry.getUpdateTime();
            jsonWriter.name("UpdateTime");
            jsonWriter.value(DateUtils.formatISO8601Date(updateTime));
        }
        jsonWriter.endObject();
    }

    private static ListPlaceIndexesResponseEntryJsonMarshaller instance;

    public static ListPlaceIndexesResponseEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ListPlaceIndexesResponseEntryJsonMarshaller();
        return instance;
    }
}
