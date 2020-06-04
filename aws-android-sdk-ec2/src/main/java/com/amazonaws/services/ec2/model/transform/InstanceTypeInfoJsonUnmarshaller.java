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
 * JSON unmarshaller for POJO InstanceTypeInfo
 */
class InstanceTypeInfoJsonUnmarshaller implements
        Unmarshaller<InstanceTypeInfo, JsonUnmarshallerContext> {

    public InstanceTypeInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InstanceTypeInfo instanceTypeInfo = new InstanceTypeInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("InstanceType")) {
                instanceTypeInfo.setInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CurrentGeneration")) {
                instanceTypeInfo.setCurrentGeneration(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FreeTierEligible")) {
                instanceTypeInfo.setFreeTierEligible(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SupportedUsageClasses")) {
                instanceTypeInfo.setSupportedUsageClasses(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SupportedRootDeviceTypes")) {
                instanceTypeInfo.setSupportedRootDeviceTypes(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SupportedVirtualizationTypes")) {
                instanceTypeInfo.setSupportedVirtualizationTypes(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("BareMetal")) {
                instanceTypeInfo.setBareMetal(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Hypervisor")) {
                instanceTypeInfo.setHypervisor(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProcessorInfo")) {
                instanceTypeInfo.setProcessorInfo(ProcessorInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VCpuInfo")) {
                instanceTypeInfo.setVCpuInfo(VCpuInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MemoryInfo")) {
                instanceTypeInfo.setMemoryInfo(MemoryInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceStorageSupported")) {
                instanceTypeInfo.setInstanceStorageSupported(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceStorageInfo")) {
                instanceTypeInfo.setInstanceStorageInfo(InstanceStorageInfoJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EbsInfo")) {
                instanceTypeInfo.setEbsInfo(EbsInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NetworkInfo")) {
                instanceTypeInfo.setNetworkInfo(NetworkInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GpuInfo")) {
                instanceTypeInfo.setGpuInfo(GpuInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FpgaInfo")) {
                instanceTypeInfo.setFpgaInfo(FpgaInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PlacementGroupInfo")) {
                instanceTypeInfo.setPlacementGroupInfo(PlacementGroupInfoJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("InferenceAcceleratorInfo")) {
                instanceTypeInfo
                        .setInferenceAcceleratorInfo(InferenceAcceleratorInfoJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("HibernationSupported")) {
                instanceTypeInfo.setHibernationSupported(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BurstablePerformanceSupported")) {
                instanceTypeInfo.setBurstablePerformanceSupported(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DedicatedHostsSupported")) {
                instanceTypeInfo.setDedicatedHostsSupported(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AutoRecoverySupported")) {
                instanceTypeInfo.setAutoRecoverySupported(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return instanceTypeInfo;
    }

    private static InstanceTypeInfoJsonUnmarshaller instance;

    public static InstanceTypeInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceTypeInfoJsonUnmarshaller();
        return instance;
    }
}
