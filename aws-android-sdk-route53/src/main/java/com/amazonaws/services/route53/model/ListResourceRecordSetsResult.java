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

/**
 * <p>
 * A complex type that contains list information for the resource record set.
 * </p>
 */
public class ListResourceRecordSetsResult implements Serializable {
    /**
     * <p>
     * Information about multiple resource record sets.
     * </p>
     */
    private java.util.List<ResourceRecordSet> resourceRecordSets;

    /**
     * <p>
     * A flag that indicates whether more resource record sets remain to be
     * listed. If your results were truncated, you can make a follow-up
     * pagination request by using the <code>NextRecordName</code> element.
     * </p>
     */
    private Boolean isTruncated;

    /**
     * <p>
     * If the results were truncated, the name of the next record in the list.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is true.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String nextRecordName;

    /**
     * <p>
     * If the results were truncated, the type of the next record in the list.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is true.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     */
    private String nextRecordType;

    /**
     * <p>
     * <i>Resource record sets that have a routing policy other than simple:</i>
     * If results were truncated for a given DNS name and type, the value of
     * <code>SetIdentifier</code> for the next resource record set that has the
     * current DNS name and type.
     * </p>
     * <p>
     * For information about routing policies, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html"
     * >Choosing a Routing Policy</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String nextRecordIdentifier;

    /**
     * <p>
     * The maximum number of records you requested.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * Information about multiple resource record sets.
     * </p>
     *
     * @return <p>
     *         Information about multiple resource record sets.
     *         </p>
     */
    public java.util.List<ResourceRecordSet> getResourceRecordSets() {
        return resourceRecordSets;
    }

    /**
     * <p>
     * Information about multiple resource record sets.
     * </p>
     *
     * @param resourceRecordSets <p>
     *            Information about multiple resource record sets.
     *            </p>
     */
    public void setResourceRecordSets(java.util.Collection<ResourceRecordSet> resourceRecordSets) {
        if (resourceRecordSets == null) {
            this.resourceRecordSets = null;
            return;
        }

        this.resourceRecordSets = new java.util.ArrayList<ResourceRecordSet>(resourceRecordSets);
    }

    /**
     * <p>
     * Information about multiple resource record sets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceRecordSets <p>
     *            Information about multiple resource record sets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourceRecordSetsResult withResourceRecordSets(
            ResourceRecordSet... resourceRecordSets) {
        if (getResourceRecordSets() == null) {
            this.resourceRecordSets = new java.util.ArrayList<ResourceRecordSet>(
                    resourceRecordSets.length);
        }
        for (ResourceRecordSet value : resourceRecordSets) {
            this.resourceRecordSets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about multiple resource record sets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceRecordSets <p>
     *            Information about multiple resource record sets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourceRecordSetsResult withResourceRecordSets(
            java.util.Collection<ResourceRecordSet> resourceRecordSets) {
        setResourceRecordSets(resourceRecordSets);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether more resource record sets remain to be
     * listed. If your results were truncated, you can make a follow-up
     * pagination request by using the <code>NextRecordName</code> element.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether more resource record sets remain to
     *         be listed. If your results were truncated, you can make a
     *         follow-up pagination request by using the
     *         <code>NextRecordName</code> element.
     *         </p>
     */
    public Boolean isIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether more resource record sets remain to be
     * listed. If your results were truncated, you can make a follow-up
     * pagination request by using the <code>NextRecordName</code> element.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether more resource record sets remain to
     *         be listed. If your results were truncated, you can make a
     *         follow-up pagination request by using the
     *         <code>NextRecordName</code> element.
     *         </p>
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether more resource record sets remain to be
     * listed. If your results were truncated, you can make a follow-up
     * pagination request by using the <code>NextRecordName</code> element.
     * </p>
     *
     * @param isTruncated <p>
     *            A flag that indicates whether more resource record sets remain
     *            to be listed. If your results were truncated, you can make a
     *            follow-up pagination request by using the
     *            <code>NextRecordName</code> element.
     *            </p>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether more resource record sets remain to be
     * listed. If your results were truncated, you can make a follow-up
     * pagination request by using the <code>NextRecordName</code> element.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isTruncated <p>
     *            A flag that indicates whether more resource record sets remain
     *            to be listed. If your results were truncated, you can make a
     *            follow-up pagination request by using the
     *            <code>NextRecordName</code> element.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourceRecordSetsResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * <p>
     * If the results were truncated, the name of the next record in the list.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is true.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         If the results were truncated, the name of the next record in the
     *         list.
     *         </p>
     *         <p>
     *         This element is present only if <code>IsTruncated</code> is true.
     *         </p>
     */
    public String getNextRecordName() {
        return nextRecordName;
    }

