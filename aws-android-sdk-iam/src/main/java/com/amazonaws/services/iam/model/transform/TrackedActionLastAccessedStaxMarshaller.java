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

package com.amazonaws.services.iam.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.iam.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO TrackedActionLastAccessed
 */
class TrackedActionLastAccessedStaxMarshaller {

    public void marshall(TrackedActionLastAccessed _trackedActionLastAccessed, Request<?> request,
            String _prefix) {
        String prefix;
        if (_trackedActionLastAccessed.getActionName() != null) {
            prefix = _prefix + "ActionName";
            String actionName = _trackedActionLastAccessed.getActionName();
            request.addParameter(prefix, StringUtils.fromString(actionName));
        }
        if (_trackedActionLastAccessed.getLastAccessedEntity() != null) {
            prefix = _prefix + "LastAccessedEntity";
            String lastAccessedEntity = _trackedActionLastAccessed.getLastAccessedEntity();
            request.addParameter(prefix, StringUtils.fromString(lastAccessedEntity));
        }
        if (_trackedActionLastAccessed.getLastAccessedTime() != null) {
            prefix = _prefix + "LastAccessedTime";
            java.util.Date lastAccessedTime = _trackedActionLastAccessed.getLastAccessedTime();
            request.addParameter(prefix, StringUtils.fromDate(lastAccessedTime));
        }
        if (_trackedActionLastAccessed.getLastAccessedRegion() != null) {
            prefix = _prefix + "LastAccessedRegion";
            String lastAccessedRegion = _trackedActionLastAccessed.getLastAccessedRegion();
            request.addParameter(prefix, StringUtils.fromString(lastAccessedRegion));
        }
    }

    private static TrackedActionLastAccessedStaxMarshaller instance;

    public static TrackedActionLastAccessedStaxMarshaller getInstance() {
        if (instance == null)
            instance = new TrackedActionLastAccessedStaxMarshaller();
        return instance;
    }
}
