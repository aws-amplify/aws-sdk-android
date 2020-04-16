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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates an existing work team with new member definitions or description.
 * </p>
 */
public class UpdateWorkteamRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the work team to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String workteamName;

    /**
     * <p>
     * A list of <code>MemberDefinition</code> objects that contain the updated
     * work team members.
     * </p>
     */
    private java.util.List<MemberDefinition> memberDefinitions;

    /**
     * <p>
     * An updated description for the work team.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String description;

    /**
     * <p>
     * Configures SNS topic notifications for available or expiring work items
     * </p>
     */
    private NotificationConfiguration notificationConfiguration;

    /**
     * <p>
     * The name of the work team to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the work team to update.
     *         </p>
     */
    public String getWorkteamName() {
        return workteamName;
    }

    /**
     * <p>
     * The name of the work team to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param workteamName <p>
     *            The name of the work team to update.
     *            </p>
     */
    public void setWorkteamName(String workteamName) {
        this.workteamName = workteamName;
    }

    /**
     * <p>
     * The name of the work team to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param workteamName <p>
     *            The name of the work team to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateWorkteamRequest withWorkteamName(String workteamName) {
        this.workteamName = workteamName;
        return this;
    }

    /**
     * <p>
     * A list of <code>MemberDefinition</code> objects that contain the updated
     * work team members.
     * </p>
     *
     * @return <p>
     *         A list of <code>MemberDefinition</code> objects that contain the
     *         updated work team members.
     *         </p>
     */
    public java.util.List<MemberDefinition> getMemberDefinitions() {
        return memberDefinitions;
    }

    /**
     * <p>
     * A list of <code>MemberDefinition</code> objects that contain the updated
     * work team members.
     * </p>
     *
     * @param memberDefinitions <p>
     *            A list of <code>MemberDefinition</code> objects that contain
     *            the updated work team members.
     *            </p>
     */
    public void setMemberDefinitions(java.util.Collection<MemberDefinition> memberDefinitions) {
        if (memberDefinitions == null) {
            this.memberDefinitions = null;
            return;
        }

        this.memberDefinitions = new java.util.ArrayList<MemberDefinition>(memberDefinitions);
    }

    /**
     * <p>
     * A list of <code>MemberDefinition</code> objects that contain the updated
     * work team members.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param memberDefinitions <p>
     *            A list of <code>MemberDefinition</code> objects that contain
     *            the updated work team members.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateWorkteamRequest withMemberDefinitions(MemberDefinition... memberDefinitions) {
        if (getMemberDefinitions() == null) {
            this.memberDefinitions = new java.util.ArrayList<MemberDefinition>(
                    memberDefinitions.length);
        }
        for (MemberDefinition value : memberDefinitions) {
            this.memberDefinitions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>MemberDefinition</code> objects that contain the updated
     * work team members.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param memberDefinitions <p>
     *            A list of <code>MemberDefinition</code> objects that contain
     *            the updated work team members.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateWorkteamRequest withMemberDefinitions(
            java.util.Collection<MemberDefinition> memberDefinitions) {
        setMemberDefinitions(memberDefinitions);
        return this;
    }

    /**
     * <p>
     * An updated description for the work team.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         An updated description for the work team.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * An updated description for the work team.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param description <p>
     *            An updated description for the work team.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An updated description for the work team.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param description <p>
     *            An updated description for the work team.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateWorkteamRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Configures SNS topic notifications for available or expiring work items
     * </p>
     *
     * @return <p>
     *         Configures SNS topic notifications for available or expiring work
     *         items
     *         </p>
     */
    public NotificationConfiguration getNotificationConfiguration() {
        return notificationConfiguration;
    }

    /**
     * <p>
     * Configures SNS topic notifications for available or expiring work items
     * </p>
     *
     * @param notificationConfiguration <p>
     *            Configures SNS topic notifications for available or expiring
     *            work items
     *            </p>
     */
    public void setNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
    }

    /**
     * <p>
     * Configures SNS topic notifications for available or expiring work items
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationConfiguration <p>
     *            Configures SNS topic notifications for available or expiring
     *            work items
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateWorkteamRequest withNotificationConfiguration(
            NotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
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
        if (getWorkteamName() != null)
            sb.append("WorkteamName: " + getWorkteamName() + ",");
        if (getMemberDefinitions() != null)
            sb.append("MemberDefinitions: " + getMemberDefinitions() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getNotificationConfiguration() != null)
            sb.append("NotificationConfiguration: " + getNotificationConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getWorkteamName() == null) ? 0 : getWorkteamName().hashCode());
        hashCode = prime * hashCode
                + ((getMemberDefinitions() == null) ? 0 : getMemberDefinitions().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getNotificationConfiguration() == null) ? 0 : getNotificationConfiguration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWorkteamRequest == false)
            return false;
        UpdateWorkteamRequest other = (UpdateWorkteamRequest) obj;

        if (other.getWorkteamName() == null ^ this.getWorkteamName() == null)
            return false;
        if (other.getWorkteamName() != null
                && other.getWorkteamName().equals(this.getWorkteamName()) == false)
            return false;
        if (other.getMemberDefinitions() == null ^ this.getMemberDefinitions() == null)
            return false;
        if (other.getMemberDefinitions() != null
                && other.getMemberDefinitions().equals(this.getMemberDefinitions()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getNotificationConfiguration() == null
                ^ this.getNotificationConfiguration() == null)
            return false;
        if (other.getNotificationConfiguration() != null
                && other.getNotificationConfiguration().equals(this.getNotificationConfiguration()) == false)
            return false;
        return true;
    }
}
