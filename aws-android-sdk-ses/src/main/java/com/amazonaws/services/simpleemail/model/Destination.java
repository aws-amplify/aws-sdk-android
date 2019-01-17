/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the destination of the message, consisting of To:, CC:, and BCC:
 * fields.
 * </p>
 * <note>
 * <p>
 * Amazon SES does not support the SMTPUTF8 extension, as described in <a
 * href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason, the
 * <i>local part</i> of a destination email address (the part of the email
 * address that precedes the @ sign) may only contain <a
 * href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII
 * characters</a>. If the <i>domain part</i> of an address (the part after the @
 * sign) contains non-ASCII characters, they must be encoded using Punycode, as
 * described in <a href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>.
 * </p>
 * </note>
 */
public class Destination implements Serializable {
    /**
     * <p>
     * The To: field(s) of the message.
     * </p>
     */
    private java.util.List<String> toAddresses = new java.util.ArrayList<String>();

    /**
     * <p>
     * The CC: field(s) of the message.
     * </p>
     */
    private java.util.List<String> ccAddresses = new java.util.ArrayList<String>();

    /**
     * <p>
     * The BCC: field(s) of the message.
     * </p>
     */
    private java.util.List<String> bccAddresses = new java.util.ArrayList<String>();

    /**
     * Default constructor for Destination object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
     */
    public Destination() {
    }

    /**
     * Constructs a new Destination object. Callers should use the setter or
     * fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param toAddresses <p>
     *            The To: field(s) of the message.
     *            </p>
     */
    public Destination(java.util.List<String> toAddresses) {
        setToAddresses(toAddresses);
    }

    /**
     * <p>
     * The To: field(s) of the message.
     * </p>
     *
     * @return <p>
     *         The To: field(s) of the message.
     *         </p>
     */
    public java.util.List<String> getToAddresses() {
        return toAddresses;
    }

    /**
     * <p>
     * The To: field(s) of the message.
     * </p>
     *
     * @param toAddresses <p>
     *            The To: field(s) of the message.
     *            </p>
     */
    public void setToAddresses(java.util.Collection<String> toAddresses) {
        if (toAddresses == null) {
            this.toAddresses = null;
            return;
        }

        this.toAddresses = new java.util.ArrayList<String>(toAddresses);
    }

    /**
     * <p>
     * The To: field(s) of the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param toAddresses <p>
     *            The To: field(s) of the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Destination withToAddresses(String... toAddresses) {
        if (getToAddresses() == null) {
            this.toAddresses = new java.util.ArrayList<String>(toAddresses.length);
        }
        for (String value : toAddresses) {
            this.toAddresses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The To: field(s) of the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param toAddresses <p>
     *            The To: field(s) of the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Destination withToAddresses(java.util.Collection<String> toAddresses) {
        setToAddresses(toAddresses);
        return this;
    }

    /**
     * <p>
     * The CC: field(s) of the message.
     * </p>
     *
     * @return <p>
     *         The CC: field(s) of the message.
     *         </p>
     */
    public java.util.List<String> getCcAddresses() {
        return ccAddresses;
    }

    /**
     * <p>
     * The CC: field(s) of the message.
     * </p>
     *
     * @param ccAddresses <p>
     *            The CC: field(s) of the message.
     *            </p>
     */
    public void setCcAddresses(java.util.Collection<String> ccAddresses) {
        if (ccAddresses == null) {
            this.ccAddresses = null;
            return;
        }

        this.ccAddresses = new java.util.ArrayList<String>(ccAddresses);
    }

    /**
     * <p>
     * The CC: field(s) of the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ccAddresses <p>
     *            The CC: field(s) of the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Destination withCcAddresses(String... ccAddresses) {
        if (getCcAddresses() == null) {
            this.ccAddresses = new java.util.ArrayList<String>(ccAddresses.length);
        }
        for (String value : ccAddresses) {
            this.ccAddresses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The CC: field(s) of the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ccAddresses <p>
     *            The CC: field(s) of the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Destination withCcAddresses(java.util.Collection<String> ccAddresses) {
        setCcAddresses(ccAddresses);
        return this;
    }

    /**
     * <p>
     * The BCC: field(s) of the message.
     * </p>
     *
     * @return <p>
     *         The BCC: field(s) of the message.
     *         </p>
     */
    public java.util.List<String> getBccAddresses() {
        return bccAddresses;
    }

    /**
     * <p>
     * The BCC: field(s) of the message.
     * </p>
     *
     * @param bccAddresses <p>
     *            The BCC: field(s) of the message.
     *            </p>
     */
    public void setBccAddresses(java.util.Collection<String> bccAddresses) {
        if (bccAddresses == null) {
            this.bccAddresses = null;
            return;
        }

        this.bccAddresses = new java.util.ArrayList<String>(bccAddresses);
    }

    /**
     * <p>
     * The BCC: field(s) of the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bccAddresses <p>
     *            The BCC: field(s) of the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Destination withBccAddresses(String... bccAddresses) {
        if (getBccAddresses() == null) {
            this.bccAddresses = new java.util.ArrayList<String>(bccAddresses.length);
        }
        for (String value : bccAddresses) {
            this.bccAddresses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The BCC: field(s) of the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bccAddresses <p>
     *            The BCC: field(s) of the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Destination withBccAddresses(java.util.Collection<String> bccAddresses) {
        setBccAddresses(bccAddresses);
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
        if (getToAddresses() != null)
            sb.append("ToAddresses: " + getToAddresses() + ",");
        if (getCcAddresses() != null)
            sb.append("CcAddresses: " + getCcAddresses() + ",");
        if (getBccAddresses() != null)
            sb.append("BccAddresses: " + getBccAddresses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getToAddresses() == null) ? 0 : getToAddresses().hashCode());
        hashCode = prime * hashCode
                + ((getCcAddresses() == null) ? 0 : getCcAddresses().hashCode());
        hashCode = prime * hashCode
                + ((getBccAddresses() == null) ? 0 : getBccAddresses().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Destination == false)
            return false;
        Destination other = (Destination) obj;

        if (other.getToAddresses() == null ^ this.getToAddresses() == null)
            return false;
        if (other.getToAddresses() != null
                && other.getToAddresses().equals(this.getToAddresses()) == false)
            return false;
        if (other.getCcAddresses() == null ^ this.getCcAddresses() == null)
            return false;
        if (other.getCcAddresses() != null
                && other.getCcAddresses().equals(this.getCcAddresses()) == false)
            return false;
        if (other.getBccAddresses() == null ^ this.getBccAddresses() == null)
            return false;
        if (other.getBccAddresses() != null
                && other.getBccAddresses().equals(this.getBccAddresses()) == false)
            return false;
        return true;
    }
}
