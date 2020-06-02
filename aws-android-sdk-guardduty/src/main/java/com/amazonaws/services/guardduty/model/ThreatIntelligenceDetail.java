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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

/**
 * <p>
 * An instance of a threat intelligence detail that constitutes evidence for the
 * finding.
 * </p>
 */
public class ThreatIntelligenceDetail implements Serializable {
    /**
     * <p>
     * The name of the threat intelligence list that triggered the finding.
     * </p>
     */
    private String threatListName;

    /**
     * <p>
     * A list of names of the threats in the threat intelligence list that
     * triggered the finding.
     * </p>
     */
    private java.util.List<String> threatNames;

    /**
     * <p>
     * The name of the threat intelligence list that triggered the finding.
     * </p>
     *
     * @return <p>
     *         The name of the threat intelligence list that triggered the
     *         finding.
     *         </p>
     */
    public String getThreatListName() {
        return threatListName;
    }

    /**
     * <p>
     * The name of the threat intelligence list that triggered the finding.
     * </p>
     *
     * @param threatListName <p>
     *            The name of the threat intelligence list that triggered the
     *            finding.
     *            </p>
     */
    public void setThreatListName(String threatListName) {
        this.threatListName = threatListName;
    }

    /**
     * <p>
     * The name of the threat intelligence list that triggered the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param threatListName <p>
     *            The name of the threat intelligence list that triggered the
     *            finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThreatIntelligenceDetail withThreatListName(String threatListName) {
        this.threatListName = threatListName;
        return this;
    }

    /**
     * <p>
     * A list of names of the threats in the threat intelligence list that
     * triggered the finding.
     * </p>
     *
     * @return <p>
     *         A list of names of the threats in the threat intelligence list
     *         that triggered the finding.
     *         </p>
     */
    public java.util.List<String> getThreatNames() {
        return threatNames;
    }

    /**
     * <p>
     * A list of names of the threats in the threat intelligence list that
     * triggered the finding.
     * </p>
     *
     * @param threatNames <p>
     *            A list of names of the threats in the threat intelligence list
     *            that triggered the finding.
     *            </p>
     */
    public void setThreatNames(java.util.Collection<String> threatNames) {
        if (threatNames == null) {
            this.threatNames = null;
            return;
        }

        this.threatNames = new java.util.ArrayList<String>(threatNames);
    }

    /**
     * <p>
     * A list of names of the threats in the threat intelligence list that
     * triggered the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param threatNames <p>
     *            A list of names of the threats in the threat intelligence list
     *            that triggered the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThreatIntelligenceDetail withThreatNames(String... threatNames) {
        if (getThreatNames() == null) {
            this.threatNames = new java.util.ArrayList<String>(threatNames.length);
        }
        for (String value : threatNames) {
            this.threatNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of names of the threats in the threat intelligence list that
     * triggered the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param threatNames <p>
     *            A list of names of the threats in the threat intelligence list
     *            that triggered the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThreatIntelligenceDetail withThreatNames(java.util.Collection<String> threatNames) {
        setThreatNames(threatNames);
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
        if (getThreatListName() != null)
            sb.append("ThreatListName: " + getThreatListName() + ",");
        if (getThreatNames() != null)
            sb.append("ThreatNames: " + getThreatNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getThreatListName() == null) ? 0 : getThreatListName().hashCode());
        hashCode = prime * hashCode
                + ((getThreatNames() == null) ? 0 : getThreatNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThreatIntelligenceDetail == false)
            return false;
        ThreatIntelligenceDetail other = (ThreatIntelligenceDetail) obj;

        if (other.getThreatListName() == null ^ this.getThreatListName() == null)
            return false;
        if (other.getThreatListName() != null
                && other.getThreatListName().equals(this.getThreatListName()) == false)
            return false;
        if (other.getThreatNames() == null ^ this.getThreatNames() == null)
            return false;
        if (other.getThreatNames() != null
                && other.getThreatNames().equals(this.getThreatNames()) == false)
            return false;
        return true;
    }
}
