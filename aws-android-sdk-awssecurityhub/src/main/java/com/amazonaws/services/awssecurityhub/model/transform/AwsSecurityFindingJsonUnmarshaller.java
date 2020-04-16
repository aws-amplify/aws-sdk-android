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
 * JSON unmarshaller for POJO AwsSecurityFinding
 */
class AwsSecurityFindingJsonUnmarshaller implements
        Unmarshaller<AwsSecurityFinding, JsonUnmarshallerContext> {

    public AwsSecurityFinding unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AwsSecurityFinding awsSecurityFinding = new AwsSecurityFinding();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("SchemaVersion")) {
                awsSecurityFinding.setSchemaVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                awsSecurityFinding.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProductArn")) {
                awsSecurityFinding.setProductArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GeneratorId")) {
                awsSecurityFinding.setGeneratorId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AwsAccountId")) {
                awsSecurityFinding.setAwsAccountId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Types")) {
                awsSecurityFinding.setTypes(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("FirstObservedAt")) {
                awsSecurityFinding.setFirstObservedAt(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastObservedAt")) {
                awsSecurityFinding.setLastObservedAt(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedAt")) {
                awsSecurityFinding.setCreatedAt(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UpdatedAt")) {
                awsSecurityFinding.setUpdatedAt(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Severity")) {
                awsSecurityFinding.setSeverity(SeverityJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Confidence")) {
                awsSecurityFinding.setConfidence(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Criticality")) {
                awsSecurityFinding.setCriticality(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Title")) {
                awsSecurityFinding.setTitle(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                awsSecurityFinding.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Remediation")) {
                awsSecurityFinding.setRemediation(RemediationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceUrl")) {
                awsSecurityFinding.setSourceUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProductFields")) {
                awsSecurityFinding.setProductFields(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("UserDefinedFields")) {
                awsSecurityFinding.setUserDefinedFields(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Malware")) {
                awsSecurityFinding.setMalware(new ListUnmarshaller<Malware>(MalwareJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Network")) {
                awsSecurityFinding.setNetwork(NetworkJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Process")) {
                awsSecurityFinding.setProcess(ProcessDetailsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ThreatIntelIndicators")) {
                awsSecurityFinding
                        .setThreatIntelIndicators(new ListUnmarshaller<ThreatIntelIndicator>(
                                ThreatIntelIndicatorJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Resources")) {
                awsSecurityFinding.setResources(new ListUnmarshaller<Resource>(
                        ResourceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Compliance")) {
                awsSecurityFinding.setCompliance(ComplianceJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VerificationState")) {
                awsSecurityFinding.setVerificationState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WorkflowState")) {
                awsSecurityFinding.setWorkflowState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Workflow")) {
                awsSecurityFinding.setWorkflow(WorkflowJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RecordState")) {
                awsSecurityFinding.setRecordState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RelatedFindings")) {
                awsSecurityFinding.setRelatedFindings(new ListUnmarshaller<RelatedFinding>(
                        RelatedFindingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Note")) {
                awsSecurityFinding.setNote(NoteJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return awsSecurityFinding;
    }

    private static AwsSecurityFindingJsonUnmarshaller instance;

    public static AwsSecurityFindingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsSecurityFindingJsonUnmarshaller();
        return instance;
    }
}
