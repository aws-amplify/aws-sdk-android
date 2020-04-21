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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This operation renews a domain for the specified number of years. The cost of
 * renewing your domain is billed to your AWS account.
 * </p>
 * <p>
 * We recommend that you renew your domain several weeks before the expiration
 * date. Some TLD registries delete domains before the expiration date if you
 * haven't renewed far enough in advance. For more information about renewing
 * domain registration, see <a href=
 * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/domain-renew.html"
 * >Renewing Registration for a Domain</a> in the <i>Amazon Route 53 Developer
 * Guide</i>.
 * </p>
 */
public class RenewDomainRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the domain that you want to renew.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String domainName;

    /**
     * <p>
     * The number of years that you want to renew the domain for. The maximum
     * number of years depends on the top-level domain. For the range of valid
     * values for your domain, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     */
    private Integer durationInYears;

    /**
     * <p>
     * The year when the registration for the domain is set to expire. This
     * value must match the current expiration date for the domain.
     * </p>
     */
    private Integer currentExpiryYear;

    /**
     * <p>
     * The name of the domain that you want to renew.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The name of the domain that you want to renew.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The name of the domain that you want to renew.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The name of the domain that you want to renew.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that you want to renew.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The name of the domain that you want to renew.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RenewDomainRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * The number of years that you want to renew the domain for. The maximum
     * number of years depends on the top-level domain. For the range of valid
     * values for your domain, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @return <p>
     *         The number of years that you want to renew the domain for. The
     *         maximum number of years depends on the top-level domain. For the
     *         range of valid values for your domain, see <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     *         >Domains that You Can Register with Amazon Route 53</a> in the
     *         <i>Amazon Route 53 Developer Guide</i>.
     *         </p>
     *         <p>
     *         Default: 1
     *         </p>
     */
    public Integer getDurationInYears() {
        return durationInYears;
    }

    /**
     * <p>
     * The number of years that you want to renew the domain for. The maximum
     * number of years depends on the top-level domain. For the range of valid
     * values for your domain, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param durationInYears <p>
     *            The number of years that you want to renew the domain for. The
     *            maximum number of years depends on the top-level domain. For
     *            the range of valid values for your domain, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     *            >Domains that You Can Register with Amazon Route 53</a> in the
     *            <i>Amazon Route 53 Developer Guide</i>.
     *            </p>
     *            <p>
     *            Default: 1
     *            </p>
     */
    public void setDurationInYears(Integer durationInYears) {
        this.durationInYears = durationInYears;
    }

    /**
     * <p>
     * The number of years that you want to renew the domain for. The maximum
     * number of years depends on the top-level domain. For the range of valid
     * values for your domain, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param durationInYears <p>
     *            The number of years that you want to renew the domain for. The
     *            maximum number of years depends on the top-level domain. For
     *            the range of valid values for your domain, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     *            >Domains that You Can Register with Amazon Route 53</a> in the
     *            <i>Amazon Route 53 Developer Guide</i>.
     *            </p>
     *            <p>
     *            Default: 1
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RenewDomainRequest withDurationInYears(Integer durationInYears) {
        this.durationInYears = durationInYears;
        return this;
    }

    /**
     * <p>
     * The year when the registration for the domain is set to expire. This
     * value must match the current expiration date for the domain.
     * </p>
     *
     * @return <p>
     *         The year when the registration for the domain is set to expire.
     *         This value must match the current expiration date for the domain.
     *         </p>
     */
    public Integer getCurrentExpiryYear() {
        return currentExpiryYear;
    }

    /**
     * <p>
     * The year when the registration for the domain is set to expire. This
     * value must match the current expiration date for the domain.
     * </p>
     *
     * @param currentExpiryYear <p>
     *            The year when the registration for the domain is set to
     *            expire. This value must match the current expiration date for
     *            the domain.
     *            </p>
     */
    public void setCurrentExpiryYear(Integer currentExpiryYear) {
        this.currentExpiryYear = currentExpiryYear;
    }

    /**
     * <p>
     * The year when the registration for the domain is set to expire. This
     * value must match the current expiration date for the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentExpiryYear <p>
     *            The year when the registration for the domain is set to
     *            expire. This value must match the current expiration date for
     *            the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RenewDomainRequest withCurrentExpiryYear(Integer currentExpiryYear) {
        this.currentExpiryYear = currentExpiryYear;
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
            sb.append("DomainName: " + getDomainName() + ",");
        if (getDurationInYears() != null)
            sb.append("DurationInYears: " + getDurationInYears() + ",");
        if (getCurrentExpiryYear() != null)
            sb.append("CurrentExpiryYear: " + getCurrentExpiryYear());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getDurationInYears() == null) ? 0 : getDurationInYears().hashCode());
        hashCode = prime * hashCode
                + ((getCurrentExpiryYear() == null) ? 0 : getCurrentExpiryYear().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RenewDomainRequest == false)
            return false;
        RenewDomainRequest other = (RenewDomainRequest) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getDurationInYears() == null ^ this.getDurationInYears() == null)
            return false;
        if (other.getDurationInYears() != null
                && other.getDurationInYears().equals(this.getDurationInYears()) == false)
            return false;
        if (other.getCurrentExpiryYear() == null ^ this.getCurrentExpiryYear() == null)
            return false;
        if (other.getCurrentExpiryYear() != null
                && other.getCurrentExpiryYear().equals(this.getCurrentExpiryYear()) == false)
            return false;
        return true;
    }
}
