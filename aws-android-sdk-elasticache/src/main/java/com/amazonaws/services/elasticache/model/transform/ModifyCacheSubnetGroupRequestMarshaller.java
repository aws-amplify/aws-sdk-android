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
 * StAX request marshaller for ModifyCacheSubnetGroupRequest
 */
public class ModifyCacheSubnetGroupRequestMarshaller implements
        Marshaller<Request<ModifyCacheSubnetGroupRequest>, ModifyCacheSubnetGroupRequest> {

    public Request<ModifyCacheSubnetGroupRequest> marshall(
            ModifyCacheSubnetGroupRequest modifyCacheSubnetGroupRequest) {
        if (modifyCacheSubnetGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyCacheSubnetGroupRequest)");
        }

        Request<ModifyCacheSubnetGroupRequest> request = new DefaultRequest<ModifyCacheSubnetGroupRequest>(
                modifyCacheSubnetGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "ModifyCacheSubnetGroup");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (modifyCacheSubnetGroupRequest.getCacheSubnetGroupName() != null) {
            prefix = "CacheSubnetGroupName";
            String cacheSubnetGroupName = modifyCacheSubnetGroupRequest.getCacheSubnetGroupName();
            request.addParameter(prefix, StringUtils.fromString(cacheSubnetGroupName));
        }
        if (modifyCacheSubnetGroupRequest.getCacheSubnetGroupDescription() != null) {
            prefix = "CacheSubnetGroupDescription";
            String cacheSubnetGroupDescription = modifyCacheSubnetGroupRequest
                    .getCacheSubnetGroupDescription();
            request.addParameter(prefix, StringUtils.fromString(cacheSubnetGroupDescription));
        }
        if (modifyCacheSubnetGroupRequest.getSubnetIds() != null) {
            prefix = "SubnetIds";
            java.util.List<String> subnetIds = modifyCacheSubnetGroupRequest.getSubnetIds();
            int subnetIdsIndex = 1;
            String subnetIdsPrefix = prefix;
            for (String subnetIdsItem : subnetIds) {
                prefix = subnetIdsPrefix + "." + subnetIdsIndex;
                if (subnetIdsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(subnetIdsItem));
                }
                subnetIdsIndex++;
            }
            prefix = subnetIdsPrefix;
        }

        return request;
    }
}
