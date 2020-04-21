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

package com.amazonaws.services.amazonroute53domains.model;

import java.io.Serializable;

public class GetContactReachabilityStatusResult implements Serializable {
    /**
     * <p>
     * The domain name for which you requested the reachability status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String domainName;

    /**
     * <p>
     * Whether the registrant contact has responded. Values include the
     * following:
     * </p>
     * <dl>
     * <dt>PENDING</dt>
     * <dd>
     * <p>
     * We sent the confirmation email and haven't received a response yet.
     * </p>
     * </dd>
     * <dt>DONE</dt>
     * <dd>
     * <p>
     * We sent the email and got confirmation from the registrant contact.
     * </p>
     * </dd>
     * <dt>EXPIRED</dt>
     * <dd>
     * <p>
     * The time limit expired before the registrant contact responded.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, DONE, EXPIRED
     */
    private String status;

    /**
     * <p>
     * The domain name for which you requested the reachability status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The domain name for which you requested the reachability status.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The domain name for which you requested the reachability status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The domain name for which you requested the reachability
     *            status.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name for which you requested the reachability status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The domain name for which you requested the reachability
     *            status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetContactReachabilityStatusResult withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * Whether the registrant contact has responded. Values include the
     * following:
     * </p>
     * <dl>
     * <dt>PENDING</dt>
     * <dd>
     * <p>
     * We sent the confirmation email and haven't received a response yet.
     * </p>
     * </dd>
     * <dt>DONE</dt>
     * <dd>
     * <p>
     * We sent the email and got confirmation from the registrant contact.
     * </p>
     * </dd>
     * <dt>EXPIRED</dt>
     * <dd>
     * <p>
     * The time limit expired before the registrant contact responded.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, DONE, EXPIRED
     *
     * @return <p>
     *         Whether the registrant contact has responded. Values include the
     *         following:
     *         </p>
     *         <dl>
     *         <dt>PENDING</dt>
     *         <dd>
     *         <p>
     *         We sent the confirmation email and haven't received a response
     *         yet.
     *         </p>
     *         </dd>
     *         <dt>DONE</dt>
     *         <dd>
     *         <p>
     *         We sent the email and got confirmation from the registrant
     *         contact.
     *         </p>
     *         </dd>
     *         <dt>EXPIRED</dt>
     *         <dd>
     *         <p>
     *         The time limit expired before the registrant contact responded.
     *         </p>
     *         </dd>
     *         </dl>
     * @see ReachabilityStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Whether the registrant contact has responded. Values include the
     * following:
     * </p>
     * <dl>
     * <dt>PENDING</dt>
     * <dd>
     * <p>
     * We sent the confirmation email and haven't received a response yet.
     * </p>
     * </dd>
     * <dt>DONE</dt>
     * <dd>
     * <p>
     * We sent the email and got confirmation from the registrant contact.
     * </p>
     * </dd>
     * <dt>EXPIRED</dt>
     * <dd>
     * <p>
     * The time limit expired before the registrant contact responded.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, DONE, EXPIRED
     *
     * @param status <p>
     *            Whether the registrant contact has responded. Values include
     *            the following:
     *            </p>
     *            <dl>
     *            <dt>PENDING</dt>
     *            <dd>
     *            <p>
     *            We sent the confirmation email and haven't received a response
     *            yet.
     *            </p>
     *            </dd>
     *            <dt>DONE</dt>
     *            <dd>
     *            <p>
     *            We sent the email and got confirmation from the registrant
     *            contact.
     *            </p>
     *            </dd>
     *            <dt>EXPIRED</dt>
     *            <dd>
     *            <p>
     *            The time limit expired before the registrant contact
     *            responded.
     *            </p>
     *            </dd>
     *            </dl>
     * @see ReachabilityStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Whether the registrant contact has responded. Values include the
     * following:
     * </p>
     * <dl>
     * <dt>PENDING</dt>
     * <dd>
     * <p>
     * We sent the confirmation email and haven't received a response yet.
     * </p>
     * </dd>
     * <dt>DONE</dt>
     * <dd>
     * <p>
     * We sent the email and got confirmation from the registrant contact.
     * </p>
     * </dd>
     * <dt>EXPIRED</dt>
     * <dd>
     * <p>
     * The time limit expired before the registrant contact responded.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, DONE, EXPIRED
     *
     * @param status <p>
     *            Whether the registrant contact has responded. Values include
     *            the following:
     *            </p>
     *            <dl>
     *            <dt>PENDING</dt>
     *            <dd>
     *            <p>
     *            We sent the confirmation email and haven't received a response
     *            yet.
     *            </p>
     *            </dd>
     *            <dt>DONE</dt>
     *            <dd>
     *            <p>
     *            We sent the email and got confirmation from the registrant
     *            contact.
     *            </p>
     *            </dd>
     *            <dt>EXPIRED</dt>
     *            <dd>
     *            <p>
     *            The time limit expired before the registrant contact
     *            responded.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReachabilityStatus
     */
    public GetContactReachabilityStatusResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Whether the registrant contact has responded. Values include the
     * following:
     * </p>
     * <dl>
     * <dt>PENDING</dt>
     * <dd>
     * <p>
     * We sent the confirmation email and haven't received a response yet.
     * </p>
     * </dd>
     * <dt>DONE</dt>
     * <dd>
     * <p>
     * We sent the email and got confirmation from the registrant contact.
     * </p>
     * </dd>
     * <dt>EXPIRED</dt>
     * <dd>
     * <p>
     * The time limit expired before the registrant contact responded.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, DONE, EXPIRED
     *
     * @param status <p>
     *            Whether the registrant contact has responded. Values include
     *            the following:
     *            </p>
     *            <dl>
     *            <dt>PENDING</dt>
     *            <dd>
     *            <p>
     *            We sent the confirmation email and haven't received a response
     *            yet.
     *            </p>
     *            </dd>
     *            <dt>DONE</dt>
     *            <dd>
     *            <p>
     *            We sent the email and got confirmation from the registrant
     *            contact.
     *            </p>
     *            </dd>
     *            <dt>EXPIRED</dt>
     *            <dd>
     *            <p>
     *            The time limit expired before the registrant contact
     *            responded.
     *            </p>
     *            </dd>
     *            </dl>
     * @see ReachabilityStatus
     */
    public void setStatus(ReachabilityStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Whether the registrant contact has responded. Values include the
     * following:
     * </p>
     * <dl>
     * <dt>PENDING</dt>
     * <dd>
     * <p>
     * We sent the confirmation email and haven't received a response yet.
     * </p>
     * </dd>
     * <dt>DONE</dt>
     * <dd>
     * <p>
     * We sent the email and got confirmation from the registrant contact.
     * </p>
     * </dd>
     * <dt>EXPIRED</dt>
     * <dd>
     * <p>
     * The time limit expired before the registrant contact responded.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, DONE, EXPIRED
     *
     * @param status <p>
     *            Whether the registrant contact has responded. Values include
     *            the following:
     *            </p>
     *            <dl>
     *            <dt>PENDING</dt>
     *            <dd>
     *            <p>
     *            We sent the confirmation email and haven't received a response
     *            yet.
     *            </p>
     *            </dd>
     *            <dt>DONE</dt>
     *            <dd>
     *            <p>
     *            We sent the email and got confirmation from the registrant
     *            contact.
     *            </p>
     *            </dd>
     *            <dt>EXPIRED</dt>
     *            <dd>
     *            <p>
     *            The time limit expired before the registrant contact
     *            responded.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReachabilityStatus
     */
    public GetContactReachabilityStatusResult withStatus(ReachabilityStatus status) {
        this.status = status.toString();
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
        if (getDomainName() != null)
            sb.append("domainName: " + getDomainName() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContactReachabilityStatusResult == false)
            return false;
        GetContactReachabilityStatusResult other = (GetContactReachabilityStatusResult) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
