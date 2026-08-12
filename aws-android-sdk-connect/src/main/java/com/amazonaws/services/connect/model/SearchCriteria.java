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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * A structure of search criteria to be used to return contacts.
 * </p>
 */
public class SearchCriteria implements Serializable {
    /**
     * <p>
     * The identifiers of agents who handled the contacts.
     * </p>
     */
    private java.util.List<String> agentIds;

    /**
     * <p>
     * The agent hierarchy groups of the agent at the time of handling the
     * contact.
     * </p>
     */
    private AgentHierarchyGroups agentHierarchyGroups;

    /**
     * <p>
     * The list of channels associated with contacts.
     * </p>
     */
    private java.util.List<String> channels;

    /**
     * <p>
     * Search criteria based on analysis outputs from Amazon Connect Contact
     * Lens.
     * </p>
     */
    private ContactAnalysis contactAnalysis;

    /**
     * <p>
     * The list of initiation methods associated with contacts.
     * </p>
     */
    private java.util.List<String> initiationMethods;

    /**
     * <p>
     * The list of queue IDs associated with contacts.
     * </p>
     */
    private java.util.List<String> queueIds;

    /**
     * <p>
     * The search criteria based on user-defined contact attributes that have
     * been configured for contact search. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/search-custom-attributes.html"
     * >Search by custom contact attributes</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * <important>
     * <p>
     * To use <code>SearchableContactAttributes</code> in a search request, the
     * <code>GetContactAttributes</code> action is required to perform an API
     * request. For more information, see <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-actions-as-permissions"
     * >https://docs.aws.amazon.com/service-authorization/latest/reference/
     * list_amazonconnect.html#amazonconnect-actions-as-permissions</a>Actions
     * defined by Amazon Connect.
     * </p>
     * </important>
     */
    private SearchableContactAttributes searchableContactAttributes;

    /**
     * <p>
     * The identifiers of agents who handled the contacts.
     * </p>
     *
     * @return <p>
     *         The identifiers of agents who handled the contacts.
     *         </p>
     */
    public java.util.List<String> getAgentIds() {
        return agentIds;
    }

    /**
     * <p>
     * The identifiers of agents who handled the contacts.
     * </p>
     *
     * @param agentIds <p>
     *            The identifiers of agents who handled the contacts.
     *            </p>
     */
    public void setAgentIds(java.util.Collection<String> agentIds) {
        if (agentIds == null) {
            this.agentIds = null;
            return;
        }

        this.agentIds = new java.util.ArrayList<String>(agentIds);
    }

    /**
     * <p>
     * The identifiers of agents who handled the contacts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param agentIds <p>
     *            The identifiers of agents who handled the contacts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchCriteria withAgentIds(String... agentIds) {
        if (getAgentIds() == null) {
            this.agentIds = new java.util.ArrayList<String>(agentIds.length);
        }
        for (String value : agentIds) {
            this.agentIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers of agents who handled the contacts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param agentIds <p>
     *            The identifiers of agents who handled the contacts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchCriteria withAgentIds(java.util.Collection<String> agentIds) {
        setAgentIds(agentIds);
        return this;
    }

    /**
     * <p>
     * The agent hierarchy groups of the agent at the time of handling the
     * contact.
     * </p>
     *
     * @return <p>
     *         The agent hierarchy groups of the agent at the time of handling
     *         the contact.
     *         </p>
     */
    public AgentHierarchyGroups getAgentHierarchyGroups() {
        return agentHierarchyGroups;
    }

    /**
     * <p>
     * The agent hierarchy groups of the agent at the time of handling the
     * contact.
     * </p>
     *
     * @param agentHierarchyGroups <p>
     *            The agent hierarchy groups of the agent at the time of
     *            handling the contact.
     *            </p>
     */
    public void setAgentHierarchyGroups(AgentHierarchyGroups agentHierarchyGroups) {
        this.agentHierarchyGroups = agentHierarchyGroups;
    }

    /**
     * <p>
     * The agent hierarchy groups of the agent at the time of handling the
     * contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param agentHierarchyGroups <p>
     *            The agent hierarchy groups of the agent at the time of
     *            handling the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchCriteria withAgentHierarchyGroups(AgentHierarchyGroups agentHierarchyGroups) {
        this.agentHierarchyGroups = agentHierarchyGroups;
        return this;
    }

    /**
     * <p>
     * The list of channels associated with contacts.
     * </p>
     *
     * @return <p>
     *         The list of channels associated with contacts.
     *         </p>
     */
    public java.util.List<String> getChannels() {
        return channels;
    }

