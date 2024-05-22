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

public class VerifyMacResult implements Serializable {
    /**
     * <p>
     * The HMAC KMS key used in the verification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * A Boolean value that indicates whether the HMAC was verified. A value of
     * <code>True</code> indicates that the HMAC (<code>Mac</code>) was
     * generated with the specified <code>Message</code>, HMAC KMS key (
     * <code>KeyID</code>) and <code>MacAlgorithm.</code>.
     * </p>
     * <p>
     * If the HMAC is not verified, the <code>VerifyMac</code> operation fails
     * with a <code>KMSInvalidMacException</code> exception. This exception
     * indicates that one or more of the inputs changed since the HMAC was
     * computed.
     * </p>
     */
    private Boolean macValid;

    /**
     * <p>
     * The MAC algorithm used in the verification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HMAC_SHA_224, HMAC_SHA_256, HMAC_SHA_384,
     * HMAC_SHA_512
     */
    private String macAlgorithm;

    /**
     * <p>
     * The HMAC KMS key used in the verification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The HMAC KMS key used in the verification.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * The HMAC KMS key used in the verification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The HMAC KMS key used in the verification.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The HMAC KMS key used in the verification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The HMAC KMS key used in the verification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerifyMacResult withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the HMAC was verified. A value of
     * <code>True</code> indicates that the HMAC (<code>Mac</code>) was
     * generated with the specified <code>Message</code>, HMAC KMS key (
     * <code>KeyID</code>) and <code>MacAlgorithm.</code>.
     * </p>
     * <p>
     * If the HMAC is not verified, the <code>VerifyMac</code> operation fails
     * with a <code>KMSInvalidMacException</code> exception. This exception
     * indicates that one or more of the inputs changed since the HMAC was
     * computed.
     * </p>
     *
     * @return <p>
     *         A Boolean value that indicates whether the HMAC was verified. A
     *         value of <code>True</code> indicates that the HMAC (
     *         <code>Mac</code>) was generated with the specified
     *         <code>Message</code>, HMAC KMS key (<code>KeyID</code>) and
     *         <code>MacAlgorithm.</code>.
     *         </p>
     *         <p>
     *         If the HMAC is not verified, the <code>VerifyMac</code> operation
     *         fails with a <code>KMSInvalidMacException</code> exception. This
     *         exception indicates that one or more of the inputs changed since
     *         the HMAC was computed.
     *         </p>
     */
    public Boolean isMacValid() {
        return macValid;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the HMAC was verified. A value of
     * <code>True</code> indicates that the HMAC (<code>Mac</code>) was
     * generated with the specified <code>Message</code>, HMAC KMS key (
     * <code>KeyID</code>) and <code>MacAlgorithm.</code>.
     * </p>
     * <p>
     * If the HMAC is not verified, the <code>VerifyMac</code> operation fails
     * with a <code>KMSInvalidMacException</code> exception. This exception
     * indicates that one or more of the inputs changed since the HMAC was
     * computed.
     * </p>
     *
     * @return <p>
     *         A Boolean value that indicates whether the HMAC was verified. A
     *         value of <code>True</code> indicates that the HMAC (
     *         <code>Mac</code>) was generated with the specified
     *         <code>Message</code>, HMAC KMS key (<code>KeyID</code>) and
     *         <code>MacAlgorithm.</code>.
     *         </p>
     *         <p>
     *         If the HMAC is not verified, the <code>VerifyMac</code> operation
     *         fails with a <code>KMSInvalidMacException</code> exception. This
     *         exception indicates that one or more of the inputs changed since
     *         the HMAC was computed.
     *         </p>
     */
    public Boolean getMacValid() {
        return macValid;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the HMAC was verified. A value of
     * <code>True</code> indicates that the HMAC (<code>Mac</code>) was
     * generated with the specified <code>Message</code>, HMAC KMS key (
     * <code>KeyID</code>) and <code>MacAlgorithm.</code>.
     * </p>
     * <p>
     * If the HMAC is not verified, the <code>VerifyMac</code> operation fails
     * with a <code>KMSInvalidMacException</code> exception. This exception
     * indicates that one or more of the inputs changed since the HMAC was
     * computed.
     * </p>
     *
     * @param macValid <p>
     *            A Boolean value that indicates whether the HMAC was verified.
     *            A value of <code>True</code> indicates that the HMAC (
     *            <code>Mac</code>) was generated with the specified
     *            <code>Message</code>, HMAC KMS key (<code>KeyID</code>) and
     *            <code>MacAlgorithm.</code>.
     *            </p>
     *            <p>
     *            If the HMAC is not verified, the <code>VerifyMac</code>
     *            operation fails with a <code>KMSInvalidMacException</code>
     *            exception. This exception indicates that one or more of the
     *            inputs changed since the HMAC was computed.
     *            </p>
     */
    public void setMacValid(Boolean macValid) {
        this.macValid = macValid;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the HMAC was verified. A value of
     * <code>True</code> indicates that the HMAC (<code>Mac</code>) was
     * generated with the specified <code>Message</code>, HMAC KMS key (
     * <code>KeyID</code>) and <code>MacAlgorithm.</code>.
     * </p>
     * <p>
     * If the HMAC is not verified, the <code>VerifyMac</code> operation fails
     * with a <code>KMSInvalidMacException</code> exception. This exception
     * indicates that one or more of the inputs changed since the HMAC was
     * computed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param macValid <p>
     *            A Boolean value that indicates whether the HMAC was verified.
     *            A value of <code>True</code> indicates that the HMAC (
     *            <code>Mac</code>) was generated with the specified
     *            <code>Message</code>, HMAC KMS key (<code>KeyID</code>) and
     *            <code>MacAlgorithm.</code>.
     *            </p>
     *            <p>
     *            If the HMAC is not verified, the <code>VerifyMac</code>
     *            operation fails with a <code>KMSInvalidMacException</code>
     *            exception. This exception indicates that one or more of the
     *            inputs changed since the HMAC was computed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerifyMacResult withMacValid(Boolean macValid) {
        this.macValid = macValid;
        return this;
    }

    /**
     * <p>
     * The MAC algorithm used in the verification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HMAC_SHA_224, HMAC_SHA_256, HMAC_SHA_384,
     * HMAC_SHA_512
     *
     * @return <p>
     *         The MAC algorithm used in the verification.
     *         </p>
     * @see MacAlgorithmSpec
     */
    public String getMacAlgorithm() {
        return macAlgorithm;
    }

    /**
     * <p>
     * The MAC algorithm used in the verification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HMAC_SHA_224, HMAC_SHA_256, HMAC_SHA_384,
     * HMAC_SHA_512
     *
     * @param macAlgorithm <p>
     *            The MAC algorithm used in the verification.
     *            </p>
     * @see MacAlgorithmSpec
     */
    public void setMacAlgorithm(String macAlgorithm) {
        this.macAlgorithm = macAlgorithm;
    }

    /**
     * <p>
     * The MAC algorithm used in the verification.
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
     *            The MAC algorithm used in the verification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MacAlgorithmSpec
     */
    public VerifyMacResult withMacAlgorithm(String macAlgorithm) {
        this.macAlgorithm = macAlgorithm;
        return this;
    }

    /**
     * <p>
     * The MAC algorithm used in the verification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HMAC_SHA_224, HMAC_SHA_256, HMAC_SHA_384,
     * HMAC_SHA_512
     *
     * @param macAlgorithm <p>
     *            The MAC algorithm used in the verification.
     *            </p>
     * @see MacAlgorithmSpec
     */
    public void setMacAlgorithm(MacAlgorithmSpec macAlgorithm) {
        this.macAlgorithm = macAlgorithm.toString();
    }

    /**
     * <p>
     * The MAC algorithm used in the verification.
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
     *            The MAC algorithm used in the verification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MacAlgorithmSpec
     */
    public VerifyMacResult withMacAlgorithm(MacAlgorithmSpec macAlgorithm) {
        this.macAlgorithm = macAlgorithm.toString();
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
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getMacValid() != null)
            sb.append("MacValid: " + getMacValid() + ",");
        if (getMacAlgorithm() != null)
            sb.append("MacAlgorithm: " + getMacAlgorithm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getMacValid() == null) ? 0 : getMacValid().hashCode());
        hashCode = prime * hashCode
                + ((getMacAlgorithm() == null) ? 0 : getMacAlgorithm().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifyMacResult == false)
            return false;
        VerifyMacResult other = (VerifyMacResult) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getMacValid() == null ^ this.getMacValid() == null)
            return false;
        if (other.getMacValid() != null && other.getMacValid().equals(this.getMacValid()) == false)
            return false;
        if (other.getMacAlgorithm() == null ^ this.getMacAlgorithm() == null)
            return false;
        if (other.getMacAlgorithm() != null
                && other.getMacAlgorithm().equals(this.getMacAlgorithm()) == false)
            return false;
        return true;
    }
}
