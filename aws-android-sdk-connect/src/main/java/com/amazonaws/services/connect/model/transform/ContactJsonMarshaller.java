/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Contact
 */
class ContactJsonMarshaller {

    public void marshall(Contact contact, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (contact.getArn() != null) {
            String arn = contact.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (contact.getId() != null) {
            String id = contact.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (contact.getInitialContactId() != null) {
            String initialContactId = contact.getInitialContactId();
            jsonWriter.name("InitialContactId");
            jsonWriter.value(initialContactId);
        }
        if (contact.getPreviousContactId() != null) {
            String previousContactId = contact.getPreviousContactId();
            jsonWriter.name("PreviousContactId");
            jsonWriter.value(previousContactId);
        }
        if (contact.getInitiationMethod() != null) {
            String initiationMethod = contact.getInitiationMethod();
            jsonWriter.name("InitiationMethod");
            jsonWriter.value(initiationMethod);
        }
        if (contact.getName() != null) {
            String name = contact.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (contact.getDescription() != null) {
            String description = contact.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (contact.getChannel() != null) {
            String channel = contact.getChannel();
            jsonWriter.name("Channel");
            jsonWriter.value(channel);
        }
        if (contact.getQueueInfo() != null) {
            QueueInfo queueInfo = contact.getQueueInfo();
            jsonWriter.name("QueueInfo");
            QueueInfoJsonMarshaller.getInstance().marshall(queueInfo, jsonWriter);
        }
        if (contact.getAgentInfo() != null) {
            AgentInfo agentInfo = contact.getAgentInfo();
            jsonWriter.name("AgentInfo");
            AgentInfoJsonMarshaller.getInstance().marshall(agentInfo, jsonWriter);
        }
        if (contact.getInitiationTimestamp() != null) {
            java.util.Date initiationTimestamp = contact.getInitiationTimestamp();
            jsonWriter.name("InitiationTimestamp");
            jsonWriter.value(initiationTimestamp);
        }
        if (contact.getDisconnectTimestamp() != null) {
            java.util.Date disconnectTimestamp = contact.getDisconnectTimestamp();
            jsonWriter.name("DisconnectTimestamp");
            jsonWriter.value(disconnectTimestamp);
        }
        if (contact.getLastUpdateTimestamp() != null) {
            java.util.Date lastUpdateTimestamp = contact.getLastUpdateTimestamp();
            jsonWriter.name("LastUpdateTimestamp");
            jsonWriter.value(lastUpdateTimestamp);
        }
        if (contact.getLastPausedTimestamp() != null) {
            java.util.Date lastPausedTimestamp = contact.getLastPausedTimestamp();
            jsonWriter.name("LastPausedTimestamp");
            jsonWriter.value(lastPausedTimestamp);
        }
        if (contact.getLastResumedTimestamp() != null) {
            java.util.Date lastResumedTimestamp = contact.getLastResumedTimestamp();
            jsonWriter.name("LastResumedTimestamp");
            jsonWriter.value(lastResumedTimestamp);
        }
        if (contact.getTotalPauseCount() != null) {
            Integer totalPauseCount = contact.getTotalPauseCount();
            jsonWriter.name("TotalPauseCount");
            jsonWriter.value(totalPauseCount);
        }
        if (contact.getTotalPauseDurationInSeconds() != null) {
            Integer totalPauseDurationInSeconds = contact.getTotalPauseDurationInSeconds();
            jsonWriter.name("TotalPauseDurationInSeconds");
            jsonWriter.value(totalPauseDurationInSeconds);
        }
        if (contact.getScheduledTimestamp() != null) {
            java.util.Date scheduledTimestamp = contact.getScheduledTimestamp();
            jsonWriter.name("ScheduledTimestamp");
            jsonWriter.value(scheduledTimestamp);
        }
        if (contact.getRelatedContactId() != null) {
            String relatedContactId = contact.getRelatedContactId();
            jsonWriter.name("RelatedContactId");
            jsonWriter.value(relatedContactId);
        }
        if (contact.getWisdomInfo() != null) {
            WisdomInfo wisdomInfo = contact.getWisdomInfo();
            jsonWriter.name("WisdomInfo");
            WisdomInfoJsonMarshaller.getInstance().marshall(wisdomInfo, jsonWriter);
        }
        if (contact.getQueueTimeAdjustmentSeconds() != null) {
            Integer queueTimeAdjustmentSeconds = contact.getQueueTimeAdjustmentSeconds();
            jsonWriter.name("QueueTimeAdjustmentSeconds");
            jsonWriter.value(queueTimeAdjustmentSeconds);
        }
        if (contact.getQueuePriority() != null) {
            Long queuePriority = contact.getQueuePriority();
            jsonWriter.name("QueuePriority");
            jsonWriter.value(queuePriority);
        }
        if (contact.getTags() != null) {
            java.util.Map<String, String> tags = contact.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (contact.getConnectedToSystemTimestamp() != null) {
            java.util.Date connectedToSystemTimestamp = contact.getConnectedToSystemTimestamp();
            jsonWriter.name("ConnectedToSystemTimestamp");
            jsonWriter.value(connectedToSystemTimestamp);
        }
        if (contact.getRoutingCriteria() != null) {
            RoutingCriteria routingCriteria = contact.getRoutingCriteria();
            jsonWriter.name("RoutingCriteria");
            RoutingCriteriaJsonMarshaller.getInstance().marshall(routingCriteria, jsonWriter);
        }
        if (contact.getCustomer() != null) {
            Customer customer = contact.getCustomer();
            jsonWriter.name("Customer");
            CustomerJsonMarshaller.getInstance().marshall(customer, jsonWriter);
        }
        if (contact.getCampaign() != null) {
            Campaign campaign = contact.getCampaign();
            jsonWriter.name("Campaign");
            CampaignJsonMarshaller.getInstance().marshall(campaign, jsonWriter);
        }
        if (contact.getAnsweringMachineDetectionStatus() != null) {
            String answeringMachineDetectionStatus = contact.getAnsweringMachineDetectionStatus();
            jsonWriter.name("AnsweringMachineDetectionStatus");
            jsonWriter.value(answeringMachineDetectionStatus);
        }
        if (contact.getCustomerVoiceActivity() != null) {
            CustomerVoiceActivity customerVoiceActivity = contact.getCustomerVoiceActivity();
            jsonWriter.name("CustomerVoiceActivity");
            CustomerVoiceActivityJsonMarshaller.getInstance().marshall(customerVoiceActivity,
                    jsonWriter);
        }
        if (contact.getQualityMetrics() != null) {
            QualityMetrics qualityMetrics = contact.getQualityMetrics();
            jsonWriter.name("QualityMetrics");
            QualityMetricsJsonMarshaller.getInstance().marshall(qualityMetrics, jsonWriter);
        }
        if (contact.getDisconnectDetails() != null) {
            DisconnectDetails disconnectDetails = contact.getDisconnectDetails();
            jsonWriter.name("DisconnectDetails");
            DisconnectDetailsJsonMarshaller.getInstance().marshall(disconnectDetails, jsonWriter);
        }
        if (contact.getSegmentAttributes() != null) {
            java.util.Map<String, SegmentAttributeValue> segmentAttributes = contact
                    .getSegmentAttributes();
            jsonWriter.name("SegmentAttributes");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, SegmentAttributeValue> segmentAttributesEntry : segmentAttributes
                    .entrySet()) {
                SegmentAttributeValue segmentAttributesValue = segmentAttributesEntry.getValue();
                if (segmentAttributesValue != null) {
                    jsonWriter.name(segmentAttributesEntry.getKey());
                    SegmentAttributeValueJsonMarshaller.getInstance().marshall(
                            segmentAttributesValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static ContactJsonMarshaller instance;

    public static ContactJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContactJsonMarshaller();
        return instance;
    }
}
