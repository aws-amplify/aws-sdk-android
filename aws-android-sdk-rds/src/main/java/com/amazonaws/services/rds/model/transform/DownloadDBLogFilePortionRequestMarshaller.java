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
 * StAX request marshaller for DownloadDBLogFilePortionRequest
 */
public class DownloadDBLogFilePortionRequestMarshaller implements
        Marshaller<Request<DownloadDBLogFilePortionRequest>, DownloadDBLogFilePortionRequest> {

    public Request<DownloadDBLogFilePortionRequest> marshall(
            DownloadDBLogFilePortionRequest downloadDBLogFilePortionRequest) {
        if (downloadDBLogFilePortionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DownloadDBLogFilePortionRequest)");
        }

        Request<DownloadDBLogFilePortionRequest> request = new DefaultRequest<DownloadDBLogFilePortionRequest>(
                downloadDBLogFilePortionRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "DownloadDBLogFilePortion");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (downloadDBLogFilePortionRequest.getDBInstanceIdentifier() != null) {
            prefix = "DBInstanceIdentifier";
            String dBInstanceIdentifier = downloadDBLogFilePortionRequest.getDBInstanceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceIdentifier));
        }
        if (downloadDBLogFilePortionRequest.getLogFileName() != null) {
            prefix = "LogFileName";
            String logFileName = downloadDBLogFilePortionRequest.getLogFileName();
            request.addParameter(prefix, StringUtils.fromString(logFileName));
        }
        if (downloadDBLogFilePortionRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = downloadDBLogFilePortionRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (downloadDBLogFilePortionRequest.getNumberOfLines() != null) {
            prefix = "NumberOfLines";
            Integer numberOfLines = downloadDBLogFilePortionRequest.getNumberOfLines();
            request.addParameter(prefix, StringUtils.fromInteger(numberOfLines));
        }

        return request;
    }
}
