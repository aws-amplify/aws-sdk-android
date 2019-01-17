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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a random byte string that is cryptographically secure.
 * </p>
 * <p>
 * By default, the random byte string is generated in AWS KMS. To generate the
 * byte string in the AWS CloudHSM cluster that is associated with a <a href=
 * "http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html"
 * >custom key store</a>, specify the custom key store ID.
 * </p>
 * <p>
 * For more information about entropy and random number generation, see the <a
 * href="https://d0.awsstatic.com/whitepapers/KMS-Cryptographic-Details.pdf">AWS
 * Key Management Service Cryptographic Details</a> whitepaper.
 * </p>
 */
public class GenerateRandomRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The length of the byte string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     */
    private Integer numberOfBytes;

    /**
     * <p>
     * Generates the random byte string in the AWS CloudHSM cluster that is
     * associated with the specified <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html"
     * >custom key store</a>. To find the ID of a custom key store, use the
     * <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String customKeyStoreId;

    /**
     * <p>
     * The length of the byte string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The length of the byte string.
     *         </p>
     */
    public Integer getNumberOfBytes() {
        return numberOfBytes;
    }

    /**
     * <p>
     * The length of the byte string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     *
     * @param numberOfBytes <p>
     *            The length of the byte string.
     *            </p>
     */
    public void setNumberOfBytes(Integer numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
    }

    /**
     * <p>
     * The length of the byte string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     *
     * @param numberOfBytes <p>
     *            The length of the byte string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenerateRandomRequest withNumberOfBytes(Integer numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
        return this;
    }

    /**
     * <p>
     * Generates the random byte string in the AWS CloudHSM cluster that is
     * associated with the specified <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html"
     * >custom key store</a>. To find the ID of a custom key store, use the
     * <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         Generates the random byte string in the AWS CloudHSM cluster that
     *         is associated with the specified <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html"
     *         >custom key store</a>. To find the ID of a custom key store, use
     *         the <a>DescribeCustomKeyStores</a> operation.
     *         </p>
     */
    public String getCustomKeyStoreId() {
        return customKeyStoreId;
    }

    /**
     * <p>
     * Generates the random byte string in the AWS CloudHSM cluster that is
     * associated with the specified <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html"
     * >custom key store</a>. To find the ID of a custom key store, use the
     * <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param customKeyStoreId <p>
     *            Generates the random byte string in the AWS CloudHSM cluster
     *            that is associated with the specified <a href=
     *            "http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html"
     *            >custom key store</a>. To find the ID of a custom key store,
     *            use the <a>DescribeCustomKeyStores</a> operation.
     *            </p>
     */
    public void setCustomKeyStoreId(String customKeyStoreId) {
        this.customKeyStoreId = customKeyStoreId;
    }

    /**
     * <p>
     * Generates the random byte string in the AWS CloudHSM cluster that is
     * associated with the specified <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html"
     * >custom key store</a>. To find the ID of a custom key store, use the
     * <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param customKeyStoreId <p>
     *            Generates the random byte string in the AWS CloudHSM cluster
     *            that is associated with the specified <a href=
     *            "http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html"
     *            >custom key store</a>. To find the ID of a custom key store,
     *            use the <a>DescribeCustomKeyStores</a> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenerateRandomRequest withCustomKeyStoreId(String customKeyStoreId) {
        this.customKeyStoreId = customKeyStoreId;
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
        if (getNumberOfBytes() != null)
            sb.append("NumberOfBytes: " + getNumberOfBytes() + ",");
        if (getCustomKeyStoreId() != null)
            sb.append("CustomKeyStoreId: " + getCustomKeyStoreId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNumberOfBytes() == null) ? 0 : getNumberOfBytes().hashCode());
        hashCode = prime * hashCode
                + ((getCustomKeyStoreId() == null) ? 0 : getCustomKeyStoreId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateRandomRequest == false)
            return false;
        GenerateRandomRequest other = (GenerateRandomRequest) obj;

        if (other.getNumberOfBytes() == null ^ this.getNumberOfBytes() == null)
            return false;
        if (other.getNumberOfBytes() != null
                && other.getNumberOfBytes().equals(this.getNumberOfBytes()) == false)
            return false;
        if (other.getCustomKeyStoreId() == null ^ this.getCustomKeyStoreId() == null)
            return false;
        if (other.getCustomKeyStoreId() != null
                && other.getCustomKeyStoreId().equals(this.getCustomKeyStoreId()) == false)
            return false;
        return true;
    }
}
