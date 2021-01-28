/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class ListProvisioningTemplateVersionsResult implements Serializable {
    /**
     * <p>
     * The list of fleet provisioning template versions.
     * </p>
     */
    private java.util.List<ProvisioningTemplateVersionSummary> versions;

    /**
     * <p>
     * A token to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of fleet provisioning template versions.
     * </p>
     *
     * @return <p>
     *         The list of fleet provisioning template versions.
     *         </p>
     */
    public java.util.List<ProvisioningTemplateVersionSummary> getVersions() {
        return versions;
    }

    /**
     * <p>
     * The list of fleet provisioning template versions.
     * </p>
     *
     * @param versions <p>
     *            The list of fleet provisioning template versions.
     *            </p>
     */
    public void setVersions(java.util.Collection<ProvisioningTemplateVersionSummary> versions) {
        if (versions == null) {
            this.versions = null;
            return;
        }

        this.versions = new java.util.ArrayList<ProvisioningTemplateVersionSummary>(versions);
    }

    /**
     * <p>
     * The list of fleet provisioning template versions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versions <p>
     *            The list of fleet provisioning template versions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProvisioningTemplateVersionsResult withVersions(
            ProvisioningTemplateVersionSummary... versions) {
        if (getVersions() == null) {
            this.versions = new java.util.ArrayList<ProvisioningTemplateVersionSummary>(
                    versions.length);
        }
        for (ProvisioningTemplateVersionSummary value : versions) {
            this.versions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of fleet provisioning template versions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versions <p>
     *            The list of fleet provisioning template versions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProvisioningTemplateVersionsResult withVersions(
            java.util.Collection<ProvisioningTemplateVersionSummary> versions) {
        setVersions(versions);
        return this;
    }

    /**
     * <p>
     * A token to retrieve the next set of results.
     * </p>
     *
     * @return <p>
     *         A token to retrieve the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token to retrieve the next set of results.
     * </p>
     *
     * @param nextToken <p>
     *            A token to retrieve the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to retrieve the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token to retrieve the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProvisioningTemplateVersionsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getVersions() != null)
            sb.append("versions: " + getVersions() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersions() == null) ? 0 : getVersions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProvisioningTemplateVersionsResult == false)
            return false;
        ListProvisioningTemplateVersionsResult other = (ListProvisioningTemplateVersionsResult) obj;

        if (other.getVersions() == null ^ this.getVersions() == null)
            return false;
        if (other.getVersions() != null && other.getVersions().equals(this.getVersions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
