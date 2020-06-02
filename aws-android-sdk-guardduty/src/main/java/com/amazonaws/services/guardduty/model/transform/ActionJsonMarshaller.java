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

package com.amazonaws.services.guardduty.model.transform;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Action
 */
class ActionJsonMarshaller {

    public void marshall(Action action, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (action.getActionType() != null) {
            String actionType = action.getActionType();
            jsonWriter.name("ActionType");
            jsonWriter.value(actionType);
        }
        if (action.getAwsApiCallAction() != null) {
            AwsApiCallAction awsApiCallAction = action.getAwsApiCallAction();
            jsonWriter.name("AwsApiCallAction");
            AwsApiCallActionJsonMarshaller.getInstance().marshall(awsApiCallAction, jsonWriter);
        }
        if (action.getDnsRequestAction() != null) {
            DnsRequestAction dnsRequestAction = action.getDnsRequestAction();
            jsonWriter.name("DnsRequestAction");
            DnsRequestActionJsonMarshaller.getInstance().marshall(dnsRequestAction, jsonWriter);
        }
        if (action.getNetworkConnectionAction() != null) {
            NetworkConnectionAction networkConnectionAction = action.getNetworkConnectionAction();
            jsonWriter.name("NetworkConnectionAction");
            NetworkConnectionActionJsonMarshaller.getInstance().marshall(networkConnectionAction,
                    jsonWriter);
        }
        if (action.getPortProbeAction() != null) {
            PortProbeAction portProbeAction = action.getPortProbeAction();
            jsonWriter.name("PortProbeAction");
            PortProbeActionJsonMarshaller.getInstance().marshall(portProbeAction, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ActionJsonMarshaller instance;

    public static ActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActionJsonMarshaller();
        return instance;
    }
}
