/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ThingIndexingConfiguration
 */
class ThingIndexingConfigurationJsonMarshaller {

    public void marshall(ThingIndexingConfiguration thingIndexingConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (thingIndexingConfiguration.getThingIndexingMode() != null) {
            String thingIndexingMode = thingIndexingConfiguration.getThingIndexingMode();
            jsonWriter.name("thingIndexingMode");
            jsonWriter.value(thingIndexingMode);
        }
        if (thingIndexingConfiguration.getThingConnectivityIndexingMode() != null) {
            String thingConnectivityIndexingMode = thingIndexingConfiguration
                    .getThingConnectivityIndexingMode();
            jsonWriter.name("thingConnectivityIndexingMode");
            jsonWriter.value(thingConnectivityIndexingMode);
        }
        jsonWriter.endObject();
    }

    private static ThingIndexingConfigurationJsonMarshaller instance;

    public static ThingIndexingConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ThingIndexingConfigurationJsonMarshaller();
        return instance;
    }
}
