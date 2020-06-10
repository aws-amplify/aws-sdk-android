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

package com.amazonaws.services.servicecatalog.model.transform;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DisassociateBudgetFromResourceResult
 */
public class DisassociateBudgetFromResourceResultJsonUnmarshaller implements
        Unmarshaller<DisassociateBudgetFromResourceResult, JsonUnmarshallerContext> {

    public DisassociateBudgetFromResourceResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DisassociateBudgetFromResourceResult disassociateBudgetFromResourceResult = new DisassociateBudgetFromResourceResult();

        return disassociateBudgetFromResourceResult;
    }

    private static DisassociateBudgetFromResourceResultJsonUnmarshaller instance;

    public static DisassociateBudgetFromResourceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DisassociateBudgetFromResourceResultJsonUnmarshaller();
        return instance;
    }
}
