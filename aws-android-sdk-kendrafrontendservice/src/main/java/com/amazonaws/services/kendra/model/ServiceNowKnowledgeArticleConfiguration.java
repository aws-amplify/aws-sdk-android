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
 * Provides configuration information for crawling knowledge articles in the
 * ServiceNow site.
 * </p>
 */
public class ServiceNowKnowledgeArticleConfiguration implements Serializable {
    /**
     * <p>
     * Indicates whether Amazon Kendra should index attachments to knowledge
     * articles.
     * </p>
     */
    private Boolean crawlAttachments;

    /**
     * <p>
     * List of regular expressions applied to knowledge articles. Items that
     * don't match the inclusion pattern are not indexed. The regex is applied
     * to the field specified in the <code>PatternTargetField</code>.
     * </p>
     */
    private java.util.List<String> includeAttachmentFilePatterns;

    /**
     * <p>
     * List of regular expressions applied to knowledge articles. Items that
     * don't match the inclusion pattern are not indexed. The regex is applied
     * to the field specified in the <code>PatternTargetField</code>
     * </p>
     */
    private java.util.List<String> excludeAttachmentFilePatterns;

    /**
     * <p>
     * The name of the ServiceNow field that is mapped to the index document
     * contents field in the Amazon Kendra index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     */
    private String documentDataFieldName;

    /**
     * <p>
     * The name of the ServiceNow field that is mapped to the index document
     * title field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     */
    private String documentTitleFieldName;

    /**
     * <p>
     * Mapping between ServiceNow fields and Amazon Kendra index fields. You
     * must create the index field before you map the field.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> fieldMappings;

    /**
     * <p>
     * Indicates whether Amazon Kendra should index attachments to knowledge
     * articles.
     * </p>
     *
     * @return <p>
     *         Indicates whether Amazon Kendra should index attachments to
     *         knowledge articles.
     *         </p>
     */
    public Boolean isCrawlAttachments() {
        return crawlAttachments;
    }

    /**
     * <p>
     * Indicates whether Amazon Kendra should index attachments to knowledge
     * articles.
     * </p>
     *
     * @return <p>
     *         Indicates whether Amazon Kendra should index attachments to
     *         knowledge articles.
     *         </p>
     */
    public Boolean getCrawlAttachments() {
        return crawlAttachments;
    }

    /**
     * <p>
     * Indicates whether Amazon Kendra should index attachments to knowledge
     * articles.
     * </p>
     *
     * @param crawlAttachments <p>
     *            Indicates whether Amazon Kendra should index attachments to
     *            knowledge articles.
     *            </p>
     */
    public void setCrawlAttachments(Boolean crawlAttachments) {
        this.crawlAttachments = crawlAttachments;
    }

    /**
     * <p>
     * Indicates whether Amazon Kendra should index attachments to knowledge
     * articles.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crawlAttachments <p>
     *            Indicates whether Amazon Kendra should index attachments to
     *            knowledge articles.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceNowKnowledgeArticleConfiguration withCrawlAttachments(Boolean crawlAttachments) {
        this.crawlAttachments = crawlAttachments;
        return this;
    }

    /**
     * <p>
     * List of regular expressions applied to knowledge articles. Items that
     * don't match the inclusion pattern are not indexed. The regex is applied
     * to the field specified in the <code>PatternTargetField</code>.
     * </p>
     *
     * @return <p>
     *         List of regular expressions applied to knowledge articles. Items
     *         that don't match the inclusion pattern are not indexed. The regex
     *         is applied to the field specified in the
     *         <code>PatternTargetField</code>.
     *         </p>
     */
    public java.util.List<String> getIncludeAttachmentFilePatterns() {
        return includeAttachmentFilePatterns;
    }

    /**
     * <p>
     * List of regular expressions applied to knowledge articles. Items that
     * don't match the inclusion pattern are not indexed. The regex is applied
     * to the field specified in the <code>PatternTargetField</code>.
     * </p>
     *
     * @param includeAttachmentFilePatterns <p>
     *            List of regular expressions applied to knowledge articles.
     *            Items that don't match the inclusion pattern are not indexed.
     *            The regex is applied to the field specified in the
     *            <code>PatternTargetField</code>.
     *            </p>
     */
    public void setIncludeAttachmentFilePatterns(
            java.util.Collection<String> includeAttachmentFilePatterns) {
        if (includeAttachmentFilePatterns == null) {
            this.includeAttachmentFilePatterns = null;
            return;
        }

        this.includeAttachmentFilePatterns = new java.util.ArrayList<String>(
                includeAttachmentFilePatterns);
    }

