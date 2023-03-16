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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

/**
 * <p>
 * Provides you with the properties of the Call Analytics category you specified
 * in your request. This includes the list of rules that define the specified
 * category.
 * </p>
 */
public class CategoryProperties implements Serializable {
    /**
     * <p>
     * The name of the Call Analytics category. Category names are case
     * sensitive and must be unique within an Amazon Web Services account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String categoryName;

    /**
     * <p>
     * The rules used to define a Call Analytics category. Each category can
     * have between 1 and 20 rules.
     * </p>
     */
    private java.util.List<Rule> rules;

    /**
     * <p>
     * The date and time the specified Call Analytics category was created.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7
     * on May 4, 2022.
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * The date and time the specified Call Analytics category was last updated.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-05T12:45:32.691000-07:00</code> represents 12:45 PM UTC-7
     * on May 5, 2022.
     * </p>
     */
    private java.util.Date lastUpdateTime;

    /**
     * <p>
     * The input type associated with the specified category.
     * <code>POST_CALL</code> refers to a category that is applied to batch
     * transcriptions; <code>REAL_TIME</code> refers to a category that is
     * applied to streaming transcriptions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REAL_TIME, POST_CALL
     */
    private String inputType;

    /**
     * <p>
     * The name of the Call Analytics category. Category names are case
     * sensitive and must be unique within an Amazon Web Services account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the Call Analytics category. Category names are case
     *         sensitive and must be unique within an Amazon Web Services
     *         account.
     *         </p>
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * <p>
     * The name of the Call Analytics category. Category names are case
     * sensitive and must be unique within an Amazon Web Services account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param categoryName <p>
     *            The name of the Call Analytics category. Category names are
     *            case sensitive and must be unique within an Amazon Web
     *            Services account.
     *            </p>
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * <p>
     * The name of the Call Analytics category. Category names are case
     * sensitive and must be unique within an Amazon Web Services account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param categoryName <p>
     *            The name of the Call Analytics category. Category names are
     *            case sensitive and must be unique within an Amazon Web
     *            Services account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CategoryProperties withCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    /**
     * <p>
     * The rules used to define a Call Analytics category. Each category can
     * have between 1 and 20 rules.
     * </p>
     *
     * @return <p>
     *         The rules used to define a Call Analytics category. Each category
     *         can have between 1 and 20 rules.
     *         </p>
     */
    public java.util.List<Rule> getRules() {
        return rules;
    }

    /**
     * <p>
     * The rules used to define a Call Analytics category. Each category can
     * have between 1 and 20 rules.
     * </p>
     *
     * @param rules <p>
     *            The rules used to define a Call Analytics category. Each
     *            category can have between 1 and 20 rules.
     *            </p>
     */
    public void setRules(java.util.Collection<Rule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<Rule>(rules);
    }

    /**
     * <p>
     * The rules used to define a Call Analytics category. Each category can
     * have between 1 and 20 rules.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            The rules used to define a Call Analytics category. Each
     *            category can have between 1 and 20 rules.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CategoryProperties withRules(Rule... rules) {
        if (getRules() == null) {
            this.rules = new java.util.ArrayList<Rule>(rules.length);
        }
        for (Rule value : rules) {
            this.rules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The rules used to define a Call Analytics category. Each category can
     * have between 1 and 20 rules.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            The rules used to define a Call Analytics category. Each
     *            category can have between 1 and 20 rules.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CategoryProperties withRules(java.util.Collection<Rule> rules) {
        setRules(rules);
        return this;
    }

    /**
     * <p>
     * The date and time the specified Call Analytics category was created.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7
     * on May 4, 2022.
     * </p>
     *
     * @return <p>
     *         The date and time the specified Call Analytics category was
     *         created.
     *         </p>
     *         <p>
     *         Timestamps are in the format
     *         <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *         <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM
     *         UTC-7 on May 4, 2022.
     *         </p>
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * <p>
     * The date and time the specified Call Analytics category was created.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7
     * on May 4, 2022.
     * </p>
     *
     * @param createTime <p>
     *            The date and time the specified Call Analytics category was
     *            created.
     *            </p>
     *            <p>
     *            Timestamps are in the format
     *            <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *            <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32
     *            PM UTC-7 on May 4, 2022.
     *            </p>
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The date and time the specified Call Analytics category was created.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7
     * on May 4, 2022.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTime <p>
     *            The date and time the specified Call Analytics category was
     *            created.
     *            </p>
     *            <p>
     *            Timestamps are in the format
     *            <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *            <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32
     *            PM UTC-7 on May 4, 2022.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CategoryProperties withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * <p>
     * The date and time the specified Call Analytics category was last updated.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-05T12:45:32.691000-07:00</code> represents 12:45 PM UTC-7
     * on May 5, 2022.
     * </p>
     *
     * @return <p>
     *         The date and time the specified Call Analytics category was last
     *         updated.
     *         </p>
     *         <p>
     *         Timestamps are in the format
     *         <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *         <code>2022-05-05T12:45:32.691000-07:00</code> represents 12:45 PM
     *         UTC-7 on May 5, 2022.
     *         </p>
     */
    public java.util.Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * <p>
     * The date and time the specified Call Analytics category was last updated.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-05T12:45:32.691000-07:00</code> represents 12:45 PM UTC-7
     * on May 5, 2022.
     * </p>
     *
     * @param lastUpdateTime <p>
     *            The date and time the specified Call Analytics category was
     *            last updated.
     *            </p>
     *            <p>
     *            Timestamps are in the format
     *            <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *            <code>2022-05-05T12:45:32.691000-07:00</code> represents 12:45
     *            PM UTC-7 on May 5, 2022.
     *            </p>
     */
    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The date and time the specified Call Analytics category was last updated.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-05T12:45:32.691000-07:00</code> represents 12:45 PM UTC-7
     * on May 5, 2022.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdateTime <p>
     *            The date and time the specified Call Analytics category was
     *            last updated.
     *            </p>
     *            <p>
     *            Timestamps are in the format
     *            <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *            <code>2022-05-05T12:45:32.691000-07:00</code> represents 12:45
     *            PM UTC-7 on May 5, 2022.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CategoryProperties withLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * <p>
     * The input type associated with the specified category.
     * <code>POST_CALL</code> refers to a category that is applied to batch
     * transcriptions; <code>REAL_TIME</code> refers to a category that is
     * applied to streaming transcriptions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REAL_TIME, POST_CALL
     *
     * @return <p>
     *         The input type associated with the specified category.
     *         <code>POST_CALL</code> refers to a category that is applied to
     *         batch transcriptions; <code>REAL_TIME</code> refers to a category
     *         that is applied to streaming transcriptions.
     *         </p>
     * @see InputType
     */
    public String getInputType() {
        return inputType;
    }

