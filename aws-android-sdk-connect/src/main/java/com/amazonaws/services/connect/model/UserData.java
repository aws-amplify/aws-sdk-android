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
 * Data for a user.
 * </p>
 */
public class UserData implements Serializable {
    /**
     * <p>
     * Information about the user for the data that is returned. It contains the
     * <code>resourceId</code> and ARN of the user.
     * </p>
     */
    private UserReference user;

    /**
     * <p>
     * Information about the routing profile that is assigned to the user.
     * </p>
     */
    private RoutingProfileReference routingProfile;

    /**
     * <p>
     * Contains information about the levels of a hierarchy group assigned to a
     * user.
     * </p>
     */
    private HierarchyPathReference hierarchyPath;

    /**
     * <p>
     * The status of the agent that they manually set in their Contact Control
     * Panel (CCP), or that the supervisor manually changes in the real-time
     * metrics report.
     * </p>
     */
    private AgentStatusReference status;

    /**
     * <p>
     * A map of available slots by channel. The key is a channel name. The value
     * is an integer: the available number of slots.
     * </p>
     */
    private java.util.Map<String, Integer> availableSlotsByChannel;

    /**
     * <p>
     * A map of maximum slots by channel. The key is a channel name. The value
     * is an integer: the maximum number of slots. This is calculated from <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_MediaConcurrency.html"
     * >MediaConcurrency</a> of the <code>RoutingProfile</code> assigned to the
     * agent.
     * </p>
     */
    private java.util.Map<String, Integer> maxSlotsByChannel;

    /**
     * <p>
     * A map of active slots by channel. The key is a channel name. The value is
     * an integer: the number of active slots.
     * </p>
     */
    private java.util.Map<String, Integer> activeSlotsByChannel;

    /**
     * <p>
     * A list of contact reference information.
     * </p>
     */
    private java.util.List<AgentContactReference> contacts;

    /**
     * <p>
     * The Next status of the agent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     */
    private String nextStatus;

    /**
     * <p>
     * Information about the user for the data that is returned. It contains the
     * <code>resourceId</code> and ARN of the user.
     * </p>
     *
     * @return <p>
     *         Information about the user for the data that is returned. It
     *         contains the <code>resourceId</code> and ARN of the user.
     *         </p>
     */
    public UserReference getUser() {
        return user;
    }

    /**
     * <p>
     * Information about the user for the data that is returned. It contains the
     * <code>resourceId</code> and ARN of the user.
     * </p>
     *
     * @param user <p>
     *            Information about the user for the data that is returned. It
     *            contains the <code>resourceId</code> and ARN of the user.
     *            </p>
     */
    public void setUser(UserReference user) {
        this.user = user;
    }

    /**
     * <p>
     * Information about the user for the data that is returned. It contains the
     * <code>resourceId</code> and ARN of the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param user <p>
     *            Information about the user for the data that is returned. It
     *            contains the <code>resourceId</code> and ARN of the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserData withUser(UserReference user) {
        this.user = user;
        return this;
    }

    /**
     * <p>
     * Information about the routing profile that is assigned to the user.
     * </p>
     *
     * @return <p>
     *         Information about the routing profile that is assigned to the
     *         user.
     *         </p>
     */
    public RoutingProfileReference getRoutingProfile() {
        return routingProfile;
    }

    /**
     * <p>
     * Information about the routing profile that is assigned to the user.
     * </p>
     *
     * @param routingProfile <p>
     *            Information about the routing profile that is assigned to the
     *            user.
     *            </p>
     */
    public void setRoutingProfile(RoutingProfileReference routingProfile) {
        this.routingProfile = routingProfile;
    }

    /**
     * <p>
     * Information about the routing profile that is assigned to the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routingProfile <p>
     *            Information about the routing profile that is assigned to the
     *            user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserData withRoutingProfile(RoutingProfileReference routingProfile) {
        this.routingProfile = routingProfile;
        return this;
    }

    /**
     * <p>
     * Contains information about the levels of a hierarchy group assigned to a
     * user.
     * </p>
     *
     * @return <p>
     *         Contains information about the levels of a hierarchy group
     *         assigned to a user.
     *         </p>
     */
    public HierarchyPathReference getHierarchyPath() {
        return hierarchyPath;
    }

    /**
     * <p>
     * Contains information about the levels of a hierarchy group assigned to a
     * user.
     * </p>
     *
     * @param hierarchyPath <p>
     *            Contains information about the levels of a hierarchy group
     *            assigned to a user.
     *            </p>
     */
    public void setHierarchyPath(HierarchyPathReference hierarchyPath) {
        this.hierarchyPath = hierarchyPath;
    }

