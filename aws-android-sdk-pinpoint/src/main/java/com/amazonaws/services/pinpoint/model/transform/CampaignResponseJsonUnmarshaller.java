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
 * JSON unmarshaller for POJO CampaignResponse
 */
class CampaignResponseJsonUnmarshaller implements
        Unmarshaller<CampaignResponse, JsonUnmarshallerContext> {

    public CampaignResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CampaignResponse campaignResponse = new CampaignResponse();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AdditionalTreatments")) {
                campaignResponse.setAdditionalTreatments(new ListUnmarshaller<TreatmentResource>(
                        TreatmentResourceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ApplicationId")) {
                campaignResponse.setApplicationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDate")) {
                campaignResponse.setCreationDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultState")) {
                campaignResponse.setDefaultState(CampaignStateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                campaignResponse.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HoldoutPercent")) {
                campaignResponse.setHoldoutPercent(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Hook")) {
                campaignResponse.setHook(CampaignHookJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                campaignResponse.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IsPaused")) {
                campaignResponse.setIsPaused(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedDate")) {
                campaignResponse.setLastModifiedDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Limits")) {
                campaignResponse.setLimits(CampaignLimitsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MessageConfiguration")) {
                campaignResponse.setMessageConfiguration(MessageConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                campaignResponse.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Schedule")) {
                campaignResponse.setSchedule(ScheduleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SegmentId")) {
                campaignResponse.setSegmentId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SegmentVersion")) {
                campaignResponse.setSegmentVersion(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                campaignResponse.setState(CampaignStateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TreatmentDescription")) {
                campaignResponse.setTreatmentDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TreatmentName")) {
                campaignResponse.setTreatmentName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Version")) {
                campaignResponse.setVersion(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return campaignResponse;
    }

    private static CampaignResponseJsonUnmarshaller instance;

    public static CampaignResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CampaignResponseJsonUnmarshaller();
        return instance;
    }
}
