/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the policies attached to the specified thing group.
 * </p>
 */
public class ListAttachedPoliciesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The group for which the policies will be listed.
     * </p>
     */
    private String target;

    /**
     * <p>
     * When true, recursively list attached policies.
     * </p>
     */
    private Boolean recursive;

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     */
    private String marker;

    /**
     * <p>
     * The maximum number of results to be returned per request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     */
    private Integer pageSize;

    /**
     * <p>
     * The group for which the policies will be listed.
     * </p>
     *
     * @return <p>
     *         The group for which the policies will be listed.
     *         </p>
     */
    public String getTarget() {
        return target;
    }

    /**
     * <p>
     * The group for which the policies will be listed.
     * </p>
     *
     * @param target <p>
     *            The group for which the policies will be listed.
     *            </p>
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The group for which the policies will be listed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param target <p>
     *            The group for which the policies will be listed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAttachedPoliciesRequest withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * <p>
     * When true, recursively list attached policies.
     * </p>
     *
     * @return <p>
     *         When true, recursively list attached policies.
     *         </p>
     */
    public Boolean isRecursive() {
        return recursive;
    }

    /**
     * <p>
     * When true, recursively list attached policies.
     * </p>
     *
     * @return <p>
     *         When true, recursively list attached policies.
     *         </p>
     */
    public Boolean getRecursive() {
        return recursive;
    }

    /**
     * <p>
     * When true, recursively list attached policies.
     * </p>
     *
     * @param recursive <p>
     *            When true, recursively list attached policies.
     *            </p>
     */
    public void setRecursive(Boolean recursive) {
        this.recursive = recursive;
    }

    /**
     * <p>
     * When true, recursively list attached policies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recursive <p>
     *            When true, recursively list attached policies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAttachedPoliciesRequest withRecursive(Boolean recursive) {
        this.recursive = recursive;
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @return <p>
     *         The token to retrieve the next set of results.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @param marker <p>
     *            The token to retrieve the next set of results.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @param marker <p>
     *            The token to retrieve the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAttachedPoliciesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to be returned per request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @return <p>
     *         The maximum number of results to be returned per request.
     *         </p>
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * <p>
     * The maximum number of results to be returned per request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param pageSize <p>
     *            The maximum number of results to be returned per request.
     *            </p>
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The maximum number of results to be returned per request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param pageSize <p>
     *            The maximum number of results to be returned per request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAttachedPoliciesRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
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
        if (getTarget() != null)
            sb.append("target: " + getTarget() + ",");
        if (getRecursive() != null)
            sb.append("recursive: " + getRecursive() + ",");
        if (getMarker() != null)
            sb.append("marker: " + getMarker() + ",");
        if (getPageSize() != null)
            sb.append("pageSize: " + getPageSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getRecursive() == null) ? 0 : getRecursive().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAttachedPoliciesRequest == false)
            return false;
        ListAttachedPoliciesRequest other = (ListAttachedPoliciesRequest) obj;

        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getRecursive() == null ^ this.getRecursive() == null)
            return false;
        if (other.getRecursive() != null
                && other.getRecursive().equals(this.getRecursive()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        return true;
    }
}
