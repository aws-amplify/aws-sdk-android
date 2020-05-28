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

package com.amazonaws.services.kafka.model.transform;

import com.amazonaws.services.kafka.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BrokerEBSVolumeInfo
 */
class BrokerEBSVolumeInfoJsonMarshaller {

    public void marshall(BrokerEBSVolumeInfo brokerEBSVolumeInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (brokerEBSVolumeInfo.getKafkaBrokerNodeId() != null) {
            String kafkaBrokerNodeId = brokerEBSVolumeInfo.getKafkaBrokerNodeId();
            jsonWriter.name("KafkaBrokerNodeId");
            jsonWriter.value(kafkaBrokerNodeId);
        }
        if (brokerEBSVolumeInfo.getVolumeSizeGB() != null) {
            Integer volumeSizeGB = brokerEBSVolumeInfo.getVolumeSizeGB();
            jsonWriter.name("VolumeSizeGB");
            jsonWriter.value(volumeSizeGB);
        }
        jsonWriter.endObject();
    }

    private static BrokerEBSVolumeInfoJsonMarshaller instance;

    public static BrokerEBSVolumeInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BrokerEBSVolumeInfoJsonMarshaller();
        return instance;
    }
}
