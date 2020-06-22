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

import com.amazonaws.Request;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO UpgradeTarget
 */
class UpgradeTargetStaxMarshaller {

    public void marshall(UpgradeTarget _upgradeTarget, Request<?> request, String _prefix) {
        String prefix;
        if (_upgradeTarget.getEngine() != null) {
            prefix = _prefix + "Engine";
            String engine = _upgradeTarget.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (_upgradeTarget.getEngineVersion() != null) {
            prefix = _prefix + "EngineVersion";
            String engineVersion = _upgradeTarget.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (_upgradeTarget.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _upgradeTarget.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_upgradeTarget.getAutoUpgrade() != null) {
            prefix = _prefix + "AutoUpgrade";
            Boolean autoUpgrade = _upgradeTarget.getAutoUpgrade();
            request.addParameter(prefix, StringUtils.fromBoolean(autoUpgrade));
        }
        if (_upgradeTarget.getIsMajorVersionUpgrade() != null) {
            prefix = _prefix + "IsMajorVersionUpgrade";
            Boolean isMajorVersionUpgrade = _upgradeTarget.getIsMajorVersionUpgrade();
            request.addParameter(prefix, StringUtils.fromBoolean(isMajorVersionUpgrade));
        }
    }

    private static UpgradeTargetStaxMarshaller instance;

    public static UpgradeTargetStaxMarshaller getInstance() {
        if (instance == null)
            instance = new UpgradeTargetStaxMarshaller();
        return instance;
    }
}
