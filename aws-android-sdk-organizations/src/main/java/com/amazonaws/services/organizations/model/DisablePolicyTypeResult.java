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

package com.amazonaws.services.organizations.model;

import java.io.Serializable;

public class DisablePolicyTypeResult implements Serializable {
    /**
     * <p>
     * A structure that shows the root with the updated list of enabled policy
     * types.
     * </p>
     */
    private Root root;

    /**
     * <p>
     * A structure that shows the root with the updated list of enabled policy
     * types.
     * </p>
     *
     * @return <p>
     *         A structure that shows the root with the updated list of enabled
     *         policy types.
     *         </p>
     */
    public Root getRoot() {
        return root;
    }

    /**
     * <p>
     * A structure that shows the root with the updated list of enabled policy
     * types.
     * </p>
     *
     * @param root <p>
     *            A structure that shows the root with the updated list of
     *            enabled policy types.
     *            </p>
     */
    public void setRoot(Root root) {
        this.root = root;
    }

    /**
     * <p>
     * A structure that shows the root with the updated list of enabled policy
     * types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param root <p>
     *            A structure that shows the root with the updated list of
     *            enabled policy types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisablePolicyTypeResult withRoot(Root root) {
        this.root = root;
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
        if (getRoot() != null)
            sb.append("Root: " + getRoot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoot() == null) ? 0 : getRoot().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisablePolicyTypeResult == false)
            return false;
        DisablePolicyTypeResult other = (DisablePolicyTypeResult) obj;

        if (other.getRoot() == null ^ this.getRoot() == null)
            return false;
        if (other.getRoot() != null && other.getRoot().equals(this.getRoot()) == false)
            return false;
        return true;
    }
}
