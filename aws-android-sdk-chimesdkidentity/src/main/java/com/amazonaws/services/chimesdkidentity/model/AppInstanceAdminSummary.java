/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;

/**
 * <p>
 * Summary of the details of an <code>AppInstanceAdmin</code>.
 * </p>
 */
public class AppInstanceAdminSummary implements Serializable {
    /**
     * <p>
     * The details of the <code>AppInstanceAdmin</code>.
     * </p>
     */
    private Identity admin;

    /**
     * <p>
     * The details of the <code>AppInstanceAdmin</code>.
     * </p>
     *
     * @return <p>
     *         The details of the <code>AppInstanceAdmin</code>.
     *         </p>
     */
    public Identity getAdmin() {
        return admin;
    }

    /**
     * <p>
     * The details of the <code>AppInstanceAdmin</code>.
     * </p>
     *
     * @param admin <p>
     *            The details of the <code>AppInstanceAdmin</code>.
     *            </p>
     */
    public void setAdmin(Identity admin) {
        this.admin = admin;
    }

    /**
     * <p>
     * The details of the <code>AppInstanceAdmin</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param admin <p>
     *            The details of the <code>AppInstanceAdmin</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AppInstanceAdminSummary withAdmin(Identity admin) {
        this.admin = admin;
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
        if (getAdmin() != null)
            sb.append("Admin: " + getAdmin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdmin() == null) ? 0 : getAdmin().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppInstanceAdminSummary == false)
            return false;
        AppInstanceAdminSummary other = (AppInstanceAdminSummary) obj;

        if (other.getAdmin() == null ^ this.getAdmin() == null)
            return false;
        if (other.getAdmin() != null && other.getAdmin().equals(this.getAdmin()) == false)
            return false;
        return true;
    }
}
