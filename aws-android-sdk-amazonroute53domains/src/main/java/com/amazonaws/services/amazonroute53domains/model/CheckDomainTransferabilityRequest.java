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
 * Checks whether a domain name can be transferred to Amazon Route 53.
 * </p>
 */
public class CheckDomainTransferabilityRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the domain that you want to transfer to Route 53. The
     * top-level domain (TLD), such as .com, must be a TLD that Route 53
     * supports. For a list of supported TLDs, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * The domain name can contain only the following characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Letters a through z. Domain names are not case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Numbers 0 through 9.
     * </p>
     * </li>
     * <li>
     * <p>
     * Hyphen (-). You can't specify a hyphen at the beginning or end of a
     * label.
     * </p>
     * </li>
     * <li>
     * <p>
     * Period (.) to separate the labels in the name, such as the <code>.</code>
     * in <code>example.com</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String domainName;

    /**
     * <p>
     * If the registrar for the top-level domain (TLD) requires an authorization
     * code to transfer the domain, the code that you got from the current
     * registrar for the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String authCode;

    /**
     * <p>
     * The name of the domain that you want to transfer to Route 53. The
     * top-level domain (TLD), such as .com, must be a TLD that Route 53
     * supports. For a list of supported TLDs, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * The domain name can contain only the following characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Letters a through z. Domain names are not case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Numbers 0 through 9.
     * </p>
     * </li>
     * <li>
     * <p>
     * Hyphen (-). You can't specify a hyphen at the beginning or end of a
     * label.
     * </p>
     * </li>
     * <li>
     * <p>
     * Period (.) to separate the labels in the name, such as the <code>.</code>
     * in <code>example.com</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The name of the domain that you want to transfer to Route 53. The
     *         top-level domain (TLD), such as .com, must be a TLD that Route 53
     *         supports. For a list of supported TLDs, see <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     *         >Domains that You Can Register with Amazon Route 53</a> in the
     *         <i>Amazon Route 53 Developer Guide</i>.
     *         </p>
     *         <p>
     *         The domain name can contain only the following characters:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Letters a through z. Domain names are not case sensitive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Numbers 0 through 9.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Hyphen (-). You can't specify a hyphen at the beginning or end of
     *         a label.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Period (.) to separate the labels in the name, such as the
     *         <code>.</code> in <code>example.com</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The name of the domain that you want to transfer to Route 53. The
     * top-level domain (TLD), such as .com, must be a TLD that Route 53
     * supports. For a list of supported TLDs, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * The domain name can contain only the following characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Letters a through z. Domain names are not case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Numbers 0 through 9.
     * </p>
     * </li>
     * <li>
     * <p>
     * Hyphen (-). You can't specify a hyphen at the beginning or end of a
     * label.
     * </p>
     * </li>
     * <li>
     * <p>
     * Period (.) to separate the labels in the name, such as the <code>.</code>
     * in <code>example.com</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The name of the domain that you want to transfer to Route 53.
     *            The top-level domain (TLD), such as .com, must be a TLD that
     *            Route 53 supports. For a list of supported TLDs, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     *            >Domains that You Can Register with Amazon Route 53</a> in the
     *            <i>Amazon Route 53 Developer Guide</i>.
     *            </p>
     *            <p>
     *            The domain name can contain only the following characters:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Letters a through z. Domain names are not case sensitive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Numbers 0 through 9.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Hyphen (-). You can't specify a hyphen at the beginning or end
     *            of a label.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Period (.) to separate the labels in the name, such as the
     *            <code>.</code> in <code>example.com</code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that you want to transfer to Route 53. The
     * top-level domain (TLD), such as .com, must be a TLD that Route 53
     * supports. For a list of supported TLDs, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * The domain name can contain only the following characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Letters a through z. Domain names are not case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Numbers 0 through 9.
     * </p>
     * </li>
     * <li>
     * <p>
     * Hyphen (-). You can't specify a hyphen at the beginning or end of a
     * label.
     * </p>
     * </li>
     * <li>
     * <p>
     * Period (.) to separate the labels in the name, such as the <code>.</code>
     * in <code>example.com</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The name of the domain that you want to transfer to Route 53.
     *            The top-level domain (TLD), such as .com, must be a TLD that
     *            Route 53 supports. For a list of supported TLDs, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     *            >Domains that You Can Register with Amazon Route 53</a> in the
     *            <i>Amazon Route 53 Developer Guide</i>.
     *            </p>
     *            <p>
     *            The domain name can contain only the following characters:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Letters a through z. Domain names are not case sensitive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Numbers 0 through 9.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Hyphen (-). You can't specify a hyphen at the beginning or end
     *            of a label.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Period (.) to separate the labels in the name, such as the
     *            <code>.</code> in <code>example.com</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CheckDomainTransferabilityRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * If the registrar for the top-level domain (TLD) requires an authorization
     * code to transfer the domain, the code that you got from the current
     * registrar for the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         If the registrar for the top-level domain (TLD) requires an
     *         authorization code to transfer the domain, the code that you got
     *         from the current registrar for the domain.
     *         </p>
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * <p>
     * If the registrar for the top-level domain (TLD) requires an authorization
     * code to transfer the domain, the code that you got from the current
     * registrar for the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param authCode <p>
     *            If the registrar for the top-level domain (TLD) requires an
     *            authorization code to transfer the domain, the code that you
     *            got from the current registrar for the domain.
     *            </p>
     */
    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    /**
     * <p>
     * If the registrar for the top-level domain (TLD) requires an authorization
     * code to transfer the domain, the code that you got from the current
     * registrar for the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param authCode <p>
     *            If the registrar for the top-level domain (TLD) requires an
     *            authorization code to transfer the domain, the code that you
     *            got from the current registrar for the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CheckDomainTransferabilityRequest withAuthCode(String authCode) {
        this.authCode = authCode;
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
        if (getAuthCode() != null)
            sb.append("AuthCode: " + getAuthCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getAuthCode() == null) ? 0 : getAuthCode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CheckDomainTransferabilityRequest == false)
            return false;
        CheckDomainTransferabilityRequest other = (CheckDomainTransferabilityRequest) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getAuthCode() == null ^ this.getAuthCode() == null)
            return false;
        if (other.getAuthCode() != null && other.getAuthCode().equals(this.getAuthCode()) == false)
            return false;
        return true;
    }
}
