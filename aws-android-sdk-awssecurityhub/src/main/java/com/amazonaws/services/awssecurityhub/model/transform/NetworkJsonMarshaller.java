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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Network
 */
class NetworkJsonMarshaller {

    public void marshall(Network network, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (network.getDirection() != null) {
            String direction = network.getDirection();
            jsonWriter.name("Direction");
            jsonWriter.value(direction);
        }
        if (network.getProtocol() != null) {
            String protocol = network.getProtocol();
            jsonWriter.name("Protocol");
            jsonWriter.value(protocol);
        }
        if (network.getSourceIpV4() != null) {
            String sourceIpV4 = network.getSourceIpV4();
            jsonWriter.name("SourceIpV4");
            jsonWriter.value(sourceIpV4);
        }
        if (network.getSourceIpV6() != null) {
            String sourceIpV6 = network.getSourceIpV6();
            jsonWriter.name("SourceIpV6");
            jsonWriter.value(sourceIpV6);
        }
        if (network.getSourcePort() != null) {
            Integer sourcePort = network.getSourcePort();
            jsonWriter.name("SourcePort");
            jsonWriter.value(sourcePort);
        }
        if (network.getSourceDomain() != null) {
            String sourceDomain = network.getSourceDomain();
            jsonWriter.name("SourceDomain");
            jsonWriter.value(sourceDomain);
        }
        if (network.getSourceMac() != null) {
            String sourceMac = network.getSourceMac();
            jsonWriter.name("SourceMac");
            jsonWriter.value(sourceMac);
        }
        if (network.getDestinationIpV4() != null) {
            String destinationIpV4 = network.getDestinationIpV4();
            jsonWriter.name("DestinationIpV4");
            jsonWriter.value(destinationIpV4);
        }
        if (network.getDestinationIpV6() != null) {
            String destinationIpV6 = network.getDestinationIpV6();
            jsonWriter.name("DestinationIpV6");
            jsonWriter.value(destinationIpV6);
        }
        if (network.getDestinationPort() != null) {
            Integer destinationPort = network.getDestinationPort();
            jsonWriter.name("DestinationPort");
            jsonWriter.value(destinationPort);
        }
        if (network.getDestinationDomain() != null) {
            String destinationDomain = network.getDestinationDomain();
            jsonWriter.name("DestinationDomain");
            jsonWriter.value(destinationDomain);
        }
        jsonWriter.endObject();
    }

    private static NetworkJsonMarshaller instance;

    public static NetworkJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NetworkJsonMarshaller();
        return instance;
    }
}
