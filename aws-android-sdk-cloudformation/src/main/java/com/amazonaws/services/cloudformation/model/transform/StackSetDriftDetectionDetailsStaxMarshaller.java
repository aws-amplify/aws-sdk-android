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

package com.amazonaws.services.cloudformation.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO StackSetDriftDetectionDetails
 */
class StackSetDriftDetectionDetailsStaxMarshaller {

    public void marshall(StackSetDriftDetectionDetails _stackSetDriftDetectionDetails,
            Request<?> request, String _prefix) {
        String prefix;
        if (_stackSetDriftDetectionDetails.getDriftStatus() != null) {
            prefix = _prefix + "DriftStatus";
            String driftStatus = _stackSetDriftDetectionDetails.getDriftStatus();
            request.addParameter(prefix, StringUtils.fromString(driftStatus));
        }
        if (_stackSetDriftDetectionDetails.getDriftDetectionStatus() != null) {
            prefix = _prefix + "DriftDetectionStatus";
            String driftDetectionStatus = _stackSetDriftDetectionDetails.getDriftDetectionStatus();
            request.addParameter(prefix, StringUtils.fromString(driftDetectionStatus));
        }
        if (_stackSetDriftDetectionDetails.getLastDriftCheckTimestamp() != null) {
            prefix = _prefix + "LastDriftCheckTimestamp";
            java.util.Date lastDriftCheckTimestamp = _stackSetDriftDetectionDetails
                    .getLastDriftCheckTimestamp();
            request.addParameter(prefix, StringUtils.fromDate(lastDriftCheckTimestamp));
        }
        if (_stackSetDriftDetectionDetails.getTotalStackInstancesCount() != null) {
            prefix = _prefix + "TotalStackInstancesCount";
            Integer totalStackInstancesCount = _stackSetDriftDetectionDetails
                    .getTotalStackInstancesCount();
            request.addParameter(prefix, StringUtils.fromInteger(totalStackInstancesCount));
        }
        if (_stackSetDriftDetectionDetails.getDriftedStackInstancesCount() != null) {
            prefix = _prefix + "DriftedStackInstancesCount";
            Integer driftedStackInstancesCount = _stackSetDriftDetectionDetails
                    .getDriftedStackInstancesCount();
            request.addParameter(prefix, StringUtils.fromInteger(driftedStackInstancesCount));
        }
        if (_stackSetDriftDetectionDetails.getInSyncStackInstancesCount() != null) {
            prefix = _prefix + "InSyncStackInstancesCount";
            Integer inSyncStackInstancesCount = _stackSetDriftDetectionDetails
                    .getInSyncStackInstancesCount();
            request.addParameter(prefix, StringUtils.fromInteger(inSyncStackInstancesCount));
        }
        if (_stackSetDriftDetectionDetails.getInProgressStackInstancesCount() != null) {
            prefix = _prefix + "InProgressStackInstancesCount";
            Integer inProgressStackInstancesCount = _stackSetDriftDetectionDetails
                    .getInProgressStackInstancesCount();
            request.addParameter(prefix, StringUtils.fromInteger(inProgressStackInstancesCount));
        }
        if (_stackSetDriftDetectionDetails.getFailedStackInstancesCount() != null) {
            prefix = _prefix + "FailedStackInstancesCount";
            Integer failedStackInstancesCount = _stackSetDriftDetectionDetails
                    .getFailedStackInstancesCount();
            request.addParameter(prefix, StringUtils.fromInteger(failedStackInstancesCount));
        }
    }

    private static StackSetDriftDetectionDetailsStaxMarshaller instance;

    public static StackSetDriftDetectionDetailsStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StackSetDriftDetectionDetailsStaxMarshaller();
        return instance;
    }
}
