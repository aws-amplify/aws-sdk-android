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

/**
 * <p>
 * Information for one billing record.
 * </p>
 */
public class BillingRecord implements Serializable {
    /**
     * <p>
     * The name of the domain that the billing record applies to. If the domain
     * name contains characters other than a-z, 0-9, and - (hyphen), such as an
     * internationalized domain name, then this value is in Punycode. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html"
     * >DNS Domain Name Format</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String domainName;

    /**
     * <p>
     * The operation that you were charged for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTER_DOMAIN, DELETE_DOMAIN,
     * TRANSFER_IN_DOMAIN, UPDATE_DOMAIN_CONTACT, UPDATE_NAMESERVER,
     * CHANGE_PRIVACY_PROTECTION, DOMAIN_LOCK, ENABLE_AUTORENEW,
     * DISABLE_AUTORENEW, ADD_DNSSEC, REMOVE_DNSSEC, EXPIRE_DOMAIN,
     * TRANSFER_OUT_DOMAIN, CHANGE_DOMAIN_OWNER, RENEW_DOMAIN, PUSH_DOMAIN,
     * INTERNAL_TRANSFER_OUT_DOMAIN, INTERNAL_TRANSFER_IN_DOMAIN
     */
    private String operation;

    /**
     * <p>
     * The ID of the invoice that is associated with the billing record.
     * </p>
     */
    private String invoiceId;

    /**
     * <p>
     * The date that the operation was billed, in Unix format.
     * </p>
     */
    private java.util.Date billDate;

    /**
     * <p>
     * The price that you were charged for the operation, in US dollars.
     * </p>
     * <p>
     * Example value: 12.0
     * </p>
     */
    private Double price;

    /**
     * <p>
     * The name of the domain that the billing record applies to. If the domain
     * name contains characters other than a-z, 0-9, and - (hyphen), such as an
     * internationalized domain name, then this value is in Punycode. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html"
     * >DNS Domain Name Format</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The name of the domain that the billing record applies to. If the
     *         domain name contains characters other than a-z, 0-9, and -
     *         (hyphen), such as an internationalized domain name, then this
     *         value is in Punycode. For more information, see <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html"
     *         >DNS Domain Name Format</a> in the <i>Amazon Route 53 Developer
     *         Guide</i>.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The name of the domain that the billing record applies to. If the domain
     * name contains characters other than a-z, 0-9, and - (hyphen), such as an
     * internationalized domain name, then this value is in Punycode. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html"
     * >DNS Domain Name Format</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The name of the domain that the billing record applies to. If
     *            the domain name contains characters other than a-z, 0-9, and -
     *            (hyphen), such as an internationalized domain name, then this
     *            value is in Punycode. For more information, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html"
     *            >DNS Domain Name Format</a> in the <i>Amazon Route 53
     *            Developer Guide</i>.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that the billing record applies to. If the domain
     * name contains characters other than a-z, 0-9, and - (hyphen), such as an
     * internationalized domain name, then this value is in Punycode. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html"
     * >DNS Domain Name Format</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The name of the domain that the billing record applies to. If
     *            the domain name contains characters other than a-z, 0-9, and -
     *            (hyphen), such as an internationalized domain name, then this
     *            value is in Punycode. For more information, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html"
     *            >DNS Domain Name Format</a> in the <i>Amazon Route 53
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BillingRecord withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * The operation that you were charged for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTER_DOMAIN, DELETE_DOMAIN,
     * TRANSFER_IN_DOMAIN, UPDATE_DOMAIN_CONTACT, UPDATE_NAMESERVER,
     * CHANGE_PRIVACY_PROTECTION, DOMAIN_LOCK, ENABLE_AUTORENEW,
     * DISABLE_AUTORENEW, ADD_DNSSEC, REMOVE_DNSSEC, EXPIRE_DOMAIN,
     * TRANSFER_OUT_DOMAIN, CHANGE_DOMAIN_OWNER, RENEW_DOMAIN, PUSH_DOMAIN,
     * INTERNAL_TRANSFER_OUT_DOMAIN, INTERNAL_TRANSFER_IN_DOMAIN
     *
     * @return <p>
     *         The operation that you were charged for.
     *         </p>
     * @see OperationType
     */
    public String getOperation() {
        return operation;
    }

