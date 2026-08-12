/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class CreateViewVersionResult implements Serializable {
    /**
     * <p>
     * All view data is contained within the View object.
     * </p>
     */
    private View view;

    /**
     * <p>
     * All view data is contained within the View object.
     * </p>
     *
     * @return <p>
     *         All view data is contained within the View object.
     *         </p>
     */
    public View getView() {
        return view;
    }

    /**
     * <p>
     * All view data is contained within the View object.
     * </p>
     *
     * @param view <p>
     *            All view data is contained within the View object.
     *            </p>
     */
    public void setView(View view) {
        this.view = view;
    }

    /**
     * <p>
     * All view data is contained within the View object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param view <p>
     *            All view data is contained within the View object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateViewVersionResult withView(View view) {
        this.view = view;
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
        if (getView() != null)
            sb.append("View: " + getView());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getView() == null) ? 0 : getView().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateViewVersionResult == false)
            return false;
        CreateViewVersionResult other = (CreateViewVersionResult) obj;

        if (other.getView() == null ^ this.getView() == null)
            return false;
        if (other.getView() != null && other.getView().equals(this.getView()) == false)
            return false;
        return true;
    }
}
