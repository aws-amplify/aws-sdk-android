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

package com.amazonaws.services.directconnect.model.transform;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Interconnect
 */
class InterconnectJsonMarshaller {

    public void marshall(Interconnect interconnect, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (interconnect.getInterconnectId() != null) {
            String interconnectId = interconnect.getInterconnectId();
            jsonWriter.name("interconnectId");
            jsonWriter.value(interconnectId);
        }
        if (interconnect.getInterconnectName() != null) {
            String interconnectName = interconnect.getInterconnectName();
            jsonWriter.name("interconnectName");
            jsonWriter.value(interconnectName);
        }
        if (interconnect.getInterconnectState() != null) {
            String interconnectState = interconnect.getInterconnectState();
            jsonWriter.name("interconnectState");
            jsonWriter.value(interconnectState);
        }
        if (interconnect.getRegion() != null) {
            String region = interconnect.getRegion();
            jsonWriter.name("region");
            jsonWriter.value(region);
        }
        if (interconnect.getLocation() != null) {
            String location = interconnect.getLocation();
            jsonWriter.name("location");
            jsonWriter.value(location);
        }
        if (interconnect.getBandwidth() != null) {
            String bandwidth = interconnect.getBandwidth();
            jsonWriter.name("bandwidth");
            jsonWriter.value(bandwidth);
        }
        if (interconnect.getLoaIssueTime() != null) {
            java.util.Date loaIssueTime = interconnect.getLoaIssueTime();
            jsonWriter.name("loaIssueTime");
            jsonWriter.value(loaIssueTime);
        }
        if (interconnect.getLagId() != null) {
            String lagId = interconnect.getLagId();
            jsonWriter.name("lagId");
            jsonWriter.value(lagId);
        }
        if (interconnect.getAwsDevice() != null) {
            String awsDevice = interconnect.getAwsDevice();
            jsonWriter.name("awsDevice");
            jsonWriter.value(awsDevice);
        }
        if (interconnect.getJumboFrameCapable() != null) {
            Boolean jumboFrameCapable = interconnect.getJumboFrameCapable();
            jsonWriter.name("jumboFrameCapable");
            jsonWriter.value(jumboFrameCapable);
        }
        if (interconnect.getAwsDeviceV2() != null) {
            String awsDeviceV2 = interconnect.getAwsDeviceV2();
            jsonWriter.name("awsDeviceV2");
            jsonWriter.value(awsDeviceV2);
        }
        if (interconnect.getHasLogicalRedundancy() != null) {
            String hasLogicalRedundancy = interconnect.getHasLogicalRedundancy();
            jsonWriter.name("hasLogicalRedundancy");
            jsonWriter.value(hasLogicalRedundancy);
        }
        if (interconnect.getTags() != null) {
            java.util.List<Tag> tags = interconnect.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (interconnect.getProviderName() != null) {
            String providerName = interconnect.getProviderName();
            jsonWriter.name("providerName");
            jsonWriter.value(providerName);
        }
        jsonWriter.endObject();
    }

    private static InterconnectJsonMarshaller instance;

    public static InterconnectJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InterconnectJsonMarshaller();
        return instance;
    }
}
