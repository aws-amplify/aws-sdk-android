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

package com.amazonaws.services.amazonelasticmapreduce.model.transform;

import com.amazonaws.services.amazonelasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Ec2InstanceAttributes
 */
class Ec2InstanceAttributesJsonMarshaller {

    public void marshall(Ec2InstanceAttributes ec2InstanceAttributes, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (ec2InstanceAttributes.getEc2KeyName() != null) {
            String ec2KeyName = ec2InstanceAttributes.getEc2KeyName();
            jsonWriter.name("Ec2KeyName");
            jsonWriter.value(ec2KeyName);
        }
        if (ec2InstanceAttributes.getEc2SubnetId() != null) {
            String ec2SubnetId = ec2InstanceAttributes.getEc2SubnetId();
            jsonWriter.name("Ec2SubnetId");
            jsonWriter.value(ec2SubnetId);
        }
        if (ec2InstanceAttributes.getRequestedEc2SubnetIds() != null) {
            java.util.List<String> requestedEc2SubnetIds = ec2InstanceAttributes
                    .getRequestedEc2SubnetIds();
            jsonWriter.name("RequestedEc2SubnetIds");
            jsonWriter.beginArray();
            for (String requestedEc2SubnetIdsItem : requestedEc2SubnetIds) {
                if (requestedEc2SubnetIdsItem != null) {
                    jsonWriter.value(requestedEc2SubnetIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (ec2InstanceAttributes.getEc2AvailabilityZone() != null) {
            String ec2AvailabilityZone = ec2InstanceAttributes.getEc2AvailabilityZone();
            jsonWriter.name("Ec2AvailabilityZone");
            jsonWriter.value(ec2AvailabilityZone);
        }
        if (ec2InstanceAttributes.getRequestedEc2AvailabilityZones() != null) {
            java.util.List<String> requestedEc2AvailabilityZones = ec2InstanceAttributes
                    .getRequestedEc2AvailabilityZones();
            jsonWriter.name("RequestedEc2AvailabilityZones");
            jsonWriter.beginArray();
            for (String requestedEc2AvailabilityZonesItem : requestedEc2AvailabilityZones) {
                if (requestedEc2AvailabilityZonesItem != null) {
                    jsonWriter.value(requestedEc2AvailabilityZonesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (ec2InstanceAttributes.getIamInstanceProfile() != null) {
            String iamInstanceProfile = ec2InstanceAttributes.getIamInstanceProfile();
            jsonWriter.name("IamInstanceProfile");
            jsonWriter.value(iamInstanceProfile);
        }
        if (ec2InstanceAttributes.getEmrManagedMasterSecurityGroup() != null) {
            String emrManagedMasterSecurityGroup = ec2InstanceAttributes
                    .getEmrManagedMasterSecurityGroup();
            jsonWriter.name("EmrManagedMasterSecurityGroup");
            jsonWriter.value(emrManagedMasterSecurityGroup);
        }
        if (ec2InstanceAttributes.getEmrManagedSlaveSecurityGroup() != null) {
            String emrManagedSlaveSecurityGroup = ec2InstanceAttributes
                    .getEmrManagedSlaveSecurityGroup();
            jsonWriter.name("EmrManagedSlaveSecurityGroup");
            jsonWriter.value(emrManagedSlaveSecurityGroup);
        }
        if (ec2InstanceAttributes.getServiceAccessSecurityGroup() != null) {
            String serviceAccessSecurityGroup = ec2InstanceAttributes
                    .getServiceAccessSecurityGroup();
            jsonWriter.name("ServiceAccessSecurityGroup");
            jsonWriter.value(serviceAccessSecurityGroup);
        }
        if (ec2InstanceAttributes.getAdditionalMasterSecurityGroups() != null) {
            java.util.List<String> additionalMasterSecurityGroups = ec2InstanceAttributes
                    .getAdditionalMasterSecurityGroups();
            jsonWriter.name("AdditionalMasterSecurityGroups");
            jsonWriter.beginArray();
            for (String additionalMasterSecurityGroupsItem : additionalMasterSecurityGroups) {
                if (additionalMasterSecurityGroupsItem != null) {
                    jsonWriter.value(additionalMasterSecurityGroupsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (ec2InstanceAttributes.getAdditionalSlaveSecurityGroups() != null) {
            java.util.List<String> additionalSlaveSecurityGroups = ec2InstanceAttributes
                    .getAdditionalSlaveSecurityGroups();
            jsonWriter.name("AdditionalSlaveSecurityGroups");
            jsonWriter.beginArray();
            for (String additionalSlaveSecurityGroupsItem : additionalSlaveSecurityGroups) {
                if (additionalSlaveSecurityGroupsItem != null) {
                    jsonWriter.value(additionalSlaveSecurityGroupsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static Ec2InstanceAttributesJsonMarshaller instance;

    public static Ec2InstanceAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Ec2InstanceAttributesJsonMarshaller();
        return instance;
    }
}
