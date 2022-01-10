/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

public class ListMedicalVocabulariesResult implements Serializable {
    /**
     * <p>
     * The requested vocabulary state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     */
    private String status;

    /**
     * <p>
     * The <code>ListMedicalVocabularies</code> operation returns a page of
     * vocabularies at a time. You set the maximum number of vocabularies to
     * return on a page with the <code>MaxResults</code> parameter. If there are
     * more jobs in the list will fit on a page, Amazon Transcribe Medical
     * returns the <code>NextPage</code> token. To return the next page of
     * vocabularies, include the token in the next request to the
     * <code>ListMedicalVocabularies</code> operation .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of objects that describe the vocabularies that match your search
     * criteria.
     * </p>
     */
    private java.util.List<VocabularyInfo> vocabularies;

    /**
     * <p>
     * The requested vocabulary state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     *
     * @return <p>
     *         The requested vocabulary state.
     *         </p>
     * @see VocabularyState
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The requested vocabulary state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     *
     * @param status <p>
     *            The requested vocabulary state.
     *            </p>
     * @see VocabularyState
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The requested vocabulary state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     *
     * @param status <p>
     *            The requested vocabulary state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VocabularyState
     */
    public ListMedicalVocabulariesResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The requested vocabulary state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     *
     * @param status <p>
     *            The requested vocabulary state.
     *            </p>
     * @see VocabularyState
     */
    public void setStatus(VocabularyState status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The requested vocabulary state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, READY, FAILED
     *
     * @param status <p>
     *            The requested vocabulary state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VocabularyState
     */
    public ListMedicalVocabulariesResult withStatus(VocabularyState status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The <code>ListMedicalVocabularies</code> operation returns a page of
     * vocabularies at a time. You set the maximum number of vocabularies to
     * return on a page with the <code>MaxResults</code> parameter. If there are
     * more jobs in the list will fit on a page, Amazon Transcribe Medical
     * returns the <code>NextPage</code> token. To return the next page of
     * vocabularies, include the token in the next request to the
     * <code>ListMedicalVocabularies</code> operation .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         The <code>ListMedicalVocabularies</code> operation returns a page
     *         of vocabularies at a time. You set the maximum number of
     *         vocabularies to return on a page with the <code>MaxResults</code>
     *         parameter. If there are more jobs in the list will fit on a page,
     *         Amazon Transcribe Medical returns the <code>NextPage</code>
     *         token. To return the next page of vocabularies, include the token
     *         in the next request to the <code>ListMedicalVocabularies</code>
     *         operation .
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The <code>ListMedicalVocabularies</code> operation returns a page of
     * vocabularies at a time. You set the maximum number of vocabularies to
     * return on a page with the <code>MaxResults</code> parameter. If there are
     * more jobs in the list will fit on a page, Amazon Transcribe Medical
     * returns the <code>NextPage</code> token. To return the next page of
     * vocabularies, include the token in the next request to the
     * <code>ListMedicalVocabularies</code> operation .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param nextToken <p>
     *            The <code>ListMedicalVocabularies</code> operation returns a
     *            page of vocabularies at a time. You set the maximum number of
     *            vocabularies to return on a page with the
     *            <code>MaxResults</code> parameter. If there are more jobs in
     *            the list will fit on a page, Amazon Transcribe Medical returns
     *            the <code>NextPage</code> token. To return the next page of
     *            vocabularies, include the token in the next request to the
     *            <code>ListMedicalVocabularies</code> operation .
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>ListMedicalVocabularies</code> operation returns a page of
     * vocabularies at a time. You set the maximum number of vocabularies to
     * return on a page with the <code>MaxResults</code> parameter. If there are
     * more jobs in the list will fit on a page, Amazon Transcribe Medical
     * returns the <code>NextPage</code> token. To return the next page of
     * vocabularies, include the token in the next request to the
     * <code>ListMedicalVocabularies</code> operation .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param nextToken <p>
     *            The <code>ListMedicalVocabularies</code> operation returns a
     *            page of vocabularies at a time. You set the maximum number of
     *            vocabularies to return on a page with the
     *            <code>MaxResults</code> parameter. If there are more jobs in
     *            the list will fit on a page, Amazon Transcribe Medical returns
     *            the <code>NextPage</code> token. To return the next page of
     *            vocabularies, include the token in the next request to the
     *            <code>ListMedicalVocabularies</code> operation .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMedicalVocabulariesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * A list of objects that describe the vocabularies that match your search
     * criteria.
     * </p>
     *
     * @return <p>
     *         A list of objects that describe the vocabularies that match your
     *         search criteria.
     *         </p>
     */
    public java.util.List<VocabularyInfo> getVocabularies() {
        return vocabularies;
    }

    /**
     * <p>
     * A list of objects that describe the vocabularies that match your search
     * criteria.
     * </p>
     *
     * @param vocabularies <p>
     *            A list of objects that describe the vocabularies that match
     *            your search criteria.
     *            </p>
     */
    public void setVocabularies(java.util.Collection<VocabularyInfo> vocabularies) {
        if (vocabularies == null) {
            this.vocabularies = null;
            return;
        }

        this.vocabularies = new java.util.ArrayList<VocabularyInfo>(vocabularies);
    }

    /**
     * <p>
     * A list of objects that describe the vocabularies that match your search
     * criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vocabularies <p>
     *            A list of objects that describe the vocabularies that match
     *            your search criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMedicalVocabulariesResult withVocabularies(VocabularyInfo... vocabularies) {
        if (getVocabularies() == null) {
            this.vocabularies = new java.util.ArrayList<VocabularyInfo>(vocabularies.length);
        }
        for (VocabularyInfo value : vocabularies) {
            this.vocabularies.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects that describe the vocabularies that match your search
     * criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vocabularies <p>
     *            A list of objects that describe the vocabularies that match
     *            your search criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMedicalVocabulariesResult withVocabularies(
            java.util.Collection<VocabularyInfo> vocabularies) {
        setVocabularies(vocabularies);
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getVocabularies() != null)
            sb.append("Vocabularies: " + getVocabularies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getVocabularies() == null) ? 0 : getVocabularies().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMedicalVocabulariesResult == false)
            return false;
        ListMedicalVocabulariesResult other = (ListMedicalVocabulariesResult) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getVocabularies() == null ^ this.getVocabularies() == null)
            return false;
        if (other.getVocabularies() != null
                && other.getVocabularies().equals(this.getVocabularies()) == false)
            return false;
        return true;
    }
}
