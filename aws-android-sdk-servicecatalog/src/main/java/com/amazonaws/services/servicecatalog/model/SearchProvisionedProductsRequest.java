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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets information about the provisioned products that meet the specified
 * criteria.
 * </p>
 */
public class SearchProvisionedProductsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     */
    private String acceptLanguage;

    /**
     * <p>
     * The access level to use to obtain results. The default is
     * <code>User</code>.
     * </p>
     */
    private AccessLevelFilter accessLevelFilter;

    /**
     * <p>
     * The search filters.
     * </p>
     * <p>
     * When the key is <code>SearchQuery</code>, the searchable fields are
     * <code>arn</code>, <code>createdTime</code>, <code>id</code>,
     * <code>lastRecordId</code>, <code>idempotencyToken</code>,
     * <code>name</code>, <code>physicalId</code>, <code>productId</code>,
     * <code>provisioningArtifact</code>, <code>type</code>, <code>status</code>, <code>tags</code>, <code>userArn</code>, and
     * <code>userArnSession</code>.
     * </p>
     * <p>
     * Example: <code>"SearchQuery":["status:AVAILABLE"]</code>
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> filters;

    /**
     * <p>
     * The sort field. If no value is specified, the results are not sorted. The
     * valid values are <code>arn</code>, <code>id</code>, <code>name</code>,
     * and <code>lastRecordId</code>.
     * </p>
     */
    private String sortBy;

    /**
     * <p>
     * The sort order. If no value is specified, the results are not sorted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     */
    private String sortOrder;

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer pageSize;

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of
     * results, use null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     */
    private String pageToken;

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @return <p>
     *         The language code.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>en</code> - English (default)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>jp</code> - Japanese
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zh</code> - Chinese
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param acceptLanguage <p>
     *            The language code.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>en</code> - English (default)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>jp</code> - Japanese
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>zh</code> - Chinese
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param acceptLanguage <p>
     *            The language code.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>en</code> - English (default)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>jp</code> - Japanese
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>zh</code> - Chinese
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchProvisionedProductsRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * <p>
     * The access level to use to obtain results. The default is
     * <code>User</code>.
     * </p>
     *
     * @return <p>
     *         The access level to use to obtain results. The default is
     *         <code>User</code>.
     *         </p>
     */
    public AccessLevelFilter getAccessLevelFilter() {
        return accessLevelFilter;
    }

    /**
     * <p>
     * The access level to use to obtain results. The default is
     * <code>User</code>.
     * </p>
     *
     * @param accessLevelFilter <p>
     *            The access level to use to obtain results. The default is
     *            <code>User</code>.
     *            </p>
     */
    public void setAccessLevelFilter(AccessLevelFilter accessLevelFilter) {
        this.accessLevelFilter = accessLevelFilter;
    }

    /**
     * <p>
     * The access level to use to obtain results. The default is
     * <code>User</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessLevelFilter <p>
     *            The access level to use to obtain results. The default is
     *            <code>User</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchProvisionedProductsRequest withAccessLevelFilter(
            AccessLevelFilter accessLevelFilter) {
        this.accessLevelFilter = accessLevelFilter;
        return this;
    }

    /**
     * <p>
     * The search filters.
     * </p>
     * <p>
     * When the key is <code>SearchQuery</code>, the searchable fields are
     * <code>arn</code>, <code>createdTime</code>, <code>id</code>,
     * <code>lastRecordId</code>, <code>idempotencyToken</code>,
     * <code>name</code>, <code>physicalId</code>, <code>productId</code>,
     * <code>provisioningArtifact</code>, <code>type</code>, <code>status</code>, <code>tags</code>, <code>userArn</code>, and
     * <code>userArnSession</code>.
     * </p>
     * <p>
     * Example: <code>"SearchQuery":["status:AVAILABLE"]</code>
     * </p>
     *
     * @return <p>
     *         The search filters.
     *         </p>
     *         <p>
     *         When the key is <code>SearchQuery</code>, the searchable fields
     *         are <code>arn</code>, <code>createdTime</code>, <code>id</code>,
     *         <code>lastRecordId</code>, <code>idempotencyToken</code>,
     *         <code>name</code>, <code>physicalId</code>,
     *         <code>productId</code>, <code>provisioningArtifact</code>,
     *         <code>type</code>, <code>status</code>, <code>tags</code>,
     *         <code>userArn</code>, and <code>userArnSession</code>.
     *         </p>
     *         <p>
     *         Example: <code>"SearchQuery":["status:AVAILABLE"]</code>
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The search filters.
     * </p>
     * <p>
     * When the key is <code>SearchQuery</code>, the searchable fields are
     * <code>arn</code>, <code>createdTime</code>, <code>id</code>,
     * <code>lastRecordId</code>, <code>idempotencyToken</code>,
     * <code>name</code>, <code>physicalId</code>, <code>productId</code>,
     * <code>provisioningArtifact</code>, <code>type</code>, <code>status</code>, <code>tags</code>, <code>userArn</code>, and
     * <code>userArnSession</code>.
     * </p>
     * <p>
     * Example: <code>"SearchQuery":["status:AVAILABLE"]</code>
     * </p>
     *
     * @param filters <p>
     *            The search filters.
     *            </p>
     *            <p>
     *            When the key is <code>SearchQuery</code>, the searchable
     *            fields are <code>arn</code>, <code>createdTime</code>,
     *            <code>id</code>, <code>lastRecordId</code>,
     *            <code>idempotencyToken</code>, <code>name</code>,
     *            <code>physicalId</code>, <code>productId</code>,
     *            <code>provisioningArtifact</code>, <code>type</code>,
     *            <code>status</code>, <code>tags</code>, <code>userArn</code>,
     *            and <code>userArnSession</code>.
     *            </p>
     *            <p>
     *            Example: <code>"SearchQuery":["status:AVAILABLE"]</code>
     *            </p>
     */
    public void setFilters(java.util.Map<String, java.util.List<String>> filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * The search filters.
     * </p>
     * <p>
     * When the key is <code>SearchQuery</code>, the searchable fields are
     * <code>arn</code>, <code>createdTime</code>, <code>id</code>,
     * <code>lastRecordId</code>, <code>idempotencyToken</code>,
     * <code>name</code>, <code>physicalId</code>, <code>productId</code>,
     * <code>provisioningArtifact</code>, <code>type</code>, <code>status</code>, <code>tags</code>, <code>userArn</code>, and
     * <code>userArnSession</code>.
     * </p>
     * <p>
     * Example: <code>"SearchQuery":["status:AVAILABLE"]</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            The search filters.
     *            </p>
     *            <p>
     *            When the key is <code>SearchQuery</code>, the searchable
     *            fields are <code>arn</code>, <code>createdTime</code>,
     *            <code>id</code>, <code>lastRecordId</code>,
     *            <code>idempotencyToken</code>, <code>name</code>,
     *            <code>physicalId</code>, <code>productId</code>,
     *            <code>provisioningArtifact</code>, <code>type</code>,
     *            <code>status</code>, <code>tags</code>, <code>userArn</code>,
     *            and <code>userArnSession</code>.
     *            </p>
     *            <p>
     *            Example: <code>"SearchQuery":["status:AVAILABLE"]</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchProvisionedProductsRequest withFilters(
            java.util.Map<String, java.util.List<String>> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * <p>
     * The search filters.
     * </p>
     * <p>
     * When the key is <code>SearchQuery</code>, the searchable fields are
     * <code>arn</code>, <code>createdTime</code>, <code>id</code>,
     * <code>lastRecordId</code>, <code>idempotencyToken</code>,
     * <code>name</code>, <code>physicalId</code>, <code>productId</code>,
     * <code>provisioningArtifact</code>, <code>type</code>, <code>status</code>, <code>tags</code>, <code>userArn</code>, and
     * <code>userArnSession</code>.
     * </p>
     * <p>
     * Example: <code>"SearchQuery":["status:AVAILABLE"]</code>
     * </p>
     * <p>
     * The method adds a new key-value pair into Filters parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Filters.
     * @param value The corresponding value of the entry to be added into
     *            Filters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchProvisionedProductsRequest addFiltersEntry(String key, java.util.List<String> value) {
        if (null == this.filters) {
            this.filters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.filters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.filters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Filters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public SearchProvisionedProductsRequest clearFiltersEntries() {
        this.filters = null;
        return this;
    }

    /**
     * <p>
     * The sort field. If no value is specified, the results are not sorted. The
     * valid values are <code>arn</code>, <code>id</code>, <code>name</code>,
     * and <code>lastRecordId</code>.
     * </p>
     *
     * @return <p>
     *         The sort field. If no value is specified, the results are not
     *         sorted. The valid values are <code>arn</code>, <code>id</code>,
     *         <code>name</code>, and <code>lastRecordId</code>.
     *         </p>
     */
    public String getSortBy() {
        return sortBy;
    }

    /**
     * <p>
     * The sort field. If no value is specified, the results are not sorted. The
     * valid values are <code>arn</code>, <code>id</code>, <code>name</code>,
     * and <code>lastRecordId</code>.
     * </p>
     *
     * @param sortBy <p>
     *            The sort field. If no value is specified, the results are not
     *            sorted. The valid values are <code>arn</code>, <code>id</code>, <code>name</code>, and <code>lastRecordId</code>.
     *            </p>
     */
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The sort field. If no value is specified, the results are not sorted. The
     * valid values are <code>arn</code>, <code>id</code>, <code>name</code>,
     * and <code>lastRecordId</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sortBy <p>
     *            The sort field. If no value is specified, the results are not
     *            sorted. The valid values are <code>arn</code>, <code>id</code>, <code>name</code>, and <code>lastRecordId</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchProvisionedProductsRequest withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * <p>
     * The sort order. If no value is specified, the results are not sorted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @return <p>
     *         The sort order. If no value is specified, the results are not
     *         sorted.
     *         </p>
     * @see SortOrder
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * <p>
     * The sort order. If no value is specified, the results are not sorted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            The sort order. If no value is specified, the results are not
     *            sorted.
     *            </p>
     * @see SortOrder
     */
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order. If no value is specified, the results are not sorted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            The sort order. If no value is specified, the results are not
     *            sorted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrder
     */
    public SearchProvisionedProductsRequest withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * <p>
     * The sort order. If no value is specified, the results are not sorted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            The sort order. If no value is specified, the results are not
     *            sorted.
     *            </p>
     * @see SortOrder
     */
    public void setSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
    }

    /**
     * <p>
     * The sort order. If no value is specified, the results are not sorted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            The sort order. If no value is specified, the results are not
     *            sorted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrder
     */
    public SearchProvisionedProductsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         The maximum number of items to return with this call.
     *         </p>
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param pageSize <p>
     *            The maximum number of items to return with this call.
     *            </p>
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param pageSize <p>
     *            The maximum number of items to return with this call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchProvisionedProductsRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of
     * results, use null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @return <p>
     *         The page token for the next set of results. To retrieve the first
     *         set of results, use null.
     *         </p>
     */
    public String getPageToken() {
        return pageToken;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of
     * results, use null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @param pageToken <p>
     *            The page token for the next set of results. To retrieve the
     *            first set of results, use null.
     *            </p>
     */
    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of
     * results, use null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @param pageToken <p>
     *            The page token for the next set of results. To retrieve the
     *            first set of results, use null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchProvisionedProductsRequest withPageToken(String pageToken) {
        this.pageToken = pageToken;
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
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: " + getAcceptLanguage() + ",");
        if (getAccessLevelFilter() != null)
            sb.append("AccessLevelFilter: " + getAccessLevelFilter() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getSortBy() != null)
            sb.append("SortBy: " + getSortBy() + ",");
        if (getSortOrder() != null)
            sb.append("SortOrder: " + getSortOrder() + ",");
        if (getPageSize() != null)
            sb.append("PageSize: " + getPageSize() + ",");
        if (getPageToken() != null)
            sb.append("PageToken: " + getPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode
                + ((getAccessLevelFilter() == null) ? 0 : getAccessLevelFilter().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchProvisionedProductsRequest == false)
            return false;
        SearchProvisionedProductsRequest other = (SearchProvisionedProductsRequest) obj;

        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null
                && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getAccessLevelFilter() == null ^ this.getAccessLevelFilter() == null)
            return false;
        if (other.getAccessLevelFilter() != null
                && other.getAccessLevelFilter().equals(this.getAccessLevelFilter()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null
                && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null
                && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        return true;
    }
}
