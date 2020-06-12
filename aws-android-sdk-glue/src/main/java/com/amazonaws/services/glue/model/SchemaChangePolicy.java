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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

/**
 * <p>
 * A policy that specifies update and deletion behaviors for the crawler.
 * </p>
 */
public class SchemaChangePolicy implements Serializable {
    /**
     * <p>
     * The update behavior when the crawler finds a changed schema.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOG, UPDATE_IN_DATABASE
     */
    private String updateBehavior;

    /**
     * <p>
     * The deletion behavior when the crawler finds a deleted object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOG, DELETE_FROM_DATABASE, DEPRECATE_IN_DATABASE
     */
    private String deleteBehavior;

    /**
     * <p>
     * The update behavior when the crawler finds a changed schema.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOG, UPDATE_IN_DATABASE
     *
     * @return <p>
     *         The update behavior when the crawler finds a changed schema.
     *         </p>
     * @see UpdateBehavior
     */
    public String getUpdateBehavior() {
        return updateBehavior;
    }

    /**
     * <p>
     * The update behavior when the crawler finds a changed schema.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOG, UPDATE_IN_DATABASE
     *
     * @param updateBehavior <p>
     *            The update behavior when the crawler finds a changed schema.
     *            </p>
     * @see UpdateBehavior
     */
    public void setUpdateBehavior(String updateBehavior) {
        this.updateBehavior = updateBehavior;
    }

    /**
     * <p>
     * The update behavior when the crawler finds a changed schema.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOG, UPDATE_IN_DATABASE
     *
     * @param updateBehavior <p>
     *            The update behavior when the crawler finds a changed schema.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UpdateBehavior
     */
    public SchemaChangePolicy withUpdateBehavior(String updateBehavior) {
        this.updateBehavior = updateBehavior;
        return this;
    }

    /**
     * <p>
     * The update behavior when the crawler finds a changed schema.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOG, UPDATE_IN_DATABASE
     *
     * @param updateBehavior <p>
     *            The update behavior when the crawler finds a changed schema.
     *            </p>
     * @see UpdateBehavior
     */
    public void setUpdateBehavior(UpdateBehavior updateBehavior) {
        this.updateBehavior = updateBehavior.toString();
    }

    /**
     * <p>
     * The update behavior when the crawler finds a changed schema.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOG, UPDATE_IN_DATABASE
     *
     * @param updateBehavior <p>
     *            The update behavior when the crawler finds a changed schema.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UpdateBehavior
     */
    public SchemaChangePolicy withUpdateBehavior(UpdateBehavior updateBehavior) {
        this.updateBehavior = updateBehavior.toString();
        return this;
    }

    /**
     * <p>
     * The deletion behavior when the crawler finds a deleted object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOG, DELETE_FROM_DATABASE, DEPRECATE_IN_DATABASE
     *
     * @return <p>
     *         The deletion behavior when the crawler finds a deleted object.
     *         </p>
     * @see DeleteBehavior
     */
    public String getDeleteBehavior() {
        return deleteBehavior;
    }

    /**
     * <p>
     * The deletion behavior when the crawler finds a deleted object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOG, DELETE_FROM_DATABASE, DEPRECATE_IN_DATABASE
     *
     * @param deleteBehavior <p>
     *            The deletion behavior when the crawler finds a deleted object.
     *            </p>
     * @see DeleteBehavior
     */
    public void setDeleteBehavior(String deleteBehavior) {
        this.deleteBehavior = deleteBehavior;
    }

    /**
     * <p>
     * The deletion behavior when the crawler finds a deleted object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOG, DELETE_FROM_DATABASE, DEPRECATE_IN_DATABASE
     *
     * @param deleteBehavior <p>
     *            The deletion behavior when the crawler finds a deleted object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeleteBehavior
     */
    public SchemaChangePolicy withDeleteBehavior(String deleteBehavior) {
        this.deleteBehavior = deleteBehavior;
        return this;
    }

    /**
     * <p>
     * The deletion behavior when the crawler finds a deleted object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOG, DELETE_FROM_DATABASE, DEPRECATE_IN_DATABASE
     *
     * @param deleteBehavior <p>
     *            The deletion behavior when the crawler finds a deleted object.
     *            </p>
     * @see DeleteBehavior
     */
    public void setDeleteBehavior(DeleteBehavior deleteBehavior) {
        this.deleteBehavior = deleteBehavior.toString();
    }

    /**
     * <p>
     * The deletion behavior when the crawler finds a deleted object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOG, DELETE_FROM_DATABASE, DEPRECATE_IN_DATABASE
     *
     * @param deleteBehavior <p>
     *            The deletion behavior when the crawler finds a deleted object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeleteBehavior
     */
    public SchemaChangePolicy withDeleteBehavior(DeleteBehavior deleteBehavior) {
        this.deleteBehavior = deleteBehavior.toString();
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
        if (getUpdateBehavior() != null)
            sb.append("UpdateBehavior: " + getUpdateBehavior() + ",");
        if (getDeleteBehavior() != null)
            sb.append("DeleteBehavior: " + getDeleteBehavior());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUpdateBehavior() == null) ? 0 : getUpdateBehavior().hashCode());
        hashCode = prime * hashCode
                + ((getDeleteBehavior() == null) ? 0 : getDeleteBehavior().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchemaChangePolicy == false)
            return false;
        SchemaChangePolicy other = (SchemaChangePolicy) obj;

        if (other.getUpdateBehavior() == null ^ this.getUpdateBehavior() == null)
            return false;
        if (other.getUpdateBehavior() != null
                && other.getUpdateBehavior().equals(this.getUpdateBehavior()) == false)
            return false;
        if (other.getDeleteBehavior() == null ^ this.getDeleteBehavior() == null)
            return false;
        if (other.getDeleteBehavior() != null
                && other.getDeleteBehavior().equals(this.getDeleteBehavior()) == false)
            return false;
        return true;
    }
}
