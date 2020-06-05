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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the name and version of the message template to use for the
 * message.
 * </p>
 */
public class Template implements Serializable {
    /**
     * <p>
     * The name of the message template to use for the message. If specified,
     * this value must match the name of an existing message template.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The unique identifier for the version of the message template to use for
     * the message. If specified, this value must match the identifier for an
     * existing template version. To retrieve a list of versions and version
     * identifiers for a template, use the <link
     * linkend="templates-template-name-template-type-versions">Template
     * Versions</link> resource.
     * </p>
     * <p>
     * If you don't specify a value for this property, Amazon Pinpoint uses the
     * <i>active version</i> of the template. The <i>active version</i> is
     * typically the version of a template that's been most recently reviewed
     * and approved for use, depending on your workflow. It isn't necessarily
     * the latest version of a template.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The name of the message template to use for the message. If specified,
     * this value must match the name of an existing message template.
     * </p>
     *
     * @return <p>
     *         The name of the message template to use for the message. If
     *         specified, this value must match the name of an existing message
     *         template.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the message template to use for the message. If specified,
     * this value must match the name of an existing message template.
     * </p>
     *
     * @param name <p>
     *            The name of the message template to use for the message. If
     *            specified, this value must match the name of an existing
     *            message template.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the message template to use for the message. If specified,
     * this value must match the name of an existing message template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the message template to use for the message. If
     *            specified, this value must match the name of an existing
     *            message template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Template withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the version of the message template to use for
     * the message. If specified, this value must match the identifier for an
     * existing template version. To retrieve a list of versions and version
     * identifiers for a template, use the <link
     * linkend="templates-template-name-template-type-versions">Template
     * Versions</link> resource.
     * </p>
     * <p>
     * If you don't specify a value for this property, Amazon Pinpoint uses the
     * <i>active version</i> of the template. The <i>active version</i> is
     * typically the version of a template that's been most recently reviewed
     * and approved for use, depending on your workflow. It isn't necessarily
     * the latest version of a template.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the version of the message template to
     *         use for the message. If specified, this value must match the
     *         identifier for an existing template version. To retrieve a list
     *         of versions and version identifiers for a template, use the <link
     *         linkend="templates-template-name-template-type-versions">Template
     *         Versions</link> resource.
     *         </p>
     *         <p>
     *         If you don't specify a value for this property, Amazon Pinpoint
     *         uses the <i>active version</i> of the template. The <i>active
     *         version</i> is typically the version of a template that's been
     *         most recently reviewed and approved for use, depending on your
     *         workflow. It isn't necessarily the latest version of a template.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * The unique identifier for the version of the message template to use for
     * the message. If specified, this value must match the identifier for an
     * existing template version. To retrieve a list of versions and version
     * identifiers for a template, use the <link
     * linkend="templates-template-name-template-type-versions">Template
     * Versions</link> resource.
     * </p>
     * <p>
     * If you don't specify a value for this property, Amazon Pinpoint uses the
     * <i>active version</i> of the template. The <i>active version</i> is
     * typically the version of a template that's been most recently reviewed
     * and approved for use, depending on your workflow. It isn't necessarily
     * the latest version of a template.
     * </p>
     *
     * @param version <p>
     *            The unique identifier for the version of the message template
     *            to use for the message. If specified, this value must match
     *            the identifier for an existing template version. To retrieve a
     *            list of versions and version identifiers for a template, use
     *            the <link
     *            linkend="templates-template-name-template-type-versions"
     *            >Template Versions</link> resource.
     *            </p>
     *            <p>
     *            If you don't specify a value for this property, Amazon
     *            Pinpoint uses the <i>active version</i> of the template. The
     *            <i>active version</i> is typically the version of a template
     *            that's been most recently reviewed and approved for use,
     *            depending on your workflow. It isn't necessarily the latest
     *            version of a template.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The unique identifier for the version of the message template to use for
     * the message. If specified, this value must match the identifier for an
     * existing template version. To retrieve a list of versions and version
     * identifiers for a template, use the <link
     * linkend="templates-template-name-template-type-versions">Template
     * Versions</link> resource.
     * </p>
     * <p>
     * If you don't specify a value for this property, Amazon Pinpoint uses the
     * <i>active version</i> of the template. The <i>active version</i> is
     * typically the version of a template that's been most recently reviewed
     * and approved for use, depending on your workflow. It isn't necessarily
     * the latest version of a template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The unique identifier for the version of the message template
     *            to use for the message. If specified, this value must match
     *            the identifier for an existing template version. To retrieve a
     *            list of versions and version identifiers for a template, use
     *            the <link
     *            linkend="templates-template-name-template-type-versions"
     *            >Template Versions</link> resource.
     *            </p>
     *            <p>
     *            If you don't specify a value for this property, Amazon
     *            Pinpoint uses the <i>active version</i> of the template. The
     *            <i>active version</i> is typically the version of a template
     *            that's been most recently reviewed and approved for use,
     *            depending on your workflow. It isn't necessarily the latest
     *            version of a template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Template withVersion(String version) {
        this.version = version;
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
            sb.append("Name: " + getName() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Template == false)
            return false;
        Template other = (Template) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }
}
