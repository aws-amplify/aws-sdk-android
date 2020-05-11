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
 * JSON marshaller for POJO Ipv6CidrBlock
 */
class Ipv6CidrBlockJsonMarshaller {

    public void marshall(Ipv6CidrBlock ipv6CidrBlock, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (ipv6CidrBlock.getIpv6CidrBlock() != null) {
            String ipv6CidrBlock = ipv6CidrBlock.getIpv6CidrBlock();
            jsonWriter.name("Ipv6CidrBlock");
            jsonWriter.value(ipv6CidrBlock);
        }
        jsonWriter.endObject();
    }

    private static Ipv6CidrBlockJsonMarshaller instance;

    public static Ipv6CidrBlockJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Ipv6CidrBlockJsonMarshaller();
        return instance;
    }
}
