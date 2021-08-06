/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class ListCallAnalyticsCategoriesResult implements Serializable {
    /**
     * <p>
     * The operation returns a page of jobs at a time. The maximum size of the
     * list is set by the <code>MaxResults</code> parameter. If there are more
     * categories in the list than the page size, Amazon Transcribe returns the
     * <code>NextPage</code> token. Include the token in the next request to the
     * operation to return the next page of analytics categories.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of objects containing information about analytics categories.
     * </p>
     */
    private java.util.List<CategoryProperties> categories;

    /**
     * <p>
     * The operation returns a page of jobs at a time. The maximum size of the
     * list is set by the <code>MaxResults</code> parameter. If there are more
     * categories in the list than the page size, Amazon Transcribe returns the
     * <code>NextPage</code> token. Include the token in the next request to the
     * operation to return the next page of analytics categories.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         The operation returns a page of jobs at a time. The maximum size
     *         of the list is set by the <code>MaxResults</code> parameter. If
     *         there are more categories in the list than the page size, Amazon
     *         Transcribe returns the <code>NextPage</code> token. Include the
     *         token in the next request to the operation to return the next
     *         page of analytics categories.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The operation returns a page of jobs at a time. The maximum size of the
     * list is set by the <code>MaxResults</code> parameter. If there are more
     * categories in the list than the page size, Amazon Transcribe returns the
     * <code>NextPage</code> token. Include the token in the next request to the
     * operation to return the next page of analytics categories.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param nextToken <p>
     *            The operation returns a page of jobs at a time. The maximum
     *            size of the list is set by the <code>MaxResults</code>
     *            parameter. If there are more categories in the list than the
     *            page size, Amazon Transcribe returns the <code>NextPage</code>
     *            token. Include the token in the next request to the operation
     *            to return the next page of analytics categories.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The operation returns a page of jobs at a time. The maximum size of the
     * list is set by the <code>MaxResults</code> parameter. If there are more
     * categories in the list than the page size, Amazon Transcribe returns the
     * <code>NextPage</code> token. Include the token in the next request to the
     * operation to return the next page of analytics categories.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param nextToken <p>
     *            The operation returns a page of jobs at a time. The maximum
     *            size of the list is set by the <code>MaxResults</code>
     *            parameter. If there are more categories in the list than the
     *            page size, Amazon Transcribe returns the <code>NextPage</code>
     *            token. Include the token in the next request to the operation
     *            to return the next page of analytics categories.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCallAnalyticsCategoriesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * A list of objects containing information about analytics categories.
     * </p>
     *
     * @return <p>
     *         A list of objects containing information about analytics
     *         categories.
     *         </p>
     */
    public java.util.List<CategoryProperties> getCategories() {
        return categories;
    }

    /**
     * <p>
     * A list of objects containing information about analytics categories.
     * </p>
     *
     * @param categories <p>
     *            A list of objects containing information about analytics
     *            categories.
     *            </p>
     */
    public void setCategories(java.util.Collection<CategoryProperties> categories) {
        if (categories == null) {
            this.categories = null;
            return;
        }

        this.categories = new java.util.ArrayList<CategoryProperties>(categories);
    }

    /**
     * <p>
     * A list of objects containing information about analytics categories.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param categories <p>
     *            A list of objects containing information about analytics
     *            categories.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCallAnalyticsCategoriesResult withCategories(CategoryProperties... categories) {
        if (getCategories() == null) {
            this.categories = new java.util.ArrayList<CategoryProperties>(categories.length);
        }
        for (CategoryProperties value : categories) {
            this.categories.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects containing information about analytics categories.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param categories <p>
     *            A list of objects containing information about analytics
     *            categories.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCallAnalyticsCategoriesResult withCategories(
            java.util.Collection<CategoryProperties> categories) {
        setCategories(categories);
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getCategories() != null)
            sb.append("Categories: " + getCategories());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getCategories() == null) ? 0 : getCategories().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCallAnalyticsCategoriesResult == false)
            return false;
        ListCallAnalyticsCategoriesResult other = (ListCallAnalyticsCategoriesResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getCategories() == null ^ this.getCategories() == null)
            return false;
        if (other.getCategories() != null
                && other.getCategories().equals(this.getCategories()) == false)
            return false;
        return true;
    }
}
