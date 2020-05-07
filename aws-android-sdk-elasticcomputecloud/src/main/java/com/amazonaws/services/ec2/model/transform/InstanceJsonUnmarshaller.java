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
 * JSON unmarshaller for POJO Instance
 */
class InstanceJsonUnmarshaller implements Unmarshaller<Instance, JsonUnmarshallerContext> {

    public Instance unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Instance instance = new Instance();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AmiLaunchIndex")) {
                instance.setAmiLaunchIndex(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImageId")) {
                instance.setImageId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceId")) {
                instance.setInstanceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceType")) {
                instance.setInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KernelId")) {
                instance.setKernelId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KeyName")) {
                instance.setKeyName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LaunchTime")) {
                instance.setLaunchTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Monitoring")) {
                instance.setMonitoring(MonitoringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Placement")) {
                instance.setPlacement(PlacementJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Platform")) {
                instance.setPlatform(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PrivateDnsName")) {
                instance.setPrivateDnsName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PrivateIpAddress")) {
                instance.setPrivateIpAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProductCodes")) {
                instance.setProductCodes(new ListUnmarshaller<ProductCode>(
                        ProductCodeJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PublicDnsName")) {
                instance.setPublicDnsName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PublicIpAddress")) {
                instance.setPublicIpAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RamdiskId")) {
                instance.setRamdiskId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                instance.setState(InstanceStateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StateTransitionReason")) {
                instance.setStateTransitionReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubnetId")) {
                instance.setSubnetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcId")) {
                instance.setVpcId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Architecture")) {
                instance.setArchitecture(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BlockDeviceMappings")) {
                instance.setBlockDeviceMappings(new ListUnmarshaller<InstanceBlockDeviceMapping>(
                        InstanceBlockDeviceMappingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ClientToken")) {
                instance.setClientToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EbsOptimized")) {
                instance.setEbsOptimized(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EnaSupport")) {
                instance.setEnaSupport(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Hypervisor")) {
                instance.setHypervisor(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IamInstanceProfile")) {
                instance.setIamInstanceProfile(IamInstanceProfileJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceLifecycle")) {
                instance.setInstanceLifecycle(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ElasticGpuAssociations")) {
                instance.setElasticGpuAssociations(new ListUnmarshaller<ElasticGpuAssociation>(
                        ElasticGpuAssociationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ElasticInferenceAcceleratorAssociations")) {
                instance.setElasticInferenceAcceleratorAssociations(new ListUnmarshaller<ElasticInferenceAcceleratorAssociation>(
                        ElasticInferenceAcceleratorAssociationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NetworkInterfaces")) {
                instance.setNetworkInterfaces(new ListUnmarshaller<InstanceNetworkInterface>(
                        InstanceNetworkInterfaceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("OutpostArn")) {
                instance.setOutpostArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RootDeviceName")) {
                instance.setRootDeviceName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RootDeviceType")) {
                instance.setRootDeviceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SecurityGroups")) {
                instance.setSecurityGroups(new ListUnmarshaller<GroupIdentifier>(
                        GroupIdentifierJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SourceDestCheck")) {
                instance.setSourceDestCheck(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SpotInstanceRequestId")) {
                instance.setSpotInstanceRequestId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SriovNetSupport")) {
                instance.setSriovNetSupport(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StateReason")) {
                instance.setStateReason(StateReasonJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                instance.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("VirtualizationType")) {
                instance.setVirtualizationType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CpuOptions")) {
                instance.setCpuOptions(CpuOptionsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CapacityReservationId")) {
                instance.setCapacityReservationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CapacityReservationSpecification")) {
                instance.setCapacityReservationSpecification(CapacityReservationSpecificationResponseJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("HibernationOptions")) {
                instance.setHibernationOptions(HibernationOptionsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Licenses")) {
                instance.setLicenses(new ListUnmarshaller<LicenseConfiguration>(
                        LicenseConfigurationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("MetadataOptions")) {
                instance.setMetadataOptions(InstanceMetadataOptionsResponseJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return instance;
    }

    private static InstanceJsonUnmarshaller instance;

    public static InstanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceJsonUnmarshaller();
        return instance;
    }
}
