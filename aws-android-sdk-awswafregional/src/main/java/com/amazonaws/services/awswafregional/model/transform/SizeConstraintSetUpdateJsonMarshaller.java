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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SizeConstraintSetUpdate
 */
class SizeConstraintSetUpdateJsonMarshaller {

    public void marshall(SizeConstraintSetUpdate sizeConstraintSetUpdate, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (sizeConstraintSetUpdate.getAction() != null) {
            String action = sizeConstraintSetUpdate.getAction();
            jsonWriter.name("Action");
            jsonWriter.value(action);
        }
        if (sizeConstraintSetUpdate.getSizeConstraint() != null) {
            SizeConstraint sizeConstraint = sizeConstraintSetUpdate.getSizeConstraint();
            jsonWriter.name("SizeConstraint");
            SizeConstraintJsonMarshaller.getInstance().marshall(sizeConstraint, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static SizeConstraintSetUpdateJsonMarshaller instance;

    public static SizeConstraintSetUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SizeConstraintSetUpdateJsonMarshaller();
        return instance;
    }
}
