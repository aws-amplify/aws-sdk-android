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

package com.amazonaws.services.awsstoragegateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves an archived virtual tape from the virtual tape shelf (VTS) to a
 * tape gateway. Virtual tapes archived in the VTS are not associated with any
 * gateway. However after a tape is retrieved, it is associated with a gateway,
 * even though it is also listed in the VTS, that is, archive. This operation is
 * only supported in the tape gateway type.
 * </p>
 * <p>
 * Once a tape is successfully retrieved to a gateway, it cannot be retrieved
 * again to another gateway. You must archive the tape again before you can
 * retrieve it to another gateway. This operation is only supported in the tape
 * gateway type.
 * </p>
 */
public class RetrieveTapeArchiveRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual tape you want to retrieve
     * from the virtual tape shelf (VTS).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov):storagegateway:[a-z\-0-9]+:[0
     * -9]+:tape\/[0-9A-Z]{7,16}$<br/>
     */
    private String tapeARN;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway you want to retrieve the
     * virtual tape to. Use the <a>ListGateways</a> operation to return a list
     * of gateways for your account and AWS Region.
     * </p>
     * <p>
     * You retrieve archived virtual tapes to only one gateway and the gateway
     * must be a tape gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual tape you want to retrieve
     * from the virtual tape shelf (VTS).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov):storagegateway:[a-z\-0-9]+:[0
     * -9]+:tape\/[0-9A-Z]{7,16}$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the virtual tape you want to
     *         retrieve from the virtual tape shelf (VTS).
     *         </p>
     */
    public String getTapeARN() {
        return tapeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual tape you want to retrieve
     * from the virtual tape shelf (VTS).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov):storagegateway:[a-z\-0-9]+:[0
     * -9]+:tape\/[0-9A-Z]{7,16}$<br/>
     *
     * @param tapeARN <p>
     *            The Amazon Resource Name (ARN) of the virtual tape you want to
     *            retrieve from the virtual tape shelf (VTS).
     *            </p>
     */
    public void setTapeARN(String tapeARN) {
        this.tapeARN = tapeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual tape you want to retrieve
     * from the virtual tape shelf (VTS).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov):storagegateway:[a-z\-0-9]+:[0
     * -9]+:tape\/[0-9A-Z]{7,16}$<br/>
     *
     * @param tapeARN <p>
     *            The Amazon Resource Name (ARN) of the virtual tape you want to
     *            retrieve from the virtual tape shelf (VTS).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RetrieveTapeArchiveRequest withTapeARN(String tapeARN) {
        this.tapeARN = tapeARN;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway you want to retrieve the
     * virtual tape to. Use the <a>ListGateways</a> operation to return a list
     * of gateways for your account and AWS Region.
     * </p>
     * <p>
     * You retrieve archived virtual tapes to only one gateway and the gateway
     * must be a tape gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the gateway you want to
     *         retrieve the virtual tape to. Use the <a>ListGateways</a>
     *         operation to return a list of gateways for your account and AWS
     *         Region.
     *         </p>
     *         <p>
     *         You retrieve archived virtual tapes to only one gateway and the
     *         gateway must be a tape gateway.
     *         </p>
     */
    public String getGatewayARN() {
        return gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway you want to retrieve the
     * virtual tape to. Use the <a>ListGateways</a> operation to return a list
     * of gateways for your account and AWS Region.
     * </p>
     * <p>
     * You retrieve archived virtual tapes to only one gateway and the gateway
     * must be a tape gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway you want to
     *            retrieve the virtual tape to. Use the <a>ListGateways</a>
     *            operation to return a list of gateways for your account and
     *            AWS Region.
     *            </p>
     *            <p>
     *            You retrieve archived virtual tapes to only one gateway and
     *            the gateway must be a tape gateway.
     *            </p>
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway you want to retrieve the
     * virtual tape to. Use the <a>ListGateways</a> operation to return a list
     * of gateways for your account and AWS Region.
     * </p>
     * <p>
     * You retrieve archived virtual tapes to only one gateway and the gateway
     * must be a tape gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway you want to
     *            retrieve the virtual tape to. Use the <a>ListGateways</a>
     *            operation to return a list of gateways for your account and
     *            AWS Region.
     *            </p>
     *            <p>
     *            You retrieve archived virtual tapes to only one gateway and
     *            the gateway must be a tape gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RetrieveTapeArchiveRequest withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
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
        if (getTapeARN() != null)
            sb.append("TapeARN: " + getTapeARN() + ",");
        if (getGatewayARN() != null)
            sb.append("GatewayARN: " + getGatewayARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTapeARN() == null) ? 0 : getTapeARN().hashCode());
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetrieveTapeArchiveRequest == false)
            return false;
        RetrieveTapeArchiveRequest other = (RetrieveTapeArchiveRequest) obj;

        if (other.getTapeARN() == null ^ this.getTapeARN() == null)
            return false;
        if (other.getTapeARN() != null && other.getTapeARN().equals(this.getTapeARN()) == false)
            return false;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        return true;
    }
}
