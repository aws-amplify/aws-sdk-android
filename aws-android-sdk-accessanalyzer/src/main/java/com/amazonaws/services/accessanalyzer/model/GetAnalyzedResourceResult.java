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

package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;

/**
 * <p>
 * The response to the request.
 * </p>
 */
public class GetAnalyzedResourceResult implements Serializable {
    /**
     * <p>
     * An <code>AnalyedResource</code> object that contains information that
     * Access Analyzer found when it analyzed the resource.
     * </p>
     */
    private AnalyzedResource resource;

    /**
     * <p>
     * An <code>AnalyedResource</code> object that contains information that
     * Access Analyzer found when it analyzed the resource.
     * </p>
     *
     * @return <p>
     *         An <code>AnalyedResource</code> object that contains information
     *         that Access Analyzer found when it analyzed the resource.
     *         </p>
     */
    public AnalyzedResource getResource() {
        return resource;
    }

    /**
     * <p>
     * An <code>AnalyedResource</code> object that contains information that
     * Access Analyzer found when it analyzed the resource.
     * </p>
     *
     * @param resource <p>
     *            An <code>AnalyedResource</code> object that contains
     *            information that Access Analyzer found when it analyzed the
     *            resource.
     *            </p>
     */
    public void setResource(AnalyzedResource resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * An <code>AnalyedResource</code> object that contains information that
     * Access Analyzer found when it analyzed the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resource <p>
     *            An <code>AnalyedResource</code> object that contains
     *            information that Access Analyzer found when it analyzed the
     *            resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAnalyzedResourceResult withResource(AnalyzedResource resource) {
        this.resource = resource;
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
        if (getResource() != null)
            sb.append("resource: " + getResource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAnalyzedResourceResult == false)
            return false;
        GetAnalyzedResourceResult other = (GetAnalyzedResourceResult) obj;

        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        return true;
    }
}
