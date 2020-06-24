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

package com.amazonaws.services.codecommit.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the values for reactions to a comment. AWS CodeCommit
 * supports a limited set of reactions.
 * </p>
 */
public class ReactionValueFormats implements Serializable {
    /**
     * <p>
     * The Emoji Version 1.0 graphic of the reaction. These graphics are
     * interpreted slightly differently on different operating systems.
     * </p>
     */
    private String emoji;

    /**
     * <p>
     * The emoji short code for the reaction. Short codes are interpreted
     * slightly differently on different operating systems.
     * </p>
     */
    private String shortCode;

    /**
     * <p>
     * The Unicode codepoint for the reaction.
     * </p>
     */
    private String unicode;

    /**
     * <p>
     * The Emoji Version 1.0 graphic of the reaction. These graphics are
     * interpreted slightly differently on different operating systems.
     * </p>
     *
     * @return <p>
     *         The Emoji Version 1.0 graphic of the reaction. These graphics are
     *         interpreted slightly differently on different operating systems.
     *         </p>
     */
    public String getEmoji() {
        return emoji;
    }

    /**
     * <p>
     * The Emoji Version 1.0 graphic of the reaction. These graphics are
     * interpreted slightly differently on different operating systems.
     * </p>
     *
     * @param emoji <p>
     *            The Emoji Version 1.0 graphic of the reaction. These graphics
     *            are interpreted slightly differently on different operating
     *            systems.
     *            </p>
     */
    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    /**
     * <p>
     * The Emoji Version 1.0 graphic of the reaction. These graphics are
     * interpreted slightly differently on different operating systems.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param emoji <p>
     *            The Emoji Version 1.0 graphic of the reaction. These graphics
     *            are interpreted slightly differently on different operating
     *            systems.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReactionValueFormats withEmoji(String emoji) {
        this.emoji = emoji;
        return this;
    }

    /**
     * <p>
     * The emoji short code for the reaction. Short codes are interpreted
     * slightly differently on different operating systems.
     * </p>
     *
     * @return <p>
     *         The emoji short code for the reaction. Short codes are
     *         interpreted slightly differently on different operating systems.
     *         </p>
     */
    public String getShortCode() {
        return shortCode;
    }

    /**
     * <p>
     * The emoji short code for the reaction. Short codes are interpreted
     * slightly differently on different operating systems.
     * </p>
     *
     * @param shortCode <p>
     *            The emoji short code for the reaction. Short codes are
     *            interpreted slightly differently on different operating
     *            systems.
     *            </p>
     */
    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    /**
     * <p>
     * The emoji short code for the reaction. Short codes are interpreted
     * slightly differently on different operating systems.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param shortCode <p>
     *            The emoji short code for the reaction. Short codes are
     *            interpreted slightly differently on different operating
     *            systems.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReactionValueFormats withShortCode(String shortCode) {
        this.shortCode = shortCode;
        return this;
    }

    /**
     * <p>
     * The Unicode codepoint for the reaction.
     * </p>
     *
     * @return <p>
     *         The Unicode codepoint for the reaction.
     *         </p>
     */
    public String getUnicode() {
        return unicode;
    }

    /**
     * <p>
     * The Unicode codepoint for the reaction.
     * </p>
     *
     * @param unicode <p>
     *            The Unicode codepoint for the reaction.
     *            </p>
     */
    public void setUnicode(String unicode) {
        this.unicode = unicode;
    }

    /**
     * <p>
     * The Unicode codepoint for the reaction.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unicode <p>
     *            The Unicode codepoint for the reaction.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReactionValueFormats withUnicode(String unicode) {
        this.unicode = unicode;
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
        if (getEmoji() != null)
            sb.append("emoji: " + getEmoji() + ",");
        if (getShortCode() != null)
            sb.append("shortCode: " + getShortCode() + ",");
        if (getUnicode() != null)
            sb.append("unicode: " + getUnicode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmoji() == null) ? 0 : getEmoji().hashCode());
        hashCode = prime * hashCode + ((getShortCode() == null) ? 0 : getShortCode().hashCode());
        hashCode = prime * hashCode + ((getUnicode() == null) ? 0 : getUnicode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReactionValueFormats == false)
            return false;
        ReactionValueFormats other = (ReactionValueFormats) obj;

        if (other.getEmoji() == null ^ this.getEmoji() == null)
            return false;
        if (other.getEmoji() != null && other.getEmoji().equals(this.getEmoji()) == false)
            return false;
        if (other.getShortCode() == null ^ this.getShortCode() == null)
            return false;
        if (other.getShortCode() != null
                && other.getShortCode().equals(this.getShortCode()) == false)
            return false;
        if (other.getUnicode() == null ^ this.getUnicode() == null)
            return false;
        if (other.getUnicode() != null && other.getUnicode().equals(this.getUnicode()) == false)
            return false;
        return true;
    }
}