    /**
     * <p>
     * List of regular expressions applied to knowledge articles. Items that
     * don't match the inclusion pattern are not indexed. The regex is applied
     * to the field specified in the <code>PatternTargetField</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeAttachmentFilePatterns <p>
     *            List of regular expressions applied to knowledge articles.
     *            Items that don't match the inclusion pattern are not indexed.
     *            The regex is applied to the field specified in the
     *            <code>PatternTargetField</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceNowKnowledgeArticleConfiguration withIncludeAttachmentFilePatterns(
            String... includeAttachmentFilePatterns) {
        if (getIncludeAttachmentFilePatterns() == null) {
            this.includeAttachmentFilePatterns = new java.util.ArrayList<String>(
                    includeAttachmentFilePatterns.length);
        }
        for (String value : includeAttachmentFilePatterns) {
            this.includeAttachmentFilePatterns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of regular expressions applied to knowledge articles. Items that
     * don't match the inclusion pattern are not indexed. The regex is applied
     * to the field specified in the <code>PatternTargetField</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeAttachmentFilePatterns <p>
     *            List of regular expressions applied to knowledge articles.
     *            Items that don't match the inclusion pattern are not indexed.
     *            The regex is applied to the field specified in the
     *            <code>PatternTargetField</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceNowKnowledgeArticleConfiguration withIncludeAttachmentFilePatterns(
            java.util.Collection<String> includeAttachmentFilePatterns) {
        setIncludeAttachmentFilePatterns(includeAttachmentFilePatterns);
        return this;
    }

    /**
     * <p>
     * List of regular expressions applied to knowledge articles. Items that
     * don't match the inclusion pattern are not indexed. The regex is applied
     * to the field specified in the <code>PatternTargetField</code>
     * </p>
     *
     * @return <p>
     *         List of regular expressions applied to knowledge articles. Items
     *         that don't match the inclusion pattern are not indexed. The regex
     *         is applied to the field specified in the
     *         <code>PatternTargetField</code>
     *         </p>
     */
    public java.util.List<String> getExcludeAttachmentFilePatterns() {
        return excludeAttachmentFilePatterns;
    }

    /**
     * <p>
     * List of regular expressions applied to knowledge articles. Items that
     * don't match the inclusion pattern are not indexed. The regex is applied
     * to the field specified in the <code>PatternTargetField</code>
     * </p>
     *
     * @param excludeAttachmentFilePatterns <p>
     *            List of regular expressions applied to knowledge articles.
     *            Items that don't match the inclusion pattern are not indexed.
     *            The regex is applied to the field specified in the
     *            <code>PatternTargetField</code>
     *            </p>
     */
    public void setExcludeAttachmentFilePatterns(
            java.util.Collection<String> excludeAttachmentFilePatterns) {
        if (excludeAttachmentFilePatterns == null) {
            this.excludeAttachmentFilePatterns = null;
            return;
        }

        this.excludeAttachmentFilePatterns = new java.util.ArrayList<String>(
                excludeAttachmentFilePatterns);
    }

