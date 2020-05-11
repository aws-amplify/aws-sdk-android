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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies configuration information for the knowlege article types that
 * Amazon Kendra indexes. Amazon Kendra indexes standard knowledge articles and
 * the standard fields of knowledge articles, or the custom fields of custom
 * knowledge articles, but not both
 * </p>
 */
public class SalesforceKnowledgeArticleConfiguration implements Serializable {
    /**
     * <p>
     * Specifies the document states that should be included when Amazon Kendra
     * indexes knowledge articles. You must specify at least one state.
     * </p>
     */
    private java.util.List<String> includedStates;

    /**
     * <p>
     * Provides configuration information for standard Salesforce knowledge
     * articles.
     * </p>
     */
    private SalesforceStandardKnowledgeArticleTypeConfiguration standardKnowledgeArticleTypeConfiguration;

    /**
     * <p>
     * Provides configuration information for custom Salesforce knowledge
     * articles.
     * </p>
     */
    private java.util.List<SalesforceCustomKnowledgeArticleTypeConfiguration> customKnowledgeArticleTypeConfigurations;

    /**
     * <p>
     * Specifies the document states that should be included when Amazon Kendra
     * indexes knowledge articles. You must specify at least one state.
     * </p>
     *
     * @return <p>
     *         Specifies the document states that should be included when Amazon
     *         Kendra indexes knowledge articles. You must specify at least one
     *         state.
     *         </p>
     */
    public java.util.List<String> getIncludedStates() {
        return includedStates;
    }

    /**
     * <p>
     * Specifies the document states that should be included when Amazon Kendra
     * indexes knowledge articles. You must specify at least one state.
     * </p>
     *
     * @param includedStates <p>
     *            Specifies the document states that should be included when
     *            Amazon Kendra indexes knowledge articles. You must specify at
     *            least one state.
     *            </p>
     */
    public void setIncludedStates(java.util.Collection<String> includedStates) {
        if (includedStates == null) {
            this.includedStates = null;
            return;
        }

        this.includedStates = new java.util.ArrayList<String>(includedStates);
    }

    /**
     * <p>
     * Specifies the document states that should be included when Amazon Kendra
     * indexes knowledge articles. You must specify at least one state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includedStates <p>
     *            Specifies the document states that should be included when
     *            Amazon Kendra indexes knowledge articles. You must specify at
     *            least one state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceKnowledgeArticleConfiguration withIncludedStates(String... includedStates) {
        if (getIncludedStates() == null) {
            this.includedStates = new java.util.ArrayList<String>(includedStates.length);
        }
        for (String value : includedStates) {
            this.includedStates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the document states that should be included when Amazon Kendra
     * indexes knowledge articles. You must specify at least one state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includedStates <p>
     *            Specifies the document states that should be included when
     *            Amazon Kendra indexes knowledge articles. You must specify at
     *            least one state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceKnowledgeArticleConfiguration withIncludedStates(
            java.util.Collection<String> includedStates) {
        setIncludedStates(includedStates);
        return this;
    }

    /**
     * <p>
     * Provides configuration information for standard Salesforce knowledge
     * articles.
     * </p>
     *
     * @return <p>
     *         Provides configuration information for standard Salesforce
     *         knowledge articles.
     *         </p>
     */
    public SalesforceStandardKnowledgeArticleTypeConfiguration getStandardKnowledgeArticleTypeConfiguration() {
        return standardKnowledgeArticleTypeConfiguration;
    }

    /**
     * <p>
     * Provides configuration information for standard Salesforce knowledge
     * articles.
     * </p>
     *
     * @param standardKnowledgeArticleTypeConfiguration <p>
     *            Provides configuration information for standard Salesforce
     *            knowledge articles.
     *            </p>
     */
    public void setStandardKnowledgeArticleTypeConfiguration(
            SalesforceStandardKnowledgeArticleTypeConfiguration standardKnowledgeArticleTypeConfiguration) {
        this.standardKnowledgeArticleTypeConfiguration = standardKnowledgeArticleTypeConfiguration;
    }

    /**
     * <p>
     * Provides configuration information for standard Salesforce knowledge
     * articles.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param standardKnowledgeArticleTypeConfiguration <p>
     *            Provides configuration information for standard Salesforce
     *            knowledge articles.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceKnowledgeArticleConfiguration withStandardKnowledgeArticleTypeConfiguration(
            SalesforceStandardKnowledgeArticleTypeConfiguration standardKnowledgeArticleTypeConfiguration) {
        this.standardKnowledgeArticleTypeConfiguration = standardKnowledgeArticleTypeConfiguration;
        return this;
    }

    /**
     * <p>
     * Provides configuration information for custom Salesforce knowledge
     * articles.
     * </p>
     *
     * @return <p>
     *         Provides configuration information for custom Salesforce
     *         knowledge articles.
     *         </p>
     */
    public java.util.List<SalesforceCustomKnowledgeArticleTypeConfiguration> getCustomKnowledgeArticleTypeConfigurations() {
        return customKnowledgeArticleTypeConfigurations;
    }

