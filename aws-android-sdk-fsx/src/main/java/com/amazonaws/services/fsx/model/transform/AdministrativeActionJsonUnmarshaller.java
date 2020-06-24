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

package com.amazonaws.services.fsx.model.transform;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AdministrativeAction
 */
class AdministrativeActionJsonUnmarshaller implements
        Unmarshaller<AdministrativeAction, JsonUnmarshallerContext> {

    public AdministrativeAction unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AdministrativeAction administrativeAction = new AdministrativeAction();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AdministrativeActionType")) {
                administrativeAction.setAdministrativeActionType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProgressPercent")) {
                administrativeAction.setProgressPercent(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequestTime")) {
                administrativeAction.setRequestTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                administrativeAction.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetFileSystemValues")) {
                administrativeAction.setTargetFileSystemValues(FileSystemJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureDetails")) {
                administrativeAction
                        .setFailureDetails(AdministrativeActionFailureDetailsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return administrativeAction;
    }

    private static AdministrativeActionJsonUnmarshaller instance;

    public static AdministrativeActionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AdministrativeActionJsonUnmarshaller();
        return instance;
    }
}
