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

package com.amazonaws.services.organizations.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sends a response to the originator of a handshake agreeing to the action
 * proposed by the handshake request.
 * </p>
 * <p>
 * This operation can be called only by the following principals when they also
 * have the relevant IAM permissions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Invitation to join</b> or <b>Approve all features request</b> handshakes:
 * only a principal from the member account.
 * </p>
 * <p>
 * The user who calls the API for an invitation to join must have the
 * <code>organizations:AcceptHandshake</code> permission. If you enabled all
 * features in the organization, the user must also have the
 * <code>iam:CreateServiceLinkedRole</code> permission so that AWS Organizations
 * can create the required service-linked role named
 * <code>AWSServiceRoleForOrganizations</code>. For more information, see <a
 * href=
 * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integration_services.html#orgs_integration_service-linked-roles"
 * >AWS Organizations and Service-Linked Roles</a> in the <i>AWS Organizations
 * User Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Enable all features final confirmation</b> handshake: only a principal
 * from the master account.
 * </p>
 * <p>
 * For more information about invitations, see <a href=
 * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_invites.html"
 * >Inviting an AWS Account to Join Your Organization</a> in the <i>AWS
 * Organizations User Guide.</i> For more information about requests to enable
 * all features in the organization, see <a href=
 * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
 * >Enabling All Features in Your Organization</a> in the <i>AWS Organizations
 * User Guide.</i>
 * </p>
 * </li>
 * </ul>
 * <p>
 * After you accept a handshake, it continues to appear in the results of
 * relevant APIs for only 30 days. After that, it's deleted.
 * </p>
 */
public class AcceptHandshakeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier (ID) of the handshake that you want to accept.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for
     * handshake ID string requires "h-" followed by from 8 to 32 lowercase
     * letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 34<br/>
     * <b>Pattern: </b>^h-[0-9a-z]{8,32}$<br/>
     */
    private String handshakeId;

    /**
     * <p>
     * The unique identifier (ID) of the handshake that you want to accept.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for
     * handshake ID string requires "h-" followed by from 8 to 32 lowercase
     * letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 34<br/>
     * <b>Pattern: </b>^h-[0-9a-z]{8,32}$<br/>
     *
     * @return <p>
     *         The unique identifier (ID) of the handshake that you want to
     *         accept.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         for handshake ID string requires "h-" followed by from 8 to 32
     *         lowercase letters or digits.
     *         </p>
     */
    public String getHandshakeId() {
        return handshakeId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the handshake that you want to accept.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for
     * handshake ID string requires "h-" followed by from 8 to 32 lowercase
     * letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 34<br/>
     * <b>Pattern: </b>^h-[0-9a-z]{8,32}$<br/>
     *
     * @param handshakeId <p>
     *            The unique identifier (ID) of the handshake that you want to
     *            accept.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for handshake ID string requires "h-" followed by
     *            from 8 to 32 lowercase letters or digits.
     *            </p>
     */
    public void setHandshakeId(String handshakeId) {
        this.handshakeId = handshakeId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the handshake that you want to accept.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for
     * handshake ID string requires "h-" followed by from 8 to 32 lowercase
     * letters or digits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 34<br/>
     * <b>Pattern: </b>^h-[0-9a-z]{8,32}$<br/>
     *
     * @param handshakeId <p>
     *            The unique identifier (ID) of the handshake that you want to
     *            accept.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for handshake ID string requires "h-" followed by
     *            from 8 to 32 lowercase letters or digits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceptHandshakeRequest withHandshakeId(String handshakeId) {
        this.handshakeId = handshakeId;
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
        if (getHandshakeId() != null)
            sb.append("HandshakeId: " + getHandshakeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHandshakeId() == null) ? 0 : getHandshakeId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceptHandshakeRequest == false)
            return false;
        AcceptHandshakeRequest other = (AcceptHandshakeRequest) obj;

        if (other.getHandshakeId() == null ^ this.getHandshakeId() == null)
            return false;
        if (other.getHandshakeId() != null
                && other.getHandshakeId().equals(this.getHandshakeId()) == false)
            return false;
        return true;
    }
}
