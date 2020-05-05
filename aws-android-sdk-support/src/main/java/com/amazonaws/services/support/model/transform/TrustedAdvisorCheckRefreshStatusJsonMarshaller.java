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

package com.amazonaws.services.support.model.transform;

import com.amazonaws.services.support.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TrustedAdvisorCheckRefreshStatus
 */
class TrustedAdvisorCheckRefreshStatusJsonMarshaller {

    public void marshall(TrustedAdvisorCheckRefreshStatus trustedAdvisorCheckRefreshStatus,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (trustedAdvisorCheckRefreshStatus.getCheckId() != null) {
            String checkId = trustedAdvisorCheckRefreshStatus.getCheckId();
            jsonWriter.name("checkId");
            jsonWriter.value(checkId);
        }
        if (trustedAdvisorCheckRefreshStatus.getStatus() != null) {
            String status = trustedAdvisorCheckRefreshStatus.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (trustedAdvisorCheckRefreshStatus.getMillisUntilNextRefreshable() != null) {
            Long millisUntilNextRefreshable = trustedAdvisorCheckRefreshStatus
                    .getMillisUntilNextRefreshable();
            jsonWriter.name("millisUntilNextRefreshable");
            jsonWriter.value(millisUntilNextRefreshable);
        }
        jsonWriter.endObject();
    }

    private static TrustedAdvisorCheckRefreshStatusJsonMarshaller instance;

    public static TrustedAdvisorCheckRefreshStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrustedAdvisorCheckRefreshStatusJsonMarshaller();
        return instance;
    }
}
