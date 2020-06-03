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
 * Retrieves information about all IAM users, groups, roles, and policies in
 * your AWS account, including their relationships to one another. Use this API
 * to obtain a snapshot of the configuration of IAM permissions (users, groups,
 * roles, and policies) in your account.
 * </p>
 * <note>
 * <p>
 * Policies returned by this API are URL-encoded compliant with <a
 * href="https://tools.ietf.org/html/rfc3986">RFC 3986</a>. You can use a URL
 * decoding method to convert the policy back to plain JSON text. For example,
 * if you use Java, you can use the <code>decode</code> method of the
 * <code>java.net.URLDecoder</code> utility class in the Java SDK. Other
 * languages and SDKs provide similar functionality.
 * </p>
 * </note>
 * <p>
 * You can optionally filter the results using the <code>Filter</code>
 * parameter. You can paginate the results using the <code>MaxItems</code> and
 * <code>Marker</code> parameters.
 * </p>
 */
public class GetAccountAuthorizationDetailsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A list of entity types used to filter the results. Only the entities that
     * match the types you specify are included in the output. Use the value
     * <code>LocalManagedPolicy</code> to include customer managed policies.
     * </p>
     * <p>
     * The format for this parameter is a comma-separated (if more than one)
     * list of strings. Each string value in the list must be one of the valid
     * values listed below.
     * </p>
     */
    private java.util.List<String> filter;

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
     * A list of entity types used to filter the results. Only the entities that
     * match the types you specify are included in the output. Use the value
     * <code>LocalManagedPolicy</code> to include customer managed policies.
     * </p>
     * <p>
     * The format for this parameter is a comma-separated (if more than one)
     * list of strings. Each string value in the list must be one of the valid
     * values listed below.
     * </p>
     *
     * @return <p>
     *         A list of entity types used to filter the results. Only the
     *         entities that match the types you specify are included in the
     *         output. Use the value <code>LocalManagedPolicy</code> to include
     *         customer managed policies.
     *         </p>
     *         <p>
     *         The format for this parameter is a comma-separated (if more than
     *         one) list of strings. Each string value in the list must be one
     *         of the valid values listed below.
     *         </p>
     */
    public java.util.List<String> getFilter() {
        return filter;
    }

    /**
     * <p>
     * A list of entity types used to filter the results. Only the entities that
     * match the types you specify are included in the output. Use the value
     * <code>LocalManagedPolicy</code> to include customer managed policies.
     * </p>
     * <p>
     * The format for this parameter is a comma-separated (if more than one)
     * list of strings. Each string value in the list must be one of the valid
     * values listed below.
     * </p>
     *
     * @param filter <p>
     *            A list of entity types used to filter the results. Only the
     *            entities that match the types you specify are included in the
     *            output. Use the value <code>LocalManagedPolicy</code> to
     *            include customer managed policies.
     *            </p>
     *            <p>
     *            The format for this parameter is a comma-separated (if more
     *            than one) list of strings. Each string value in the list must
     *            be one of the valid values listed below.
     *            </p>
     */
    public void setFilter(java.util.Collection<String> filter) {
        if (filter == null) {
            this.filter = null;
            return;
        }

        this.filter = new java.util.ArrayList<String>(filter);
    }

    /**
     * <p>
     * A list of entity types used to filter the results. Only the entities that
     * match the types you specify are included in the output. Use the value
     * <code>LocalManagedPolicy</code> to include customer managed policies.
     * </p>
     * <p>
     * The format for this parameter is a comma-separated (if more than one)
     * list of strings. Each string value in the list must be one of the valid
     * values listed below.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            A list of entity types used to filter the results. Only the
     *            entities that match the types you specify are included in the
     *            output. Use the value <code>LocalManagedPolicy</code> to
     *            include customer managed policies.
     *            </p>
     *            <p>
     *            The format for this parameter is a comma-separated (if more
     *            than one) list of strings. Each string value in the list must
     *            be one of the valid values listed below.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAccountAuthorizationDetailsRequest withFilter(String... filter) {
        if (getFilter() == null) {
            this.filter = new java.util.ArrayList<String>(filter.length);
        }
        for (String value : filter) {
            this.filter.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of entity types used to filter the results. Only the entities that
     * match the types you specify are included in the output. Use the value
     * <code>LocalManagedPolicy</code> to include customer managed policies.
     * </p>
     * <p>
     * The format for this parameter is a comma-separated (if more than one)
     * list of strings. Each string value in the list must be one of the valid
     * values listed below.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            A list of entity types used to filter the results. Only the
     *            entities that match the types you specify are included in the
     *            output. Use the value <code>LocalManagedPolicy</code> to
     *            include customer managed policies.
     *            </p>
     *            <p>
     *            The format for this parameter is a comma-separated (if more
     *            than one) list of strings. Each string value in the list must
     *            be one of the valid values listed below.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAccountAuthorizationDetailsRequest withFilter(java.util.Collection<String> filter) {
        setFilter(filter);
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
    public GetAccountAuthorizationDetailsRequest withMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
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
    public GetAccountAuthorizationDetailsRequest withMarker(String marker) {
        this.marker = marker;
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
        if (getFilter() != null)
            sb.append("Filter: " + getFilter() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccountAuthorizationDetailsRequest == false)
            return false;
        GetAccountAuthorizationDetailsRequest other = (GetAccountAuthorizationDetailsRequest) obj;

        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
