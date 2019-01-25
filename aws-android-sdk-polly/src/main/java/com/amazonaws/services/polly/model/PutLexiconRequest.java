/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.polly.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Stores a pronunciation lexicon in an AWS Region. If a lexicon with the same
 * name already exists in the region, it is overwritten by the new lexicon.
 * Lexicon operations have eventual consistency, therefore, it might take some
 * time before the lexicon is available to the SynthesizeSpeech operation.
 * </p>
 * <p>
 * For more information, see <a
 * href="http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html"
 * >Managing Lexicons</a>.
 * </p>
 */
public class PutLexiconRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Name of the lexicon. The name must follow the regular express format
     * [0-9A-Za-z]{1,20}. That is, the name is a case-sensitive alphanumeric
     * string up to 20 characters long.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9A-Za-z]{1,20}<br/>
     */
    private String name;

    /**
     * <p>
     * Content of the PLS lexicon as string data.
     * </p>
     */
    private String content;

    /**
     * <p>
     * Name of the lexicon. The name must follow the regular express format
     * [0-9A-Za-z]{1,20}. That is, the name is a case-sensitive alphanumeric
     * string up to 20 characters long.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9A-Za-z]{1,20}<br/>
     *
     * @return <p>
     *         Name of the lexicon. The name must follow the regular express
     *         format [0-9A-Za-z]{1,20}. That is, the name is a case-sensitive
     *         alphanumeric string up to 20 characters long.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Name of the lexicon. The name must follow the regular express format
     * [0-9A-Za-z]{1,20}. That is, the name is a case-sensitive alphanumeric
     * string up to 20 characters long.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9A-Za-z]{1,20}<br/>
     *
     * @param name <p>
     *            Name of the lexicon. The name must follow the regular express
     *            format [0-9A-Za-z]{1,20}. That is, the name is a
     *            case-sensitive alphanumeric string up to 20 characters long.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the lexicon. The name must follow the regular express format
     * [0-9A-Za-z]{1,20}. That is, the name is a case-sensitive alphanumeric
     * string up to 20 characters long.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9A-Za-z]{1,20}<br/>
     *
     * @param name <p>
     *            Name of the lexicon. The name must follow the regular express
     *            format [0-9A-Za-z]{1,20}. That is, the name is a
     *            case-sensitive alphanumeric string up to 20 characters long.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutLexiconRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Content of the PLS lexicon as string data.
     * </p>
     *
     * @return <p>
     *         Content of the PLS lexicon as string data.
     *         </p>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>
     * Content of the PLS lexicon as string data.
     * </p>
     *
     * @param content <p>
     *            Content of the PLS lexicon as string data.
     *            </p>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * Content of the PLS lexicon as string data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param content <p>
     *            Content of the PLS lexicon as string data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutLexiconRequest withContent(String content) {
        this.content = content;
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
        if (getContent() != null)
            sb.append("Content: " + getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutLexiconRequest == false)
            return false;
        PutLexiconRequest other = (PutLexiconRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }
}
