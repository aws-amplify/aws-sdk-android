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

package com.amazonaws.services.awselementalmedialive.model.transform;

import com.amazonaws.services.awselementalmedialive.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DvbSdtSettings
 */
class DvbSdtSettingsJsonMarshaller {

    public void marshall(DvbSdtSettings dvbSdtSettings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dvbSdtSettings.getOutputSdt() != null) {
            String outputSdt = dvbSdtSettings.getOutputSdt();
            jsonWriter.name("OutputSdt");
            jsonWriter.value(outputSdt);
        }
        if (dvbSdtSettings.getRepInterval() != null) {
            Integer repInterval = dvbSdtSettings.getRepInterval();
            jsonWriter.name("RepInterval");
            jsonWriter.value(repInterval);
        }
        if (dvbSdtSettings.getServiceName() != null) {
            String serviceName = dvbSdtSettings.getServiceName();
            jsonWriter.name("ServiceName");
            jsonWriter.value(serviceName);
        }
        if (dvbSdtSettings.getServiceProviderName() != null) {
            String serviceProviderName = dvbSdtSettings.getServiceProviderName();
            jsonWriter.name("ServiceProviderName");
            jsonWriter.value(serviceProviderName);
        }
        jsonWriter.endObject();
    }

    private static DvbSdtSettingsJsonMarshaller instance;

    public static DvbSdtSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DvbSdtSettingsJsonMarshaller();
        return instance;
    }
}
