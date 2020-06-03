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

package com.amazonaws.services.mediaconvert.model.transform;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Queue
 */
class QueueJsonMarshaller {

    public void marshall(Queue queue, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (queue.getArn() != null) {
            String arn = queue.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (queue.getCreatedAt() != null) {
            java.util.Date createdAt = queue.getCreatedAt();
            jsonWriter.name("CreatedAt");
            jsonWriter.value(createdAt);
        }
        if (queue.getDescription() != null) {
            String description = queue.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (queue.getLastUpdated() != null) {
            java.util.Date lastUpdated = queue.getLastUpdated();
            jsonWriter.name("LastUpdated");
            jsonWriter.value(lastUpdated);
        }
        if (queue.getName() != null) {
            String name = queue.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (queue.getPricingPlan() != null) {
            String pricingPlan = queue.getPricingPlan();
            jsonWriter.name("PricingPlan");
            jsonWriter.value(pricingPlan);
        }
        if (queue.getProgressingJobsCount() != null) {
            Integer progressingJobsCount = queue.getProgressingJobsCount();
            jsonWriter.name("ProgressingJobsCount");
            jsonWriter.value(progressingJobsCount);
        }
        if (queue.getReservationPlan() != null) {
            ReservationPlan reservationPlan = queue.getReservationPlan();
            jsonWriter.name("ReservationPlan");
            ReservationPlanJsonMarshaller.getInstance().marshall(reservationPlan, jsonWriter);
        }
        if (queue.getStatus() != null) {
            String status = queue.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (queue.getSubmittedJobsCount() != null) {
            Integer submittedJobsCount = queue.getSubmittedJobsCount();
            jsonWriter.name("SubmittedJobsCount");
            jsonWriter.value(submittedJobsCount);
        }
        if (queue.getType() != null) {
            String type = queue.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static QueueJsonMarshaller instance;

    public static QueueJsonMarshaller getInstance() {
        if (instance == null)
            instance = new QueueJsonMarshaller();
        return instance;
    }
}