    /**
     * <p>
     * The operation that you were charged for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTER_DOMAIN, DELETE_DOMAIN,
     * TRANSFER_IN_DOMAIN, UPDATE_DOMAIN_CONTACT, UPDATE_NAMESERVER,
     * CHANGE_PRIVACY_PROTECTION, DOMAIN_LOCK, ENABLE_AUTORENEW,
     * DISABLE_AUTORENEW, ADD_DNSSEC, REMOVE_DNSSEC, EXPIRE_DOMAIN,
     * TRANSFER_OUT_DOMAIN, CHANGE_DOMAIN_OWNER, RENEW_DOMAIN, PUSH_DOMAIN,
     * INTERNAL_TRANSFER_OUT_DOMAIN, INTERNAL_TRANSFER_IN_DOMAIN
     *
     * @param operation <p>
     *            The operation that you were charged for.
     *            </p>
     * @see OperationType
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * The operation that you were charged for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTER_DOMAIN, DELETE_DOMAIN,
     * TRANSFER_IN_DOMAIN, UPDATE_DOMAIN_CONTACT, UPDATE_NAMESERVER,
     * CHANGE_PRIVACY_PROTECTION, DOMAIN_LOCK, ENABLE_AUTORENEW,
     * DISABLE_AUTORENEW, ADD_DNSSEC, REMOVE_DNSSEC, EXPIRE_DOMAIN,
     * TRANSFER_OUT_DOMAIN, CHANGE_DOMAIN_OWNER, RENEW_DOMAIN, PUSH_DOMAIN,
     * INTERNAL_TRANSFER_OUT_DOMAIN, INTERNAL_TRANSFER_IN_DOMAIN
     *
     * @param operation <p>
     *            The operation that you were charged for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperationType
     */
    public BillingRecord withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * <p>
     * The operation that you were charged for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTER_DOMAIN, DELETE_DOMAIN,
     * TRANSFER_IN_DOMAIN, UPDATE_DOMAIN_CONTACT, UPDATE_NAMESERVER,
     * CHANGE_PRIVACY_PROTECTION, DOMAIN_LOCK, ENABLE_AUTORENEW,
     * DISABLE_AUTORENEW, ADD_DNSSEC, REMOVE_DNSSEC, EXPIRE_DOMAIN,
     * TRANSFER_OUT_DOMAIN, CHANGE_DOMAIN_OWNER, RENEW_DOMAIN, PUSH_DOMAIN,
     * INTERNAL_TRANSFER_OUT_DOMAIN, INTERNAL_TRANSFER_IN_DOMAIN
     *
     * @param operation <p>
     *            The operation that you were charged for.
     *            </p>
     * @see OperationType
     */
    public void setOperation(OperationType operation) {
        this.operation = operation.toString();
    }

    /**
     * <p>
     * The operation that you were charged for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTER_DOMAIN, DELETE_DOMAIN,
     * TRANSFER_IN_DOMAIN, UPDATE_DOMAIN_CONTACT, UPDATE_NAMESERVER,
     * CHANGE_PRIVACY_PROTECTION, DOMAIN_LOCK, ENABLE_AUTORENEW,
     * DISABLE_AUTORENEW, ADD_DNSSEC, REMOVE_DNSSEC, EXPIRE_DOMAIN,
     * TRANSFER_OUT_DOMAIN, CHANGE_DOMAIN_OWNER, RENEW_DOMAIN, PUSH_DOMAIN,
     * INTERNAL_TRANSFER_OUT_DOMAIN, INTERNAL_TRANSFER_IN_DOMAIN
     *
     * @param operation <p>
     *            The operation that you were charged for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperationType
     */
    public BillingRecord withOperation(OperationType operation) {
        this.operation = operation.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the invoice that is associated with the billing record.
     * </p>
     *
     * @return <p>
     *         The ID of the invoice that is associated with the billing record.
     *         </p>
     */
    public String getInvoiceId() {
        return invoiceId;
    }

    /**
     * <p>
     * The ID of the invoice that is associated with the billing record.
     * </p>
     *
     * @param invoiceId <p>
     *            The ID of the invoice that is associated with the billing
     *            record.
     *            </p>
     */
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     * <p>
     * The ID of the invoice that is associated with the billing record.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invoiceId <p>
     *            The ID of the invoice that is associated with the billing
     *            record.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BillingRecord withInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
        return this;
    }

