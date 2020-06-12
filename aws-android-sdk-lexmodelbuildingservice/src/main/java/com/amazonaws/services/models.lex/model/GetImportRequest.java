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

package com.amazonaws.services.models.lex.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets information about an import job started with the
 * <code>StartImport</code> operation.
 * </p>
 */
public class GetImportRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the import job information to return.
     * </p>
     */
    private String importId;

    /**
     * <p>
     * The identifier of the import job information to return.
     * </p>
     *
     * @return <p>
     *         The identifier of the import job information to return.
     *         </p>
     */
    public String getImportId() {
        return importId;
    }

    /**
     * <p>
     * The identifier of the import job information to return.
     * </p>
     *
     * @param importId <p>
     *            The identifier of the import job information to return.
     *            </p>
     */
    public void setImportId(String importId) {
        this.importId = importId;
    }

    /**
     * <p>
     * The identifier of the import job information to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importId <p>
     *            The identifier of the import job information to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetImportRequest withImportId(String importId) {
        this.importId = importId;
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
        if (getImportId() != null)
            sb.append("importId: " + getImportId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImportId() == null) ? 0 : getImportId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetImportRequest == false)
            return false;
        GetImportRequest other = (GetImportRequest) obj;

        if (other.getImportId() == null ^ this.getImportId() == null)
            return false;
        if (other.getImportId() != null && other.getImportId().equals(this.getImportId()) == false)
            return false;
        return true;
    }
}
