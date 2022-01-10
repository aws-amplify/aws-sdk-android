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

public class ListLanguageModelsResult implements Serializable {
    /**
     * <p>
     * The operation returns a page of jobs at a time. The maximum size of the
     * list is set by the MaxResults parameter. If there are more language
     * models in the list than the page size, Amazon Transcribe returns the
     * <code>NextPage</code> token. Include the token in the next request to the
     * operation to return the next page of language models.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of objects containing information about custom language models.
     * </p>
     */
    private java.util.List<LanguageModel> models;

    /**
     * <p>
     * The operation returns a page of jobs at a time. The maximum size of the
     * list is set by the MaxResults parameter. If there are more language
     * models in the list than the page size, Amazon Transcribe returns the
     * <code>NextPage</code> token. Include the token in the next request to the
     * operation to return the next page of language models.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         The operation returns a page of jobs at a time. The maximum size
     *         of the list is set by the MaxResults parameter. If there are more
     *         language models in the list than the page size, Amazon Transcribe
     *         returns the <code>NextPage</code> token. Include the token in the
     *         next request to the operation to return the next page of language
     *         models.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The operation returns a page of jobs at a time. The maximum size of the
     * list is set by the MaxResults parameter. If there are more language
     * models in the list than the page size, Amazon Transcribe returns the
     * <code>NextPage</code> token. Include the token in the next request to the
     * operation to return the next page of language models.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param nextToken <p>
     *            The operation returns a page of jobs at a time. The maximum
     *            size of the list is set by the MaxResults parameter. If there
     *            are more language models in the list than the page size,
     *            Amazon Transcribe returns the <code>NextPage</code> token.
     *            Include the token in the next request to the operation to
     *            return the next page of language models.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The operation returns a page of jobs at a time. The maximum size of the
     * list is set by the MaxResults parameter. If there are more language
     * models in the list than the page size, Amazon Transcribe returns the
     * <code>NextPage</code> token. Include the token in the next request to the
     * operation to return the next page of language models.
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
     *            The operation returns a page of jobs at a time. The maximum
     *            size of the list is set by the MaxResults parameter. If there
     *            are more language models in the list than the page size,
     *            Amazon Transcribe returns the <code>NextPage</code> token.
     *            Include the token in the next request to the operation to
     *            return the next page of language models.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLanguageModelsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * A list of objects containing information about custom language models.
     * </p>
     *
     * @return <p>
     *         A list of objects containing information about custom language
     *         models.
     *         </p>
     */
    public java.util.List<LanguageModel> getModels() {
        return models;
    }

    /**
     * <p>
     * A list of objects containing information about custom language models.
     * </p>
     *
     * @param models <p>
     *            A list of objects containing information about custom language
     *            models.
     *            </p>
     */
    public void setModels(java.util.Collection<LanguageModel> models) {
        if (models == null) {
            this.models = null;
            return;
        }

        this.models = new java.util.ArrayList<LanguageModel>(models);
    }

    /**
     * <p>
     * A list of objects containing information about custom language models.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param models <p>
     *            A list of objects containing information about custom language
     *            models.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLanguageModelsResult withModels(LanguageModel... models) {
        if (getModels() == null) {
            this.models = new java.util.ArrayList<LanguageModel>(models.length);
        }
        for (LanguageModel value : models) {
            this.models.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects containing information about custom language models.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param models <p>
     *            A list of objects containing information about custom language
     *            models.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLanguageModelsResult withModels(java.util.Collection<LanguageModel> models) {
        setModels(models);
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getModels() != null)
            sb.append("Models: " + getModels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getModels() == null) ? 0 : getModels().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLanguageModelsResult == false)
            return false;
        ListLanguageModelsResult other = (ListLanguageModelsResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getModels() == null ^ this.getModels() == null)
            return false;
        if (other.getModels() != null && other.getModels().equals(this.getModels()) == false)
            return false;
        return true;
    }
}
