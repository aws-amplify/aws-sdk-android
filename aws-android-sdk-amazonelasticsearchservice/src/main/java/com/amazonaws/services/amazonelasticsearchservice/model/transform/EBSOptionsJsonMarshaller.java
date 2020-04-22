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

package com.amazonaws.services.amazonelasticsearchservice.model.transform;

import com.amazonaws.services.amazonelasticsearchservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EBSOptions
 */
class EBSOptionsJsonMarshaller {

    public void marshall(EBSOptions eBSOptions, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (eBSOptions.getEBSEnabled() != null) {
            Boolean eBSEnabled = eBSOptions.getEBSEnabled();
            jsonWriter.name("EBSEnabled");
            jsonWriter.value(eBSEnabled);
        }
        if (eBSOptions.getVolumeType() != null) {
            String volumeType = eBSOptions.getVolumeType();
            jsonWriter.name("VolumeType");
            jsonWriter.value(volumeType);
        }
        if (eBSOptions.getVolumeSize() != null) {
            Integer volumeSize = eBSOptions.getVolumeSize();
            jsonWriter.name("VolumeSize");
            jsonWriter.value(volumeSize);
        }
        if (eBSOptions.getIops() != null) {
            Integer iops = eBSOptions.getIops();
            jsonWriter.name("Iops");
            jsonWriter.value(iops);
        }
        jsonWriter.endObject();
    }

    private static EBSOptionsJsonMarshaller instance;

    public static EBSOptionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EBSOptionsJsonMarshaller();
        return instance;
    }
}
