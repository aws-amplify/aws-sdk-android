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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ServiceDetail
 */
class ServiceDetailJsonUnmarshaller implements Unmarshaller<ServiceDetail, JsonUnmarshallerContext> {

    public ServiceDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ServiceDetail serviceDetail = new ServiceDetail();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ServiceName")) {
                serviceDetail.setServiceName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServiceId")) {
                serviceDetail.setServiceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServiceType")) {
                serviceDetail.setServiceType(new ListUnmarshaller<ServiceTypeDetail>(
                        ServiceTypeDetailJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AvailabilityZones")) {
                serviceDetail.setAvailabilityZones(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Owner")) {
                serviceDetail.setOwner(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BaseEndpointDnsNames")) {
                serviceDetail.setBaseEndpointDnsNames(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PrivateDnsName")) {
                serviceDetail.setPrivateDnsName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcEndpointPolicySupported")) {
                serviceDetail.setVpcEndpointPolicySupported(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AcceptanceRequired")) {
                serviceDetail.setAcceptanceRequired(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ManagesVpcEndpoints")) {
                serviceDetail.setManagesVpcEndpoints(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                serviceDetail.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PrivateDnsNameVerificationState")) {
                serviceDetail.setPrivateDnsNameVerificationState(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return serviceDetail;
    }

    private static ServiceDetailJsonUnmarshaller instance;

    public static ServiceDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceDetailJsonUnmarshaller();
        return instance;
    }
}
