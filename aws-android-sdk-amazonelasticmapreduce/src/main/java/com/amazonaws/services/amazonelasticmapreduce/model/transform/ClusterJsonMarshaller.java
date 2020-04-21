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
 * JSON marshaller for POJO Cluster
 */
class ClusterJsonMarshaller {

    public void marshall(Cluster cluster, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (cluster.getId() != null) {
            String id = cluster.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (cluster.getName() != null) {
            String name = cluster.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (cluster.getStatus() != null) {
            ClusterStatus status = cluster.getStatus();
            jsonWriter.name("Status");
            ClusterStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (cluster.getEc2InstanceAttributes() != null) {
            Ec2InstanceAttributes ec2InstanceAttributes = cluster.getEc2InstanceAttributes();
            jsonWriter.name("Ec2InstanceAttributes");
            Ec2InstanceAttributesJsonMarshaller.getInstance().marshall(ec2InstanceAttributes,
                    jsonWriter);
        }
        if (cluster.getInstanceCollectionType() != null) {
            String instanceCollectionType = cluster.getInstanceCollectionType();
            jsonWriter.name("InstanceCollectionType");
            jsonWriter.value(instanceCollectionType);
        }
        if (cluster.getLogUri() != null) {
            String logUri = cluster.getLogUri();
            jsonWriter.name("LogUri");
            jsonWriter.value(logUri);
        }
        if (cluster.getRequestedAmiVersion() != null) {
            String requestedAmiVersion = cluster.getRequestedAmiVersion();
            jsonWriter.name("RequestedAmiVersion");
            jsonWriter.value(requestedAmiVersion);
        }
        if (cluster.getRunningAmiVersion() != null) {
            String runningAmiVersion = cluster.getRunningAmiVersion();
            jsonWriter.name("RunningAmiVersion");
            jsonWriter.value(runningAmiVersion);
        }
        if (cluster.getReleaseLabel() != null) {
            String releaseLabel = cluster.getReleaseLabel();
            jsonWriter.name("ReleaseLabel");
            jsonWriter.value(releaseLabel);
        }
        if (cluster.getAutoTerminate() != null) {
            Boolean autoTerminate = cluster.getAutoTerminate();
            jsonWriter.name("AutoTerminate");
            jsonWriter.value(autoTerminate);
        }
        if (cluster.getTerminationProtected() != null) {
            Boolean terminationProtected = cluster.getTerminationProtected();
            jsonWriter.name("TerminationProtected");
            jsonWriter.value(terminationProtected);
        }
        if (cluster.getVisibleToAllUsers() != null) {
            Boolean visibleToAllUsers = cluster.getVisibleToAllUsers();
            jsonWriter.name("VisibleToAllUsers");
            jsonWriter.value(visibleToAllUsers);
        }
        if (cluster.getApplications() != null) {
            java.util.List<Application> applications = cluster.getApplications();
            jsonWriter.name("Applications");
            jsonWriter.beginArray();
            for (Application applicationsItem : applications) {
                if (applicationsItem != null) {
                    ApplicationJsonMarshaller.getInstance().marshall(applicationsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (cluster.getTags() != null) {
            java.util.List<Tag> tags = cluster.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (cluster.getServiceRole() != null) {
            String serviceRole = cluster.getServiceRole();
            jsonWriter.name("ServiceRole");
            jsonWriter.value(serviceRole);
        }
        if (cluster.getNormalizedInstanceHours() != null) {
            Integer normalizedInstanceHours = cluster.getNormalizedInstanceHours();
            jsonWriter.name("NormalizedInstanceHours");
            jsonWriter.value(normalizedInstanceHours);
        }
        if (cluster.getMasterPublicDnsName() != null) {
            String masterPublicDnsName = cluster.getMasterPublicDnsName();
            jsonWriter.name("MasterPublicDnsName");
            jsonWriter.value(masterPublicDnsName);
        }
        if (cluster.getConfigurations() != null) {
            java.util.List<Configuration> configurations = cluster.getConfigurations();
            jsonWriter.name("Configurations");
            jsonWriter.beginArray();
            for (Configuration configurationsItem : configurations) {
                if (configurationsItem != null) {
                    ConfigurationJsonMarshaller.getInstance().marshall(configurationsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (cluster.getSecurityConfiguration() != null) {
            String securityConfiguration = cluster.getSecurityConfiguration();
            jsonWriter.name("SecurityConfiguration");
            jsonWriter.value(securityConfiguration);
        }
        if (cluster.getAutoScalingRole() != null) {
            String autoScalingRole = cluster.getAutoScalingRole();
            jsonWriter.name("AutoScalingRole");
            jsonWriter.value(autoScalingRole);
        }
        if (cluster.getScaleDownBehavior() != null) {
            String scaleDownBehavior = cluster.getScaleDownBehavior();
            jsonWriter.name("ScaleDownBehavior");
            jsonWriter.value(scaleDownBehavior);
        }
        if (cluster.getCustomAmiId() != null) {
            String customAmiId = cluster.getCustomAmiId();
            jsonWriter.name("CustomAmiId");
            jsonWriter.value(customAmiId);
        }
        if (cluster.getEbsRootVolumeSize() != null) {
            Integer ebsRootVolumeSize = cluster.getEbsRootVolumeSize();
            jsonWriter.name("EbsRootVolumeSize");
            jsonWriter.value(ebsRootVolumeSize);
        }
        if (cluster.getRepoUpgradeOnBoot() != null) {
            String repoUpgradeOnBoot = cluster.getRepoUpgradeOnBoot();
            jsonWriter.name("RepoUpgradeOnBoot");
            jsonWriter.value(repoUpgradeOnBoot);
        }
        if (cluster.getKerberosAttributes() != null) {
            KerberosAttributes kerberosAttributes = cluster.getKerberosAttributes();
            jsonWriter.name("KerberosAttributes");
            KerberosAttributesJsonMarshaller.getInstance().marshall(kerberosAttributes, jsonWriter);
        }
        if (cluster.getClusterArn() != null) {
            String clusterArn = cluster.getClusterArn();
            jsonWriter.name("ClusterArn");
            jsonWriter.value(clusterArn);
        }
        if (cluster.getOutpostArn() != null) {
            String outpostArn = cluster.getOutpostArn();
            jsonWriter.name("OutpostArn");
            jsonWriter.value(outpostArn);
        }
        if (cluster.getStepConcurrencyLevel() != null) {
            Integer stepConcurrencyLevel = cluster.getStepConcurrencyLevel();
            jsonWriter.name("StepConcurrencyLevel");
            jsonWriter.value(stepConcurrencyLevel);
        }
        jsonWriter.endObject();
    }

    private static ClusterJsonMarshaller instance;

    public static ClusterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClusterJsonMarshaller();
        return instance;
    }
}
