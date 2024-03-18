/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class GenerateMacResult implements Serializable {
    /**
     * <p>
     * The hash-based message authentication code (HMAC) that was generated for
     * the specified message, HMAC KMS key, and MAC algorithm.
     * </p>
     * <p>
     * This is the standard, raw HMAC defined in <a
     * href="https://datatracker.ietf.org/doc/html/rfc2104">RFC 2104</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     */
    private java.nio.ByteBuffer mac;

    /**
     * <p>
     * The MAC algorithm that was used to generate the HMAC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HMAC_SHA_224, HMAC_SHA_256, HMAC_SHA_384,
     * HMAC_SHA_512
     */
    private String macAlgorithm;

    /**
     * <p>
     * The HMAC KMS key used in the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * The hash-based message authentication code (HMAC) that was generated for
     * the specified message, HMAC KMS key, and MAC algorithm.
     * </p>
     * <p>
     * This is the standard, raw HMAC defined in <a
     * href="https://datatracker.ietf.org/doc/html/rfc2104">RFC 2104</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @return <p>
     *         The hash-based message authentication code (HMAC) that was
     *         generated for the specified message, HMAC KMS key, and MAC
     *         algorithm.
     *         </p>
     *         <p>
     *         This is the standard, raw HMAC defined in <a
     *         href="https://datatracker.ietf.org/doc/html/rfc2104">RFC
     *         2104</a>.
     *         </p>
     */
    public java.nio.ByteBuffer getMac() {
        return mac;
    }

    /**
     * <p>
     * The hash-based message authentication code (HMAC) that was generated for
     * the specified message, HMAC KMS key, and MAC algorithm.
     * </p>
     * <p>
     * This is the standard, raw HMAC defined in <a
     * href="https://datatracker.ietf.org/doc/html/rfc2104">RFC 2104</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param mac <p>
     *            The hash-based message authentication code (HMAC) that was
     *            generated for the specified message, HMAC KMS key, and MAC
     *            algorithm.
     *            </p>
     *            <p>
     *            This is the standard, raw HMAC defined in <a
     *            href="https://datatracker.ietf.org/doc/html/rfc2104">RFC
     *            2104</a>.
     *            </p>
     */
    public void setMac(java.nio.ByteBuffer mac) {
        this.mac = mac;
    }

    /**
     * <p>
     * The hash-based message authentication code (HMAC) that was generated for
     * the specified message, HMAC KMS key, and MAC algorithm.
     * </p>
     * <p>
     * This is the standard, raw HMAC defined in <a
     * href="https://datatracker.ietf.org/doc/html/rfc2104">RFC 2104</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param mac <p>
     *            The hash-based message authentication code (HMAC) that was
     *            generated for the specified message, HMAC KMS key, and MAC
     *            algorithm.
     *            </p>
     *            <p>
     *            This is the standard, raw HMAC defined in <a
     *            href="https://datatracker.ietf.org/doc/html/rfc2104">RFC
     *            2104</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenerateMacResult withMac(java.nio.ByteBuffer mac) {
        this.mac = mac;
        return this;
    }

    /**
     * <p>
     * The MAC algorithm that was used to generate the HMAC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HMAC_SHA_224, HMAC_SHA_256, HMAC_SHA_384,
     * HMAC_SHA_512
     *
     * @return <p>
     *         The MAC algorithm that was used to generate the HMAC.
     *         </p>
     * @see MacAlgorithmSpec
     */
    public String getMacAlgorithm() {
        return macAlgorithm;
    }

    /**
     * <p>
     * The MAC algorithm that was used to generate the HMAC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HMAC_SHA_224, HMAC_SHA_256, HMAC_SHA_384,
     * HMAC_SHA_512
     *
     * @param macAlgorithm <p>
     *            The MAC algorithm that was used to generate the HMAC.
     *            </p>
     * @see MacAlgorithmSpec
     */
    public void setMacAlgorithm(String macAlgorithm) {
        this.macAlgorithm = macAlgorithm;
    }

    /**
     * <p>
     * The MAC algorithm that was used to generate the HMAC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HMAC_SHA_224, HMAC_SHA_256, HMAC_SHA_384,
     * HMAC_SHA_512
     *
     * @param macAlgorithm <p>
     *            The MAC algorithm that was used to generate the HMAC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MacAlgorithmSpec
     */
    public GenerateMacResult withMacAlgorithm(String macAlgorithm) {
        this.macAlgorithm = macAlgorithm;
        return this;
    }

    /**
     * <p>
     * The MAC algorithm that was used to generate the HMAC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HMAC_SHA_224, HMAC_SHA_256, HMAC_SHA_384,
     * HMAC_SHA_512
     *
     * @param macAlgorithm <p>
     *            The MAC algorithm that was used to generate the HMAC.
     *            </p>
     * @see MacAlgorithmSpec
     */
    public void setMacAlgorithm(MacAlgorithmSpec macAlgorithm) {
        this.macAlgorithm = macAlgorithm.toString();
    }

    /**
     * <p>
     * The MAC algorithm that was used to generate the HMAC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HMAC_SHA_224, HMAC_SHA_256, HMAC_SHA_384,
     * HMAC_SHA_512
     *
     * @param macAlgorithm <p>
     *            The MAC algorithm that was used to generate the HMAC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MacAlgorithmSpec
     */
    public GenerateMacResult withMacAlgorithm(MacAlgorithmSpec macAlgorithm) {
        this.macAlgorithm = macAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * The HMAC KMS key used in the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The HMAC KMS key used in the operation.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * The HMAC KMS key used in the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The HMAC KMS key used in the operation.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The HMAC KMS key used in the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The HMAC KMS key used in the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenerateMacResult withKeyId(String keyId) {
        this.keyId = keyId;
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
        if (getMac() != null)
            sb.append("Mac: " + getMac() + ",");
        if (getMacAlgorithm() != null)
            sb.append("MacAlgorithm: " + getMacAlgorithm() + ",");
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMac() == null) ? 0 : getMac().hashCode());
        hashCode = prime * hashCode
                + ((getMacAlgorithm() == null) ? 0 : getMacAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateMacResult == false)
            return false;
        GenerateMacResult other = (GenerateMacResult) obj;

        if (other.getMac() == null ^ this.getMac() == null)
            return false;
        if (other.getMac() != null && other.getMac().equals(this.getMac()) == false)
            return false;
        if (other.getMacAlgorithm() == null ^ this.getMacAlgorithm() == null)
            return false;
        if (other.getMacAlgorithm() != null
                && other.getMacAlgorithm().equals(this.getMacAlgorithm()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        return true;
    }
}
