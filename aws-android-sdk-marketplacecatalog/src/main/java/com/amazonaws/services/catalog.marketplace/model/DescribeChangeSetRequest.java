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

package com.amazonaws.services.catalog.marketplace.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Provides information about a given change set.
 * </p>
 */
public class DescribeChangeSetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Required. The catalog related to the request. Fixed value:
     * <code>AWSMarketplace</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     */
    private String catalog;

    /**
     * <p>
     * Required. The unique identifier for the <code>StartChangeSet</code>
     * request that you want to describe the details for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-]+$<br/>
     */
    private String changeSetId;

    /**
     * <p>
     * Required. The catalog related to the request. Fixed value:
     * <code>AWSMarketplace</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @return <p>
     *         Required. The catalog related to the request. Fixed value:
     *         <code>AWSMarketplace</code>
     *         </p>
     */
    public String getCatalog() {
        return catalog;
    }

    /**
     * <p>
     * Required. The catalog related to the request. Fixed value:
     * <code>AWSMarketplace</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @param catalog <p>
     *            Required. The catalog related to the request. Fixed value:
     *            <code>AWSMarketplace</code>
     *            </p>
     */
    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    /**
     * <p>
     * Required. The catalog related to the request. Fixed value:
     * <code>AWSMarketplace</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z]+$<br/>
     *
     * @param catalog <p>
     *            Required. The catalog related to the request. Fixed value:
     *            <code>AWSMarketplace</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeChangeSetRequest withCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }

    /**
     * <p>
     * Required. The unique identifier for the <code>StartChangeSet</code>
     * request that you want to describe the details for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-]+$<br/>
     *
     * @return <p>
     *         Required. The unique identifier for the
     *         <code>StartChangeSet</code> request that you want to describe the
     *         details for.
     *         </p>
     */
    public String getChangeSetId() {
        return changeSetId;
    }

    /**
     * <p>
     * Required. The unique identifier for the <code>StartChangeSet</code>
     * request that you want to describe the details for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-]+$<br/>
     *
     * @param changeSetId <p>
     *            Required. The unique identifier for the
     *            <code>StartChangeSet</code> request that you want to describe
     *            the details for.
     *            </p>
     */
    public void setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
    }

    /**
     * <p>
     * Required. The unique identifier for the <code>StartChangeSet</code>
     * request that you want to describe the details for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-]+$<br/>
     *
     * @param changeSetId <p>
     *            Required. The unique identifier for the
     *            <code>StartChangeSet</code> request that you want to describe
     *            the details for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeChangeSetRequest withChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
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
        if (getCatalog() != null)
            sb.append("Catalog: " + getCatalog() + ",");
        if (getChangeSetId() != null)
            sb.append("ChangeSetId: " + getChangeSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalog() == null) ? 0 : getCatalog().hashCode());
        hashCode = prime * hashCode
                + ((getChangeSetId() == null) ? 0 : getChangeSetId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeChangeSetRequest == false)
            return false;
        DescribeChangeSetRequest other = (DescribeChangeSetRequest) obj;

        if (other.getCatalog() == null ^ this.getCatalog() == null)
            return false;
        if (other.getCatalog() != null && other.getCatalog().equals(this.getCatalog()) == false)
            return false;
        if (other.getChangeSetId() == null ^ this.getChangeSetId() == null)
            return false;
        if (other.getChangeSetId() != null
                && other.getChangeSetId().equals(this.getChangeSetId()) == false)
            return false;
        return true;
    }
}
