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
 * A collection of the imported <a>DocumentationPart</a> identifiers.
 * </p>
 * <div class="remarks">This is used to return the result when documentation
 * parts in an external (e.g., OpenAPI) file are imported into API Gateway</div>
 * <div class="seeAlso"> <a href=
 * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-documenting-api.html"
 * >Documenting an API</a>, <a href=
 * "https://docs.aws.amazon.com/apigateway/api-reference/link-relation/documentationpart-import/"
 * >documentationpart:import</a>, <a>DocumentationPart</a> </div>
 */
public class ImportDocumentationPartsResult implements Serializable {
    /**
     * <p>
     * A list of the returned documentation part identifiers.
     * </p>
     */
    private java.util.List<String> ids;

    /**
     * <p>
     * A list of warning messages reported during import of documentation parts.
     * </p>
     */
    private java.util.List<String> warnings;

    /**
     * <p>
     * A list of the returned documentation part identifiers.
     * </p>
     *
     * @return <p>
     *         A list of the returned documentation part identifiers.
     *         </p>
     */
    public java.util.List<String> getIds() {
        return ids;
    }

    /**
     * <p>
     * A list of the returned documentation part identifiers.
     * </p>
     *
     * @param ids <p>
     *            A list of the returned documentation part identifiers.
     *            </p>
     */
    public void setIds(java.util.Collection<String> ids) {
        if (ids == null) {
            this.ids = null;
            return;
        }

        this.ids = new java.util.ArrayList<String>(ids);
    }

    /**
     * <p>
     * A list of the returned documentation part identifiers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ids <p>
     *            A list of the returned documentation part identifiers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportDocumentationPartsResult withIds(String... ids) {
        if (getIds() == null) {
            this.ids = new java.util.ArrayList<String>(ids.length);
        }
        for (String value : ids) {
            this.ids.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the returned documentation part identifiers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ids <p>
     *            A list of the returned documentation part identifiers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportDocumentationPartsResult withIds(java.util.Collection<String> ids) {
        setIds(ids);
        return this;
    }

    /**
     * <p>
     * A list of warning messages reported during import of documentation parts.
     * </p>
     *
     * @return <p>
     *         A list of warning messages reported during import of
     *         documentation parts.
     *         </p>
     */
    public java.util.List<String> getWarnings() {
        return warnings;
    }

    /**
     * <p>
     * A list of warning messages reported during import of documentation parts.
     * </p>
     *
     * @param warnings <p>
     *            A list of warning messages reported during import of
     *            documentation parts.
     *            </p>
     */
    public void setWarnings(java.util.Collection<String> warnings) {
        if (warnings == null) {
            this.warnings = null;
            return;
        }

        this.warnings = new java.util.ArrayList<String>(warnings);
    }

    /**
     * <p>
     * A list of warning messages reported during import of documentation parts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param warnings <p>
     *            A list of warning messages reported during import of
     *            documentation parts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportDocumentationPartsResult withWarnings(String... warnings) {
        if (getWarnings() == null) {
            this.warnings = new java.util.ArrayList<String>(warnings.length);
        }
        for (String value : warnings) {
            this.warnings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of warning messages reported during import of documentation parts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param warnings <p>
     *            A list of warning messages reported during import of
     *            documentation parts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportDocumentationPartsResult withWarnings(java.util.Collection<String> warnings) {
        setWarnings(warnings);
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
        if (getIds() != null)
            sb.append("ids: " + getIds() + ",");
        if (getWarnings() != null)
            sb.append("warnings: " + getWarnings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIds() == null) ? 0 : getIds().hashCode());
        hashCode = prime * hashCode + ((getWarnings() == null) ? 0 : getWarnings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportDocumentationPartsResult == false)
            return false;
        ImportDocumentationPartsResult other = (ImportDocumentationPartsResult) obj;

        if (other.getIds() == null ^ this.getIds() == null)
            return false;
        if (other.getIds() != null && other.getIds().equals(this.getIds()) == false)
            return false;
        if (other.getWarnings() == null ^ this.getWarnings() == null)
            return false;
        if (other.getWarnings() != null && other.getWarnings().equals(this.getWarnings()) == false)
            return false;
        return true;
    }
}
