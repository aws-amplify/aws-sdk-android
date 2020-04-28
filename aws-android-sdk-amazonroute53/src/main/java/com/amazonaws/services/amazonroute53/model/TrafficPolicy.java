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

package com.amazonaws.services.amazonroute53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains settings for a traffic policy.
 * </p>
 */
public class TrafficPolicy implements Serializable {
    /**
     * <p>
     * The ID that Amazon Route 53 assigned to a traffic policy when you created
     * it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     */
    private String id;

    /**
     * <p>
     * The version number that Amazon Route 53 assigns to a traffic policy. For
     * a new traffic policy, the value of <code>Version</code> is always 1.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer version;

    /**
     * <p>
     * The name that you specified when you created the traffic policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     */
    private String name;

    /**
     * <p>
     * The DNS type of the resource record sets that Amazon Route 53 creates
     * when you use a traffic policy to create a traffic policy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     */
    private String type;

    /**
     * <p>
     * The definition of a traffic policy in JSON format. You specify the JSON
     * document to use for a new traffic policy in the
     * <code>CreateTrafficPolicy</code> request. For more information about the
     * JSON format, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html"
     * >Traffic Policy Document Format</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 102400<br/>
     */
    private String document;

    /**
     * <p>
     * The comment that you specify in the <code>CreateTrafficPolicy</code>
     * request, if any.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String comment;

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to a traffic policy when you created
     * it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @return <p>
     *         The ID that Amazon Route 53 assigned to a traffic policy when you
     *         created it.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to a traffic policy when you created
     * it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param id <p>
     *            The ID that Amazon Route 53 assigned to a traffic policy when
     *            you created it.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to a traffic policy when you created
     * it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param id <p>
     *            The ID that Amazon Route 53 assigned to a traffic policy when
     *            you created it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficPolicy withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The version number that Amazon Route 53 assigns to a traffic policy. For
     * a new traffic policy, the value of <code>Version</code> is always 1.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The version number that Amazon Route 53 assigns to a traffic
     *         policy. For a new traffic policy, the value of
     *         <code>Version</code> is always 1.
     *         </p>
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * <p>
     * The version number that Amazon Route 53 assigns to a traffic policy. For
     * a new traffic policy, the value of <code>Version</code> is always 1.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param version <p>
     *            The version number that Amazon Route 53 assigns to a traffic
     *            policy. For a new traffic policy, the value of
     *            <code>Version</code> is always 1.
     *            </p>
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The version number that Amazon Route 53 assigns to a traffic policy. For
     * a new traffic policy, the value of <code>Version</code> is always 1.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param version <p>
     *            The version number that Amazon Route 53 assigns to a traffic
     *            policy. For a new traffic policy, the value of
     *            <code>Version</code> is always 1.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficPolicy withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The name that you specified when you created the traffic policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     *
     * @return <p>
     *         The name that you specified when you created the traffic policy.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name that you specified when you created the traffic policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     *
     * @param name <p>
     *            The name that you specified when you created the traffic
     *            policy.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name that you specified when you created the traffic policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     *
     * @param name <p>
     *            The name that you specified when you created the traffic
     *            policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficPolicy withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The DNS type of the resource record sets that Amazon Route 53 creates
     * when you use a traffic policy to create a traffic policy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @return <p>
     *         The DNS type of the resource record sets that Amazon Route 53
     *         creates when you use a traffic policy to create a traffic policy
     *         instance.
     *         </p>
     * @see RRType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The DNS type of the resource record sets that Amazon Route 53 creates
     * when you use a traffic policy to create a traffic policy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param type <p>
     *            The DNS type of the resource record sets that Amazon Route 53
     *            creates when you use a traffic policy to create a traffic
     *            policy instance.
     *            </p>
     * @see RRType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The DNS type of the resource record sets that Amazon Route 53 creates
     * when you use a traffic policy to create a traffic policy instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param type <p>
     *            The DNS type of the resource record sets that Amazon Route 53
     *            creates when you use a traffic policy to create a traffic
     *            policy instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RRType
     */
    public TrafficPolicy withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The DNS type of the resource record sets that Amazon Route 53 creates
     * when you use a traffic policy to create a traffic policy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param type <p>
     *            The DNS type of the resource record sets that Amazon Route 53
     *            creates when you use a traffic policy to create a traffic
     *            policy instance.
     *            </p>
     * @see RRType
     */
    public void setType(RRType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The DNS type of the resource record sets that Amazon Route 53 creates
     * when you use a traffic policy to create a traffic policy instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param type <p>
     *            The DNS type of the resource record sets that Amazon Route 53
     *            creates when you use a traffic policy to create a traffic
     *            policy instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RRType
     */
    public TrafficPolicy withType(RRType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The definition of a traffic policy in JSON format. You specify the JSON
     * document to use for a new traffic policy in the
     * <code>CreateTrafficPolicy</code> request. For more information about the
     * JSON format, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html"
     * >Traffic Policy Document Format</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 102400<br/>
     *
     * @return <p>
     *         The definition of a traffic policy in JSON format. You specify
     *         the JSON document to use for a new traffic policy in the
     *         <code>CreateTrafficPolicy</code> request. For more information
     *         about the JSON format, see <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html"
     *         >Traffic Policy Document Format</a>.
     *         </p>
     */
    public String getDocument() {
        return document;
    }

    /**
     * <p>
     * The definition of a traffic policy in JSON format. You specify the JSON
     * document to use for a new traffic policy in the
     * <code>CreateTrafficPolicy</code> request. For more information about the
     * JSON format, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html"
     * >Traffic Policy Document Format</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 102400<br/>
     *
     * @param document <p>
     *            The definition of a traffic policy in JSON format. You specify
     *            the JSON document to use for a new traffic policy in the
     *            <code>CreateTrafficPolicy</code> request. For more information
     *            about the JSON format, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html"
     *            >Traffic Policy Document Format</a>.
     *            </p>
     */
    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * <p>
     * The definition of a traffic policy in JSON format. You specify the JSON
     * document to use for a new traffic policy in the
     * <code>CreateTrafficPolicy</code> request. For more information about the
     * JSON format, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html"
     * >Traffic Policy Document Format</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 102400<br/>
     *
     * @param document <p>
     *            The definition of a traffic policy in JSON format. You specify
     *            the JSON document to use for a new traffic policy in the
     *            <code>CreateTrafficPolicy</code> request. For more information
     *            about the JSON format, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html"
     *            >Traffic Policy Document Format</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficPolicy withDocument(String document) {
        this.document = document;
        return this;
    }

    /**
     * <p>
     * The comment that you specify in the <code>CreateTrafficPolicy</code>
     * request, if any.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The comment that you specify in the
     *         <code>CreateTrafficPolicy</code> request, if any.
     *         </p>
     */
    public String getComment() {
        return comment;
    }

    /**
     * <p>
     * The comment that you specify in the <code>CreateTrafficPolicy</code>
     * request, if any.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param comment <p>
     *            The comment that you specify in the
     *            <code>CreateTrafficPolicy</code> request, if any.
     *            </p>
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * The comment that you specify in the <code>CreateTrafficPolicy</code>
     * request, if any.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param comment <p>
     *            The comment that you specify in the
     *            <code>CreateTrafficPolicy</code> request, if any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficPolicy withComment(String comment) {
        this.comment = comment;
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
            sb.append("Id: " + getId() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getDocument() != null)
            sb.append("Document: " + getDocument() + ",");
        if (getComment() != null)
            sb.append("Comment: " + getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrafficPolicy == false)
            return false;
        TrafficPolicy other = (TrafficPolicy) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
    }
}