    /**
     * <p>
     * Provides configuration information for custom Salesforce knowledge
     * articles.
     * </p>
     *
     * @param customKnowledgeArticleTypeConfigurations <p>
     *            Provides configuration information for custom Salesforce
     *            knowledge articles.
     *            </p>
     */
    public void setCustomKnowledgeArticleTypeConfigurations(
            java.util.Collection<SalesforceCustomKnowledgeArticleTypeConfiguration> customKnowledgeArticleTypeConfigurations) {
        if (customKnowledgeArticleTypeConfigurations == null) {
            this.customKnowledgeArticleTypeConfigurations = null;
            return;
        }

        this.customKnowledgeArticleTypeConfigurations = new java.util.ArrayList<SalesforceCustomKnowledgeArticleTypeConfiguration>(
                customKnowledgeArticleTypeConfigurations);
    }

    /**
     * <p>
     * Provides configuration information for custom Salesforce knowledge
     * articles.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customKnowledgeArticleTypeConfigurations <p>
     *            Provides configuration information for custom Salesforce
     *            knowledge articles.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceKnowledgeArticleConfiguration withCustomKnowledgeArticleTypeConfigurations(
            SalesforceCustomKnowledgeArticleTypeConfiguration... customKnowledgeArticleTypeConfigurations) {
        if (getCustomKnowledgeArticleTypeConfigurations() == null) {
            this.customKnowledgeArticleTypeConfigurations = new java.util.ArrayList<SalesforceCustomKnowledgeArticleTypeConfiguration>(
                    customKnowledgeArticleTypeConfigurations.length);
        }
        for (SalesforceCustomKnowledgeArticleTypeConfiguration value : customKnowledgeArticleTypeConfigurations) {
            this.customKnowledgeArticleTypeConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Provides configuration information for custom Salesforce knowledge
     * articles.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customKnowledgeArticleTypeConfigurations <p>
     *            Provides configuration information for custom Salesforce
     *            knowledge articles.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceKnowledgeArticleConfiguration withCustomKnowledgeArticleTypeConfigurations(
            java.util.Collection<SalesforceCustomKnowledgeArticleTypeConfiguration> customKnowledgeArticleTypeConfigurations) {
        setCustomKnowledgeArticleTypeConfigurations(customKnowledgeArticleTypeConfigurations);
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
        if (getIncludedStates() != null)
            sb.append("IncludedStates: " + getIncludedStates() + ",");
        if (getStandardKnowledgeArticleTypeConfiguration() != null)
            sb.append("StandardKnowledgeArticleTypeConfiguration: "
                    + getStandardKnowledgeArticleTypeConfiguration() + ",");
        if (getCustomKnowledgeArticleTypeConfigurations() != null)
            sb.append("CustomKnowledgeArticleTypeConfigurations: "
                    + getCustomKnowledgeArticleTypeConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIncludedStates() == null) ? 0 : getIncludedStates().hashCode());
        hashCode = prime
                * hashCode
                + ((getStandardKnowledgeArticleTypeConfiguration() == null) ? 0
                        : getStandardKnowledgeArticleTypeConfiguration().hashCode());
        hashCode = prime
                * hashCode
                + ((getCustomKnowledgeArticleTypeConfigurations() == null) ? 0
                        : getCustomKnowledgeArticleTypeConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SalesforceKnowledgeArticleConfiguration == false)
            return false;
        SalesforceKnowledgeArticleConfiguration other = (SalesforceKnowledgeArticleConfiguration) obj;

        if (other.getIncludedStates() == null ^ this.getIncludedStates() == null)
            return false;
        if (other.getIncludedStates() != null
                && other.getIncludedStates().equals(this.getIncludedStates()) == false)
            return false;
        if (other.getStandardKnowledgeArticleTypeConfiguration() == null
                ^ this.getStandardKnowledgeArticleTypeConfiguration() == null)
            return false;
        if (other.getStandardKnowledgeArticleTypeConfiguration() != null
                && other.getStandardKnowledgeArticleTypeConfiguration().equals(
                        this.getStandardKnowledgeArticleTypeConfiguration()) == false)
            return false;
        if (other.getCustomKnowledgeArticleTypeConfigurations() == null
                ^ this.getCustomKnowledgeArticleTypeConfigurations() == null)
            return false;
        if (other.getCustomKnowledgeArticleTypeConfigurations() != null
                && other.getCustomKnowledgeArticleTypeConfigurations().equals(
                        this.getCustomKnowledgeArticleTypeConfigurations()) == false)
            return false;
        return true;
    }
}
