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

public class GetFindingsFilterResult implements Serializable {
    /**
     * <p>
     * The action that's performed on findings that meet the filter criteria
     * (findingCriteria). Possible values are: ARCHIVE, automatically archive
     * the findings; and, NOOP, don't perform any action on the findings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARCHIVE, NOOP
     */
    private String action;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the filter.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The custom description of the filter.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The criteria that's used to filter findings.
     * </p>
     */
    private FindingCriteria findingCriteria;

    /**
     * <p>
     * The unique identifier for the filter.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The custom name of the filter.
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
     * A map of key-value pairs that identifies the tags (keys and values) that
     * are associated with the filter.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The action that's performed on findings that meet the filter criteria
     * (findingCriteria). Possible values are: ARCHIVE, automatically archive
     * the findings; and, NOOP, don't perform any action on the findings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARCHIVE, NOOP
     *
     * @return <p>
     *         The action that's performed on findings that meet the filter
     *         criteria (findingCriteria). Possible values are: ARCHIVE,
     *         automatically archive the findings; and, NOOP, don't perform any
     *         action on the findings.
     *         </p>
     * @see FindingsFilterAction
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * The action that's performed on findings that meet the filter criteria
     * (findingCriteria). Possible values are: ARCHIVE, automatically archive
     * the findings; and, NOOP, don't perform any action on the findings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARCHIVE, NOOP
     *
     * @param action <p>
     *            The action that's performed on findings that meet the filter
     *            criteria (findingCriteria). Possible values are: ARCHIVE,
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
     * The action that's performed on findings that meet the filter criteria
     * (findingCriteria). Possible values are: ARCHIVE, automatically archive
     * the findings; and, NOOP, don't perform any action on the findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARCHIVE, NOOP
     *
     * @param action <p>
     *            The action that's performed on findings that meet the filter
     *            criteria (findingCriteria). Possible values are: ARCHIVE,
     *            automatically archive the findings; and, NOOP, don't perform
     *            any action on the findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingsFilterAction
     */
    public GetFindingsFilterResult withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * The action that's performed on findings that meet the filter criteria
     * (findingCriteria). Possible values are: ARCHIVE, automatically archive
     * the findings; and, NOOP, don't perform any action on the findings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARCHIVE, NOOP
     *
     * @param action <p>
     *            The action that's performed on findings that meet the filter
     *            criteria (findingCriteria). Possible values are: ARCHIVE,
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
     * The action that's performed on findings that meet the filter criteria
     * (findingCriteria). Possible values are: ARCHIVE, automatically archive
     * the findings; and, NOOP, don't perform any action on the findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARCHIVE, NOOP
     *
     * @param action <p>
     *            The action that's performed on findings that meet the filter
     *            criteria (findingCriteria). Possible values are: ARCHIVE,
     *            automatically archive the findings; and, NOOP, don't perform
     *            any action on the findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingsFilterAction
     */
    public GetFindingsFilterResult withAction(FindingsFilterAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the filter.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the filter.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the filter.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the filter.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingsFilterResult withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The custom description of the filter.
     * </p>
     *
     * @return <p>
     *         The custom description of the filter.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The custom description of the filter.
     * </p>
     *
     * @param description <p>
     *            The custom description of the filter.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The custom description of the filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The custom description of the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingsFilterResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The criteria that's used to filter findings.
     * </p>
     *
     * @return <p>
     *         The criteria that's used to filter findings.
     *         </p>
     */
    public FindingCriteria getFindingCriteria() {
        return findingCriteria;
    }

    /**
     * <p>
     * The criteria that's used to filter findings.
     * </p>
     *
     * @param findingCriteria <p>
     *            The criteria that's used to filter findings.
     *            </p>
     */
    public void setFindingCriteria(FindingCriteria findingCriteria) {
        this.findingCriteria = findingCriteria;
    }

    /**
     * <p>
     * The criteria that's used to filter findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingCriteria <p>
     *            The criteria that's used to filter findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingsFilterResult withFindingCriteria(FindingCriteria findingCriteria) {
        this.findingCriteria = findingCriteria;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the filter.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the filter.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier for the filter.
     * </p>
     *
     * @param id <p>
     *            The unique identifier for the filter.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique identifier for the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingsFilterResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The custom name of the filter.
     * </p>
     *
     * @return <p>
     *         The custom name of the filter.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The custom name of the filter.
     * </p>
     *
     * @param name <p>
     *            The custom name of the filter.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The custom name of the filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The custom name of the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingsFilterResult withName(String name) {
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
    public GetFindingsFilterResult withPosition(Integer position) {
        this.position = position;
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that
     * are associated with the filter.
     * </p>
     *
     * @return <p>
     *         A map of key-value pairs that identifies the tags (keys and
     *         values) that are associated with the filter.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that
     * are associated with the filter.
     * </p>
     *
     * @param tags <p>
     *            A map of key-value pairs that identifies the tags (keys and
     *            values) that are associated with the filter.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that
     * are associated with the filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A map of key-value pairs that identifies the tags (keys and
     *            values) that are associated with the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingsFilterResult withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that
     * are associated with the filter.
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
    public GetFindingsFilterResult addtagsEntry(String key, String value) {
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
    public GetFindingsFilterResult cleartagsEntries() {
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
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getFindingCriteria() != null)
            sb.append("findingCriteria: " + getFindingCriteria() + ",");
        if (getId() != null)
            sb.append("id: " + getId() + ",");
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
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getFindingCriteria() == null) ? 0 : getFindingCriteria().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
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

        if (obj instanceof GetFindingsFilterResult == false)
            return false;
        GetFindingsFilterResult other = (GetFindingsFilterResult) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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
