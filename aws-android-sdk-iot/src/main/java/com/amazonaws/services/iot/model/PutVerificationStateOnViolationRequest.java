/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Set a verification state and provide a description of that verification state
 * on a violation (detect alarm).
 * </p>
 */
public class PutVerificationStateOnViolationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The violation ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     */
    private String violationId;

    /**
     * <p>
     * The verification state of the violation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FALSE_POSITIVE, BENIGN_POSITIVE, TRUE_POSITIVE,
     * UNKNOWN
     */
    private String verificationState;

    /**
     * <p>
     * The description of the verification state of the violation (detect
     * alarm).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     */
    private String verificationStateDescription;

    /**
     * <p>
     * The violation ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @return <p>
     *         The violation ID.
     *         </p>
     */
    public String getViolationId() {
        return violationId;
    }

    /**
     * <p>
     * The violation ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param violationId <p>
     *            The violation ID.
     *            </p>
     */
    public void setViolationId(String violationId) {
        this.violationId = violationId;
    }

    /**
     * <p>
     * The violation ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param violationId <p>
     *            The violation ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutVerificationStateOnViolationRequest withViolationId(String violationId) {
        this.violationId = violationId;
        return this;
    }

    /**
     * <p>
     * The verification state of the violation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FALSE_POSITIVE, BENIGN_POSITIVE, TRUE_POSITIVE,
     * UNKNOWN
     *
     * @return <p>
     *         The verification state of the violation.
     *         </p>
     * @see VerificationState
     */
    public String getVerificationState() {
        return verificationState;
    }

    /**
     * <p>
     * The verification state of the violation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FALSE_POSITIVE, BENIGN_POSITIVE, TRUE_POSITIVE,
     * UNKNOWN
     *
     * @param verificationState <p>
     *            The verification state of the violation.
     *            </p>
     * @see VerificationState
     */
    public void setVerificationState(String verificationState) {
        this.verificationState = verificationState;
    }

    /**
     * <p>
     * The verification state of the violation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FALSE_POSITIVE, BENIGN_POSITIVE, TRUE_POSITIVE,
     * UNKNOWN
     *
     * @param verificationState <p>
     *            The verification state of the violation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VerificationState
     */
    public PutVerificationStateOnViolationRequest withVerificationState(String verificationState) {
        this.verificationState = verificationState;
        return this;
    }

    /**
     * <p>
     * The verification state of the violation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FALSE_POSITIVE, BENIGN_POSITIVE, TRUE_POSITIVE,
     * UNKNOWN
     *
     * @param verificationState <p>
     *            The verification state of the violation.
     *            </p>
     * @see VerificationState
     */
    public void setVerificationState(VerificationState verificationState) {
        this.verificationState = verificationState.toString();
    }

    /**
     * <p>
     * The verification state of the violation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FALSE_POSITIVE, BENIGN_POSITIVE, TRUE_POSITIVE,
     * UNKNOWN
     *
     * @param verificationState <p>
     *            The verification state of the violation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VerificationState
     */
    public PutVerificationStateOnViolationRequest withVerificationState(
            VerificationState verificationState) {
        this.verificationState = verificationState.toString();
        return this;
    }

    /**
     * <p>
     * The description of the verification state of the violation (detect
     * alarm).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @return <p>
     *         The description of the verification state of the violation
     *         (detect alarm).
     *         </p>
     */
    public String getVerificationStateDescription() {
        return verificationStateDescription;
    }

    /**
     * <p>
     * The description of the verification state of the violation (detect
     * alarm).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @param verificationStateDescription <p>
     *            The description of the verification state of the violation
     *            (detect alarm).
     *            </p>
     */
    public void setVerificationStateDescription(String verificationStateDescription) {
        this.verificationStateDescription = verificationStateDescription;
    }

    /**
     * <p>
     * The description of the verification state of the violation (detect
     * alarm).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @param verificationStateDescription <p>
     *            The description of the verification state of the violation
     *            (detect alarm).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutVerificationStateOnViolationRequest withVerificationStateDescription(
            String verificationStateDescription) {
        this.verificationStateDescription = verificationStateDescription;
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
        if (getViolationId() != null)
            sb.append("violationId: " + getViolationId() + ",");
        if (getVerificationState() != null)
            sb.append("verificationState: " + getVerificationState() + ",");
        if (getVerificationStateDescription() != null)
            sb.append("verificationStateDescription: " + getVerificationStateDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getViolationId() == null) ? 0 : getViolationId().hashCode());
        hashCode = prime * hashCode
                + ((getVerificationState() == null) ? 0 : getVerificationState().hashCode());
        hashCode = prime
                * hashCode
                + ((getVerificationStateDescription() == null) ? 0
                        : getVerificationStateDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutVerificationStateOnViolationRequest == false)
            return false;
        PutVerificationStateOnViolationRequest other = (PutVerificationStateOnViolationRequest) obj;

        if (other.getViolationId() == null ^ this.getViolationId() == null)
            return false;
        if (other.getViolationId() != null
                && other.getViolationId().equals(this.getViolationId()) == false)
            return false;
        if (other.getVerificationState() == null ^ this.getVerificationState() == null)
            return false;
        if (other.getVerificationState() != null
                && other.getVerificationState().equals(this.getVerificationState()) == false)
            return false;
        if (other.getVerificationStateDescription() == null
                ^ this.getVerificationStateDescription() == null)
            return false;
        if (other.getVerificationStateDescription() != null
                && other.getVerificationStateDescription().equals(
                        this.getVerificationStateDescription()) == false)
            return false;
        return true;
    }
}
