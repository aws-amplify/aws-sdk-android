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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DescribeDBLogFilesRequest
 */
public class DescribeDBLogFilesRequestMarshaller implements
        Marshaller<Request<DescribeDBLogFilesRequest>, DescribeDBLogFilesRequest> {

    public Request<DescribeDBLogFilesRequest> marshall(
            DescribeDBLogFilesRequest describeDBLogFilesRequest) {
        if (describeDBLogFilesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeDBLogFilesRequest)");
        }

        Request<DescribeDBLogFilesRequest> request = new DefaultRequest<DescribeDBLogFilesRequest>(
                describeDBLogFilesRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "DescribeDBLogFiles");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (describeDBLogFilesRequest.getDBInstanceIdentifier() != null) {
            prefix = "DBInstanceIdentifier";
            String dBInstanceIdentifier = describeDBLogFilesRequest.getDBInstanceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceIdentifier));
        }
        if (describeDBLogFilesRequest.getFilenameContains() != null) {
            prefix = "FilenameContains";
            String filenameContains = describeDBLogFilesRequest.getFilenameContains();
            request.addParameter(prefix, StringUtils.fromString(filenameContains));
        }
        if (describeDBLogFilesRequest.getFileLastWritten() != null) {
            prefix = "FileLastWritten";
            Long fileLastWritten = describeDBLogFilesRequest.getFileLastWritten();
            request.addParameter(prefix, StringUtils.fromLong(fileLastWritten));
        }
        if (describeDBLogFilesRequest.getFileSize() != null) {
            prefix = "FileSize";
            Long fileSize = describeDBLogFilesRequest.getFileSize();
            request.addParameter(prefix, StringUtils.fromLong(fileSize));
        }
        if (describeDBLogFilesRequest.getFilters() != null) {
            prefix = "Filters";
            java.util.List<Filter> filters = describeDBLogFilesRequest.getFilters();
            int filtersIndex = 1;
            String filtersPrefix = prefix;
            for (Filter filtersItem : filters) {
                prefix = filtersPrefix + "." + filtersIndex;
                if (filtersItem != null) {
                    FilterStaxMarshaller.getInstance().marshall(filtersItem, request, prefix + ".");
                }
                filtersIndex++;
            }
            prefix = filtersPrefix;
        }
        if (describeDBLogFilesRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeDBLogFilesRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeDBLogFilesRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeDBLogFilesRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }

        return request;
    }
}
