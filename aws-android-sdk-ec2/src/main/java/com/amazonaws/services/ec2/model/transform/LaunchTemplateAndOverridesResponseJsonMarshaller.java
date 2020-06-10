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
 * JSON marshaller for POJO LaunchTemplateAndOverridesResponse
 */
class LaunchTemplateAndOverridesResponseJsonMarshaller {

    public void marshall(LaunchTemplateAndOverridesResponse launchTemplateAndOverridesResponse,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (launchTemplateAndOverridesResponse.getLaunchTemplateSpecification() != null) {
            FleetLaunchTemplateSpecification launchTemplateSpecification = launchTemplateAndOverridesResponse
                    .getLaunchTemplateSpecification();
            jsonWriter.name("LaunchTemplateSpecification");
            FleetLaunchTemplateSpecificationJsonMarshaller.getInstance().marshall(
                    launchTemplateSpecification, jsonWriter);
        }
        if (launchTemplateAndOverridesResponse.getOverrides() != null) {
            FleetLaunchTemplateOverrides overrides = launchTemplateAndOverridesResponse
                    .getOverrides();
            jsonWriter.name("Overrides");
            FleetLaunchTemplateOverridesJsonMarshaller.getInstance()
                    .marshall(overrides, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static LaunchTemplateAndOverridesResponseJsonMarshaller instance;

    public static LaunchTemplateAndOverridesResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateAndOverridesResponseJsonMarshaller();
        return instance;
    }
}
