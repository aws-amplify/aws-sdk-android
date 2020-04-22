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

package com.amazonaws.services.amazonelasticsearchservice.model;

import java.io.Serializable;

/**
 * <p>
 * A map from an <code> <a>ElasticsearchVersion</a> </code> to a list of
 * compatible <code> <a>ElasticsearchVersion</a> </code> s to which the domain
 * can be upgraded.
 * </p>
 */
public class CompatibleVersionsMap implements Serializable {
    /**
     * <p>
     * The current version of Elasticsearch on which a domain is.
     * </p>
     */
    private String sourceVersion;

    /**
     * <p>
     * List of supported elastic search versions.
     * </p>
     */
    private java.util.List<String> targetVersions;

    /**
     * <p>
     * The current version of Elasticsearch on which a domain is.
     * </p>
     *
     * @return <p>
     *         The current version of Elasticsearch on which a domain is.
     *         </p>
     */
    public String getSourceVersion() {
        return sourceVersion;
    }

    /**
     * <p>
     * The current version of Elasticsearch on which a domain is.
     * </p>
     *
     * @param sourceVersion <p>
     *            The current version of Elasticsearch on which a domain is.
     *            </p>
     */
    public void setSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    /**
     * <p>
     * The current version of Elasticsearch on which a domain is.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceVersion <p>
     *            The current version of Elasticsearch on which a domain is.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompatibleVersionsMap withSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
        return this;
    }

    /**
     * <p>
     * List of supported elastic search versions.
     * </p>
     *
     * @return <p>
     *         List of supported elastic search versions.
     *         </p>
     */
    public java.util.List<String> getTargetVersions() {
        return targetVersions;
    }

    /**
     * <p>
     * List of supported elastic search versions.
     * </p>
     *
     * @param targetVersions <p>
     *            List of supported elastic search versions.
     *            </p>
     */
    public void setTargetVersions(java.util.Collection<String> targetVersions) {
        if (targetVersions == null) {
            this.targetVersions = null;
            return;
        }

        this.targetVersions = new java.util.ArrayList<String>(targetVersions);
    }

    /**
     * <p>
     * List of supported elastic search versions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetVersions <p>
     *            List of supported elastic search versions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompatibleVersionsMap withTargetVersions(String... targetVersions) {
        if (getTargetVersions() == null) {
            this.targetVersions = new java.util.ArrayList<String>(targetVersions.length);
        }
        for (String value : targetVersions) {
            this.targetVersions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of supported elastic search versions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetVersions <p>
     *            List of supported elastic search versions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompatibleVersionsMap withTargetVersions(java.util.Collection<String> targetVersions) {
        setTargetVersions(targetVersions);
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
        if (getSourceVersion() != null)
            sb.append("SourceVersion: " + getSourceVersion() + ",");
        if (getTargetVersions() != null)
            sb.append("TargetVersions: " + getTargetVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSourceVersion() == null) ? 0 : getSourceVersion().hashCode());
        hashCode = prime * hashCode
                + ((getTargetVersions() == null) ? 0 : getTargetVersions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompatibleVersionsMap == false)
            return false;
        CompatibleVersionsMap other = (CompatibleVersionsMap) obj;

        if (other.getSourceVersion() == null ^ this.getSourceVersion() == null)
            return false;
        if (other.getSourceVersion() != null
                && other.getSourceVersion().equals(this.getSourceVersion()) == false)
            return false;
        if (other.getTargetVersions() == null ^ this.getTargetVersions() == null)
            return false;
        if (other.getTargetVersions() != null
                && other.getTargetVersions().equals(this.getTargetVersions()) == false)
            return false;
        return true;
    }
}
