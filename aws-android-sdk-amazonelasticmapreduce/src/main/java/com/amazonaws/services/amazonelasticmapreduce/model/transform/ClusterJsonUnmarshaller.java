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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Cluster
 */
class ClusterJsonUnmarshaller implements Unmarshaller<Cluster, JsonUnmarshallerContext> {

    public Cluster unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Cluster cluster = new Cluster();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Id")) {
                cluster.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                cluster.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                cluster.setStatus(ClusterStatusJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Ec2InstanceAttributes")) {
                cluster.setEc2InstanceAttributes(Ec2InstanceAttributesJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceCollectionType")) {
                cluster.setInstanceCollectionType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LogUri")) {
                cluster.setLogUri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequestedAmiVersion")) {
                cluster.setRequestedAmiVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RunningAmiVersion")) {
                cluster.setRunningAmiVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReleaseLabel")) {
                cluster.setReleaseLabel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AutoTerminate")) {
                cluster.setAutoTerminate(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TerminationProtected")) {
                cluster.setTerminationProtected(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VisibleToAllUsers")) {
                cluster.setVisibleToAllUsers(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Applications")) {
                cluster.setApplications(new ListUnmarshaller<Application>(
                        ApplicationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Tags")) {
                cluster.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ServiceRole")) {
                cluster.setServiceRole(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NormalizedInstanceHours")) {
                cluster.setNormalizedInstanceHours(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MasterPublicDnsName")) {
                cluster.setMasterPublicDnsName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Configurations")) {
                cluster.setConfigurations(new ListUnmarshaller<Configuration>(
                        ConfigurationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SecurityConfiguration")) {
                cluster.setSecurityConfiguration(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AutoScalingRole")) {
                cluster.setAutoScalingRole(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ScaleDownBehavior")) {
                cluster.setScaleDownBehavior(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CustomAmiId")) {
                cluster.setCustomAmiId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EbsRootVolumeSize")) {
                cluster.setEbsRootVolumeSize(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RepoUpgradeOnBoot")) {
                cluster.setRepoUpgradeOnBoot(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KerberosAttributes")) {
                cluster.setKerberosAttributes(KerberosAttributesJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ClusterArn")) {
                cluster.setClusterArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutpostArn")) {
                cluster.setOutpostArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StepConcurrencyLevel")) {
                cluster.setStepConcurrencyLevel(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return cluster;
    }

    private static ClusterJsonUnmarshaller instance;

    public static ClusterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClusterJsonUnmarshaller();
        return instance;
    }
}
