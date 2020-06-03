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

package com.amazonaws.services.iam.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.iam.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ResourceSpecificResult
 */
class ResourceSpecificResultStaxMarshaller {

    public void marshall(ResourceSpecificResult _resourceSpecificResult, Request<?> request,
            String _prefix) {
        String prefix;
        if (_resourceSpecificResult.getEvalResourceName() != null) {
            prefix = _prefix + "EvalResourceName";
            String evalResourceName = _resourceSpecificResult.getEvalResourceName();
            request.addParameter(prefix, StringUtils.fromString(evalResourceName));
        }
        if (_resourceSpecificResult.getEvalResourceDecision() != null) {
            prefix = _prefix + "EvalResourceDecision";
            String evalResourceDecision = _resourceSpecificResult.getEvalResourceDecision();
            request.addParameter(prefix, StringUtils.fromString(evalResourceDecision));
        }
        if (_resourceSpecificResult.getMatchedStatements() != null) {
            prefix = _prefix + "MatchedStatements";
            java.util.List<Statement> matchedStatements = _resourceSpecificResult
                    .getMatchedStatements();
            int matchedStatementsIndex = 1;
            String matchedStatementsPrefix = prefix;
            for (Statement matchedStatementsItem : matchedStatements) {
                prefix = matchedStatementsPrefix + ".member." + matchedStatementsIndex;
                if (matchedStatementsItem != null) {
                    StatementStaxMarshaller.getInstance().marshall(matchedStatementsItem, request,
                            prefix + ".");
                }
                matchedStatementsIndex++;
            }
            prefix = matchedStatementsPrefix;
        }
        if (_resourceSpecificResult.getMissingContextValues() != null) {
            prefix = _prefix + "MissingContextValues";
            java.util.List<String> missingContextValues = _resourceSpecificResult
                    .getMissingContextValues();
            int missingContextValuesIndex = 1;
            String missingContextValuesPrefix = prefix;
            for (String missingContextValuesItem : missingContextValues) {
                prefix = missingContextValuesPrefix + ".member." + missingContextValuesIndex;
                if (missingContextValuesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(missingContextValuesItem));
                }
                missingContextValuesIndex++;
            }
            prefix = missingContextValuesPrefix;
        }
        if (_resourceSpecificResult.getEvalDecisionDetails() != null) {
            prefix = _prefix + "EvalDecisionDetails";
            java.util.Map<String, String> evalDecisionDetails = _resourceSpecificResult
                    .getEvalDecisionDetails();
            int evalDecisionDetailsIndex = 1;
            String evalDecisionDetailsPrefix = prefix + ".entry.";
            for (java.util.Map.Entry<String, String> evalDecisionDetailsEntry : evalDecisionDetails
                    .entrySet()) {
                prefix = evalDecisionDetailsPrefix + evalDecisionDetailsIndex;
                if (evalDecisionDetailsEntry.getKey() != null) {
                    request.addParameter(prefix + ".key",
                            StringUtils.fromString(evalDecisionDetailsEntry.getKey()));
                }
                prefix += ".value";
                if (evalDecisionDetailsEntry.getValue() != null) {
                    String evalDecisionDetailsValue = evalDecisionDetailsEntry.getValue();
                    request.addParameter(prefix, StringUtils.fromString(evalDecisionDetailsValue));
                }
                evalDecisionDetailsIndex++;
            }
            prefix = evalDecisionDetailsPrefix;
        }
        if (_resourceSpecificResult.getPermissionsBoundaryDecisionDetail() != null) {
            prefix = _prefix + "PermissionsBoundaryDecisionDetail";
            PermissionsBoundaryDecisionDetail permissionsBoundaryDecisionDetail = _resourceSpecificResult
                    .getPermissionsBoundaryDecisionDetail();
            PermissionsBoundaryDecisionDetailStaxMarshaller.getInstance().marshall(
                    permissionsBoundaryDecisionDetail, request, prefix + ".");
        }
    }

    private static ResourceSpecificResultStaxMarshaller instance;

    public static ResourceSpecificResultStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceSpecificResultStaxMarshaller();
        return instance;
    }
}
