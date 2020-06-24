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

package com.amazonaws.services.elasticmapreduce.model.transform;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EbsConfiguration
 */
class EbsConfigurationJsonMarshaller {

    public void marshall(EbsConfiguration ebsConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (ebsConfiguration.getEbsBlockDeviceConfigs() != null) {
            java.util.List<EbsBlockDeviceConfig> ebsBlockDeviceConfigs = ebsConfiguration
                    .getEbsBlockDeviceConfigs();
            jsonWriter.name("EbsBlockDeviceConfigs");
            jsonWriter.beginArray();
            for (EbsBlockDeviceConfig ebsBlockDeviceConfigsItem : ebsBlockDeviceConfigs) {
                if (ebsBlockDeviceConfigsItem != null) {
                    EbsBlockDeviceConfigJsonMarshaller.getInstance().marshall(
                            ebsBlockDeviceConfigsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (ebsConfiguration.getEbsOptimized() != null) {
            Boolean ebsOptimized = ebsConfiguration.getEbsOptimized();
            jsonWriter.name("EbsOptimized");
            jsonWriter.value(ebsOptimized);
        }
        jsonWriter.endObject();
    }

    private static EbsConfigurationJsonMarshaller instance;

    public static EbsConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EbsConfigurationJsonMarshaller();
        return instance;
    }
}
