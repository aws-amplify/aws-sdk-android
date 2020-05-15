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
 * StAX marshaller for POJO StackDriftInformationSummary
 */
class StackDriftInformationSummaryStaxMarshaller {

    public void marshall(StackDriftInformationSummary _stackDriftInformationSummary,
            Request<?> request, String _prefix) {
        String prefix;
        if (_stackDriftInformationSummary.getStackDriftStatus() != null) {
            prefix = _prefix + "StackDriftStatus";
            String stackDriftStatus = _stackDriftInformationSummary.getStackDriftStatus();
            request.addParameter(prefix, StringUtils.fromString(stackDriftStatus));
        }
        if (_stackDriftInformationSummary.getLastCheckTimestamp() != null) {
            prefix = _prefix + "LastCheckTimestamp";
            java.util.Date lastCheckTimestamp = _stackDriftInformationSummary
                    .getLastCheckTimestamp();
            request.addParameter(prefix, StringUtils.fromDate(lastCheckTimestamp));
        }
    }

    private static StackDriftInformationSummaryStaxMarshaller instance;

    public static StackDriftInformationSummaryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StackDriftInformationSummaryStaxMarshaller();
        return instance;
    }
}
