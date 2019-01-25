/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

public class UpdateGlobalTableResult implements Serializable {
    /**
     * <p>
     * Contains the details of the global table.
     * </p>
     */
    private GlobalTableDescription globalTableDescription;

    /**
     * <p>
     * Contains the details of the global table.
     * </p>
     *
     * @return <p>
     *         Contains the details of the global table.
     *         </p>
     */
    public GlobalTableDescription getGlobalTableDescription() {
        return globalTableDescription;
    }

    /**
     * <p>
     * Contains the details of the global table.
     * </p>
     *
     * @param globalTableDescription <p>
     *            Contains the details of the global table.
     *            </p>
     */
    public void setGlobalTableDescription(GlobalTableDescription globalTableDescription) {
        this.globalTableDescription = globalTableDescription;
    }

    /**
     * <p>
     * Contains the details of the global table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalTableDescription <p>
     *            Contains the details of the global table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGlobalTableResult withGlobalTableDescription(
            GlobalTableDescription globalTableDescription) {
        this.globalTableDescription = globalTableDescription;
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
        if (getGlobalTableDescription() != null)
            sb.append("GlobalTableDescription: " + getGlobalTableDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getGlobalTableDescription() == null) ? 0 : getGlobalTableDescription()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGlobalTableResult == false)
            return false;
        UpdateGlobalTableResult other = (UpdateGlobalTableResult) obj;

        if (other.getGlobalTableDescription() == null ^ this.getGlobalTableDescription() == null)
            return false;
        if (other.getGlobalTableDescription() != null
                && other.getGlobalTableDescription().equals(this.getGlobalTableDescription()) == false)
            return false;
        return true;
    }
}
