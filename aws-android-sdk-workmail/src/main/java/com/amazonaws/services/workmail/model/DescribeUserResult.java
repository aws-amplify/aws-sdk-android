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

public class DescribeUserResult implements Serializable {
    /**
     * <p>
     * The identifier for the described user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     */
    private String userId;

    /**
     * <p>
     * The name for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w\-.]+(@[a-zA-Z0-9.\-]+\.[a-zA-Z0-9]{2,})?<br/>
     */
    private String name;

    /**
     * <p>
     * The email of the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 254<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._%+-]{1,64}@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}<br/>
     */
    private String email;

    /**
     * <p>
     * The display name of the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String displayName;

    /**
     * <p>
     * The state of a user: enabled (registered to Amazon WorkMail) or disabled
     * (deregistered or never registered to WorkMail).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, DELETED
     */
    private String state;

    /**
     * <p>
     * In certain cases, other entities are modeled as users. If
     * interoperability is enabled, resources are imported into Amazon WorkMail
     * as users. Because different WorkMail organizations rely on different
     * directory types, administrators can distinguish between an unregistered
     * user (account is disabled and has a user role) and the directory
     * administrators. The values are USER, RESOURCE, and SYSTEM_USER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, RESOURCE, SYSTEM_USER
     */
    private String userRole;

    /**
     * <p>
     * The date and time at which the user was enabled for Amazon WorkMail
     * usage, in UNIX epoch time format.
     * </p>
     */
    private java.util.Date enabledDate;

    /**
     * <p>
     * The date and time at which the user was disabled for Amazon WorkMail
     * usage, in UNIX epoch time format.
     * </p>
     */
    private java.util.Date disabledDate;

    /**
     * <p>
     * The identifier for the described user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     *
     * @return <p>
     *         The identifier for the described user.
     *         </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * The identifier for the described user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     *
     * @param userId <p>
     *            The identifier for the described user.
     *            </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The identifier for the described user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     *
     * @param userId <p>
     *            The identifier for the described user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUserResult withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * <p>
     * The name for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w\-.]+(@[a-zA-Z0-9.\-]+\.[a-zA-Z0-9]{2,})?<br/>
     *
     * @return <p>
     *         The name for the user.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w\-.]+(@[a-zA-Z0-9.\-]+\.[a-zA-Z0-9]{2,})?<br/>
     *
     * @param name <p>
     *            The name for the user.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w\-.]+(@[a-zA-Z0-9.\-]+\.[a-zA-Z0-9]{2,})?<br/>
     *
     * @param name <p>
     *            The name for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUserResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The email of the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 254<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._%+-]{1,64}@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}<br/>
     *
     * @return <p>
     *         The email of the user.
     *         </p>
     */
    public String getEmail() {
        return email;
    }

