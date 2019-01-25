/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CampaignLimits
 */
class CampaignLimitsJsonMarshaller {

    public void marshall(CampaignLimits campaignLimits, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (campaignLimits.getDaily() != null) {
            Integer daily = campaignLimits.getDaily();
            jsonWriter.name("Daily");
            jsonWriter.value(daily);
        }
        if (campaignLimits.getMaximumDuration() != null) {
            Integer maximumDuration = campaignLimits.getMaximumDuration();
            jsonWriter.name("MaximumDuration");
            jsonWriter.value(maximumDuration);
        }
        if (campaignLimits.getMessagesPerSecond() != null) {
            Integer messagesPerSecond = campaignLimits.getMessagesPerSecond();
            jsonWriter.name("MessagesPerSecond");
            jsonWriter.value(messagesPerSecond);
        }
        if (campaignLimits.getTotal() != null) {
            Integer total = campaignLimits.getTotal();
            jsonWriter.name("Total");
            jsonWriter.value(total);
        }
        jsonWriter.endObject();
    }

    private static CampaignLimitsJsonMarshaller instance;

    public static CampaignLimitsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CampaignLimitsJsonMarshaller();
        return instance;
    }
}