    /**
     * <p>
     * If the results were truncated, the name of the next record in the list.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is true.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param nextRecordName <p>
     *            If the results were truncated, the name of the next record in
     *            the list.
     *            </p>
     *            <p>
     *            This element is present only if <code>IsTruncated</code> is
     *            true.
     *            </p>
     */
    public void setNextRecordName(String nextRecordName) {
        this.nextRecordName = nextRecordName;
    }

    /**
     * <p>
     * If the results were truncated, the name of the next record in the list.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is true.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param nextRecordName <p>
     *            If the results were truncated, the name of the next record in
     *            the list.
     *            </p>
     *            <p>
     *            This element is present only if <code>IsTruncated</code> is
     *            true.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourceRecordSetsResult withNextRecordName(String nextRecordName) {
        this.nextRecordName = nextRecordName;
        return this;
    }

    /**
     * <p>
     * If the results were truncated, the type of the next record in the list.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is true.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @return <p>
     *         If the results were truncated, the type of the next record in the
     *         list.
     *         </p>
     *         <p>
     *         This element is present only if <code>IsTruncated</code> is true.
     *         </p>
     * @see RRType
     */
    public String getNextRecordType() {
        return nextRecordType;
    }

    /**
     * <p>
     * If the results were truncated, the type of the next record in the list.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is true.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param nextRecordType <p>
     *            If the results were truncated, the type of the next record in
     *            the list.
     *            </p>
     *            <p>
     *            This element is present only if <code>IsTruncated</code> is
     *            true.
     *            </p>
     * @see RRType
     */
    public void setNextRecordType(String nextRecordType) {
        this.nextRecordType = nextRecordType;
    }

    /**
     * <p>
     * If the results were truncated, the type of the next record in the list.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is true.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param nextRecordType <p>
     *            If the results were truncated, the type of the next record in
     *            the list.
     *            </p>
     *            <p>
     *            This element is present only if <code>IsTruncated</code> is
     *            true.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RRType
     */
    public ListResourceRecordSetsResult withNextRecordType(String nextRecordType) {
        this.nextRecordType = nextRecordType;
        return this;
    }

    /**
     * <p>
     * If the results were truncated, the type of the next record in the list.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is true.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param nextRecordType <p>
     *            If the results were truncated, the type of the next record in
     *            the list.
     *            </p>
     *            <p>
     *            This element is present only if <code>IsTruncated</code> is
     *            true.
     *            </p>
     * @see RRType
     */
    public void setNextRecordType(RRType nextRecordType) {
        this.nextRecordType = nextRecordType.toString();
    }

    /**
     * <p>
     * If the results were truncated, the type of the next record in the list.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is true.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param nextRecordType <p>
     *            If the results were truncated, the type of the next record in
     *            the list.
     *            </p>
     *            <p>
     *            This element is present only if <code>IsTruncated</code> is
     *            true.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RRType
     */
    public ListResourceRecordSetsResult withNextRecordType(RRType nextRecordType) {
        this.nextRecordType = nextRecordType.toString();
        return this;
    }

    /**
     * <p>
     * <i>Resource record sets that have a routing policy other than simple:</i>
     * If results were truncated for a given DNS name and type, the value of
     * <code>SetIdentifier</code> for the next resource record set that has the
     * current DNS name and type.
     * </p>
     * <p>
     * For information about routing policies, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html"
     * >Choosing a Routing Policy</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         <i>Resource record sets that have a routing policy other than
     *         simple:</i> If results were truncated for a given DNS name and
     *         type, the value of <code>SetIdentifier</code> for the next
     *         resource record set that has the current DNS name and type.
     *         </p>
     *         <p>
     *         For information about routing policies, see <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html"
     *         >Choosing a Routing Policy</a> in the <i>Amazon Route 53
     *         Developer Guide</i>.
     *         </p>
     */
    public String getNextRecordIdentifier() {
        return nextRecordIdentifier;
    }

