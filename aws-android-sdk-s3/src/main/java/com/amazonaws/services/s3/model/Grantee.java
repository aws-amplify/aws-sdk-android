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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Container for the person being granted permissions.
 * </p>
 */
public class Grantee implements Serializable {
    /**
     * <p>
     * Screen name of the grantee.
     * </p>
     */
    private String displayName;

    /**
     * <p>
     * Email address of the grantee.
     * </p>
     * <note>
     * <p>
     * Using email addresses to specify a grantee is only supported in the
     * following AWS Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (N. California)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Singapore)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Tokyo)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland)
     * </p>
     * </li>
     * <li>
     * <p>
     * South America (São Paulo)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of all the Amazon S3 supported Regions and endpoints, see <a
     * href
     * ="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">
     * Regions and Endpoints</a> in the AWS General Reference.
     * </p>
     * </note>
     */
    private String emailAddress;

    /**
     * <p>
     * The canonical user ID of the grantee.
     * </p>
     */
    private String iD;

    /**
     * <p>
     * Type of grantee
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CanonicalUser, AmazonCustomerByEmail, Group
     */
    private String type;

    /**
     * <p>
     * URI of the grantee group.
     * </p>
     */
    private String uRI;

    /**
     * <p>
     * Screen name of the grantee.
     * </p>
     *
     * @return <p>
     *         Screen name of the grantee.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * Screen name of the grantee.
     * </p>
     *
     * @param displayName <p>
     *            Screen name of the grantee.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * Screen name of the grantee.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param displayName <p>
     *            Screen name of the grantee.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Grantee withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * <p>
     * Email address of the grantee.
     * </p>
     * <note>
     * <p>
     * Using email addresses to specify a grantee is only supported in the
     * following AWS Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (N. California)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Singapore)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Tokyo)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland)
     * </p>
     * </li>
     * <li>
     * <p>
     * South America (São Paulo)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of all the Amazon S3 supported Regions and endpoints, see <a
     * href
     * ="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">
     * Regions and Endpoints</a> in the AWS General Reference.
     * </p>
     * </note>
     *
     * @return <p>
     *         Email address of the grantee.
     *         </p>
     *         <note>
     *         <p>
     *         Using email addresses to specify a grantee is only supported in
     *         the following AWS Regions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         US East (N. Virginia)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         US West (N. California)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         US West (Oregon)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Asia Pacific (Singapore)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Asia Pacific (Sydney)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Asia Pacific (Tokyo)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Europe (Ireland)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         South America (São Paulo)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For a list of all the Amazon S3 supported Regions and endpoints,
     *         see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"
     *         >Regions and Endpoints</a> in the AWS General Reference.
     *         </p>
     *         </note>
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * <p>
     * Email address of the grantee.
     * </p>
     * <note>
     * <p>
     * Using email addresses to specify a grantee is only supported in the
     * following AWS Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (N. California)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Singapore)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Tokyo)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland)
     * </p>
     * </li>
     * <li>
     * <p>
     * South America (São Paulo)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of all the Amazon S3 supported Regions and endpoints, see <a
     * href
     * ="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">
     * Regions and Endpoints</a> in the AWS General Reference.
     * </p>
     * </note>
     *
     * @param emailAddress <p>
     *            Email address of the grantee.
     *            </p>
     *            <note>
     *            <p>
     *            Using email addresses to specify a grantee is only supported
     *            in the following AWS Regions:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            US East (N. Virginia)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            US West (N. California)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            US West (Oregon)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Asia Pacific (Singapore)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Asia Pacific (Sydney)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Asia Pacific (Tokyo)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Europe (Ireland)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            South America (São Paulo)
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For a list of all the Amazon S3 supported Regions and
     *            endpoints, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"
     *            >Regions and Endpoints</a> in the AWS General Reference.
     *            </p>
     *            </note>
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * Email address of the grantee.
     * </p>
     * <note>
     * <p>
     * Using email addresses to specify a grantee is only supported in the
     * following AWS Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (N. California)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Singapore)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Tokyo)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland)
     * </p>
     * </li>
     * <li>
     * <p>
     * South America (São Paulo)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of all the Amazon S3 supported Regions and endpoints, see <a
     * href
     * ="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">
     * Regions and Endpoints</a> in the AWS General Reference.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param emailAddress <p>
     *            Email address of the grantee.
     *            </p>
     *            <note>
     *            <p>
     *            Using email addresses to specify a grantee is only supported
     *            in the following AWS Regions:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            US East (N. Virginia)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            US West (N. California)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            US West (Oregon)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Asia Pacific (Singapore)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Asia Pacific (Sydney)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Asia Pacific (Tokyo)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Europe (Ireland)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            South America (São Paulo)
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For a list of all the Amazon S3 supported Regions and
     *            endpoints, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"
     *            >Regions and Endpoints</a> in the AWS General Reference.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Grantee withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * <p>
     * The canonical user ID of the grantee.
     * </p>
     *
     * @return <p>
     *         The canonical user ID of the grantee.
     *         </p>
     */
    public String getID() {
        return iD;
    }

