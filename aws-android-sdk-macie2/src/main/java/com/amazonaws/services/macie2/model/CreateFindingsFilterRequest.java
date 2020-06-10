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
 * Creates and defines the criteria and other settings for a findings filter.
 * </p>
 */
public class CreateFindingsFilterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The action to perform on findings that meet the filter criteria
     * (findingCriteria). Valid values are: ARCHIVE, automatically archive the
     * findings; and, NOOP, don't perform any action on the findings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARCHIVE, NOOP
     */
    private String action;

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency
     * of the request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * A custom description of the filter. The description can contain as many
     * as 512 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the
     * description of a filter. Other users of your account might be able to see
     * the filter's description, depending on the actions that they're allowed
     * to perform in Amazon Macie.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The criteria to use to filter findings.
     * </p>
     */
    private FindingCriteria findingCriteria;

    /**
     * <p>
     * A custom name for the filter. The name must contain at least 3 characters
     * and can contain as many as 64 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the
     * name of a filter. Other users of your account might be able to see the
     * filter's name, depending on the actions that they're allowed to perform
     * in Amazon Macie.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The position of the filter in the list of saved filters on the Amazon
     * Macie console. This value also determines the order in which the filter
     * is applied to findings, relative to other filters that are also applied
     * to the findings.
     * </p>
     */
    private Integer position;

    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the
     * filter.
     * </p>
     * <p>
     * A findings filter can have a maximum of 50 tags. Each tag consists of a
     * required tag key and an associated tag value. The maximum length of a tag
     * key is 128 characters. The maximum length of a tag value is 256
     * characters.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The action to perform on findings that meet the filter criteria
     * (findingCriteria). Valid values are: ARCHIVE, automatically archive the
     * findings; and, NOOP, don't perform any action on the findings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARCHIVE, NOOP
     *
     * @return <p>
     *         The action to perform on findings that meet the filter criteria
     *         (findingCriteria). Valid values are: ARCHIVE, automatically
     *         archive the findings; and, NOOP, don't perform any action on the
     *         findings.
     *         </p>
     * @see FindingsFilterAction
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * The action to perform on findings that meet the filter criteria
     * (findingCriteria). Valid values are: ARCHIVE, automatically archive the
     * findings; and, NOOP, don't perform any action on the findings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARCHIVE, NOOP
     *
     * @param action <p>
     *            The action to perform on findings that meet the filter
     *            criteria (findingCriteria). Valid values are: ARCHIVE,
     *            automatically archive the findings; and, NOOP, don't perform
     *            any action on the findings.
     *            </p>
     * @see FindingsFilterAction
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action to perform on findings that meet the filter criteria
     * (findingCriteria). Valid values are: ARCHIVE, automatically archive the
     * findings; and, NOOP, don't perform any action on the findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARCHIVE, NOOP
     *
     * @param action <p>
     *            The action to perform on findings that meet the filter
     *            criteria (findingCriteria). Valid values are: ARCHIVE,
     *            automatically archive the findings; and, NOOP, don't perform
     *            any action on the findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingsFilterAction
     */
    public CreateFindingsFilterRequest withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * The action to perform on findings that meet the filter criteria
     * (findingCriteria). Valid values are: ARCHIVE, automatically archive the
     * findings; and, NOOP, don't perform any action on the findings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARCHIVE, NOOP
     *
     * @param action <p>
     *            The action to perform on findings that meet the filter
     *            criteria (findingCriteria). Valid values are: ARCHIVE,
     *            automatically archive the findings; and, NOOP, don't perform
     *            any action on the findings.
     *            </p>
     * @see FindingsFilterAction
     */
    public void setAction(FindingsFilterAction action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * The action to perform on findings that meet the filter criteria
     * (findingCriteria). Valid values are: ARCHIVE, automatically archive the
     * findings; and, NOOP, don't perform any action on the findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARCHIVE, NOOP
     *
     * @param action <p>
     *            The action to perform on findings that meet the filter
     *            criteria (findingCriteria). Valid values are: ARCHIVE,
     *            automatically archive the findings; and, NOOP, don't perform
     *            any action on the findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingsFilterAction
     */
    public CreateFindingsFilterRequest withAction(FindingsFilterAction action) {
        this.action = action.toString();
        return this;
    }

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
    public CreateFindingsFilterRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * A custom description of the filter. The description can contain as many
     * as 512 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the
     * description of a filter. Other users of your account might be able to see
     * the filter's description, depending on the actions that they're allowed
     * to perform in Amazon Macie.
     * </p>
     *
     * @return <p>
     *         A custom description of the filter. The description can contain
     *         as many as 512 characters.
     *         </p>
     *         <p>
     *         We strongly recommend that you avoid including any sensitive data
     *         in the description of a filter. Other users of your account might
     *         be able to see the filter's description, depending on the actions
     *         that they're allowed to perform in Amazon Macie.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A custom description of the filter. The description can contain as many
     * as 512 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the
     * description of a filter. Other users of your account might be able to see
     * the filter's description, depending on the actions that they're allowed
     * to perform in Amazon Macie.
     * </p>
     *
     * @param description <p>
     *            A custom description of the filter. The description can
     *            contain as many as 512 characters.
     *            </p>
     *            <p>
     *            We strongly recommend that you avoid including any sensitive
     *            data in the description of a filter. Other users of your
     *            account might be able to see the filter's description,
     *            depending on the actions that they're allowed to perform in
     *            Amazon Macie.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A custom description of the filter. The description can contain as many
     * as 512 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the
     * description of a filter. Other users of your account might be able to see
     * the filter's description, depending on the actions that they're allowed
     * to perform in Amazon Macie.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A custom description of the filter. The description can
     *            contain as many as 512 characters.
     *            </p>
     *            <p>
     *            We strongly recommend that you avoid including any sensitive
     *            data in the description of a filter. Other users of your
     *            account might be able to see the filter's description,
     *            depending on the actions that they're allowed to perform in
     *            Amazon Macie.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFindingsFilterRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The criteria to use to filter findings.
     * </p>
     *
     * @return <p>
     *         The criteria to use to filter findings.
     *         </p>
     */
    public FindingCriteria getFindingCriteria() {
        return findingCriteria;
    }

    /**
     * <p>
     * The criteria to use to filter findings.
     * </p>
     *
     * @param findingCriteria <p>
     *            The criteria to use to filter findings.
     *            </p>
     */
    public void setFindingCriteria(FindingCriteria findingCriteria) {
        this.findingCriteria = findingCriteria;
    }

    /**
     * <p>
     * The criteria to use to filter findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingCriteria <p>
     *            The criteria to use to filter findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFindingsFilterRequest withFindingCriteria(FindingCriteria findingCriteria) {
        this.findingCriteria = findingCriteria;
        return this;
    }

    /**
     * <p>
     * A custom name for the filter. The name must contain at least 3 characters
     * and can contain as many as 64 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the
     * name of a filter. Other users of your account might be able to see the
     * filter's name, depending on the actions that they're allowed to perform
     * in Amazon Macie.
     * </p>
     *
     * @return <p>
     *         A custom name for the filter. The name must contain at least 3
     *         characters and can contain as many as 64 characters.
     *         </p>
     *         <p>
     *         We strongly recommend that you avoid including any sensitive data
     *         in the name of a filter. Other users of your account might be
     *         able to see the filter's name, depending on the actions that
     *         they're allowed to perform in Amazon Macie.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A custom name for the filter. The name must contain at least 3 characters
     * and can contain as many as 64 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the
     * name of a filter. Other users of your account might be able to see the
     * filter's name, depending on the actions that they're allowed to perform
     * in Amazon Macie.
     * </p>
     *
     * @param name <p>
     *            A custom name for the filter. The name must contain at least 3
     *            characters and can contain as many as 64 characters.
     *            </p>
     *            <p>
     *            We strongly recommend that you avoid including any sensitive
     *            data in the name of a filter. Other users of your account
     *            might be able to see the filter's name, depending on the
     *            actions that they're allowed to perform in Amazon Macie.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A custom name for the filter. The name must contain at least 3 characters
     * and can contain as many as 64 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the
     * name of a filter. Other users of your account might be able to see the
     * filter's name, depending on the actions that they're allowed to perform
     * in Amazon Macie.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            A custom name for the filter. The name must contain at least 3
     *            characters and can contain as many as 64 characters.
     *            </p>
     *            <p>
     *            We strongly recommend that you avoid including any sensitive
     *            data in the name of a filter. Other users of your account
     *            might be able to see the filter's name, depending on the
     *            actions that they're allowed to perform in Amazon Macie.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFindingsFilterRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The position of the filter in the list of saved filters on the Amazon
     * Macie console. This value also determines the order in which the filter
     * is applied to findings, relative to other filters that are also applied
     * to the findings.
     * </p>
     *
     * @return <p>
     *         The position of the filter in the list of saved filters on the
     *         Amazon Macie console. This value also determines the order in
     *         which the filter is applied to findings, relative to other
     *         filters that are also applied to the findings.
     *         </p>
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * <p>
     * The position of the filter in the list of saved filters on the Amazon
     * Macie console. This value also determines the order in which the filter
     * is applied to findings, relative to other filters that are also applied
     * to the findings.
     * </p>
     *
     * @param position <p>
     *            The position of the filter in the list of saved filters on the
     *            Amazon Macie console. This value also determines the order in
     *            which the filter is applied to findings, relative to other
     *            filters that are also applied to the findings.
     *            </p>
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * <p>
     * The position of the filter in the list of saved filters on the Amazon
     * Macie console. This value also determines the order in which the filter
     * is applied to findings, relative to other filters that are also applied
     * to the findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param position <p>
     *            The position of the filter in the list of saved filters on the
     *            Amazon Macie console. This value also determines the order in
     *            which the filter is applied to findings, relative to other
     *            filters that are also applied to the findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFindingsFilterRequest withPosition(Integer position) {
        this.position = position;
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the
     * filter.
     * </p>
     * <p>
     * A findings filter can have a maximum of 50 tags. Each tag consists of a
     * required tag key and an associated tag value. The maximum length of a tag
     * key is 128 characters. The maximum length of a tag value is 256
     * characters.
     * </p>
     *
     * @return <p>
     *         A map of key-value pairs that specifies the tags to associate
     *         with the filter.
     *         </p>
     *         <p>
     *         A findings filter can have a maximum of 50 tags. Each tag
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
     * filter.
     * </p>
     * <p>
     * A findings filter can have a maximum of 50 tags. Each tag consists of a
     * required tag key and an associated tag value. The maximum length of a tag
     * key is 128 characters. The maximum length of a tag value is 256
     * characters.
     * </p>
     *
     * @param tags <p>
     *            A map of key-value pairs that specifies the tags to associate
     *            with the filter.
     *            </p>
     *            <p>
     *            A findings filter can have a maximum of 50 tags. Each tag
     *            consists of a required tag key and an associated tag value.
     *            The maximum length of a tag key is 128 characters. The maximum
     *            length of a tag value is 256 characters.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the
     * filter.
     * </p>
     * <p>
     * A findings filter can have a maximum of 50 tags. Each tag consists of a
     * required tag key and an associated tag value. The maximum length of a tag
     * key is 128 characters. The maximum length of a tag value is 256
     * characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A map of key-value pairs that specifies the tags to associate
     *            with the filter.
     *            </p>
     *            <p>
     *            A findings filter can have a maximum of 50 tags. Each tag
     *            consists of a required tag key and an associated tag value.
     *            The maximum length of a tag key is 128 characters. The maximum
     *            length of a tag value is 256 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFindingsFilterRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the
     * filter.
     * </p>
     * <p>
     * A findings filter can have a maximum of 50 tags. Each tag consists of a
     * required tag key and an associated tag value. The maximum length of a tag
     * key is 128 characters. The maximum length of a tag value is 256
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
    public CreateFindingsFilterRequest addtagsEntry(String key, String value) {
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
    public CreateFindingsFilterRequest cleartagsEntries() {
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
        if (getAction() != null)
            sb.append("action: " + getAction() + ",");
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getFindingCriteria() != null)
            sb.append("findingCriteria: " + getFindingCriteria() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getPosition() != null)
            sb.append("position: " + getPosition() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getFindingCriteria() == null) ? 0 : getFindingCriteria().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFindingsFilterRequest == false)
            return false;
        CreateFindingsFilterRequest other = (CreateFindingsFilterRequest) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
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
        if (other.getFindingCriteria() == null ^ this.getFindingCriteria() == null)
            return false;
        if (other.getFindingCriteria() != null
                && other.getFindingCriteria().equals(this.getFindingCriteria()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
