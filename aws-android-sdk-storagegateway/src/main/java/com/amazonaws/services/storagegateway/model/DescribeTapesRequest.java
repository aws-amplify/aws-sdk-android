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
 * Returns a description of the specified Amazon Resource Name (ARN) of virtual
 * tapes. If a <code>TapeARN</code> is not specified, returns a description of
 * all virtual tapes associated with the specified gateway. This operation is
 * only supported in the tape gateway type.
 * </p>
 */
public class DescribeTapesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * <p>
     * Specifies one or more unique Amazon Resource Names (ARNs) that represent
     * the virtual tapes you want to describe. If this parameter is not
     * specified, Tape gateway returns a description of all virtual tapes
     * associated with the specified gateway.
     * </p>
     */
    private java.util.List<String> tapeARNs;

    /**
     * <p>
     * A marker value, obtained in a previous call to <code>DescribeTapes</code>
     * . This marker indicates which page of results to retrieve.
     * </p>
     * <p>
     * If not specified, the first page of results is retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String marker;

    /**
     * <p>
     * Specifies that the number of virtual tapes described be limited to the
     * specified number.
     * </p>
     * <note>
     * <p>
     * Amazon Web Services may impose its own limit, if this field is not set.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer limit;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for
     *         your account and AWS Region.
     *         </p>
     */
    public String getGatewayARN() {
        return gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway. Use the
     *            <a>ListGateways</a> operation to return a list of gateways for
     *            your account and AWS Region.
     *            </p>
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway. Use the
     *            <a>ListGateways</a> operation to return a list of gateways for
     *            your account and AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTapesRequest withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * <p>
     * Specifies one or more unique Amazon Resource Names (ARNs) that represent
     * the virtual tapes you want to describe. If this parameter is not
     * specified, Tape gateway returns a description of all virtual tapes
     * associated with the specified gateway.
     * </p>
     *
     * @return <p>
     *         Specifies one or more unique Amazon Resource Names (ARNs) that
     *         represent the virtual tapes you want to describe. If this
     *         parameter is not specified, Tape gateway returns a description of
     *         all virtual tapes associated with the specified gateway.
     *         </p>
     */
    public java.util.List<String> getTapeARNs() {
        return tapeARNs;
    }

    /**
     * <p>
     * Specifies one or more unique Amazon Resource Names (ARNs) that represent
     * the virtual tapes you want to describe. If this parameter is not
     * specified, Tape gateway returns a description of all virtual tapes
     * associated with the specified gateway.
     * </p>
     *
     * @param tapeARNs <p>
     *            Specifies one or more unique Amazon Resource Names (ARNs) that
     *            represent the virtual tapes you want to describe. If this
     *            parameter is not specified, Tape gateway returns a description
     *            of all virtual tapes associated with the specified gateway.
     *            </p>
     */
    public void setTapeARNs(java.util.Collection<String> tapeARNs) {
        if (tapeARNs == null) {
            this.tapeARNs = null;
            return;
        }

        this.tapeARNs = new java.util.ArrayList<String>(tapeARNs);
    }

    /**
     * <p>
     * Specifies one or more unique Amazon Resource Names (ARNs) that represent
     * the virtual tapes you want to describe. If this parameter is not
     * specified, Tape gateway returns a description of all virtual tapes
     * associated with the specified gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tapeARNs <p>
     *            Specifies one or more unique Amazon Resource Names (ARNs) that
     *            represent the virtual tapes you want to describe. If this
     *            parameter is not specified, Tape gateway returns a description
     *            of all virtual tapes associated with the specified gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTapesRequest withTapeARNs(String... tapeARNs) {
        if (getTapeARNs() == null) {
            this.tapeARNs = new java.util.ArrayList<String>(tapeARNs.length);
        }
        for (String value : tapeARNs) {
            this.tapeARNs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies one or more unique Amazon Resource Names (ARNs) that represent
     * the virtual tapes you want to describe. If this parameter is not
     * specified, Tape gateway returns a description of all virtual tapes
     * associated with the specified gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tapeARNs <p>
     *            Specifies one or more unique Amazon Resource Names (ARNs) that
     *            represent the virtual tapes you want to describe. If this
     *            parameter is not specified, Tape gateway returns a description
     *            of all virtual tapes associated with the specified gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTapesRequest withTapeARNs(java.util.Collection<String> tapeARNs) {
        setTapeARNs(tapeARNs);
        return this;
    }

    /**
     * <p>
     * A marker value, obtained in a previous call to <code>DescribeTapes</code>
     * . This marker indicates which page of results to retrieve.
     * </p>
     * <p>
     * If not specified, the first page of results is retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         A marker value, obtained in a previous call to
     *         <code>DescribeTapes</code>. This marker indicates which page of
     *         results to retrieve.
     *         </p>
     *         <p>
     *         If not specified, the first page of results is retrieved.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * A marker value, obtained in a previous call to <code>DescribeTapes</code>
     * . This marker indicates which page of results to retrieve.
     * </p>
     * <p>
     * If not specified, the first page of results is retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker <p>
     *            A marker value, obtained in a previous call to
     *            <code>DescribeTapes</code>. This marker indicates which page
     *            of results to retrieve.
     *            </p>
     *            <p>
     *            If not specified, the first page of results is retrieved.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A marker value, obtained in a previous call to <code>DescribeTapes</code>
     * . This marker indicates which page of results to retrieve.
     * </p>
     * <p>
     * If not specified, the first page of results is retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker <p>
     *            A marker value, obtained in a previous call to
     *            <code>DescribeTapes</code>. This marker indicates which page
     *            of results to retrieve.
     *            </p>
     *            <p>
     *            If not specified, the first page of results is retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTapesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * Specifies that the number of virtual tapes described be limited to the
     * specified number.
     * </p>
     * <note>
     * <p>
     * Amazon Web Services may impose its own limit, if this field is not set.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         Specifies that the number of virtual tapes described be limited
     *         to the specified number.
     *         </p>
     *         <note>
     *         <p>
     *         Amazon Web Services may impose its own limit, if this field is
     *         not set.
     *         </p>
     *         </note>
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>
     * Specifies that the number of virtual tapes described be limited to the
     * specified number.
     * </p>
     * <note>
     * <p>
     * Amazon Web Services may impose its own limit, if this field is not set.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit <p>
     *            Specifies that the number of virtual tapes described be
     *            limited to the specified number.
     *            </p>
     *            <note>
     *            <p>
     *            Amazon Web Services may impose its own limit, if this field is
     *            not set.
     *            </p>
     *            </note>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Specifies that the number of virtual tapes described be limited to the
     * specified number.
     * </p>
     * <note>
     * <p>
     * Amazon Web Services may impose its own limit, if this field is not set.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit <p>
     *            Specifies that the number of virtual tapes described be
     *            limited to the specified number.
     *            </p>
     *            <note>
     *            <p>
     *            Amazon Web Services may impose its own limit, if this field is
     *            not set.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTapesRequest withLimit(Integer limit) {
        this.limit = limit;
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
        if (getTapeARNs() != null)
            sb.append("TapeARNs: " + getTapeARNs() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getTapeARNs() == null) ? 0 : getTapeARNs().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTapesRequest == false)
            return false;
        DescribeTapesRequest other = (DescribeTapesRequest) obj;

        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getTapeARNs() == null ^ this.getTapeARNs() == null)
            return false;
        if (other.getTapeARNs() != null && other.getTapeARNs().equals(this.getTapeARNs()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }
}
