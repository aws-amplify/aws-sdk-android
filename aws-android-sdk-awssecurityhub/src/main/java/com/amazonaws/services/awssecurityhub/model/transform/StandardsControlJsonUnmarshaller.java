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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO StandardsControl
 */
class StandardsControlJsonUnmarshaller implements
        Unmarshaller<StandardsControl, JsonUnmarshallerContext> {

    public StandardsControl unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        StandardsControl standardsControl = new StandardsControl();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("StandardsControlArn")) {
                standardsControl.setStandardsControlArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ControlStatus")) {
                standardsControl.setControlStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DisabledReason")) {
                standardsControl.setDisabledReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ControlStatusUpdatedAt")) {
                standardsControl.setControlStatusUpdatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ControlId")) {
                standardsControl.setControlId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Title")) {
                standardsControl.setTitle(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                standardsControl.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RemediationUrl")) {
                standardsControl.setRemediationUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SeverityRating")) {
                standardsControl.setSeverityRating(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RelatedRequirements")) {
                standardsControl.setRelatedRequirements(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return standardsControl;
    }

    private static StandardsControlJsonUnmarshaller instance;

    public static StandardsControlJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StandardsControlJsonUnmarshaller();
        return instance;
    }
}
