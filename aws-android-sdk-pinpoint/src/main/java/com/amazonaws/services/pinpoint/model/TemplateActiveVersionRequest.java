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
 * Specifies which version of a message template to use as the active version of
 * the template.
 * </p>
 */
public class TemplateActiveVersionRequest implements Serializable {
    /**
     * <p>
     * The version of the message template to use as the active version of the
     * template. Valid values are: latest, for the most recent version of the
     * template; or, the unique identifier for any existing version of the
     * template. If you specify an identifier, the value must match the
     * identifier for an existing template version. To retrieve a list of
     * versions and version identifiers for a template, use the <link
     * linkend="templates-template-name-template-type-versions">Template
     * Versions</link> resource.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The version of the message template to use as the active version of the
     * template. Valid values are: latest, for the most recent version of the
     * template; or, the unique identifier for any existing version of the
     * template. If you specify an identifier, the value must match the
     * identifier for an existing template version. To retrieve a list of
     * versions and version identifiers for a template, use the <link
     * linkend="templates-template-name-template-type-versions">Template
     * Versions</link> resource.
     * </p>
     *
     * @return <p>
     *         The version of the message template to use as the active version
     *         of the template. Valid values are: latest, for the most recent
     *         version of the template; or, the unique identifier for any
     *         existing version of the template. If you specify an identifier,
     *         the value must match the identifier for an existing template
     *         version. To retrieve a list of versions and version identifiers
     *         for a template, use the <link
     *         linkend="templates-template-name-template-type-versions">Template
     *         Versions</link> resource.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * The version of the message template to use as the active version of the
     * template. Valid values are: latest, for the most recent version of the
     * template; or, the unique identifier for any existing version of the
     * template. If you specify an identifier, the value must match the
     * identifier for an existing template version. To retrieve a list of
     * versions and version identifiers for a template, use the <link
     * linkend="templates-template-name-template-type-versions">Template
     * Versions</link> resource.
     * </p>
     *
     * @param version <p>
     *            The version of the message template to use as the active
     *            version of the template. Valid values are: latest, for the
     *            most recent version of the template; or, the unique identifier
     *            for any existing version of the template. If you specify an
     *            identifier, the value must match the identifier for an
     *            existing template version. To retrieve a list of versions and
     *            version identifiers for a template, use the <link
     *            linkend="templates-template-name-template-type-versions"
     *            >Template Versions</link> resource.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the message template to use as the active version of the
     * template. Valid values are: latest, for the most recent version of the
     * template; or, the unique identifier for any existing version of the
     * template. If you specify an identifier, the value must match the
     * identifier for an existing template version. To retrieve a list of
     * versions and version identifiers for a template, use the <link
     * linkend="templates-template-name-template-type-versions">Template
     * Versions</link> resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The version of the message template to use as the active
     *            version of the template. Valid values are: latest, for the
     *            most recent version of the template; or, the unique identifier
     *            for any existing version of the template. If you specify an
     *            identifier, the value must match the identifier for an
     *            existing template version. To retrieve a list of versions and
     *            version identifiers for a template, use the <link
     *            linkend="templates-template-name-template-type-versions"
     *            >Template Versions</link> resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateActiveVersionRequest withVersion(String version) {
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
        if (getVersion() != null)
            sb.append("Version: " + getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateActiveVersionRequest == false)
            return false;
        TemplateActiveVersionRequest other = (TemplateActiveVersionRequest) obj;

        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }
}