    /**
     * <p>
     * Contains information about the levels of a hierarchy group assigned to a
     * user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hierarchyPath <p>
     *            Contains information about the levels of a hierarchy group
     *            assigned to a user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserData withHierarchyPath(HierarchyPathReference hierarchyPath) {
        this.hierarchyPath = hierarchyPath;
        return this;
    }

    /**
     * <p>
     * The status of the agent that they manually set in their Contact Control
     * Panel (CCP), or that the supervisor manually changes in the real-time
     * metrics report.
     * </p>
     *
     * @return <p>
     *         The status of the agent that they manually set in their Contact
     *         Control Panel (CCP), or that the supervisor manually changes in
     *         the real-time metrics report.
     *         </p>
     */
    public AgentStatusReference getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the agent that they manually set in their Contact Control
     * Panel (CCP), or that the supervisor manually changes in the real-time
     * metrics report.
     * </p>
     *
     * @param status <p>
     *            The status of the agent that they manually set in their
     *            Contact Control Panel (CCP), or that the supervisor manually
     *            changes in the real-time metrics report.
     *            </p>
     */
    public void setStatus(AgentStatusReference status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the agent that they manually set in their Contact Control
     * Panel (CCP), or that the supervisor manually changes in the real-time
     * metrics report.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the agent that they manually set in their
     *            Contact Control Panel (CCP), or that the supervisor manually
     *            changes in the real-time metrics report.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserData withStatus(AgentStatusReference status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * A map of available slots by channel. The key is a channel name. The value
     * is an integer: the available number of slots.
     * </p>
     *
     * @return <p>
     *         A map of available slots by channel. The key is a channel name.
     *         The value is an integer: the available number of slots.
     *         </p>
     */
    public java.util.Map<String, Integer> getAvailableSlotsByChannel() {
        return availableSlotsByChannel;
    }

    /**
     * <p>
     * A map of available slots by channel. The key is a channel name. The value
     * is an integer: the available number of slots.
     * </p>
     *
     * @param availableSlotsByChannel <p>
     *            A map of available slots by channel. The key is a channel
     *            name. The value is an integer: the available number of slots.
     *            </p>
     */
    public void setAvailableSlotsByChannel(java.util.Map<String, Integer> availableSlotsByChannel) {
        this.availableSlotsByChannel = availableSlotsByChannel;
    }

    /**
     * <p>
     * A map of available slots by channel. The key is a channel name. The value
     * is an integer: the available number of slots.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availableSlotsByChannel <p>
     *            A map of available slots by channel. The key is a channel
     *            name. The value is an integer: the available number of slots.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserData withAvailableSlotsByChannel(
            java.util.Map<String, Integer> availableSlotsByChannel) {
        this.availableSlotsByChannel = availableSlotsByChannel;
        return this;
    }

    /**
     * <p>
     * A map of available slots by channel. The key is a channel name. The value
     * is an integer: the available number of slots.
     * </p>
     * <p>
     * The method adds a new key-value pair into AvailableSlotsByChannel
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into AvailableSlotsByChannel.
     * @param value The corresponding value of the entry to be added into
     *            AvailableSlotsByChannel.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserData addAvailableSlotsByChannelEntry(String key, Integer value) {
        if (null == this.availableSlotsByChannel) {
            this.availableSlotsByChannel = new java.util.HashMap<String, Integer>();
        }
        if (this.availableSlotsByChannel.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.availableSlotsByChannel.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AvailableSlotsByChannel.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UserData clearAvailableSlotsByChannelEntries() {
        this.availableSlotsByChannel = null;
        return this;
    }

    /**
     * <p>
     * A map of maximum slots by channel. The key is a channel name. The value
     * is an integer: the maximum number of slots. This is calculated from <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_MediaConcurrency.html"
     * >MediaConcurrency</a> of the <code>RoutingProfile</code> assigned to the
     * agent.
     * </p>
     *
     * @return <p>
     *         A map of maximum slots by channel. The key is a channel name. The
     *         value is an integer: the maximum number of slots. This is
     *         calculated from <a href=
     *         "https://docs.aws.amazon.com/connect/latest/APIReference/API_MediaConcurrency.html"
     *         >MediaConcurrency</a> of the <code>RoutingProfile</code> assigned
     *         to the agent.
     *         </p>
     */
    public java.util.Map<String, Integer> getMaxSlotsByChannel() {
        return maxSlotsByChannel;
    }

    /**
     * <p>
     * A map of maximum slots by channel. The key is a channel name. The value
     * is an integer: the maximum number of slots. This is calculated from <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_MediaConcurrency.html"
     * >MediaConcurrency</a> of the <code>RoutingProfile</code> assigned to the
     * agent.
     * </p>
     *
     * @param maxSlotsByChannel <p>
     *            A map of maximum slots by channel. The key is a channel name.
     *            The value is an integer: the maximum number of slots. This is
     *            calculated from <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_MediaConcurrency.html"
     *            >MediaConcurrency</a> of the <code>RoutingProfile</code>
     *            assigned to the agent.
     *            </p>
     */
    public void setMaxSlotsByChannel(java.util.Map<String, Integer> maxSlotsByChannel) {
        this.maxSlotsByChannel = maxSlotsByChannel;
    }

    /**
     * <p>
     * A map of maximum slots by channel. The key is a channel name. The value
     * is an integer: the maximum number of slots. This is calculated from <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_MediaConcurrency.html"
     * >MediaConcurrency</a> of the <code>RoutingProfile</code> assigned to the
     * agent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxSlotsByChannel <p>
     *            A map of maximum slots by channel. The key is a channel name.
     *            The value is an integer: the maximum number of slots. This is
     *            calculated from <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_MediaConcurrency.html"
     *            >MediaConcurrency</a> of the <code>RoutingProfile</code>
     *            assigned to the agent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserData withMaxSlotsByChannel(java.util.Map<String, Integer> maxSlotsByChannel) {
        this.maxSlotsByChannel = maxSlotsByChannel;
        return this;
    }

    /**
     * <p>
     * A map of maximum slots by channel. The key is a channel name. The value
     * is an integer: the maximum number of slots. This is calculated from <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_MediaConcurrency.html"
     * >MediaConcurrency</a> of the <code>RoutingProfile</code> assigned to the
     * agent.
     * </p>
     * <p>
     * The method adds a new key-value pair into MaxSlotsByChannel parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into MaxSlotsByChannel.
     * @param value The corresponding value of the entry to be added into
     *            MaxSlotsByChannel.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserData addMaxSlotsByChannelEntry(String key, Integer value) {
        if (null == this.maxSlotsByChannel) {
            this.maxSlotsByChannel = new java.util.HashMap<String, Integer>();
        }
        if (this.maxSlotsByChannel.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.maxSlotsByChannel.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MaxSlotsByChannel.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UserData clearMaxSlotsByChannelEntries() {
        this.maxSlotsByChannel = null;
        return this;
    }

    /**
     * <p>
     * A map of active slots by channel. The key is a channel name. The value is
     * an integer: the number of active slots.
     * </p>
     *
     * @return <p>
     *         A map of active slots by channel. The key is a channel name. The
     *         value is an integer: the number of active slots.
     *         </p>
     */
    public java.util.Map<String, Integer> getActiveSlotsByChannel() {
        return activeSlotsByChannel;
    }

    /**
     * <p>
     * A map of active slots by channel. The key is a channel name. The value is
     * an integer: the number of active slots.
     * </p>
     *
     * @param activeSlotsByChannel <p>
     *            A map of active slots by channel. The key is a channel name.
     *            The value is an integer: the number of active slots.
     *            </p>
     */
    public void setActiveSlotsByChannel(java.util.Map<String, Integer> activeSlotsByChannel) {
        this.activeSlotsByChannel = activeSlotsByChannel;
    }

    /**
     * <p>
     * A map of active slots by channel. The key is a channel name. The value is
     * an integer: the number of active slots.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param activeSlotsByChannel <p>
     *            A map of active slots by channel. The key is a channel name.
     *            The value is an integer: the number of active slots.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserData withActiveSlotsByChannel(java.util.Map<String, Integer> activeSlotsByChannel) {
        this.activeSlotsByChannel = activeSlotsByChannel;
        return this;
    }

    /**
     * <p>
     * A map of active slots by channel. The key is a channel name. The value is
     * an integer: the number of active slots.
     * </p>
     * <p>
     * The method adds a new key-value pair into ActiveSlotsByChannel parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into ActiveSlotsByChannel.
     * @param value The corresponding value of the entry to be added into
     *            ActiveSlotsByChannel.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserData addActiveSlotsByChannelEntry(String key, Integer value) {
        if (null == this.activeSlotsByChannel) {
            this.activeSlotsByChannel = new java.util.HashMap<String, Integer>();
        }
        if (this.activeSlotsByChannel.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.activeSlotsByChannel.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ActiveSlotsByChannel.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UserData clearActiveSlotsByChannelEntries() {
        this.activeSlotsByChannel = null;
        return this;
    }

    /**
     * <p>
     * A list of contact reference information.
     * </p>
     *
     * @return <p>
     *         A list of contact reference information.
     *         </p>
     */
    public java.util.List<AgentContactReference> getContacts() {
        return contacts;
    }

    /**
     * <p>
     * A list of contact reference information.
     * </p>
     *
     * @param contacts <p>
     *            A list of contact reference information.
     *            </p>
     */
    public void setContacts(java.util.Collection<AgentContactReference> contacts) {
        if (contacts == null) {
            this.contacts = null;
            return;
        }

        this.contacts = new java.util.ArrayList<AgentContactReference>(contacts);
    }

    /**
     * <p>
     * A list of contact reference information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contacts <p>
     *            A list of contact reference information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserData withContacts(AgentContactReference... contacts) {
        if (getContacts() == null) {
            this.contacts = new java.util.ArrayList<AgentContactReference>(contacts.length);
        }
        for (AgentContactReference value : contacts) {
            this.contacts.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of contact reference information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contacts <p>
     *            A list of contact reference information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserData withContacts(java.util.Collection<AgentContactReference> contacts) {
        setContacts(contacts);
        return this;
    }

    /**
     * <p>
     * The Next status of the agent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     *
     * @return <p>
     *         The Next status of the agent.
     *         </p>
     */
    public String getNextStatus() {
        return nextStatus;
    }

    /**
     * <p>
     * The Next status of the agent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     *
     * @param nextStatus <p>
     *            The Next status of the agent.
     *            </p>
     */
    public void setNextStatus(String nextStatus) {
        this.nextStatus = nextStatus;
    }

    /**
     * <p>
     * The Next status of the agent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     *
     * @param nextStatus <p>
     *            The Next status of the agent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserData withNextStatus(String nextStatus) {
        this.nextStatus = nextStatus;
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
        if (getUser() != null)
            sb.append("User: " + getUser() + ",");
        if (getRoutingProfile() != null)
            sb.append("RoutingProfile: " + getRoutingProfile() + ",");
        if (getHierarchyPath() != null)
            sb.append("HierarchyPath: " + getHierarchyPath() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getAvailableSlotsByChannel() != null)
            sb.append("AvailableSlotsByChannel: " + getAvailableSlotsByChannel() + ",");
        if (getMaxSlotsByChannel() != null)
            sb.append("MaxSlotsByChannel: " + getMaxSlotsByChannel() + ",");
        if (getActiveSlotsByChannel() != null)
            sb.append("ActiveSlotsByChannel: " + getActiveSlotsByChannel() + ",");
        if (getContacts() != null)
            sb.append("Contacts: " + getContacts() + ",");
        if (getNextStatus() != null)
            sb.append("NextStatus: " + getNextStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        hashCode = prime * hashCode
                + ((getRoutingProfile() == null) ? 0 : getRoutingProfile().hashCode());
        hashCode = prime * hashCode
                + ((getHierarchyPath() == null) ? 0 : getHierarchyPath().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getAvailableSlotsByChannel() == null) ? 0 : getAvailableSlotsByChannel()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getMaxSlotsByChannel() == null) ? 0 : getMaxSlotsByChannel().hashCode());
        hashCode = prime * hashCode
                + ((getActiveSlotsByChannel() == null) ? 0 : getActiveSlotsByChannel().hashCode());
        hashCode = prime * hashCode + ((getContacts() == null) ? 0 : getContacts().hashCode());
        hashCode = prime * hashCode + ((getNextStatus() == null) ? 0 : getNextStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserData == false)
            return false;
        UserData other = (UserData) obj;

        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        if (other.getRoutingProfile() == null ^ this.getRoutingProfile() == null)
            return false;
        if (other.getRoutingProfile() != null
                && other.getRoutingProfile().equals(this.getRoutingProfile()) == false)
            return false;
        if (other.getHierarchyPath() == null ^ this.getHierarchyPath() == null)
            return false;
        if (other.getHierarchyPath() != null
                && other.getHierarchyPath().equals(this.getHierarchyPath()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getAvailableSlotsByChannel() == null ^ this.getAvailableSlotsByChannel() == null)
            return false;
        if (other.getAvailableSlotsByChannel() != null
                && other.getAvailableSlotsByChannel().equals(this.getAvailableSlotsByChannel()) == false)
            return false;
        if (other.getMaxSlotsByChannel() == null ^ this.getMaxSlotsByChannel() == null)
            return false;
        if (other.getMaxSlotsByChannel() != null
                && other.getMaxSlotsByChannel().equals(this.getMaxSlotsByChannel()) == false)
            return false;
        if (other.getActiveSlotsByChannel() == null ^ this.getActiveSlotsByChannel() == null)
            return false;
        if (other.getActiveSlotsByChannel() != null
                && other.getActiveSlotsByChannel().equals(this.getActiveSlotsByChannel()) == false)
            return false;
        if (other.getContacts() == null ^ this.getContacts() == null)
            return false;
        if (other.getContacts() != null && other.getContacts().equals(this.getContacts()) == false)
            return false;
        if (other.getNextStatus() == null ^ this.getNextStatus() == null)
            return false;
        if (other.getNextStatus() != null
                && other.getNextStatus().equals(this.getNextStatus()) == false)
            return false;
        return true;
    }
}
