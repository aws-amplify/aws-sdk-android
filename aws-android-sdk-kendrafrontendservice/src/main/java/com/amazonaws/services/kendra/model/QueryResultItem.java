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
 * A single query result.
 * </p>
 * <p>
 * A query result contains information about a document returned by the query.
 * This includes the original location of the document, a list of attributes
 * assigned to the document, and relevant text from the document that satisfies
 * the query.
 * </p>
 */
public class QueryResultItem implements Serializable {
    /**
     * <p>
     * The unique identifier for the query result.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 73<br/>
     */
    private String id;

    /**
     * <p>
     * The type of document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT, QUESTION_ANSWER, ANSWER
     */
    private String type;

    /**
     * <p>
     * One or more additional attribues associated with the query result.
     * </p>
     */
    private java.util.List<AdditionalResultAttribute> additionalAttributes;

    /**
     * <p>
     * The unique identifier for the document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String documentId;

    /**
     * <p>
     * The title of the document. Contains the text of the title and information
     * for highlighting the relevant terms in the title.
     * </p>
     */
    private TextWithHighlights documentTitle;

    /**
     * <p>
     * An extract of the text in the document. Contains information about
     * highlighting the relevant terms in the excerpt.
     * </p>
     */
    private TextWithHighlights documentExcerpt;

    /**
     * <p>
     * The URI of the original location of the document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^(https?|ftp|file):\/\/([^\s]*)<br/>
     */
    private String documentURI;

    /**
     * <p>
     * An array of document attributes for the document that the query result
     * maps to. For example, the document author (Author) or the source URI
     * (SourceUri) of the document.
     * </p>
     */
    private java.util.List<DocumentAttribute> documentAttributes;

