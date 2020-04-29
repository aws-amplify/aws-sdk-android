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

/**
 * <p>
 * Contains information about the current status of an asset. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-and-model-states.html"
 * >Asset and Model States</a> in the <i>AWS IoT SiteWise User Guide</i>.
 * </p>
 */
public class AssetStatus implements Serializable {
    /**
     * <p>
     * The current status of the asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, UPDATING, DELETING, FAILED
     */
    private String state;

    /**
     * <p>
     * Contains associated error information, if any.
     * </p>
     */
    private ErrorDetails error;

    /**
     * <p>
     * The current status of the asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, UPDATING, DELETING, FAILED
     *
     * @return <p>
     *         The current status of the asset.
     *         </p>
     * @see AssetState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The current status of the asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, UPDATING, DELETING, FAILED
     *
     * @param state <p>
     *            The current status of the asset.
     *            </p>
     * @see AssetState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current status of the asset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, UPDATING, DELETING, FAILED
     *
     * @param state <p>
     *            The current status of the asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AssetState
     */
    public AssetStatus withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The current status of the asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, UPDATING, DELETING, FAILED
     *
     * @param state <p>
     *            The current status of the asset.
     *            </p>
     * @see AssetState
     */
    public void setState(AssetState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The current status of the asset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, UPDATING, DELETING, FAILED
     *
     * @param state <p>
     *            The current status of the asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AssetState
     */
    public AssetStatus withState(AssetState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Contains associated error information, if any.
     * </p>
     *
     * @return <p>
     *         Contains associated error information, if any.
     *         </p>
     */
    public ErrorDetails getError() {
        return error;
    }

    /**
     * <p>
     * Contains associated error information, if any.
     * </p>
     *
     * @param error <p>
     *            Contains associated error information, if any.
     *            </p>
     */
    public void setError(ErrorDetails error) {
        this.error = error;
    }

    /**
     * <p>
     * Contains associated error information, if any.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param error <p>
     *            Contains associated error information, if any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetStatus withError(ErrorDetails error) {
        this.error = error;
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
        if (getState() != null)
            sb.append("state: " + getState() + ",");
        if (getError() != null)
            sb.append("error: " + getError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetStatus == false)
            return false;
        AssetStatus other = (AssetStatus) obj;

        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        return true;
    }
}
