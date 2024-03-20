/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SearchCriteria
 */
class SearchCriteriaJsonMarshaller {

    public void marshall(SearchCriteria searchCriteria, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (searchCriteria.getAgentIds() != null) {
            java.util.List<String> agentIds = searchCriteria.getAgentIds();
            jsonWriter.name("AgentIds");
            jsonWriter.beginArray();
            for (String agentIdsItem : agentIds) {
                if (agentIdsItem != null) {
                    jsonWriter.value(agentIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (searchCriteria.getAgentHierarchyGroups() != null) {
            AgentHierarchyGroups agentHierarchyGroups = searchCriteria.getAgentHierarchyGroups();
            jsonWriter.name("AgentHierarchyGroups");
            AgentHierarchyGroupsJsonMarshaller.getInstance().marshall(agentHierarchyGroups,
                    jsonWriter);
        }
        if (searchCriteria.getChannels() != null) {
            java.util.List<String> channels = searchCriteria.getChannels();
            jsonWriter.name("Channels");
            jsonWriter.beginArray();
            for (String channelsItem : channels) {
                if (channelsItem != null) {
                    jsonWriter.value(channelsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (searchCriteria.getContactAnalysis() != null) {
            ContactAnalysis contactAnalysis = searchCriteria.getContactAnalysis();
            jsonWriter.name("ContactAnalysis");
            ContactAnalysisJsonMarshaller.getInstance().marshall(contactAnalysis, jsonWriter);
        }
        if (searchCriteria.getInitiationMethods() != null) {
            java.util.List<String> initiationMethods = searchCriteria.getInitiationMethods();
            jsonWriter.name("InitiationMethods");
            jsonWriter.beginArray();
            for (String initiationMethodsItem : initiationMethods) {
                if (initiationMethodsItem != null) {
                    jsonWriter.value(initiationMethodsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (searchCriteria.getQueueIds() != null) {
            java.util.List<String> queueIds = searchCriteria.getQueueIds();
            jsonWriter.name("QueueIds");
            jsonWriter.beginArray();
            for (String queueIdsItem : queueIds) {
                if (queueIdsItem != null) {
                    jsonWriter.value(queueIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (searchCriteria.getSearchableContactAttributes() != null) {
            SearchableContactAttributes searchableContactAttributes = searchCriteria
                    .getSearchableContactAttributes();
            jsonWriter.name("SearchableContactAttributes");
            SearchableContactAttributesJsonMarshaller.getInstance().marshall(
                    searchableContactAttributes, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static SearchCriteriaJsonMarshaller instance;

    public static SearchCriteriaJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SearchCriteriaJsonMarshaller();
        return instance;
    }
}
