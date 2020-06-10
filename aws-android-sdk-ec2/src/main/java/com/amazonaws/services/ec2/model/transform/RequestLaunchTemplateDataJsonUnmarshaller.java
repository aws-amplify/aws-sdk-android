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
 * JSON unmarshaller for POJO RequestLaunchTemplateData
 */
class RequestLaunchTemplateDataJsonUnmarshaller implements
        Unmarshaller<RequestLaunchTemplateData, JsonUnmarshallerContext> {

    public RequestLaunchTemplateData unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RequestLaunchTemplateData requestLaunchTemplateData = new RequestLaunchTemplateData();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("KernelId")) {
                requestLaunchTemplateData.setKernelId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EbsOptimized")) {
                requestLaunchTemplateData.setEbsOptimized(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IamInstanceProfile")) {
                requestLaunchTemplateData
                        .setIamInstanceProfile(LaunchTemplateIamInstanceProfileSpecificationRequestJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("BlockDeviceMappings")) {
                requestLaunchTemplateData
                        .setBlockDeviceMappings(new ListUnmarshaller<LaunchTemplateBlockDeviceMappingRequest>(
                                LaunchTemplateBlockDeviceMappingRequestJsonUnmarshaller
                                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NetworkInterfaces")) {
                requestLaunchTemplateData
                        .setNetworkInterfaces(new ListUnmarshaller<LaunchTemplateInstanceNetworkInterfaceSpecificationRequest>(
                                LaunchTemplateInstanceNetworkInterfaceSpecificationRequestJsonUnmarshaller
                                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ImageId")) {
                requestLaunchTemplateData.setImageId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceType")) {
                requestLaunchTemplateData.setInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KeyName")) {
                requestLaunchTemplateData.setKeyName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Monitoring")) {
                requestLaunchTemplateData
                        .setMonitoring(LaunchTemplatesMonitoringRequestJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Placement")) {
                requestLaunchTemplateData
                        .setPlacement(LaunchTemplatePlacementRequestJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("RamDiskId")) {
                requestLaunchTemplateData.setRamDiskId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DisableApiTermination")) {
                requestLaunchTemplateData.setDisableApiTermination(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceInitiatedShutdownBehavior")) {
                requestLaunchTemplateData
                        .setInstanceInitiatedShutdownBehavior(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("UserData")) {
                requestLaunchTemplateData.setUserData(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TagSpecifications")) {
                requestLaunchTemplateData
                        .setTagSpecifications(new ListUnmarshaller<LaunchTemplateTagSpecificationRequest>(
                                LaunchTemplateTagSpecificationRequestJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ElasticGpuSpecifications")) {
                requestLaunchTemplateData
                        .setElasticGpuSpecifications(new ListUnmarshaller<ElasticGpuSpecification>(
                                ElasticGpuSpecificationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ElasticInferenceAccelerators")) {
                requestLaunchTemplateData
                        .setElasticInferenceAccelerators(new ListUnmarshaller<LaunchTemplateElasticInferenceAccelerator>(
                                LaunchTemplateElasticInferenceAcceleratorJsonUnmarshaller
                                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SecurityGroupIds")) {
                requestLaunchTemplateData.setSecurityGroupIds(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SecurityGroups")) {
                requestLaunchTemplateData.setSecurityGroups(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("InstanceMarketOptions")) {
                requestLaunchTemplateData
                        .setInstanceMarketOptions(LaunchTemplateInstanceMarketOptionsRequestJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("CreditSpecification")) {
                requestLaunchTemplateData
                        .setCreditSpecification(CreditSpecificationRequestJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("CpuOptions")) {
                requestLaunchTemplateData
                        .setCpuOptions(LaunchTemplateCpuOptionsRequestJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("CapacityReservationSpecification")) {
                requestLaunchTemplateData
                        .setCapacityReservationSpecification(LaunchTemplateCapacityReservationSpecificationRequestJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("LicenseSpecifications")) {
                requestLaunchTemplateData
                        .setLicenseSpecifications(new ListUnmarshaller<LaunchTemplateLicenseConfigurationRequest>(
                                LaunchTemplateLicenseConfigurationRequestJsonUnmarshaller
                                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("HibernationOptions")) {
                requestLaunchTemplateData
                        .setHibernationOptions(LaunchTemplateHibernationOptionsRequestJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("MetadataOptions")) {
                requestLaunchTemplateData
                        .setMetadataOptions(LaunchTemplateInstanceMetadataOptionsRequestJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return requestLaunchTemplateData;
    }

    private static RequestLaunchTemplateDataJsonUnmarshaller instance;

    public static RequestLaunchTemplateDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RequestLaunchTemplateDataJsonUnmarshaller();
        return instance;
    }
}
