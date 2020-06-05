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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * <p>
 * A snapshot of the documentation of an API.
 * </p>
 * <div class="remarks">
 * <p>
 * Publishing API documentation involves creating a documentation version
 * associated with an API stage and exporting the versioned documentation to an
 * external (e.g., OpenAPI) file.
 * </p>
 * </div> <div class="seeAlso"> <a href=
 * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-documenting-api.html"
 * >Documenting an API</a>, <a>DocumentationPart</a>,
 * <a>DocumentationVersions</a> </div>
 */
public class DocumentationVersion implements Serializable {
    /**
     * <p>
     * The version identifier of the API documentation snapshot.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The date when the API documentation snapshot is created.
     * </p>
     */
    private java.util.Date createdDate;

    /**
     * <p>
     * The description of the API documentation snapshot.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The version identifier of the API documentation snapshot.
     * </p>
     *
     * @return <p>
     *         The version identifier of the API documentation snapshot.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * The version identifier of the API documentation snapshot.
     * </p>
     *
     * @param version <p>
     *            The version identifier of the API documentation snapshot.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version identifier of the API documentation snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The version identifier of the API documentation snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentationVersion withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The date when the API documentation snapshot is created.
     * </p>
     *
     * @return <p>
     *         The date when the API documentation snapshot is created.
     *         </p>
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }

    /**
     * <p>
     * The date when the API documentation snapshot is created.
     * </p>
     *
     * @param createdDate <p>
     *            The date when the API documentation snapshot is created.
     *            </p>
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date when the API documentation snapshot is created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdDate <p>
     *            The date when the API documentation snapshot is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentationVersion withCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * <p>
     * The description of the API documentation snapshot.
     * </p>
     *
     * @return <p>
     *         The description of the API documentation snapshot.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the API documentation snapshot.
     * </p>
     *
     * @param description <p>
     *            The description of the API documentation snapshot.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the API documentation snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the API documentation snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentationVersion withDescription(String description) {
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
        if (getVersion() != null)
            sb.append("version: " + getVersion() + ",");
        if (getCreatedDate() != null)
            sb.append("createdDate: " + getCreatedDate() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
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

        if (obj instanceof DocumentationVersion == false)
            return false;
        DocumentationVersion other = (DocumentationVersion) obj;

        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null
                && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }
}
