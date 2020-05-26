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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * Sheet controls option.
 * </p>
 */
public class SheetControlsOption implements Serializable {
    /**
     * <p>
     * Visibility state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPANDED, COLLAPSED
     */
    private String visibilityState;

    /**
     * <p>
     * Visibility state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPANDED, COLLAPSED
     *
     * @return <p>
     *         Visibility state.
     *         </p>
     * @see DashboardUIState
     */
    public String getVisibilityState() {
        return visibilityState;
    }

    /**
     * <p>
     * Visibility state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPANDED, COLLAPSED
     *
     * @param visibilityState <p>
     *            Visibility state.
     *            </p>
     * @see DashboardUIState
     */
    public void setVisibilityState(String visibilityState) {
        this.visibilityState = visibilityState;
    }

    /**
     * <p>
     * Visibility state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPANDED, COLLAPSED
     *
     * @param visibilityState <p>
     *            Visibility state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DashboardUIState
     */
    public SheetControlsOption withVisibilityState(String visibilityState) {
        this.visibilityState = visibilityState;
        return this;
    }

    /**
     * <p>
     * Visibility state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPANDED, COLLAPSED
     *
     * @param visibilityState <p>
     *            Visibility state.
     *            </p>
     * @see DashboardUIState
     */
    public void setVisibilityState(DashboardUIState visibilityState) {
        this.visibilityState = visibilityState.toString();
    }

    /**
     * <p>
     * Visibility state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPANDED, COLLAPSED
     *
     * @param visibilityState <p>
     *            Visibility state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DashboardUIState
     */
    public SheetControlsOption withVisibilityState(DashboardUIState visibilityState) {
        this.visibilityState = visibilityState.toString();
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
        if (getVisibilityState() != null)
            sb.append("VisibilityState: " + getVisibilityState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVisibilityState() == null) ? 0 : getVisibilityState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SheetControlsOption == false)
            return false;
        SheetControlsOption other = (SheetControlsOption) obj;

        if (other.getVisibilityState() == null ^ this.getVisibilityState() == null)
            return false;
        if (other.getVisibilityState() != null
                && other.getVisibilityState().equals(this.getVisibilityState()) == false)
            return false;
        return true;
    }
}
