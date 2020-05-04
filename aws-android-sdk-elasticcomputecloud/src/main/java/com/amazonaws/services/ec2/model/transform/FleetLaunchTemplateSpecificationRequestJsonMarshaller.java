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
 * JSON marshaller for POJO FleetLaunchTemplateSpecificationRequest
 */
class FleetLaunchTemplateSpecificationRequestJsonMarshaller {

    public void marshall(
            FleetLaunchTemplateSpecificationRequest fleetLaunchTemplateSpecificationRequest,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (fleetLaunchTemplateSpecificationRequest.getLaunchTemplateId() != null) {
            String launchTemplateId = fleetLaunchTemplateSpecificationRequest.getLaunchTemplateId();
            jsonWriter.name("LaunchTemplateId");
            jsonWriter.value(launchTemplateId);
        }
        if (fleetLaunchTemplateSpecificationRequest.getLaunchTemplateName() != null) {
            String launchTemplateName = fleetLaunchTemplateSpecificationRequest
                    .getLaunchTemplateName();
            jsonWriter.name("LaunchTemplateName");
            jsonWriter.value(launchTemplateName);
        }
        if (fleetLaunchTemplateSpecificationRequest.getVersion() != null) {
            String version = fleetLaunchTemplateSpecificationRequest.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        jsonWriter.endObject();
    }

    private static FleetLaunchTemplateSpecificationRequestJsonMarshaller instance;

    public static FleetLaunchTemplateSpecificationRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FleetLaunchTemplateSpecificationRequestJsonMarshaller();
        return instance;
    }
}
