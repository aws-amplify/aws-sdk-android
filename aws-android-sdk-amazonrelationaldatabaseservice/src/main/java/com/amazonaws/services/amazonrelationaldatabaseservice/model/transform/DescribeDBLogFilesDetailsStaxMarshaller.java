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
 * StAX marshaller for POJO DescribeDBLogFilesDetails
 */
class DescribeDBLogFilesDetailsStaxMarshaller {

    public void marshall(DescribeDBLogFilesDetails _describeDBLogFilesDetails, Request<?> request,
            String _prefix) {
        String prefix;
        if (_describeDBLogFilesDetails.getLogFileName() != null) {
            prefix = _prefix + "LogFileName";
            String logFileName = _describeDBLogFilesDetails.getLogFileName();
            request.addParameter(prefix, StringUtils.fromString(logFileName));
        }
        if (_describeDBLogFilesDetails.getLastWritten() != null) {
            prefix = _prefix + "LastWritten";
            Long lastWritten = _describeDBLogFilesDetails.getLastWritten();
            request.addParameter(prefix, StringUtils.fromLong(lastWritten));
        }
        if (_describeDBLogFilesDetails.getSize() != null) {
            prefix = _prefix + "Size";
            Long size = _describeDBLogFilesDetails.getSize();
            request.addParameter(prefix, StringUtils.fromLong(size));
        }
    }

    private static DescribeDBLogFilesDetailsStaxMarshaller instance;

    public static DescribeDBLogFilesDetailsStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDBLogFilesDetailsStaxMarshaller();
        return instance;
    }
}
