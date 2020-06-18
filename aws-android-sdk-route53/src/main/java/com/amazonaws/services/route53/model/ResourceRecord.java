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
 * Information specific to the resource record.
 * </p>
 * <note>
 * <p>
 * If you're creating an alias resource record set, omit
 * <code>ResourceRecord</code>.
 * </p>
 * </note>
 */
public class ResourceRecord implements Serializable {
    /**
     * <p>
     * The current or new DNS record value, not to exceed 4,000 characters. In
     * the case of a <code>DELETE</code> action, if the current value does not
     * match the actual value, an error is returned. For descriptions about how
     * to format <code>Value</code> for different record types, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html"
     * >Supported DNS Resource Record Types</a> in the <i>Amazon Route 53
     * Developer Guide</i>.
     * </p>
     * <p>
     * You can specify more than one value for all record types except
     * <code>CNAME</code> and <code>SOA</code>.
     * </p>
     * <note>
     * <p>
     * If you're creating an alias resource record set, omit <code>Value</code>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4000<br/>
     */
    private String value;

    /**
     * <p>
     * The current or new DNS record value, not to exceed 4,000 characters. In
     * the case of a <code>DELETE</code> action, if the current value does not
     * match the actual value, an error is returned. For descriptions about how
     * to format <code>Value</code> for different record types, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html"
     * >Supported DNS Resource Record Types</a> in the <i>Amazon Route 53
     * Developer Guide</i>.
     * </p>
     * <p>
     * You can specify more than one value for all record types except
     * <code>CNAME</code> and <code>SOA</code>.
     * </p>
     * <note>
     * <p>
     * If you're creating an alias resource record set, omit <code>Value</code>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4000<br/>
     *
     * @return <p>
     *         The current or new DNS record value, not to exceed 4,000
     *         characters. In the case of a <code>DELETE</code> action, if the
     *         current value does not match the actual value, an error is
     *         returned. For descriptions about how to format <code>Value</code>
     *         for different record types, see <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html"
     *         >Supported DNS Resource Record Types</a> in the <i>Amazon Route
     *         53 Developer Guide</i>.
     *         </p>
     *         <p>
     *         You can specify more than one value for all record types except
     *         <code>CNAME</code> and <code>SOA</code>.
     *         </p>
     *         <note>
     *         <p>
     *         If you're creating an alias resource record set, omit
     *         <code>Value</code>.
     *         </p>
     *         </note>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The current or new DNS record value, not to exceed 4,000 characters. In
     * the case of a <code>DELETE</code> action, if the current value does not
     * match the actual value, an error is returned. For descriptions about how
     * to format <code>Value</code> for different record types, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html"
     * >Supported DNS Resource Record Types</a> in the <i>Amazon Route 53
     * Developer Guide</i>.
     * </p>
     * <p>
     * You can specify more than one value for all record types except
     * <code>CNAME</code> and <code>SOA</code>.
     * </p>
     * <note>
     * <p>
     * If you're creating an alias resource record set, omit <code>Value</code>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4000<br/>
     *
     * @param value <p>
     *            The current or new DNS record value, not to exceed 4,000
     *            characters. In the case of a <code>DELETE</code> action, if
     *            the current value does not match the actual value, an error is
     *            returned. For descriptions about how to format
     *            <code>Value</code> for different record types, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html"
     *            >Supported DNS Resource Record Types</a> in the <i>Amazon
     *            Route 53 Developer Guide</i>.
     *            </p>
     *            <p>
     *            You can specify more than one value for all record types
     *            except <code>CNAME</code> and <code>SOA</code>.
     *            </p>
     *            <note>
     *            <p>
     *            If you're creating an alias resource record set, omit
     *            <code>Value</code>.
     *            </p>
     *            </note>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The current or new DNS record value, not to exceed 4,000 characters. In
     * the case of a <code>DELETE</code> action, if the current value does not
     * match the actual value, an error is returned. For descriptions about how
     * to format <code>Value</code> for different record types, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html"
     * >Supported DNS Resource Record Types</a> in the <i>Amazon Route 53
     * Developer Guide</i>.
     * </p>
     * <p>
     * You can specify more than one value for all record types except
     * <code>CNAME</code> and <code>SOA</code>.
     * </p>
     * <note>
     * <p>
     * If you're creating an alias resource record set, omit <code>Value</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4000<br/>
     *
     * @param value <p>
     *            The current or new DNS record value, not to exceed 4,000
     *            characters. In the case of a <code>DELETE</code> action, if
     *            the current value does not match the actual value, an error is
     *            returned. For descriptions about how to format
     *            <code>Value</code> for different record types, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ResourceRecordTypes.html"
     *            >Supported DNS Resource Record Types</a> in the <i>Amazon
     *            Route 53 Developer Guide</i>.
     *            </p>
     *            <p>
     *            You can specify more than one value for all record types
     *            except <code>CNAME</code> and <code>SOA</code>.
     *            </p>
     *            <note>
     *            <p>
     *            If you're creating an alias resource record set, omit
     *            <code>Value</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceRecord withValue(String value) {
        this.value = value;
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
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceRecord == false)
            return false;
        ResourceRecord other = (ResourceRecord) obj;

        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