    /**
     * <p>
     * The input type associated with the specified category.
     * <code>POST_CALL</code> refers to a category that is applied to batch
     * transcriptions; <code>REAL_TIME</code> refers to a category that is
     * applied to streaming transcriptions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REAL_TIME, POST_CALL
     *
     * @param inputType <p>
     *            The input type associated with the specified category.
     *            <code>POST_CALL</code> refers to a category that is applied to
     *            batch transcriptions; <code>REAL_TIME</code> refers to a
     *            category that is applied to streaming transcriptions.
     *            </p>
     * @see InputType
     */
    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    /**
     * <p>
     * The input type associated with the specified category.
     * <code>POST_CALL</code> refers to a category that is applied to batch
     * transcriptions; <code>REAL_TIME</code> refers to a category that is
     * applied to streaming transcriptions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REAL_TIME, POST_CALL
     *
     * @param inputType <p>
     *            The input type associated with the specified category.
     *            <code>POST_CALL</code> refers to a category that is applied to
     *            batch transcriptions; <code>REAL_TIME</code> refers to a
     *            category that is applied to streaming transcriptions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputType
     */
    public CategoryProperties withInputType(String inputType) {
        this.inputType = inputType;
        return this;
    }

    /**
     * <p>
     * The input type associated with the specified category.
     * <code>POST_CALL</code> refers to a category that is applied to batch
     * transcriptions; <code>REAL_TIME</code> refers to a category that is
     * applied to streaming transcriptions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REAL_TIME, POST_CALL
     *
     * @param inputType <p>
     *            The input type associated with the specified category.
     *            <code>POST_CALL</code> refers to a category that is applied to
     *            batch transcriptions; <code>REAL_TIME</code> refers to a
     *            category that is applied to streaming transcriptions.
     *            </p>
     * @see InputType
     */
    public void setInputType(InputType inputType) {
        this.inputType = inputType.toString();
    }

    /**
     * <p>
     * The input type associated with the specified category.
     * <code>POST_CALL</code> refers to a category that is applied to batch
     * transcriptions; <code>REAL_TIME</code> refers to a category that is
     * applied to streaming transcriptions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REAL_TIME, POST_CALL
     *
     * @param inputType <p>
     *            The input type associated with the specified category.
     *            <code>POST_CALL</code> refers to a category that is applied to
     *            batch transcriptions; <code>REAL_TIME</code> refers to a
     *            category that is applied to streaming transcriptions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputType
     */
    public CategoryProperties withInputType(InputType inputType) {
        this.inputType = inputType.toString();
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
        if (getCategoryName() != null)
            sb.append("CategoryName: " + getCategoryName() + ",");
        if (getRules() != null)
            sb.append("Rules: " + getRules() + ",");
        if (getCreateTime() != null)
            sb.append("CreateTime: " + getCreateTime() + ",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: " + getLastUpdateTime() + ",");
        if (getInputType() != null)
            sb.append("InputType: " + getInputType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCategoryName() == null) ? 0 : getCategoryName().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getInputType() == null) ? 0 : getInputType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CategoryProperties == false)
            return false;
        CategoryProperties other = (CategoryProperties) obj;

        if (other.getCategoryName() == null ^ this.getCategoryName() == null)
            return false;
        if (other.getCategoryName() != null
                && other.getCategoryName().equals(this.getCategoryName()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null
                && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null
                && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        if (other.getInputType() == null ^ this.getInputType() == null)
            return false;
        if (other.getInputType() != null
                && other.getInputType().equals(this.getInputType()) == false)
            return false;
        return true;
    }
}
