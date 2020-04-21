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

package com.amazonaws.services.awscostexplorerservice.model.transform;

import com.amazonaws.services.awscostexplorerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InstanceDetails
 */
class InstanceDetailsJsonMarshaller {

    public void marshall(InstanceDetails instanceDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instanceDetails.getEC2InstanceDetails() != null) {
            EC2InstanceDetails eC2InstanceDetails = instanceDetails.getEC2InstanceDetails();
            jsonWriter.name("EC2InstanceDetails");
            EC2InstanceDetailsJsonMarshaller.getInstance().marshall(eC2InstanceDetails, jsonWriter);
        }
        if (instanceDetails.getRDSInstanceDetails() != null) {
            RDSInstanceDetails rDSInstanceDetails = instanceDetails.getRDSInstanceDetails();
            jsonWriter.name("RDSInstanceDetails");
            RDSInstanceDetailsJsonMarshaller.getInstance().marshall(rDSInstanceDetails, jsonWriter);
        }
        if (instanceDetails.getRedshiftInstanceDetails() != null) {
            RedshiftInstanceDetails redshiftInstanceDetails = instanceDetails
                    .getRedshiftInstanceDetails();
            jsonWriter.name("RedshiftInstanceDetails");
            RedshiftInstanceDetailsJsonMarshaller.getInstance().marshall(redshiftInstanceDetails,
                    jsonWriter);
        }
        if (instanceDetails.getElastiCacheInstanceDetails() != null) {
            ElastiCacheInstanceDetails elastiCacheInstanceDetails = instanceDetails
                    .getElastiCacheInstanceDetails();
            jsonWriter.name("ElastiCacheInstanceDetails");
            ElastiCacheInstanceDetailsJsonMarshaller.getInstance().marshall(
                    elastiCacheInstanceDetails, jsonWriter);
        }
        if (instanceDetails.getESInstanceDetails() != null) {
            ESInstanceDetails eSInstanceDetails = instanceDetails.getESInstanceDetails();
            jsonWriter.name("ESInstanceDetails");
            ESInstanceDetailsJsonMarshaller.getInstance().marshall(eSInstanceDetails, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static InstanceDetailsJsonMarshaller instance;

    public static InstanceDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceDetailsJsonMarshaller();
        return instance;
    }
}
