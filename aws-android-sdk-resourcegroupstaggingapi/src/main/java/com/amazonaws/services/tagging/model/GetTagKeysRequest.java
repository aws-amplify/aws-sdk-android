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

package com.amazonaws.services.tagging.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns all tag keys in the specified Region for the AWS account.
 * </p>
 */
public class GetTagKeysRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A string that indicates that additional data is available. Leave this
     * value empty for your initial request. If the response includes a
     * <code>PaginationToken</code>, use that string for this value to request
     * an additional page of data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String paginationToken;

    /**
     * <p>
     * A string that indicates that additional data is available. Leave this
     * value empty for your initial request. If the response includes a
     * <code>PaginationToken</code>, use that string for this value to request
     * an additional page of data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         A string that indicates that additional data is available. Leave
     *         this value empty for your initial request. If the response
     *         includes a <code>PaginationToken</code>, use that string for this
     *         value to request an additional page of data.
     *         </p>
     */
    public String getPaginationToken() {
        return paginationToken;
    }

    /**
     * <p>
     * A string that indicates that additional data is available. Leave this
     * value empty for your initial request. If the response includes a
     * <code>PaginationToken</code>, use that string for this value to request
     * an additional page of data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param paginationToken <p>
     *            A string that indicates that additional data is available.
     *            Leave this value empty for your initial request. If the
     *            response includes a <code>PaginationToken</code>, use that
     *            string for this value to request an additional page of data.
     *            </p>
     */
    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * A string that indicates that additional data is available. Leave this
     * value empty for your initial request. If the response includes a
     * <code>PaginationToken</code>, use that string for this value to request
     * an additional page of data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param paginationToken <p>
     *            A string that indicates that additional data is available.
     *            Leave this value empty for your initial request. If the
     *            response includes a <code>PaginationToken</code>, use that
     *            string for this value to request an additional page of data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTagKeysRequest withPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
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
        if (getPaginationToken() != null)
            sb.append("PaginationToken: " + getPaginationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTagKeysRequest == false)
            return false;
        GetTagKeysRequest other = (GetTagKeysRequest) obj;

        if (other.getPaginationToken() == null ^ this.getPaginationToken() == null)
            return false;
        if (other.getPaginationToken() != null
                && other.getPaginationToken().equals(this.getPaginationToken()) == false)
            return false;
        return true;
    }
}
