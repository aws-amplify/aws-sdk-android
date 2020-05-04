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
package com.amazonaws.services.s3-control.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.s3-control.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO JobReport
 */
class JobReportStaxMarshaller {

    public void marshall(JobReport _jobReport, Request<?> request, String _prefix) {
        String prefix;
        if (_jobReport.getBucket() != null) {
            prefix = _prefix + "Bucket";
            String bucket = _jobReport.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (_jobReport.getFormat() != null) {
            prefix = _prefix + "Format";
            String format = _jobReport.getFormat();
            request.addParameter(prefix, StringUtils.fromString(format));
        }
        if (_jobReport.getEnabled() != null) {
            prefix = _prefix + "Enabled";
            Boolean enabled = _jobReport.getEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(enabled));
        }
        if (_jobReport.getPrefix() != null) {
            prefix = _prefix + "Prefix";
            String prefix = _jobReport.getPrefix();
            request.addParameter(prefix, StringUtils.fromString(prefix));
        }
        if (_jobReport.getReportScope() != null) {
            prefix = _prefix + "ReportScope";
            String reportScope = _jobReport.getReportScope();
            request.addParameter(prefix, StringUtils.fromString(reportScope));
        }
    }

    private static JobReportStaxMarshaller instance;
    public static JobReportStaxMarshaller getInstance() {
        if (instance == null) instance = new JobReportStaxMarshaller();
        return instance;
    }
}
