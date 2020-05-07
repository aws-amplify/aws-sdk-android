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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

public class PutQueryDefinitionResult implements Serializable {
    /**
     * The new value for the queryDefinitionId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String queryDefinitionId;

    /**
     * Returns the value of the queryDefinitionId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return The value of the queryDefinitionId property for this object.
     */
    public String getQueryDefinitionId() {
        return queryDefinitionId;
    }

    /**
     * Sets the value of queryDefinitionId
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param queryDefinitionId The new value for the queryDefinitionId property
     *            for this object.
     */
    public void setQueryDefinitionId(String queryDefinitionId) {
        this.queryDefinitionId = queryDefinitionId;
    }

    /**
     * Sets the value of the queryDefinitionId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param queryDefinitionId The new value for the queryDefinitionId property
     *            for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutQueryDefinitionResult withQueryDefinitionId(String queryDefinitionId) {
        this.queryDefinitionId = queryDefinitionId;
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
        if (getQueryDefinitionId() != null)
            sb.append("queryDefinitionId: " + getQueryDefinitionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getQueryDefinitionId() == null) ? 0 : getQueryDefinitionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutQueryDefinitionResult == false)
            return false;
        PutQueryDefinitionResult other = (PutQueryDefinitionResult) obj;

        if (other.getQueryDefinitionId() == null ^ this.getQueryDefinitionId() == null)
            return false;
        if (other.getQueryDefinitionId() != null
                && other.getQueryDefinitionId().equals(this.getQueryDefinitionId()) == false)
            return false;
        return true;
    }
}
