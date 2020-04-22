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
 * StAX marshaller for POJO RevisionTarget
 */
class RevisionTargetStaxMarshaller {

    public void marshall(RevisionTarget _revisionTarget, Request<?> request, String _prefix) {
        String prefix;
        if (_revisionTarget.getDatabaseRevision() != null) {
            prefix = _prefix + "DatabaseRevision";
            String databaseRevision = _revisionTarget.getDatabaseRevision();
            request.addParameter(prefix, StringUtils.fromString(databaseRevision));
        }
        if (_revisionTarget.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _revisionTarget.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_revisionTarget.getDatabaseRevisionReleaseDate() != null) {
            prefix = _prefix + "DatabaseRevisionReleaseDate";
            java.util.Date databaseRevisionReleaseDate = _revisionTarget
                    .getDatabaseRevisionReleaseDate();
            request.addParameter(prefix, StringUtils.fromDate(databaseRevisionReleaseDate));
        }
    }

    private static RevisionTargetStaxMarshaller instance;

    public static RevisionTargetStaxMarshaller getInstance() {
        if (instance == null)
            instance = new RevisionTargetStaxMarshaller();
        return instance;
    }
}
