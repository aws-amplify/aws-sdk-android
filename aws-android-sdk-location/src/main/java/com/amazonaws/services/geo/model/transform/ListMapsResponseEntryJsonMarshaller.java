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
 * JSON marshaller for POJO ListMapsResponseEntry
 */
class ListMapsResponseEntryJsonMarshaller {

    public void marshall(ListMapsResponseEntry listMapsResponseEntry, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (listMapsResponseEntry.getCreateTime() != null) {
            java.util.Date createTime = listMapsResponseEntry.getCreateTime();
            jsonWriter.name("CreateTime");
            jsonWriter.value(DateUtils.formatISO8601Date(createTime));
        }
        if (listMapsResponseEntry.getDataSource() != null) {
            String dataSource = listMapsResponseEntry.getDataSource();
            jsonWriter.name("DataSource");
            jsonWriter.value(dataSource);
        }
        if (listMapsResponseEntry.getDescription() != null) {
            String description = listMapsResponseEntry.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (listMapsResponseEntry.getMapName() != null) {
            String mapName = listMapsResponseEntry.getMapName();
            jsonWriter.name("MapName");
            jsonWriter.value(mapName);
        }
        if (listMapsResponseEntry.getPricingPlan() != null) {
            String pricingPlan = listMapsResponseEntry.getPricingPlan();
            jsonWriter.name("PricingPlan");
            jsonWriter.value(pricingPlan);
        }
        if (listMapsResponseEntry.getUpdateTime() != null) {
            java.util.Date updateTime = listMapsResponseEntry.getUpdateTime();
            jsonWriter.name("UpdateTime");
            jsonWriter.value(DateUtils.formatISO8601Date(updateTime));
        }
        jsonWriter.endObject();
    }

    private static ListMapsResponseEntryJsonMarshaller instance;

    public static ListMapsResponseEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ListMapsResponseEntryJsonMarshaller();
        return instance;
    }
}
