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

package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;

/**
 * <p>
 * Contains error information for asset property value entries that are
 * associated with the <a href=
 * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_BatchPutAssetPropertyValue.html"
 * >BatchPutAssetPropertyValue</a> API.
 * </p>
 */
public class BatchPutAssetPropertyErrorEntry implements Serializable {
    /**
     * <p>
     * The ID of the failed entry.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_-]+$<br/>
     */
    private String entryId;

    /**
     * <p>
     * The list of update property value errors.
     * </p>
     */
    private java.util.List<BatchPutAssetPropertyError> errors;

    /**
     * <p>
     * The ID of the failed entry.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_-]+$<br/>
     *
     * @return <p>
     *         The ID of the failed entry.
     *         </p>
     */
    public String getEntryId() {
        return entryId;
    }

    /**
     * <p>
     * The ID of the failed entry.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_-]+$<br/>
     *
     * @param entryId <p>
     *            The ID of the failed entry.
     *            </p>
     */
    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    /**
     * <p>
     * The ID of the failed entry.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_-]+$<br/>
     *
     * @param entryId <p>
     *            The ID of the failed entry.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutAssetPropertyErrorEntry withEntryId(String entryId) {
        this.entryId = entryId;
        return this;
    }

    /**
     * <p>
     * The list of update property value errors.
     * </p>
     *
     * @return <p>
     *         The list of update property value errors.
     *         </p>
     */
    public java.util.List<BatchPutAssetPropertyError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * The list of update property value errors.
     * </p>
     *
     * @param errors <p>
     *            The list of update property value errors.
     *            </p>
     */
    public void setErrors(java.util.Collection<BatchPutAssetPropertyError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchPutAssetPropertyError>(errors);
    }

    /**
     * <p>
     * The list of update property value errors.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            The list of update property value errors.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutAssetPropertyErrorEntry withErrors(BatchPutAssetPropertyError... errors) {
        if (getErrors() == null) {
            this.errors = new java.util.ArrayList<BatchPutAssetPropertyError>(errors.length);
        }
        for (BatchPutAssetPropertyError value : errors) {
            this.errors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of update property value errors.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            The list of update property value errors.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutAssetPropertyErrorEntry withErrors(
            java.util.Collection<BatchPutAssetPropertyError> errors) {
        setErrors(errors);
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
        if (getEntryId() != null)
            sb.append("entryId: " + getEntryId() + ",");
        if (getErrors() != null)
            sb.append("errors: " + getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntryId() == null) ? 0 : getEntryId().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPutAssetPropertyErrorEntry == false)
            return false;
        BatchPutAssetPropertyErrorEntry other = (BatchPutAssetPropertyErrorEntry) obj;

        if (other.getEntryId() == null ^ this.getEntryId() == null)
            return false;
        if (other.getEntryId() != null && other.getEntryId().equals(this.getEntryId()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }
}
