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
 * JSON marshaller for POJO CreateFleetError
 */
class CreateFleetErrorJsonMarshaller {

    public void marshall(CreateFleetError createFleetError, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (createFleetError.getLaunchTemplateAndOverrides() != null) {
            LaunchTemplateAndOverridesResponse launchTemplateAndOverrides = createFleetError
                    .getLaunchTemplateAndOverrides();
            jsonWriter.name("LaunchTemplateAndOverrides");
            LaunchTemplateAndOverridesResponseJsonMarshaller.getInstance().marshall(
                    launchTemplateAndOverrides, jsonWriter);
        }
        if (createFleetError.getLifecycle() != null) {
            String lifecycle = createFleetError.getLifecycle();
            jsonWriter.name("Lifecycle");
            jsonWriter.value(lifecycle);
        }
        if (createFleetError.getErrorCode() != null) {
            String errorCode = createFleetError.getErrorCode();
            jsonWriter.name("ErrorCode");
            jsonWriter.value(errorCode);
        }
        if (createFleetError.getErrorMessage() != null) {
            String errorMessage = createFleetError.getErrorMessage();
            jsonWriter.name("ErrorMessage");
            jsonWriter.value(errorMessage);
        }
        jsonWriter.endObject();
    }

    private static CreateFleetErrorJsonMarshaller instance;

    public static CreateFleetErrorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CreateFleetErrorJsonMarshaller();
        return instance;
    }
}
