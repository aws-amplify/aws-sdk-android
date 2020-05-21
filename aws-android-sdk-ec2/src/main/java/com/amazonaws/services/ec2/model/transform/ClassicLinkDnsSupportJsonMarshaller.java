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
 * JSON marshaller for POJO ClassicLinkDnsSupport
 */
class ClassicLinkDnsSupportJsonMarshaller {

    public void marshall(ClassicLinkDnsSupport classicLinkDnsSupport, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (classicLinkDnsSupport.getClassicLinkDnsSupported() != null) {
            Boolean classicLinkDnsSupported = classicLinkDnsSupport.getClassicLinkDnsSupported();
            jsonWriter.name("ClassicLinkDnsSupported");
            jsonWriter.value(classicLinkDnsSupported);
        }
        if (classicLinkDnsSupport.getVpcId() != null) {
            String vpcId = classicLinkDnsSupport.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        jsonWriter.endObject();
    }

    private static ClassicLinkDnsSupportJsonMarshaller instance;

    public static ClassicLinkDnsSupportJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClassicLinkDnsSupportJsonMarshaller();
        return instance;
    }
}