    /**
     * <p>
     * The list of channels associated with contacts.
     * </p>
     *
     * @param channels <p>
     *            The list of channels associated with contacts.
     *            </p>
     */
    public void setChannels(java.util.Collection<String> channels) {
        if (channels == null) {
            this.channels = null;
            return;
        }

        this.channels = new java.util.ArrayList<String>(channels);
    }

    /**
     * <p>
     * The list of channels associated with contacts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channels <p>
     *            The list of channels associated with contacts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchCriteria withChannels(String... channels) {
        if (getChannels() == null) {
            this.channels = new java.util.ArrayList<String>(channels.length);
        }
        for (String value : channels) {
            this.channels.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of channels associated with contacts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channels <p>
     *            The list of channels associated with contacts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchCriteria withChannels(java.util.Collection<String> channels) {
        setChannels(channels);
        return this;
    }

    /**
     * <p>
     * Search criteria based on analysis outputs from Amazon Connect Contact
     * Lens.
     * </p>
     *
     * @return <p>
     *         Search criteria based on analysis outputs from Amazon Connect
     *         Contact Lens.
     *         </p>
     */
    public ContactAnalysis getContactAnalysis() {
        return contactAnalysis;
    }

    /**
     * <p>
     * Search criteria based on analysis outputs from Amazon Connect Contact
     * Lens.
     * </p>
     *
     * @param contactAnalysis <p>
     *            Search criteria based on analysis outputs from Amazon Connect
     *            Contact Lens.
     *            </p>
     */
    public void setContactAnalysis(ContactAnalysis contactAnalysis) {
        this.contactAnalysis = contactAnalysis;
    }

    /**
     * <p>
     * Search criteria based on analysis outputs from Amazon Connect Contact
     * Lens.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contactAnalysis <p>
     *            Search criteria based on analysis outputs from Amazon Connect
     *            Contact Lens.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchCriteria withContactAnalysis(ContactAnalysis contactAnalysis) {
        this.contactAnalysis = contactAnalysis;
        return this;
    }

    /**
     * <p>
     * The list of initiation methods associated with contacts.
     * </p>
     *
     * @return <p>
     *         The list of initiation methods associated with contacts.
     *         </p>
     */
    public java.util.List<String> getInitiationMethods() {
        return initiationMethods;
    }

    /**
     * <p>
     * The list of initiation methods associated with contacts.
     * </p>
     *
     * @param initiationMethods <p>
     *            The list of initiation methods associated with contacts.
     *            </p>
     */
    public void setInitiationMethods(java.util.Collection<String> initiationMethods) {
        if (initiationMethods == null) {
            this.initiationMethods = null;
            return;
        }

        this.initiationMethods = new java.util.ArrayList<String>(initiationMethods);
    }

    /**
     * <p>
     * The list of initiation methods associated with contacts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param initiationMethods <p>
     *            The list of initiation methods associated with contacts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchCriteria withInitiationMethods(String... initiationMethods) {
        if (getInitiationMethods() == null) {
            this.initiationMethods = new java.util.ArrayList<String>(initiationMethods.length);
        }
        for (String value : initiationMethods) {
            this.initiationMethods.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of initiation methods associated with contacts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param initiationMethods <p>
     *            The list of initiation methods associated with contacts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchCriteria withInitiationMethods(java.util.Collection<String> initiationMethods) {
        setInitiationMethods(initiationMethods);
        return this;
    }

    /**
     * <p>
     * The list of queue IDs associated with contacts.
     * </p>
     *
     * @return <p>
     *         The list of queue IDs associated with contacts.
     *         </p>
     */
    public java.util.List<String> getQueueIds() {
        return queueIds;
    }

    /**
     * <p>
     * The list of queue IDs associated with contacts.
     * </p>
     *
     * @param queueIds <p>
     *            The list of queue IDs associated with contacts.
     *            </p>
     */
    public void setQueueIds(java.util.Collection<String> queueIds) {
        if (queueIds == null) {
            this.queueIds = null;
            return;
        }

        this.queueIds = new java.util.ArrayList<String>(queueIds);
    }

