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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MaintenanceWindowTaskInvocationParameters
 */
class MaintenanceWindowTaskInvocationParametersJsonMarshaller {

    public void marshall(MaintenanceWindowTaskInvocationParameters maintenanceWindowTaskInvocationParameters, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (maintenanceWindowTaskInvocationParameters.getRunCommand() != null) {
            MaintenanceWindowRunCommandParameters runCommand = maintenanceWindowTaskInvocationParameters.getRunCommand();
            jsonWriter.name("RunCommand");
            MaintenanceWindowRunCommandParametersJsonMarshaller.getInstance().marshall(runCommand, jsonWriter);
        }
        if (maintenanceWindowTaskInvocationParameters.getAutomation() != null) {
            MaintenanceWindowAutomationParameters automation = maintenanceWindowTaskInvocationParameters.getAutomation();
            jsonWriter.name("Automation");
            MaintenanceWindowAutomationParametersJsonMarshaller.getInstance().marshall(automation, jsonWriter);
        }
        if (maintenanceWindowTaskInvocationParameters.getStepFunctions() != null) {
            MaintenanceWindowStepFunctionsParameters stepFunctions = maintenanceWindowTaskInvocationParameters.getStepFunctions();
            jsonWriter.name("StepFunctions");
            MaintenanceWindowStepFunctionsParametersJsonMarshaller.getInstance().marshall(stepFunctions, jsonWriter);
        }
        if (maintenanceWindowTaskInvocationParameters.getLambda() != null) {
            MaintenanceWindowLambdaParameters lambda = maintenanceWindowTaskInvocationParameters.getLambda();
            jsonWriter.name("Lambda");
            MaintenanceWindowLambdaParametersJsonMarshaller.getInstance().marshall(lambda, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static MaintenanceWindowTaskInvocationParametersJsonMarshaller instance;
    public static MaintenanceWindowTaskInvocationParametersJsonMarshaller getInstance() {
        if (instance == null) instance = new MaintenanceWindowTaskInvocationParametersJsonMarshaller();
        return instance;
    }
}
