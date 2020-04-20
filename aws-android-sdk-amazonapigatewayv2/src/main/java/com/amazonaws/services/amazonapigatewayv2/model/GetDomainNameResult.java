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

package com.amazonaws.services.amazonapigatewayv2.model;

import java.io.Serializable;

public class GetDomainNameResult implements Serializable {
    /**
     * <p>
     * The API mapping selection expression.
     * </p>
     */
    private String apiMappingSelectionExpression;

    /**
     * <p>
     * The name of the DomainName resource.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * The domain name configurations.
     * </p>
     */
    private java.util.List<DomainNameConfiguration> domainNameConfigurations;

    /**
     * <p>
     * The collection of tags associated with a domain name.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The API mapping selection expression.
     * </p>
     *
     * @return <p>
     *         The API mapping selection expression.
     *         </p>
     */
    public String getApiMappingSelectionExpression() {
        return apiMappingSelectionExpression;
    }

    /**
     * <p>
     * The API mapping selection expression.
     * </p>
     *
     * @param apiMappingSelectionExpression <p>
     *            The API mapping selection expression.
     *            </p>
     */
    public void setApiMappingSelectionExpression(String apiMappingSelectionExpression) {
        this.apiMappingSelectionExpression = apiMappingSelectionExpression;
    }

    /**
     * <p>
     * The API mapping selection expression.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apiMappingSelectionExpression <p>
     *            The API mapping selection expression.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainNameResult withApiMappingSelectionExpression(
            String apiMappingSelectionExpression) {
        this.apiMappingSelectionExpression = apiMappingSelectionExpression;
        return this;
    }

    /**
     * <p>
     * The name of the DomainName resource.
     * </p>
     *
     * @return <p>
     *         The name of the DomainName resource.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The name of the DomainName resource.
     * </p>
     *
     * @param domainName <p>
     *            The name of the DomainName resource.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the DomainName resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainName <p>
     *            The name of the DomainName resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainNameResult withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * The domain name configurations.
     * </p>
     *
     * @return <p>
     *         The domain name configurations.
     *         </p>
     */
    public java.util.List<DomainNameConfiguration> getDomainNameConfigurations() {
        return domainNameConfigurations;
    }

    /**
     * <p>
     * The domain name configurations.
     * </p>
     *
     * @param domainNameConfigurations <p>
     *            The domain name configurations.
     *            </p>
     */
    public void setDomainNameConfigurations(
            java.util.Collection<DomainNameConfiguration> domainNameConfigurations) {
        if (domainNameConfigurations == null) {
            this.domainNameConfigurations = null;
            return;
        }

        this.domainNameConfigurations = new java.util.ArrayList<DomainNameConfiguration>(
                domainNameConfigurations);
    }

    /**
     * <p>
     * The domain name configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainNameConfigurations <p>
     *            The domain name configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainNameResult withDomainNameConfigurations(
            DomainNameConfiguration... domainNameConfigurations) {
        if (getDomainNameConfigurations() == null) {
            this.domainNameConfigurations = new java.util.ArrayList<DomainNameConfiguration>(
                    domainNameConfigurations.length);
        }
        for (DomainNameConfiguration value : domainNameConfigurations) {
            this.domainNameConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The domain name configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainNameConfigurations <p>
     *            The domain name configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainNameResult withDomainNameConfigurations(
            java.util.Collection<DomainNameConfiguration> domainNameConfigurations) {
        setDomainNameConfigurations(domainNameConfigurations);
        return this;
    }

    /**
     * <p>
     * The collection of tags associated with a domain name.
     * </p>
     *
     * @return <p>
     *         The collection of tags associated with a domain name.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The collection of tags associated with a domain name.
     * </p>
     *
     * @param tags <p>
     *            The collection of tags associated with a domain name.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The collection of tags associated with a domain name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The collection of tags associated with a domain name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainNameResult withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The collection of tags associated with a domain name.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainNameResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public GetDomainNameResult clearTagsEntries() {
        this.tags = null;
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
        if (getApiMappingSelectionExpression() != null)
            sb.append("ApiMappingSelectionExpression: " + getApiMappingSelectionExpression() + ",");
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getDomainNameConfigurations() != null)
            sb.append("DomainNameConfigurations: " + getDomainNameConfigurations() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getApiMappingSelectionExpression() == null) ? 0
                        : getApiMappingSelectionExpression().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDomainNameConfigurations() == null) ? 0 : getDomainNameConfigurations()
                        .hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDomainNameResult == false)
            return false;
        GetDomainNameResult other = (GetDomainNameResult) obj;

        if (other.getApiMappingSelectionExpression() == null
                ^ this.getApiMappingSelectionExpression() == null)
            return false;
        if (other.getApiMappingSelectionExpression() != null
                && other.getApiMappingSelectionExpression().equals(
                        this.getApiMappingSelectionExpression()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getDomainNameConfigurations() == null
                ^ this.getDomainNameConfigurations() == null)
            return false;
        if (other.getDomainNameConfigurations() != null
                && other.getDomainNameConfigurations().equals(this.getDomainNameConfigurations()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