    /**
     * <p>
     * The email of the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 254<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._%+-]{1,64}@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}<br/>
     *
     * @param email <p>
     *            The email of the user.
     *            </p>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email of the user.
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
     *            The email of the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUserResult withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * <p>
     * The display name of the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The display name of the user.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * The display name of the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param displayName <p>
     *            The display name of the user.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param displayName <p>
     *            The display name of the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUserResult withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * <p>
     * The state of a user: enabled (registered to Amazon WorkMail) or disabled
     * (deregistered or never registered to WorkMail).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, DELETED
     *
     * @return <p>
     *         The state of a user: enabled (registered to Amazon WorkMail) or
     *         disabled (deregistered or never registered to WorkMail).
     *         </p>
     * @see EntityState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of a user: enabled (registered to Amazon WorkMail) or disabled
     * (deregistered or never registered to WorkMail).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, DELETED
     *
     * @param state <p>
     *            The state of a user: enabled (registered to Amazon WorkMail)
     *            or disabled (deregistered or never registered to WorkMail).
     *            </p>
     * @see EntityState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of a user: enabled (registered to Amazon WorkMail) or disabled
     * (deregistered or never registered to WorkMail).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, DELETED
     *
     * @param state <p>
     *            The state of a user: enabled (registered to Amazon WorkMail)
     *            or disabled (deregistered or never registered to WorkMail).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EntityState
     */
    public DescribeUserResult withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of a user: enabled (registered to Amazon WorkMail) or disabled
     * (deregistered or never registered to WorkMail).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, DELETED
     *
     * @param state <p>
     *            The state of a user: enabled (registered to Amazon WorkMail)
     *            or disabled (deregistered or never registered to WorkMail).
     *            </p>
     * @see EntityState
     */
    public void setState(EntityState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of a user: enabled (registered to Amazon WorkMail) or disabled
     * (deregistered or never registered to WorkMail).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, DELETED
     *
     * @param state <p>
     *            The state of a user: enabled (registered to Amazon WorkMail)
     *            or disabled (deregistered or never registered to WorkMail).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EntityState
     */
    public DescribeUserResult withState(EntityState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * In certain cases, other entities are modeled as users. If
     * interoperability is enabled, resources are imported into Amazon WorkMail
     * as users. Because different WorkMail organizations rely on different
     * directory types, administrators can distinguish between an unregistered
     * user (account is disabled and has a user role) and the directory
     * administrators. The values are USER, RESOURCE, and SYSTEM_USER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, RESOURCE, SYSTEM_USER
     *
     * @return <p>
     *         In certain cases, other entities are modeled as users. If
     *         interoperability is enabled, resources are imported into Amazon
     *         WorkMail as users. Because different WorkMail organizations rely
     *         on different directory types, administrators can distinguish
     *         between an unregistered user (account is disabled and has a user
     *         role) and the directory administrators. The values are USER,
     *         RESOURCE, and SYSTEM_USER.
     *         </p>
     * @see UserRole
     */
    public String getUserRole() {
        return userRole;
    }

    /**
     * <p>
     * In certain cases, other entities are modeled as users. If
     * interoperability is enabled, resources are imported into Amazon WorkMail
     * as users. Because different WorkMail organizations rely on different
     * directory types, administrators can distinguish between an unregistered
     * user (account is disabled and has a user role) and the directory
     * administrators. The values are USER, RESOURCE, and SYSTEM_USER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, RESOURCE, SYSTEM_USER
     *
     * @param userRole <p>
     *            In certain cases, other entities are modeled as users. If
     *            interoperability is enabled, resources are imported into
     *            Amazon WorkMail as users. Because different WorkMail
     *            organizations rely on different directory types,
     *            administrators can distinguish between an unregistered user
     *            (account is disabled and has a user role) and the directory
     *            administrators. The values are USER, RESOURCE, and
     *            SYSTEM_USER.
     *            </p>
     * @see UserRole
     */
    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    /**
     * <p>
     * In certain cases, other entities are modeled as users. If
     * interoperability is enabled, resources are imported into Amazon WorkMail
     * as users. Because different WorkMail organizations rely on different
     * directory types, administrators can distinguish between an unregistered
     * user (account is disabled and has a user role) and the directory
     * administrators. The values are USER, RESOURCE, and SYSTEM_USER.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, RESOURCE, SYSTEM_USER
     *
     * @param userRole <p>
     *            In certain cases, other entities are modeled as users. If
     *            interoperability is enabled, resources are imported into
     *            Amazon WorkMail as users. Because different WorkMail
     *            organizations rely on different directory types,
     *            administrators can distinguish between an unregistered user
     *            (account is disabled and has a user role) and the directory
     *            administrators. The values are USER, RESOURCE, and
     *            SYSTEM_USER.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserRole
     */
    public DescribeUserResult withUserRole(String userRole) {
        this.userRole = userRole;
        return this;
    }

    /**
     * <p>
     * In certain cases, other entities are modeled as users. If
     * interoperability is enabled, resources are imported into Amazon WorkMail
     * as users. Because different WorkMail organizations rely on different
     * directory types, administrators can distinguish between an unregistered
     * user (account is disabled and has a user role) and the directory
     * administrators. The values are USER, RESOURCE, and SYSTEM_USER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, RESOURCE, SYSTEM_USER
     *
     * @param userRole <p>
     *            In certain cases, other entities are modeled as users. If
     *            interoperability is enabled, resources are imported into
     *            Amazon WorkMail as users. Because different WorkMail
     *            organizations rely on different directory types,
     *            administrators can distinguish between an unregistered user
     *            (account is disabled and has a user role) and the directory
     *            administrators. The values are USER, RESOURCE, and
     *            SYSTEM_USER.
     *            </p>
     * @see UserRole
     */
    public void setUserRole(UserRole userRole) {
        this.userRole = userRole.toString();
    }

    /**
     * <p>
     * In certain cases, other entities are modeled as users. If
     * interoperability is enabled, resources are imported into Amazon WorkMail
     * as users. Because different WorkMail organizations rely on different
     * directory types, administrators can distinguish between an unregistered
     * user (account is disabled and has a user role) and the directory
     * administrators. The values are USER, RESOURCE, and SYSTEM_USER.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, RESOURCE, SYSTEM_USER
     *
     * @param userRole <p>
     *            In certain cases, other entities are modeled as users. If
     *            interoperability is enabled, resources are imported into
     *            Amazon WorkMail as users. Because different WorkMail
     *            organizations rely on different directory types,
     *            administrators can distinguish between an unregistered user
     *            (account is disabled and has a user role) and the directory
     *            administrators. The values are USER, RESOURCE, and
     *            SYSTEM_USER.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserRole
     */
    public DescribeUserResult withUserRole(UserRole userRole) {
        this.userRole = userRole.toString();
        return this;
    }

    /**
     * <p>
     * The date and time at which the user was enabled for Amazon WorkMail
     * usage, in UNIX epoch time format.
     * </p>
     *
     * @return <p>
     *         The date and time at which the user was enabled for Amazon
     *         WorkMail usage, in UNIX epoch time format.
     *         </p>
     */
    public java.util.Date getEnabledDate() {
        return enabledDate;
    }

    /**
     * <p>
     * The date and time at which the user was enabled for Amazon WorkMail
     * usage, in UNIX epoch time format.
     * </p>
     *
     * @param enabledDate <p>
     *            The date and time at which the user was enabled for Amazon
     *            WorkMail usage, in UNIX epoch time format.
     *            </p>
     */
    public void setEnabledDate(java.util.Date enabledDate) {
        this.enabledDate = enabledDate;
    }

    /**
     * <p>
     * The date and time at which the user was enabled for Amazon WorkMail
     * usage, in UNIX epoch time format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabledDate <p>
     *            The date and time at which the user was enabled for Amazon
     *            WorkMail usage, in UNIX epoch time format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUserResult withEnabledDate(java.util.Date enabledDate) {
        this.enabledDate = enabledDate;
        return this;
    }

    /**
     * <p>
     * The date and time at which the user was disabled for Amazon WorkMail
     * usage, in UNIX epoch time format.
     * </p>
     *
     * @return <p>
     *         The date and time at which the user was disabled for Amazon
     *         WorkMail usage, in UNIX epoch time format.
     *         </p>
     */
    public java.util.Date getDisabledDate() {
        return disabledDate;
    }

    /**
     * <p>
     * The date and time at which the user was disabled for Amazon WorkMail
     * usage, in UNIX epoch time format.
     * </p>
     *
     * @param disabledDate <p>
     *            The date and time at which the user was disabled for Amazon
     *            WorkMail usage, in UNIX epoch time format.
     *            </p>
     */
    public void setDisabledDate(java.util.Date disabledDate) {
        this.disabledDate = disabledDate;
    }

    /**
     * <p>
     * The date and time at which the user was disabled for Amazon WorkMail
     * usage, in UNIX epoch time format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disabledDate <p>
     *            The date and time at which the user was disabled for Amazon
     *            WorkMail usage, in UNIX epoch time format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUserResult withDisabledDate(java.util.Date disabledDate) {
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
        if (getUserId() != null)
            sb.append("UserId: " + getUserId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getEmail() != null)
            sb.append("Email: " + getEmail() + ",");
        if (getDisplayName() != null)
            sb.append("DisplayName: " + getDisplayName() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getUserRole() != null)
            sb.append("UserRole: " + getUserRole() + ",");
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

        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getUserRole() == null) ? 0 : getUserRole().hashCode());
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

        if (obj instanceof DescribeUserResult == false)
            return false;
        DescribeUserResult other = (DescribeUserResult) obj;

        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getUserRole() == null ^ this.getUserRole() == null)
            return false;
        if (other.getUserRole() != null && other.getUserRole().equals(this.getUserRole()) == false)
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
