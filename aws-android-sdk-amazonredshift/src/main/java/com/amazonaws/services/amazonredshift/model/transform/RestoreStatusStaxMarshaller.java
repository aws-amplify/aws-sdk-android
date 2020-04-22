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
 * StAX marshaller for POJO RestoreStatus
 */
class RestoreStatusStaxMarshaller {

    public void marshall(RestoreStatus _restoreStatus, Request<?> request, String _prefix) {
        String prefix;
        if (_restoreStatus.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _restoreStatus.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_restoreStatus.getCurrentRestoreRateInMegaBytesPerSecond() != null) {
            prefix = _prefix + "CurrentRestoreRateInMegaBytesPerSecond";
            Double currentRestoreRateInMegaBytesPerSecond = _restoreStatus
                    .getCurrentRestoreRateInMegaBytesPerSecond();
            request.addParameter(prefix,
                    StringUtils.fromDouble(currentRestoreRateInMegaBytesPerSecond));
        }
        if (_restoreStatus.getSnapshotSizeInMegaBytes() != null) {
            prefix = _prefix + "SnapshotSizeInMegaBytes";
            Long snapshotSizeInMegaBytes = _restoreStatus.getSnapshotSizeInMegaBytes();
            request.addParameter(prefix, StringUtils.fromLong(snapshotSizeInMegaBytes));
        }
        if (_restoreStatus.getProgressInMegaBytes() != null) {
            prefix = _prefix + "ProgressInMegaBytes";
            Long progressInMegaBytes = _restoreStatus.getProgressInMegaBytes();
            request.addParameter(prefix, StringUtils.fromLong(progressInMegaBytes));
        }
        if (_restoreStatus.getElapsedTimeInSeconds() != null) {
            prefix = _prefix + "ElapsedTimeInSeconds";
            Long elapsedTimeInSeconds = _restoreStatus.getElapsedTimeInSeconds();
            request.addParameter(prefix, StringUtils.fromLong(elapsedTimeInSeconds));
        }
        if (_restoreStatus.getEstimatedTimeToCompletionInSeconds() != null) {
            prefix = _prefix + "EstimatedTimeToCompletionInSeconds";
            Long estimatedTimeToCompletionInSeconds = _restoreStatus
                    .getEstimatedTimeToCompletionInSeconds();
            request.addParameter(prefix, StringUtils.fromLong(estimatedTimeToCompletionInSeconds));
        }
    }

    private static RestoreStatusStaxMarshaller instance;

    public static RestoreStatusStaxMarshaller getInstance() {
        if (instance == null)
            instance = new RestoreStatusStaxMarshaller();
        return instance;
    }
}
