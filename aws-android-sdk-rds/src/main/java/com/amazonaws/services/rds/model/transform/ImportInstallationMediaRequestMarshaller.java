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
 * StAX request marshaller for ImportInstallationMediaRequest
 */
public class ImportInstallationMediaRequestMarshaller implements
        Marshaller<Request<ImportInstallationMediaRequest>, ImportInstallationMediaRequest> {

    public Request<ImportInstallationMediaRequest> marshall(
            ImportInstallationMediaRequest importInstallationMediaRequest) {
        if (importInstallationMediaRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ImportInstallationMediaRequest)");
        }

        Request<ImportInstallationMediaRequest> request = new DefaultRequest<ImportInstallationMediaRequest>(
                importInstallationMediaRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "ImportInstallationMedia");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (importInstallationMediaRequest.getCustomAvailabilityZoneId() != null) {
            prefix = "CustomAvailabilityZoneId";
            String customAvailabilityZoneId = importInstallationMediaRequest
                    .getCustomAvailabilityZoneId();
            request.addParameter(prefix, StringUtils.fromString(customAvailabilityZoneId));
        }
        if (importInstallationMediaRequest.getEngine() != null) {
            prefix = "Engine";
            String engine = importInstallationMediaRequest.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (importInstallationMediaRequest.getEngineVersion() != null) {
            prefix = "EngineVersion";
            String engineVersion = importInstallationMediaRequest.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (importInstallationMediaRequest.getEngineInstallationMediaPath() != null) {
            prefix = "EngineInstallationMediaPath";
            String engineInstallationMediaPath = importInstallationMediaRequest
                    .getEngineInstallationMediaPath();
            request.addParameter(prefix, StringUtils.fromString(engineInstallationMediaPath));
        }
        if (importInstallationMediaRequest.getOSInstallationMediaPath() != null) {
            prefix = "OSInstallationMediaPath";
            String oSInstallationMediaPath = importInstallationMediaRequest
                    .getOSInstallationMediaPath();
            request.addParameter(prefix, StringUtils.fromString(oSInstallationMediaPath));
        }

        return request;
    }
}
