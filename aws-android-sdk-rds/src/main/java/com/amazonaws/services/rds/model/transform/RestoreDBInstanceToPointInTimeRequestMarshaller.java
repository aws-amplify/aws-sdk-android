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
 * StAX request marshaller for RestoreDBInstanceToPointInTimeRequest
 */
public class RestoreDBInstanceToPointInTimeRequestMarshaller
        implements
        Marshaller<Request<RestoreDBInstanceToPointInTimeRequest>, RestoreDBInstanceToPointInTimeRequest> {

    public Request<RestoreDBInstanceToPointInTimeRequest> marshall(
            RestoreDBInstanceToPointInTimeRequest restoreDBInstanceToPointInTimeRequest) {
        if (restoreDBInstanceToPointInTimeRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RestoreDBInstanceToPointInTimeRequest)");
        }

        Request<RestoreDBInstanceToPointInTimeRequest> request = new DefaultRequest<RestoreDBInstanceToPointInTimeRequest>(
                restoreDBInstanceToPointInTimeRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "RestoreDBInstanceToPointInTime");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (restoreDBInstanceToPointInTimeRequest.getSourceDBInstanceIdentifier() != null) {
            prefix = "SourceDBInstanceIdentifier";
            String sourceDBInstanceIdentifier = restoreDBInstanceToPointInTimeRequest
                    .getSourceDBInstanceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(sourceDBInstanceIdentifier));
        }
        if (restoreDBInstanceToPointInTimeRequest.getTargetDBInstanceIdentifier() != null) {
            prefix = "TargetDBInstanceIdentifier";
            String targetDBInstanceIdentifier = restoreDBInstanceToPointInTimeRequest
                    .getTargetDBInstanceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(targetDBInstanceIdentifier));
        }
        if (restoreDBInstanceToPointInTimeRequest.getRestoreTime() != null) {
            prefix = "RestoreTime";
            java.util.Date restoreTime = restoreDBInstanceToPointInTimeRequest.getRestoreTime();
            request.addParameter(prefix, StringUtils.fromDate(restoreTime));
        }
        if (restoreDBInstanceToPointInTimeRequest.getUseLatestRestorableTime() != null) {
            prefix = "UseLatestRestorableTime";
            Boolean useLatestRestorableTime = restoreDBInstanceToPointInTimeRequest
                    .getUseLatestRestorableTime();
            request.addParameter(prefix, StringUtils.fromBoolean(useLatestRestorableTime));
        }
        if (restoreDBInstanceToPointInTimeRequest.getDBInstanceClass() != null) {
            prefix = "DBInstanceClass";
            String dBInstanceClass = restoreDBInstanceToPointInTimeRequest.getDBInstanceClass();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceClass));
        }
        if (restoreDBInstanceToPointInTimeRequest.getPort() != null) {
            prefix = "Port";
            Integer port = restoreDBInstanceToPointInTimeRequest.getPort();
            request.addParameter(prefix, StringUtils.fromInteger(port));
        }
        if (restoreDBInstanceToPointInTimeRequest.getAvailabilityZone() != null) {
            prefix = "AvailabilityZone";
            String availabilityZone = restoreDBInstanceToPointInTimeRequest.getAvailabilityZone();
            request.addParameter(prefix, StringUtils.fromString(availabilityZone));
        }
        if (restoreDBInstanceToPointInTimeRequest.getDBSubnetGroupName() != null) {
            prefix = "DBSubnetGroupName";
            String dBSubnetGroupName = restoreDBInstanceToPointInTimeRequest.getDBSubnetGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBSubnetGroupName));
        }
        if (restoreDBInstanceToPointInTimeRequest.getMultiAZ() != null) {
            prefix = "MultiAZ";
            Boolean multiAZ = restoreDBInstanceToPointInTimeRequest.getMultiAZ();
            request.addParameter(prefix, StringUtils.fromBoolean(multiAZ));
        }
        if (restoreDBInstanceToPointInTimeRequest.getPubliclyAccessible() != null) {
            prefix = "PubliclyAccessible";
            Boolean publiclyAccessible = restoreDBInstanceToPointInTimeRequest
                    .getPubliclyAccessible();
            request.addParameter(prefix, StringUtils.fromBoolean(publiclyAccessible));
        }
        if (restoreDBInstanceToPointInTimeRequest.getAutoMinorVersionUpgrade() != null) {
            prefix = "AutoMinorVersionUpgrade";
            Boolean autoMinorVersionUpgrade = restoreDBInstanceToPointInTimeRequest
                    .getAutoMinorVersionUpgrade();
            request.addParameter(prefix, StringUtils.fromBoolean(autoMinorVersionUpgrade));
        }
        if (restoreDBInstanceToPointInTimeRequest.getLicenseModel() != null) {
            prefix = "LicenseModel";
            String licenseModel = restoreDBInstanceToPointInTimeRequest.getLicenseModel();
            request.addParameter(prefix, StringUtils.fromString(licenseModel));
        }
        if (restoreDBInstanceToPointInTimeRequest.getDBName() != null) {
            prefix = "DBName";
            String dBName = restoreDBInstanceToPointInTimeRequest.getDBName();
            request.addParameter(prefix, StringUtils.fromString(dBName));
        }
        if (restoreDBInstanceToPointInTimeRequest.getEngine() != null) {
            prefix = "Engine";
            String engine = restoreDBInstanceToPointInTimeRequest.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (restoreDBInstanceToPointInTimeRequest.getIops() != null) {
            prefix = "Iops";
            Integer iops = restoreDBInstanceToPointInTimeRequest.getIops();
            request.addParameter(prefix, StringUtils.fromInteger(iops));
        }
        if (restoreDBInstanceToPointInTimeRequest.getOptionGroupName() != null) {
            prefix = "OptionGroupName";
            String optionGroupName = restoreDBInstanceToPointInTimeRequest.getOptionGroupName();
            request.addParameter(prefix, StringUtils.fromString(optionGroupName));
        }
        if (restoreDBInstanceToPointInTimeRequest.getCopyTagsToSnapshot() != null) {
            prefix = "CopyTagsToSnapshot";
            Boolean copyTagsToSnapshot = restoreDBInstanceToPointInTimeRequest
                    .getCopyTagsToSnapshot();
            request.addParameter(prefix, StringUtils.fromBoolean(copyTagsToSnapshot));
        }
        if (restoreDBInstanceToPointInTimeRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = restoreDBInstanceToPointInTimeRequest.getTags();
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
        if (restoreDBInstanceToPointInTimeRequest.getStorageType() != null) {
            prefix = "StorageType";
            String storageType = restoreDBInstanceToPointInTimeRequest.getStorageType();
            request.addParameter(prefix, StringUtils.fromString(storageType));
        }
        if (restoreDBInstanceToPointInTimeRequest.getTdeCredentialArn() != null) {
            prefix = "TdeCredentialArn";
            String tdeCredentialArn = restoreDBInstanceToPointInTimeRequest.getTdeCredentialArn();
            request.addParameter(prefix, StringUtils.fromString(tdeCredentialArn));
        }
        if (restoreDBInstanceToPointInTimeRequest.getTdeCredentialPassword() != null) {
            prefix = "TdeCredentialPassword";
            String tdeCredentialPassword = restoreDBInstanceToPointInTimeRequest
                    .getTdeCredentialPassword();
            request.addParameter(prefix, StringUtils.fromString(tdeCredentialPassword));
        }
        if (restoreDBInstanceToPointInTimeRequest.getVpcSecurityGroupIds() != null) {
            prefix = "VpcSecurityGroupIds";
            java.util.List<String> vpcSecurityGroupIds = restoreDBInstanceToPointInTimeRequest
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
        if (restoreDBInstanceToPointInTimeRequest.getDomain() != null) {
            prefix = "Domain";
            String domain = restoreDBInstanceToPointInTimeRequest.getDomain();
            request.addParameter(prefix, StringUtils.fromString(domain));
        }
        if (restoreDBInstanceToPointInTimeRequest.getDomainIAMRoleName() != null) {
            prefix = "DomainIAMRoleName";
            String domainIAMRoleName = restoreDBInstanceToPointInTimeRequest.getDomainIAMRoleName();
            request.addParameter(prefix, StringUtils.fromString(domainIAMRoleName));
        }
        if (restoreDBInstanceToPointInTimeRequest.getEnableIAMDatabaseAuthentication() != null) {
            prefix = "EnableIAMDatabaseAuthentication";
            Boolean enableIAMDatabaseAuthentication = restoreDBInstanceToPointInTimeRequest
                    .getEnableIAMDatabaseAuthentication();
            request.addParameter(prefix, StringUtils.fromBoolean(enableIAMDatabaseAuthentication));
        }
        if (restoreDBInstanceToPointInTimeRequest.getEnableCloudwatchLogsExports() != null) {
            prefix = "EnableCloudwatchLogsExports";
            java.util.List<String> enableCloudwatchLogsExports = restoreDBInstanceToPointInTimeRequest
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
        if (restoreDBInstanceToPointInTimeRequest.getProcessorFeatures() != null) {
            prefix = "ProcessorFeatures";
            java.util.List<ProcessorFeature> processorFeatures = restoreDBInstanceToPointInTimeRequest
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
        if (restoreDBInstanceToPointInTimeRequest.getUseDefaultProcessorFeatures() != null) {
            prefix = "UseDefaultProcessorFeatures";
            Boolean useDefaultProcessorFeatures = restoreDBInstanceToPointInTimeRequest
                    .getUseDefaultProcessorFeatures();
            request.addParameter(prefix, StringUtils.fromBoolean(useDefaultProcessorFeatures));
        }
        if (restoreDBInstanceToPointInTimeRequest.getDBParameterGroupName() != null) {
            prefix = "DBParameterGroupName";
            String dBParameterGroupName = restoreDBInstanceToPointInTimeRequest
                    .getDBParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBParameterGroupName));
        }
        if (restoreDBInstanceToPointInTimeRequest.getDeletionProtection() != null) {
            prefix = "DeletionProtection";
            Boolean deletionProtection = restoreDBInstanceToPointInTimeRequest
                    .getDeletionProtection();
            request.addParameter(prefix, StringUtils.fromBoolean(deletionProtection));
        }
        if (restoreDBInstanceToPointInTimeRequest.getSourceDbiResourceId() != null) {
            prefix = "SourceDbiResourceId";
            String sourceDbiResourceId = restoreDBInstanceToPointInTimeRequest
                    .getSourceDbiResourceId();
            request.addParameter(prefix, StringUtils.fromString(sourceDbiResourceId));
        }

        return request;
    }
}
