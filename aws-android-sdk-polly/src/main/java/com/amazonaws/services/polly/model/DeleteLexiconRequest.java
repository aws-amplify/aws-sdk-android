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
 * Deletes the specified pronunciation lexicon stored in an AWS Region. A
 * lexicon which has been deleted is not available for speech synthesis, nor is
 * it possible to retrieve it using either the <code>GetLexicon</code> or
 * <code>ListLexicon</code> APIs.
 * </p>
 * <p>
 * For more information, see <a
 * href="http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html"
 * >Managing Lexicons</a>.
 * </p>
 */
public class DeleteLexiconRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the lexicon to delete. Must be an existing lexicon in the
     * region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9A-Za-z]{1,20}<br/>
     */
    private String name;

    /**
     * <p>
     * The name of the lexicon to delete. Must be an existing lexicon in the
     * region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9A-Za-z]{1,20}<br/>
     *
     * @return <p>
     *         The name of the lexicon to delete. Must be an existing lexicon in
     *         the region.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the lexicon to delete. Must be an existing lexicon in the
     * region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9A-Za-z]{1,20}<br/>
     *
     * @param name <p>
     *            The name of the lexicon to delete. Must be an existing lexicon
     *            in the region.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the lexicon to delete. Must be an existing lexicon in the
     * region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9A-Za-z]{1,20}<br/>
     *
     * @param name <p>
     *            The name of the lexicon to delete. Must be an existing lexicon
     *            in the region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLexiconRequest withName(String name) {
        this.name = name;
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
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteLexiconRequest == false)
            return false;
        DeleteLexiconRequest other = (DeleteLexiconRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
