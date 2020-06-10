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
 * JSON marshaller for POJO DescribeFleetError
 */
class DescribeFleetErrorJsonMarshaller {

    public void marshall(DescribeFleetError describeFleetError, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (describeFleetError.getLaunchTemplateAndOverrides() != null) {
            LaunchTemplateAndOverridesResponse launchTemplateAndOverrides = describeFleetError
                    .getLaunchTemplateAndOverrides();
            jsonWriter.name("LaunchTemplateAndOverrides");
            LaunchTemplateAndOverridesResponseJsonMarshaller.getInstance().marshall(
                    launchTemplateAndOverrides, jsonWriter);
        }
        if (describeFleetError.getLifecycle() != null) {
            String lifecycle = describeFleetError.getLifecycle();
            jsonWriter.name("Lifecycle");
            jsonWriter.value(lifecycle);
        }
        if (describeFleetError.getErrorCode() != null) {
            String errorCode = describeFleetError.getErrorCode();
            jsonWriter.name("ErrorCode");
            jsonWriter.value(errorCode);
        }
        if (describeFleetError.getErrorMessage() != null) {
            String errorMessage = describeFleetError.getErrorMessage();
            jsonWriter.name("ErrorMessage");
            jsonWriter.value(errorMessage);
        }
        jsonWriter.endObject();
    }

    private static DescribeFleetErrorJsonMarshaller instance;

    public static DescribeFleetErrorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DescribeFleetErrorJsonMarshaller();
        return instance;
    }
}