    /**
     * <p>
     * The list of queue IDs associated with contacts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueIds <p>
     *            The list of queue IDs associated with contacts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchCriteria withQueueIds(String... queueIds) {
        if (getQueueIds() == null) {
            this.queueIds = new java.util.ArrayList<String>(queueIds.length);
        }
        for (String value : queueIds) {
            this.queueIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of queue IDs associated with contacts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueIds <p>
     *            The list of queue IDs associated with contacts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchCriteria withQueueIds(java.util.Collection<String> queueIds) {
        setQueueIds(queueIds);
        return this;
    }

    /**
     * <p>
     * The search criteria based on user-defined contact attributes that have
     * been configured for contact search. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/search-custom-attributes.html"
     * >Search by custom contact attributes</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * <important>
     * <p>
     * To use <code>SearchableContactAttributes</code> in a search request, the
     * <code>GetContactAttributes</code> action is required to perform an API
     * request. For more information, see <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-actions-as-permissions"
     * >https://docs.aws.amazon.com/service-authorization/latest/reference/
     * list_amazonconnect.html#amazonconnect-actions-as-permissions</a>Actions
     * defined by Amazon Connect.
     * </p>
     * </important>
     *
     * @return <p>
     *         The search criteria based on user-defined contact attributes that
     *         have been configured for contact search. For more information,
     *         see <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/search-custom-attributes.html"
     *         >Search by custom contact attributes</a> in the <i>Amazon Connect
     *         Administrator Guide</i>.
     *         </p>
     *         <important>
     *         <p>
     *         To use <code>SearchableContactAttributes</code> in a search
     *         request, the <code>GetContactAttributes</code> action is required
     *         to perform an API request. For more information, see <a href=
     *         "https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-actions-as-permissions"
     *         >https://docs.aws.amazon.com/service-authorization/latest/
     *         reference
     *         /list_amazonconnect.html#amazonconnect-actions-as-permissions
     *         </a>Actions defined by Amazon Connect.
     *         </p>
     *         </important>
     */
    public SearchableContactAttributes getSearchableContactAttributes() {
        return searchableContactAttributes;
    }

    /**
     * <p>
     * The search criteria based on user-defined contact attributes that have
     * been configured for contact search. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/search-custom-attributes.html"
     * >Search by custom contact attributes</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * <important>
     * <p>
     * To use <code>SearchableContactAttributes</code> in a search request, the
     * <code>GetContactAttributes</code> action is required to perform an API
     * request. For more information, see <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-actions-as-permissions"
     * >https://docs.aws.amazon.com/service-authorization/latest/reference/
     * list_amazonconnect.html#amazonconnect-actions-as-permissions</a>Actions
     * defined by Amazon Connect.
     * </p>
     * </important>
     *
     * @param searchableContactAttributes <p>
     *            The search criteria based on user-defined contact attributes
     *            that have been configured for contact search. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/search-custom-attributes.html"
     *            >Search by custom contact attributes</a> in the <i>Amazon
     *            Connect Administrator Guide</i>.
     *            </p>
     *            <important>
     *            <p>
     *            To use <code>SearchableContactAttributes</code> in a search
     *            request, the <code>GetContactAttributes</code> action is
     *            required to perform an API request. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-actions-as-permissions"
     *            >https://docs.aws.amazon.com/service-authorization/latest/
     *            reference
     *            /list_amazonconnect.html#amazonconnect-actions-as-permissions
     *            </a>Actions defined by Amazon Connect.
     *            </p>
     *            </important>
     */
    public void setSearchableContactAttributes(
            SearchableContactAttributes searchableContactAttributes) {
        this.searchableContactAttributes = searchableContactAttributes;
    }

