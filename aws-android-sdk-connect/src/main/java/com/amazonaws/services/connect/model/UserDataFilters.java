/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A filter for the user data.
 * </p>
 */
public class UserDataFilters implements Serializable {
    /**
     * <p>
     * A list of up to 100 queues or ARNs.
     * </p>
     */
    private java.util.List<String> queues;

    /**
     * <p>
     * A filter for the user data based on the contact information that is
     * associated to the user. It contains a list of contact states.
     * </p>
     */
    private ContactFilter contactFilter;

    /**
     * <p>
     * A list of up to 100 routing profile IDs or ARNs.
     * </p>
     */
    private java.util.List<String> routingProfiles;

    /**
     * <p>
     * A list of up to 100 agent IDs or ARNs.
     * </p>
     */
    private java.util.List<String> agents;

    /**
     * <p>
     * A UserHierarchyGroup ID or ARN.
     * </p>
     */
    private java.util.List<String> userHierarchyGroups;

    /**
     * <p>
     * A list of up to 100 queues or ARNs.
     * </p>
     *
     * @return <p>
     *         A list of up to 100 queues or ARNs.
     *         </p>
     */
    public java.util.List<String> getQueues() {
        return queues;
    }

    /**
     * <p>
     * A list of up to 100 queues or ARNs.
     * </p>
     *
     * @param queues <p>
     *            A list of up to 100 queues or ARNs.
     *            </p>
     */
    public void setQueues(java.util.Collection<String> queues) {
        if (queues == null) {
            this.queues = null;
            return;
        }

        this.queues = new java.util.ArrayList<String>(queues);
    }

    /**
     * <p>
     * A list of up to 100 queues or ARNs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queues <p>
     *            A list of up to 100 queues or ARNs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserDataFilters withQueues(String... queues) {
        if (getQueues() == null) {
            this.queues = new java.util.ArrayList<String>(queues.length);
        }
        for (String value : queues) {
            this.queues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 100 queues or ARNs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queues <p>
     *            A list of up to 100 queues or ARNs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserDataFilters withQueues(java.util.Collection<String> queues) {
        setQueues(queues);
        return this;
    }

    /**
     * <p>
     * A filter for the user data based on the contact information that is
     * associated to the user. It contains a list of contact states.
     * </p>
     *
     * @return <p>
     *         A filter for the user data based on the contact information that
     *         is associated to the user. It contains a list of contact states.
     *         </p>
     */
    public ContactFilter getContactFilter() {
        return contactFilter;
    }

    /**
     * <p>
     * A filter for the user data based on the contact information that is
     * associated to the user. It contains a list of contact states.
     * </p>
     *
     * @param contactFilter <p>
     *            A filter for the user data based on the contact information
     *            that is associated to the user. It contains a list of contact
     *            states.
     *            </p>
     */
    public void setContactFilter(ContactFilter contactFilter) {
        this.contactFilter = contactFilter;
    }

    /**
     * <p>
     * A filter for the user data based on the contact information that is
     * associated to the user. It contains a list of contact states.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contactFilter <p>
     *            A filter for the user data based on the contact information
     *            that is associated to the user. It contains a list of contact
     *            states.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserDataFilters withContactFilter(ContactFilter contactFilter) {
        this.contactFilter = contactFilter;
        return this;
    }

    /**
     * <p>
     * A list of up to 100 routing profile IDs or ARNs.
     * </p>
     *
     * @return <p>
     *         A list of up to 100 routing profile IDs or ARNs.
     *         </p>
     */
    public java.util.List<String> getRoutingProfiles() {
        return routingProfiles;
    }

    /**
     * <p>
     * A list of up to 100 routing profile IDs or ARNs.
     * </p>
     *
     * @param routingProfiles <p>
     *            A list of up to 100 routing profile IDs or ARNs.
     *            </p>
     */
    public void setRoutingProfiles(java.util.Collection<String> routingProfiles) {
        if (routingProfiles == null) {
            this.routingProfiles = null;
            return;
        }

        this.routingProfiles = new java.util.ArrayList<String>(routingProfiles);
    }

    /**
     * <p>
     * A list of up to 100 routing profile IDs or ARNs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routingProfiles <p>
     *            A list of up to 100 routing profile IDs or ARNs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserDataFilters withRoutingProfiles(String... routingProfiles) {
        if (getRoutingProfiles() == null) {
            this.routingProfiles = new java.util.ArrayList<String>(routingProfiles.length);
        }
        for (String value : routingProfiles) {
            this.routingProfiles.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 100 routing profile IDs or ARNs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routingProfiles <p>
     *            A list of up to 100 routing profile IDs or ARNs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserDataFilters withRoutingProfiles(java.util.Collection<String> routingProfiles) {
        setRoutingProfiles(routingProfiles);
        return this;
    }

    /**
     * <p>
     * A list of up to 100 agent IDs or ARNs.
     * </p>
     *
     * @return <p>
     *         A list of up to 100 agent IDs or ARNs.
     *         </p>
     */
    public java.util.List<String> getAgents() {
        return agents;
    }

