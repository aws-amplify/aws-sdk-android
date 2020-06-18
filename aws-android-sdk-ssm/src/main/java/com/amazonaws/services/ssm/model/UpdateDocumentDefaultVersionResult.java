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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

public class UpdateDocumentDefaultVersionResult implements Serializable {
    /**
     * <p>
     * The description of a custom document that you want to set as the default
     * version.
     * </p>
     */
    private DocumentDefaultVersionDescription description;

    /**
     * <p>
     * The description of a custom document that you want to set as the default
     * version.
     * </p>
     *
     * @return <p>
     *         The description of a custom document that you want to set as the
     *         default version.
     *         </p>
     */
    public DocumentDefaultVersionDescription getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of a custom document that you want to set as the default
     * version.
     * </p>
     *
     * @param description <p>
     *            The description of a custom document that you want to set as
     *            the default version.
     *            </p>
     */
    public void setDescription(DocumentDefaultVersionDescription description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of a custom document that you want to set as the default
     * version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of a custom document that you want to set as
     *            the default version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDocumentDefaultVersionResult withDescription(
            DocumentDefaultVersionDescription description) {
        this.description = description;
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDocumentDefaultVersionResult == false)
            return false;
        UpdateDocumentDefaultVersionResult other = (UpdateDocumentDefaultVersionResult) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }
}
