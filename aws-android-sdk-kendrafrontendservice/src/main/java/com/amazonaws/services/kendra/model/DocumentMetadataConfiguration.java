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
 * Specifies the properties of a custom index field.
 * </p>
 */
public class DocumentMetadataConfiguration implements Serializable {
    /**
     * <p>
     * The name of the index field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 30<br/>
     */
    private String name;

    /**
     * <p>
     * The data type of the index field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING_VALUE, STRING_LIST_VALUE, LONG_VALUE,
     * DATE_VALUE
     */
    private String type;

    /**
     * <p>
     * Provides manual tuning parameters to determine how the field affects the
     * search results.
     * </p>
     */
    private Relevance relevance;

    /**
     * <p>
     * Provides information about how the field is used during a search.
     * </p>
     */
    private Search search;

    /**
     * <p>
     * The name of the index field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 30<br/>
     *
     * @return <p>
     *         The name of the index field.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the index field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 30<br/>
     *
     * @param name <p>
     *            The name of the index field.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the index field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 30<br/>
     *
     * @param name <p>
     *            The name of the index field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentMetadataConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The data type of the index field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING_VALUE, STRING_LIST_VALUE, LONG_VALUE,
     * DATE_VALUE
     *
     * @return <p>
     *         The data type of the index field.
     *         </p>
     * @see DocumentAttributeValueType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The data type of the index field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING_VALUE, STRING_LIST_VALUE, LONG_VALUE,
     * DATE_VALUE
     *
     * @param type <p>
     *            The data type of the index field.
     *            </p>
     * @see DocumentAttributeValueType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The data type of the index field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING_VALUE, STRING_LIST_VALUE, LONG_VALUE,
     * DATE_VALUE
     *
     * @param type <p>
     *            The data type of the index field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentAttributeValueType
     */
    public DocumentMetadataConfiguration withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The data type of the index field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING_VALUE, STRING_LIST_VALUE, LONG_VALUE,
     * DATE_VALUE
     *
     * @param type <p>
     *            The data type of the index field.
     *            </p>
     * @see DocumentAttributeValueType
     */
    public void setType(DocumentAttributeValueType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The data type of the index field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING_VALUE, STRING_LIST_VALUE, LONG_VALUE,
     * DATE_VALUE
     *
     * @param type <p>
     *            The data type of the index field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentAttributeValueType
     */
    public DocumentMetadataConfiguration withType(DocumentAttributeValueType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Provides manual tuning parameters to determine how the field affects the
     * search results.
     * </p>
     *
     * @return <p>
     *         Provides manual tuning parameters to determine how the field
     *         affects the search results.
     *         </p>
     */
    public Relevance getRelevance() {
        return relevance;
    }

    /**
     * <p>
     * Provides manual tuning parameters to determine how the field affects the
     * search results.
     * </p>
     *
     * @param relevance <p>
     *            Provides manual tuning parameters to determine how the field
     *            affects the search results.
     *            </p>
     */
    public void setRelevance(Relevance relevance) {
        this.relevance = relevance;
    }

    /**
     * <p>
     * Provides manual tuning parameters to determine how the field affects the
     * search results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relevance <p>
     *            Provides manual tuning parameters to determine how the field
     *            affects the search results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentMetadataConfiguration withRelevance(Relevance relevance) {
        this.relevance = relevance;
        return this;
    }

    /**
     * <p>
     * Provides information about how the field is used during a search.
     * </p>
     *
     * @return <p>
     *         Provides information about how the field is used during a search.
     *         </p>
     */
    public Search getSearch() {
        return search;
    }

    /**
     * <p>
     * Provides information about how the field is used during a search.
     * </p>
     *
     * @param search <p>
     *            Provides information about how the field is used during a
     *            search.
     *            </p>
     */
    public void setSearch(Search search) {
        this.search = search;
    }

    /**
     * <p>
     * Provides information about how the field is used during a search.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param search <p>
     *            Provides information about how the field is used during a
     *            search.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentMetadataConfiguration withSearch(Search search) {
        this.search = search;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getRelevance() != null)
            sb.append("Relevance: " + getRelevance() + ",");
        if (getSearch() != null)
            sb.append("Search: " + getSearch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getRelevance() == null) ? 0 : getRelevance().hashCode());
        hashCode = prime * hashCode + ((getSearch() == null) ? 0 : getSearch().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentMetadataConfiguration == false)
            return false;
        DocumentMetadataConfiguration other = (DocumentMetadataConfiguration) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getRelevance() == null ^ this.getRelevance() == null)
            return false;
        if (other.getRelevance() != null
                && other.getRelevance().equals(this.getRelevance()) == false)
            return false;
        if (other.getSearch() == null ^ this.getSearch() == null)
            return false;
        if (other.getSearch() != null && other.getSearch().equals(this.getSearch()) == false)
            return false;
        return true;
    }
}
