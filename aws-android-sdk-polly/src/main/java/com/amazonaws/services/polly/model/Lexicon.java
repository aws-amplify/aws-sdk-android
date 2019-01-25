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

/**
 * <p>
 * Provides lexicon name and lexicon content in string format. For more
 * information, see <a
 * href="https://www.w3.org/TR/pronunciation-lexicon/">Pronunciation Lexicon
 * Specification (PLS) Version 1.0</a>.
 * </p>
 */
public class Lexicon implements Serializable {
    /**
     * <p>
     * Lexicon content in string format. The content of a lexicon must be in PLS
     * format.
     * </p>
     */
    private String content;

    /**
     * <p>
     * Name of the lexicon.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9A-Za-z]{1,20}<br/>
     */
    private String name;

    /**
     * <p>
     * Lexicon content in string format. The content of a lexicon must be in PLS
     * format.
     * </p>
     *
     * @return <p>
     *         Lexicon content in string format. The content of a lexicon must
     *         be in PLS format.
     *         </p>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>
     * Lexicon content in string format. The content of a lexicon must be in PLS
     * format.
     * </p>
     *
     * @param content <p>
     *            Lexicon content in string format. The content of a lexicon
     *            must be in PLS format.
     *            </p>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * Lexicon content in string format. The content of a lexicon must be in PLS
     * format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param content <p>
     *            Lexicon content in string format. The content of a lexicon
     *            must be in PLS format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Lexicon withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * <p>
     * Name of the lexicon.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9A-Za-z]{1,20}<br/>
     *
     * @return <p>
     *         Name of the lexicon.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Name of the lexicon.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9A-Za-z]{1,20}<br/>
     *
     * @param name <p>
     *            Name of the lexicon.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the lexicon.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9A-Za-z]{1,20}<br/>
     *
     * @param name <p>
     *            Name of the lexicon.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Lexicon withName(String name) {
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
        if (getContent() != null)
            sb.append("Content: " + getContent() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Lexicon == false)
            return false;
        Lexicon other = (Lexicon) obj;

        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
