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
 * Defines configuration for syncing a Salesforce chatter feed. The contents of
 * the object comes from the Salesforce FeedItem table.
 * </p>
 */
public class SalesforceChatterFeedConfiguration implements Serializable {
    /**
     * <p>
     * The name of the column in the Salesforce FeedItem table that contains the
     * content to index. Typically this is the <code>Body</code> column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     */
    private String documentDataFieldName;

    /**
     * <p>
     * The name of the column in the Salesforce FeedItem table that contains the
     * title of the document. This is typically the <code>Title</code> collumn.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     */
    private String documentTitleFieldName;

    /**
     * <p>
     * Maps fields from a Salesforce chatter feed into Amazon Kendra index
     * fields.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> fieldMappings;

    /**
     * <p>
     * Filters the documents in the feed based on status of the user. When you
     * specify <code>ACTIVE_USERS</code> only documents from users who have an
     * active account are indexed. When you specify <code>STANDARD_USER</code>
     * only documents for Salesforce standard users are documented. You can
     * specify both.
     * </p>
     */
    private java.util.List<String> includeFilterTypes;

    /**
     * <p>
     * The name of the column in the Salesforce FeedItem table that contains the
     * content to index. Typically this is the <code>Body</code> column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     *
     * @return <p>
     *         The name of the column in the Salesforce FeedItem table that
     *         contains the content to index. Typically this is the
     *         <code>Body</code> column.
     *         </p>
     */
    public String getDocumentDataFieldName() {
        return documentDataFieldName;
    }

    /**
     * <p>
     * The name of the column in the Salesforce FeedItem table that contains the
     * content to index. Typically this is the <code>Body</code> column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     *
     * @param documentDataFieldName <p>
     *            The name of the column in the Salesforce FeedItem table that
     *            contains the content to index. Typically this is the
     *            <code>Body</code> column.
     *            </p>
     */
    public void setDocumentDataFieldName(String documentDataFieldName) {
        this.documentDataFieldName = documentDataFieldName;
    }

    /**
     * <p>
     * The name of the column in the Salesforce FeedItem table that contains the
     * content to index. Typically this is the <code>Body</code> column.
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
     *            The name of the column in the Salesforce FeedItem table that
     *            contains the content to index. Typically this is the
     *            <code>Body</code> column.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceChatterFeedConfiguration withDocumentDataFieldName(String documentDataFieldName) {
        this.documentDataFieldName = documentDataFieldName;
        return this;
    }

    /**
     * <p>
     * The name of the column in the Salesforce FeedItem table that contains the
     * title of the document. This is typically the <code>Title</code> collumn.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     *
     * @return <p>
     *         The name of the column in the Salesforce FeedItem table that
     *         contains the title of the document. This is typically the
     *         <code>Title</code> collumn.
     *         </p>
     */
    public String getDocumentTitleFieldName() {
        return documentTitleFieldName;
    }

    /**
     * <p>
     * The name of the column in the Salesforce FeedItem table that contains the
     * title of the document. This is typically the <code>Title</code> collumn.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     *
     * @param documentTitleFieldName <p>
     *            The name of the column in the Salesforce FeedItem table that
     *            contains the title of the document. This is typically the
     *            <code>Title</code> collumn.
     *            </p>
     */
    public void setDocumentTitleFieldName(String documentTitleFieldName) {
        this.documentTitleFieldName = documentTitleFieldName;
    }