    /**
     * <p>
     * <i>Resource record sets that have a routing policy other than simple:</i>
     * If results were truncated for a given DNS name and type, the value of
     * <code>SetIdentifier</code> for the next resource record set that has the
     * current DNS name and type.
     * </p>
     * <p>
     * For information about routing policies, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html"
     * >Choosing a Routing Policy</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param nextRecordIdentifier <p>
     *            <i>Resource record sets that have a routing policy other than
     *            simple:</i> If results were truncated for a given DNS name and
     *            type, the value of <code>SetIdentifier</code> for the next
     *            resource record set that has the current DNS name and type.
     *            </p>
     *            <p>
     *            For information about routing policies, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html"
     *            >Choosing a Routing Policy</a> in the <i>Amazon Route 53
     *            Developer Guide</i>.
     *            </p>
     */
    public void setNextRecordIdentifier(String nextRecordIdentifier) {
        this.nextRecordIdentifier = nextRecordIdentifier;
    }

    /**
     * <p>
     * <i>Resource record sets that have a routing policy other than simple:</i>
     * If results were truncated for a given DNS name and type, the value of
     * <code>SetIdentifier</code> for the next resource record set that has the
     * current DNS name and type.
     * </p>
     * <p>
     * For information about routing policies, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html"
     * >Choosing a Routing Policy</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param nextRecordIdentifier <p>
     *            <i>Resource record sets that have a routing policy other than
     *            simple:</i> If results were truncated for a given DNS name and
     *            type, the value of <code>SetIdentifier</code> for the next
     *            resource record set that has the current DNS name and type.
     *            </p>
     *            <p>
     *            For information about routing policies, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html"
     *            >Choosing a Routing Policy</a> in the <i>Amazon Route 53
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourceRecordSetsResult withNextRecordIdentifier(String nextRecordIdentifier) {
        this.nextRecordIdentifier = nextRecordIdentifier;
        return this;
    }

    /**
     * <p>
     * The maximum number of records you requested.
     * </p>
     *
     * @return <p>
     *         The maximum number of records you requested.
     *         </p>
     */
    public String getMaxItems() {
        return maxItems;
    }

    /**
     * <p>
     * The maximum number of records you requested.
     * </p>
     *
     * @param maxItems <p>
     *            The maximum number of records you requested.
     *            </p>
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of records you requested.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxItems <p>
     *            The maximum number of records you requested.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourceRecordSetsResult withMaxItems(String maxItems) {
        this.maxItems = maxItems;
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
        if (getResourceRecordSets() != null)
            sb.append("ResourceRecordSets: " + getResourceRecordSets() + ",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: " + getIsTruncated() + ",");
        if (getNextRecordName() != null)
            sb.append("NextRecordName: " + getNextRecordName() + ",");
        if (getNextRecordType() != null)
            sb.append("NextRecordType: " + getNextRecordType() + ",");
        if (getNextRecordIdentifier() != null)
            sb.append("NextRecordIdentifier: " + getNextRecordIdentifier() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceRecordSets() == null) ? 0 : getResourceRecordSets().hashCode());
        hashCode = prime * hashCode
                + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode
                + ((getNextRecordName() == null) ? 0 : getNextRecordName().hashCode());
        hashCode = prime * hashCode
                + ((getNextRecordType() == null) ? 0 : getNextRecordType().hashCode());
        hashCode = prime * hashCode
                + ((getNextRecordIdentifier() == null) ? 0 : getNextRecordIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResourceRecordSetsResult == false)
            return false;
        ListResourceRecordSetsResult other = (ListResourceRecordSetsResult) obj;

        if (other.getResourceRecordSets() == null ^ this.getResourceRecordSets() == null)
            return false;
        if (other.getResourceRecordSets() != null
                && other.getResourceRecordSets().equals(this.getResourceRecordSets()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null
                && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getNextRecordName() == null ^ this.getNextRecordName() == null)
            return false;
        if (other.getNextRecordName() != null
                && other.getNextRecordName().equals(this.getNextRecordName()) == false)
            return false;
        if (other.getNextRecordType() == null ^ this.getNextRecordType() == null)
            return false;
        if (other.getNextRecordType() != null
                && other.getNextRecordType().equals(this.getNextRecordType()) == false)
            return false;
        if (other.getNextRecordIdentifier() == null ^ this.getNextRecordIdentifier() == null)
            return false;
        if (other.getNextRecordIdentifier() != null
                && other.getNextRecordIdentifier().equals(this.getNextRecordIdentifier()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }
}
