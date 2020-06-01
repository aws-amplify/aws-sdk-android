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

package com.amazonaws.services.athena.model.transform;

import com.amazonaws.services.athena.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO WorkGroupConfiguration
 */
class WorkGroupConfigurationJsonMarshaller {

    public void marshall(WorkGroupConfiguration workGroupConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (workGroupConfiguration.getResultConfiguration() != null) {
            ResultConfiguration resultConfiguration = workGroupConfiguration
                    .getResultConfiguration();
            jsonWriter.name("ResultConfiguration");
            ResultConfigurationJsonMarshaller.getInstance().marshall(resultConfiguration,
                    jsonWriter);
        }
        if (workGroupConfiguration.getEnforceWorkGroupConfiguration() != null) {
            Boolean enforceWorkGroupConfiguration = workGroupConfiguration
                    .getEnforceWorkGroupConfiguration();
            jsonWriter.name("EnforceWorkGroupConfiguration");
            jsonWriter.value(enforceWorkGroupConfiguration);
        }
        if (workGroupConfiguration.getPublishCloudWatchMetricsEnabled() != null) {
            Boolean publishCloudWatchMetricsEnabled = workGroupConfiguration
                    .getPublishCloudWatchMetricsEnabled();
            jsonWriter.name("PublishCloudWatchMetricsEnabled");
            jsonWriter.value(publishCloudWatchMetricsEnabled);
        }
        if (workGroupConfiguration.getBytesScannedCutoffPerQuery() != null) {
            Long bytesScannedCutoffPerQuery = workGroupConfiguration
                    .getBytesScannedCutoffPerQuery();
            jsonWriter.name("BytesScannedCutoffPerQuery");
            jsonWriter.value(bytesScannedCutoffPerQuery);
        }
        if (workGroupConfiguration.getRequesterPaysEnabled() != null) {
            Boolean requesterPaysEnabled = workGroupConfiguration.getRequesterPaysEnabled();
            jsonWriter.name("RequesterPaysEnabled");
            jsonWriter.value(requesterPaysEnabled);
        }
        jsonWriter.endObject();
    }

    private static WorkGroupConfigurationJsonMarshaller instance;

    public static WorkGroupConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WorkGroupConfigurationJsonMarshaller();
        return instance;
    }
}
