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
 * JSON unmarshaller for POJO AwsSecurityFindingFilters
 */
class AwsSecurityFindingFiltersJsonUnmarshaller implements
        Unmarshaller<AwsSecurityFindingFilters, JsonUnmarshallerContext> {

    public AwsSecurityFindingFilters unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AwsSecurityFindingFilters awsSecurityFindingFilters = new AwsSecurityFindingFilters();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ProductArn")) {
                awsSecurityFindingFilters.setProductArn(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AwsAccountId")) {
                awsSecurityFindingFilters.setAwsAccountId(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Id")) {
                awsSecurityFindingFilters.setId(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("GeneratorId")) {
                awsSecurityFindingFilters.setGeneratorId(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Type")) {
                awsSecurityFindingFilters.setType(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("FirstObservedAt")) {
                awsSecurityFindingFilters.setFirstObservedAt(new ListUnmarshaller<DateFilter>(
                        DateFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("LastObservedAt")) {
                awsSecurityFindingFilters.setLastObservedAt(new ListUnmarshaller<DateFilter>(
                        DateFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("CreatedAt")) {
                awsSecurityFindingFilters.setCreatedAt(new ListUnmarshaller<DateFilter>(
                        DateFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("UpdatedAt")) {
                awsSecurityFindingFilters.setUpdatedAt(new ListUnmarshaller<DateFilter>(
                        DateFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SeverityProduct")) {
                awsSecurityFindingFilters.setSeverityProduct(new ListUnmarshaller<NumberFilter>(
                        NumberFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SeverityNormalized")) {
                awsSecurityFindingFilters.setSeverityNormalized(new ListUnmarshaller<NumberFilter>(
                        NumberFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SeverityLabel")) {
                awsSecurityFindingFilters.setSeverityLabel(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Confidence")) {
                awsSecurityFindingFilters.setConfidence(new ListUnmarshaller<NumberFilter>(
                        NumberFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Criticality")) {
                awsSecurityFindingFilters.setCriticality(new ListUnmarshaller<NumberFilter>(
                        NumberFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Title")) {
                awsSecurityFindingFilters.setTitle(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Description")) {
                awsSecurityFindingFilters.setDescription(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RecommendationText")) {
                awsSecurityFindingFilters.setRecommendationText(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SourceUrl")) {
                awsSecurityFindingFilters.setSourceUrl(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ProductFields")) {
                awsSecurityFindingFilters.setProductFields(new ListUnmarshaller<MapFilter>(
                        MapFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ProductName")) {
                awsSecurityFindingFilters.setProductName(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("CompanyName")) {
                awsSecurityFindingFilters.setCompanyName(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("UserDefinedFields")) {
                awsSecurityFindingFilters.setUserDefinedFields(new ListUnmarshaller<MapFilter>(
                        MapFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("MalwareName")) {
                awsSecurityFindingFilters.setMalwareName(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("MalwareType")) {
                awsSecurityFindingFilters.setMalwareType(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("MalwarePath")) {
                awsSecurityFindingFilters.setMalwarePath(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("MalwareState")) {
                awsSecurityFindingFilters.setMalwareState(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NetworkDirection")) {
                awsSecurityFindingFilters.setNetworkDirection(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NetworkProtocol")) {
                awsSecurityFindingFilters.setNetworkProtocol(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NetworkSourceIpV4")) {
                awsSecurityFindingFilters.setNetworkSourceIpV4(new ListUnmarshaller<IpFilter>(
                        IpFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NetworkSourceIpV6")) {
                awsSecurityFindingFilters.setNetworkSourceIpV6(new ListUnmarshaller<IpFilter>(
                        IpFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NetworkSourcePort")) {
                awsSecurityFindingFilters.setNetworkSourcePort(new ListUnmarshaller<NumberFilter>(
                        NumberFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NetworkSourceDomain")) {
                awsSecurityFindingFilters
                        .setNetworkSourceDomain(new ListUnmarshaller<StringFilter>(
                                StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NetworkSourceMac")) {
                awsSecurityFindingFilters.setNetworkSourceMac(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NetworkDestinationIpV4")) {
                awsSecurityFindingFilters.setNetworkDestinationIpV4(new ListUnmarshaller<IpFilter>(
                        IpFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NetworkDestinationIpV6")) {
                awsSecurityFindingFilters.setNetworkDestinationIpV6(new ListUnmarshaller<IpFilter>(
                        IpFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NetworkDestinationPort")) {
                awsSecurityFindingFilters
                        .setNetworkDestinationPort(new ListUnmarshaller<NumberFilter>(
                                NumberFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NetworkDestinationDomain")) {
                awsSecurityFindingFilters
                        .setNetworkDestinationDomain(new ListUnmarshaller<StringFilter>(
                                StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ProcessName")) {
                awsSecurityFindingFilters.setProcessName(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ProcessPath")) {
                awsSecurityFindingFilters.setProcessPath(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ProcessPid")) {
                awsSecurityFindingFilters.setProcessPid(new ListUnmarshaller<NumberFilter>(
                        NumberFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ProcessParentPid")) {
                awsSecurityFindingFilters.setProcessParentPid(new ListUnmarshaller<NumberFilter>(
                        NumberFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ProcessLaunchedAt")) {
                awsSecurityFindingFilters.setProcessLaunchedAt(new ListUnmarshaller<DateFilter>(
                        DateFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ProcessTerminatedAt")) {
                awsSecurityFindingFilters.setProcessTerminatedAt(new ListUnmarshaller<DateFilter>(
                        DateFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ThreatIntelIndicatorType")) {
                awsSecurityFindingFilters
                        .setThreatIntelIndicatorType(new ListUnmarshaller<StringFilter>(
                                StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ThreatIntelIndicatorValue")) {
                awsSecurityFindingFilters
                        .setThreatIntelIndicatorValue(new ListUnmarshaller<StringFilter>(
                                StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ThreatIntelIndicatorCategory")) {
                awsSecurityFindingFilters
                        .setThreatIntelIndicatorCategory(new ListUnmarshaller<StringFilter>(
                                StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ThreatIntelIndicatorLastObservedAt")) {
                awsSecurityFindingFilters
                        .setThreatIntelIndicatorLastObservedAt(new ListUnmarshaller<DateFilter>(
                                DateFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ThreatIntelIndicatorSource")) {
                awsSecurityFindingFilters
                        .setThreatIntelIndicatorSource(new ListUnmarshaller<StringFilter>(
                                StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ThreatIntelIndicatorSourceUrl")) {
                awsSecurityFindingFilters
                        .setThreatIntelIndicatorSourceUrl(new ListUnmarshaller<StringFilter>(
                                StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResourceType")) {
                awsSecurityFindingFilters.setResourceType(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResourceId")) {
                awsSecurityFindingFilters.setResourceId(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResourcePartition")) {
                awsSecurityFindingFilters.setResourcePartition(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResourceRegion")) {
                awsSecurityFindingFilters.setResourceRegion(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResourceTags")) {
                awsSecurityFindingFilters.setResourceTags(new ListUnmarshaller<MapFilter>(
                        MapFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResourceAwsEc2InstanceType")) {
                awsSecurityFindingFilters
                        .setResourceAwsEc2InstanceType(new ListUnmarshaller<StringFilter>(
                                StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResourceAwsEc2InstanceImageId")) {
                awsSecurityFindingFilters
                        .setResourceAwsEc2InstanceImageId(new ListUnmarshaller<StringFilter>(
                                StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResourceAwsEc2InstanceIpV4Addresses")) {
                awsSecurityFindingFilters
                        .setResourceAwsEc2InstanceIpV4Addresses(new ListUnmarshaller<IpFilter>(
                                IpFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResourceAwsEc2InstanceIpV6Addresses")) {
                awsSecurityFindingFilters
                        .setResourceAwsEc2InstanceIpV6Addresses(new ListUnmarshaller<IpFilter>(
                                IpFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResourceAwsEc2InstanceKeyName")) {
                awsSecurityFindingFilters
                        .setResourceAwsEc2InstanceKeyName(new ListUnmarshaller<StringFilter>(
                                StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResourceAwsEc2InstanceIamInstanceProfileArn")) {
                awsSecurityFindingFilters
                        .setResourceAwsEc2InstanceIamInstanceProfileArn(new ListUnmarshaller<StringFilter>(
                                StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResourceAwsEc2InstanceVpcId")) {
                awsSecurityFindingFilters
                        .setResourceAwsEc2InstanceVpcId(new ListUnmarshaller<StringFilter>(
                                StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResourceAwsEc2InstanceSubnetId")) {
                awsSecurityFindingFilters
                        .setResourceAwsEc2InstanceSubnetId(new ListUnmarshaller<StringFilter>(
                                StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResourceAwsEc2InstanceLaunchedAt")) {
                awsSecurityFindingFilters
                        .setResourceAwsEc2InstanceLaunchedAt(new ListUnmarshaller<DateFilter>(
                                DateFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResourceAwsS3BucketOwnerId")) {
                awsSecurityFindingFilters
                        .setResourceAwsS3BucketOwnerId(new ListUnmarshaller<StringFilter>(
                                StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResourceAwsS3BucketOwnerName")) {
                awsSecurityFindingFilters
                        .setResourceAwsS3BucketOwnerName(new ListUnmarshaller<StringFilter>(
                                StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResourceAwsIamAccessKeyUserName")) {
                awsSecurityFindingFilters
                        .setResourceAwsIamAccessKeyUserName(new ListUnmarshaller<StringFilter>(
                                StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResourceAwsIamAccessKeyStatus")) {
                awsSecurityFindingFilters
                        .setResourceAwsIamAccessKeyStatus(new ListUnmarshaller<StringFilter>(
                                StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResourceAwsIamAccessKeyCreatedAt")) {
                awsSecurityFindingFilters
                        .setResourceAwsIamAccessKeyCreatedAt(new ListUnmarshaller<DateFilter>(
                                DateFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResourceContainerName")) {
                awsSecurityFindingFilters
                        .setResourceContainerName(new ListUnmarshaller<StringFilter>(
                                StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResourceContainerImageId")) {
                awsSecurityFindingFilters
                        .setResourceContainerImageId(new ListUnmarshaller<StringFilter>(
                                StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResourceContainerImageName")) {
                awsSecurityFindingFilters
                        .setResourceContainerImageName(new ListUnmarshaller<StringFilter>(
                                StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResourceContainerLaunchedAt")) {
                awsSecurityFindingFilters
                        .setResourceContainerLaunchedAt(new ListUnmarshaller<DateFilter>(
                                DateFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResourceDetailsOther")) {
                awsSecurityFindingFilters.setResourceDetailsOther(new ListUnmarshaller<MapFilter>(
                        MapFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ComplianceStatus")) {
                awsSecurityFindingFilters.setComplianceStatus(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("VerificationState")) {
                awsSecurityFindingFilters.setVerificationState(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("WorkflowState")) {
                awsSecurityFindingFilters.setWorkflowState(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("WorkflowStatus")) {
                awsSecurityFindingFilters.setWorkflowStatus(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RecordState")) {
                awsSecurityFindingFilters.setRecordState(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RelatedFindingsProductArn")) {
                awsSecurityFindingFilters
                        .setRelatedFindingsProductArn(new ListUnmarshaller<StringFilter>(
                                StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RelatedFindingsId")) {
                awsSecurityFindingFilters.setRelatedFindingsId(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NoteText")) {
                awsSecurityFindingFilters.setNoteText(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NoteUpdatedAt")) {
                awsSecurityFindingFilters.setNoteUpdatedAt(new ListUnmarshaller<DateFilter>(
                        DateFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NoteUpdatedBy")) {
                awsSecurityFindingFilters.setNoteUpdatedBy(new ListUnmarshaller<StringFilter>(
                        StringFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Keyword")) {
                awsSecurityFindingFilters.setKeyword(new ListUnmarshaller<KeywordFilter>(
                        KeywordFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return awsSecurityFindingFilters;
    }

    private static AwsSecurityFindingFiltersJsonUnmarshaller instance;

    public static AwsSecurityFindingFiltersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsSecurityFindingFiltersJsonUnmarshaller();
        return instance;
    }
}
