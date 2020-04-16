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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AwsSecurityFinding
 */
class AwsSecurityFindingJsonMarshaller {

    public void marshall(AwsSecurityFinding awsSecurityFinding, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (awsSecurityFinding.getSchemaVersion() != null) {
            String schemaVersion = awsSecurityFinding.getSchemaVersion();
            jsonWriter.name("SchemaVersion");
            jsonWriter.value(schemaVersion);
        }
        if (awsSecurityFinding.getId() != null) {
            String id = awsSecurityFinding.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (awsSecurityFinding.getProductArn() != null) {
            String productArn = awsSecurityFinding.getProductArn();
            jsonWriter.name("ProductArn");
            jsonWriter.value(productArn);
        }
        if (awsSecurityFinding.getGeneratorId() != null) {
            String generatorId = awsSecurityFinding.getGeneratorId();
            jsonWriter.name("GeneratorId");
            jsonWriter.value(generatorId);
        }
        if (awsSecurityFinding.getAwsAccountId() != null) {
            String awsAccountId = awsSecurityFinding.getAwsAccountId();
            jsonWriter.name("AwsAccountId");
            jsonWriter.value(awsAccountId);
        }
        if (awsSecurityFinding.getTypes() != null) {
            java.util.List<String> types = awsSecurityFinding.getTypes();
            jsonWriter.name("Types");
            jsonWriter.beginArray();
            for (String typesItem : types) {
                if (typesItem != null) {
                    jsonWriter.value(typesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFinding.getFirstObservedAt() != null) {
            String firstObservedAt = awsSecurityFinding.getFirstObservedAt();
            jsonWriter.name("FirstObservedAt");
            jsonWriter.value(firstObservedAt);
        }
        if (awsSecurityFinding.getLastObservedAt() != null) {
            String lastObservedAt = awsSecurityFinding.getLastObservedAt();
            jsonWriter.name("LastObservedAt");
            jsonWriter.value(lastObservedAt);
        }
        if (awsSecurityFinding.getCreatedAt() != null) {
            String createdAt = awsSecurityFinding.getCreatedAt();
            jsonWriter.name("CreatedAt");
            jsonWriter.value(createdAt);
        }
        if (awsSecurityFinding.getUpdatedAt() != null) {
            String updatedAt = awsSecurityFinding.getUpdatedAt();
            jsonWriter.name("UpdatedAt");
            jsonWriter.value(updatedAt);
        }
        if (awsSecurityFinding.getSeverity() != null) {
            Severity severity = awsSecurityFinding.getSeverity();
            jsonWriter.name("Severity");
            SeverityJsonMarshaller.getInstance().marshall(severity, jsonWriter);
        }
        if (awsSecurityFinding.getConfidence() != null) {
            Integer confidence = awsSecurityFinding.getConfidence();
            jsonWriter.name("Confidence");
            jsonWriter.value(confidence);
        }
        if (awsSecurityFinding.getCriticality() != null) {
            Integer criticality = awsSecurityFinding.getCriticality();
            jsonWriter.name("Criticality");
            jsonWriter.value(criticality);
        }
        if (awsSecurityFinding.getTitle() != null) {
            String title = awsSecurityFinding.getTitle();
            jsonWriter.name("Title");
            jsonWriter.value(title);
        }
        if (awsSecurityFinding.getDescription() != null) {
            String description = awsSecurityFinding.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (awsSecurityFinding.getRemediation() != null) {
            Remediation remediation = awsSecurityFinding.getRemediation();
            jsonWriter.name("Remediation");
            RemediationJsonMarshaller.getInstance().marshall(remediation, jsonWriter);
        }
        if (awsSecurityFinding.getSourceUrl() != null) {
            String sourceUrl = awsSecurityFinding.getSourceUrl();
            jsonWriter.name("SourceUrl");
            jsonWriter.value(sourceUrl);
        }
        if (awsSecurityFinding.getProductFields() != null) {
            java.util.Map<String, String> productFields = awsSecurityFinding.getProductFields();
            jsonWriter.name("ProductFields");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> productFieldsEntry : productFields.entrySet()) {
                String productFieldsValue = productFieldsEntry.getValue();
                if (productFieldsValue != null) {
                    jsonWriter.name(productFieldsEntry.getKey());
                    jsonWriter.value(productFieldsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (awsSecurityFinding.getUserDefinedFields() != null) {
            java.util.Map<String, String> userDefinedFields = awsSecurityFinding
                    .getUserDefinedFields();
            jsonWriter.name("UserDefinedFields");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> userDefinedFieldsEntry : userDefinedFields
                    .entrySet()) {
                String userDefinedFieldsValue = userDefinedFieldsEntry.getValue();
                if (userDefinedFieldsValue != null) {
                    jsonWriter.name(userDefinedFieldsEntry.getKey());
                    jsonWriter.value(userDefinedFieldsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (awsSecurityFinding.getMalware() != null) {
            java.util.List<Malware> malware = awsSecurityFinding.getMalware();
            jsonWriter.name("Malware");
            jsonWriter.beginArray();
            for (Malware malwareItem : malware) {
                if (malwareItem != null) {
                    MalwareJsonMarshaller.getInstance().marshall(malwareItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFinding.getNetwork() != null) {
            Network network = awsSecurityFinding.getNetwork();
            jsonWriter.name("Network");
            NetworkJsonMarshaller.getInstance().marshall(network, jsonWriter);
        }
        if (awsSecurityFinding.getProcess() != null) {
            ProcessDetails process = awsSecurityFinding.getProcess();
            jsonWriter.name("Process");
            ProcessDetailsJsonMarshaller.getInstance().marshall(process, jsonWriter);
        }
        if (awsSecurityFinding.getThreatIntelIndicators() != null) {
            java.util.List<ThreatIntelIndicator> threatIntelIndicators = awsSecurityFinding
                    .getThreatIntelIndicators();
            jsonWriter.name("ThreatIntelIndicators");
            jsonWriter.beginArray();
            for (ThreatIntelIndicator threatIntelIndicatorsItem : threatIntelIndicators) {
                if (threatIntelIndicatorsItem != null) {
                    ThreatIntelIndicatorJsonMarshaller.getInstance().marshall(
                            threatIntelIndicatorsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFinding.getResources() != null) {
            java.util.List<Resource> resources = awsSecurityFinding.getResources();
            jsonWriter.name("Resources");
            jsonWriter.beginArray();
            for (Resource resourcesItem : resources) {
                if (resourcesItem != null) {
                    ResourceJsonMarshaller.getInstance().marshall(resourcesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFinding.getCompliance() != null) {
            Compliance compliance = awsSecurityFinding.getCompliance();
            jsonWriter.name("Compliance");
            ComplianceJsonMarshaller.getInstance().marshall(compliance, jsonWriter);
        }
        if (awsSecurityFinding.getVerificationState() != null) {
            String verificationState = awsSecurityFinding.getVerificationState();
            jsonWriter.name("VerificationState");
            jsonWriter.value(verificationState);
        }
        if (awsSecurityFinding.getWorkflowState() != null) {
            String workflowState = awsSecurityFinding.getWorkflowState();
            jsonWriter.name("WorkflowState");
            jsonWriter.value(workflowState);
        }
        if (awsSecurityFinding.getWorkflow() != null) {
            Workflow workflow = awsSecurityFinding.getWorkflow();
            jsonWriter.name("Workflow");
            WorkflowJsonMarshaller.getInstance().marshall(workflow, jsonWriter);
        }
        if (awsSecurityFinding.getRecordState() != null) {
            String recordState = awsSecurityFinding.getRecordState();
            jsonWriter.name("RecordState");
            jsonWriter.value(recordState);
        }
        if (awsSecurityFinding.getRelatedFindings() != null) {
            java.util.List<RelatedFinding> relatedFindings = awsSecurityFinding
                    .getRelatedFindings();
            jsonWriter.name("RelatedFindings");
            jsonWriter.beginArray();
            for (RelatedFinding relatedFindingsItem : relatedFindings) {
                if (relatedFindingsItem != null) {
                    RelatedFindingJsonMarshaller.getInstance().marshall(relatedFindingsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFinding.getNote() != null) {
            Note note = awsSecurityFinding.getNote();
            jsonWriter.name("Note");
            NoteJsonMarshaller.getInstance().marshall(note, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AwsSecurityFindingJsonMarshaller instance;

    public static AwsSecurityFindingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsSecurityFindingJsonMarshaller();
        return instance;
    }
}
