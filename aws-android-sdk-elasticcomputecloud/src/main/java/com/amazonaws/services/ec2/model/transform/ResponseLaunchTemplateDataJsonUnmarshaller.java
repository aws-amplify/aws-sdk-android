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
 * JSON unmarshaller for POJO ResponseLaunchTemplateData
 */
class ResponseLaunchTemplateDataJsonUnmarshaller implements
        Unmarshaller<ResponseLaunchTemplateData, JsonUnmarshallerContext> {

    public ResponseLaunchTemplateData unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ResponseLaunchTemplateData responseLaunchTemplateData = new ResponseLaunchTemplateData();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("KernelId")) {
                responseLaunchTemplateData.setKernelId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EbsOptimized")) {
                responseLaunchTemplateData.setEbsOptimized(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IamInstanceProfile")) {
                responseLaunchTemplateData
                        .setIamInstanceProfile(LaunchTemplateIamInstanceProfileSpecificationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("BlockDeviceMappings")) {
                responseLaunchTemplateData
                        .setBlockDeviceMappings(new ListUnmarshaller<LaunchTemplateBlockDeviceMapping>(
                                LaunchTemplateBlockDeviceMappingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NetworkInterfaces")) {
                responseLaunchTemplateData
                        .setNetworkInterfaces(new ListUnmarshaller<LaunchTemplateInstanceNetworkInterfaceSpecification>(
                                LaunchTemplateInstanceNetworkInterfaceSpecificationJsonUnmarshaller
                                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ImageId")) {
                responseLaunchTemplateData.setImageId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceType")) {
                responseLaunchTemplateData.setInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KeyName")) {
                responseLaunchTemplateData.setKeyName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Monitoring")) {
                responseLaunchTemplateData.setMonitoring(LaunchTemplatesMonitoringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Placement")) {
                responseLaunchTemplateData.setPlacement(LaunchTemplatePlacementJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RamDiskId")) {
                responseLaunchTemplateData.setRamDiskId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DisableApiTermination")) {
                responseLaunchTemplateData.setDisableApiTermination(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceInitiatedShutdownBehavior")) {
                responseLaunchTemplateData
                        .setInstanceInitiatedShutdownBehavior(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("UserData")) {
                responseLaunchTemplateData.setUserData(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TagSpecifications")) {
                responseLaunchTemplateData
                        .setTagSpecifications(new ListUnmarshaller<LaunchTemplateTagSpecification>(
                                LaunchTemplateTagSpecificationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ElasticGpuSpecifications")) {
                responseLaunchTemplateData
                        .setElasticGpuSpecifications(new ListUnmarshaller<ElasticGpuSpecificationResponse>(
                                ElasticGpuSpecificationResponseJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ElasticInferenceAccelerators")) {
                responseLaunchTemplateData
                        .setElasticInferenceAccelerators(new ListUnmarshaller<LaunchTemplateElasticInferenceAcceleratorResponse>(
                                LaunchTemplateElasticInferenceAcceleratorResponseJsonUnmarshaller
                                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SecurityGroupIds")) {
                responseLaunchTemplateData.setSecurityGroupIds(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SecurityGroups")) {
                responseLaunchTemplateData.setSecurityGroups(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("InstanceMarketOptions")) {
                responseLaunchTemplateData
                        .setInstanceMarketOptions(LaunchTemplateInstanceMarketOptionsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("CreditSpecification")) {
                responseLaunchTemplateData
                        .setCreditSpecification(CreditSpecificationJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("CpuOptions")) {
                responseLaunchTemplateData.setCpuOptions(LaunchTemplateCpuOptionsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CapacityReservationSpecification")) {
                responseLaunchTemplateData
                        .setCapacityReservationSpecification(LaunchTemplateCapacityReservationSpecificationResponseJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("LicenseSpecifications")) {
                responseLaunchTemplateData
                        .setLicenseSpecifications(new ListUnmarshaller<LaunchTemplateLicenseConfiguration>(
                                LaunchTemplateLicenseConfigurationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("HibernationOptions")) {
                responseLaunchTemplateData
                        .setHibernationOptions(LaunchTemplateHibernationOptionsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("MetadataOptions")) {
                responseLaunchTemplateData
                        .setMetadataOptions(LaunchTemplateInstanceMetadataOptionsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return responseLaunchTemplateData;
    }

    private static ResponseLaunchTemplateDataJsonUnmarshaller instance;

    public static ResponseLaunchTemplateDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResponseLaunchTemplateDataJsonUnmarshaller();
        return instance;
    }
}
