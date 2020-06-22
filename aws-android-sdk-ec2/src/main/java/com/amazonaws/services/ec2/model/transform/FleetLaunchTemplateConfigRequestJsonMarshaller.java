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
 * JSON marshaller for POJO FleetLaunchTemplateConfigRequest
 */
class FleetLaunchTemplateConfigRequestJsonMarshaller {

    public void marshall(FleetLaunchTemplateConfigRequest fleetLaunchTemplateConfigRequest,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (fleetLaunchTemplateConfigRequest.getLaunchTemplateSpecification() != null) {
            FleetLaunchTemplateSpecificationRequest launchTemplateSpecification = fleetLaunchTemplateConfigRequest
                    .getLaunchTemplateSpecification();
            jsonWriter.name("LaunchTemplateSpecification");
            FleetLaunchTemplateSpecificationRequestJsonMarshaller.getInstance().marshall(
                    launchTemplateSpecification, jsonWriter);
        }
        if (fleetLaunchTemplateConfigRequest.getOverrides() != null) {
            java.util.List<FleetLaunchTemplateOverridesRequest> overrides = fleetLaunchTemplateConfigRequest
                    .getOverrides();
            jsonWriter.name("Overrides");
            jsonWriter.beginArray();
            for (FleetLaunchTemplateOverridesRequest overridesItem : overrides) {
                if (overridesItem != null) {
                    FleetLaunchTemplateOverridesRequestJsonMarshaller.getInstance().marshall(
                            overridesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static FleetLaunchTemplateConfigRequestJsonMarshaller instance;

    public static FleetLaunchTemplateConfigRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FleetLaunchTemplateConfigRequestJsonMarshaller();
        return instance;
    }
}