    /**
     * <p>
     * The date that the operation was billed, in Unix format.
     * </p>
     *
     * @return <p>
     *         The date that the operation was billed, in Unix format.
     *         </p>
     */
    public java.util.Date getBillDate() {
        return billDate;
    }

    /**
     * <p>
     * The date that the operation was billed, in Unix format.
     * </p>
     *
     * @param billDate <p>
     *            The date that the operation was billed, in Unix format.
     *            </p>
     */
    public void setBillDate(java.util.Date billDate) {
        this.billDate = billDate;
    }

    /**
     * <p>
     * The date that the operation was billed, in Unix format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param billDate <p>
     *            The date that the operation was billed, in Unix format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BillingRecord withBillDate(java.util.Date billDate) {
        this.billDate = billDate;
        return this;
    }

    /**
     * <p>
     * The price that you were charged for the operation, in US dollars.
     * </p>
     * <p>
     * Example value: 12.0
     * </p>
     *
     * @return <p>
     *         The price that you were charged for the operation, in US dollars.
     *         </p>
     *         <p>
     *         Example value: 12.0
     *         </p>
     */
    public Double getPrice() {
        return price;
    }

    /**
     * <p>
     * The price that you were charged for the operation, in US dollars.
     * </p>
     * <p>
     * Example value: 12.0
     * </p>
     *
     * @param price <p>
     *            The price that you were charged for the operation, in US
     *            dollars.
     *            </p>
     *            <p>
     *            Example value: 12.0
     *            </p>
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * <p>
     * The price that you were charged for the operation, in US dollars.
     * </p>
     * <p>
     * Example value: 12.0
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param price <p>
     *            The price that you were charged for the operation, in US
     *            dollars.
     *            </p>
     *            <p>
     *            Example value: 12.0
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BillingRecord withPrice(Double price) {
        this.price = price;
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
        if (getOperation() != null)
            sb.append("Operation: " + getOperation() + ",");
        if (getInvoiceId() != null)
            sb.append("InvoiceId: " + getInvoiceId() + ",");
        if (getBillDate() != null)
            sb.append("BillDate: " + getBillDate() + ",");
        if (getPrice() != null)
            sb.append("Price: " + getPrice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getInvoiceId() == null) ? 0 : getInvoiceId().hashCode());
        hashCode = prime * hashCode + ((getBillDate() == null) ? 0 : getBillDate().hashCode());
        hashCode = prime * hashCode + ((getPrice() == null) ? 0 : getPrice().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BillingRecord == false)
            return false;
        BillingRecord other = (BillingRecord) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null
                && other.getOperation().equals(this.getOperation()) == false)
            return false;
        if (other.getInvoiceId() == null ^ this.getInvoiceId() == null)
            return false;
        if (other.getInvoiceId() != null
                && other.getInvoiceId().equals(this.getInvoiceId()) == false)
            return false;
        if (other.getBillDate() == null ^ this.getBillDate() == null)
            return false;
        if (other.getBillDate() != null && other.getBillDate().equals(this.getBillDate()) == false)
            return false;
        if (other.getPrice() == null ^ this.getPrice() == null)
            return false;
        if (other.getPrice() != null && other.getPrice().equals(this.getPrice()) == false)
            return false;
        return true;
    }
}
