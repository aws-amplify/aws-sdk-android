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

/**
 * <p>
 * Describes Challenge-Handshake Authentication Protocol (CHAP) information that
 * supports authentication between your gateway and iSCSI initiators.
 * </p>
 */
public class ChapInfo implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     */
    private String targetARN;

    /**
     * <p>
     * The secret key that the initiator (for example, the Windows client) must
     * provide to participate in mutual CHAP with the target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String secretToAuthenticateInitiator;

    /**
     * <p>
     * The iSCSI initiator that connects to the target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[0-9a-z:.-]+<br/>
     */
    private String initiatorName;

    /**
     * <p>
     * The secret key that the target must provide to participate in mutual CHAP
     * with the initiator (e.g. Windows client).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String secretToAuthenticateTarget;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the volume.
     *         </p>
     *         <p>
     *         Valid Values: 50 to 500 lowercase letters, numbers, periods (.),
     *         and hyphens (-).
     *         </p>
     */
    public String getTargetARN() {
        return targetARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     *
     * @param targetARN <p>
     *            The Amazon Resource Name (ARN) of the volume.
     *            </p>
     *            <p>
     *            Valid Values: 50 to 500 lowercase letters, numbers, periods
     *            (.), and hyphens (-).
     *            </p>
     */
    public void setTargetARN(String targetARN) {
        this.targetARN = targetARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     *
     * @param targetARN <p>
     *            The Amazon Resource Name (ARN) of the volume.
     *            </p>
     *            <p>
     *            Valid Values: 50 to 500 lowercase letters, numbers, periods
     *            (.), and hyphens (-).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChapInfo withTargetARN(String targetARN) {
        this.targetARN = targetARN;
        return this;
    }

    /**
     * <p>
     * The secret key that the initiator (for example, the Windows client) must
     * provide to participate in mutual CHAP with the target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The secret key that the initiator (for example, the Windows
     *         client) must provide to participate in mutual CHAP with the
     *         target.
     *         </p>
     */
    public String getSecretToAuthenticateInitiator() {
        return secretToAuthenticateInitiator;
    }

    /**
     * <p>
     * The secret key that the initiator (for example, the Windows client) must
     * provide to participate in mutual CHAP with the target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param secretToAuthenticateInitiator <p>
     *            The secret key that the initiator (for example, the Windows
     *            client) must provide to participate in mutual CHAP with the
     *            target.
     *            </p>
     */
    public void setSecretToAuthenticateInitiator(String secretToAuthenticateInitiator) {
        this.secretToAuthenticateInitiator = secretToAuthenticateInitiator;
    }

    /**
     * <p>
     * The secret key that the initiator (for example, the Windows client) must
     * provide to participate in mutual CHAP with the target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param secretToAuthenticateInitiator <p>
     *            The secret key that the initiator (for example, the Windows
     *            client) must provide to participate in mutual CHAP with the
     *            target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChapInfo withSecretToAuthenticateInitiator(String secretToAuthenticateInitiator) {
        this.secretToAuthenticateInitiator = secretToAuthenticateInitiator;
        return this;
    }

    /**
     * <p>
     * The iSCSI initiator that connects to the target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[0-9a-z:.-]+<br/>
     *
     * @return <p>
     *         The iSCSI initiator that connects to the target.
     *         </p>
     */
    public String getInitiatorName() {
        return initiatorName;
    }

    /**
     * <p>
     * The iSCSI initiator that connects to the target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[0-9a-z:.-]+<br/>
     *
     * @param initiatorName <p>
     *            The iSCSI initiator that connects to the target.
     *            </p>
     */
    public void setInitiatorName(String initiatorName) {
        this.initiatorName = initiatorName;
    }

    /**
     * <p>
     * The iSCSI initiator that connects to the target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[0-9a-z:.-]+<br/>
     *
     * @param initiatorName <p>
     *            The iSCSI initiator that connects to the target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChapInfo withInitiatorName(String initiatorName) {
        this.initiatorName = initiatorName;
        return this;
    }

    /**
     * <p>
     * The secret key that the target must provide to participate in mutual CHAP
     * with the initiator (e.g. Windows client).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The secret key that the target must provide to participate in
     *         mutual CHAP with the initiator (e.g. Windows client).
     *         </p>
     */
    public String getSecretToAuthenticateTarget() {
        return secretToAuthenticateTarget;
    }

    /**
     * <p>
     * The secret key that the target must provide to participate in mutual CHAP
     * with the initiator (e.g. Windows client).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param secretToAuthenticateTarget <p>
     *            The secret key that the target must provide to participate in
     *            mutual CHAP with the initiator (e.g. Windows client).
     *            </p>
     */
    public void setSecretToAuthenticateTarget(String secretToAuthenticateTarget) {
        this.secretToAuthenticateTarget = secretToAuthenticateTarget;
    }

    /**
     * <p>
     * The secret key that the target must provide to participate in mutual CHAP
     * with the initiator (e.g. Windows client).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param secretToAuthenticateTarget <p>
     *            The secret key that the target must provide to participate in
     *            mutual CHAP with the initiator (e.g. Windows client).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChapInfo withSecretToAuthenticateTarget(String secretToAuthenticateTarget) {
        this.secretToAuthenticateTarget = secretToAuthenticateTarget;
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
        if (getTargetARN() != null)
            sb.append("TargetARN: " + getTargetARN() + ",");
        if (getSecretToAuthenticateInitiator() != null)
            sb.append("SecretToAuthenticateInitiator: " + getSecretToAuthenticateInitiator() + ",");
        if (getInitiatorName() != null)
            sb.append("InitiatorName: " + getInitiatorName() + ",");
        if (getSecretToAuthenticateTarget() != null)
            sb.append("SecretToAuthenticateTarget: " + getSecretToAuthenticateTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetARN() == null) ? 0 : getTargetARN().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecretToAuthenticateInitiator() == null) ? 0
                        : getSecretToAuthenticateInitiator().hashCode());
        hashCode = prime * hashCode
                + ((getInitiatorName() == null) ? 0 : getInitiatorName().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecretToAuthenticateTarget() == null) ? 0 : getSecretToAuthenticateTarget()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChapInfo == false)
            return false;
        ChapInfo other = (ChapInfo) obj;

        if (other.getTargetARN() == null ^ this.getTargetARN() == null)
            return false;
        if (other.getTargetARN() != null
                && other.getTargetARN().equals(this.getTargetARN()) == false)
            return false;
        if (other.getSecretToAuthenticateInitiator() == null
                ^ this.getSecretToAuthenticateInitiator() == null)
            return false;
        if (other.getSecretToAuthenticateInitiator() != null
                && other.getSecretToAuthenticateInitiator().equals(
                        this.getSecretToAuthenticateInitiator()) == false)
            return false;
        if (other.getInitiatorName() == null ^ this.getInitiatorName() == null)
            return false;
        if (other.getInitiatorName() != null
                && other.getInitiatorName().equals(this.getInitiatorName()) == false)
            return false;
        if (other.getSecretToAuthenticateTarget() == null
                ^ this.getSecretToAuthenticateTarget() == null)
            return false;
        if (other.getSecretToAuthenticateTarget() != null
                && other.getSecretToAuthenticateTarget().equals(
                        this.getSecretToAuthenticateTarget()) == false)
            return false;
        return true;
    }
}
