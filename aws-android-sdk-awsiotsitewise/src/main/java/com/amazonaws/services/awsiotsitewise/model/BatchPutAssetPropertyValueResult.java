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

package com.amazonaws.services.awsiotsitewise.model;

import java.io.Serializable;

public class BatchPutAssetPropertyValueResult implements Serializable {
    /**
     * <p>
     * A list of the errors (if any) associated with the batch put request. Each
     * error entry contains the <code>entryId</code> of the entry that failed.
     * </p>
     */
    private java.util.List<BatchPutAssetPropertyErrorEntry> errorEntries;

    /**
     * <p>
     * A list of the errors (if any) associated with the batch put request. Each
     * error entry contains the <code>entryId</code> of the entry that failed.
     * </p>
     *
     * @return <p>
     *         A list of the errors (if any) associated with the batch put
     *         request. Each error entry contains the <code>entryId</code> of
     *         the entry that failed.
     *         </p>
     */
    public java.util.List<BatchPutAssetPropertyErrorEntry> getErrorEntries() {
        return errorEntries;
    }

    /**
     * <p>
     * A list of the errors (if any) associated with the batch put request. Each
     * error entry contains the <code>entryId</code> of the entry that failed.
     * </p>
     *
     * @param errorEntries <p>
     *            A list of the errors (if any) associated with the batch put
     *            request. Each error entry contains the <code>entryId</code> of
     *            the entry that failed.
     *            </p>
     */
    public void setErrorEntries(java.util.Collection<BatchPutAssetPropertyErrorEntry> errorEntries) {
        if (errorEntries == null) {
            this.errorEntries = null;
            return;
        }

        this.errorEntries = new java.util.ArrayList<BatchPutAssetPropertyErrorEntry>(errorEntries);
    }

    /**
     * <p>
     * A list of the errors (if any) associated with the batch put request. Each
     * error entry contains the <code>entryId</code> of the entry that failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorEntries <p>
     *            A list of the errors (if any) associated with the batch put
     *            request. Each error entry contains the <code>entryId</code> of
     *            the entry that failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutAssetPropertyValueResult withErrorEntries(
            BatchPutAssetPropertyErrorEntry... errorEntries) {
        if (getErrorEntries() == null) {
            this.errorEntries = new java.util.ArrayList<BatchPutAssetPropertyErrorEntry>(
                    errorEntries.length);
        }
        for (BatchPutAssetPropertyErrorEntry value : errorEntries) {
            this.errorEntries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the errors (if any) associated with the batch put request. Each
     * error entry contains the <code>entryId</code> of the entry that failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorEntries <p>
     *            A list of the errors (if any) associated with the batch put
     *            request. Each error entry contains the <code>entryId</code> of
     *            the entry that failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutAssetPropertyValueResult withErrorEntries(
            java.util.Collection<BatchPutAssetPropertyErrorEntry> errorEntries) {
        setErrorEntries(errorEntries);
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
        if (getErrorEntries() != null)
            sb.append("errorEntries: " + getErrorEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getErrorEntries() == null) ? 0 : getErrorEntries().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPutAssetPropertyValueResult == false)
            return false;
        BatchPutAssetPropertyValueResult other = (BatchPutAssetPropertyValueResult) obj;

        if (other.getErrorEntries() == null ^ this.getErrorEntries() == null)
            return false;
        if (other.getErrorEntries() != null
                && other.getErrorEntries().equals(this.getErrorEntries()) == false)
            return false;
        return true;
    }
}
