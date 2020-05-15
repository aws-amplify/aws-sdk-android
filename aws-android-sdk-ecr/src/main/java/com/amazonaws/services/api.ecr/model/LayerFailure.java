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

package com.amazonaws.services.api.ecr.model;

import java.io.Serializable;

/**
 * <p>
 * An object representing an Amazon ECR image layer failure.
 * </p>
 */
public class LayerFailure implements Serializable {
    /**
     * <p>
     * The layer digest associated with the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     */
    private String layerDigest;

    /**
     * <p>
     * The failure code associated with the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InvalidLayerDigest, MissingLayerDigest
     */
    private String failureCode;

    /**
     * <p>
     * The reason for the failure.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The layer digest associated with the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @return <p>
     *         The layer digest associated with the failure.
     *         </p>
     */
    public String getLayerDigest() {
        return layerDigest;
    }

    /**
     * <p>
     * The layer digest associated with the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param layerDigest <p>
     *            The layer digest associated with the failure.
     *            </p>
     */
    public void setLayerDigest(String layerDigest) {
        this.layerDigest = layerDigest;
    }

    /**
     * <p>
     * The layer digest associated with the failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param layerDigest <p>
     *            The layer digest associated with the failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LayerFailure withLayerDigest(String layerDigest) {
        this.layerDigest = layerDigest;
        return this;
    }

    /**
     * <p>
     * The failure code associated with the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InvalidLayerDigest, MissingLayerDigest
     *
     * @return <p>
     *         The failure code associated with the failure.
     *         </p>
     * @see LayerFailureCode
     */
    public String getFailureCode() {
        return failureCode;
    }

    /**
     * <p>
     * The failure code associated with the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InvalidLayerDigest, MissingLayerDigest
     *
     * @param failureCode <p>
     *            The failure code associated with the failure.
     *            </p>
     * @see LayerFailureCode
     */
    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * The failure code associated with the failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InvalidLayerDigest, MissingLayerDigest
     *
     * @param failureCode <p>
     *            The failure code associated with the failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LayerFailureCode
     */
    public LayerFailure withFailureCode(String failureCode) {
        this.failureCode = failureCode;
        return this;
    }

    /**
     * <p>
     * The failure code associated with the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InvalidLayerDigest, MissingLayerDigest
     *
     * @param failureCode <p>
     *            The failure code associated with the failure.
     *            </p>
     * @see LayerFailureCode
     */
    public void setFailureCode(LayerFailureCode failureCode) {
        this.failureCode = failureCode.toString();
    }

    /**
     * <p>
     * The failure code associated with the failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InvalidLayerDigest, MissingLayerDigest
     *
     * @param failureCode <p>
     *            The failure code associated with the failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LayerFailureCode
     */
    public LayerFailure withFailureCode(LayerFailureCode failureCode) {
        this.failureCode = failureCode.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the failure.
     * </p>
     *
     * @return <p>
     *         The reason for the failure.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * The reason for the failure.
     * </p>
     *
     * @param failureReason <p>
     *            The reason for the failure.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason for the failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureReason <p>
     *            The reason for the failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LayerFailure withFailureReason(String failureReason) {
        this.failureReason = failureReason;
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
        if (getLayerDigest() != null)
            sb.append("layerDigest: " + getLayerDigest() + ",");
        if (getFailureCode() != null)
            sb.append("failureCode: " + getFailureCode() + ",");
        if (getFailureReason() != null)
            sb.append("failureReason: " + getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLayerDigest() == null) ? 0 : getLayerDigest().hashCode());
        hashCode = prime * hashCode
                + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LayerFailure == false)
            return false;
        LayerFailure other = (LayerFailure) obj;

        if (other.getLayerDigest() == null ^ this.getLayerDigest() == null)
            return false;
        if (other.getLayerDigest() != null
                && other.getLayerDigest().equals(this.getLayerDigest()) == false)
            return false;
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null
                && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }
}
