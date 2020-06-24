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

package com.amazonaws.services.codecommit.model.transform;

import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO
 * BatchAssociateApprovalRuleTemplateWithRepositoriesError
 */
class BatchAssociateApprovalRuleTemplateWithRepositoriesErrorJsonMarshaller {

    public void marshall(
            BatchAssociateApprovalRuleTemplateWithRepositoriesError batchAssociateApprovalRuleTemplateWithRepositoriesError,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (batchAssociateApprovalRuleTemplateWithRepositoriesError.getRepositoryName() != null) {
            String repositoryName = batchAssociateApprovalRuleTemplateWithRepositoriesError
                    .getRepositoryName();
            jsonWriter.name("repositoryName");
            jsonWriter.value(repositoryName);
        }
        if (batchAssociateApprovalRuleTemplateWithRepositoriesError.getErrorCode() != null) {
            String errorCode = batchAssociateApprovalRuleTemplateWithRepositoriesError
                    .getErrorCode();
            jsonWriter.name("errorCode");
            jsonWriter.value(errorCode);
        }
        if (batchAssociateApprovalRuleTemplateWithRepositoriesError.getErrorMessage() != null) {
            String errorMessage = batchAssociateApprovalRuleTemplateWithRepositoriesError
                    .getErrorMessage();
            jsonWriter.name("errorMessage");
            jsonWriter.value(errorMessage);
        }
        jsonWriter.endObject();
    }

    private static BatchAssociateApprovalRuleTemplateWithRepositoriesErrorJsonMarshaller instance;

    public static BatchAssociateApprovalRuleTemplateWithRepositoriesErrorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BatchAssociateApprovalRuleTemplateWithRepositoriesErrorJsonMarshaller();
        return instance;
    }
}
