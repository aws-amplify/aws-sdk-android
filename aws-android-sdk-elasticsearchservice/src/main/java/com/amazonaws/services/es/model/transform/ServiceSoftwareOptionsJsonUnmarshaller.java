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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ServiceSoftwareOptions
 */
class ServiceSoftwareOptionsJsonUnmarshaller implements
        Unmarshaller<ServiceSoftwareOptions, JsonUnmarshallerContext> {

    public ServiceSoftwareOptions unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ServiceSoftwareOptions serviceSoftwareOptions = new ServiceSoftwareOptions();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CurrentVersion")) {
                serviceSoftwareOptions.setCurrentVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NewVersion")) {
                serviceSoftwareOptions.setNewVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UpdateAvailable")) {
                serviceSoftwareOptions.setUpdateAvailable(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Cancellable")) {
                serviceSoftwareOptions.setCancellable(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UpdateStatus")) {
                serviceSoftwareOptions.setUpdateStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                serviceSoftwareOptions.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AutomatedUpdateDate")) {
                serviceSoftwareOptions.setAutomatedUpdateDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OptionalDeployment")) {
                serviceSoftwareOptions.setOptionalDeployment(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return serviceSoftwareOptions;
    }

    private static ServiceSoftwareOptionsJsonUnmarshaller instance;

    public static ServiceSoftwareOptionsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceSoftwareOptionsJsonUnmarshaller();
        return instance;
    }
}
