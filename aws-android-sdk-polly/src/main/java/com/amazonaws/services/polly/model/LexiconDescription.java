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
 * Describes the content of the lexicon.
 * </p>
 */
public class LexiconDescription implements Serializable {
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
     * Provides lexicon metadata.
     * </p>
     */
    private LexiconAttributes attributes;

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
    public LexiconDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Provides lexicon metadata.
     * </p>
     *
     * @return <p>
     *         Provides lexicon metadata.
     *         </p>
     */
    public LexiconAttributes getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * Provides lexicon metadata.
     * </p>
     *
     * @param attributes <p>
     *            Provides lexicon metadata.
     *            </p>
     */
    public void setAttributes(LexiconAttributes attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * Provides lexicon metadata.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            Provides lexicon metadata.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LexiconDescription withAttributes(LexiconAttributes attributes) {
        this.attributes = attributes;
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
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LexiconDescription == false)
            return false;
        LexiconDescription other = (LexiconDescription) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }
}