    /**
     * <p>
     * The canonical user ID of the grantee.
     * </p>
     *
     * @param iD <p>
     *            The canonical user ID of the grantee.
     *            </p>
     */
    public void setID(String iD) {
        this.iD = iD;
    }

    /**
     * <p>
     * The canonical user ID of the grantee.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iD <p>
     *            The canonical user ID of the grantee.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Grantee withID(String iD) {
        this.iD = iD;
        return this;
    }

    /**
     * <p>
     * Type of grantee
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CanonicalUser, AmazonCustomerByEmail, Group
     *
     * @return <p>
     *         Type of grantee
     *         </p>
     * @see Type
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Type of grantee
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CanonicalUser, AmazonCustomerByEmail, Group
     *
     * @param type <p>
     *            Type of grantee
     *            </p>
     * @see Type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type of grantee
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CanonicalUser, AmazonCustomerByEmail, Group
     *
     * @param type <p>
     *            Type of grantee
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Type
     */
    public Grantee withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Type of grantee
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CanonicalUser, AmazonCustomerByEmail, Group
     *
     * @param type <p>
     *            Type of grantee
     *            </p>
     * @see Type
     */
    public void setType(Type type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Type of grantee
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CanonicalUser, AmazonCustomerByEmail, Group
     *
     * @param type <p>
     *            Type of grantee
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Type
     */
    public Grantee withType(Type type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * URI of the grantee group.
     * </p>
     *
     * @return <p>
     *         URI of the grantee group.
     *         </p>
     */
    public String getURI() {
        return uRI;
    }

    /**
     * <p>
     * URI of the grantee group.
     * </p>
     *
     * @param uRI <p>
     *            URI of the grantee group.
     *            </p>
     */
    public void setURI(String uRI) {
        this.uRI = uRI;
    }

    /**
     * <p>
     * URI of the grantee group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uRI <p>
     *            URI of the grantee group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Grantee withURI(String uRI) {
        this.uRI = uRI;
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
        if (getDisplayName() != null)
            sb.append("DisplayName: " + getDisplayName() + ",");
        if (getEmailAddress() != null)
            sb.append("EmailAddress: " + getEmailAddress() + ",");
        if (getID() != null)
            sb.append("ID: " + getID() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getURI() != null)
            sb.append("URI: " + getURI());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode
                + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getID() == null) ? 0 : getID().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getURI() == null) ? 0 : getURI().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Grantee == false)
            return false;
        Grantee other = (Grantee) obj;

        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getEmailAddress() == null ^ this.getEmailAddress() == null)
            return false;
        if (other.getEmailAddress() != null
                && other.getEmailAddress().equals(this.getEmailAddress()) == false)
            return false;
        if (other.getID() == null ^ this.getID() == null)
            return false;
        if (other.getID() != null && other.getID().equals(this.getID()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getURI() == null ^ this.getURI() == null)
            return false;
        if (other.getURI() != null && other.getURI().equals(this.getURI()) == false)
            return false;
        return true;
    }
}
