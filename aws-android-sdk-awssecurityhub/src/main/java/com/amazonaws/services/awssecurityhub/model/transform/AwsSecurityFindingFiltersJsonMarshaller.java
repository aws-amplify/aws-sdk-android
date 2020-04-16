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
 * JSON marshaller for POJO AwsSecurityFindingFilters
 */
class AwsSecurityFindingFiltersJsonMarshaller {

    public void marshall(AwsSecurityFindingFilters awsSecurityFindingFilters,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (awsSecurityFindingFilters.getProductArn() != null) {
            java.util.List<StringFilter> productArn = awsSecurityFindingFilters.getProductArn();
            jsonWriter.name("ProductArn");
            jsonWriter.beginArray();
            for (StringFilter productArnItem : productArn) {
                if (productArnItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(productArnItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getAwsAccountId() != null) {
            java.util.List<StringFilter> awsAccountId = awsSecurityFindingFilters.getAwsAccountId();
            jsonWriter.name("AwsAccountId");
            jsonWriter.beginArray();
            for (StringFilter awsAccountIdItem : awsAccountId) {
                if (awsAccountIdItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(awsAccountIdItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getId() != null) {
            java.util.List<StringFilter> id = awsSecurityFindingFilters.getId();
            jsonWriter.name("Id");
            jsonWriter.beginArray();
            for (StringFilter idItem : id) {
                if (idItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(idItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getGeneratorId() != null) {
            java.util.List<StringFilter> generatorId = awsSecurityFindingFilters.getGeneratorId();
            jsonWriter.name("GeneratorId");
            jsonWriter.beginArray();
            for (StringFilter generatorIdItem : generatorId) {
                if (generatorIdItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(generatorIdItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getType() != null) {
            java.util.List<StringFilter> type = awsSecurityFindingFilters.getType();
            jsonWriter.name("Type");
            jsonWriter.beginArray();
            for (StringFilter typeItem : type) {
                if (typeItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(typeItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getFirstObservedAt() != null) {
            java.util.List<DateFilter> firstObservedAt = awsSecurityFindingFilters
                    .getFirstObservedAt();
            jsonWriter.name("FirstObservedAt");
            jsonWriter.beginArray();
            for (DateFilter firstObservedAtItem : firstObservedAt) {
                if (firstObservedAtItem != null) {
                    DateFilterJsonMarshaller.getInstance()
                            .marshall(firstObservedAtItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getLastObservedAt() != null) {
            java.util.List<DateFilter> lastObservedAt = awsSecurityFindingFilters
                    .getLastObservedAt();
            jsonWriter.name("LastObservedAt");
            jsonWriter.beginArray();
            for (DateFilter lastObservedAtItem : lastObservedAt) {
                if (lastObservedAtItem != null) {
                    DateFilterJsonMarshaller.getInstance().marshall(lastObservedAtItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getCreatedAt() != null) {
            java.util.List<DateFilter> createdAt = awsSecurityFindingFilters.getCreatedAt();
            jsonWriter.name("CreatedAt");
            jsonWriter.beginArray();
            for (DateFilter createdAtItem : createdAt) {
                if (createdAtItem != null) {
                    DateFilterJsonMarshaller.getInstance().marshall(createdAtItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getUpdatedAt() != null) {
            java.util.List<DateFilter> updatedAt = awsSecurityFindingFilters.getUpdatedAt();
            jsonWriter.name("UpdatedAt");
            jsonWriter.beginArray();
            for (DateFilter updatedAtItem : updatedAt) {
                if (updatedAtItem != null) {
                    DateFilterJsonMarshaller.getInstance().marshall(updatedAtItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getSeverityProduct() != null) {
            java.util.List<NumberFilter> severityProduct = awsSecurityFindingFilters
                    .getSeverityProduct();
            jsonWriter.name("SeverityProduct");
            jsonWriter.beginArray();
            for (NumberFilter severityProductItem : severityProduct) {
                if (severityProductItem != null) {
                    NumberFilterJsonMarshaller.getInstance().marshall(severityProductItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getSeverityNormalized() != null) {
            java.util.List<NumberFilter> severityNormalized = awsSecurityFindingFilters
                    .getSeverityNormalized();
            jsonWriter.name("SeverityNormalized");
            jsonWriter.beginArray();
            for (NumberFilter severityNormalizedItem : severityNormalized) {
                if (severityNormalizedItem != null) {
                    NumberFilterJsonMarshaller.getInstance().marshall(severityNormalizedItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getSeverityLabel() != null) {
            java.util.List<StringFilter> severityLabel = awsSecurityFindingFilters
                    .getSeverityLabel();
            jsonWriter.name("SeverityLabel");
            jsonWriter.beginArray();
            for (StringFilter severityLabelItem : severityLabel) {
                if (severityLabelItem != null) {
                    StringFilterJsonMarshaller.getInstance()
                            .marshall(severityLabelItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getConfidence() != null) {
            java.util.List<NumberFilter> confidence = awsSecurityFindingFilters.getConfidence();
            jsonWriter.name("Confidence");
            jsonWriter.beginArray();
            for (NumberFilter confidenceItem : confidence) {
                if (confidenceItem != null) {
                    NumberFilterJsonMarshaller.getInstance().marshall(confidenceItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getCriticality() != null) {
            java.util.List<NumberFilter> criticality = awsSecurityFindingFilters.getCriticality();
            jsonWriter.name("Criticality");
            jsonWriter.beginArray();
            for (NumberFilter criticalityItem : criticality) {
                if (criticalityItem != null) {
                    NumberFilterJsonMarshaller.getInstance().marshall(criticalityItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getTitle() != null) {
            java.util.List<StringFilter> title = awsSecurityFindingFilters.getTitle();
            jsonWriter.name("Title");
            jsonWriter.beginArray();
            for (StringFilter titleItem : title) {
                if (titleItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(titleItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getDescription() != null) {
            java.util.List<StringFilter> description = awsSecurityFindingFilters.getDescription();
            jsonWriter.name("Description");
            jsonWriter.beginArray();
            for (StringFilter descriptionItem : description) {
                if (descriptionItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(descriptionItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getRecommendationText() != null) {
            java.util.List<StringFilter> recommendationText = awsSecurityFindingFilters
                    .getRecommendationText();
            jsonWriter.name("RecommendationText");
            jsonWriter.beginArray();
            for (StringFilter recommendationTextItem : recommendationText) {
                if (recommendationTextItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(recommendationTextItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getSourceUrl() != null) {
            java.util.List<StringFilter> sourceUrl = awsSecurityFindingFilters.getSourceUrl();
            jsonWriter.name("SourceUrl");
            jsonWriter.beginArray();
            for (StringFilter sourceUrlItem : sourceUrl) {
                if (sourceUrlItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(sourceUrlItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getProductFields() != null) {
            java.util.List<MapFilter> productFields = awsSecurityFindingFilters.getProductFields();
            jsonWriter.name("ProductFields");
            jsonWriter.beginArray();
            for (MapFilter productFieldsItem : productFields) {
                if (productFieldsItem != null) {
                    MapFilterJsonMarshaller.getInstance().marshall(productFieldsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getProductName() != null) {
            java.util.List<StringFilter> productName = awsSecurityFindingFilters.getProductName();
            jsonWriter.name("ProductName");
            jsonWriter.beginArray();
            for (StringFilter productNameItem : productName) {
                if (productNameItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(productNameItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getCompanyName() != null) {
            java.util.List<StringFilter> companyName = awsSecurityFindingFilters.getCompanyName();
            jsonWriter.name("CompanyName");
            jsonWriter.beginArray();
            for (StringFilter companyNameItem : companyName) {
                if (companyNameItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(companyNameItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getUserDefinedFields() != null) {
            java.util.List<MapFilter> userDefinedFields = awsSecurityFindingFilters
                    .getUserDefinedFields();
            jsonWriter.name("UserDefinedFields");
            jsonWriter.beginArray();
            for (MapFilter userDefinedFieldsItem : userDefinedFields) {
                if (userDefinedFieldsItem != null) {
                    MapFilterJsonMarshaller.getInstance().marshall(userDefinedFieldsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getMalwareName() != null) {
            java.util.List<StringFilter> malwareName = awsSecurityFindingFilters.getMalwareName();
            jsonWriter.name("MalwareName");
            jsonWriter.beginArray();
            for (StringFilter malwareNameItem : malwareName) {
                if (malwareNameItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(malwareNameItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getMalwareType() != null) {
            java.util.List<StringFilter> malwareType = awsSecurityFindingFilters.getMalwareType();
            jsonWriter.name("MalwareType");
            jsonWriter.beginArray();
            for (StringFilter malwareTypeItem : malwareType) {
                if (malwareTypeItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(malwareTypeItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getMalwarePath() != null) {
            java.util.List<StringFilter> malwarePath = awsSecurityFindingFilters.getMalwarePath();
            jsonWriter.name("MalwarePath");
            jsonWriter.beginArray();
            for (StringFilter malwarePathItem : malwarePath) {
                if (malwarePathItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(malwarePathItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getMalwareState() != null) {
            java.util.List<StringFilter> malwareState = awsSecurityFindingFilters.getMalwareState();
            jsonWriter.name("MalwareState");
            jsonWriter.beginArray();
            for (StringFilter malwareStateItem : malwareState) {
                if (malwareStateItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(malwareStateItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getNetworkDirection() != null) {
            java.util.List<StringFilter> networkDirection = awsSecurityFindingFilters
                    .getNetworkDirection();
            jsonWriter.name("NetworkDirection");
            jsonWriter.beginArray();
            for (StringFilter networkDirectionItem : networkDirection) {
                if (networkDirectionItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(networkDirectionItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getNetworkProtocol() != null) {
            java.util.List<StringFilter> networkProtocol = awsSecurityFindingFilters
                    .getNetworkProtocol();
            jsonWriter.name("NetworkProtocol");
            jsonWriter.beginArray();
            for (StringFilter networkProtocolItem : networkProtocol) {
                if (networkProtocolItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(networkProtocolItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getNetworkSourceIpV4() != null) {
            java.util.List<IpFilter> networkSourceIpV4 = awsSecurityFindingFilters
                    .getNetworkSourceIpV4();
            jsonWriter.name("NetworkSourceIpV4");
            jsonWriter.beginArray();
            for (IpFilter networkSourceIpV4Item : networkSourceIpV4) {
                if (networkSourceIpV4Item != null) {
                    IpFilterJsonMarshaller.getInstance()
                            .marshall(networkSourceIpV4Item, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getNetworkSourceIpV6() != null) {
            java.util.List<IpFilter> networkSourceIpV6 = awsSecurityFindingFilters
                    .getNetworkSourceIpV6();
            jsonWriter.name("NetworkSourceIpV6");
            jsonWriter.beginArray();
            for (IpFilter networkSourceIpV6Item : networkSourceIpV6) {
                if (networkSourceIpV6Item != null) {
                    IpFilterJsonMarshaller.getInstance()
                            .marshall(networkSourceIpV6Item, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getNetworkSourcePort() != null) {
            java.util.List<NumberFilter> networkSourcePort = awsSecurityFindingFilters
                    .getNetworkSourcePort();
            jsonWriter.name("NetworkSourcePort");
            jsonWriter.beginArray();
            for (NumberFilter networkSourcePortItem : networkSourcePort) {
                if (networkSourcePortItem != null) {
                    NumberFilterJsonMarshaller.getInstance().marshall(networkSourcePortItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getNetworkSourceDomain() != null) {
            java.util.List<StringFilter> networkSourceDomain = awsSecurityFindingFilters
                    .getNetworkSourceDomain();
            jsonWriter.name("NetworkSourceDomain");
            jsonWriter.beginArray();
            for (StringFilter networkSourceDomainItem : networkSourceDomain) {
                if (networkSourceDomainItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(networkSourceDomainItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getNetworkSourceMac() != null) {
            java.util.List<StringFilter> networkSourceMac = awsSecurityFindingFilters
                    .getNetworkSourceMac();
            jsonWriter.name("NetworkSourceMac");
            jsonWriter.beginArray();
            for (StringFilter networkSourceMacItem : networkSourceMac) {
                if (networkSourceMacItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(networkSourceMacItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getNetworkDestinationIpV4() != null) {
            java.util.List<IpFilter> networkDestinationIpV4 = awsSecurityFindingFilters
                    .getNetworkDestinationIpV4();
            jsonWriter.name("NetworkDestinationIpV4");
            jsonWriter.beginArray();
            for (IpFilter networkDestinationIpV4Item : networkDestinationIpV4) {
                if (networkDestinationIpV4Item != null) {
                    IpFilterJsonMarshaller.getInstance().marshall(networkDestinationIpV4Item,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getNetworkDestinationIpV6() != null) {
            java.util.List<IpFilter> networkDestinationIpV6 = awsSecurityFindingFilters
                    .getNetworkDestinationIpV6();
            jsonWriter.name("NetworkDestinationIpV6");
            jsonWriter.beginArray();
            for (IpFilter networkDestinationIpV6Item : networkDestinationIpV6) {
                if (networkDestinationIpV6Item != null) {
                    IpFilterJsonMarshaller.getInstance().marshall(networkDestinationIpV6Item,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getNetworkDestinationPort() != null) {
            java.util.List<NumberFilter> networkDestinationPort = awsSecurityFindingFilters
                    .getNetworkDestinationPort();
            jsonWriter.name("NetworkDestinationPort");
            jsonWriter.beginArray();
            for (NumberFilter networkDestinationPortItem : networkDestinationPort) {
                if (networkDestinationPortItem != null) {
                    NumberFilterJsonMarshaller.getInstance().marshall(networkDestinationPortItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getNetworkDestinationDomain() != null) {
            java.util.List<StringFilter> networkDestinationDomain = awsSecurityFindingFilters
                    .getNetworkDestinationDomain();
            jsonWriter.name("NetworkDestinationDomain");
            jsonWriter.beginArray();
            for (StringFilter networkDestinationDomainItem : networkDestinationDomain) {
                if (networkDestinationDomainItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(networkDestinationDomainItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getProcessName() != null) {
            java.util.List<StringFilter> processName = awsSecurityFindingFilters.getProcessName();
            jsonWriter.name("ProcessName");
            jsonWriter.beginArray();
            for (StringFilter processNameItem : processName) {
                if (processNameItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(processNameItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getProcessPath() != null) {
            java.util.List<StringFilter> processPath = awsSecurityFindingFilters.getProcessPath();
            jsonWriter.name("ProcessPath");
            jsonWriter.beginArray();
            for (StringFilter processPathItem : processPath) {
                if (processPathItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(processPathItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getProcessPid() != null) {
            java.util.List<NumberFilter> processPid = awsSecurityFindingFilters.getProcessPid();
            jsonWriter.name("ProcessPid");
            jsonWriter.beginArray();
            for (NumberFilter processPidItem : processPid) {
                if (processPidItem != null) {
                    NumberFilterJsonMarshaller.getInstance().marshall(processPidItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getProcessParentPid() != null) {
            java.util.List<NumberFilter> processParentPid = awsSecurityFindingFilters
                    .getProcessParentPid();
            jsonWriter.name("ProcessParentPid");
            jsonWriter.beginArray();
            for (NumberFilter processParentPidItem : processParentPid) {
                if (processParentPidItem != null) {
                    NumberFilterJsonMarshaller.getInstance().marshall(processParentPidItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getProcessLaunchedAt() != null) {
            java.util.List<DateFilter> processLaunchedAt = awsSecurityFindingFilters
                    .getProcessLaunchedAt();
            jsonWriter.name("ProcessLaunchedAt");
            jsonWriter.beginArray();
            for (DateFilter processLaunchedAtItem : processLaunchedAt) {
                if (processLaunchedAtItem != null) {
                    DateFilterJsonMarshaller.getInstance().marshall(processLaunchedAtItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getProcessTerminatedAt() != null) {
            java.util.List<DateFilter> processTerminatedAt = awsSecurityFindingFilters
                    .getProcessTerminatedAt();
            jsonWriter.name("ProcessTerminatedAt");
            jsonWriter.beginArray();
            for (DateFilter processTerminatedAtItem : processTerminatedAt) {
                if (processTerminatedAtItem != null) {
                    DateFilterJsonMarshaller.getInstance().marshall(processTerminatedAtItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getThreatIntelIndicatorType() != null) {
            java.util.List<StringFilter> threatIntelIndicatorType = awsSecurityFindingFilters
                    .getThreatIntelIndicatorType();
            jsonWriter.name("ThreatIntelIndicatorType");
            jsonWriter.beginArray();
            for (StringFilter threatIntelIndicatorTypeItem : threatIntelIndicatorType) {
                if (threatIntelIndicatorTypeItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(threatIntelIndicatorTypeItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getThreatIntelIndicatorValue() != null) {
            java.util.List<StringFilter> threatIntelIndicatorValue = awsSecurityFindingFilters
                    .getThreatIntelIndicatorValue();
            jsonWriter.name("ThreatIntelIndicatorValue");
            jsonWriter.beginArray();
            for (StringFilter threatIntelIndicatorValueItem : threatIntelIndicatorValue) {
                if (threatIntelIndicatorValueItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(
                            threatIntelIndicatorValueItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getThreatIntelIndicatorCategory() != null) {
            java.util.List<StringFilter> threatIntelIndicatorCategory = awsSecurityFindingFilters
                    .getThreatIntelIndicatorCategory();
            jsonWriter.name("ThreatIntelIndicatorCategory");
            jsonWriter.beginArray();
            for (StringFilter threatIntelIndicatorCategoryItem : threatIntelIndicatorCategory) {
                if (threatIntelIndicatorCategoryItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(
                            threatIntelIndicatorCategoryItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getThreatIntelIndicatorLastObservedAt() != null) {
            java.util.List<DateFilter> threatIntelIndicatorLastObservedAt = awsSecurityFindingFilters
                    .getThreatIntelIndicatorLastObservedAt();
            jsonWriter.name("ThreatIntelIndicatorLastObservedAt");
            jsonWriter.beginArray();
            for (DateFilter threatIntelIndicatorLastObservedAtItem : threatIntelIndicatorLastObservedAt) {
                if (threatIntelIndicatorLastObservedAtItem != null) {
                    DateFilterJsonMarshaller.getInstance().marshall(
                            threatIntelIndicatorLastObservedAtItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getThreatIntelIndicatorSource() != null) {
            java.util.List<StringFilter> threatIntelIndicatorSource = awsSecurityFindingFilters
                    .getThreatIntelIndicatorSource();
            jsonWriter.name("ThreatIntelIndicatorSource");
            jsonWriter.beginArray();
            for (StringFilter threatIntelIndicatorSourceItem : threatIntelIndicatorSource) {
                if (threatIntelIndicatorSourceItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(
                            threatIntelIndicatorSourceItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getThreatIntelIndicatorSourceUrl() != null) {
            java.util.List<StringFilter> threatIntelIndicatorSourceUrl = awsSecurityFindingFilters
                    .getThreatIntelIndicatorSourceUrl();
            jsonWriter.name("ThreatIntelIndicatorSourceUrl");
            jsonWriter.beginArray();
            for (StringFilter threatIntelIndicatorSourceUrlItem : threatIntelIndicatorSourceUrl) {
                if (threatIntelIndicatorSourceUrlItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(
                            threatIntelIndicatorSourceUrlItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getResourceType() != null) {
            java.util.List<StringFilter> resourceType = awsSecurityFindingFilters.getResourceType();
            jsonWriter.name("ResourceType");
            jsonWriter.beginArray();
            for (StringFilter resourceTypeItem : resourceType) {
                if (resourceTypeItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(resourceTypeItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getResourceId() != null) {
            java.util.List<StringFilter> resourceId = awsSecurityFindingFilters.getResourceId();
            jsonWriter.name("ResourceId");
            jsonWriter.beginArray();
            for (StringFilter resourceIdItem : resourceId) {
                if (resourceIdItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(resourceIdItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getResourcePartition() != null) {
            java.util.List<StringFilter> resourcePartition = awsSecurityFindingFilters
                    .getResourcePartition();
            jsonWriter.name("ResourcePartition");
            jsonWriter.beginArray();
            for (StringFilter resourcePartitionItem : resourcePartition) {
                if (resourcePartitionItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(resourcePartitionItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getResourceRegion() != null) {
            java.util.List<StringFilter> resourceRegion = awsSecurityFindingFilters
                    .getResourceRegion();
            jsonWriter.name("ResourceRegion");
            jsonWriter.beginArray();
            for (StringFilter resourceRegionItem : resourceRegion) {
                if (resourceRegionItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(resourceRegionItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getResourceTags() != null) {
            java.util.List<MapFilter> resourceTags = awsSecurityFindingFilters.getResourceTags();
            jsonWriter.name("ResourceTags");
            jsonWriter.beginArray();
            for (MapFilter resourceTagsItem : resourceTags) {
                if (resourceTagsItem != null) {
                    MapFilterJsonMarshaller.getInstance().marshall(resourceTagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getResourceAwsEc2InstanceType() != null) {
            java.util.List<StringFilter> resourceAwsEc2InstanceType = awsSecurityFindingFilters
                    .getResourceAwsEc2InstanceType();
            jsonWriter.name("ResourceAwsEc2InstanceType");
            jsonWriter.beginArray();
            for (StringFilter resourceAwsEc2InstanceTypeItem : resourceAwsEc2InstanceType) {
                if (resourceAwsEc2InstanceTypeItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(
                            resourceAwsEc2InstanceTypeItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getResourceAwsEc2InstanceImageId() != null) {
            java.util.List<StringFilter> resourceAwsEc2InstanceImageId = awsSecurityFindingFilters
                    .getResourceAwsEc2InstanceImageId();
            jsonWriter.name("ResourceAwsEc2InstanceImageId");
            jsonWriter.beginArray();
            for (StringFilter resourceAwsEc2InstanceImageIdItem : resourceAwsEc2InstanceImageId) {
                if (resourceAwsEc2InstanceImageIdItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(
                            resourceAwsEc2InstanceImageIdItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getResourceAwsEc2InstanceIpV4Addresses() != null) {
            java.util.List<IpFilter> resourceAwsEc2InstanceIpV4Addresses = awsSecurityFindingFilters
                    .getResourceAwsEc2InstanceIpV4Addresses();
            jsonWriter.name("ResourceAwsEc2InstanceIpV4Addresses");
            jsonWriter.beginArray();
            for (IpFilter resourceAwsEc2InstanceIpV4AddressesItem : resourceAwsEc2InstanceIpV4Addresses) {
                if (resourceAwsEc2InstanceIpV4AddressesItem != null) {
                    IpFilterJsonMarshaller.getInstance().marshall(
                            resourceAwsEc2InstanceIpV4AddressesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getResourceAwsEc2InstanceIpV6Addresses() != null) {
            java.util.List<IpFilter> resourceAwsEc2InstanceIpV6Addresses = awsSecurityFindingFilters
                    .getResourceAwsEc2InstanceIpV6Addresses();
            jsonWriter.name("ResourceAwsEc2InstanceIpV6Addresses");
            jsonWriter.beginArray();
            for (IpFilter resourceAwsEc2InstanceIpV6AddressesItem : resourceAwsEc2InstanceIpV6Addresses) {
                if (resourceAwsEc2InstanceIpV6AddressesItem != null) {
                    IpFilterJsonMarshaller.getInstance().marshall(
                            resourceAwsEc2InstanceIpV6AddressesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getResourceAwsEc2InstanceKeyName() != null) {
            java.util.List<StringFilter> resourceAwsEc2InstanceKeyName = awsSecurityFindingFilters
                    .getResourceAwsEc2InstanceKeyName();
            jsonWriter.name("ResourceAwsEc2InstanceKeyName");
            jsonWriter.beginArray();
            for (StringFilter resourceAwsEc2InstanceKeyNameItem : resourceAwsEc2InstanceKeyName) {
                if (resourceAwsEc2InstanceKeyNameItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(
                            resourceAwsEc2InstanceKeyNameItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getResourceAwsEc2InstanceIamInstanceProfileArn() != null) {
            java.util.List<StringFilter> resourceAwsEc2InstanceIamInstanceProfileArn = awsSecurityFindingFilters
                    .getResourceAwsEc2InstanceIamInstanceProfileArn();
            jsonWriter.name("ResourceAwsEc2InstanceIamInstanceProfileArn");
            jsonWriter.beginArray();
            for (StringFilter resourceAwsEc2InstanceIamInstanceProfileArnItem : resourceAwsEc2InstanceIamInstanceProfileArn) {
                if (resourceAwsEc2InstanceIamInstanceProfileArnItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(
                            resourceAwsEc2InstanceIamInstanceProfileArnItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getResourceAwsEc2InstanceVpcId() != null) {
            java.util.List<StringFilter> resourceAwsEc2InstanceVpcId = awsSecurityFindingFilters
                    .getResourceAwsEc2InstanceVpcId();
            jsonWriter.name("ResourceAwsEc2InstanceVpcId");
            jsonWriter.beginArray();
            for (StringFilter resourceAwsEc2InstanceVpcIdItem : resourceAwsEc2InstanceVpcId) {
                if (resourceAwsEc2InstanceVpcIdItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(
                            resourceAwsEc2InstanceVpcIdItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getResourceAwsEc2InstanceSubnetId() != null) {
            java.util.List<StringFilter> resourceAwsEc2InstanceSubnetId = awsSecurityFindingFilters
                    .getResourceAwsEc2InstanceSubnetId();
            jsonWriter.name("ResourceAwsEc2InstanceSubnetId");
            jsonWriter.beginArray();
            for (StringFilter resourceAwsEc2InstanceSubnetIdItem : resourceAwsEc2InstanceSubnetId) {
                if (resourceAwsEc2InstanceSubnetIdItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(
                            resourceAwsEc2InstanceSubnetIdItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getResourceAwsEc2InstanceLaunchedAt() != null) {
            java.util.List<DateFilter> resourceAwsEc2InstanceLaunchedAt = awsSecurityFindingFilters
                    .getResourceAwsEc2InstanceLaunchedAt();
            jsonWriter.name("ResourceAwsEc2InstanceLaunchedAt");
            jsonWriter.beginArray();
            for (DateFilter resourceAwsEc2InstanceLaunchedAtItem : resourceAwsEc2InstanceLaunchedAt) {
                if (resourceAwsEc2InstanceLaunchedAtItem != null) {
                    DateFilterJsonMarshaller.getInstance().marshall(
                            resourceAwsEc2InstanceLaunchedAtItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getResourceAwsS3BucketOwnerId() != null) {
            java.util.List<StringFilter> resourceAwsS3BucketOwnerId = awsSecurityFindingFilters
                    .getResourceAwsS3BucketOwnerId();
            jsonWriter.name("ResourceAwsS3BucketOwnerId");
            jsonWriter.beginArray();
            for (StringFilter resourceAwsS3BucketOwnerIdItem : resourceAwsS3BucketOwnerId) {
                if (resourceAwsS3BucketOwnerIdItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(
                            resourceAwsS3BucketOwnerIdItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getResourceAwsS3BucketOwnerName() != null) {
            java.util.List<StringFilter> resourceAwsS3BucketOwnerName = awsSecurityFindingFilters
                    .getResourceAwsS3BucketOwnerName();
            jsonWriter.name("ResourceAwsS3BucketOwnerName");
            jsonWriter.beginArray();
            for (StringFilter resourceAwsS3BucketOwnerNameItem : resourceAwsS3BucketOwnerName) {
                if (resourceAwsS3BucketOwnerNameItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(
                            resourceAwsS3BucketOwnerNameItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getResourceAwsIamAccessKeyUserName() != null) {
            java.util.List<StringFilter> resourceAwsIamAccessKeyUserName = awsSecurityFindingFilters
                    .getResourceAwsIamAccessKeyUserName();
            jsonWriter.name("ResourceAwsIamAccessKeyUserName");
            jsonWriter.beginArray();
            for (StringFilter resourceAwsIamAccessKeyUserNameItem : resourceAwsIamAccessKeyUserName) {
                if (resourceAwsIamAccessKeyUserNameItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(
                            resourceAwsIamAccessKeyUserNameItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getResourceAwsIamAccessKeyStatus() != null) {
            java.util.List<StringFilter> resourceAwsIamAccessKeyStatus = awsSecurityFindingFilters
                    .getResourceAwsIamAccessKeyStatus();
            jsonWriter.name("ResourceAwsIamAccessKeyStatus");
            jsonWriter.beginArray();
            for (StringFilter resourceAwsIamAccessKeyStatusItem : resourceAwsIamAccessKeyStatus) {
                if (resourceAwsIamAccessKeyStatusItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(
                            resourceAwsIamAccessKeyStatusItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getResourceAwsIamAccessKeyCreatedAt() != null) {
            java.util.List<DateFilter> resourceAwsIamAccessKeyCreatedAt = awsSecurityFindingFilters
                    .getResourceAwsIamAccessKeyCreatedAt();
            jsonWriter.name("ResourceAwsIamAccessKeyCreatedAt");
            jsonWriter.beginArray();
            for (DateFilter resourceAwsIamAccessKeyCreatedAtItem : resourceAwsIamAccessKeyCreatedAt) {
                if (resourceAwsIamAccessKeyCreatedAtItem != null) {
                    DateFilterJsonMarshaller.getInstance().marshall(
                            resourceAwsIamAccessKeyCreatedAtItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getResourceContainerName() != null) {
            java.util.List<StringFilter> resourceContainerName = awsSecurityFindingFilters
                    .getResourceContainerName();
            jsonWriter.name("ResourceContainerName");
            jsonWriter.beginArray();
            for (StringFilter resourceContainerNameItem : resourceContainerName) {
                if (resourceContainerNameItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(resourceContainerNameItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getResourceContainerImageId() != null) {
            java.util.List<StringFilter> resourceContainerImageId = awsSecurityFindingFilters
                    .getResourceContainerImageId();
            jsonWriter.name("ResourceContainerImageId");
            jsonWriter.beginArray();
            for (StringFilter resourceContainerImageIdItem : resourceContainerImageId) {
                if (resourceContainerImageIdItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(resourceContainerImageIdItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getResourceContainerImageName() != null) {
            java.util.List<StringFilter> resourceContainerImageName = awsSecurityFindingFilters
                    .getResourceContainerImageName();
            jsonWriter.name("ResourceContainerImageName");
            jsonWriter.beginArray();
            for (StringFilter resourceContainerImageNameItem : resourceContainerImageName) {
                if (resourceContainerImageNameItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(
                            resourceContainerImageNameItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getResourceContainerLaunchedAt() != null) {
            java.util.List<DateFilter> resourceContainerLaunchedAt = awsSecurityFindingFilters
                    .getResourceContainerLaunchedAt();
            jsonWriter.name("ResourceContainerLaunchedAt");
            jsonWriter.beginArray();
            for (DateFilter resourceContainerLaunchedAtItem : resourceContainerLaunchedAt) {
                if (resourceContainerLaunchedAtItem != null) {
                    DateFilterJsonMarshaller.getInstance().marshall(
                            resourceContainerLaunchedAtItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getResourceDetailsOther() != null) {
            java.util.List<MapFilter> resourceDetailsOther = awsSecurityFindingFilters
                    .getResourceDetailsOther();
            jsonWriter.name("ResourceDetailsOther");
            jsonWriter.beginArray();
            for (MapFilter resourceDetailsOtherItem : resourceDetailsOther) {
                if (resourceDetailsOtherItem != null) {
                    MapFilterJsonMarshaller.getInstance().marshall(resourceDetailsOtherItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getComplianceStatus() != null) {
            java.util.List<StringFilter> complianceStatus = awsSecurityFindingFilters
                    .getComplianceStatus();
            jsonWriter.name("ComplianceStatus");
            jsonWriter.beginArray();
            for (StringFilter complianceStatusItem : complianceStatus) {
                if (complianceStatusItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(complianceStatusItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getVerificationState() != null) {
            java.util.List<StringFilter> verificationState = awsSecurityFindingFilters
                    .getVerificationState();
            jsonWriter.name("VerificationState");
            jsonWriter.beginArray();
            for (StringFilter verificationStateItem : verificationState) {
                if (verificationStateItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(verificationStateItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getWorkflowState() != null) {
            java.util.List<StringFilter> workflowState = awsSecurityFindingFilters
                    .getWorkflowState();
            jsonWriter.name("WorkflowState");
            jsonWriter.beginArray();
            for (StringFilter workflowStateItem : workflowState) {
                if (workflowStateItem != null) {
                    StringFilterJsonMarshaller.getInstance()
                            .marshall(workflowStateItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getWorkflowStatus() != null) {
            java.util.List<StringFilter> workflowStatus = awsSecurityFindingFilters
                    .getWorkflowStatus();
            jsonWriter.name("WorkflowStatus");
            jsonWriter.beginArray();
            for (StringFilter workflowStatusItem : workflowStatus) {
                if (workflowStatusItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(workflowStatusItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getRecordState() != null) {
            java.util.List<StringFilter> recordState = awsSecurityFindingFilters.getRecordState();
            jsonWriter.name("RecordState");
            jsonWriter.beginArray();
            for (StringFilter recordStateItem : recordState) {
                if (recordStateItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(recordStateItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getRelatedFindingsProductArn() != null) {
            java.util.List<StringFilter> relatedFindingsProductArn = awsSecurityFindingFilters
                    .getRelatedFindingsProductArn();
            jsonWriter.name("RelatedFindingsProductArn");
            jsonWriter.beginArray();
            for (StringFilter relatedFindingsProductArnItem : relatedFindingsProductArn) {
                if (relatedFindingsProductArnItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(
                            relatedFindingsProductArnItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getRelatedFindingsId() != null) {
            java.util.List<StringFilter> relatedFindingsId = awsSecurityFindingFilters
                    .getRelatedFindingsId();
            jsonWriter.name("RelatedFindingsId");
            jsonWriter.beginArray();
            for (StringFilter relatedFindingsIdItem : relatedFindingsId) {
                if (relatedFindingsIdItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(relatedFindingsIdItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getNoteText() != null) {
            java.util.List<StringFilter> noteText = awsSecurityFindingFilters.getNoteText();
            jsonWriter.name("NoteText");
            jsonWriter.beginArray();
            for (StringFilter noteTextItem : noteText) {
                if (noteTextItem != null) {
                    StringFilterJsonMarshaller.getInstance().marshall(noteTextItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getNoteUpdatedAt() != null) {
            java.util.List<DateFilter> noteUpdatedAt = awsSecurityFindingFilters.getNoteUpdatedAt();
            jsonWriter.name("NoteUpdatedAt");
            jsonWriter.beginArray();
            for (DateFilter noteUpdatedAtItem : noteUpdatedAt) {
                if (noteUpdatedAtItem != null) {
                    DateFilterJsonMarshaller.getInstance().marshall(noteUpdatedAtItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getNoteUpdatedBy() != null) {
            java.util.List<StringFilter> noteUpdatedBy = awsSecurityFindingFilters
                    .getNoteUpdatedBy();
            jsonWriter.name("NoteUpdatedBy");
            jsonWriter.beginArray();
            for (StringFilter noteUpdatedByItem : noteUpdatedBy) {
                if (noteUpdatedByItem != null) {
                    StringFilterJsonMarshaller.getInstance()
                            .marshall(noteUpdatedByItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsSecurityFindingFilters.getKeyword() != null) {
            java.util.List<KeywordFilter> keyword = awsSecurityFindingFilters.getKeyword();
            jsonWriter.name("Keyword");
            jsonWriter.beginArray();
            for (KeywordFilter keywordItem : keyword) {
                if (keywordItem != null) {
                    KeywordFilterJsonMarshaller.getInstance().marshall(keywordItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AwsSecurityFindingFiltersJsonMarshaller instance;

    public static AwsSecurityFindingFiltersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsSecurityFindingFiltersJsonMarshaller();
        return instance;
    }
}
