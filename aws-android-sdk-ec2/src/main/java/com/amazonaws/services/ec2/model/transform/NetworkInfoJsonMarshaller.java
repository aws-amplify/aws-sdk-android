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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NetworkInfo
 */
class NetworkInfoJsonMarshaller {

    public void marshall(NetworkInfo networkInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (networkInfo.getNetworkPerformance() != null) {
            String networkPerformance = networkInfo.getNetworkPerformance();
            jsonWriter.name("NetworkPerformance");
            jsonWriter.value(networkPerformance);
        }
        if (networkInfo.getMaximumNetworkInterfaces() != null) {
            Integer maximumNetworkInterfaces = networkInfo.getMaximumNetworkInterfaces();
            jsonWriter.name("MaximumNetworkInterfaces");
            jsonWriter.value(maximumNetworkInterfaces);
        }
        if (networkInfo.getIpv4AddressesPerInterface() != null) {
            Integer ipv4AddressesPerInterface = networkInfo.getIpv4AddressesPerInterface();
            jsonWriter.name("Ipv4AddressesPerInterface");
            jsonWriter.value(ipv4AddressesPerInterface);
        }
        if (networkInfo.getIpv6AddressesPerInterface() != null) {
            Integer ipv6AddressesPerInterface = networkInfo.getIpv6AddressesPerInterface();
            jsonWriter.name("Ipv6AddressesPerInterface");
            jsonWriter.value(ipv6AddressesPerInterface);
        }
        if (networkInfo.getIpv6Supported() != null) {
            Boolean ipv6Supported = networkInfo.getIpv6Supported();
            jsonWriter.name("Ipv6Supported");
            jsonWriter.value(ipv6Supported);
        }
        if (networkInfo.getEnaSupport() != null) {
            String enaSupport = networkInfo.getEnaSupport();
            jsonWriter.name("EnaSupport");
            jsonWriter.value(enaSupport);
        }
        jsonWriter.endObject();
    }

    private static NetworkInfoJsonMarshaller instance;

    public static NetworkInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NetworkInfoJsonMarshaller();
        return instance;
    }
}
