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
 * JSON marshaller for POJO ReservedInstancesListing
 */
class ReservedInstancesListingJsonMarshaller {

    public void marshall(ReservedInstancesListing reservedInstancesListing, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (reservedInstancesListing.getClientToken() != null) {
            String clientToken = reservedInstancesListing.getClientToken();
            jsonWriter.name("ClientToken");
            jsonWriter.value(clientToken);
        }
        if (reservedInstancesListing.getCreateDate() != null) {
            java.util.Date createDate = reservedInstancesListing.getCreateDate();
            jsonWriter.name("CreateDate");
            jsonWriter.value(createDate);
        }
        if (reservedInstancesListing.getInstanceCounts() != null) {
            java.util.List<InstanceCount> instanceCounts = reservedInstancesListing
                    .getInstanceCounts();
            jsonWriter.name("InstanceCounts");
            jsonWriter.beginArray();
            for (InstanceCount instanceCountsItem : instanceCounts) {
                if (instanceCountsItem != null) {
                    InstanceCountJsonMarshaller.getInstance().marshall(instanceCountsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (reservedInstancesListing.getPriceSchedules() != null) {
            java.util.List<PriceSchedule> priceSchedules = reservedInstancesListing
                    .getPriceSchedules();
            jsonWriter.name("PriceSchedules");
            jsonWriter.beginArray();
            for (PriceSchedule priceSchedulesItem : priceSchedules) {
                if (priceSchedulesItem != null) {
                    PriceScheduleJsonMarshaller.getInstance().marshall(priceSchedulesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (reservedInstancesListing.getReservedInstancesId() != null) {
            String reservedInstancesId = reservedInstancesListing.getReservedInstancesId();
            jsonWriter.name("ReservedInstancesId");
            jsonWriter.value(reservedInstancesId);
        }
        if (reservedInstancesListing.getReservedInstancesListingId() != null) {
            String reservedInstancesListingId = reservedInstancesListing
                    .getReservedInstancesListingId();
            jsonWriter.name("ReservedInstancesListingId");
            jsonWriter.value(reservedInstancesListingId);
        }
        if (reservedInstancesListing.getStatus() != null) {
            String status = reservedInstancesListing.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (reservedInstancesListing.getStatusMessage() != null) {
            String statusMessage = reservedInstancesListing.getStatusMessage();
            jsonWriter.name("StatusMessage");
            jsonWriter.value(statusMessage);
        }
        if (reservedInstancesListing.getTags() != null) {
            java.util.List<Tag> tags = reservedInstancesListing.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (reservedInstancesListing.getUpdateDate() != null) {
            java.util.Date updateDate = reservedInstancesListing.getUpdateDate();
            jsonWriter.name("UpdateDate");
            jsonWriter.value(updateDate);
        }
        jsonWriter.endObject();
    }

    private static ReservedInstancesListingJsonMarshaller instance;

    public static ReservedInstancesListingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReservedInstancesListingJsonMarshaller();
        return instance;
    }
}
