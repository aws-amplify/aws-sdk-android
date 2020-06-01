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
 * JSON marshaller for POJO WorkGroupConfigurationUpdates
 */
class WorkGroupConfigurationUpdatesJsonMarshaller {

    public void marshall(WorkGroupConfigurationUpdates workGroupConfigurationUpdates,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (workGroupConfigurationUpdates.getEnforceWorkGroupConfiguration() != null) {
            Boolean enforceWorkGroupConfiguration = workGroupConfigurationUpdates
                    .getEnforceWorkGroupConfiguration();
            jsonWriter.name("EnforceWorkGroupConfiguration");
            jsonWriter.value(enforceWorkGroupConfiguration);
        }
        if (workGroupConfigurationUpdates.getResultConfigurationUpdates() != null) {
            ResultConfigurationUpdates resultConfigurationUpdates = workGroupConfigurationUpdates
                    .getResultConfigurationUpdates();
            jsonWriter.name("ResultConfigurationUpdates");
            ResultConfigurationUpdatesJsonMarshaller.getInstance().marshall(
                    resultConfigurationUpdates, jsonWriter);
        }
        if (workGroupConfigurationUpdates.getPublishCloudWatchMetricsEnabled() != null) {
            Boolean publishCloudWatchMetricsEnabled = workGroupConfigurationUpdates
                    .getPublishCloudWatchMetricsEnabled();
            jsonWriter.name("PublishCloudWatchMetricsEnabled");
            jsonWriter.value(publishCloudWatchMetricsEnabled);
        }
        if (workGroupConfigurationUpdates.getBytesScannedCutoffPerQuery() != null) {
            Long bytesScannedCutoffPerQuery = workGroupConfigurationUpdates
                    .getBytesScannedCutoffPerQuery();
            jsonWriter.name("BytesScannedCutoffPerQuery");
            jsonWriter.value(bytesScannedCutoffPerQuery);
        }
        if (workGroupConfigurationUpdates.getRemoveBytesScannedCutoffPerQuery() != null) {
            Boolean removeBytesScannedCutoffPerQuery = workGroupConfigurationUpdates
                    .getRemoveBytesScannedCutoffPerQuery();
            jsonWriter.name("RemoveBytesScannedCutoffPerQuery");
            jsonWriter.value(removeBytesScannedCutoffPerQuery);
        }
        if (workGroupConfigurationUpdates.getRequesterPaysEnabled() != null) {
            Boolean requesterPaysEnabled = workGroupConfigurationUpdates.getRequesterPaysEnabled();
            jsonWriter.name("RequesterPaysEnabled");
            jsonWriter.value(requesterPaysEnabled);
        }
        jsonWriter.endObject();
    }

    private static WorkGroupConfigurationUpdatesJsonMarshaller instance;

    public static WorkGroupConfigurationUpdatesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WorkGroupConfigurationUpdatesJsonMarshaller();
        return instance;
    }
}
