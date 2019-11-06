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
 * JSON unmarshaller for POJO TreatmentResource
 */
class TreatmentResourceJsonUnmarshaller implements
        Unmarshaller<TreatmentResource, JsonUnmarshallerContext> {

    public TreatmentResource unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TreatmentResource treatmentResource = new TreatmentResource();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Id")) {
                treatmentResource.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MessageConfiguration")) {
                treatmentResource.setMessageConfiguration(MessageConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Schedule")) {
                treatmentResource.setSchedule(ScheduleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SizePercent")) {
                treatmentResource.setSizePercent(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                treatmentResource.setState(CampaignStateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TreatmentDescription")) {
                treatmentResource.setTreatmentDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TreatmentName")) {
                treatmentResource.setTreatmentName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return treatmentResource;
    }

    private static TreatmentResourceJsonUnmarshaller instance;

    public static TreatmentResourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TreatmentResourceJsonUnmarshaller();
        return instance;
    }
}
