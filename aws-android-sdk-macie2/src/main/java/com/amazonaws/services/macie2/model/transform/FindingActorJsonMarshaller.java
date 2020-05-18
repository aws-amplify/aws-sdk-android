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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FindingActor
 */
class FindingActorJsonMarshaller {

    public void marshall(FindingActor findingActor, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (findingActor.getDomainDetails() != null) {
            DomainDetails domainDetails = findingActor.getDomainDetails();
            jsonWriter.name("domainDetails");
            DomainDetailsJsonMarshaller.getInstance().marshall(domainDetails, jsonWriter);
        }
        if (findingActor.getIpAddressDetails() != null) {
            IpAddressDetails ipAddressDetails = findingActor.getIpAddressDetails();
            jsonWriter.name("ipAddressDetails");
            IpAddressDetailsJsonMarshaller.getInstance().marshall(ipAddressDetails, jsonWriter);
        }
        if (findingActor.getUserIdentity() != null) {
            UserIdentity userIdentity = findingActor.getUserIdentity();
            jsonWriter.name("userIdentity");
            UserIdentityJsonMarshaller.getInstance().marshall(userIdentity, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static FindingActorJsonMarshaller instance;

    public static FindingActorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FindingActorJsonMarshaller();
        return instance;
    }
}
