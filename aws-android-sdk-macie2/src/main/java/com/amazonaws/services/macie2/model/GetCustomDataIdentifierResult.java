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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

public class GetCustomDataIdentifierResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom data identifier.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the custom
     * data identifier was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * Specifies whether the custom data identifier was deleted. If you delete a
     * custom data identifier, Amazon Macie doesn't delete it permanently.
     * Instead, it soft deletes the identifier.
     * </p>
     */
    private Boolean deleted;

    /**
     * <p>
     * The custom description of the custom data identifier.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The unique identifier for the custom data identifier.
     * </p>
     */
    private String id;

    /**
     * <p>
     * An array that lists specific character sequences (ignore words) to
     * exclude from the results. If the text matched by the regular expression
     * is the same as any string in this array, Amazon Macie ignores it.
     * </p>
     */
    private java.util.List<String> ignoreWords;

    /**
     * <p>
     * An array that lists specific character sequences (keywords), one of which
     * must be within proximity (maximumMatchDistance) of the regular expression
     * to match.
     * </p>
     */
    private java.util.List<String> keywords;

    /**
     * <p>
     * The maximum number of characters that can exist between text that matches
     * the regex pattern and the character sequences specified by the keywords
     * array. Macie includes or excludes a result based on the proximity of a
     * keyword to text that matches the regex pattern.
     * </p>
     */
    private Integer maximumMatchDistance;

    /**
     * <p>
     * The custom name of the custom data identifier.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The regular expression (regex) that defines the pattern to match.
     * </p>
     */
    private String regex;

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that
     * are associated with the custom data identifier.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom data identifier.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the custom data identifier.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom data identifier.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the custom data identifier.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom data identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the custom data identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCustomDataIdentifierResult withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the custom
     * data identifier was created.
     * </p>
     *
     * @return <p>
     *         The date and time, in UTC and extended ISO 8601 format, when the
     *         custom data identifier was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the custom
     * data identifier was created.
     * </p>
     *
     * @param createdAt <p>
     *            The date and time, in UTC and extended ISO 8601 format, when
     *            the custom data identifier was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the custom
     * data identifier was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The date and time, in UTC and extended ISO 8601 format, when
     *            the custom data identifier was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCustomDataIdentifierResult withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * Specifies whether the custom data identifier was deleted. If you delete a
     * custom data identifier, Amazon Macie doesn't delete it permanently.
     * Instead, it soft deletes the identifier.
     * </p>
     *
     * @return <p>
     *         Specifies whether the custom data identifier was deleted. If you
     *         delete a custom data identifier, Amazon Macie doesn't delete it
     *         permanently. Instead, it soft deletes the identifier.
     *         </p>
     */
    public Boolean isDeleted() {
        return deleted;
    }

    /**
     * <p>
     * Specifies whether the custom data identifier was deleted. If you delete a
     * custom data identifier, Amazon Macie doesn't delete it permanently.
     * Instead, it soft deletes the identifier.
     * </p>
     *
     * @return <p>
     *         Specifies whether the custom data identifier was deleted. If you
     *         delete a custom data identifier, Amazon Macie doesn't delete it
     *         permanently. Instead, it soft deletes the identifier.
     *         </p>
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * <p>
     * Specifies whether the custom data identifier was deleted. If you delete a
     * custom data identifier, Amazon Macie doesn't delete it permanently.
     * Instead, it soft deletes the identifier.
     * </p>
     *
     * @param deleted <p>
     *            Specifies whether the custom data identifier was deleted. If
     *            you delete a custom data identifier, Amazon Macie doesn't
     *            delete it permanently. Instead, it soft deletes the
     *            identifier.
     *            </p>
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * <p>
     * Specifies whether the custom data identifier was deleted. If you delete a
     * custom data identifier, Amazon Macie doesn't delete it permanently.
     * Instead, it soft deletes the identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleted <p>
     *            Specifies whether the custom data identifier was deleted. If
     *            you delete a custom data identifier, Amazon Macie doesn't
     *            delete it permanently. Instead, it soft deletes the
     *            identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCustomDataIdentifierResult withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * <p>
     * The custom description of the custom data identifier.
     * </p>
     *
     * @return <p>
     *         The custom description of the custom data identifier.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The custom description of the custom data identifier.
     * </p>
     *
     * @param description <p>
     *            The custom description of the custom data identifier.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The custom description of the custom data identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The custom description of the custom data identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCustomDataIdentifierResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the custom data identifier.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the custom data identifier.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier for the custom data identifier.
     * </p>
     *
     * @param id <p>
     *            The unique identifier for the custom data identifier.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the custom data identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique identifier for the custom data identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCustomDataIdentifierResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * An array that lists specific character sequences (ignore words) to
     * exclude from the results. If the text matched by the regular expression
     * is the same as any string in this array, Amazon Macie ignores it.
     * </p>
     *
     * @return <p>
     *         An array that lists specific character sequences (ignore words)
     *         to exclude from the results. If the text matched by the regular
     *         expression is the same as any string in this array, Amazon Macie
     *         ignores it.
     *         </p>
     */
    public java.util.List<String> getIgnoreWords() {
        return ignoreWords;
    }

    /**
     * <p>
     * An array that lists specific character sequences (ignore words) to
     * exclude from the results. If the text matched by the regular expression
     * is the same as any string in this array, Amazon Macie ignores it.
     * </p>
     *
     * @param ignoreWords <p>
     *            An array that lists specific character sequences (ignore
     *            words) to exclude from the results. If the text matched by the
     *            regular expression is the same as any string in this array,
     *            Amazon Macie ignores it.
     *            </p>
     */
    public void setIgnoreWords(java.util.Collection<String> ignoreWords) {
        if (ignoreWords == null) {
            this.ignoreWords = null;
            return;
        }

        this.ignoreWords = new java.util.ArrayList<String>(ignoreWords);
    }

    /**
     * <p>
     * An array that lists specific character sequences (ignore words) to
     * exclude from the results. If the text matched by the regular expression
     * is the same as any string in this array, Amazon Macie ignores it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ignoreWords <p>
     *            An array that lists specific character sequences (ignore
     *            words) to exclude from the results. If the text matched by the
     *            regular expression is the same as any string in this array,
     *            Amazon Macie ignores it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCustomDataIdentifierResult withIgnoreWords(String... ignoreWords) {
        if (getIgnoreWords() == null) {
            this.ignoreWords = new java.util.ArrayList<String>(ignoreWords.length);
        }
        for (String value : ignoreWords) {
            this.ignoreWords.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array that lists specific character sequences (ignore words) to
     * exclude from the results. If the text matched by the regular expression
     * is the same as any string in this array, Amazon Macie ignores it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ignoreWords <p>
     *            An array that lists specific character sequences (ignore
     *            words) to exclude from the results. If the text matched by the
     *            regular expression is the same as any string in this array,
     *            Amazon Macie ignores it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCustomDataIdentifierResult withIgnoreWords(java.util.Collection<String> ignoreWords) {
        setIgnoreWords(ignoreWords);
        return this;
    }

    /**
     * <p>
     * An array that lists specific character sequences (keywords), one of which
     * must be within proximity (maximumMatchDistance) of the regular expression
     * to match.
     * </p>
     *
     * @return <p>
     *         An array that lists specific character sequences (keywords), one
     *         of which must be within proximity (maximumMatchDistance) of the
     *         regular expression to match.
     *         </p>
     */
    public java.util.List<String> getKeywords() {
        return keywords;
    }

    /**
     * <p>
     * An array that lists specific character sequences (keywords), one of which
     * must be within proximity (maximumMatchDistance) of the regular expression
     * to match.
     * </p>
     *
     * @param keywords <p>
     *            An array that lists specific character sequences (keywords),
     *            one of which must be within proximity (maximumMatchDistance)
     *            of the regular expression to match.
     *            </p>
     */
    public void setKeywords(java.util.Collection<String> keywords) {
        if (keywords == null) {
            this.keywords = null;
            return;
        }

        this.keywords = new java.util.ArrayList<String>(keywords);
    }

    /**
     * <p>
     * An array that lists specific character sequences (keywords), one of which
     * must be within proximity (maximumMatchDistance) of the regular expression
     * to match.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keywords <p>
     *            An array that lists specific character sequences (keywords),
     *            one of which must be within proximity (maximumMatchDistance)
     *            of the regular expression to match.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCustomDataIdentifierResult withKeywords(String... keywords) {
        if (getKeywords() == null) {
            this.keywords = new java.util.ArrayList<String>(keywords.length);
        }
        for (String value : keywords) {
            this.keywords.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array that lists specific character sequences (keywords), one of which
     * must be within proximity (maximumMatchDistance) of the regular expression
     * to match.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keywords <p>
     *            An array that lists specific character sequences (keywords),
     *            one of which must be within proximity (maximumMatchDistance)
     *            of the regular expression to match.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCustomDataIdentifierResult withKeywords(java.util.Collection<String> keywords) {
        setKeywords(keywords);
        return this;
    }

    /**
     * <p>
     * The maximum number of characters that can exist between text that matches
     * the regex pattern and the character sequences specified by the keywords
     * array. Macie includes or excludes a result based on the proximity of a
     * keyword to text that matches the regex pattern.
     * </p>
     *
     * @return <p>
     *         The maximum number of characters that can exist between text that
     *         matches the regex pattern and the character sequences specified
     *         by the keywords array. Macie includes or excludes a result based
     *         on the proximity of a keyword to text that matches the regex
     *         pattern.
     *         </p>
     */
    public Integer getMaximumMatchDistance() {
        return maximumMatchDistance;
    }

    /**
     * <p>
     * The maximum number of characters that can exist between text that matches
     * the regex pattern and the character sequences specified by the keywords
     * array. Macie includes or excludes a result based on the proximity of a
     * keyword to text that matches the regex pattern.
     * </p>
     *
     * @param maximumMatchDistance <p>
     *            The maximum number of characters that can exist between text
     *            that matches the regex pattern and the character sequences
     *            specified by the keywords array. Macie includes or excludes a
     *            result based on the proximity of a keyword to text that
     *            matches the regex pattern.
     *            </p>
     */
    public void setMaximumMatchDistance(Integer maximumMatchDistance) {
        this.maximumMatchDistance = maximumMatchDistance;
    }

    /**
     * <p>
     * The maximum number of characters that can exist between text that matches
     * the regex pattern and the character sequences specified by the keywords
     * array. Macie includes or excludes a result based on the proximity of a
     * keyword to text that matches the regex pattern.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maximumMatchDistance <p>
     *            The maximum number of characters that can exist between text
     *            that matches the regex pattern and the character sequences
     *            specified by the keywords array. Macie includes or excludes a
     *            result based on the proximity of a keyword to text that
     *            matches the regex pattern.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCustomDataIdentifierResult withMaximumMatchDistance(Integer maximumMatchDistance) {
        this.maximumMatchDistance = maximumMatchDistance;
        return this;
    }

    /**
     * <p>
     * The custom name of the custom data identifier.
     * </p>
     *
     * @return <p>
     *         The custom name of the custom data identifier.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The custom name of the custom data identifier.
     * </p>
     *
     * @param name <p>
     *            The custom name of the custom data identifier.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The custom name of the custom data identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The custom name of the custom data identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCustomDataIdentifierResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The regular expression (regex) that defines the pattern to match.
     * </p>
     *
     * @return <p>
     *         The regular expression (regex) that defines the pattern to match.
     *         </p>
     */
    public String getRegex() {
        return regex;
    }

    /**
     * <p>
     * The regular expression (regex) that defines the pattern to match.
     * </p>
     *
     * @param regex <p>
     *            The regular expression (regex) that defines the pattern to
     *            match.
     *            </p>
     */
    public void setRegex(String regex) {
        this.regex = regex;
    }

    /**
     * <p>
     * The regular expression (regex) that defines the pattern to match.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regex <p>
     *            The regular expression (regex) that defines the pattern to
     *            match.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCustomDataIdentifierResult withRegex(String regex) {
        this.regex = regex;
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that
     * are associated with the custom data identifier.
     * </p>
     *
     * @return <p>
     *         A map of key-value pairs that identifies the tags (keys and
     *         values) that are associated with the custom data identifier.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that
     * are associated with the custom data identifier.
     * </p>
     *
     * @param tags <p>
     *            A map of key-value pairs that identifies the tags (keys and
     *            values) that are associated with the custom data identifier.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that
     * are associated with the custom data identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A map of key-value pairs that identifies the tags (keys and
     *            values) that are associated with the custom data identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCustomDataIdentifierResult withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that
     * are associated with the custom data identifier.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCustomDataIdentifierResult addtagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public GetCustomDataIdentifierResult cleartagsEntries() {
        this.tags = null;
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
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getCreatedAt() != null)
            sb.append("createdAt: " + getCreatedAt() + ",");
        if (getDeleted() != null)
            sb.append("deleted: " + getDeleted() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getId() != null)
            sb.append("id: " + getId() + ",");
        if (getIgnoreWords() != null)
            sb.append("ignoreWords: " + getIgnoreWords() + ",");
        if (getKeywords() != null)
            sb.append("keywords: " + getKeywords() + ",");
        if (getMaximumMatchDistance() != null)
            sb.append("maximumMatchDistance: " + getMaximumMatchDistance() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getRegex() != null)
            sb.append("regex: " + getRegex() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getIgnoreWords() == null) ? 0 : getIgnoreWords().hashCode());
        hashCode = prime * hashCode + ((getKeywords() == null) ? 0 : getKeywords().hashCode());
        hashCode = prime * hashCode
                + ((getMaximumMatchDistance() == null) ? 0 : getMaximumMatchDistance().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRegex() == null) ? 0 : getRegex().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCustomDataIdentifierResult == false)
            return false;
        GetCustomDataIdentifierResult other = (GetCustomDataIdentifierResult) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDeleted() == null ^ this.getDeleted() == null)
            return false;
        if (other.getDeleted() != null && other.getDeleted().equals(this.getDeleted()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIgnoreWords() == null ^ this.getIgnoreWords() == null)
            return false;
        if (other.getIgnoreWords() != null
                && other.getIgnoreWords().equals(this.getIgnoreWords()) == false)
            return false;
        if (other.getKeywords() == null ^ this.getKeywords() == null)
            return false;
        if (other.getKeywords() != null && other.getKeywords().equals(this.getKeywords()) == false)
            return false;
        if (other.getMaximumMatchDistance() == null ^ this.getMaximumMatchDistance() == null)
            return false;
        if (other.getMaximumMatchDistance() != null
                && other.getMaximumMatchDistance().equals(this.getMaximumMatchDistance()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRegex() == null ^ this.getRegex() == null)
            return false;
        if (other.getRegex() != null && other.getRegex().equals(this.getRegex()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