    /**
     * <p>
     * The search criteria based on user-defined contact attributes that have
     * been configured for contact search. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/search-custom-attributes.html"
     * >Search by custom contact attributes</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * <important>
     * <p>
     * To use <code>SearchableContactAttributes</code> in a search request, the
     * <code>GetContactAttributes</code> action is required to perform an API
     * request. For more information, see <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-actions-as-permissions"
     * >https://docs.aws.amazon.com/service-authorization/latest/reference/
     * list_amazonconnect.html#amazonconnect-actions-as-permissions</a>Actions
     * defined by Amazon Connect.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param searchableContactAttributes <p>
     *            The search criteria based on user-defined contact attributes
     *            that have been configured for contact search. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/search-custom-attributes.html"
     *            >Search by custom contact attributes</a> in the <i>Amazon
     *            Connect Administrator Guide</i>.
     *            </p>
     *            <important>
     *            <p>
     *            To use <code>SearchableContactAttributes</code> in a search
     *            request, the <code>GetContactAttributes</code> action is
     *            required to perform an API request. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-actions-as-permissions"
     *            >https://docs.aws.amazon.com/service-authorization/latest/
     *            reference
     *            /list_amazonconnect.html#amazonconnect-actions-as-permissions
     *            </a>Actions defined by Amazon Connect.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchCriteria withSearchableContactAttributes(
            SearchableContactAttributes searchableContactAttributes) {
        this.searchableContactAttributes = searchableContactAttributes;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAgentIds() != null)
            sb.append("AgentIds: " + getAgentIds() + ",");
        if (getAgentHierarchyGroups() != null)
            sb.append("AgentHierarchyGroups: " + getAgentHierarchyGroups() + ",");
        if (getChannels() != null)
            sb.append("Channels: " + getChannels() + ",");
        if (getContactAnalysis() != null)
            sb.append("ContactAnalysis: " + getContactAnalysis() + ",");
        if (getInitiationMethods() != null)
            sb.append("InitiationMethods: " + getInitiationMethods() + ",");
        if (getQueueIds() != null)
            sb.append("QueueIds: " + getQueueIds() + ",");
        if (getSearchableContactAttributes() != null)
            sb.append("SearchableContactAttributes: " + getSearchableContactAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentIds() == null) ? 0 : getAgentIds().hashCode());
        hashCode = prime * hashCode
                + ((getAgentHierarchyGroups() == null) ? 0 : getAgentHierarchyGroups().hashCode());
        hashCode = prime * hashCode + ((getChannels() == null) ? 0 : getChannels().hashCode());
        hashCode = prime * hashCode
                + ((getContactAnalysis() == null) ? 0 : getContactAnalysis().hashCode());
        hashCode = prime * hashCode
                + ((getInitiationMethods() == null) ? 0 : getInitiationMethods().hashCode());
        hashCode = prime * hashCode + ((getQueueIds() == null) ? 0 : getQueueIds().hashCode());
        hashCode = prime
                * hashCode
                + ((getSearchableContactAttributes() == null) ? 0
                        : getSearchableContactAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchCriteria == false)
            return false;
        SearchCriteria other = (SearchCriteria) obj;

        if (other.getAgentIds() == null ^ this.getAgentIds() == null)
            return false;
        if (other.getAgentIds() != null && other.getAgentIds().equals(this.getAgentIds()) == false)
            return false;
        if (other.getAgentHierarchyGroups() == null ^ this.getAgentHierarchyGroups() == null)
            return false;
        if (other.getAgentHierarchyGroups() != null
                && other.getAgentHierarchyGroups().equals(this.getAgentHierarchyGroups()) == false)
            return false;
        if (other.getChannels() == null ^ this.getChannels() == null)
            return false;
        if (other.getChannels() != null && other.getChannels().equals(this.getChannels()) == false)
            return false;
        if (other.getContactAnalysis() == null ^ this.getContactAnalysis() == null)
            return false;
        if (other.getContactAnalysis() != null
                && other.getContactAnalysis().equals(this.getContactAnalysis()) == false)
            return false;
        if (other.getInitiationMethods() == null ^ this.getInitiationMethods() == null)
            return false;
        if (other.getInitiationMethods() != null
                && other.getInitiationMethods().equals(this.getInitiationMethods()) == false)
            return false;
        if (other.getQueueIds() == null ^ this.getQueueIds() == null)
            return false;
        if (other.getQueueIds() != null && other.getQueueIds().equals(this.getQueueIds()) == false)
            return false;
        if (other.getSearchableContactAttributes() == null
                ^ this.getSearchableContactAttributes() == null)
            return false;
        if (other.getSearchableContactAttributes() != null
                && other.getSearchableContactAttributes().equals(
                        this.getSearchableContactAttributes()) == false)
            return false;
        return true;
    }
}