    /**
     * <p>
     * The name of the column in the Salesforce FeedItem table that contains the
     * title of the document. This is typically the <code>Title</code> collumn.
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
     *            The name of the column in the Salesforce FeedItem table that
     *            contains the title of the document. This is typically the
     *            <code>Title</code> collumn.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceChatterFeedConfiguration withDocumentTitleFieldName(
            String documentTitleFieldName) {
        this.documentTitleFieldName = documentTitleFieldName;
        return this;
    }

    /**
     * <p>
     * Maps fields from a Salesforce chatter feed into Amazon Kendra index
     * fields.
     * </p>
     *
     * @return <p>
     *         Maps fields from a Salesforce chatter feed into Amazon Kendra
     *         index fields.
     *         </p>
     */
    public java.util.List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return fieldMappings;
    }

    /**
     * <p>
     * Maps fields from a Salesforce chatter feed into Amazon Kendra index
     * fields.
     * </p>
     *
     * @param fieldMappings <p>
     *            Maps fields from a Salesforce chatter feed into Amazon Kendra
     *            index fields.
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
     * Maps fields from a Salesforce chatter feed into Amazon Kendra index
     * fields.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fieldMappings <p>
     *            Maps fields from a Salesforce chatter feed into Amazon Kendra
     *            index fields.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceChatterFeedConfiguration withFieldMappings(
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
     * Maps fields from a Salesforce chatter feed into Amazon Kendra index
     * fields.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fieldMappings <p>
     *            Maps fields from a Salesforce chatter feed into Amazon Kendra
     *            index fields.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceChatterFeedConfiguration withFieldMappings(
            java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        setFieldMappings(fieldMappings);
        return this;
    }

    /**
     * <p>
     * Filters the documents in the feed based on status of the user. When you
     * specify <code>ACTIVE_USERS</code> only documents from users who have an
     * active account are indexed. When you specify <code>STANDARD_USER</code>
     * only documents for Salesforce standard users are documented. You can
     * specify both.
     * </p>
     *
     * @return <p>
     *         Filters the documents in the feed based on status of the user.
     *         When you specify <code>ACTIVE_USERS</code> only documents from
     *         users who have an active account are indexed. When you specify
     *         <code>STANDARD_USER</code> only documents for Salesforce standard
     *         users are documented. You can specify both.
     *         </p>
     */
    public java.util.List<String> getIncludeFilterTypes() {
        return includeFilterTypes;
    }

    /**
     * <p>
     * Filters the documents in the feed based on status of the user. When you
     * specify <code>ACTIVE_USERS</code> only documents from users who have an
     * active account are indexed. When you specify <code>STANDARD_USER</code>
     * only documents for Salesforce standard users are documented. You can
     * specify both.
     * </p>
     *
     * @param includeFilterTypes <p>
     *            Filters the documents in the feed based on status of the user.
     *            When you specify <code>ACTIVE_USERS</code> only documents from
     *            users who have an active account are indexed. When you specify
     *            <code>STANDARD_USER</code> only documents for Salesforce
     *            standard users are documented. You can specify both.
     *            </p>
     */
    public void setIncludeFilterTypes(java.util.Collection<String> includeFilterTypes) {
        if (includeFilterTypes == null) {
            this.includeFilterTypes = null;
            return;
        }

        this.includeFilterTypes = new java.util.ArrayList<String>(includeFilterTypes);
    }

    /**
     * <p>
     * Filters the documents in the feed based on status of the user. When you
     * specify <code>ACTIVE_USERS</code> only documents from users who have an
     * active account are indexed. When you specify <code>STANDARD_USER</code>
     * only documents for Salesforce standard users are documented. You can
     * specify both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeFilterTypes <p>
     *            Filters the documents in the feed based on status of the user.
     *            When you specify <code>ACTIVE_USERS</code> only documents from
     *            users who have an active account are indexed. When you specify
     *            <code>STANDARD_USER</code> only documents for Salesforce
     *            standard users are documented. You can specify both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceChatterFeedConfiguration withIncludeFilterTypes(String... includeFilterTypes) {
        if (getIncludeFilterTypes() == null) {
            this.includeFilterTypes = new java.util.ArrayList<String>(includeFilterTypes.length);
        }
        for (String value : includeFilterTypes) {
            this.includeFilterTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Filters the documents in the feed based on status of the user. When you
     * specify <code>ACTIVE_USERS</code> only documents from users who have an
     * active account are indexed. When you specify <code>STANDARD_USER</code>
     * only documents for Salesforce standard users are documented. You can
     * specify both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeFilterTypes <p>
     *            Filters the documents in the feed based on status of the user.
     *            When you specify <code>ACTIVE_USERS</code> only documents from
     *            users who have an active account are indexed. When you specify
     *            <code>STANDARD_USER</code> only documents for Salesforce
     *            standard users are documented. You can specify both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceChatterFeedConfiguration withIncludeFilterTypes(
            java.util.Collection<String> includeFilterTypes) {
        setIncludeFilterTypes(includeFilterTypes);
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
        if (getDocumentDataFieldName() != null)
            sb.append("DocumentDataFieldName: " + getDocumentDataFieldName() + ",");
        if (getDocumentTitleFieldName() != null)
            sb.append("DocumentTitleFieldName: " + getDocumentTitleFieldName() + ",");
        if (getFieldMappings() != null)
            sb.append("FieldMappings: " + getFieldMappings() + ",");
        if (getIncludeFilterTypes() != null)
            sb.append("IncludeFilterTypes: " + getIncludeFilterTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDocumentDataFieldName() == null) ? 0 : getDocumentDataFieldName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDocumentTitleFieldName() == null) ? 0 : getDocumentTitleFieldName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getFieldMappings() == null) ? 0 : getFieldMappings().hashCode());
        hashCode = prime * hashCode
                + ((getIncludeFilterTypes() == null) ? 0 : getIncludeFilterTypes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SalesforceChatterFeedConfiguration == false)
            return false;
        SalesforceChatterFeedConfiguration other = (SalesforceChatterFeedConfiguration) obj;

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
        if (other.getIncludeFilterTypes() == null ^ this.getIncludeFilterTypes() == null)
            return false;
        if (other.getIncludeFilterTypes() != null
                && other.getIncludeFilterTypes().equals(this.getIncludeFilterTypes()) == false)
            return false;
        return true;
    }
}
