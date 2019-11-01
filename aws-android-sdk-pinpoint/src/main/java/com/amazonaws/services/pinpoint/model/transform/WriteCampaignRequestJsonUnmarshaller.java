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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO WriteCampaignRequest
 */
class WriteCampaignRequestJsonUnmarshaller implements
        Unmarshaller<WriteCampaignRequest, JsonUnmarshallerContext> {

    public WriteCampaignRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        WriteCampaignRequest writeCampaignRequest = new WriteCampaignRequest();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AdditionalTreatments")) {
                writeCampaignRequest
                        .setAdditionalTreatments(new ListUnmarshaller<WriteTreatmentResource>(
                                WriteTreatmentResourceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Description")) {
                writeCampaignRequest.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HoldoutPercent")) {
                writeCampaignRequest.setHoldoutPercent(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Hook")) {
                writeCampaignRequest.setHook(CampaignHookJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IsPaused")) {
                writeCampaignRequest.setIsPaused(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Limits")) {
                writeCampaignRequest.setLimits(CampaignLimitsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MessageConfiguration")) {
                writeCampaignRequest.setMessageConfiguration(MessageConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                writeCampaignRequest.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Schedule")) {
                writeCampaignRequest.setSchedule(ScheduleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SegmentId")) {
                writeCampaignRequest.setSegmentId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SegmentVersion")) {
                writeCampaignRequest.setSegmentVersion(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TreatmentDescription")) {
                writeCampaignRequest.setTreatmentDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TreatmentName")) {
                writeCampaignRequest.setTreatmentName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return writeCampaignRequest;
    }

    private static WriteCampaignRequestJsonUnmarshaller instance;

    public static WriteCampaignRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WriteCampaignRequestJsonUnmarshaller();
        return instance;
    }
}
