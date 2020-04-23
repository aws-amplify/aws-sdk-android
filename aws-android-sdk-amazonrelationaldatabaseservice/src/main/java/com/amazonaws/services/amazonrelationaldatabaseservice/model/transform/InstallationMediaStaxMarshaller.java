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

import com.amazonaws.Request;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO InstallationMedia
 */
class InstallationMediaStaxMarshaller {

    public void marshall(InstallationMedia _installationMedia, Request<?> request, String _prefix) {
        String prefix;
        if (_installationMedia.getInstallationMediaId() != null) {
            prefix = _prefix + "InstallationMediaId";
            String installationMediaId = _installationMedia.getInstallationMediaId();
            request.addParameter(prefix, StringUtils.fromString(installationMediaId));
        }
        if (_installationMedia.getCustomAvailabilityZoneId() != null) {
            prefix = _prefix + "CustomAvailabilityZoneId";
            String customAvailabilityZoneId = _installationMedia.getCustomAvailabilityZoneId();
            request.addParameter(prefix, StringUtils.fromString(customAvailabilityZoneId));
        }
        if (_installationMedia.getEngine() != null) {
            prefix = _prefix + "Engine";
            String engine = _installationMedia.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (_installationMedia.getEngineVersion() != null) {
            prefix = _prefix + "EngineVersion";
            String engineVersion = _installationMedia.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (_installationMedia.getEngineInstallationMediaPath() != null) {
            prefix = _prefix + "EngineInstallationMediaPath";
            String engineInstallationMediaPath = _installationMedia
                    .getEngineInstallationMediaPath();
            request.addParameter(prefix, StringUtils.fromString(engineInstallationMediaPath));
        }
        if (_installationMedia.getOSInstallationMediaPath() != null) {
            prefix = _prefix + "OSInstallationMediaPath";
            String oSInstallationMediaPath = _installationMedia.getOSInstallationMediaPath();
            request.addParameter(prefix, StringUtils.fromString(oSInstallationMediaPath));
        }
        if (_installationMedia.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _installationMedia.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_installationMedia.getFailureCause() != null) {
            prefix = _prefix + "FailureCause";
            InstallationMediaFailureCause failureCause = _installationMedia.getFailureCause();
            InstallationMediaFailureCauseStaxMarshaller.getInstance().marshall(failureCause,
                    request, prefix + ".");
        }
    }

    private static InstallationMediaStaxMarshaller instance;

    public static InstallationMediaStaxMarshaller getInstance() {
        if (instance == null)
            instance = new InstallationMediaStaxMarshaller();
        return instance;
    }
}
