/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

public class CreateImportJobResult implements Serializable {
    /**
     * The new value for the importJobResponse property for this object.
     */
    private ImportJobResponse importJobResponse;

    /**
     * Returns the value of the importJobResponse property for this object.
     *
     * @return The value of the importJobResponse property for this object.
     */
    public ImportJobResponse getImportJobResponse() {
        return importJobResponse;
    }

    /**
     * Sets the value of importJobResponse
     *
     * @param importJobResponse The new value for the importJobResponse property
     *            for this object.
     */
    public void setImportJobResponse(ImportJobResponse importJobResponse) {
        this.importJobResponse = importJobResponse;
    }

    /**
     * Sets the value of the importJobResponse property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importJobResponse The new value for the importJobResponse property
     *            for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateImportJobResult withImportJobResponse(ImportJobResponse importJobResponse) {
        this.importJobResponse = importJobResponse;
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
        if (getImportJobResponse() != null)
            sb.append("ImportJobResponse: " + getImportJobResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getImportJobResponse() == null) ? 0 : getImportJobResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateImportJobResult == false)
            return false;
        CreateImportJobResult other = (CreateImportJobResult) obj;

        if (other.getImportJobResponse() == null ^ this.getImportJobResponse() == null)
            return false;
        if (other.getImportJobResponse() != null
                && other.getImportJobResponse().equals(this.getImportJobResponse()) == false)
            return false;
        return true;
    }
}
