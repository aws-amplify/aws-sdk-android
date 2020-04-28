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

package com.amazonaws.services.amazonec2containerregistry.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about an image scan finding.
 * </p>
 */
public class ImageScanFinding implements Serializable {
    /**
     * <p>
     * The name associated with the finding, usually a CVE number.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The description of the finding.
     * </p>
     */
    private String description;

    /**
     * <p>
     * A link containing additional details about the security vulnerability.
     * </p>
     */
    private String uri;

    /**
     * <p>
     * The finding severity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INFORMATIONAL, LOW, MEDIUM, HIGH, CRITICAL,
     * UNDEFINED
     */
    private String severity;

    /**
     * <p>
     * A collection of attributes of the host from which the finding is
     * generated.
     * </p>
     */
    private java.util.List<Attribute> attributes;

    /**
     * <p>
     * The name associated with the finding, usually a CVE number.
     * </p>
     *
     * @return <p>
     *         The name associated with the finding, usually a CVE number.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name associated with the finding, usually a CVE number.
     * </p>
     *
     * @param name <p>
     *            The name associated with the finding, usually a CVE number.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name associated with the finding, usually a CVE number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name associated with the finding, usually a CVE number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageScanFinding withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the finding.
     * </p>
     *
     * @return <p>
     *         The description of the finding.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the finding.
     * </p>
     *
     * @param description <p>
     *            The description of the finding.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageScanFinding withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A link containing additional details about the security vulnerability.
     * </p>
     *
     * @return <p>
     *         A link containing additional details about the security
     *         vulnerability.
     *         </p>
     */
    public String getUri() {
        return uri;
    }

    /**
     * <p>
     * A link containing additional details about the security vulnerability.
     * </p>
     *
     * @param uri <p>
     *            A link containing additional details about the security
     *            vulnerability.
     *            </p>
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * A link containing additional details about the security vulnerability.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uri <p>
     *            A link containing additional details about the security
     *            vulnerability.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageScanFinding withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * <p>
     * The finding severity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INFORMATIONAL, LOW, MEDIUM, HIGH, CRITICAL,
     * UNDEFINED
     *
     * @return <p>
     *         The finding severity.
     *         </p>
     * @see FindingSeverity
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * <p>
     * The finding severity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INFORMATIONAL, LOW, MEDIUM, HIGH, CRITICAL,
     * UNDEFINED
     *
     * @param severity <p>
     *            The finding severity.
     *            </p>
     * @see FindingSeverity
     */
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The finding severity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INFORMATIONAL, LOW, MEDIUM, HIGH, CRITICAL,
     * UNDEFINED
     *
     * @param severity <p>
     *            The finding severity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingSeverity
     */
    public ImageScanFinding withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * <p>
     * The finding severity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INFORMATIONAL, LOW, MEDIUM, HIGH, CRITICAL,
     * UNDEFINED
     *
     * @param severity <p>
     *            The finding severity.
     *            </p>
     * @see FindingSeverity
     */
    public void setSeverity(FindingSeverity severity) {
        this.severity = severity.toString();
    }

    /**
     * <p>
     * The finding severity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INFORMATIONAL, LOW, MEDIUM, HIGH, CRITICAL,
     * UNDEFINED
     *
     * @param severity <p>
     *            The finding severity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingSeverity
     */
    public ImageScanFinding withSeverity(FindingSeverity severity) {
        this.severity = severity.toString();
        return this;
    }

    /**
     * <p>
     * A collection of attributes of the host from which the finding is
     * generated.
     * </p>
     *
     * @return <p>
     *         A collection of attributes of the host from which the finding is
     *         generated.
     *         </p>
     */
    public java.util.List<Attribute> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A collection of attributes of the host from which the finding is
     * generated.
     * </p>
     *
     * @param attributes <p>
     *            A collection of attributes of the host from which the finding
     *            is generated.
     *            </p>
     */
    public void setAttributes(java.util.Collection<Attribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<Attribute>(attributes);
    }

    /**
     * <p>
     * A collection of attributes of the host from which the finding is
     * generated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            A collection of attributes of the host from which the finding
     *            is generated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageScanFinding withAttributes(Attribute... attributes) {
        if (getAttributes() == null) {
            this.attributes = new java.util.ArrayList<Attribute>(attributes.length);
        }
        for (Attribute value : attributes) {
            this.attributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A collection of attributes of the host from which the finding is
     * generated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            A collection of attributes of the host from which the finding
     *            is generated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageScanFinding withAttributes(java.util.Collection<Attribute> attributes) {
        setAttributes(attributes);
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getUri() != null)
            sb.append("uri: " + getUri() + ",");
        if (getSeverity() != null)
            sb.append("severity: " + getSeverity() + ",");
        if (getAttributes() != null)
            sb.append("attributes: " + getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageScanFinding == false)
            return false;
        ImageScanFinding other = (ImageScanFinding) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }
}
