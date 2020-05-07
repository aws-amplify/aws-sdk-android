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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a delegation set (a group of four name servers) that can be reused by
 * multiple hosted zones that were created by the same AWS account.
 * </p>
 * <p>
 * You can also create a reusable delegation set that uses the four name servers
 * that are associated with an existing hosted zone. Specify the hosted zone ID
 * in the <code>CreateReusableDelegationSet</code> request.
 * </p>
 * <note>
 * <p>
 * You can't associate a reusable delegation set with a private hosted zone.
 * </p>
 * </note>
 * <p>
 * For information about using a reusable delegation set to configure white
 * label name servers, see <a href=
 * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/white-label-name-servers.html"
 * >Configuring White Label Name Servers</a>.
 * </p>
 * <p>
 * The process for migrating existing hosted zones to use a reusable delegation
 * set is comparable to the process for configuring white label name servers.
 * You need to perform the following steps:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Create a reusable delegation set.
 * </p>
 * </li>
 * <li>
 * <p>
 * Recreate hosted zones, and reduce the TTL to 60 seconds or less.
 * </p>
 * </li>
 * <li>
 * <p>
 * Recreate resource record sets in the new hosted zones.
 * </p>
 * </li>
 * <li>
 * <p>
 * Change the registrar's name servers to use the name servers for the new
 * hosted zones.
 * </p>
 * </li>
 * <li>
 * <p>
 * Monitor traffic for the website or application.
 * </p>
 * </li>
 * <li>
 * <p>
 * Change TTLs back to their original values.
 * </p>
 * </li>
 * </ol>
 * <p>
 * If you want to migrate existing hosted zones to use a reusable delegation
 * set, the existing hosted zones can't use any of the name servers that are
 * assigned to the reusable delegation set. If one or more hosted zones do use
 * one or more name servers that are assigned to the reusable delegation set,
 * you can do one of the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * For small numbers of hosted zones—up to a few hundred—it's relatively easy to
 * create reusable delegation sets until you get one that has four name servers
 * that don't overlap with any of the name servers in your hosted zones.
 * </p>
 * </li>
 * <li>
 * <p>
 * For larger numbers of hosted zones, the easiest solution is to use more than
 * one reusable delegation set.
 * </p>
 * </li>
 * <li>
 * <p>
 * For larger numbers of hosted zones, you can also migrate hosted zones that
 * have overlapping name servers to hosted zones that don't have overlapping
 * name servers, then migrate the hosted zones again to use the reusable
 * delegation set.
 * </p>
 * </li>
 * </ul>
 */
public class CreateReusableDelegationSetRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A unique string that identifies the request, and that allows you to retry
     * failed <code>CreateReusableDelegationSet</code> requests without the risk
     * of executing the operation twice. You must use a unique
     * <code>CallerReference</code> string every time you submit a
     * <code>CreateReusableDelegationSet</code> request.
     * <code>CallerReference</code> can be any unique string, for example a
     * date/time stamp.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String callerReference;

    /**
     * <p>
     * If you want to mark the delegation set for an existing hosted zone as
     * reusable, the ID for that hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     */
    private String hostedZoneId;

    /**
     * <p>
     * A unique string that identifies the request, and that allows you to retry
     * failed <code>CreateReusableDelegationSet</code> requests without the risk
     * of executing the operation twice. You must use a unique
     * <code>CallerReference</code> string every time you submit a
     * <code>CreateReusableDelegationSet</code> request.
     * <code>CallerReference</code> can be any unique string, for example a
     * date/time stamp.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         A unique string that identifies the request, and that allows you
     *         to retry failed <code>CreateReusableDelegationSet</code> requests
     *         without the risk of executing the operation twice. You must use a
     *         unique <code>CallerReference</code> string every time you submit
     *         a <code>CreateReusableDelegationSet</code> request.
     *         <code>CallerReference</code> can be any unique string, for
     *         example a date/time stamp.
     *         </p>
     */
    public String getCallerReference() {
        return callerReference;
    }

    /**
     * <p>
     * A unique string that identifies the request, and that allows you to retry
     * failed <code>CreateReusableDelegationSet</code> requests without the risk
     * of executing the operation twice. You must use a unique
     * <code>CallerReference</code> string every time you submit a
     * <code>CreateReusableDelegationSet</code> request.
     * <code>CallerReference</code> can be any unique string, for example a
     * date/time stamp.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param callerReference <p>
     *            A unique string that identifies the request, and that allows
     *            you to retry failed <code>CreateReusableDelegationSet</code>
     *            requests without the risk of executing the operation twice.
     *            You must use a unique <code>CallerReference</code> string
     *            every time you submit a
     *            <code>CreateReusableDelegationSet</code> request.
     *            <code>CallerReference</code> can be any unique string, for
     *            example a date/time stamp.
     *            </p>
     */
    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * A unique string that identifies the request, and that allows you to retry
     * failed <code>CreateReusableDelegationSet</code> requests without the risk
     * of executing the operation twice. You must use a unique
     * <code>CallerReference</code> string every time you submit a
     * <code>CreateReusableDelegationSet</code> request.
     * <code>CallerReference</code> can be any unique string, for example a
     * date/time stamp.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param callerReference <p>
     *            A unique string that identifies the request, and that allows
     *            you to retry failed <code>CreateReusableDelegationSet</code>
     *            requests without the risk of executing the operation twice.
     *            You must use a unique <code>CallerReference</code> string
     *            every time you submit a
     *            <code>CreateReusableDelegationSet</code> request.
     *            <code>CallerReference</code> can be any unique string, for
     *            example a date/time stamp.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReusableDelegationSetRequest withCallerReference(String callerReference) {
        this.callerReference = callerReference;
        return this;
    }

    /**
     * <p>
     * If you want to mark the delegation set for an existing hosted zone as
     * reusable, the ID for that hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @return <p>
     *         If you want to mark the delegation set for an existing hosted
     *         zone as reusable, the ID for that hosted zone.
     *         </p>
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }

    /**
     * <p>
     * If you want to mark the delegation set for an existing hosted zone as
     * reusable, the ID for that hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            If you want to mark the delegation set for an existing hosted
     *            zone as reusable, the ID for that hosted zone.
     *            </p>
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * If you want to mark the delegation set for an existing hosted zone as
     * reusable, the ID for that hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            If you want to mark the delegation set for an existing hosted
     *            zone as reusable, the ID for that hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReusableDelegationSetRequest withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
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
        if (getCallerReference() != null)
            sb.append("CallerReference: " + getCallerReference() + ",");
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: " + getHostedZoneId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode());
        hashCode = prime * hashCode
                + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateReusableDelegationSetRequest == false)
            return false;
        CreateReusableDelegationSetRequest other = (CreateReusableDelegationSetRequest) obj;

        if (other.getCallerReference() == null ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null
                && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null
                && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        return true;
    }
}
