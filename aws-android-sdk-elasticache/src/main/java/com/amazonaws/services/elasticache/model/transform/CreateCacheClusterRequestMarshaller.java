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

package com.amazonaws.services.elasticache.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for CreateCacheClusterRequest
 */
public class CreateCacheClusterRequestMarshaller implements
        Marshaller<Request<CreateCacheClusterRequest>, CreateCacheClusterRequest> {

    public Request<CreateCacheClusterRequest> marshall(
            CreateCacheClusterRequest createCacheClusterRequest) {
        if (createCacheClusterRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateCacheClusterRequest)");
        }

        Request<CreateCacheClusterRequest> request = new DefaultRequest<CreateCacheClusterRequest>(
                createCacheClusterRequest, "AmazonElastiCache");
        request.addParameter("Action", "CreateCacheCluster");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (createCacheClusterRequest.getCacheClusterId() != null) {
            prefix = "CacheClusterId";
            String cacheClusterId = createCacheClusterRequest.getCacheClusterId();
            request.addParameter(prefix, StringUtils.fromString(cacheClusterId));
        }
        if (createCacheClusterRequest.getReplicationGroupId() != null) {
            prefix = "ReplicationGroupId";
            String replicationGroupId = createCacheClusterRequest.getReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(replicationGroupId));
        }
        if (createCacheClusterRequest.getAZMode() != null) {
            prefix = "AZMode";
            String aZMode = createCacheClusterRequest.getAZMode();
            request.addParameter(prefix, StringUtils.fromString(aZMode));
        }
        if (createCacheClusterRequest.getPreferredAvailabilityZone() != null) {
            prefix = "PreferredAvailabilityZone";
            String preferredAvailabilityZone = createCacheClusterRequest
                    .getPreferredAvailabilityZone();
            request.addParameter(prefix, StringUtils.fromString(preferredAvailabilityZone));
        }
        if (createCacheClusterRequest.getPreferredAvailabilityZones() != null) {
            prefix = "PreferredAvailabilityZones";
            java.util.List<String> preferredAvailabilityZones = createCacheClusterRequest
                    .getPreferredAvailabilityZones();
            int preferredAvailabilityZonesIndex = 1;
            String preferredAvailabilityZonesPrefix = prefix;
            for (String preferredAvailabilityZonesItem : preferredAvailabilityZones) {
                prefix = preferredAvailabilityZonesPrefix + "." + preferredAvailabilityZonesIndex;
                if (preferredAvailabilityZonesItem != null) {
                    request.addParameter(prefix,
                            StringUtils.fromString(preferredAvailabilityZonesItem));
                }
                preferredAvailabilityZonesIndex++;
            }
            prefix = preferredAvailabilityZonesPrefix;
        }
        if (createCacheClusterRequest.getNumCacheNodes() != null) {
            prefix = "NumCacheNodes";
            Integer numCacheNodes = createCacheClusterRequest.getNumCacheNodes();
            request.addParameter(prefix, StringUtils.fromInteger(numCacheNodes));
        }
        if (createCacheClusterRequest.getCacheNodeType() != null) {
            prefix = "CacheNodeType";
            String cacheNodeType = createCacheClusterRequest.getCacheNodeType();
            request.addParameter(prefix, StringUtils.fromString(cacheNodeType));
        }
        if (createCacheClusterRequest.getEngine() != null) {
            prefix = "Engine";
            String engine = createCacheClusterRequest.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (createCacheClusterRequest.getEngineVersion() != null) {
            prefix = "EngineVersion";
            String engineVersion = createCacheClusterRequest.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (createCacheClusterRequest.getCacheParameterGroupName() != null) {
            prefix = "CacheParameterGroupName";
            String cacheParameterGroupName = createCacheClusterRequest.getCacheParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(cacheParameterGroupName));
        }
        if (createCacheClusterRequest.getCacheSubnetGroupName() != null) {
            prefix = "CacheSubnetGroupName";
            String cacheSubnetGroupName = createCacheClusterRequest.getCacheSubnetGroupName();
            request.addParameter(prefix, StringUtils.fromString(cacheSubnetGroupName));
        }
        if (createCacheClusterRequest.getCacheSecurityGroupNames() != null) {
            prefix = "CacheSecurityGroupNames";
            java.util.List<String> cacheSecurityGroupNames = createCacheClusterRequest
                    .getCacheSecurityGroupNames();
            int cacheSecurityGroupNamesIndex = 1;
            String cacheSecurityGroupNamesPrefix = prefix;
            for (String cacheSecurityGroupNamesItem : cacheSecurityGroupNames) {
                prefix = cacheSecurityGroupNamesPrefix + "." + cacheSecurityGroupNamesIndex;
                if (cacheSecurityGroupNamesItem != null) {
                    request.addParameter(prefix,
                            StringUtils.fromString(cacheSecurityGroupNamesItem));
                }
                cacheSecurityGroupNamesIndex++;
            }
            prefix = cacheSecurityGroupNamesPrefix;
        }
        if (createCacheClusterRequest.getSecurityGroupIds() != null) {
            prefix = "SecurityGroupIds";
            java.util.List<String> securityGroupIds = createCacheClusterRequest
                    .getSecurityGroupIds();
            int securityGroupIdsIndex = 1;
            String securityGroupIdsPrefix = prefix;
            for (String securityGroupIdsItem : securityGroupIds) {
                prefix = securityGroupIdsPrefix + "." + securityGroupIdsIndex;
                if (securityGroupIdsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(securityGroupIdsItem));
                }
                securityGroupIdsIndex++;
            }
            prefix = securityGroupIdsPrefix;
        }
        if (createCacheClusterRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createCacheClusterRequest.getTags();
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
        if (createCacheClusterRequest.getSnapshotArns() != null) {
            prefix = "SnapshotArns";
            java.util.List<String> snapshotArns = createCacheClusterRequest.getSnapshotArns();
            int snapshotArnsIndex = 1;
            String snapshotArnsPrefix = prefix;
            for (String snapshotArnsItem : snapshotArns) {
                prefix = snapshotArnsPrefix + "." + snapshotArnsIndex;
                if (snapshotArnsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(snapshotArnsItem));
                }
                snapshotArnsIndex++;
            }
            prefix = snapshotArnsPrefix;
        }
        if (createCacheClusterRequest.getSnapshotName() != null) {
            prefix = "SnapshotName";
            String snapshotName = createCacheClusterRequest.getSnapshotName();
            request.addParameter(prefix, StringUtils.fromString(snapshotName));
        }
        if (createCacheClusterRequest.getPreferredMaintenanceWindow() != null) {
            prefix = "PreferredMaintenanceWindow";
            String preferredMaintenanceWindow = createCacheClusterRequest
                    .getPreferredMaintenanceWindow();
            request.addParameter(prefix, StringUtils.fromString(preferredMaintenanceWindow));
        }
        if (createCacheClusterRequest.getPort() != null) {
            prefix = "Port";
            Integer port = createCacheClusterRequest.getPort();
            request.addParameter(prefix, StringUtils.fromInteger(port));
        }
        if (createCacheClusterRequest.getNotificationTopicArn() != null) {
            prefix = "NotificationTopicArn";
            String notificationTopicArn = createCacheClusterRequest.getNotificationTopicArn();
            request.addParameter(prefix, StringUtils.fromString(notificationTopicArn));
        }
        if (createCacheClusterRequest.getAutoMinorVersionUpgrade() != null) {
            prefix = "AutoMinorVersionUpgrade";
            Boolean autoMinorVersionUpgrade = createCacheClusterRequest
                    .getAutoMinorVersionUpgrade();
            request.addParameter(prefix, StringUtils.fromBoolean(autoMinorVersionUpgrade));
        }
        if (createCacheClusterRequest.getSnapshotRetentionLimit() != null) {
            prefix = "SnapshotRetentionLimit";
            Integer snapshotRetentionLimit = createCacheClusterRequest.getSnapshotRetentionLimit();
            request.addParameter(prefix, StringUtils.fromInteger(snapshotRetentionLimit));
        }
        if (createCacheClusterRequest.getSnapshotWindow() != null) {
            prefix = "SnapshotWindow";
            String snapshotWindow = createCacheClusterRequest.getSnapshotWindow();
            request.addParameter(prefix, StringUtils.fromString(snapshotWindow));
        }
        if (createCacheClusterRequest.getAuthToken() != null) {
            prefix = "AuthToken";
            String authToken = createCacheClusterRequest.getAuthToken();
            request.addParameter(prefix, StringUtils.fromString(authToken));
        }

        return request;
    }
}
