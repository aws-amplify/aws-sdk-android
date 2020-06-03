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

package com.amazonaws.services.es.model.transform;

import com.amazonaws.services.es.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ServiceSoftwareOptions
 */
class ServiceSoftwareOptionsJsonMarshaller {

    public void marshall(ServiceSoftwareOptions serviceSoftwareOptions, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (serviceSoftwareOptions.getCurrentVersion() != null) {
            String currentVersion = serviceSoftwareOptions.getCurrentVersion();
            jsonWriter.name("CurrentVersion");
            jsonWriter.value(currentVersion);
        }
        if (serviceSoftwareOptions.getNewVersion() != null) {
            String newVersion = serviceSoftwareOptions.getNewVersion();
            jsonWriter.name("NewVersion");
            jsonWriter.value(newVersion);
        }
        if (serviceSoftwareOptions.getUpdateAvailable() != null) {
            Boolean updateAvailable = serviceSoftwareOptions.getUpdateAvailable();
            jsonWriter.name("UpdateAvailable");
            jsonWriter.value(updateAvailable);
        }
        if (serviceSoftwareOptions.getCancellable() != null) {
            Boolean cancellable = serviceSoftwareOptions.getCancellable();
            jsonWriter.name("Cancellable");
            jsonWriter.value(cancellable);
        }
        if (serviceSoftwareOptions.getUpdateStatus() != null) {
            String updateStatus = serviceSoftwareOptions.getUpdateStatus();
            jsonWriter.name("UpdateStatus");
            jsonWriter.value(updateStatus);
        }
        if (serviceSoftwareOptions.getDescription() != null) {
            String description = serviceSoftwareOptions.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (serviceSoftwareOptions.getAutomatedUpdateDate() != null) {
            java.util.Date automatedUpdateDate = serviceSoftwareOptions.getAutomatedUpdateDate();
            jsonWriter.name("AutomatedUpdateDate");
            jsonWriter.value(automatedUpdateDate);
        }
        if (serviceSoftwareOptions.getOptionalDeployment() != null) {
            Boolean optionalDeployment = serviceSoftwareOptions.getOptionalDeployment();
            jsonWriter.name("OptionalDeployment");
            jsonWriter.value(optionalDeployment);
        }
        jsonWriter.endObject();
    }

    private static ServiceSoftwareOptionsJsonMarshaller instance;

    public static ServiceSoftwareOptionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ServiceSoftwareOptionsJsonMarshaller();
        return instance;
    }
}