    /**
     * <p>
     * The unique identifier for the query result.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 73<br/>
     *
     * @return <p>
     *         The unique identifier for the query result.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier for the query result.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 73<br/>
     *
     * @param id <p>
     *            The unique identifier for the query result.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the query result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 73<br/>
     *
     * @param id <p>
     *            The unique identifier for the query result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryResultItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The type of document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT, QUESTION_ANSWER, ANSWER
     *
     * @return <p>
     *         The type of document.
     *         </p>
     * @see QueryResultType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT, QUESTION_ANSWER, ANSWER
     *
     * @param type <p>
     *            The type of document.
     *            </p>
     * @see QueryResultType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT, QUESTION_ANSWER, ANSWER
     *
     * @param type <p>
     *            The type of document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QueryResultType
     */
    public QueryResultItem withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT, QUESTION_ANSWER, ANSWER
     *
     * @param type <p>
     *            The type of document.
     *            </p>
     * @see QueryResultType
     */
    public void setType(QueryResultType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT, QUESTION_ANSWER, ANSWER
     *
     * @param type <p>
     *            The type of document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QueryResultType
     */
    public QueryResultItem withType(QueryResultType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * One or more additional attribues associated with the query result.
     * </p>
     *
     * @return <p>
     *         One or more additional attribues associated with the query
     *         result.
     *         </p>
     */
    public java.util.List<AdditionalResultAttribute> getAdditionalAttributes() {
        return additionalAttributes;
    }

    /**
     * <p>
     * One or more additional attribues associated with the query result.
     * </p>
     *
     * @param additionalAttributes <p>
     *            One or more additional attribues associated with the query
     *            result.
     *            </p>
     */
    public void setAdditionalAttributes(
            java.util.Collection<AdditionalResultAttribute> additionalAttributes) {
        if (additionalAttributes == null) {
            this.additionalAttributes = null;
            return;
        }

        this.additionalAttributes = new java.util.ArrayList<AdditionalResultAttribute>(
                additionalAttributes);
    }

    /**
     * <p>
     * One or more additional attribues associated with the query result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalAttributes <p>
     *            One or more additional attribues associated with the query
     *            result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryResultItem withAdditionalAttributes(
            AdditionalResultAttribute... additionalAttributes) {
        if (getAdditionalAttributes() == null) {
            this.additionalAttributes = new java.util.ArrayList<AdditionalResultAttribute>(
                    additionalAttributes.length);
        }
        for (AdditionalResultAttribute value : additionalAttributes) {
            this.additionalAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more additional attribues associated with the query result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalAttributes <p>
     *            One or more additional attribues associated with the query
     *            result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryResultItem withAdditionalAttributes(
            java.util.Collection<AdditionalResultAttribute> additionalAttributes) {
        setAdditionalAttributes(additionalAttributes);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The unique identifier for the document.
     *         </p>
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * <p>
     * The unique identifier for the document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param documentId <p>
     *            The unique identifier for the document.
     *            </p>
     */
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    /**
     * <p>
     * The unique identifier for the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param documentId <p>
     *            The unique identifier for the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryResultItem withDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }

    /**
     * <p>
     * The title of the document. Contains the text of the title and information
     * for highlighting the relevant terms in the title.
     * </p>
     *
     * @return <p>
     *         The title of the document. Contains the text of the title and
     *         information for highlighting the relevant terms in the title.
     *         </p>
     */
    public TextWithHighlights getDocumentTitle() {
        return documentTitle;
    }

    /**
     * <p>
     * The title of the document. Contains the text of the title and information
     * for highlighting the relevant terms in the title.
     * </p>
     *
     * @param documentTitle <p>
     *            The title of the document. Contains the text of the title and
     *            information for highlighting the relevant terms in the title.
     *            </p>
     */
    public void setDocumentTitle(TextWithHighlights documentTitle) {
        this.documentTitle = documentTitle;
    }

    /**
     * <p>
     * The title of the document. Contains the text of the title and information
     * for highlighting the relevant terms in the title.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentTitle <p>
     *            The title of the document. Contains the text of the title and
     *            information for highlighting the relevant terms in the title.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryResultItem withDocumentTitle(TextWithHighlights documentTitle) {
        this.documentTitle = documentTitle;
        return this;
    }

    /**
     * <p>
     * An extract of the text in the document. Contains information about
     * highlighting the relevant terms in the excerpt.
     * </p>
     *
     * @return <p>
     *         An extract of the text in the document. Contains information
     *         about highlighting the relevant terms in the excerpt.
     *         </p>
     */
    public TextWithHighlights getDocumentExcerpt() {
        return documentExcerpt;
    }

    /**
     * <p>
     * An extract of the text in the document. Contains information about
     * highlighting the relevant terms in the excerpt.
     * </p>
     *
     * @param documentExcerpt <p>
     *            An extract of the text in the document. Contains information
     *            about highlighting the relevant terms in the excerpt.
     *            </p>
     */
    public void setDocumentExcerpt(TextWithHighlights documentExcerpt) {
        this.documentExcerpt = documentExcerpt;
    }

    /**
     * <p>
     * An extract of the text in the document. Contains information about
     * highlighting the relevant terms in the excerpt.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentExcerpt <p>
     *            An extract of the text in the document. Contains information
     *            about highlighting the relevant terms in the excerpt.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryResultItem withDocumentExcerpt(TextWithHighlights documentExcerpt) {
        this.documentExcerpt = documentExcerpt;
        return this;
    }

    /**
     * <p>
     * The URI of the original location of the document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^(https?|ftp|file):\/\/([^\s]*)<br/>
     *
     * @return <p>
     *         The URI of the original location of the document.
     *         </p>
     */
    public String getDocumentURI() {
        return documentURI;
    }

    /**
     * <p>
     * The URI of the original location of the document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^(https?|ftp|file):\/\/([^\s]*)<br/>
     *
     * @param documentURI <p>
     *            The URI of the original location of the document.
     *            </p>
     */
    public void setDocumentURI(String documentURI) {
        this.documentURI = documentURI;
    }

    /**
     * <p>
     * The URI of the original location of the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^(https?|ftp|file):\/\/([^\s]*)<br/>
     *
     * @param documentURI <p>
     *            The URI of the original location of the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryResultItem withDocumentURI(String documentURI) {
        this.documentURI = documentURI;
        return this;
    }

    /**
     * <p>
     * An array of document attributes for the document that the query result
     * maps to. For example, the document author (Author) or the source URI
     * (SourceUri) of the document.
     * </p>
     *
     * @return <p>
     *         An array of document attributes for the document that the query
     *         result maps to. For example, the document author (Author) or the
     *         source URI (SourceUri) of the document.
     *         </p>
     */
    public java.util.List<DocumentAttribute> getDocumentAttributes() {
        return documentAttributes;
    }

    /**
     * <p>
     * An array of document attributes for the document that the query result
     * maps to. For example, the document author (Author) or the source URI
     * (SourceUri) of the document.
     * </p>
     *
     * @param documentAttributes <p>
     *            An array of document attributes for the document that the
     *            query result maps to. For example, the document author
     *            (Author) or the source URI (SourceUri) of the document.
     *            </p>
     */
    public void setDocumentAttributes(java.util.Collection<DocumentAttribute> documentAttributes) {
        if (documentAttributes == null) {
            this.documentAttributes = null;
            return;
        }

        this.documentAttributes = new java.util.ArrayList<DocumentAttribute>(documentAttributes);
    }

    /**
     * <p>
     * An array of document attributes for the document that the query result
     * maps to. For example, the document author (Author) or the source URI
     * (SourceUri) of the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentAttributes <p>
     *            An array of document attributes for the document that the
     *            query result maps to. For example, the document author
     *            (Author) or the source URI (SourceUri) of the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryResultItem withDocumentAttributes(DocumentAttribute... documentAttributes) {
        if (getDocumentAttributes() == null) {
            this.documentAttributes = new java.util.ArrayList<DocumentAttribute>(
                    documentAttributes.length);
        }
        for (DocumentAttribute value : documentAttributes) {
            this.documentAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of document attributes for the document that the query result
     * maps to. For example, the document author (Author) or the source URI
     * (SourceUri) of the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentAttributes <p>
     *            An array of document attributes for the document that the
     *            query result maps to. For example, the document author
     *            (Author) or the source URI (SourceUri) of the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryResultItem withDocumentAttributes(
            java.util.Collection<DocumentAttribute> documentAttributes) {
        setDocumentAttributes(documentAttributes);
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getAdditionalAttributes() != null)
            sb.append("AdditionalAttributes: " + getAdditionalAttributes() + ",");
        if (getDocumentId() != null)
            sb.append("DocumentId: " + getDocumentId() + ",");
        if (getDocumentTitle() != null)
            sb.append("DocumentTitle: " + getDocumentTitle() + ",");
        if (getDocumentExcerpt() != null)
            sb.append("DocumentExcerpt: " + getDocumentExcerpt() + ",");
        if (getDocumentURI() != null)
            sb.append("DocumentURI: " + getDocumentURI() + ",");
        if (getDocumentAttributes() != null)
            sb.append("DocumentAttributes: " + getDocumentAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getAdditionalAttributes() == null) ? 0 : getAdditionalAttributes().hashCode());
        hashCode = prime * hashCode + ((getDocumentId() == null) ? 0 : getDocumentId().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentTitle() == null) ? 0 : getDocumentTitle().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentExcerpt() == null) ? 0 : getDocumentExcerpt().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentURI() == null) ? 0 : getDocumentURI().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentAttributes() == null) ? 0 : getDocumentAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryResultItem == false)
            return false;
        QueryResultItem other = (QueryResultItem) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getAdditionalAttributes() == null ^ this.getAdditionalAttributes() == null)
            return false;
        if (other.getAdditionalAttributes() != null
                && other.getAdditionalAttributes().equals(this.getAdditionalAttributes()) == false)
            return false;
        if (other.getDocumentId() == null ^ this.getDocumentId() == null)
            return false;
        if (other.getDocumentId() != null
                && other.getDocumentId().equals(this.getDocumentId()) == false)
            return false;
        if (other.getDocumentTitle() == null ^ this.getDocumentTitle() == null)
            return false;
        if (other.getDocumentTitle() != null
                && other.getDocumentTitle().equals(this.getDocumentTitle()) == false)
            return false;
        if (other.getDocumentExcerpt() == null ^ this.getDocumentExcerpt() == null)
            return false;
        if (other.getDocumentExcerpt() != null
                && other.getDocumentExcerpt().equals(this.getDocumentExcerpt()) == false)
            return false;
        if (other.getDocumentURI() == null ^ this.getDocumentURI() == null)
            return false;
        if (other.getDocumentURI() != null
                && other.getDocumentURI().equals(this.getDocumentURI()) == false)
            return false;
        if (other.getDocumentAttributes() == null ^ this.getDocumentAttributes() == null)
            return false;
        if (other.getDocumentAttributes() != null
                && other.getDocumentAttributes().equals(this.getDocumentAttributes()) == false)
            return false;
        return true;
    }
}
