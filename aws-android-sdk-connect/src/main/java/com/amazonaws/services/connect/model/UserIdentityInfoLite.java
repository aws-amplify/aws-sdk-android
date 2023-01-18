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
 * The user's first name and last name.
 * </p>
 */
public class UserIdentityInfoLite implements Serializable {
    /**
     * <p>
     * The user's first name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String firstName;

    /**
     * <p>
     * The user's last name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String lastName;

    /**
     * <p>
     * The user's first name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The user's first name.
     *         </p>
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * <p>
     * The user's first name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param firstName <p>
     *            The user's first name.
     *            </p>
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * <p>
     * The user's first name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param firstName <p>
     *            The user's first name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserIdentityInfoLite withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * <p>
     * The user's last name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The user's last name.
     *         </p>
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * <p>
     * The user's last name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param lastName <p>
     *            The user's last name.
     *            </p>
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * <p>
     * The user's last name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param lastName <p>
     *            The user's last name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserIdentityInfoLite withLastName(String lastName) {
        this.lastName = lastName;
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
        if (getFirstName() != null)
            sb.append("FirstName: " + getFirstName() + ",");
        if (getLastName() != null)
            sb.append("LastName: " + getLastName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        hashCode = prime * hashCode + ((getLastName() == null) ? 0 : getLastName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserIdentityInfoLite == false)
            return false;
        UserIdentityInfoLite other = (UserIdentityInfoLite) obj;

        if (other.getFirstName() == null ^ this.getFirstName() == null)
            return false;
        if (other.getFirstName() != null
                && other.getFirstName().equals(this.getFirstName()) == false)
            return false;
        if (other.getLastName() == null ^ this.getLastName() == null)
            return false;
        if (other.getLastName() != null && other.getLastName().equals(this.getLastName()) == false)
            return false;
        return true;
    }
}
