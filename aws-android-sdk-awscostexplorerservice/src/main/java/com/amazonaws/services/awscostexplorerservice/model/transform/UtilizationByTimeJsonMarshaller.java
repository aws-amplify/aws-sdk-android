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

package com.amazonaws.services.awscostexplorerservice.model.transform;

import com.amazonaws.services.awscostexplorerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UtilizationByTime
 */
class UtilizationByTimeJsonMarshaller {

    public void marshall(UtilizationByTime utilizationByTime, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (utilizationByTime.getTimePeriod() != null) {
            DateInterval timePeriod = utilizationByTime.getTimePeriod();
            jsonWriter.name("TimePeriod");
            DateIntervalJsonMarshaller.getInstance().marshall(timePeriod, jsonWriter);
        }
        if (utilizationByTime.getGroups() != null) {
            java.util.List<ReservationUtilizationGroup> groups = utilizationByTime.getGroups();
            jsonWriter.name("Groups");
            jsonWriter.beginArray();
            for (ReservationUtilizationGroup groupsItem : groups) {
                if (groupsItem != null) {
                    ReservationUtilizationGroupJsonMarshaller.getInstance().marshall(groupsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (utilizationByTime.getTotal() != null) {
            ReservationAggregates total = utilizationByTime.getTotal();
            jsonWriter.name("Total");
            ReservationAggregatesJsonMarshaller.getInstance().marshall(total, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static UtilizationByTimeJsonMarshaller instance;

    public static UtilizationByTimeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UtilizationByTimeJsonMarshaller();
        return instance;
    }
}
