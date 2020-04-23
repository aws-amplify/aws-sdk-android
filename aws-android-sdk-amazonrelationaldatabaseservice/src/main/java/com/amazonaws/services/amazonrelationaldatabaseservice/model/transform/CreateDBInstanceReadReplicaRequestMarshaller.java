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

package com.amazonaws.services.amazonrelationaldatabaseservice.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for CreateDBInstanceReadReplicaRequest
 */
public class CreateDBInstanceReadReplicaRequestMarshaller implements
        Marshaller<Request<CreateDBInstanceReadReplicaRequest>, CreateDBInstanceReadReplicaRequest> {

    public Request<CreateDBInstanceReadReplicaRequest> marshall(
            CreateDBInstanceReadReplicaRequest createDBInstanceReadReplicaRequest) {
        if (createDBInstanceReadReplicaRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateDBInstanceReadReplicaRequest)");
        }

        Request<CreateDBInstanceReadReplicaRequest> request = new DefaultRequest<CreateDBInstanceReadReplicaRequest>(
                createDBInstanceReadReplicaRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "CreateDBInstanceReadReplica");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (createDBInstanceReadReplicaRequest.getDBInstanceIdentifier() != null) {
            prefix = "DBInstanceIdentifier";
            String dBInstanceIdentifier = createDBInstanceReadReplicaRequest
                    .getDBInstanceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceIdentifier));
        }
        if (createDBInstanceReadReplicaRequest.getSourceDBInstanceIdentifier() != null) {
            prefix = "SourceDBInstanceIdentifier";
            String sourceDBInstanceIdentifier = createDBInstanceReadReplicaRequest
                    .getSourceDBInstanceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(sourceDBInstanceIdentifier));
        }
        if (createDBInstanceReadReplicaRequest.getDBInstanceClass() != null) {
            prefix = "DBInstanceClass";
            String dBInstanceClass = createDBInstanceReadReplicaRequest.getDBInstanceClass();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceClass));
        }
        if (createDBInstanceReadReplicaRequest.getAvailabilityZone() != null) {
            prefix = "AvailabilityZone";
            String availabilityZone = createDBInstanceReadReplicaRequest.getAvailabilityZone();
            request.addParameter(prefix, StringUtils.fromString(availabilityZone));
        }
        if (createDBInstanceReadReplicaRequest.getPort() != null) {
            prefix = "Port";
            Integer port = createDBInstanceReadReplicaRequest.getPort();
            request.addParameter(prefix, StringUtils.fromInteger(port));
        }
        if (createDBInstanceReadReplicaRequest.getMultiAZ() != null) {
            prefix = "MultiAZ";
            Boolean multiAZ = createDBInstanceReadReplicaRequest.getMultiAZ();
            request.addParameter(prefix, StringUtils.fromBoolean(multiAZ));
        }
        if (createDBInstanceReadReplicaRequest.getAutoMinorVersionUpgrade() != null) {
            prefix = "AutoMinorVersionUpgrade";
            Boolean autoMinorVersionUpgrade = createDBInstanceReadReplicaRequest
                    .getAutoMinorVersionUpgrade();
            request.addParameter(prefix, StringUtils.fromBoolean(autoMinorVersionUpgrade));
        }
        if (createDBInstanceReadReplicaRequest.getIops() != null) {
            prefix = "Iops";
            Integer iops = createDBInstanceReadReplicaRequest.getIops();
            request.addParameter(prefix, StringUtils.fromInteger(iops));
        }
        if (createDBInstanceReadReplicaRequest.getOptionGroupName() != null) {
            prefix = "OptionGroupName";
            String optionGroupName = createDBInstanceReadReplicaRequest.getOptionGroupName();
            request.addParameter(prefix, StringUtils.fromString(optionGroupName));
        }
        if (createDBInstanceReadReplicaRequest.getDBParameterGroupName() != null) {
            prefix = "DBParameterGroupName";
            String dBParameterGroupName = createDBInstanceReadReplicaRequest
                    .getDBParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBParameterGroupName));
        }
        if (createDBInstanceReadReplicaRequest.getPubliclyAccessible() != null) {
            prefix = "PubliclyAccessible";
            Boolean publiclyAccessible = createDBInstanceReadReplicaRequest.getPubliclyAccessible();
            request.addParameter(prefix, StringUtils.fromBoolean(publiclyAccessible));
        }
        if (createDBInstanceReadReplicaRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createDBInstanceReadReplicaRequest.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix;
            for (Tag tagsItem : tags) {
                prefix = tagsPrefix + "." + tagsIndex;
                if (tagsItem != null) {
                    TagStaxMarshaller.getInstance().marshall(tagsItem, request, prefix + ".");
                }
                tagsIndex++;
            }
            prefix = tagsPrefix;
        }
        if (createDBInstanceReadReplicaRequest.getDBSubnetGroupName() != null) {
            prefix = "DBSubnetGroupName";
            String dBSubnetGroupName = createDBInstanceReadReplicaRequest.getDBSubnetGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBSubnetGroupName));
        }
        if (createDBInstanceReadReplicaRequest.getVpcSecurityGroupIds() != null) {
            prefix = "VpcSecurityGroupIds";
            java.util.List<String> vpcSecurityGroupIds = createDBInstanceReadReplicaRequest
                    .getVpcSecurityGroupIds();
            int vpcSecurityGroupIdsIndex = 1;
            String vpcSecurityGroupIdsPrefix = prefix;
            for (String vpcSecurityGroupIdsItem : vpcSecurityGroupIds) {
                prefix = vpcSecurityGroupIdsPrefix + "." + vpcSecurityGroupIdsIndex;
                if (vpcSecurityGroupIdsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(vpcSecurityGroupIdsItem));
                }
                vpcSecurityGroupIdsIndex++;
            }
            prefix = vpcSecurityGroupIdsPrefix;
        }
        if (createDBInstanceReadReplicaRequest.getStorageType() != null) {
            prefix = "StorageType";
            String storageType = createDBInstanceReadReplicaRequest.getStorageType();
            request.addParameter(prefix, StringUtils.fromString(storageType));
        }
        if (createDBInstanceReadReplicaRequest.getCopyTagsToSnapshot() != null) {
            prefix = "CopyTagsToSnapshot";
            Boolean copyTagsToSnapshot = createDBInstanceReadReplicaRequest.getCopyTagsToSnapshot();
            request.addParameter(prefix, StringUtils.fromBoolean(copyTagsToSnapshot));
        }
        if (createDBInstanceReadReplicaRequest.getMonitoringInterval() != null) {
            prefix = "MonitoringInterval";
            Integer monitoringInterval = createDBInstanceReadReplicaRequest.getMonitoringInterval();
            request.addParameter(prefix, StringUtils.fromInteger(monitoringInterval));
        }
        if (createDBInstanceReadReplicaRequest.getMonitoringRoleArn() != null) {
            prefix = "MonitoringRoleArn";
            String monitoringRoleArn = createDBInstanceReadReplicaRequest.getMonitoringRoleArn();
            request.addParameter(prefix, StringUtils.fromString(monitoringRoleArn));
        }
        if (createDBInstanceReadReplicaRequest.getKmsKeyId() != null) {
            prefix = "KmsKeyId";
            String kmsKeyId = createDBInstanceReadReplicaRequest.getKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(kmsKeyId));
        }
        if (createDBInstanceReadReplicaRequest.getPreSignedUrl() != null) {
            prefix = "PreSignedUrl";
            String preSignedUrl = createDBInstanceReadReplicaRequest.getPreSignedUrl();
            request.addParameter(prefix, StringUtils.fromString(preSignedUrl));
        }
        if (createDBInstanceReadReplicaRequest.getEnableIAMDatabaseAuthentication() != null) {
            prefix = "EnableIAMDatabaseAuthentication";
            Boolean enableIAMDatabaseAuthentication = createDBInstanceReadReplicaRequest
                    .getEnableIAMDatabaseAuthentication();
            request.addParameter(prefix, StringUtils.fromBoolean(enableIAMDatabaseAuthentication));
        }
        if (createDBInstanceReadReplicaRequest.getEnablePerformanceInsights() != null) {
            prefix = "EnablePerformanceInsights";
            Boolean enablePerformanceInsights = createDBInstanceReadReplicaRequest
                    .getEnablePerformanceInsights();
            request.addParameter(prefix, StringUtils.fromBoolean(enablePerformanceInsights));
        }
        if (createDBInstanceReadReplicaRequest.getPerformanceInsightsKMSKeyId() != null) {
            prefix = "PerformanceInsightsKMSKeyId";
            String performanceInsightsKMSKeyId = createDBInstanceReadReplicaRequest
                    .getPerformanceInsightsKMSKeyId();
            request.addParameter(prefix, StringUtils.fromString(performanceInsightsKMSKeyId));
        }
        if (createDBInstanceReadReplicaRequest.getPerformanceInsightsRetentionPeriod() != null) {
            prefix = "PerformanceInsightsRetentionPeriod";
            Integer performanceInsightsRetentionPeriod = createDBInstanceReadReplicaRequest
                    .getPerformanceInsightsRetentionPeriod();
            request.addParameter(prefix,
                    StringUtils.fromInteger(performanceInsightsRetentionPeriod));
        }
        if (createDBInstanceReadReplicaRequest.getEnableCloudwatchLogsExports() != null) {
            prefix = "EnableCloudwatchLogsExports";
            java.util.List<String> enableCloudwatchLogsExports = createDBInstanceReadReplicaRequest
                    .getEnableCloudwatchLogsExports();
            int enableCloudwatchLogsExportsIndex = 1;
            String enableCloudwatchLogsExportsPrefix = prefix;
            for (String enableCloudwatchLogsExportsItem : enableCloudwatchLogsExports) {
                prefix = enableCloudwatchLogsExportsPrefix + ".member."
                        + enableCloudwatchLogsExportsIndex;
                if (enableCloudwatchLogsExportsItem != null) {
                    request.addParameter(prefix,
                            StringUtils.fromString(enableCloudwatchLogsExportsItem));
                }
                enableCloudwatchLogsExportsIndex++;
            }
            prefix = enableCloudwatchLogsExportsPrefix;
        }
        if (createDBInstanceReadReplicaRequest.getProcessorFeatures() != null) {
            prefix = "ProcessorFeatures";
            java.util.List<ProcessorFeature> processorFeatures = createDBInstanceReadReplicaRequest
                    .getProcessorFeatures();
            int processorFeaturesIndex = 1;
            String processorFeaturesPrefix = prefix;
            for (ProcessorFeature processorFeaturesItem : processorFeatures) {
                prefix = processorFeaturesPrefix + "." + processorFeaturesIndex;
                if (processorFeaturesItem != null) {
                    ProcessorFeatureStaxMarshaller.getInstance().marshall(processorFeaturesItem,
                            request, prefix + ".");
                }
                processorFeaturesIndex++;
            }
            prefix = processorFeaturesPrefix;
        }
        if (createDBInstanceReadReplicaRequest.getUseDefaultProcessorFeatures() != null) {
            prefix = "UseDefaultProcessorFeatures";
            Boolean useDefaultProcessorFeatures = createDBInstanceReadReplicaRequest
                    .getUseDefaultProcessorFeatures();
            request.addParameter(prefix, StringUtils.fromBoolean(useDefaultProcessorFeatures));
        }
        if (createDBInstanceReadReplicaRequest.getDeletionProtection() != null) {
            prefix = "DeletionProtection";
            Boolean deletionProtection = createDBInstanceReadReplicaRequest.getDeletionProtection();
            request.addParameter(prefix, StringUtils.fromBoolean(deletionProtection));
        }
        if (createDBInstanceReadReplicaRequest.getDomain() != null) {
            prefix = "Domain";
            String domain = createDBInstanceReadReplicaRequest.getDomain();
            request.addParameter(prefix, StringUtils.fromString(domain));
        }
        if (createDBInstanceReadReplicaRequest.getDomainIAMRoleName() != null) {
            prefix = "DomainIAMRoleName";
            String domainIAMRoleName = createDBInstanceReadReplicaRequest.getDomainIAMRoleName();
            request.addParameter(prefix, StringUtils.fromString(domainIAMRoleName));
        }

        return request;
    }
}
