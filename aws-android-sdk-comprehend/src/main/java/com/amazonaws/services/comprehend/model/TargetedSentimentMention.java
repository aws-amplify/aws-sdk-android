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
 * Information about one mention of an entity. The mention information includes
 * the location of the mention in the text and the sentiment of the mention.
 * </p>
 * <p>
 * For more information about targeted sentiment, see <a href=
 * "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html"
 * >Targeted sentiment</a>.
 * </p>
 */
public class TargetedSentimentMention implements Serializable {
    /**
     * <p>
     * Model confidence that the entity is relevant. Value range is zero to one,
     * where one is highest confidence.
     * </p>
     */
    private Float score;

    /**
     * <p>
     * The confidence that all the entities mentioned in the group relate to the
     * same entity.
     * </p>
     */
    private Float groupScore;

    /**
     * <p>
     * The text in the document that identifies the entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String text;

    /**
     * <p>
     * The type of the entity. Amazon Comprehend supports a variety of <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-entities"
     * >entity types</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSON, LOCATION, ORGANIZATION, FACILITY, BRAND,
     * COMMERCIAL_ITEM, MOVIE, MUSIC, BOOK, SOFTWARE, GAME, PERSONAL_TITLE,
     * EVENT, DATE, QUANTITY, ATTRIBUTE, OTHER
     */
    private String type;

    /**
     * <p>
     * Contains the sentiment and sentiment score for the mention.
     * </p>
     */
    private MentionSentiment mentionSentiment;

    /**
     * <p>
     * The offset into the document text where the mention begins.
     * </p>
     */
    private Integer beginOffset;

    /**
     * <p>
     * The offset into the document text where the mention ends.
     * </p>
     */
    private Integer endOffset;

    /**
     * <p>
     * Model confidence that the entity is relevant. Value range is zero to one,
     * where one is highest confidence.
     * </p>
     *
     * @return <p>
     *         Model confidence that the entity is relevant. Value range is zero
     *         to one, where one is highest confidence.
     *         </p>
     */
    public Float getScore() {
        return score;
    }

    /**
     * <p>
     * Model confidence that the entity is relevant. Value range is zero to one,
     * where one is highest confidence.
     * </p>
     *
     * @param score <p>
     *            Model confidence that the entity is relevant. Value range is
     *            zero to one, where one is highest confidence.
     *            </p>
     */
    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * <p>
     * Model confidence that the entity is relevant. Value range is zero to one,
     * where one is highest confidence.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param score <p>
     *            Model confidence that the entity is relevant. Value range is
     *            zero to one, where one is highest confidence.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetedSentimentMention withScore(Float score) {
        this.score = score;
        return this;
    }

    /**
     * <p>
     * The confidence that all the entities mentioned in the group relate to the
     * same entity.
     * </p>
     *
     * @return <p>
     *         The confidence that all the entities mentioned in the group
     *         relate to the same entity.
     *         </p>
     */
    public Float getGroupScore() {
        return groupScore;
    }

    /**
     * <p>
     * The confidence that all the entities mentioned in the group relate to the
     * same entity.
     * </p>
     *
     * @param groupScore <p>
     *            The confidence that all the entities mentioned in the group
     *            relate to the same entity.
     *            </p>
     */
    public void setGroupScore(Float groupScore) {
        this.groupScore = groupScore;
    }

