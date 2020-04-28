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

package com.amazonaws.services.awselementalmedialive.model.transform;

import com.amazonaws.services.awselementalmedialive.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InputLossBehavior
 */
class InputLossBehaviorJsonMarshaller {

    public void marshall(InputLossBehavior inputLossBehavior, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (inputLossBehavior.getBlackFrameMsec() != null) {
            Integer blackFrameMsec = inputLossBehavior.getBlackFrameMsec();
            jsonWriter.name("BlackFrameMsec");
            jsonWriter.value(blackFrameMsec);
        }
        if (inputLossBehavior.getInputLossImageColor() != null) {
            String inputLossImageColor = inputLossBehavior.getInputLossImageColor();
            jsonWriter.name("InputLossImageColor");
            jsonWriter.value(inputLossImageColor);
        }
        if (inputLossBehavior.getInputLossImageSlate() != null) {
            InputLocation inputLossImageSlate = inputLossBehavior.getInputLossImageSlate();
            jsonWriter.name("InputLossImageSlate");
            InputLocationJsonMarshaller.getInstance().marshall(inputLossImageSlate, jsonWriter);
        }
        if (inputLossBehavior.getInputLossImageType() != null) {
            String inputLossImageType = inputLossBehavior.getInputLossImageType();
            jsonWriter.name("InputLossImageType");
            jsonWriter.value(inputLossImageType);
        }
        if (inputLossBehavior.getRepeatFrameMsec() != null) {
            Integer repeatFrameMsec = inputLossBehavior.getRepeatFrameMsec();
            jsonWriter.name("RepeatFrameMsec");
            jsonWriter.value(repeatFrameMsec);
        }
        jsonWriter.endObject();
    }

    private static InputLossBehaviorJsonMarshaller instance;

    public static InputLossBehaviorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InputLossBehaviorJsonMarshaller();
        return instance;
    }
}