    /**
     * <p>
     * A list of up to 100 agent IDs or ARNs.
     * </p>
     *
     * @param agents <p>
     *            A list of up to 100 agent IDs or ARNs.
     *            </p>
     */
    public void setAgents(java.util.Collection<String> agents) {
        if (agents == null) {
            this.agents = null;
            return;
        }

        this.agents = new java.util.ArrayList<String>(agents);
    }

    /**
     * <p>
     * A list of up to 100 agent IDs or ARNs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param agents <p>
     *            A list of up to 100 agent IDs or ARNs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserDataFilters withAgents(String... agents) {
        if (getAgents() == null) {
            this.agents = new java.util.ArrayList<String>(agents.length);
        }
        for (String value : agents) {
            this.agents.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 100 agent IDs or ARNs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param agents <p>
     *            A list of up to 100 agent IDs or ARNs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserDataFilters withAgents(java.util.Collection<String> agents) {
        setAgents(agents);
        return this;
    }

    /**
     * <p>
     * A UserHierarchyGroup ID or ARN.
     * </p>
     *
     * @return <p>
     *         A UserHierarchyGroup ID or ARN.
     *         </p>
     */
    public java.util.List<String> getUserHierarchyGroups() {
        return userHierarchyGroups;
    }

    /**
     * <p>
     * A UserHierarchyGroup ID or ARN.
     * </p>
     *
     * @param userHierarchyGroups <p>
     *            A UserHierarchyGroup ID or ARN.
     *            </p>
     */
    public void setUserHierarchyGroups(java.util.Collection<String> userHierarchyGroups) {
        if (userHierarchyGroups == null) {
            this.userHierarchyGroups = null;
            return;
        }

        this.userHierarchyGroups = new java.util.ArrayList<String>(userHierarchyGroups);
    }

    /**
     * <p>
     * A UserHierarchyGroup ID or ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userHierarchyGroups <p>
     *            A UserHierarchyGroup ID or ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserDataFilters withUserHierarchyGroups(String... userHierarchyGroups) {
        if (getUserHierarchyGroups() == null) {
            this.userHierarchyGroups = new java.util.ArrayList<String>(userHierarchyGroups.length);
        }
        for (String value : userHierarchyGroups) {
            this.userHierarchyGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A UserHierarchyGroup ID or ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userHierarchyGroups <p>
     *            A UserHierarchyGroup ID or ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserDataFilters withUserHierarchyGroups(java.util.Collection<String> userHierarchyGroups) {
        setUserHierarchyGroups(userHierarchyGroups);
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
        if (getQueues() != null)
            sb.append("Queues: " + getQueues() + ",");
        if (getContactFilter() != null)
            sb.append("ContactFilter: " + getContactFilter() + ",");
        if (getRoutingProfiles() != null)
            sb.append("RoutingProfiles: " + getRoutingProfiles() + ",");
        if (getAgents() != null)
            sb.append("Agents: " + getAgents() + ",");
        if (getUserHierarchyGroups() != null)
            sb.append("UserHierarchyGroups: " + getUserHierarchyGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueues() == null) ? 0 : getQueues().hashCode());
        hashCode = prime * hashCode
                + ((getContactFilter() == null) ? 0 : getContactFilter().hashCode());
        hashCode = prime * hashCode
                + ((getRoutingProfiles() == null) ? 0 : getRoutingProfiles().hashCode());
        hashCode = prime * hashCode + ((getAgents() == null) ? 0 : getAgents().hashCode());
        hashCode = prime * hashCode
                + ((getUserHierarchyGroups() == null) ? 0 : getUserHierarchyGroups().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserDataFilters == false)
            return false;
        UserDataFilters other = (UserDataFilters) obj;

        if (other.getQueues() == null ^ this.getQueues() == null)
            return false;
        if (other.getQueues() != null && other.getQueues().equals(this.getQueues()) == false)
            return false;
        if (other.getContactFilter() == null ^ this.getContactFilter() == null)
            return false;
        if (other.getContactFilter() != null
                && other.getContactFilter().equals(this.getContactFilter()) == false)
            return false;
        if (other.getRoutingProfiles() == null ^ this.getRoutingProfiles() == null)
            return false;
        if (other.getRoutingProfiles() != null
                && other.getRoutingProfiles().equals(this.getRoutingProfiles()) == false)
            return false;
        if (other.getAgents() == null ^ this.getAgents() == null)
            return false;
        if (other.getAgents() != null && other.getAgents().equals(this.getAgents()) == false)
            return false;
        if (other.getUserHierarchyGroups() == null ^ this.getUserHierarchyGroups() == null)
            return false;
        if (other.getUserHierarchyGroups() != null
                && other.getUserHierarchyGroups().equals(this.getUserHierarchyGroups()) == false)
            return false;
        return true;
    }
}
