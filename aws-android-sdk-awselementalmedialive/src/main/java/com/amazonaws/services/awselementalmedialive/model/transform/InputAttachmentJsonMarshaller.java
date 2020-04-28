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
 * JSON marshaller for POJO InputAttachment
 */
class InputAttachmentJsonMarshaller {

    public void marshall(InputAttachment inputAttachment, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (inputAttachment.getAutomaticInputFailoverSettings() != null) {
            AutomaticInputFailoverSettings automaticInputFailoverSettings = inputAttachment
                    .getAutomaticInputFailoverSettings();
            jsonWriter.name("AutomaticInputFailoverSettings");
            AutomaticInputFailoverSettingsJsonMarshaller.getInstance().marshall(
                    automaticInputFailoverSettings, jsonWriter);
        }
        if (inputAttachment.getInputAttachmentName() != null) {
            String inputAttachmentName = inputAttachment.getInputAttachmentName();
            jsonWriter.name("InputAttachmentName");
            jsonWriter.value(inputAttachmentName);
        }
        if (inputAttachment.getInputId() != null) {
            String inputId = inputAttachment.getInputId();
            jsonWriter.name("InputId");
            jsonWriter.value(inputId);
        }
        if (inputAttachment.getInputSettings() != null) {
            InputSettings inputSettings = inputAttachment.getInputSettings();
            jsonWriter.name("InputSettings");
            InputSettingsJsonMarshaller.getInstance().marshall(inputSettings, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static InputAttachmentJsonMarshaller instance;

    public static InputAttachmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InputAttachmentJsonMarshaller();
        return instance;
    }
}