    /**
     * <p>
     * List of regular expressions applied to knowledge articles. Items that
     * don't match the inclusion pattern are not indexed. The regex is applied
     * to the field specified in the <code>PatternTargetField</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param excludeAttachmentFilePatterns <p>
     *            List of regular expressions applied to knowledge articles.
     *            Items that don't match the inclusion pattern are not indexed.
     *            The regex is applied to the field specified in the
     *            <code>PatternTargetField</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceNowKnowledgeArticleConfiguration withExcludeAttachmentFilePatterns(
            String... excludeAttachmentFilePatterns) {
        if (getExcludeAttachmentFilePatterns() == null) {
            this.excludeAttachmentFilePatterns = new java.util.ArrayList<String>(
                    excludeAttachmentFilePatterns.length);
        }
        for (String value : excludeAttachmentFilePatterns) {
            this.excludeAttachmentFilePatterns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of regular expressions applied to knowledge articles. Items that
     * don't match the inclusion pattern are not indexed. The regex is applied
     * to the field specified in the <code>PatternTargetField</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param excludeAttachmentFilePatterns <p>
     *            List of regular expressions applied to knowledge articles.
     *            Items that don't match the inclusion pattern are not indexed.
     *            The regex is applied to the field specified in the
     *            <code>PatternTargetField</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceNowKnowledgeArticleConfiguration withExcludeAttachmentFilePatterns(
            java.util.Collection<String> excludeAttachmentFilePatterns) {
        setExcludeAttachmentFilePatterns(excludeAttachmentFilePatterns);
        return this;
    }

    /**
     * <p>
     * The name of the ServiceNow field that is mapped to the index document
     * contents field in the Amazon Kendra index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     *
     * @return <p>
     *         The name of the ServiceNow field that is mapped to the index
     *         document contents field in the Amazon Kendra index.
     *         </p>
     */
    public String getDocumentDataFieldName() {
        return documentDataFieldName;
    }

    /**
     * <p>
     * The name of the ServiceNow field that is mapped to the index document
     * contents field in the Amazon Kendra index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     *
     * @param documentDataFieldName <p>
     *            The name of the ServiceNow field that is mapped to the index
     *            document contents field in the Amazon Kendra index.
     *            </p>
     */
    public void setDocumentDataFieldName(String documentDataFieldName) {
        this.documentDataFieldName = documentDataFieldName;
    }

    /**
     * <p>
     * The name of the ServiceNow field that is mapped to the index document
     * contents field in the Amazon Kendra index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     *
     * @param documentDataFieldName <p>
     *            The name of the ServiceNow field that is mapped to the index
     *            document contents field in the Amazon Kendra index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceNowKnowledgeArticleConfiguration withDocumentDataFieldName(
            String documentDataFieldName) {
        this.documentDataFieldName = documentDataFieldName;
        return this;
    }

    /**
     * <p>
     * The name of the ServiceNow field that is mapped to the index document
     * title field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     *
     * @return <p>
     *         The name of the ServiceNow field that is mapped to the index
     *         document title field.
     *         </p>
     */
    public String getDocumentTitleFieldName() {
        return documentTitleFieldName;
    }

    /**
     * <p>
     * The name of the ServiceNow field that is mapped to the index document
     * title field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     *
     * @param documentTitleFieldName <p>
     *            The name of the ServiceNow field that is mapped to the index
     *            document title field.
     *            </p>
     */
    public void setDocumentTitleFieldName(String documentTitleFieldName) {
        this.documentTitleFieldName = documentTitleFieldName;
    }

