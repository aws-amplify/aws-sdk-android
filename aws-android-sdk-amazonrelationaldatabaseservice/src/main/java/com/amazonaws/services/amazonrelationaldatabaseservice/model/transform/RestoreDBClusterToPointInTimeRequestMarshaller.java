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
 * StAX request marshaller for RestoreDBClusterToPointInTimeRequest
 */
public class RestoreDBClusterToPointInTimeRequestMarshaller
        implements
        Marshaller<Request<RestoreDBClusterToPointInTimeRequest>, RestoreDBClusterToPointInTimeRequest> {

    public Request<RestoreDBClusterToPointInTimeRequest> marshall(
            RestoreDBClusterToPointInTimeRequest restoreDBClusterToPointInTimeRequest) {
        if (restoreDBClusterToPointInTimeRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RestoreDBClusterToPointInTimeRequest)");
        }

        Request<RestoreDBClusterToPointInTimeRequest> request = new DefaultRequest<RestoreDBClusterToPointInTimeRequest>(
                restoreDBClusterToPointInTimeRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "RestoreDBClusterToPointInTime");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (restoreDBClusterToPointInTimeRequest.getDBClusterIdentifier() != null) {
            prefix = "DBClusterIdentifier";
            String dBClusterIdentifier = restoreDBClusterToPointInTimeRequest
                    .getDBClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBClusterIdentifier));
        }
        if (restoreDBClusterToPointInTimeRequest.getRestoreType() != null) {
            prefix = "RestoreType";
            String restoreType = restoreDBClusterToPointInTimeRequest.getRestoreType();
            request.addParameter(prefix, StringUtils.fromString(restoreType));
        }
        if (restoreDBClusterToPointInTimeRequest.getSourceDBClusterIdentifier() != null) {
            prefix = "SourceDBClusterIdentifier";
            String sourceDBClusterIdentifier = restoreDBClusterToPointInTimeRequest
                    .getSourceDBClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(sourceDBClusterIdentifier));
        }
        if (restoreDBClusterToPointInTimeRequest.getRestoreToTime() != null) {
            prefix = "RestoreToTime";
            java.util.Date restoreToTime = restoreDBClusterToPointInTimeRequest.getRestoreToTime();
            request.addParameter(prefix, StringUtils.fromDate(restoreToTime));
        }
        if (restoreDBClusterToPointInTimeRequest.getUseLatestRestorableTime() != null) {
            prefix = "UseLatestRestorableTime";
            Boolean useLatestRestorableTime = restoreDBClusterToPointInTimeRequest
                    .getUseLatestRestorableTime();
            request.addParameter(prefix, StringUtils.fromBoolean(useLatestRestorableTime));
        }
        if (restoreDBClusterToPointInTimeRequest.getPort() != null) {
            prefix = "Port";
            Integer port = restoreDBClusterToPointInTimeRequest.getPort();
            request.addParameter(prefix, StringUtils.fromInteger(port));
        }
        if (restoreDBClusterToPointInTimeRequest.getDBSubnetGroupName() != null) {
            prefix = "DBSubnetGroupName";
            String dBSubnetGroupName = restoreDBClusterToPointInTimeRequest.getDBSubnetGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBSubnetGroupName));
        }
        if (restoreDBClusterToPointInTimeRequest.getOptionGroupName() != null) {
            prefix = "OptionGroupName";
            String optionGroupName = restoreDBClusterToPointInTimeRequest.getOptionGroupName();
            request.addParameter(prefix, StringUtils.fromString(optionGroupName));
        }
        if (restoreDBClusterToPointInTimeRequest.getVpcSecurityGroupIds() != null) {
            prefix = "VpcSecurityGroupIds";
            java.util.List<String> vpcSecurityGroupIds = restoreDBClusterToPointInTimeRequest
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
        if (restoreDBClusterToPointInTimeRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = restoreDBClusterToPointInTimeRequest.getTags();
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
        if (restoreDBClusterToPointInTimeRequest.getKmsKeyId() != null) {
            prefix = "KmsKeyId";
            String kmsKeyId = restoreDBClusterToPointInTimeRequest.getKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(kmsKeyId));
        }
        if (restoreDBClusterToPointInTimeRequest.getEnableIAMDatabaseAuthentication() != null) {
            prefix = "EnableIAMDatabaseAuthentication";
            Boolean enableIAMDatabaseAuthentication = restoreDBClusterToPointInTimeRequest
                    .getEnableIAMDatabaseAuthentication();
            request.addParameter(prefix, StringUtils.fromBoolean(enableIAMDatabaseAuthentication));
        }
        if (restoreDBClusterToPointInTimeRequest.getBacktrackWindow() != null) {
            prefix = "BacktrackWindow";
            Long backtrackWindow = restoreDBClusterToPointInTimeRequest.getBacktrackWindow();
            request.addParameter(prefix, StringUtils.fromLong(backtrackWindow));
        }
        if (restoreDBClusterToPointInTimeRequest.getEnableCloudwatchLogsExports() != null) {
            prefix = "EnableCloudwatchLogsExports";
            java.util.List<String> enableCloudwatchLogsExports = restoreDBClusterToPointInTimeRequest
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
        if (restoreDBClusterToPointInTimeRequest.getDBClusterParameterGroupName() != null) {
            prefix = "DBClusterParameterGroupName";
            String dBClusterParameterGroupName = restoreDBClusterToPointInTimeRequest
                    .getDBClusterParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBClusterParameterGroupName));
        }
        if (restoreDBClusterToPointInTimeRequest.getDeletionProtection() != null) {
            prefix = "DeletionProtection";
            Boolean deletionProtection = restoreDBClusterToPointInTimeRequest
                    .getDeletionProtection();
            request.addParameter(prefix, StringUtils.fromBoolean(deletionProtection));
        }
        if (restoreDBClusterToPointInTimeRequest.getCopyTagsToSnapshot() != null) {
            prefix = "CopyTagsToSnapshot";
            Boolean copyTagsToSnapshot = restoreDBClusterToPointInTimeRequest
                    .getCopyTagsToSnapshot();
            request.addParameter(prefix, StringUtils.fromBoolean(copyTagsToSnapshot));
        }
        if (restoreDBClusterToPointInTimeRequest.getDomain() != null) {
            prefix = "Domain";
            String domain = restoreDBClusterToPointInTimeRequest.getDomain();
            request.addParameter(prefix, StringUtils.fromString(domain));
        }
        if (restoreDBClusterToPointInTimeRequest.getDomainIAMRoleName() != null) {
            prefix = "DomainIAMRoleName";
            String domainIAMRoleName = restoreDBClusterToPointInTimeRequest.getDomainIAMRoleName();
            request.addParameter(prefix, StringUtils.fromString(domainIAMRoleName));
        }

        return request;
    }
}
