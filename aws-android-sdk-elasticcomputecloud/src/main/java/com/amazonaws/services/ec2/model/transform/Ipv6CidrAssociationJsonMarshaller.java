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
 * JSON marshaller for POJO Ipv6CidrAssociation
 */
class Ipv6CidrAssociationJsonMarshaller {

    public void marshall(Ipv6CidrAssociation ipv6CidrAssociation, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (ipv6CidrAssociation.getIpv6Cidr() != null) {
            String ipv6Cidr = ipv6CidrAssociation.getIpv6Cidr();
            jsonWriter.name("Ipv6Cidr");
            jsonWriter.value(ipv6Cidr);
        }
        if (ipv6CidrAssociation.getAssociatedResource() != null) {
            String associatedResource = ipv6CidrAssociation.getAssociatedResource();
            jsonWriter.name("AssociatedResource");
            jsonWriter.value(associatedResource);
        }
        jsonWriter.endObject();
    }

    private static Ipv6CidrAssociationJsonMarshaller instance;

    public static Ipv6CidrAssociationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Ipv6CidrAssociationJsonMarshaller();
        return instance;
    }
}
