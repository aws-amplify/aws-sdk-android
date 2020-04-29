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

package com.amazonaws.services.awswafregional.model.transform;

import com.amazonaws.services.awswafregional.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO WebACL
 */
class WebACLJsonUnmarshaller implements Unmarshaller<WebACL, JsonUnmarshallerContext> {

    public WebACL unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        WebACL webACL = new WebACL();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("WebACLId")) {
                webACL.setWebACLId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                webACL.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MetricName")) {
                webACL.setMetricName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultAction")) {
                webACL.setDefaultAction(WafActionJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Rules")) {
                webACL.setRules(new ListUnmarshaller<ActivatedRule>(ActivatedRuleJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("WebACLArn")) {
                webACL.setWebACLArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return webACL;
    }

    private static WebACLJsonUnmarshaller instance;

    public static WebACLJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WebACLJsonUnmarshaller();
        return instance;
    }
}
