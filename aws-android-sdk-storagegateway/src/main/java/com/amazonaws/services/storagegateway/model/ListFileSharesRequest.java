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

package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets a list of the file shares for a specific file gateway, or the list of
 * file shares that belong to the calling user account. This operation is only
 * supported for file gateways.
 * </p>
 */
public class ListFileSharesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway whose file shares you want
     * to list. If this field is not present, all file shares under your account
     * are listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * <p>
     * The maximum number of file shares to return in the response. The value
     * must be an integer with a value greater than zero. Optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer limit;

    /**
     * <p>
     * Opaque pagination token returned from a previous ListFileShares
     * operation. If present, <code>Marker</code> specifies where to continue
     * the list from after a previous call to ListFileShares. Optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String marker;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway whose file shares you want
     * to list. If this field is not present, all file shares under your account
     * are listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the gateway whose file shares
     *         you want to list. If this field is not present, all file shares
     *         under your account are listed.
     *         </p>
     */
    public String getGatewayARN() {
        return gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway whose file shares you want
     * to list. If this field is not present, all file shares under your account
     * are listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway whose file
     *            shares you want to list. If this field is not present, all
     *            file shares under your account are listed.
     *            </p>
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway whose file shares you want
     * to list. If this field is not present, all file shares under your account
     * are listed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway whose file
     *            shares you want to list. If this field is not present, all
     *            file shares under your account are listed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFileSharesRequest withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * <p>
     * The maximum number of file shares to return in the response. The value
     * must be an integer with a value greater than zero. Optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum number of file shares to return in the response. The
     *         value must be an integer with a value greater than zero.
     *         Optional.
     *         </p>
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>
     * The maximum number of file shares to return in the response. The value
     * must be an integer with a value greater than zero. Optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit <p>
     *            The maximum number of file shares to return in the response.
     *            The value must be an integer with a value greater than zero.
     *            Optional.
     *            </p>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of file shares to return in the response. The value
     * must be an integer with a value greater than zero. Optional.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit <p>
     *            The maximum number of file shares to return in the response.
     *            The value must be an integer with a value greater than zero.
     *            Optional.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFileSharesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * <p>
     * Opaque pagination token returned from a previous ListFileShares
     * operation. If present, <code>Marker</code> specifies where to continue
     * the list from after a previous call to ListFileShares. Optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         Opaque pagination token returned from a previous ListFileShares
     *         operation. If present, <code>Marker</code> specifies where to
     *         continue the list from after a previous call to ListFileShares.
     *         Optional.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * Opaque pagination token returned from a previous ListFileShares
     * operation. If present, <code>Marker</code> specifies where to continue
     * the list from after a previous call to ListFileShares. Optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker <p>
     *            Opaque pagination token returned from a previous
     *            ListFileShares operation. If present, <code>Marker</code>
     *            specifies where to continue the list from after a previous
     *            call to ListFileShares. Optional.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Opaque pagination token returned from a previous ListFileShares
     * operation. If present, <code>Marker</code> specifies where to continue
     * the list from after a previous call to ListFileShares. Optional.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker <p>
     *            Opaque pagination token returned from a previous
     *            ListFileShares operation. If present, <code>Marker</code>
     *            specifies where to continue the list from after a previous
     *            call to ListFileShares. Optional.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFileSharesRequest withMarker(String marker) {
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFileSharesRequest == false)
            return false;
        ListFileSharesRequest other = (ListFileSharesRequest) obj;

        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
