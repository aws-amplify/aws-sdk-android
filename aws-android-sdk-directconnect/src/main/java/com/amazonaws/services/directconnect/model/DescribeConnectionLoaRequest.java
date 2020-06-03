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

package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deprecated. Use <a>DescribeLoa</a> instead.
 * </p>
 * <p>
 * Gets the LOA-CFA for a connection.
 * </p>
 * <p>
 * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a
 * document that your APN partner or service provider uses when establishing
 * your cross connect to AWS at the colocation facility. For more information,
 * see <a href=
 * "https://docs.aws.amazon.com/directconnect/latest/UserGuide/Colocation.html"
 * >Requesting Cross Connects at AWS Direct Connect Locations</a> in the <i>AWS
 * Direct Connect User Guide</i>.
 * </p>
 */
public class DescribeConnectionLoaRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the connection.
     * </p>
     */
    private String connectionId;

    /**
     * <p>
     * The name of the APN partner or service provider who establishes
     * connectivity on your behalf. If you specify this parameter, the LOA-CFA
     * lists the provider name alongside your company name as the requester of
     * the cross connect.
     * </p>
     */
    private String providerName;

    /**
     * <p>
     * The standard media type for the LOA-CFA document. The only supported
     * value is application/pdf.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>application/pdf
     */
    private String loaContentType;

    /**
     * <p>
     * The ID of the connection.
     * </p>
     *
     * @return <p>
     *         The ID of the connection.
     *         </p>
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * <p>
     * The ID of the connection.
     * </p>
     *
     * @param connectionId <p>
     *            The ID of the connection.
     *            </p>
     */
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionId <p>
     *            The ID of the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeConnectionLoaRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * <p>
     * The name of the APN partner or service provider who establishes
     * connectivity on your behalf. If you specify this parameter, the LOA-CFA
     * lists the provider name alongside your company name as the requester of
     * the cross connect.
     * </p>
     *
     * @return <p>
     *         The name of the APN partner or service provider who establishes
     *         connectivity on your behalf. If you specify this parameter, the
     *         LOA-CFA lists the provider name alongside your company name as
     *         the requester of the cross connect.
     *         </p>
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * <p>
     * The name of the APN partner or service provider who establishes
     * connectivity on your behalf. If you specify this parameter, the LOA-CFA
     * lists the provider name alongside your company name as the requester of
     * the cross connect.
     * </p>
     *
     * @param providerName <p>
     *            The name of the APN partner or service provider who
     *            establishes connectivity on your behalf. If you specify this
     *            parameter, the LOA-CFA lists the provider name alongside your
     *            company name as the requester of the cross connect.
     *            </p>
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The name of the APN partner or service provider who establishes
     * connectivity on your behalf. If you specify this parameter, the LOA-CFA
     * lists the provider name alongside your company name as the requester of
     * the cross connect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param providerName <p>
     *            The name of the APN partner or service provider who
     *            establishes connectivity on your behalf. If you specify this
     *            parameter, the LOA-CFA lists the provider name alongside your
     *            company name as the requester of the cross connect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeConnectionLoaRequest withProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    /**
     * <p>
     * The standard media type for the LOA-CFA document. The only supported
     * value is application/pdf.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>application/pdf
     *
     * @return <p>
     *         The standard media type for the LOA-CFA document. The only
     *         supported value is application/pdf.
     *         </p>
     * @see LoaContentType
     */
    public String getLoaContentType() {
        return loaContentType;
    }

    /**
     * <p>
     * The standard media type for the LOA-CFA document. The only supported
     * value is application/pdf.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>application/pdf
     *
     * @param loaContentType <p>
     *            The standard media type for the LOA-CFA document. The only
     *            supported value is application/pdf.
     *            </p>
     * @see LoaContentType
     */
    public void setLoaContentType(String loaContentType) {
        this.loaContentType = loaContentType;
    }

    /**
     * <p>
     * The standard media type for the LOA-CFA document. The only supported
     * value is application/pdf.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>application/pdf
     *
     * @param loaContentType <p>
     *            The standard media type for the LOA-CFA document. The only
     *            supported value is application/pdf.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoaContentType
     */
    public DescribeConnectionLoaRequest withLoaContentType(String loaContentType) {
        this.loaContentType = loaContentType;
        return this;
    }

    /**
     * <p>
     * The standard media type for the LOA-CFA document. The only supported
     * value is application/pdf.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>application/pdf
     *
     * @param loaContentType <p>
     *            The standard media type for the LOA-CFA document. The only
     *            supported value is application/pdf.
     *            </p>
     * @see LoaContentType
     */
    public void setLoaContentType(LoaContentType loaContentType) {
        this.loaContentType = loaContentType.toString();
    }

    /**
     * <p>
     * The standard media type for the LOA-CFA document. The only supported
     * value is application/pdf.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>application/pdf
     *
     * @param loaContentType <p>
     *            The standard media type for the LOA-CFA document. The only
     *            supported value is application/pdf.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoaContentType
     */
    public DescribeConnectionLoaRequest withLoaContentType(LoaContentType loaContentType) {
        this.loaContentType = loaContentType.toString();
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
        if (getConnectionId() != null)
            sb.append("connectionId: " + getConnectionId() + ",");
        if (getProviderName() != null)
            sb.append("providerName: " + getProviderName() + ",");
        if (getLoaContentType() != null)
            sb.append("loaContentType: " + getLoaContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode
                + ((getProviderName() == null) ? 0 : getProviderName().hashCode());
        hashCode = prime * hashCode
                + ((getLoaContentType() == null) ? 0 : getLoaContentType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConnectionLoaRequest == false)
            return false;
        DescribeConnectionLoaRequest other = (DescribeConnectionLoaRequest) obj;

        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null
                && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getProviderName() == null ^ this.getProviderName() == null)
            return false;
        if (other.getProviderName() != null
                && other.getProviderName().equals(this.getProviderName()) == false)
            return false;
        if (other.getLoaContentType() == null ^ this.getLoaContentType() == null)
            return false;
        if (other.getLoaContentType() != null
                && other.getLoaContentType().equals(this.getLoaContentType()) == false)
            return false;
        return true;
    }
}
