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

public class DeleteAssetResult implements Serializable {
    /**
     * <p>
     * The status of the asset, which contains a state (<code>DELETING</code>
     * after successfully calling this action) and any error message.
     * </p>
     */
    private AssetStatus assetStatus;

    /**
     * <p>
     * The status of the asset, which contains a state (<code>DELETING</code>
     * after successfully calling this action) and any error message.
     * </p>
     *
     * @return <p>
     *         The status of the asset, which contains a state (
     *         <code>DELETING</code> after successfully calling this action) and
     *         any error message.
     *         </p>
     */
    public AssetStatus getAssetStatus() {
        return assetStatus;
    }

    /**
     * <p>
     * The status of the asset, which contains a state (<code>DELETING</code>
     * after successfully calling this action) and any error message.
     * </p>
     *
     * @param assetStatus <p>
     *            The status of the asset, which contains a state (
     *            <code>DELETING</code> after successfully calling this action)
     *            and any error message.
     *            </p>
     */
    public void setAssetStatus(AssetStatus assetStatus) {
        this.assetStatus = assetStatus;
    }

    /**
     * <p>
     * The status of the asset, which contains a state (<code>DELETING</code>
     * after successfully calling this action) and any error message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetStatus <p>
     *            The status of the asset, which contains a state (
     *            <code>DELETING</code> after successfully calling this action)
     *            and any error message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteAssetResult withAssetStatus(AssetStatus assetStatus) {
        this.assetStatus = assetStatus;
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
        if (getAssetStatus() != null)
            sb.append("assetStatus: " + getAssetStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssetStatus() == null) ? 0 : getAssetStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAssetResult == false)
            return false;
        DeleteAssetResult other = (DeleteAssetResult) obj;

        if (other.getAssetStatus() == null ^ this.getAssetStatus() == null)
            return false;
        if (other.getAssetStatus() != null
                && other.getAssetStatus().equals(this.getAssetStatus()) == false)
            return false;
        return true;
    }
}
