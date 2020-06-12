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

package com.amazonaws.services.models.lex.model;

import java.io.Serializable;

/**
 * <p>
 * Provides a regular expression used to validate the value of a slot.
 * </p>
 */
public class SlotTypeRegexConfiguration implements Serializable {
    /**
     * <p>
     * A regular expression used to validate the value of a slot.
     * </p>
     * <p>
     * Use a standard regular expression. Amazon Lex supports the following
     * characters in the regular expression:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z
     * </p>
     * </li>
     * <li>
     * <p>
     * 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * Unicode characters ("\ u&lt;Unicode&gt;")
     * </p>
     * </li>
     * </ul>
     * <p>
     * Represent Unicode characters with four digits, for example "\u0041" or
     * "\u005A".
     * </p>
     * <p>
     * The following regular expression operators are not supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Infinite repeaters: *, +, or {x,} with no upper bound.
     * </p>
     * </li>
     * <li>
     * <p>
     * Wild card (.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String pattern;

    /**
     * <p>
     * A regular expression used to validate the value of a slot.
     * </p>
     * <p>
     * Use a standard regular expression. Amazon Lex supports the following
     * characters in the regular expression:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z
     * </p>
     * </li>
     * <li>
     * <p>
     * 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * Unicode characters ("\ u&lt;Unicode&gt;")
     * </p>
     * </li>
     * </ul>
     * <p>
     * Represent Unicode characters with four digits, for example "\u0041" or
     * "\u005A".
     * </p>
     * <p>
     * The following regular expression operators are not supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Infinite repeaters: *, +, or {x,} with no upper bound.
     * </p>
     * </li>
     * <li>
     * <p>
     * Wild card (.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         A regular expression used to validate the value of a slot.
     *         </p>
     *         <p>
     *         Use a standard regular expression. Amazon Lex supports the
     *         following characters in the regular expression:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         A-Z, a-z
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0-9
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Unicode characters ("\ u&lt;Unicode&gt;")
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Represent Unicode characters with four digits, for example
     *         "\u0041" or "\u005A".
     *         </p>
     *         <p>
     *         The following regular expression operators are not supported:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Infinite repeaters: *, +, or {x,} with no upper bound.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Wild card (.)
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * <p>
     * A regular expression used to validate the value of a slot.
     * </p>
     * <p>
     * Use a standard regular expression. Amazon Lex supports the following
     * characters in the regular expression:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z
     * </p>
     * </li>
     * <li>
     * <p>
     * 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * Unicode characters ("\ u&lt;Unicode&gt;")
     * </p>
     * </li>
     * </ul>
     * <p>
     * Represent Unicode characters with four digits, for example "\u0041" or
     * "\u005A".
     * </p>
     * <p>
     * The following regular expression operators are not supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Infinite repeaters: *, +, or {x,} with no upper bound.
     * </p>
     * </li>
     * <li>
     * <p>
     * Wild card (.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param pattern <p>
     *            A regular expression used to validate the value of a slot.
     *            </p>
     *            <p>
     *            Use a standard regular expression. Amazon Lex supports the
     *            following characters in the regular expression:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            A-Z, a-z
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0-9
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Unicode characters ("\ u&lt;Unicode&gt;")
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Represent Unicode characters with four digits, for example
     *            "\u0041" or "\u005A".
     *            </p>
     *            <p>
     *            The following regular expression operators are not supported:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Infinite repeaters: *, +, or {x,} with no upper bound.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Wild card (.)
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     * <p>
     * A regular expression used to validate the value of a slot.
     * </p>
     * <p>
     * Use a standard regular expression. Amazon Lex supports the following
     * characters in the regular expression:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z
     * </p>
     * </li>
     * <li>
     * <p>
     * 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * Unicode characters ("\ u&lt;Unicode&gt;")
     * </p>
     * </li>
     * </ul>
     * <p>
     * Represent Unicode characters with four digits, for example "\u0041" or
     * "\u005A".
     * </p>
     * <p>
     * The following regular expression operators are not supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Infinite repeaters: *, +, or {x,} with no upper bound.
     * </p>
     * </li>
     * <li>
     * <p>
     * Wild card (.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param pattern <p>
     *            A regular expression used to validate the value of a slot.
     *            </p>
     *            <p>
     *            Use a standard regular expression. Amazon Lex supports the
     *            following characters in the regular expression:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            A-Z, a-z
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            0-9
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Unicode characters ("\ u&lt;Unicode&gt;")
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Represent Unicode characters with four digits, for example
     *            "\u0041" or "\u005A".
     *            </p>
     *            <p>
     *            The following regular expression operators are not supported:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Infinite repeaters: *, +, or {x,} with no upper bound.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Wild card (.)
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SlotTypeRegexConfiguration withPattern(String pattern) {
        this.pattern = pattern;
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
        if (getPattern() != null)
            sb.append("pattern: " + getPattern());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPattern() == null) ? 0 : getPattern().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SlotTypeRegexConfiguration == false)
            return false;
        SlotTypeRegexConfiguration other = (SlotTypeRegexConfiguration) obj;

        if (other.getPattern() == null ^ this.getPattern() == null)
            return false;
        if (other.getPattern() != null && other.getPattern().equals(this.getPattern()) == false)
            return false;
        return true;
    }
}
