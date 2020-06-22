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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for RestoreDBInstanceFromDBSnapshotRequest
 */
public class RestoreDBInstanceFromDBSnapshotRequestMarshaller
        implements
        Marshaller<Request<RestoreDBInstanceFromDBSnapshotRequest>, RestoreDBInstanceFromDBSnapshotRequest> {

    public Request<RestoreDBInstanceFromDBSnapshotRequest> marshall(
            RestoreDBInstanceFromDBSnapshotRequest restoreDBInstanceFromDBSnapshotRequest) {
        if (restoreDBInstanceFromDBSnapshotRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RestoreDBInstanceFromDBSnapshotRequest)");
        }

        Request<RestoreDBInstanceFromDBSnapshotRequest> request = new DefaultRequest<RestoreDBInstanceFromDBSnapshotRequest>(
                restoreDBInstanceFromDBSnapshotRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "RestoreDBInstanceFromDBSnapshot");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (restoreDBInstanceFromDBSnapshotRequest.getDBInstanceIdentifier() != null) {
            prefix = "DBInstanceIdentifier";
            String dBInstanceIdentifier = restoreDBInstanceFromDBSnapshotRequest
                    .getDBInstanceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceIdentifier));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getDBSnapshotIdentifier() != null) {
            prefix = "DBSnapshotIdentifier";
            String dBSnapshotIdentifier = restoreDBInstanceFromDBSnapshotRequest
                    .getDBSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBSnapshotIdentifier));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getDBInstanceClass() != null) {
            prefix = "DBInstanceClass";
            String dBInstanceClass = restoreDBInstanceFromDBSnapshotRequest.getDBInstanceClass();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceClass));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getPort() != null) {
            prefix = "Port";
            Integer port = restoreDBInstanceFromDBSnapshotRequest.getPort();
            request.addParameter(prefix, StringUtils.fromInteger(port));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getAvailabilityZone() != null) {
            prefix = "AvailabilityZone";
            String availabilityZone = restoreDBInstanceFromDBSnapshotRequest.getAvailabilityZone();
            request.addParameter(prefix, StringUtils.fromString(availabilityZone));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getDBSubnetGroupName() != null) {
            prefix = "DBSubnetGroupName";
            String dBSubnetGroupName = restoreDBInstanceFromDBSnapshotRequest
                    .getDBSubnetGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBSubnetGroupName));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getMultiAZ() != null) {
            prefix = "MultiAZ";
            Boolean multiAZ = restoreDBInstanceFromDBSnapshotRequest.getMultiAZ();
            request.addParameter(prefix, StringUtils.fromBoolean(multiAZ));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getPubliclyAccessible() != null) {
            prefix = "PubliclyAccessible";
            Boolean publiclyAccessible = restoreDBInstanceFromDBSnapshotRequest
                    .getPubliclyAccessible();
            request.addParameter(prefix, StringUtils.fromBoolean(publiclyAccessible));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getAutoMinorVersionUpgrade() != null) {
            prefix = "AutoMinorVersionUpgrade";
            Boolean autoMinorVersionUpgrade = restoreDBInstanceFromDBSnapshotRequest
                    .getAutoMinorVersionUpgrade();
            request.addParameter(prefix, StringUtils.fromBoolean(autoMinorVersionUpgrade));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getLicenseModel() != null) {
            prefix = "LicenseModel";
            String licenseModel = restoreDBInstanceFromDBSnapshotRequest.getLicenseModel();
            request.addParameter(prefix, StringUtils.fromString(licenseModel));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getDBName() != null) {
            prefix = "DBName";
            String dBName = restoreDBInstanceFromDBSnapshotRequest.getDBName();
            request.addParameter(prefix, StringUtils.fromString(dBName));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getEngine() != null) {
            prefix = "Engine";
            String engine = restoreDBInstanceFromDBSnapshotRequest.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getIops() != null) {
            prefix = "Iops";
            Integer iops = restoreDBInstanceFromDBSnapshotRequest.getIops();
            request.addParameter(prefix, StringUtils.fromInteger(iops));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getOptionGroupName() != null) {
            prefix = "OptionGroupName";
            String optionGroupName = restoreDBInstanceFromDBSnapshotRequest.getOptionGroupName();
            request.addParameter(prefix, StringUtils.fromString(optionGroupName));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = restoreDBInstanceFromDBSnapshotRequest.getTags();
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
        if (restoreDBInstanceFromDBSnapshotRequest.getStorageType() != null) {
            prefix = "StorageType";
            String storageType = restoreDBInstanceFromDBSnapshotRequest.getStorageType();
            request.addParameter(prefix, StringUtils.fromString(storageType));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getTdeCredentialArn() != null) {
            prefix = "TdeCredentialArn";
            String tdeCredentialArn = restoreDBInstanceFromDBSnapshotRequest.getTdeCredentialArn();
            request.addParameter(prefix, StringUtils.fromString(tdeCredentialArn));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getTdeCredentialPassword() != null) {
            prefix = "TdeCredentialPassword";
            String tdeCredentialPassword = restoreDBInstanceFromDBSnapshotRequest
                    .getTdeCredentialPassword();
            request.addParameter(prefix, StringUtils.fromString(tdeCredentialPassword));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getVpcSecurityGroupIds() != null) {
            prefix = "VpcSecurityGroupIds";
            java.util.List<String> vpcSecurityGroupIds = restoreDBInstanceFromDBSnapshotRequest
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
        if (restoreDBInstanceFromDBSnapshotRequest.getDomain() != null) {
            prefix = "Domain";
            String domain = restoreDBInstanceFromDBSnapshotRequest.getDomain();
            request.addParameter(prefix, StringUtils.fromString(domain));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getCopyTagsToSnapshot() != null) {
            prefix = "CopyTagsToSnapshot";
            Boolean copyTagsToSnapshot = restoreDBInstanceFromDBSnapshotRequest
                    .getCopyTagsToSnapshot();
            request.addParameter(prefix, StringUtils.fromBoolean(copyTagsToSnapshot));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getDomainIAMRoleName() != null) {
            prefix = "DomainIAMRoleName";
            String domainIAMRoleName = restoreDBInstanceFromDBSnapshotRequest
                    .getDomainIAMRoleName();
            request.addParameter(prefix, StringUtils.fromString(domainIAMRoleName));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getEnableIAMDatabaseAuthentication() != null) {
            prefix = "EnableIAMDatabaseAuthentication";
            Boolean enableIAMDatabaseAuthentication = restoreDBInstanceFromDBSnapshotRequest
                    .getEnableIAMDatabaseAuthentication();
            request.addParameter(prefix, StringUtils.fromBoolean(enableIAMDatabaseAuthentication));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getEnableCloudwatchLogsExports() != null) {
            prefix = "EnableCloudwatchLogsExports";
            java.util.List<String> enableCloudwatchLogsExports = restoreDBInstanceFromDBSnapshotRequest
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
        if (restoreDBInstanceFromDBSnapshotRequest.getProcessorFeatures() != null) {
            prefix = "ProcessorFeatures";
            java.util.List<ProcessorFeature> processorFeatures = restoreDBInstanceFromDBSnapshotRequest
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
        if (restoreDBInstanceFromDBSnapshotRequest.getUseDefaultProcessorFeatures() != null) {
            prefix = "UseDefaultProcessorFeatures";
            Boolean useDefaultProcessorFeatures = restoreDBInstanceFromDBSnapshotRequest
                    .getUseDefaultProcessorFeatures();
            request.addParameter(prefix, StringUtils.fromBoolean(useDefaultProcessorFeatures));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getDBParameterGroupName() != null) {
            prefix = "DBParameterGroupName";
            String dBParameterGroupName = restoreDBInstanceFromDBSnapshotRequest
                    .getDBParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBParameterGroupName));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getDeletionProtection() != null) {
            prefix = "DeletionProtection";
            Boolean deletionProtection = restoreDBInstanceFromDBSnapshotRequest
                    .getDeletionProtection();
            request.addParameter(prefix, StringUtils.fromBoolean(deletionProtection));
        }

        return request;
    }
}
