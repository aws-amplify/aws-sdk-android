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
 * JSON marshaller for POJO InstanceTypeInfo
 */
class InstanceTypeInfoJsonMarshaller {

    public void marshall(InstanceTypeInfo instanceTypeInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instanceTypeInfo.getInstanceType() != null) {
            String instanceType = instanceTypeInfo.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (instanceTypeInfo.getCurrentGeneration() != null) {
            Boolean currentGeneration = instanceTypeInfo.getCurrentGeneration();
            jsonWriter.name("CurrentGeneration");
            jsonWriter.value(currentGeneration);
        }
        if (instanceTypeInfo.getFreeTierEligible() != null) {
            Boolean freeTierEligible = instanceTypeInfo.getFreeTierEligible();
            jsonWriter.name("FreeTierEligible");
            jsonWriter.value(freeTierEligible);
        }
        if (instanceTypeInfo.getSupportedUsageClasses() != null) {
            java.util.List<String> supportedUsageClasses = instanceTypeInfo
                    .getSupportedUsageClasses();
            jsonWriter.name("SupportedUsageClasses");
            jsonWriter.beginArray();
            for (String supportedUsageClassesItem : supportedUsageClasses) {
                if (supportedUsageClassesItem != null) {
                    jsonWriter.value(supportedUsageClassesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (instanceTypeInfo.getSupportedRootDeviceTypes() != null) {
            java.util.List<String> supportedRootDeviceTypes = instanceTypeInfo
                    .getSupportedRootDeviceTypes();
            jsonWriter.name("SupportedRootDeviceTypes");
            jsonWriter.beginArray();
            for (String supportedRootDeviceTypesItem : supportedRootDeviceTypes) {
                if (supportedRootDeviceTypesItem != null) {
                    jsonWriter.value(supportedRootDeviceTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (instanceTypeInfo.getBareMetal() != null) {
            Boolean bareMetal = instanceTypeInfo.getBareMetal();
            jsonWriter.name("BareMetal");
            jsonWriter.value(bareMetal);
        }
        if (instanceTypeInfo.getHypervisor() != null) {
            String hypervisor = instanceTypeInfo.getHypervisor();
            jsonWriter.name("Hypervisor");
            jsonWriter.value(hypervisor);
        }
        if (instanceTypeInfo.getProcessorInfo() != null) {
            ProcessorInfo processorInfo = instanceTypeInfo.getProcessorInfo();
            jsonWriter.name("ProcessorInfo");
            ProcessorInfoJsonMarshaller.getInstance().marshall(processorInfo, jsonWriter);
        }
        if (instanceTypeInfo.getVCpuInfo() != null) {
            VCpuInfo vCpuInfo = instanceTypeInfo.getVCpuInfo();
            jsonWriter.name("VCpuInfo");
            VCpuInfoJsonMarshaller.getInstance().marshall(vCpuInfo, jsonWriter);
        }
        if (instanceTypeInfo.getMemoryInfo() != null) {
            MemoryInfo memoryInfo = instanceTypeInfo.getMemoryInfo();
            jsonWriter.name("MemoryInfo");
            MemoryInfoJsonMarshaller.getInstance().marshall(memoryInfo, jsonWriter);
        }
        if (instanceTypeInfo.getInstanceStorageSupported() != null) {
            Boolean instanceStorageSupported = instanceTypeInfo.getInstanceStorageSupported();
            jsonWriter.name("InstanceStorageSupported");
            jsonWriter.value(instanceStorageSupported);
        }
        if (instanceTypeInfo.getInstanceStorageInfo() != null) {
            InstanceStorageInfo instanceStorageInfo = instanceTypeInfo.getInstanceStorageInfo();
            jsonWriter.name("InstanceStorageInfo");
            InstanceStorageInfoJsonMarshaller.getInstance().marshall(instanceStorageInfo,
                    jsonWriter);
        }
        if (instanceTypeInfo.getEbsInfo() != null) {
            EbsInfo ebsInfo = instanceTypeInfo.getEbsInfo();
            jsonWriter.name("EbsInfo");
            EbsInfoJsonMarshaller.getInstance().marshall(ebsInfo, jsonWriter);
        }
        if (instanceTypeInfo.getNetworkInfo() != null) {
            NetworkInfo networkInfo = instanceTypeInfo.getNetworkInfo();
            jsonWriter.name("NetworkInfo");
            NetworkInfoJsonMarshaller.getInstance().marshall(networkInfo, jsonWriter);
        }
        if (instanceTypeInfo.getGpuInfo() != null) {
            GpuInfo gpuInfo = instanceTypeInfo.getGpuInfo();
            jsonWriter.name("GpuInfo");
            GpuInfoJsonMarshaller.getInstance().marshall(gpuInfo, jsonWriter);
        }
        if (instanceTypeInfo.getFpgaInfo() != null) {
            FpgaInfo fpgaInfo = instanceTypeInfo.getFpgaInfo();
            jsonWriter.name("FpgaInfo");
            FpgaInfoJsonMarshaller.getInstance().marshall(fpgaInfo, jsonWriter);
        }
        if (instanceTypeInfo.getPlacementGroupInfo() != null) {
            PlacementGroupInfo placementGroupInfo = instanceTypeInfo.getPlacementGroupInfo();
            jsonWriter.name("PlacementGroupInfo");
            PlacementGroupInfoJsonMarshaller.getInstance().marshall(placementGroupInfo, jsonWriter);
        }
        if (instanceTypeInfo.getInferenceAcceleratorInfo() != null) {
            InferenceAcceleratorInfo inferenceAcceleratorInfo = instanceTypeInfo
                    .getInferenceAcceleratorInfo();
            jsonWriter.name("InferenceAcceleratorInfo");
            InferenceAcceleratorInfoJsonMarshaller.getInstance().marshall(inferenceAcceleratorInfo,
                    jsonWriter);
        }
        if (instanceTypeInfo.getHibernationSupported() != null) {
            Boolean hibernationSupported = instanceTypeInfo.getHibernationSupported();
            jsonWriter.name("HibernationSupported");
            jsonWriter.value(hibernationSupported);
        }
        if (instanceTypeInfo.getBurstablePerformanceSupported() != null) {
            Boolean burstablePerformanceSupported = instanceTypeInfo
                    .getBurstablePerformanceSupported();
            jsonWriter.name("BurstablePerformanceSupported");
            jsonWriter.value(burstablePerformanceSupported);
        }
        if (instanceTypeInfo.getDedicatedHostsSupported() != null) {
            Boolean dedicatedHostsSupported = instanceTypeInfo.getDedicatedHostsSupported();
            jsonWriter.name("DedicatedHostsSupported");
            jsonWriter.value(dedicatedHostsSupported);
        }
        if (instanceTypeInfo.getAutoRecoverySupported() != null) {
            Boolean autoRecoverySupported = instanceTypeInfo.getAutoRecoverySupported();
            jsonWriter.name("AutoRecoverySupported");
            jsonWriter.value(autoRecoverySupported);
        }
        jsonWriter.endObject();
    }

    private static InstanceTypeInfoJsonMarshaller instance;

    public static InstanceTypeInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceTypeInfoJsonMarshaller();
        return instance;
    }
}
