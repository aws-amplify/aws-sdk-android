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
 * JSON marshaller for POJO CoverageByTime
 */
class CoverageByTimeJsonMarshaller {

    public void marshall(CoverageByTime coverageByTime, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (coverageByTime.getTimePeriod() != null) {
            DateInterval timePeriod = coverageByTime.getTimePeriod();
            jsonWriter.name("TimePeriod");
            DateIntervalJsonMarshaller.getInstance().marshall(timePeriod, jsonWriter);
        }
        if (coverageByTime.getGroups() != null) {
            java.util.List<ReservationCoverageGroup> groups = coverageByTime.getGroups();
            jsonWriter.name("Groups");
            jsonWriter.beginArray();
            for (ReservationCoverageGroup groupsItem : groups) {
                if (groupsItem != null) {
                    ReservationCoverageGroupJsonMarshaller.getInstance().marshall(groupsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (coverageByTime.getTotal() != null) {
            Coverage total = coverageByTime.getTotal();
            jsonWriter.name("Total");
            CoverageJsonMarshaller.getInstance().marshall(total, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static CoverageByTimeJsonMarshaller instance;

    public static CoverageByTimeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CoverageByTimeJsonMarshaller();
        return instance;
    }
}
