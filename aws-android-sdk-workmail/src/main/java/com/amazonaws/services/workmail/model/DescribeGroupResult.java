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

package com.amazonaws.services.workmail.model;

import java.io.Serializable;

public class DescribeGroupResult implements Serializable {
    /**
     * <p>
     * The identifier of the described group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     */
    private String groupId;

    /**
     * <p>
     * The name of the described group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String name;

    /**
     * <p>
     * The email of the described group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 254<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._%+-]{1,64}@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}<br/>
     */
    private String email;

    /**
     * <p>
     * The state of the user: enabled (registered to Amazon WorkMail) or
     * disabled (deregistered or never registered to WorkMail).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, DELETED
     */
    private String state;

    /**
     * <p>
     * The date and time when a user was registered to WorkMail, in UNIX epoch
     * time format.
     * </p>
     */
    private java.util.Date enabledDate;

    /**
     * <p>
     * The date and time when a user was deregistered from WorkMail, in UNIX
     * epoch time format.
     * </p>
     */
    private java.util.Date disabledDate;

    /**
     * <p>
     * The identifier of the described group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     *
     * @return <p>
     *         The identifier of the described group.
     *         </p>
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * <p>
     * The identifier of the described group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     *
     * @param groupId <p>
     *            The identifier of the described group.
     *            </p>
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The identifier of the described group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     *
     * @param groupId <p>
     *            The identifier of the described group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGroupResult withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * <p>
     * The name of the described group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         The name of the described group.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the described group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param name <p>
     *            The name of the described group.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the described group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param name <p>
     *            The name of the described group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGroupResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The email of the described group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 254<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._%+-]{1,64}@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}<br/>
     *
     * @return <p>
     *         The email of the described group.
     *         </p>
     */
    public String getEmail() {
        return email;
    }

    /**
     * <p>
     * The email of the described group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 254<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._%+-]{1,64}@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}<br/>
     *
     * @param email <p>
     *            The email of the described group.
     *            </p>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email of the described group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 254<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._%+-]{1,64}@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}<br/>
     *
     * @param email <p>
     *            The email of the described group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGroupResult withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * <p>
     * The state of the user: enabled (registered to Amazon WorkMail) or
     * disabled (deregistered or never registered to WorkMail).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, DELETED
     *
     * @return <p>
     *         The state of the user: enabled (registered to Amazon WorkMail) or
     *         disabled (deregistered or never registered to WorkMail).
     *         </p>
     * @see EntityState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the user: enabled (registered to Amazon WorkMail) or
     * disabled (deregistered or never registered to WorkMail).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, DELETED
     *
     * @param state <p>
     *            The state of the user: enabled (registered to Amazon WorkMail)
     *            or disabled (deregistered or never registered to WorkMail).
     *            </p>
     * @see EntityState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the user: enabled (registered to Amazon WorkMail) or
     * disabled (deregistered or never registered to WorkMail).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, DELETED
     *
     * @param state <p>
     *            The state of the user: enabled (registered to Amazon WorkMail)
     *            or disabled (deregistered or never registered to WorkMail).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EntityState
     */
    public DescribeGroupResult withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the user: enabled (registered to Amazon WorkMail) or
     * disabled (deregistered or never registered to WorkMail).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, DELETED
     *
     * @param state <p>
     *            The state of the user: enabled (registered to Amazon WorkMail)
     *            or disabled (deregistered or never registered to WorkMail).
     *            </p>
     * @see EntityState
     */
    public void setState(EntityState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the user: enabled (registered to Amazon WorkMail) or
     * disabled (deregistered or never registered to WorkMail).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, DELETED
     *
     * @param state <p>
     *            The state of the user: enabled (registered to Amazon WorkMail)
     *            or disabled (deregistered or never registered to WorkMail).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EntityState
     */
    public DescribeGroupResult withState(EntityState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when a user was registered to WorkMail, in UNIX epoch
     * time format.
     * </p>
     *
     * @return <p>
     *         The date and time when a user was registered to WorkMail, in UNIX
     *         epoch time format.
     *         </p>
     */
    public java.util.Date getEnabledDate() {
        return enabledDate;
    }

    /**
     * <p>
     * The date and time when a user was registered to WorkMail, in UNIX epoch
     * time format.
     * </p>
     *
     * @param enabledDate <p>
     *            The date and time when a user was registered to WorkMail, in
     *            UNIX epoch time format.
     *            </p>
     */
    public void setEnabledDate(java.util.Date enabledDate) {
        this.enabledDate = enabledDate;
    }

    /**
     * <p>
     * The date and time when a user was registered to WorkMail, in UNIX epoch
     * time format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabledDate <p>
     *            The date and time when a user was registered to WorkMail, in
     *            UNIX epoch time format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGroupResult withEnabledDate(java.util.Date enabledDate) {
        this.enabledDate = enabledDate;
        return this;
    }

    /**
     * <p>
     * The date and time when a user was deregistered from WorkMail, in UNIX
     * epoch time format.
     * </p>
     *
     * @return <p>
     *         The date and time when a user was deregistered from WorkMail, in
     *         UNIX epoch time format.
     *         </p>
     */
    public java.util.Date getDisabledDate() {
        return disabledDate;
    }

    /**
     * <p>
     * The date and time when a user was deregistered from WorkMail, in UNIX
     * epoch time format.
     * </p>
     *
     * @param disabledDate <p>
     *            The date and time when a user was deregistered from WorkMail,
     *            in UNIX epoch time format.
     *            </p>
     */
    public void setDisabledDate(java.util.Date disabledDate) {
        this.disabledDate = disabledDate;
    }

    /**
     * <p>
     * The date and time when a user was deregistered from WorkMail, in UNIX
     * epoch time format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disabledDate <p>
     *            The date and time when a user was deregistered from WorkMail,
     *            in UNIX epoch time format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGroupResult withDisabledDate(java.util.Date disabledDate) {
        this.disabledDate = disabledDate;
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
        if (getGroupId() != null)
            sb.append("GroupId: " + getGroupId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getEmail() != null)
            sb.append("Email: " + getEmail() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getEnabledDate() != null)
            sb.append("EnabledDate: " + getEnabledDate() + ",");
        if (getDisabledDate() != null)
            sb.append("DisabledDate: " + getDisabledDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getEnabledDate() == null) ? 0 : getEnabledDate().hashCode());
        hashCode = prime * hashCode
                + ((getDisabledDate() == null) ? 0 : getDisabledDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeGroupResult == false)
            return false;
        DescribeGroupResult other = (DescribeGroupResult) obj;

        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getEnabledDate() == null ^ this.getEnabledDate() == null)
            return false;
        if (other.getEnabledDate() != null
                && other.getEnabledDate().equals(this.getEnabledDate()) == false)
            return false;
        if (other.getDisabledDate() == null ^ this.getDisabledDate() == null)
            return false;
        if (other.getDisabledDate() != null
                && other.getDisabledDate().equals(this.getDisabledDate()) == false)
            return false;
        return true;
    }
}
