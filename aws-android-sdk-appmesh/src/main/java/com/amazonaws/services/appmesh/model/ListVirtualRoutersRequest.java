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
 * Returns a list of existing virtual routers in a service mesh.
 * </p>
 */
public class ListVirtualRoutersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The maximum number of results returned by <code>ListVirtualRouters</code>
     * in paginated output. When you use this parameter,
     * <code>ListVirtualRouters</code> returns only <code>limit</code> results
     * in a single page along with a <code>nextToken</code> response element.
     * You can see the remaining results of the initial request by sending
     * another <code>ListVirtualRouters</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If you
     * don't use this parameter, <code>ListVirtualRouters</code> returns up to
     * 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer limit;

    /**
     * <p>
     * The name of the service mesh to list virtual routers in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String meshName;

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is
     * not your own, then it's the ID of the account that shared the mesh with
     * your account. For more information about mesh sharing, see <a href=
     * "https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html"
     * >Working with shared meshes</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     */
    private String meshOwner;

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>ListVirtualRouters</code> request where <code>limit</code> was used
     * and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>nextToken</code> value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results returned by <code>ListVirtualRouters</code>
     * in paginated output. When you use this parameter,
     * <code>ListVirtualRouters</code> returns only <code>limit</code> results
     * in a single page along with a <code>nextToken</code> response element.
     * You can see the remaining results of the initial request by sending
     * another <code>ListVirtualRouters</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If you
     * don't use this parameter, <code>ListVirtualRouters</code> returns up to
     * 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of results returned by
     *         <code>ListVirtualRouters</code> in paginated output. When you use
     *         this parameter, <code>ListVirtualRouters</code> returns only
     *         <code>limit</code> results in a single page along with a
     *         <code>nextToken</code> response element. You can see the
     *         remaining results of the initial request by sending another
     *         <code>ListVirtualRouters</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and
     *         100. If you don't use this parameter,
     *         <code>ListVirtualRouters</code> returns up to 100 results and a
     *         <code>nextToken</code> value if applicable.
     *         </p>
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>
     * The maximum number of results returned by <code>ListVirtualRouters</code>
     * in paginated output. When you use this parameter,
     * <code>ListVirtualRouters</code> returns only <code>limit</code> results
     * in a single page along with a <code>nextToken</code> response element.
     * You can see the remaining results of the initial request by sending
     * another <code>ListVirtualRouters</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If you
     * don't use this parameter, <code>ListVirtualRouters</code> returns up to
     * 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param limit <p>
     *            The maximum number of results returned by
     *            <code>ListVirtualRouters</code> in paginated output. When you
     *            use this parameter, <code>ListVirtualRouters</code> returns
     *            only <code>limit</code> results in a single page along with a
     *            <code>nextToken</code> response element. You can see the
     *            remaining results of the initial request by sending another
     *            <code>ListVirtualRouters</code> request with the returned
     *            <code>nextToken</code> value. This value can be between 1 and
     *            100. If you don't use this parameter,
     *            <code>ListVirtualRouters</code> returns up to 100 results and
     *            a <code>nextToken</code> value if applicable.
     *            </p>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of results returned by <code>ListVirtualRouters</code>
     * in paginated output. When you use this parameter,
     * <code>ListVirtualRouters</code> returns only <code>limit</code> results
     * in a single page along with a <code>nextToken</code> response element.
     * You can see the remaining results of the initial request by sending
     * another <code>ListVirtualRouters</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If you
     * don't use this parameter, <code>ListVirtualRouters</code> returns up to
     * 100 results and a <code>nextToken</code> value if applicable.
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
     *            <code>ListVirtualRouters</code> in paginated output. When you
     *            use this parameter, <code>ListVirtualRouters</code> returns
     *            only <code>limit</code> results in a single page along with a
     *            <code>nextToken</code> response element. You can see the
     *            remaining results of the initial request by sending another
     *            <code>ListVirtualRouters</code> request with the returned
     *            <code>nextToken</code> value. This value can be between 1 and
     *            100. If you don't use this parameter,
     *            <code>ListVirtualRouters</code> returns up to 100 results and
     *            a <code>nextToken</code> value if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVirtualRoutersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * <p>
     * The name of the service mesh to list virtual routers in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name of the service mesh to list virtual routers in.
     *         </p>
     */
    public String getMeshName() {
        return meshName;
    }

    /**
     * <p>
     * The name of the service mesh to list virtual routers in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param meshName <p>
     *            The name of the service mesh to list virtual routers in.
     *            </p>
     */
    public void setMeshName(String meshName) {
        this.meshName = meshName;
    }

    /**
     * <p>
     * The name of the service mesh to list virtual routers in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param meshName <p>
     *            The name of the service mesh to list virtual routers in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVirtualRoutersRequest withMeshName(String meshName) {
        this.meshName = meshName;
        return this;
    }

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is
     * not your own, then it's the ID of the account that shared the mesh with
     * your account. For more information about mesh sharing, see <a href=
     * "https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html"
     * >Working with shared meshes</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     *
     * @return <p>
     *         The AWS IAM account ID of the service mesh owner. If the account
     *         ID is not your own, then it's the ID of the account that shared
     *         the mesh with your account. For more information about mesh
     *         sharing, see <a href=
     *         "https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html"
     *         >Working with shared meshes</a>.
     *         </p>
     */
    public String getMeshOwner() {
        return meshOwner;
    }

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is
     * not your own, then it's the ID of the account that shared the mesh with
     * your account. For more information about mesh sharing, see <a href=
     * "https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html"
     * >Working with shared meshes</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     *
     * @param meshOwner <p>
     *            The AWS IAM account ID of the service mesh owner. If the
     *            account ID is not your own, then it's the ID of the account
     *            that shared the mesh with your account. For more information
     *            about mesh sharing, see <a href=
     *            "https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html"
     *            >Working with shared meshes</a>.
     *            </p>
     */
    public void setMeshOwner(String meshOwner) {
        this.meshOwner = meshOwner;
    }

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is
     * not your own, then it's the ID of the account that shared the mesh with
     * your account. For more information about mesh sharing, see <a href=
     * "https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html"
     * >Working with shared meshes</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     *
     * @param meshOwner <p>
     *            The AWS IAM account ID of the service mesh owner. If the
     *            account ID is not your own, then it's the ID of the account
     *            that shared the mesh with your account. For more information
     *            about mesh sharing, see <a href=
     *            "https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html"
     *            >Working with shared meshes</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVirtualRoutersRequest withMeshOwner(String meshOwner) {
        this.meshOwner = meshOwner;
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>ListVirtualRouters</code> request where <code>limit</code> was used
     * and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>nextToken</code> value.
     * </p>
     *
     * @return <p>
     *         The <code>nextToken</code> value returned from a previous
     *         paginated <code>ListVirtualRouters</code> request where
     *         <code>limit</code> was used and the results exceeded the value of
     *         that parameter. Pagination continues from the end of the previous
     *         results that returned the <code>nextToken</code> value.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>ListVirtualRouters</code> request where <code>limit</code> was used
     * and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>nextToken</code> value.
     * </p>
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value returned from a previous
     *            paginated <code>ListVirtualRouters</code> request where
     *            <code>limit</code> was used and the results exceeded the value
     *            of that parameter. Pagination continues from the end of the
     *            previous results that returned the <code>nextToken</code>
     *            value.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>ListVirtualRouters</code> request where <code>limit</code> was used
     * and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value returned from a previous
     *            paginated <code>ListVirtualRouters</code> request where
     *            <code>limit</code> was used and the results exceeded the value
     *            of that parameter. Pagination continues from the end of the
     *            previous results that returned the <code>nextToken</code>
     *            value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVirtualRoutersRequest withNextToken(String nextToken) {
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
        if (getMeshName() != null)
            sb.append("meshName: " + getMeshName() + ",");
        if (getMeshOwner() != null)
            sb.append("meshOwner: " + getMeshOwner() + ",");
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
        hashCode = prime * hashCode + ((getMeshName() == null) ? 0 : getMeshName().hashCode());
        hashCode = prime * hashCode + ((getMeshOwner() == null) ? 0 : getMeshOwner().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVirtualRoutersRequest == false)
            return false;
        ListVirtualRoutersRequest other = (ListVirtualRoutersRequest) obj;

        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getMeshName() == null ^ this.getMeshName() == null)
            return false;
        if (other.getMeshName() != null && other.getMeshName().equals(this.getMeshName()) == false)
            return false;
        if (other.getMeshOwner() == null ^ this.getMeshOwner() == null)
            return false;
        if (other.getMeshOwner() != null
                && other.getMeshOwner().equals(this.getMeshOwner()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