    /**
     * <p>
     * The name of the ServiceNow field that is mapped to the index document
     * title field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     *
     * @param documentTitleFieldName <p>
     *            The name of the ServiceNow field that is mapped to the index
     *            document title field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceNowKnowledgeArticleConfiguration withDocumentTitleFieldName(
            String documentTitleFieldName) {
        this.documentTitleFieldName = documentTitleFieldName;
        return this;
    }

    /**
     * <p>
     * Mapping between ServiceNow fields and Amazon Kendra index fields. You
     * must create the index field before you map the field.
     * </p>
     *
     * @return <p>
     *         Mapping between ServiceNow fields and Amazon Kendra index fields.
     *         You must create the index field before you map the field.
     *         </p>
     */
    public java.util.List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return fieldMappings;
    }

    /**
     * <p>
     * Mapping between ServiceNow fields and Amazon Kendra index fields. You
     * must create the index field before you map the field.
     * </p>
     *
     * @param fieldMappings <p>
     *            Mapping between ServiceNow fields and Amazon Kendra index
     *            fields. You must create the index field before you map the
     *            field.
     *            </p>
     */
    public void setFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        if (fieldMappings == null) {
            this.fieldMappings = null;
            return;
        }

        this.fieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(fieldMappings);
    }

    /**
     * <p>
     * Mapping between ServiceNow fields and Amazon Kendra index fields. You
     * must create the index field before you map the field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fieldMappings <p>
     *            Mapping between ServiceNow fields and Amazon Kendra index
     *            fields. You must create the index field before you map the
     *            field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceNowKnowledgeArticleConfiguration withFieldMappings(
            DataSourceToIndexFieldMapping... fieldMappings) {
        if (getFieldMappings() == null) {
            this.fieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(
                    fieldMappings.length);
        }
        for (DataSourceToIndexFieldMapping value : fieldMappings) {
            this.fieldMappings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Mapping between ServiceNow fields and Amazon Kendra index fields. You
     * must create the index field before you map the field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fieldMappings <p>
     *            Mapping between ServiceNow fields and Amazon Kendra index
     *            fields. You must create the index field before you map the
     *            field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceNowKnowledgeArticleConfiguration withFieldMappings(
            java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        setFieldMappings(fieldMappings);
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
        if (getCrawlAttachments() != null)
            sb.append("CrawlAttachments: " + getCrawlAttachments() + ",");
        if (getIncludeAttachmentFilePatterns() != null)
            sb.append("IncludeAttachmentFilePatterns: " + getIncludeAttachmentFilePatterns() + ",");
        if (getExcludeAttachmentFilePatterns() != null)
            sb.append("ExcludeAttachmentFilePatterns: " + getExcludeAttachmentFilePatterns() + ",");
        if (getDocumentDataFieldName() != null)
            sb.append("DocumentDataFieldName: " + getDocumentDataFieldName() + ",");
        if (getDocumentTitleFieldName() != null)
            sb.append("DocumentTitleFieldName: " + getDocumentTitleFieldName() + ",");
        if (getFieldMappings() != null)
            sb.append("FieldMappings: " + getFieldMappings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCrawlAttachments() == null) ? 0 : getCrawlAttachments().hashCode());
        hashCode = prime
                * hashCode
                + ((getIncludeAttachmentFilePatterns() == null) ? 0
                        : getIncludeAttachmentFilePatterns().hashCode());
        hashCode = prime
                * hashCode
                + ((getExcludeAttachmentFilePatterns() == null) ? 0
                        : getExcludeAttachmentFilePatterns().hashCode());
        hashCode = prime
                * hashCode
                + ((getDocumentDataFieldName() == null) ? 0 : getDocumentDataFieldName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDocumentTitleFieldName() == null) ? 0 : getDocumentTitleFieldName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getFieldMappings() == null) ? 0 : getFieldMappings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceNowKnowledgeArticleConfiguration == false)
            return false;
        ServiceNowKnowledgeArticleConfiguration other = (ServiceNowKnowledgeArticleConfiguration) obj;

        if (other.getCrawlAttachments() == null ^ this.getCrawlAttachments() == null)
            return false;
        if (other.getCrawlAttachments() != null
                && other.getCrawlAttachments().equals(this.getCrawlAttachments()) == false)
            return false;
        if (other.getIncludeAttachmentFilePatterns() == null
                ^ this.getIncludeAttachmentFilePatterns() == null)
            return false;
        if (other.getIncludeAttachmentFilePatterns() != null
                && other.getIncludeAttachmentFilePatterns().equals(
                        this.getIncludeAttachmentFilePatterns()) == false)
            return false;
        if (other.getExcludeAttachmentFilePatterns() == null
                ^ this.getExcludeAttachmentFilePatterns() == null)
            return false;
        if (other.getExcludeAttachmentFilePatterns() != null
                && other.getExcludeAttachmentFilePatterns().equals(
                        this.getExcludeAttachmentFilePatterns()) == false)
            return false;
        if (other.getDocumentDataFieldName() == null ^ this.getDocumentDataFieldName() == null)
            return false;
        if (other.getDocumentDataFieldName() != null
                && other.getDocumentDataFieldName().equals(this.getDocumentDataFieldName()) == false)
            return false;
        if (other.getDocumentTitleFieldName() == null ^ this.getDocumentTitleFieldName() == null)
            return false;
        if (other.getDocumentTitleFieldName() != null
                && other.getDocumentTitleFieldName().equals(this.getDocumentTitleFieldName()) == false)
            return false;
        if (other.getFieldMappings() == null ^ this.getFieldMappings() == null)
            return false;
        if (other.getFieldMappings() != null
                && other.getFieldMappings().equals(this.getFieldMappings()) == false)
            return false;
        return true;
    }
}
