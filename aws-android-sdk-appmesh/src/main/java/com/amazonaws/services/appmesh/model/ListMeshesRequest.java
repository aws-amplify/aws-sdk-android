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

package com.amazonaws.services.appmesh.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of existing service meshes.
 * </p>
 */
public class ListMeshesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The maximum number of results returned by <code>ListMeshes</code> in
     * paginated output. When you use this parameter, <code>ListMeshes</code>
     * returns only <code>limit</code> results in a single page along with a
     * <code>nextToken</code> response element. You can see the remaining
     * results of the initial request by sending another <code>ListMeshes</code>
     * request with the returned <code>nextToken</code> value. This value can be
     * between 1 and 100. If you don't use this parameter,
     * <code>ListMeshes</code> returns up to 100 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer limit;

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>ListMeshes</code> request where <code>limit</code> was used and the
     * results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code>
     * value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is used only to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results returned by <code>ListMeshes</code> in
     * paginated output. When you use this parameter, <code>ListMeshes</code>
     * returns only <code>limit</code> results in a single page along with a
     * <code>nextToken</code> response element. You can see the remaining
     * results of the initial request by sending another <code>ListMeshes</code>
     * request with the returned <code>nextToken</code> value. This value can be
     * between 1 and 100. If you don't use this parameter,
     * <code>ListMeshes</code> returns up to 100 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of results returned by <code>ListMeshes</code>
     *         in paginated output. When you use this parameter,
     *         <code>ListMeshes</code> returns only <code>limit</code> results
     *         in a single page along with a <code>nextToken</code> response
     *         element. You can see the remaining results of the initial request
     *         by sending another <code>ListMeshes</code> request with the
     *         returned <code>nextToken</code> value. This value can be between
     *         1 and 100. If you don't use this parameter,
     *         <code>ListMeshes</code> returns up to 100 results and a
     *         <code>nextToken</code> value if applicable.
     *         </p>
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>
     * The maximum number of results returned by <code>ListMeshes</code> in
     * paginated output. When you use this parameter, <code>ListMeshes</code>
     * returns only <code>limit</code> results in a single page along with a
     * <code>nextToken</code> response element. You can see the remaining
     * results of the initial request by sending another <code>ListMeshes</code>
     * request with the returned <code>nextToken</code> value. This value can be
     * between 1 and 100. If you don't use this parameter,
     * <code>ListMeshes</code> returns up to 100 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param limit <p>
     *            The maximum number of results returned by
     *            <code>ListMeshes</code> in paginated output. When you use this
     *            parameter, <code>ListMeshes</code> returns only
     *            <code>limit</code> results in a single page along with a
     *            <code>nextToken</code> response element. You can see the
     *            remaining results of the initial request by sending another
     *            <code>ListMeshes</code> request with the returned
     *            <code>nextToken</code> value. This value can be between 1 and
     *            100. If you don't use this parameter, <code>ListMeshes</code>
     *            returns up to 100 results and a <code>nextToken</code> value
     *            if applicable.
     *            </p>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of results returned by <code>ListMeshes</code> in
     * paginated output. When you use this parameter, <code>ListMeshes</code>
     * returns only <code>limit</code> results in a single page along with a
     * <code>nextToken</code> response element. You can see the remaining
     * results of the initial request by sending another <code>ListMeshes</code>
     * request with the returned <code>nextToken</code> value. This value can be
     * between 1 and 100. If you don't use this parameter,
     * <code>ListMeshes</code> returns up to 100 results and a
     * <code>nextToken</code> value if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param limit <p>
     *            The maximum number of results returned by
     *            <code>ListMeshes</code> in paginated output. When you use this
     *            parameter, <code>ListMeshes</code> returns only
     *            <code>limit</code> results in a single page along with a
     *            <code>nextToken</code> response element. You can see the
     *            remaining results of the initial request by sending another
     *            <code>ListMeshes</code> request with the returned
     *            <code>nextToken</code> value. This value can be between 1 and
     *            100. If you don't use this parameter, <code>ListMeshes</code>
     *            returns up to 100 results and a <code>nextToken</code> value
     *            if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMeshesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>ListMeshes</code> request where <code>limit</code> was used and the
     * results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code>
     * value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is used only to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     *
     * @return <p>
     *         The <code>nextToken</code> value returned from a previous
     *         paginated <code>ListMeshes</code> request where
     *         <code>limit</code> was used and the results exceeded the value of
     *         that parameter. Pagination continues from the end of the previous
     *         results that returned the <code>nextToken</code> value.
     *         </p>
     *         <note>
     *         <p>
     *         This token should be treated as an opaque identifier that is used
     *         only to retrieve the next items in a list and not for other
     *         programmatic purposes.
     *         </p>
     *         </note>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>ListMeshes</code> request where <code>limit</code> was used and the
     * results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code>
     * value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is used only to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value returned from a previous
     *            paginated <code>ListMeshes</code> request where
     *            <code>limit</code> was used and the results exceeded the value
     *            of that parameter. Pagination continues from the end of the
     *            previous results that returned the <code>nextToken</code>
     *            value.
     *            </p>
     *            <note>
     *            <p>
     *            This token should be treated as an opaque identifier that is
     *            used only to retrieve the next items in a list and not for
     *            other programmatic purposes.
     *            </p>
     *            </note>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>ListMeshes</code> request where <code>limit</code> was used and the
     * results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>nextToken</code>
     * value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is used only to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value returned from a previous
     *            paginated <code>ListMeshes</code> request where
     *            <code>limit</code> was used and the results exceeded the value
     *            of that parameter. Pagination continues from the end of the
     *            previous results that returned the <code>nextToken</code>
     *            value.
     *            </p>
     *            <note>
     *            <p>
     *            This token should be treated as an opaque identifier that is
     *            used only to retrieve the next items in a list and not for
     *            other programmatic purposes.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMeshesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getLimit() != null)
            sb.append("limit: " + getLimit() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMeshesRequest == false)
            return false;
        ListMeshesRequest other = (ListMeshesRequest) obj;

        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
