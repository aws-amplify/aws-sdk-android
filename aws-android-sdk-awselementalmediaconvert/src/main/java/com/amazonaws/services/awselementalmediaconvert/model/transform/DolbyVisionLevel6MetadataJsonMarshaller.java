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

package com.amazonaws.services.awselementalmediaconvert.model.transform;

import com.amazonaws.services.awselementalmediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DolbyVisionLevel6Metadata
 */
class DolbyVisionLevel6MetadataJsonMarshaller {

    public void marshall(DolbyVisionLevel6Metadata dolbyVisionLevel6Metadata,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dolbyVisionLevel6Metadata.getMaxCll() != null) {
            Integer maxCll = dolbyVisionLevel6Metadata.getMaxCll();
            jsonWriter.name("MaxCll");
            jsonWriter.value(maxCll);
        }
        if (dolbyVisionLevel6Metadata.getMaxFall() != null) {
            Integer maxFall = dolbyVisionLevel6Metadata.getMaxFall();
            jsonWriter.name("MaxFall");
            jsonWriter.value(maxFall);
        }
        jsonWriter.endObject();
    }

    private static DolbyVisionLevel6MetadataJsonMarshaller instance;

    public static DolbyVisionLevel6MetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DolbyVisionLevel6MetadataJsonMarshaller();
        return instance;
    }
}
