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

/**
 * <p>
 * The representation of an Amazon WorkMail group.
 * </p>
 */
public class Group implements Serializable {
    /**
     * <p>
     * The identifier of the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     */
    private String id;

    /**
     * <p>
     * The email of the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 254<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._%+-]{1,64}@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}<br/>
     */
    private String email;

    /**
     * <p>
     * The name of the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String name;

    /**
     * <p>
     * The state of the group, which can be ENABLED, DISABLED, or DELETED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, DELETED
     */
    private String state;

    /**
     * <p>
     * The date indicating when the group was enabled for Amazon WorkMail use.
     * </p>
     */
    private java.util.Date enabledDate;

    /**
     * <p>
     * The date indicating when the group was disabled from Amazon WorkMail use.
     * </p>
     */
    private java.util.Date disabledDate;

    /**
     * <p>
     * The identifier of the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     *
     * @return <p>
     *         The identifier of the group.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     *
     * @param id <p>
     *            The identifier of the group.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     *
     * @param id <p>
     *            The identifier of the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Group withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The email of the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 254<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._%+-]{1,64}@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}<br/>
     *
     * @return <p>
     *         The email of the group.
     *         </p>
     */
    public String getEmail() {
        return email;
    }

    /**
     * <p>
     * The email of the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 254<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._%+-]{1,64}@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}<br/>
     *
     * @param email <p>
     *            The email of the group.
     *            </p>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email of the group.
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
     *            The email of the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Group withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         The name of the group.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param name <p>
     *            The name of the group.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the group.
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
     *            The name of the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Group withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The state of the group, which can be ENABLED, DISABLED, or DELETED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, DELETED
     *
     * @return <p>
     *         The state of the group, which can be ENABLED, DISABLED, or
     *         DELETED.
     *         </p>
     * @see EntityState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the group, which can be ENABLED, DISABLED, or DELETED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, DELETED
     *
     * @param state <p>
     *            The state of the group, which can be ENABLED, DISABLED, or
     *            DELETED.
     *            </p>
     * @see EntityState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the group, which can be ENABLED, DISABLED, or DELETED.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, DELETED
     *
     * @param state <p>
     *            The state of the group, which can be ENABLED, DISABLED, or
     *            DELETED.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EntityState
     */
    public Group withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the group, which can be ENABLED, DISABLED, or DELETED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, DELETED
     *
     * @param state <p>
     *            The state of the group, which can be ENABLED, DISABLED, or
     *            DELETED.
     *            </p>
     * @see EntityState
     */
    public void setState(EntityState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the group, which can be ENABLED, DISABLED, or DELETED.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, DELETED
     *
     * @param state <p>
     *            The state of the group, which can be ENABLED, DISABLED, or
     *            DELETED.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EntityState
     */
    public Group withState(EntityState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The date indicating when the group was enabled for Amazon WorkMail use.
     * </p>
     *
     * @return <p>
     *         The date indicating when the group was enabled for Amazon
     *         WorkMail use.
     *         </p>
     */
    public java.util.Date getEnabledDate() {
        return enabledDate;
    }

    /**
     * <p>
     * The date indicating when the group was enabled for Amazon WorkMail use.
     * </p>
     *
     * @param enabledDate <p>
     *            The date indicating when the group was enabled for Amazon
     *            WorkMail use.
     *            </p>
     */
    public void setEnabledDate(java.util.Date enabledDate) {
        this.enabledDate = enabledDate;
    }

    /**
     * <p>
     * The date indicating when the group was enabled for Amazon WorkMail use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabledDate <p>
     *            The date indicating when the group was enabled for Amazon
     *            WorkMail use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Group withEnabledDate(java.util.Date enabledDate) {
        this.enabledDate = enabledDate;
        return this;
    }

    /**
     * <p>
     * The date indicating when the group was disabled from Amazon WorkMail use.
     * </p>
     *
     * @return <p>
     *         The date indicating when the group was disabled from Amazon
     *         WorkMail use.
     *         </p>
     */
    public java.util.Date getDisabledDate() {
        return disabledDate;
    }

    /**
     * <p>
     * The date indicating when the group was disabled from Amazon WorkMail use.
     * </p>
     *
     * @param disabledDate <p>
     *            The date indicating when the group was disabled from Amazon
     *            WorkMail use.
     *            </p>
     */
    public void setDisabledDate(java.util.Date disabledDate) {
        this.disabledDate = disabledDate;
    }

    /**
     * <p>
     * The date indicating when the group was disabled from Amazon WorkMail use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disabledDate <p>
     *            The date indicating when the group was disabled from Amazon
     *            WorkMail use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Group withDisabledDate(java.util.Date disabledDate) {
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getEmail() != null)
            sb.append("Email: " + getEmail() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
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

        if (obj instanceof Group == false)
            return false;
        Group other = (Group) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
