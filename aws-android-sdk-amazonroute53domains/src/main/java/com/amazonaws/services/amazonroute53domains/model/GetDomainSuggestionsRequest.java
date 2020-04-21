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
 * The GetDomainSuggestions operation returns a list of suggested domain names.
 * </p>
 */
public class GetDomainSuggestionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A domain name that you want to use as the basis for a list of possible
     * domain names. The top-level domain (TLD), such as .com, must be a TLD
     * that Route 53 supports. For a list of supported TLDs, see <a href=
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
     * Internationalized domain names are not supported for some top-level
     * domains. To determine whether the TLD that you want to use supports
     * internationalized domain names, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String domainName;

    /**
     * <p>
     * The number of suggested domain names that you want Route 53 to return.
     * Specify a value between 1 and 50.
     * </p>
     */
    private Integer suggestionCount;

    /**
     * <p>
     * If <code>OnlyAvailable</code> is <code>true</code>, Route 53 returns only
     * domain names that are available. If <code>OnlyAvailable</code> is
     * <code>false</code>, Route 53 returns domain names without checking
     * whether they're available to be registered. To determine whether the
     * domain is available, you can call <code>checkDomainAvailability</code>
     * for each suggestion.
     * </p>
     */
    private Boolean onlyAvailable;

    /**
     * <p>
     * A domain name that you want to use as the basis for a list of possible
     * domain names. The top-level domain (TLD), such as .com, must be a TLD
     * that Route 53 supports. For a list of supported TLDs, see <a href=
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
     * Internationalized domain names are not supported for some top-level
     * domains. To determine whether the TLD that you want to use supports
     * internationalized domain names, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         A domain name that you want to use as the basis for a list of
     *         possible domain names. The top-level domain (TLD), such as .com,
     *         must be a TLD that Route 53 supports. For a list of supported
     *         TLDs, see <a href=
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
     *         <p>
     *         Internationalized domain names are not supported for some
     *         top-level domains. To determine whether the TLD that you want to
     *         use supports internationalized domain names, see <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     *         >Domains that You Can Register with Amazon Route 53</a>.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * A domain name that you want to use as the basis for a list of possible
     * domain names. The top-level domain (TLD), such as .com, must be a TLD
     * that Route 53 supports. For a list of supported TLDs, see <a href=
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
     * Internationalized domain names are not supported for some top-level
     * domains. To determine whether the TLD that you want to use supports
     * internationalized domain names, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            A domain name that you want to use as the basis for a list of
     *            possible domain names. The top-level domain (TLD), such as
     *            .com, must be a TLD that Route 53 supports. For a list of
     *            supported TLDs, see <a href=
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
     *            <p>
     *            Internationalized domain names are not supported for some
     *            top-level domains. To determine whether the TLD that you want
     *            to use supports internationalized domain names, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     *            >Domains that You Can Register with Amazon Route 53</a>.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * A domain name that you want to use as the basis for a list of possible
     * domain names. The top-level domain (TLD), such as .com, must be a TLD
     * that Route 53 supports. For a list of supported TLDs, see <a href=
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
     * Internationalized domain names are not supported for some top-level
     * domains. To determine whether the TLD that you want to use supports
     * internationalized domain names, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains that You Can Register with Amazon Route 53</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            A domain name that you want to use as the basis for a list of
     *            possible domain names. The top-level domain (TLD), such as
     *            .com, must be a TLD that Route 53 supports. For a list of
     *            supported TLDs, see <a href=
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
     *            <p>
     *            Internationalized domain names are not supported for some
     *            top-level domains. To determine whether the TLD that you want
     *            to use supports internationalized domain names, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     *            >Domains that You Can Register with Amazon Route 53</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainSuggestionsRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * The number of suggested domain names that you want Route 53 to return.
     * Specify a value between 1 and 50.
     * </p>
     *
     * @return <p>
     *         The number of suggested domain names that you want Route 53 to
     *         return. Specify a value between 1 and 50.
     *         </p>
     */
    public Integer getSuggestionCount() {
        return suggestionCount;
    }

    /**
     * <p>
     * The number of suggested domain names that you want Route 53 to return.
     * Specify a value between 1 and 50.
     * </p>
     *
     * @param suggestionCount <p>
     *            The number of suggested domain names that you want Route 53 to
     *            return. Specify a value between 1 and 50.
     *            </p>
     */
    public void setSuggestionCount(Integer suggestionCount) {
        this.suggestionCount = suggestionCount;
    }

    /**
     * <p>
     * The number of suggested domain names that you want Route 53 to return.
     * Specify a value between 1 and 50.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param suggestionCount <p>
     *            The number of suggested domain names that you want Route 53 to
     *            return. Specify a value between 1 and 50.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainSuggestionsRequest withSuggestionCount(Integer suggestionCount) {
        this.suggestionCount = suggestionCount;
        return this;
    }

    /**
     * <p>
     * If <code>OnlyAvailable</code> is <code>true</code>, Route 53 returns only
     * domain names that are available. If <code>OnlyAvailable</code> is
     * <code>false</code>, Route 53 returns domain names without checking
     * whether they're available to be registered. To determine whether the
     * domain is available, you can call <code>checkDomainAvailability</code>
     * for each suggestion.
     * </p>
     *
     * @return <p>
     *         If <code>OnlyAvailable</code> is <code>true</code>, Route 53
     *         returns only domain names that are available. If
     *         <code>OnlyAvailable</code> is <code>false</code>, Route 53
     *         returns domain names without checking whether they're available
     *         to be registered. To determine whether the domain is available,
     *         you can call <code>checkDomainAvailability</code> for each
     *         suggestion.
     *         </p>
     */
    public Boolean isOnlyAvailable() {
        return onlyAvailable;
    }

    /**
     * <p>
     * If <code>OnlyAvailable</code> is <code>true</code>, Route 53 returns only
     * domain names that are available. If <code>OnlyAvailable</code> is
     * <code>false</code>, Route 53 returns domain names without checking
     * whether they're available to be registered. To determine whether the
     * domain is available, you can call <code>checkDomainAvailability</code>
     * for each suggestion.
     * </p>
     *
     * @return <p>
     *         If <code>OnlyAvailable</code> is <code>true</code>, Route 53
     *         returns only domain names that are available. If
     *         <code>OnlyAvailable</code> is <code>false</code>, Route 53
     *         returns domain names without checking whether they're available
     *         to be registered. To determine whether the domain is available,
     *         you can call <code>checkDomainAvailability</code> for each
     *         suggestion.
     *         </p>
     */
    public Boolean getOnlyAvailable() {
        return onlyAvailable;
    }

    /**
     * <p>
     * If <code>OnlyAvailable</code> is <code>true</code>, Route 53 returns only
     * domain names that are available. If <code>OnlyAvailable</code> is
     * <code>false</code>, Route 53 returns domain names without checking
     * whether they're available to be registered. To determine whether the
     * domain is available, you can call <code>checkDomainAvailability</code>
     * for each suggestion.
     * </p>
     *
     * @param onlyAvailable <p>
     *            If <code>OnlyAvailable</code> is <code>true</code>, Route 53
     *            returns only domain names that are available. If
     *            <code>OnlyAvailable</code> is <code>false</code>, Route 53
     *            returns domain names without checking whether they're
     *            available to be registered. To determine whether the domain is
     *            available, you can call <code>checkDomainAvailability</code>
     *            for each suggestion.
     *            </p>
     */
    public void setOnlyAvailable(Boolean onlyAvailable) {
        this.onlyAvailable = onlyAvailable;
    }

    /**
     * <p>
     * If <code>OnlyAvailable</code> is <code>true</code>, Route 53 returns only
     * domain names that are available. If <code>OnlyAvailable</code> is
     * <code>false</code>, Route 53 returns domain names without checking
     * whether they're available to be registered. To determine whether the
     * domain is available, you can call <code>checkDomainAvailability</code>
     * for each suggestion.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onlyAvailable <p>
     *            If <code>OnlyAvailable</code> is <code>true</code>, Route 53
     *            returns only domain names that are available. If
     *            <code>OnlyAvailable</code> is <code>false</code>, Route 53
     *            returns domain names without checking whether they're
     *            available to be registered. To determine whether the domain is
     *            available, you can call <code>checkDomainAvailability</code>
     *            for each suggestion.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainSuggestionsRequest withOnlyAvailable(Boolean onlyAvailable) {
        this.onlyAvailable = onlyAvailable;
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
        if (getSuggestionCount() != null)
            sb.append("SuggestionCount: " + getSuggestionCount() + ",");
        if (getOnlyAvailable() != null)
            sb.append("OnlyAvailable: " + getOnlyAvailable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getSuggestionCount() == null) ? 0 : getSuggestionCount().hashCode());
        hashCode = prime * hashCode
                + ((getOnlyAvailable() == null) ? 0 : getOnlyAvailable().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDomainSuggestionsRequest == false)
            return false;
        GetDomainSuggestionsRequest other = (GetDomainSuggestionsRequest) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getSuggestionCount() == null ^ this.getSuggestionCount() == null)
            return false;
        if (other.getSuggestionCount() != null
                && other.getSuggestionCount().equals(this.getSuggestionCount()) == false)
            return false;
        if (other.getOnlyAvailable() == null ^ this.getOnlyAvailable() == null)
            return false;
        if (other.getOnlyAvailable() != null
                && other.getOnlyAvailable().equals(this.getOnlyAvailable()) == false)
            return false;
        return true;
    }
}
