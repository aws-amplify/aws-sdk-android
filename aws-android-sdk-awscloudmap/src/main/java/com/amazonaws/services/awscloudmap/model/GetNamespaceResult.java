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

package com.amazonaws.services.awscloudmap.model;

import java.io.Serializable;

public class GetNamespaceResult implements Serializable {
    /**
     * <p>
     * A complex type that contains information about the specified namespace.
     * </p>
     */
    private Namespace namespace;

    /**
     * <p>
     * A complex type that contains information about the specified namespace.
     * </p>
     *
     * @return <p>
     *         A complex type that contains information about the specified
     *         namespace.
     *         </p>
     */
    public Namespace getNamespace() {
        return namespace;
    }

    /**
     * <p>
     * A complex type that contains information about the specified namespace.
     * </p>
     *
     * @param namespace <p>
     *            A complex type that contains information about the specified
     *            namespace.
     *            </p>
     */
    public void setNamespace(Namespace namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * A complex type that contains information about the specified namespace.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param namespace <p>
     *            A complex type that contains information about the specified
     *            namespace.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetNamespaceResult withNamespace(Namespace namespace) {
        this.namespace = namespace;
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
        if (getNamespace() != null)
            sb.append("Namespace: " + getNamespace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetNamespaceResult == false)
            return false;
        GetNamespaceResult other = (GetNamespaceResult) obj;

        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null
                && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        return true;
    }
}