    /**
     * <p>
     * The confidence that all the entities mentioned in the group relate to the
     * same entity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupScore <p>
     *            The confidence that all the entities mentioned in the group
     *            relate to the same entity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetedSentimentMention withGroupScore(Float groupScore) {
        this.groupScore = groupScore;
        return this;
    }

    /**
     * <p>
     * The text in the document that identifies the entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The text in the document that identifies the entity.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * The text in the document that identifies the entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param text <p>
     *            The text in the document that identifies the entity.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The text in the document that identifies the entity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param text <p>
     *            The text in the document that identifies the entity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetedSentimentMention withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * <p>
     * The type of the entity. Amazon Comprehend supports a variety of <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-entities"
     * >entity types</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSON, LOCATION, ORGANIZATION, FACILITY, BRAND,
     * COMMERCIAL_ITEM, MOVIE, MUSIC, BOOK, SOFTWARE, GAME, PERSONAL_TITLE,
     * EVENT, DATE, QUANTITY, ATTRIBUTE, OTHER
     *
     * @return <p>
     *         The type of the entity. Amazon Comprehend supports a variety of
     *         <a href=
     *         "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-entities"
     *         >entity types</a>.
     *         </p>
     * @see TargetedSentimentEntityType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the entity. Amazon Comprehend supports a variety of <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-entities"
     * >entity types</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSON, LOCATION, ORGANIZATION, FACILITY, BRAND,
     * COMMERCIAL_ITEM, MOVIE, MUSIC, BOOK, SOFTWARE, GAME, PERSONAL_TITLE,
     * EVENT, DATE, QUANTITY, ATTRIBUTE, OTHER
     *
     * @param type <p>
     *            The type of the entity. Amazon Comprehend supports a variety
     *            of <a href=
     *            "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-entities"
     *            >entity types</a>.
     *            </p>
     * @see TargetedSentimentEntityType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the entity. Amazon Comprehend supports a variety of <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-entities"
     * >entity types</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSON, LOCATION, ORGANIZATION, FACILITY, BRAND,
     * COMMERCIAL_ITEM, MOVIE, MUSIC, BOOK, SOFTWARE, GAME, PERSONAL_TITLE,
     * EVENT, DATE, QUANTITY, ATTRIBUTE, OTHER
     *
     * @param type <p>
     *            The type of the entity. Amazon Comprehend supports a variety
     *            of <a href=
     *            "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-entities"
     *            >entity types</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetedSentimentEntityType
     */
    public TargetedSentimentMention withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the entity. Amazon Comprehend supports a variety of <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-entities"
     * >entity types</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSON, LOCATION, ORGANIZATION, FACILITY, BRAND,
     * COMMERCIAL_ITEM, MOVIE, MUSIC, BOOK, SOFTWARE, GAME, PERSONAL_TITLE,
     * EVENT, DATE, QUANTITY, ATTRIBUTE, OTHER
     *
     * @param type <p>
     *            The type of the entity. Amazon Comprehend supports a variety
     *            of <a href=
     *            "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-entities"
     *            >entity types</a>.
     *            </p>
     * @see TargetedSentimentEntityType
     */
    public void setType(TargetedSentimentEntityType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the entity. Amazon Comprehend supports a variety of <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-entities"
     * >entity types</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSON, LOCATION, ORGANIZATION, FACILITY, BRAND,
     * COMMERCIAL_ITEM, MOVIE, MUSIC, BOOK, SOFTWARE, GAME, PERSONAL_TITLE,
     * EVENT, DATE, QUANTITY, ATTRIBUTE, OTHER
     *
     * @param type <p>
     *            The type of the entity. Amazon Comprehend supports a variety
     *            of <a href=
     *            "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-entities"
     *            >entity types</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetedSentimentEntityType
     */
    public TargetedSentimentMention withType(TargetedSentimentEntityType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Contains the sentiment and sentiment score for the mention.
     * </p>
     *
     * @return <p>
     *         Contains the sentiment and sentiment score for the mention.
     *         </p>
     */
    public MentionSentiment getMentionSentiment() {
        return mentionSentiment;
    }

    /**
     * <p>
     * Contains the sentiment and sentiment score for the mention.
     * </p>
     *
     * @param mentionSentiment <p>
     *            Contains the sentiment and sentiment score for the mention.
     *            </p>
     */
    public void setMentionSentiment(MentionSentiment mentionSentiment) {
        this.mentionSentiment = mentionSentiment;
    }

    /**
     * <p>
     * Contains the sentiment and sentiment score for the mention.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mentionSentiment <p>
     *            Contains the sentiment and sentiment score for the mention.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetedSentimentMention withMentionSentiment(MentionSentiment mentionSentiment) {
        this.mentionSentiment = mentionSentiment;
        return this;
    }

    /**
     * <p>
     * The offset into the document text where the mention begins.
     * </p>
     *
     * @return <p>
     *         The offset into the document text where the mention begins.
     *         </p>
     */
    public Integer getBeginOffset() {
        return beginOffset;
    }

    /**
     * <p>
     * The offset into the document text where the mention begins.
     * </p>
     *
     * @param beginOffset <p>
     *            The offset into the document text where the mention begins.
     *            </p>
     */
    public void setBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
    }

    /**
     * <p>
     * The offset into the document text where the mention begins.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param beginOffset <p>
     *            The offset into the document text where the mention begins.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetedSentimentMention withBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
        return this;
    }

    /**
     * <p>
     * The offset into the document text where the mention ends.
     * </p>
     *
     * @return <p>
     *         The offset into the document text where the mention ends.
     *         </p>
     */
    public Integer getEndOffset() {
        return endOffset;
    }

    /**
     * <p>
     * The offset into the document text where the mention ends.
     * </p>
     *
     * @param endOffset <p>
     *            The offset into the document text where the mention ends.
     *            </p>
     */
    public void setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
    }

    /**
     * <p>
     * The offset into the document text where the mention ends.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endOffset <p>
     *            The offset into the document text where the mention ends.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetedSentimentMention withEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
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
        if (getScore() != null)
            sb.append("Score: " + getScore() + ",");
        if (getGroupScore() != null)
            sb.append("GroupScore: " + getGroupScore() + ",");
        if (getText() != null)
            sb.append("Text: " + getText() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getMentionSentiment() != null)
            sb.append("MentionSentiment: " + getMentionSentiment() + ",");
        if (getBeginOffset() != null)
            sb.append("BeginOffset: " + getBeginOffset() + ",");
        if (getEndOffset() != null)
            sb.append("EndOffset: " + getEndOffset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        hashCode = prime * hashCode + ((getGroupScore() == null) ? 0 : getGroupScore().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getMentionSentiment() == null) ? 0 : getMentionSentiment().hashCode());
        hashCode = prime * hashCode
                + ((getBeginOffset() == null) ? 0 : getBeginOffset().hashCode());
        hashCode = prime * hashCode + ((getEndOffset() == null) ? 0 : getEndOffset().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetedSentimentMention == false)
            return false;
        TargetedSentimentMention other = (TargetedSentimentMention) obj;

        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        if (other.getGroupScore() == null ^ this.getGroupScore() == null)
            return false;
        if (other.getGroupScore() != null
                && other.getGroupScore().equals(this.getGroupScore()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMentionSentiment() == null ^ this.getMentionSentiment() == null)
            return false;
        if (other.getMentionSentiment() != null
                && other.getMentionSentiment().equals(this.getMentionSentiment()) == false)
            return false;
        if (other.getBeginOffset() == null ^ this.getBeginOffset() == null)
            return false;
        if (other.getBeginOffset() != null
                && other.getBeginOffset().equals(this.getBeginOffset()) == false)
            return false;
        if (other.getEndOffset() == null ^ this.getEndOffset() == null)
            return false;
        if (other.getEndOffset() != null
                && other.getEndOffset().equals(this.getEndOffset()) == false)
            return false;
        return true;
    }
}
