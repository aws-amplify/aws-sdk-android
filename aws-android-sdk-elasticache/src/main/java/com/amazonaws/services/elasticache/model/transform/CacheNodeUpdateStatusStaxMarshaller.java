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

import com.amazonaws.Request;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO CacheNodeUpdateStatus
 */
class CacheNodeUpdateStatusStaxMarshaller {

    public void marshall(CacheNodeUpdateStatus _cacheNodeUpdateStatus, Request<?> request,
            String _prefix) {
        String prefix;
        if (_cacheNodeUpdateStatus.getCacheNodeId() != null) {
            prefix = _prefix + "CacheNodeId";
            String cacheNodeId = _cacheNodeUpdateStatus.getCacheNodeId();
            request.addParameter(prefix, StringUtils.fromString(cacheNodeId));
        }
        if (_cacheNodeUpdateStatus.getNodeUpdateStatus() != null) {
            prefix = _prefix + "NodeUpdateStatus";
            String nodeUpdateStatus = _cacheNodeUpdateStatus.getNodeUpdateStatus();
            request.addParameter(prefix, StringUtils.fromString(nodeUpdateStatus));
        }
        if (_cacheNodeUpdateStatus.getNodeDeletionDate() != null) {
            prefix = _prefix + "NodeDeletionDate";
            java.util.Date nodeDeletionDate = _cacheNodeUpdateStatus.getNodeDeletionDate();
            request.addParameter(prefix, StringUtils.fromDate(nodeDeletionDate));
        }
        if (_cacheNodeUpdateStatus.getNodeUpdateStartDate() != null) {
            prefix = _prefix + "NodeUpdateStartDate";
            java.util.Date nodeUpdateStartDate = _cacheNodeUpdateStatus.getNodeUpdateStartDate();
            request.addParameter(prefix, StringUtils.fromDate(nodeUpdateStartDate));
        }
        if (_cacheNodeUpdateStatus.getNodeUpdateEndDate() != null) {
            prefix = _prefix + "NodeUpdateEndDate";
            java.util.Date nodeUpdateEndDate = _cacheNodeUpdateStatus.getNodeUpdateEndDate();
            request.addParameter(prefix, StringUtils.fromDate(nodeUpdateEndDate));
        }
        if (_cacheNodeUpdateStatus.getNodeUpdateInitiatedBy() != null) {
            prefix = _prefix + "NodeUpdateInitiatedBy";
            String nodeUpdateInitiatedBy = _cacheNodeUpdateStatus.getNodeUpdateInitiatedBy();
            request.addParameter(prefix, StringUtils.fromString(nodeUpdateInitiatedBy));
        }
        if (_cacheNodeUpdateStatus.getNodeUpdateInitiatedDate() != null) {
            prefix = _prefix + "NodeUpdateInitiatedDate";
            java.util.Date nodeUpdateInitiatedDate = _cacheNodeUpdateStatus
                    .getNodeUpdateInitiatedDate();
            request.addParameter(prefix, StringUtils.fromDate(nodeUpdateInitiatedDate));
        }
        if (_cacheNodeUpdateStatus.getNodeUpdateStatusModifiedDate() != null) {
            prefix = _prefix + "NodeUpdateStatusModifiedDate";
            java.util.Date nodeUpdateStatusModifiedDate = _cacheNodeUpdateStatus
                    .getNodeUpdateStatusModifiedDate();
            request.addParameter(prefix, StringUtils.fromDate(nodeUpdateStatusModifiedDate));
        }
    }

    private static CacheNodeUpdateStatusStaxMarshaller instance;

    public static CacheNodeUpdateStatusStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CacheNodeUpdateStatusStaxMarshaller();
        return instance;
    }
}
