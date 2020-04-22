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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ClusterDbRevision
 */
class ClusterDbRevisionStaxMarshaller {

    public void marshall(ClusterDbRevision _clusterDbRevision, Request<?> request, String _prefix) {
        String prefix;
        if (_clusterDbRevision.getClusterIdentifier() != null) {
            prefix = _prefix + "ClusterIdentifier";
            String clusterIdentifier = _clusterDbRevision.getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (_clusterDbRevision.getCurrentDatabaseRevision() != null) {
            prefix = _prefix + "CurrentDatabaseRevision";
            String currentDatabaseRevision = _clusterDbRevision.getCurrentDatabaseRevision();
            request.addParameter(prefix, StringUtils.fromString(currentDatabaseRevision));
        }
        if (_clusterDbRevision.getDatabaseRevisionReleaseDate() != null) {
            prefix = _prefix + "DatabaseRevisionReleaseDate";
            java.util.Date databaseRevisionReleaseDate = _clusterDbRevision
                    .getDatabaseRevisionReleaseDate();
            request.addParameter(prefix, StringUtils.fromDate(databaseRevisionReleaseDate));
        }
        if (_clusterDbRevision.getRevisionTargets() != null) {
            prefix = _prefix + "RevisionTargets";
            java.util.List<RevisionTarget> revisionTargets = _clusterDbRevision
                    .getRevisionTargets();
            int revisionTargetsIndex = 1;
            String revisionTargetsPrefix = prefix;
            for (RevisionTarget revisionTargetsItem : revisionTargets) {
                prefix = revisionTargetsPrefix + "." + revisionTargetsIndex;
                if (revisionTargetsItem != null) {
                    RevisionTargetStaxMarshaller.getInstance().marshall(revisionTargetsItem,
                            request, prefix + ".");
                }
                revisionTargetsIndex++;
            }
            prefix = revisionTargetsPrefix;
        }
    }

    private static ClusterDbRevisionStaxMarshaller instance;

    public static ClusterDbRevisionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ClusterDbRevisionStaxMarshaller();
        return instance;
    }
}
