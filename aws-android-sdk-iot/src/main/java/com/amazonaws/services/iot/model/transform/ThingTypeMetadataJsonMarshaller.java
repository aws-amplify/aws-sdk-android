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
 * JSON marshaller for POJO ThingTypeMetadata
 */
class ThingTypeMetadataJsonMarshaller {

    public void marshall(ThingTypeMetadata thingTypeMetadata, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (thingTypeMetadata.getDeprecated() != null) {
            Boolean deprecated = thingTypeMetadata.getDeprecated();
            jsonWriter.name("deprecated");
            jsonWriter.value(deprecated);
        }
        if (thingTypeMetadata.getDeprecationDate() != null) {
            java.util.Date deprecationDate = thingTypeMetadata.getDeprecationDate();
            jsonWriter.name("deprecationDate");
            jsonWriter.value(deprecationDate);
        }
        if (thingTypeMetadata.getCreationDate() != null) {
            java.util.Date creationDate = thingTypeMetadata.getCreationDate();
            jsonWriter.name("creationDate");
            jsonWriter.value(creationDate);
        }
        jsonWriter.endObject();
    }

    private static ThingTypeMetadataJsonMarshaller instance;

    public static ThingTypeMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ThingTypeMetadataJsonMarshaller();
        return instance;
    }
}
