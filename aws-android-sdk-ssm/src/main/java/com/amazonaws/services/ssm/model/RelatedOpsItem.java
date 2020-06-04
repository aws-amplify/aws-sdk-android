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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * An OpsItems that shares something in common with the current OpsItem. For
 * example, related OpsItems can include OpsItems with similar error messages,
 * impacted resources, or statuses for the impacted resource.
 * </p>
 */
public class RelatedOpsItem implements Serializable {
    /**
     * <p>
     * The ID of an OpsItem related to the current OpsItem.
     * </p>
     */
    private String opsItemId;

    /**
     * <p>
     * The ID of an OpsItem related to the current OpsItem.
     * </p>
     *
     * @return <p>
     *         The ID of an OpsItem related to the current OpsItem.
     *         </p>
     */
    public String getOpsItemId() {
        return opsItemId;
    }

    /**
     * <p>
     * The ID of an OpsItem related to the current OpsItem.
     * </p>
     *
     * @param opsItemId <p>
     *            The ID of an OpsItem related to the current OpsItem.
     *            </p>
     */
    public void setOpsItemId(String opsItemId) {
        this.opsItemId = opsItemId;
    }

    /**
     * <p>
     * The ID of an OpsItem related to the current OpsItem.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param opsItemId <p>
     *            The ID of an OpsItem related to the current OpsItem.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelatedOpsItem withOpsItemId(String opsItemId) {
        this.opsItemId = opsItemId;
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
        if (getOpsItemId() != null)
            sb.append("OpsItemId: " + getOpsItemId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOpsItemId() == null) ? 0 : getOpsItemId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelatedOpsItem == false)
            return false;
        RelatedOpsItem other = (RelatedOpsItem) obj;

        if (other.getOpsItemId() == null ^ this.getOpsItemId() == null)
            return false;
        if (other.getOpsItemId() != null
                && other.getOpsItemId().equals(this.getOpsItemId()) == false)
            return false;
        return true;
    }
}
