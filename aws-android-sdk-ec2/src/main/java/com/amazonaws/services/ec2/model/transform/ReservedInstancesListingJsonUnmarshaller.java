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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ReservedInstancesListing
 */
class ReservedInstancesListingJsonUnmarshaller implements
        Unmarshaller<ReservedInstancesListing, JsonUnmarshallerContext> {

    public ReservedInstancesListing unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ReservedInstancesListing reservedInstancesListing = new ReservedInstancesListing();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ClientToken")) {
                reservedInstancesListing.setClientToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreateDate")) {
                reservedInstancesListing.setCreateDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceCounts")) {
                reservedInstancesListing.setInstanceCounts(new ListUnmarshaller<InstanceCount>(
                        InstanceCountJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PriceSchedules")) {
                reservedInstancesListing.setPriceSchedules(new ListUnmarshaller<PriceSchedule>(
                        PriceScheduleJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ReservedInstancesId")) {
                reservedInstancesListing.setReservedInstancesId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReservedInstancesListingId")) {
                reservedInstancesListing.setReservedInstancesListingId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                reservedInstancesListing.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusMessage")) {
                reservedInstancesListing.setStatusMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                reservedInstancesListing.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("UpdateDate")) {
                reservedInstancesListing.setUpdateDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return reservedInstancesListing;
    }

    private static ReservedInstancesListingJsonUnmarshaller instance;

    public static ReservedInstancesListingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservedInstancesListingJsonUnmarshaller();
        return instance;
    }
}
