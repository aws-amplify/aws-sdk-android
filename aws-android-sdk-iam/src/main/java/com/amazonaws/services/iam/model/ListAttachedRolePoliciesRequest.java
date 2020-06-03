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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists all managed policies that are attached to the specified IAM role.
 * </p>
 * <p>
 * An IAM role can also have inline policies embedded with it. To list the
 * inline policies for a role, use the <a>ListRolePolicies</a> API. For
 * information about policies, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
 * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * You can paginate the results using the <code>MaxItems</code> and
 * <code>Marker</code> parameters. You can use the <code>PathPrefix</code>
 * parameter to limit the list of policies to only those matching the specified
 * path prefix. If there are no policies attached to the specified role (or none
 * that match the specified path prefix), the operation returns an empty list.
 * </p>
 */
public class ListAttachedRolePoliciesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name (friendly name, not ARN) of the role to list attached policies
     * for.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String roleName;

    /**
     * <p>
     * The path prefix for filtering the results. This parameter is optional. If
     * it is not included, it defaults to a slash (/), listing all policies.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string
     * that must begin and end with forward slashes. In addition, it can contain
     * any ASCII character from the ! (<code>\u0021</code>) through the DEL
     * character (<code>\u007F</code>), including most punctuation characters,
     * digits, and upper and lowercased letters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>((/[A-Za-z0-9\.,\+@=_-]+)*)/<br/>
     */
    private String pathPrefix;

    /**
     * <p>
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it to
     * the value of the <code>Marker</code> element in the response that you
     * received to indicate where the next call should start.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String marker;

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of
     * items you want in the response. If additional items exist beyond the
     * maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, the number of items defaults to
     * 100. Note that IAM might return fewer results, even when there are more
     * results available. In that case, the <code>IsTruncated</code> response
     * element returns <code>true</code>, and <code>Marker</code> contains a
     * value to include in the subsequent call that tells the service where to
     * continue from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxItems;

    /**
     * <p>
     * The name (friendly name, not ARN) of the role to list attached policies
     * for.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The name (friendly name, not ARN) of the role to list attached
     *         policies for.
     *         </p>
     *         <p>
     *         This parameter allows (through its <a
     *         href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *         string of characters consisting of upper and lowercase
     *         alphanumeric characters with no spaces. You can also include any
     *         of the following characters: _+=,.@-
     *         </p>
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * <p>
     * The name (friendly name, not ARN) of the role to list attached policies
     * for.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param roleName <p>
     *            The name (friendly name, not ARN) of the role to list attached
     *            policies for.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of upper and lowercase
     *            alphanumeric characters with no spaces. You can also include
     *            any of the following characters: _+=,.@-
     *            </p>
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name (friendly name, not ARN) of the role to list attached policies
     * for.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param roleName <p>
     *            The name (friendly name, not ARN) of the role to list attached
     *            policies for.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of upper and lowercase
     *            alphanumeric characters with no spaces. You can also include
     *            any of the following characters: _+=,.@-
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAttachedRolePoliciesRequest withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * <p>
     * The path prefix for filtering the results. This parameter is optional. If
     * it is not included, it defaults to a slash (/), listing all policies.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string
     * that must begin and end with forward slashes. In addition, it can contain
     * any ASCII character from the ! (<code>\u0021</code>) through the DEL
     * character (<code>\u007F</code>), including most punctuation characters,
     * digits, and upper and lowercased letters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>((/[A-Za-z0-9\.,\+@=_-]+)*)/<br/>
     *
     * @return <p>
     *         The path prefix for filtering the results. This parameter is
     *         optional. If it is not included, it defaults to a slash (/),
     *         listing all policies.
     *         </p>
     *         <p>
     *         This parameter allows (through its <a
     *         href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *         string of characters consisting of either a forward slash (/) by
     *         itself or a string that must begin and end with forward slashes.
     *         In addition, it can contain any ASCII character from the ! (
     *         <code>\u0021</code>) through the DEL character (
     *         <code>\u007F</code>), including most punctuation characters,
     *         digits, and upper and lowercased letters.
     *         </p>
     */
    public String getPathPrefix() {
        return pathPrefix;
    }

    /**
     * <p>
     * The path prefix for filtering the results. This parameter is optional. If
     * it is not included, it defaults to a slash (/), listing all policies.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string
     * that must begin and end with forward slashes. In addition, it can contain
     * any ASCII character from the ! (<code>\u0021</code>) through the DEL
     * character (<code>\u007F</code>), including most punctuation characters,
     * digits, and upper and lowercased letters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>((/[A-Za-z0-9\.,\+@=_-]+)*)/<br/>
     *
     * @param pathPrefix <p>
     *            The path prefix for filtering the results. This parameter is
     *            optional. If it is not included, it defaults to a slash (/),
     *            listing all policies.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of either a forward slash (/)
     *            by itself or a string that must begin and end with forward
     *            slashes. In addition, it can contain any ASCII character from
     *            the ! (<code>\u0021</code>) through the DEL character (
     *            <code>\u007F</code>), including most punctuation characters,
     *            digits, and upper and lowercased letters.
     *            </p>
     */
    public void setPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
    }

    /**
     * <p>
     * The path prefix for filtering the results. This parameter is optional. If
     * it is not included, it defaults to a slash (/), listing all policies.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string
     * that must begin and end with forward slashes. In addition, it can contain
     * any ASCII character from the ! (<code>\u0021</code>) through the DEL
     * character (<code>\u007F</code>), including most punctuation characters,
     * digits, and upper and lowercased letters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>((/[A-Za-z0-9\.,\+@=_-]+)*)/<br/>
     *
     * @param pathPrefix <p>
     *            The path prefix for filtering the results. This parameter is
     *            optional. If it is not included, it defaults to a slash (/),
     *            listing all policies.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of either a forward slash (/)
     *            by itself or a string that must begin and end with forward
     *            slashes. In addition, it can contain any ASCII character from
     *            the ! (<code>\u0021</code>) through the DEL character (
     *            <code>\u007F</code>), including most punctuation characters,
     *            digits, and upper and lowercased letters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAttachedRolePoliciesRequest withPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
        return this;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it to
     * the value of the <code>Marker</code> element in the response that you
     * received to indicate where the next call should start.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         Use this parameter only when paginating results and only after
     *         you receive a response indicating that the results are truncated.
     *         Set it to the value of the <code>Marker</code> element in the
     *         response that you received to indicate where the next call should
     *         start.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it to
     * the value of the <code>Marker</code> element in the response that you
     * received to indicate where the next call should start.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param marker <p>
     *            Use this parameter only when paginating results and only after
     *            you receive a response indicating that the results are
     *            truncated. Set it to the value of the <code>Marker</code>
     *            element in the response that you received to indicate where
     *            the next call should start.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it to
     * the value of the <code>Marker</code> element in the response that you
     * received to indicate where the next call should start.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param marker <p>
     *            Use this parameter only when paginating results and only after
     *            you receive a response indicating that the results are
     *            truncated. Set it to the value of the <code>Marker</code>
     *            element in the response that you received to indicate where
     *            the next call should start.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAttachedRolePoliciesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of
     * items you want in the response. If additional items exist beyond the
     * maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, the number of items defaults to
     * 100. Note that IAM might return fewer results, even when there are more
     * results available. In that case, the <code>IsTruncated</code> response
     * element returns <code>true</code>, and <code>Marker</code> contains a
     * value to include in the subsequent call that tells the service where to
     * continue from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         Use this only when paginating results to indicate the maximum
     *         number of items you want in the response. If additional items
     *         exist beyond the maximum you specify, the
     *         <code>IsTruncated</code> response element is <code>true</code>.
     *         </p>
     *         <p>
     *         If you do not include this parameter, the number of items
     *         defaults to 100. Note that IAM might return fewer results, even
     *         when there are more results available. In that case, the
     *         <code>IsTruncated</code> response element returns
     *         <code>true</code>, and <code>Marker</code> contains a value to
     *         include in the subsequent call that tells the service where to
     *         continue from.
     *         </p>
     */
    public Integer getMaxItems() {
        return maxItems;
    }

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of
     * items you want in the response. If additional items exist beyond the
     * maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, the number of items defaults to
     * 100. Note that IAM might return fewer results, even when there are more
     * results available. In that case, the <code>IsTruncated</code> response
     * element returns <code>true</code>, and <code>Marker</code> contains a
     * value to include in the subsequent call that tells the service where to
     * continue from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxItems <p>
     *            Use this only when paginating results to indicate the maximum
     *            number of items you want in the response. If additional items
     *            exist beyond the maximum you specify, the
     *            <code>IsTruncated</code> response element is <code>true</code>
     *            .
     *            </p>
     *            <p>
     *            If you do not include this parameter, the number of items
     *            defaults to 100. Note that IAM might return fewer results,
     *            even when there are more results available. In that case, the
     *            <code>IsTruncated</code> response element returns
     *            <code>true</code>, and <code>Marker</code> contains a value to
     *            include in the subsequent call that tells the service where to
     *            continue from.
     *            </p>
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of
     * items you want in the response. If additional items exist beyond the
     * maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, the number of items defaults to
     * 100. Note that IAM might return fewer results, even when there are more
     * results available. In that case, the <code>IsTruncated</code> response
     * element returns <code>true</code>, and <code>Marker</code> contains a
     * value to include in the subsequent call that tells the service where to
     * continue from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxItems <p>
     *            Use this only when paginating results to indicate the maximum
     *            number of items you want in the response. If additional items
     *            exist beyond the maximum you specify, the
     *            <code>IsTruncated</code> response element is <code>true</code>
     *            .
     *            </p>
     *            <p>
     *            If you do not include this parameter, the number of items
     *            defaults to 100. Note that IAM might return fewer results,
     *            even when there are more results available. In that case, the
     *            <code>IsTruncated</code> response element returns
     *            <code>true</code>, and <code>Marker</code> contains a value to
     *            include in the subsequent call that tells the service where to
     *            continue from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAttachedRolePoliciesRequest withMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
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
        if (getRoleName() != null)
            sb.append("RoleName: " + getRoleName() + ",");
        if (getPathPrefix() != null)
            sb.append("PathPrefix: " + getPathPrefix() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode + ((getPathPrefix() == null) ? 0 : getPathPrefix().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAttachedRolePoliciesRequest == false)
            return false;
        ListAttachedRolePoliciesRequest other = (ListAttachedRolePoliciesRequest) obj;

        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getPathPrefix() == null ^ this.getPathPrefix() == null)
            return false;
        if (other.getPathPrefix() != null
                && other.getPathPrefix().equals(this.getPathPrefix()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }
}
