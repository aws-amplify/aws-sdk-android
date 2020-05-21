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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Container for the owner's display name and ID.
 * </p>
 */
public class Owner implements Serializable {
    /**
     * <p>
     * Container for the display name of the owner.
     * </p>
     */
    private String displayName;

    /**
     * <p>
     * Container for the ID of the owner.
     * </p>
     */
    private String iD;

    /**
     * <p>
     * Container for the display name of the owner.
     * </p>
     *
     * @return <p>
     *         Container for the display name of the owner.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * Container for the display name of the owner.
     * </p>
     *
     * @param displayName <p>
     *            Container for the display name of the owner.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * Container for the display name of the owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param displayName <p>
     *            Container for the display name of the owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Owner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * <p>
     * Container for the ID of the owner.
     * </p>
     *
     * @return <p>
     *         Container for the ID of the owner.
     *         </p>
     */
    public String getID() {
        return iD;
    }

    /**
     * <p>
     * Container for the ID of the owner.
     * </p>
     *
     * @param iD <p>
     *            Container for the ID of the owner.
     *            </p>
     */
    public void setID(String iD) {
        this.iD = iD;
    }

    /**
     * <p>
     * Container for the ID of the owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iD <p>
     *            Container for the ID of the owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Owner withID(String iD) {
        this.iD = iD;
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
        if (getDisplayName() != null)
            sb.append("DisplayName: " + getDisplayName() + ",");
        if (getID() != null)
            sb.append("ID: " + getID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getID() == null) ? 0 : getID().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Owner == false)
            return false;
        Owner other = (Owner) obj;

        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getID() == null ^ this.getID() == null)
            return false;
        if (other.getID() != null && other.getID().equals(this.getID()) == false)
            return false;
        return true;
    }
}
