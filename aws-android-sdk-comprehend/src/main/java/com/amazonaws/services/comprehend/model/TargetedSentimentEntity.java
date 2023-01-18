/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * Information about one of the entities found by targeted sentiment analysis.
 * </p>
 * <p>
 * For more information about targeted sentiment, see <a href=
 * "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html"
 * >Targeted sentiment</a>.
 * </p>
 */
public class TargetedSentimentEntity implements Serializable {
    /**
     * <p>
     * One or more index into the Mentions array that provides the best name for
     * the entity group.
     * </p>
     */
    private java.util.List<Integer> descriptiveMentionIndex;

    /**
     * <p>
     * An array of mentions of the entity in the document. The array represents
     * a co-reference group. See <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-values"
     * > Co-reference group</a> for an example.
     * </p>
     */
    private java.util.List<TargetedSentimentMention> mentions;

    /**
     * <p>
     * One or more index into the Mentions array that provides the best name for
     * the entity group.
     * </p>
     *
     * @return <p>
     *         One or more index into the Mentions array that provides the best
     *         name for the entity group.
     *         </p>
     */
    public java.util.List<Integer> getDescriptiveMentionIndex() {
        return descriptiveMentionIndex;
    }

    /**
     * <p>
     * One or more index into the Mentions array that provides the best name for
     * the entity group.
     * </p>
     *
     * @param descriptiveMentionIndex <p>
     *            One or more index into the Mentions array that provides the
     *            best name for the entity group.
     *            </p>
     */
    public void setDescriptiveMentionIndex(java.util.Collection<Integer> descriptiveMentionIndex) {
        if (descriptiveMentionIndex == null) {
            this.descriptiveMentionIndex = null;
            return;
        }

        this.descriptiveMentionIndex = new java.util.ArrayList<Integer>(descriptiveMentionIndex);
    }

    /**
     * <p>
     * One or more index into the Mentions array that provides the best name for
     * the entity group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param descriptiveMentionIndex <p>
     *            One or more index into the Mentions array that provides the
     *            best name for the entity group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetedSentimentEntity withDescriptiveMentionIndex(Integer... descriptiveMentionIndex) {
        if (getDescriptiveMentionIndex() == null) {
            this.descriptiveMentionIndex = new java.util.ArrayList<Integer>(
                    descriptiveMentionIndex.length);
        }
        for (Integer value : descriptiveMentionIndex) {
            this.descriptiveMentionIndex.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more index into the Mentions array that provides the best name for
     * the entity group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param descriptiveMentionIndex <p>
     *            One or more index into the Mentions array that provides the
     *            best name for the entity group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetedSentimentEntity withDescriptiveMentionIndex(
            java.util.Collection<Integer> descriptiveMentionIndex) {
        setDescriptiveMentionIndex(descriptiveMentionIndex);
        return this;
    }

    /**
     * <p>
     * An array of mentions of the entity in the document. The array represents
     * a co-reference group. See <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-values"
     * > Co-reference group</a> for an example.
     * </p>
     *
     * @return <p>
     *         An array of mentions of the entity in the document. The array
     *         represents a co-reference group. See <a href=
     *         "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-values"
     *         > Co-reference group</a> for an example.
     *         </p>
     */
    public java.util.List<TargetedSentimentMention> getMentions() {
        return mentions;
    }

    /**
     * <p>
     * An array of mentions of the entity in the document. The array represents
     * a co-reference group. See <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-values"
     * > Co-reference group</a> for an example.
     * </p>
     *
     * @param mentions <p>
     *            An array of mentions of the entity in the document. The array
     *            represents a co-reference group. See <a href=
     *            "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-values"
     *            > Co-reference group</a> for an example.
     *            </p>
     */
    public void setMentions(java.util.Collection<TargetedSentimentMention> mentions) {
        if (mentions == null) {
            this.mentions = null;
            return;
        }

        this.mentions = new java.util.ArrayList<TargetedSentimentMention>(mentions);
    }

    /**
     * <p>
     * An array of mentions of the entity in the document. The array represents
     * a co-reference group. See <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-values"
     * > Co-reference group</a> for an example.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mentions <p>
     *            An array of mentions of the entity in the document. The array
     *            represents a co-reference group. See <a href=
     *            "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-values"
     *            > Co-reference group</a> for an example.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetedSentimentEntity withMentions(TargetedSentimentMention... mentions) {
        if (getMentions() == null) {
            this.mentions = new java.util.ArrayList<TargetedSentimentMention>(mentions.length);
        }
        for (TargetedSentimentMention value : mentions) {
            this.mentions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of mentions of the entity in the document. The array represents
     * a co-reference group. See <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-values"
     * > Co-reference group</a> for an example.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mentions <p>
     *            An array of mentions of the entity in the document. The array
     *            represents a co-reference group. See <a href=
     *            "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-values"
     *            > Co-reference group</a> for an example.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetedSentimentEntity withMentions(
            java.util.Collection<TargetedSentimentMention> mentions) {
        setMentions(mentions);
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
        if (getDescriptiveMentionIndex() != null)
            sb.append("DescriptiveMentionIndex: " + getDescriptiveMentionIndex() + ",");
        if (getMentions() != null)
            sb.append("Mentions: " + getMentions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDescriptiveMentionIndex() == null) ? 0 : getDescriptiveMentionIndex()
                        .hashCode());
        hashCode = prime * hashCode + ((getMentions() == null) ? 0 : getMentions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetedSentimentEntity == false)
            return false;
        TargetedSentimentEntity other = (TargetedSentimentEntity) obj;

        if (other.getDescriptiveMentionIndex() == null ^ this.getDescriptiveMentionIndex() == null)
            return false;
        if (other.getDescriptiveMentionIndex() != null
                && other.getDescriptiveMentionIndex().equals(this.getDescriptiveMentionIndex()) == false)
            return false;
        if (other.getMentions() == null ^ this.getMentions() == null)
            return false;
        if (other.getMentions() != null && other.getMentions().equals(this.getMentions()) == false)
            return false;
        return true;
    }
}
