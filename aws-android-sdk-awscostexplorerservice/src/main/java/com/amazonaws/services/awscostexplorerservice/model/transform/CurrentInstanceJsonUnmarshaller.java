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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CurrentInstance
 */
class CurrentInstanceJsonUnmarshaller implements
        Unmarshaller<CurrentInstance, JsonUnmarshallerContext> {

    public CurrentInstance unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CurrentInstance currentInstance = new CurrentInstance();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ResourceId")) {
                currentInstance.setResourceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                currentInstance.setTags(new ListUnmarshaller<TagValues>(TagValuesJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResourceDetails")) {
                currentInstance.setResourceDetails(ResourceDetailsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceUtilization")) {
                currentInstance.setResourceUtilization(ResourceUtilizationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReservationCoveredHoursInLookbackPeriod")) {
                currentInstance.setReservationCoveredHoursInLookbackPeriod(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SavingsPlansCoveredHoursInLookbackPeriod")) {
                currentInstance.setSavingsPlansCoveredHoursInLookbackPeriod(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OnDemandHoursInLookbackPeriod")) {
                currentInstance.setOnDemandHoursInLookbackPeriod(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TotalRunningHoursInLookbackPeriod")) {
                currentInstance.setTotalRunningHoursInLookbackPeriod(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MonthlyCost")) {
                currentInstance.setMonthlyCost(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CurrencyCode")) {
                currentInstance.setCurrencyCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return currentInstance;
    }

    private static CurrentInstanceJsonUnmarshaller instance;

    public static CurrentInstanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CurrentInstanceJsonUnmarshaller();
        return instance;
    }
}
