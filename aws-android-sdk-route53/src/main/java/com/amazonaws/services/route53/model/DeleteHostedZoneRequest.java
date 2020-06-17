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
 * Deletes a hosted zone.
 * </p>
 * <p>
 * If the hosted zone was created by another service, such as AWS Cloud Map, see
 * <a href=
 * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DeleteHostedZone.html#delete-public-hosted-zone-created-by-another-service"
 * >Deleting Public Hosted Zones That Were Created by Another Service</a> in the
 * <i>Amazon Route 53 Developer Guide</i> for information about how to delete
 * it. (The process is the same for public and private hosted zones that were
 * created by another service.)
 * </p>
 * <p>
 * If you want to keep your domain registration but you want to stop routing
 * internet traffic to your website or web application, we recommend that you
 * delete resource record sets in the hosted zone instead of deleting the hosted
 * zone.
 * </p>
 * <important>
 * <p>
 * If you delete a hosted zone, you can't undelete it. You must create a new
 * hosted zone and update the name servers for your domain registration, which
 * can require up to 48 hours to take effect. (If you delegated responsibility
 * for a subdomain to a hosted zone and you delete the child hosted zone, you
 * must update the name servers in the parent hosted zone.) In addition, if you
 * delete a hosted zone, someone could hijack the domain and route traffic to
 * their own resources using your domain name.
 * </p>
 * </important>
 * <p>
 * If you want to avoid the monthly charge for the hosted zone, you can transfer
 * DNS service for the domain to a free DNS service. When you transfer DNS
 * service, you have to update the name servers for the domain registration. If
 * the domain is registered with Route 53, see <a href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_UpdateDomainNameservers.html"
 * >UpdateDomainNameservers</a> for information about how to replace Route 53
 * name servers with name servers for the new DNS service. If the domain is
 * registered with another registrar, use the method provided by the registrar
 * to update name servers for the domain registration. For more information,
 * perform an internet search on "free DNS service."
 * </p>
 * <p>
 * You can delete a hosted zone only if it contains only the default SOA record
 * and NS resource record sets. If the hosted zone contains other resource
 * record sets, you must delete them before you can delete the hosted zone. If
 * you try to delete a hosted zone that contains other resource record sets, the
 * request fails, and Route 53 returns a <code>HostedZoneNotEmpty</code> error.
 * For information about deleting records from your hosted zone, see <a href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ChangeResourceRecordSets.html"
 * >ChangeResourceRecordSets</a>.
 * </p>
 * <p>
 * To verify that the hosted zone has been deleted, do one of the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Use the <code>GetHostedZone</code> action to request information about the
 * hosted zone.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use the <code>ListHostedZones</code> action to get a list of the hosted zones
 * associated with the current AWS account.
 * </p>
 * </li>
 * </ul>
 */
public class DeleteHostedZoneRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the hosted zone you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     */
    private String id;

    /**
     * <p>
     * The ID of the hosted zone you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @return <p>
     *         The ID of the hosted zone you want to delete.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of the hosted zone you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param id <p>
     *            The ID of the hosted zone you want to delete.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the hosted zone you want to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param id <p>
     *            The ID of the hosted zone you want to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteHostedZoneRequest withId(String id) {
        this.id = id;
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
        if (getId() != null)
            sb.append("Id: " + getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteHostedZoneRequest == false)
            return false;
        DeleteHostedZoneRequest other = (DeleteHostedZoneRequest) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }
}
