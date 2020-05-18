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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates and defines the criteria and other settings for a custom data
 * identifier.
 * </p>
 */
public class CreateCustomDataIdentifierRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency
     * of the request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * A custom description of the custom data identifier. The description can
     * contain up to 120 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the
     * description of a custom data identifier. Other users of your account
     * might be able to see the identifier's description, depending on the
     * actions that they're allowed to perform in Amazon Macie.
     * </p>
     */
    private String description;

    /**
     * <p>
     * An array that lists specific character sequences (ignore words) to
     * exclude from the results. If the text matched by the regular expression
     * is the same as any string in this array, Amazon Macie ignores it. The
     * array can contain as many as 10 ignore words. Each ignore word can
     * contain 4 - 90 characters.
     * </p>
     */
    private java.util.List<String> ignoreWords;

    /**
     * <p>
     * An array that lists specific character sequences (keywords), one of which
     * must be within proximity (maximumMatchDistance) of the regular expression
     * to match. The array can contain as many as 50 keywords. Each keyword can
     * contain 4 - 90 characters.
     * </p>
     */
    private java.util.List<String> keywords;

    /**
     * <p>
     * The maximum number of characters that can exist between text that matches
     * the regex pattern and the character sequences specified by the keywords
     * array. Macie includes or excludes a result based on the proximity of a
     * keyword to text that matches the regex pattern. The distance can be 1 -
     * 300 characters. The default value is 300.
     * </p>
     */
    private Integer maximumMatchDistance;

    /**
     * <p>
     * A custom name for the custom data identifier. The name can contain as
     * many as 120 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the
     * name of a custom data identifier. Other users of your account might be
     * able to see the identifier's name, depending on the actions that they're
     * allowed to perform in Amazon Macie.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The regular expression (regex) that defines the pattern to match. The
     * expression can contain as many as 500 characters.
     * </p>
     */
    private String regex;

    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the
     * custom data identifier.
     * </p>
     * <p>
     * A custom data identifier can have a maximum of 50 tags. Each tag consists
     * of a required tag key and an associated tag value. The maximum length of
     * a tag key is 128 characters. The maximum length of a tag value is 256
     * characters.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency
     * of the request.
     * </p>
     *
     * @return <p>
     *         A unique, case-sensitive token that you provide to ensure the
     *         idempotency of the request.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency
     * of the request.
     * </p>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive token that you provide to ensure the
     *            idempotency of the request.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency
     * of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            A unique, case-sensitive token that you provide to ensure the
     *            idempotency of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomDataIdentifierRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * A custom description of the custom data identifier. The description can
     * contain up to 120 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the
     * description of a custom data identifier. Other users of your account
     * might be able to see the identifier's description, depending on the
     * actions that they're allowed to perform in Amazon Macie.
     * </p>
     *
     * @return <p>
     *         A custom description of the custom data identifier. The
     *         description can contain up to 120 characters.
     *         </p>
     *         <p>
     *         We strongly recommend that you avoid including any sensitive data
     *         in the description of a custom data identifier. Other users of
     *         your account might be able to see the identifier's description,
     *         depending on the actions that they're allowed to perform in
     *         Amazon Macie.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A custom description of the custom data identifier. The description can
     * contain up to 120 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the
     * description of a custom data identifier. Other users of your account
     * might be able to see the identifier's description, depending on the
     * actions that they're allowed to perform in Amazon Macie.
     * </p>
     *
     * @param description <p>
     *            A custom description of the custom data identifier. The
     *            description can contain up to 120 characters.
     *            </p>
     *            <p>
     *            We strongly recommend that you avoid including any sensitive
     *            data in the description of a custom data identifier. Other
     *            users of your account might be able to see the identifier's
     *            description, depending on the actions that they're allowed to
     *            perform in Amazon Macie.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A custom description of the custom data identifier. The description can
     * contain up to 120 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the
     * description of a custom data identifier. Other users of your account
     * might be able to see the identifier's description, depending on the
     * actions that they're allowed to perform in Amazon Macie.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A custom description of the custom data identifier. The
     *            description can contain up to 120 characters.
     *            </p>
     *            <p>
     *            We strongly recommend that you avoid including any sensitive
     *            data in the description of a custom data identifier. Other
     *            users of your account might be able to see the identifier's
     *            description, depending on the actions that they're allowed to
     *            perform in Amazon Macie.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomDataIdentifierRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * An array that lists specific character sequences (ignore words) to
     * exclude from the results. If the text matched by the regular expression
     * is the same as any string in this array, Amazon Macie ignores it. The
     * array can contain as many as 10 ignore words. Each ignore word can
     * contain 4 - 90 characters.
     * </p>
     *
     * @return <p>
     *         An array that lists specific character sequences (ignore words)
     *         to exclude from the results. If the text matched by the regular
     *         expression is the same as any string in this array, Amazon Macie
     *         ignores it. The array can contain as many as 10 ignore words.
     *         Each ignore word can contain 4 - 90 characters.
     *         </p>
     */
    public java.util.List<String> getIgnoreWords() {
        return ignoreWords;
    }

    /**
     * <p>
     * An array that lists specific character sequences (ignore words) to
     * exclude from the results. If the text matched by the regular expression
     * is the same as any string in this array, Amazon Macie ignores it. The
     * array can contain as many as 10 ignore words. Each ignore word can
     * contain 4 - 90 characters.
     * </p>
     *
     * @param ignoreWords <p>
     *            An array that lists specific character sequences (ignore
     *            words) to exclude from the results. If the text matched by the
     *            regular expression is the same as any string in this array,
     *            Amazon Macie ignores it. The array can contain as many as 10
     *            ignore words. Each ignore word can contain 4 - 90 characters.
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
     * is the same as any string in this array, Amazon Macie ignores it. The
     * array can contain as many as 10 ignore words. Each ignore word can
     * contain 4 - 90 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ignoreWords <p>
     *            An array that lists specific character sequences (ignore
     *            words) to exclude from the results. If the text matched by the
     *            regular expression is the same as any string in this array,
     *            Amazon Macie ignores it. The array can contain as many as 10
     *            ignore words. Each ignore word can contain 4 - 90 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomDataIdentifierRequest withIgnoreWords(String... ignoreWords) {
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
     * is the same as any string in this array, Amazon Macie ignores it. The
     * array can contain as many as 10 ignore words. Each ignore word can
     * contain 4 - 90 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ignoreWords <p>
     *            An array that lists specific character sequences (ignore
     *            words) to exclude from the results. If the text matched by the
     *            regular expression is the same as any string in this array,
     *            Amazon Macie ignores it. The array can contain as many as 10
     *            ignore words. Each ignore word can contain 4 - 90 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomDataIdentifierRequest withIgnoreWords(
            java.util.Collection<String> ignoreWords) {
        setIgnoreWords(ignoreWords);
        return this;
    }

    /**
     * <p>
     * An array that lists specific character sequences (keywords), one of which
     * must be within proximity (maximumMatchDistance) of the regular expression
     * to match. The array can contain as many as 50 keywords. Each keyword can
     * contain 4 - 90 characters.
     * </p>
     *
     * @return <p>
     *         An array that lists specific character sequences (keywords), one
     *         of which must be within proximity (maximumMatchDistance) of the
     *         regular expression to match. The array can contain as many as 50
     *         keywords. Each keyword can contain 4 - 90 characters.
     *         </p>
     */
    public java.util.List<String> getKeywords() {
        return keywords;
    }

    /**
     * <p>
     * An array that lists specific character sequences (keywords), one of which
     * must be within proximity (maximumMatchDistance) of the regular expression
     * to match. The array can contain as many as 50 keywords. Each keyword can
     * contain 4 - 90 characters.
     * </p>
     *
     * @param keywords <p>
     *            An array that lists specific character sequences (keywords),
     *            one of which must be within proximity (maximumMatchDistance)
     *            of the regular expression to match. The array can contain as
     *            many as 50 keywords. Each keyword can contain 4 - 90
     *            characters.
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
     * to match. The array can contain as many as 50 keywords. Each keyword can
     * contain 4 - 90 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keywords <p>
     *            An array that lists specific character sequences (keywords),
     *            one of which must be within proximity (maximumMatchDistance)
     *            of the regular expression to match. The array can contain as
     *            many as 50 keywords. Each keyword can contain 4 - 90
     *            characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomDataIdentifierRequest withKeywords(String... keywords) {
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
     * to match. The array can contain as many as 50 keywords. Each keyword can
     * contain 4 - 90 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keywords <p>
     *            An array that lists specific character sequences (keywords),
     *            one of which must be within proximity (maximumMatchDistance)
     *            of the regular expression to match. The array can contain as
     *            many as 50 keywords. Each keyword can contain 4 - 90
     *            characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomDataIdentifierRequest withKeywords(java.util.Collection<String> keywords) {
        setKeywords(keywords);
        return this;
    }

    /**
     * <p>
     * The maximum number of characters that can exist between text that matches
     * the regex pattern and the character sequences specified by the keywords
     * array. Macie includes or excludes a result based on the proximity of a
     * keyword to text that matches the regex pattern. The distance can be 1 -
     * 300 characters. The default value is 300.
     * </p>
     *
     * @return <p>
     *         The maximum number of characters that can exist between text that
     *         matches the regex pattern and the character sequences specified
     *         by the keywords array. Macie includes or excludes a result based
     *         on the proximity of a keyword to text that matches the regex
     *         pattern. The distance can be 1 - 300 characters. The default
     *         value is 300.
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
     * keyword to text that matches the regex pattern. The distance can be 1 -
     * 300 characters. The default value is 300.
     * </p>
     *
     * @param maximumMatchDistance <p>
     *            The maximum number of characters that can exist between text
     *            that matches the regex pattern and the character sequences
     *            specified by the keywords array. Macie includes or excludes a
     *            result based on the proximity of a keyword to text that
     *            matches the regex pattern. The distance can be 1 - 300
     *            characters. The default value is 300.
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
     * keyword to text that matches the regex pattern. The distance can be 1 -
     * 300 characters. The default value is 300.
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
     *            matches the regex pattern. The distance can be 1 - 300
     *            characters. The default value is 300.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomDataIdentifierRequest withMaximumMatchDistance(Integer maximumMatchDistance) {
        this.maximumMatchDistance = maximumMatchDistance;
        return this;
    }

    /**
     * <p>
     * A custom name for the custom data identifier. The name can contain as
     * many as 120 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the
     * name of a custom data identifier. Other users of your account might be
     * able to see the identifier's name, depending on the actions that they're
     * allowed to perform in Amazon Macie.
     * </p>
     *
     * @return <p>
     *         A custom name for the custom data identifier. The name can
     *         contain as many as 120 characters.
     *         </p>
     *         <p>
     *         We strongly recommend that you avoid including any sensitive data
     *         in the name of a custom data identifier. Other users of your
     *         account might be able to see the identifier's name, depending on
     *         the actions that they're allowed to perform in Amazon Macie.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A custom name for the custom data identifier. The name can contain as
     * many as 120 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the
     * name of a custom data identifier. Other users of your account might be
     * able to see the identifier's name, depending on the actions that they're
     * allowed to perform in Amazon Macie.
     * </p>
     *
     * @param name <p>
     *            A custom name for the custom data identifier. The name can
     *            contain as many as 120 characters.
     *            </p>
     *            <p>
     *            We strongly recommend that you avoid including any sensitive
     *            data in the name of a custom data identifier. Other users of
     *            your account might be able to see the identifier's name,
     *            depending on the actions that they're allowed to perform in
     *            Amazon Macie.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A custom name for the custom data identifier. The name can contain as
     * many as 120 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the
     * name of a custom data identifier. Other users of your account might be
     * able to see the identifier's name, depending on the actions that they're
     * allowed to perform in Amazon Macie.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            A custom name for the custom data identifier. The name can
     *            contain as many as 120 characters.
     *            </p>
     *            <p>
     *            We strongly recommend that you avoid including any sensitive
     *            data in the name of a custom data identifier. Other users of
     *            your account might be able to see the identifier's name,
     *            depending on the actions that they're allowed to perform in
     *            Amazon Macie.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomDataIdentifierRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The regular expression (regex) that defines the pattern to match. The
     * expression can contain as many as 500 characters.
     * </p>
     *
     * @return <p>
     *         The regular expression (regex) that defines the pattern to match.
     *         The expression can contain as many as 500 characters.
     *         </p>
     */
    public String getRegex() {
        return regex;
    }

    /**
     * <p>
     * The regular expression (regex) that defines the pattern to match. The
     * expression can contain as many as 500 characters.
     * </p>
     *
     * @param regex <p>
     *            The regular expression (regex) that defines the pattern to
     *            match. The expression can contain as many as 500 characters.
     *            </p>
     */
    public void setRegex(String regex) {
        this.regex = regex;
    }

    /**
     * <p>
     * The regular expression (regex) that defines the pattern to match. The
     * expression can contain as many as 500 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regex <p>
     *            The regular expression (regex) that defines the pattern to
     *            match. The expression can contain as many as 500 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomDataIdentifierRequest withRegex(String regex) {
        this.regex = regex;
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the
     * custom data identifier.
     * </p>
     * <p>
     * A custom data identifier can have a maximum of 50 tags. Each tag consists
     * of a required tag key and an associated tag value. The maximum length of
     * a tag key is 128 characters. The maximum length of a tag value is 256
     * characters.
     * </p>
     *
     * @return <p>
     *         A map of key-value pairs that specifies the tags to associate
     *         with the custom data identifier.
     *         </p>
     *         <p>
     *         A custom data identifier can have a maximum of 50 tags. Each tag
     *         consists of a required tag key and an associated tag value. The
     *         maximum length of a tag key is 128 characters. The maximum length
     *         of a tag value is 256 characters.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the
     * custom data identifier.
     * </p>
     * <p>
     * A custom data identifier can have a maximum of 50 tags. Each tag consists
     * of a required tag key and an associated tag value. The maximum length of
     * a tag key is 128 characters. The maximum length of a tag value is 256
     * characters.
     * </p>
     *
     * @param tags <p>
     *            A map of key-value pairs that specifies the tags to associate
     *            with the custom data identifier.
     *            </p>
     *            <p>
     *            A custom data identifier can have a maximum of 50 tags. Each
     *            tag consists of a required tag key and an associated tag
     *            value. The maximum length of a tag key is 128 characters. The
     *            maximum length of a tag value is 256 characters.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the
     * custom data identifier.
     * </p>
     * <p>
     * A custom data identifier can have a maximum of 50 tags. Each tag consists
     * of a required tag key and an associated tag value. The maximum length of
     * a tag key is 128 characters. The maximum length of a tag value is 256
     * characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A map of key-value pairs that specifies the tags to associate
     *            with the custom data identifier.
     *            </p>
     *            <p>
     *            A custom data identifier can have a maximum of 50 tags. Each
     *            tag consists of a required tag key and an associated tag
     *            value. The maximum length of a tag key is 128 characters. The
     *            maximum length of a tag value is 256 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomDataIdentifierRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the
     * custom data identifier.
     * </p>
     * <p>
     * A custom data identifier can have a maximum of 50 tags. Each tag consists
     * of a required tag key and an associated tag value. The maximum length of
     * a tag key is 128 characters. The maximum length of a tag value is 256
     * characters.
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
    public CreateCustomDataIdentifierRequest addtagsEntry(String key, String value) {
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
    public CreateCustomDataIdentifierRequest cleartagsEntries() {
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
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
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

        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
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

        if (obj instanceof CreateCustomDataIdentifierRequest == false)
            return false;
        CreateCustomDataIdentifierRequest other = (CreateCustomDataIdentifierRequest) obj;

        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
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
