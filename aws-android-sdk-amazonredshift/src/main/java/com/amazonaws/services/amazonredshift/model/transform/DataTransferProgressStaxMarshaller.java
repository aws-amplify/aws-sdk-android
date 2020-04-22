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
 * StAX marshaller for POJO DataTransferProgress
 */
class DataTransferProgressStaxMarshaller {

    public void marshall(DataTransferProgress _dataTransferProgress, Request<?> request,
            String _prefix) {
        String prefix;
        if (_dataTransferProgress.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _dataTransferProgress.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_dataTransferProgress.getCurrentRateInMegaBytesPerSecond() != null) {
            prefix = _prefix + "CurrentRateInMegaBytesPerSecond";
            Double currentRateInMegaBytesPerSecond = _dataTransferProgress
                    .getCurrentRateInMegaBytesPerSecond();
            request.addParameter(prefix, StringUtils.fromDouble(currentRateInMegaBytesPerSecond));
        }
        if (_dataTransferProgress.getTotalDataInMegaBytes() != null) {
            prefix = _prefix + "TotalDataInMegaBytes";
            Long totalDataInMegaBytes = _dataTransferProgress.getTotalDataInMegaBytes();
            request.addParameter(prefix, StringUtils.fromLong(totalDataInMegaBytes));
        }
        if (_dataTransferProgress.getDataTransferredInMegaBytes() != null) {
            prefix = _prefix + "DataTransferredInMegaBytes";
            Long dataTransferredInMegaBytes = _dataTransferProgress.getDataTransferredInMegaBytes();
            request.addParameter(prefix, StringUtils.fromLong(dataTransferredInMegaBytes));
        }
        if (_dataTransferProgress.getEstimatedTimeToCompletionInSeconds() != null) {
            prefix = _prefix + "EstimatedTimeToCompletionInSeconds";
            Long estimatedTimeToCompletionInSeconds = _dataTransferProgress
                    .getEstimatedTimeToCompletionInSeconds();
            request.addParameter(prefix, StringUtils.fromLong(estimatedTimeToCompletionInSeconds));
        }
        if (_dataTransferProgress.getElapsedTimeInSeconds() != null) {
            prefix = _prefix + "ElapsedTimeInSeconds";
            Long elapsedTimeInSeconds = _dataTransferProgress.getElapsedTimeInSeconds();
            request.addParameter(prefix, StringUtils.fromLong(elapsedTimeInSeconds));
        }
    }

    private static DataTransferProgressStaxMarshaller instance;

    public static DataTransferProgressStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DataTransferProgressStaxMarshaller();
        return instance;
    }
}
