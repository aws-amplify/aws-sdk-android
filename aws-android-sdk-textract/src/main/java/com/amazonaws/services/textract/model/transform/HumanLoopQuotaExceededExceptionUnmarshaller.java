/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler.JsonErrorResponse;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.services.textract.model.HumanLoopQuotaExceededException;

public class HumanLoopQuotaExceededExceptionUnmarshaller extends JsonErrorUnmarshaller {

    public HumanLoopQuotaExceededExceptionUnmarshaller() {
        super(HumanLoopQuotaExceededException.class);
    }

    @Override
    public boolean match(JsonErrorResponse error) throws Exception {
        return error.getErrorCode().equals("HumanLoopQuotaExceededException");
    }

    @Override
    public AmazonServiceException unmarshall(JsonErrorResponse error) throws Exception {

        HumanLoopQuotaExceededException e = (HumanLoopQuotaExceededException) super
                .unmarshall(error);
        e.setErrorCode("HumanLoopQuotaExceededException");
        e.setResourceType(String.valueOf(error.get("ResourceType")));

        e.setQuotaCode(String.valueOf(error.get("QuotaCode")));

        e.setServiceCode(String.valueOf(error.get("ServiceCode")));

        return e;
    }
}
