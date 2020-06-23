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

package com.amazonaws.services.organizations.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists all of the organizational units (OUs) or accounts that are contained in
 * the specified parent OU or root. This operation, along with
 * <a>ListParents</a> enables you to traverse the tree structure that makes up
 * this root.
 * </p>
 * <note>
 * <p>
 * Always check the <code>NextToken</code> response parameter for a
 * <code>null</code> value when calling a <code>List*</code> operation. These
 * operations can occasionally return an empty set of results even when there
 * are more results available. The <code>NextToken</code> response parameter
 * value is <code>null</code> <i>only</i> when there are no more results to
 * display.
 * </p>
 * </note>
 * <p>
 * This operation can be called only from the organization's master account or
 * by a member account that is a delegated administrator for an AWS service.
 * </p>
 */
public class ListChildrenRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier (ID) for the parent root or OU whose children you
     * want to list.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * parent ID string requires one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Root</b> - A string that begins with "r-" followed by from 4 to 32
     * lowercase letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Organizational unit (OU)</b> - A string that begins with "ou-"
     * followed by from 4 to 32 lowercase letters or digits (the ID of the root
     * that the OU is in). This string is followed by a second "-" dash and from
     * 8 to 32 additional lowercase letters or digits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(r-[0-9a-z]{4,32})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$
     * <br/>
     */
    private String parentId;

    /**
     * <p>
     * Filters the output to include only the specified child type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATIONAL_UNIT
     */
    private String childType;

    /**
     * <p>
     * The parameter for receiving additional results if you receive a
     * <code>NextToken</code> response in a previous request. A
     * <code>NextToken</code> response indicates that more output is available.
     * Set this parameter to the value of the previous call's
     * <code>NextToken</code> response to indicate where the output should
     * continue from.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The total number of results that you want included on each page of the
     * response. If you do not include this parameter, it defaults to a value
     * that is specific to the operation. If additional items exist beyond the
     * maximum you specify, the <code>NextToken</code> response element is
     * present and has a value (is not null). Include that value as the
     * <code>NextToken</code> request parameter in the next call to the
     * operation to get the next part of the results. Note that Organizations
     * might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every
     * operation to ensure that you receive all of the results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The unique identifier (ID) for the parent root or OU whose children you
     * want to list.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * parent ID string requires one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Root</b> - A string that begins with "r-" followed by from 4 to 32
     * lowercase letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Organizational unit (OU)</b> - A string that begins with "ou-"
     * followed by from 4 to 32 lowercase letters or digits (the ID of the root
     * that the OU is in). This string is followed by a second "-" dash and from
     * 8 to 32 additional lowercase letters or digits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(r-[0-9a-z]{4,32})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$
     * <br/>
     *
     * @return <p>
     *         The unique identifier (ID) for the parent root or OU whose
     *         children you want to list.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         for a parent ID string requires one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Root</b> - A string that begins with "r-" followed by from 4
     *         to 32 lowercase letters or digits.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Organizational unit (OU)</b> - A string that begins with "ou-"
     *         followed by from 4 to 32 lowercase letters or digits (the ID of
     *         the root that the OU is in). This string is followed by a second
     *         "-" dash and from 8 to 32 additional lowercase letters or digits.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * <p>
     * The unique identifier (ID) for the parent root or OU whose children you
     * want to list.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * parent ID string requires one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Root</b> - A string that begins with "r-" followed by from 4 to 32
     * lowercase letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Organizational unit (OU)</b> - A string that begins with "ou-"
     * followed by from 4 to 32 lowercase letters or digits (the ID of the root
     * that the OU is in). This string is followed by a second "-" dash and from
     * 8 to 32 additional lowercase letters or digits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(r-[0-9a-z]{4,32})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$
     * <br/>
     *
     * @param parentId <p>
     *            The unique identifier (ID) for the parent root or OU whose
     *            children you want to list.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for a parent ID string requires one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Root</b> - A string that begins with "r-" followed by from
     *            4 to 32 lowercase letters or digits.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Organizational unit (OU)</b> - A string that begins with
     *            "ou-" followed by from 4 to 32 lowercase letters or digits
     *            (the ID of the root that the OU is in). This string is
     *            followed by a second "-" dash and from 8 to 32 additional
     *            lowercase letters or digits.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * <p>
     * The unique identifier (ID) for the parent root or OU whose children you
     * want to list.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * parent ID string requires one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Root</b> - A string that begins with "r-" followed by from 4 to 32
     * lowercase letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Organizational unit (OU)</b> - A string that begins with "ou-"
     * followed by from 4 to 32 lowercase letters or digits (the ID of the root
     * that the OU is in). This string is followed by a second "-" dash and from
     * 8 to 32 additional lowercase letters or digits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(r-[0-9a-z]{4,32})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$
     * <br/>
     *
     * @param parentId <p>
     *            The unique identifier (ID) for the parent root or OU whose
     *            children you want to list.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for a parent ID string requires one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Root</b> - A string that begins with "r-" followed by from
     *            4 to 32 lowercase letters or digits.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Organizational unit (OU)</b> - A string that begins with
     *            "ou-" followed by from 4 to 32 lowercase letters or digits
     *            (the ID of the root that the OU is in). This string is
     *            followed by a second "-" dash and from 8 to 32 additional
     *            lowercase letters or digits.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChildrenRequest withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * <p>
     * Filters the output to include only the specified child type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATIONAL_UNIT
     *
     * @return <p>
     *         Filters the output to include only the specified child type.
     *         </p>
     * @see ChildType
     */
    public String getChildType() {
        return childType;
    }

    /**
     * <p>
     * Filters the output to include only the specified child type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATIONAL_UNIT
     *
     * @param childType <p>
     *            Filters the output to include only the specified child type.
     *            </p>
     * @see ChildType
     */
    public void setChildType(String childType) {
        this.childType = childType;
    }

    /**
     * <p>
     * Filters the output to include only the specified child type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATIONAL_UNIT
     *
     * @param childType <p>
     *            Filters the output to include only the specified child type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChildType
     */
    public ListChildrenRequest withChildType(String childType) {
        this.childType = childType;
        return this;
    }

    /**
     * <p>
     * Filters the output to include only the specified child type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATIONAL_UNIT
     *
     * @param childType <p>
     *            Filters the output to include only the specified child type.
     *            </p>
     * @see ChildType
     */
    public void setChildType(ChildType childType) {
        this.childType = childType.toString();
    }

    /**
     * <p>
     * Filters the output to include only the specified child type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATIONAL_UNIT
     *
     * @param childType <p>
     *            Filters the output to include only the specified child type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChildType
     */
    public ListChildrenRequest withChildType(ChildType childType) {
        this.childType = childType.toString();
        return this;
    }

    /**
     * <p>
     * The parameter for receiving additional results if you receive a
     * <code>NextToken</code> response in a previous request. A
     * <code>NextToken</code> response indicates that more output is available.
     * Set this parameter to the value of the previous call's
     * <code>NextToken</code> response to indicate where the output should
     * continue from.
     * </p>
     *
     * @return <p>
     *         The parameter for receiving additional results if you receive a
     *         <code>NextToken</code> response in a previous request. A
     *         <code>NextToken</code> response indicates that more output is
     *         available. Set this parameter to the value of the previous call's
     *         <code>NextToken</code> response to indicate where the output
     *         should continue from.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The parameter for receiving additional results if you receive a
     * <code>NextToken</code> response in a previous request. A
     * <code>NextToken</code> response indicates that more output is available.
     * Set this parameter to the value of the previous call's
     * <code>NextToken</code> response to indicate where the output should
     * continue from.
     * </p>
     *
     * @param nextToken <p>
     *            The parameter for receiving additional results if you receive
     *            a <code>NextToken</code> response in a previous request. A
     *            <code>NextToken</code> response indicates that more output is
     *            available. Set this parameter to the value of the previous
     *            call's <code>NextToken</code> response to indicate where the
     *            output should continue from.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The parameter for receiving additional results if you receive a
     * <code>NextToken</code> response in a previous request. A
     * <code>NextToken</code> response indicates that more output is available.
     * Set this parameter to the value of the previous call's
     * <code>NextToken</code> response to indicate where the output should
     * continue from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The parameter for receiving additional results if you receive
     *            a <code>NextToken</code> response in a previous request. A
     *            <code>NextToken</code> response indicates that more output is
     *            available. Set this parameter to the value of the previous
     *            call's <code>NextToken</code> response to indicate where the
     *            output should continue from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChildrenRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The total number of results that you want included on each page of the
     * response. If you do not include this parameter, it defaults to a value
     * that is specific to the operation. If additional items exist beyond the
     * maximum you specify, the <code>NextToken</code> response element is
     * present and has a value (is not null). Include that value as the
     * <code>NextToken</code> request parameter in the next call to the
     * operation to get the next part of the results. Note that Organizations
     * might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every
     * operation to ensure that you receive all of the results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @return <p>
     *         The total number of results that you want included on each page
     *         of the response. If you do not include this parameter, it
     *         defaults to a value that is specific to the operation. If
     *         additional items exist beyond the maximum you specify, the
     *         <code>NextToken</code> response element is present and has a
     *         value (is not null). Include that value as the
     *         <code>NextToken</code> request parameter in the next call to the
     *         operation to get the next part of the results. Note that
     *         Organizations might return fewer results than the maximum even
     *         when there are more results available. You should check
     *         <code>NextToken</code> after every operation to ensure that you
     *         receive all of the results.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The total number of results that you want included on each page of the
     * response. If you do not include this parameter, it defaults to a value
     * that is specific to the operation. If additional items exist beyond the
     * maximum you specify, the <code>NextToken</code> response element is
     * present and has a value (is not null). Include that value as the
     * <code>NextToken</code> request parameter in the next call to the
     * operation to get the next part of the results. Note that Organizations
     * might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every
     * operation to ensure that you receive all of the results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @param maxResults <p>
     *            The total number of results that you want included on each
     *            page of the response. If you do not include this parameter, it
     *            defaults to a value that is specific to the operation. If
     *            additional items exist beyond the maximum you specify, the
     *            <code>NextToken</code> response element is present and has a
     *            value (is not null). Include that value as the
     *            <code>NextToken</code> request parameter in the next call to
     *            the operation to get the next part of the results. Note that
     *            Organizations might return fewer results than the maximum even
     *            when there are more results available. You should check
     *            <code>NextToken</code> after every operation to ensure that
     *            you receive all of the results.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The total number of results that you want included on each page of the
     * response. If you do not include this parameter, it defaults to a value
     * that is specific to the operation. If additional items exist beyond the
     * maximum you specify, the <code>NextToken</code> response element is
     * present and has a value (is not null). Include that value as the
     * <code>NextToken</code> request parameter in the next call to the
     * operation to get the next part of the results. Note that Organizations
     * might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every
     * operation to ensure that you receive all of the results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @param maxResults <p>
     *            The total number of results that you want included on each
     *            page of the response. If you do not include this parameter, it
     *            defaults to a value that is specific to the operation. If
     *            additional items exist beyond the maximum you specify, the
     *            <code>NextToken</code> response element is present and has a
     *            value (is not null). Include that value as the
     *            <code>NextToken</code> request parameter in the next call to
     *            the operation to get the next part of the results. Note that
     *            Organizations might return fewer results than the maximum even
     *            when there are more results available. You should check
     *            <code>NextToken</code> after every operation to ensure that
     *            you receive all of the results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChildrenRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getParentId() != null)
            sb.append("ParentId: " + getParentId() + ",");
        if (getChildType() != null)
            sb.append("ChildType: " + getChildType() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParentId() == null) ? 0 : getParentId().hashCode());
        hashCode = prime * hashCode + ((getChildType() == null) ? 0 : getChildType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListChildrenRequest == false)
            return false;
        ListChildrenRequest other = (ListChildrenRequest) obj;

        if (other.getParentId() == null ^ this.getParentId() == null)
            return false;
        if (other.getParentId() != null && other.getParentId().equals(this.getParentId()) == false)
            return false;
        if (other.getChildType() == null ^ this.getChildType() == null)
            return false;
        if (other.getChildType() != null
                && other.getChildType().equals(this.getChildType()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
