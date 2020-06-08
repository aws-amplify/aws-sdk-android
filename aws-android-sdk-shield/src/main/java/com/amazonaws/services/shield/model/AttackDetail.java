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

package com.amazonaws.services.shield.model;

import java.io.Serializable;

/**
 * <p>
 * The details of a DDoS attack.
 * </p>
 */
public class AttackDetail implements Serializable {
    /**
     * <p>
     * The unique identifier (ID) of the attack.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\\-]*<br/>
     */
    private String attackId;

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource that was attacked.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^arn:aws.*<br/>
     */
    private String resourceArn;

    /**
     * <p>
     * If applicable, additional detail about the resource being attacked, for
     * example, IP address or URL.
     * </p>
     */
    private java.util.List<SubResourceSummary> subResources;

    /**
     * <p>
     * The time the attack started, in Unix time in seconds. For more
     * information see <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp</a>.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The time the attack ended, in Unix time in seconds. For more information
     * see <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp</a>.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * List of counters that describe the attack for the specified time period.
     * </p>
     */
    private java.util.List<SummarizedCounter> attackCounters;

    /**
     * <p>
     * The array of <a>AttackProperty</a> objects.
     * </p>
     */
    private java.util.List<AttackProperty> attackProperties;

    /**
     * <p>
     * List of mitigation actions taken for the attack.
     * </p>
     */
    private java.util.List<Mitigation> mitigations;

    /**
     * <p>
     * The unique identifier (ID) of the attack.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\\-]*<br/>
     *
     * @return <p>
     *         The unique identifier (ID) of the attack.
     *         </p>
     */
    public String getAttackId() {
        return attackId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the attack.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\\-]*<br/>
     *
     * @param attackId <p>
     *            The unique identifier (ID) of the attack.
     *            </p>
     */
    public void setAttackId(String attackId) {
        this.attackId = attackId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the attack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\\-]*<br/>
     *
     * @param attackId <p>
     *            The unique identifier (ID) of the attack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttackDetail withAttackId(String attackId) {
        this.attackId = attackId;
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource that was attacked.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^arn:aws.*<br/>
     *
     * @return <p>
     *         The ARN (Amazon Resource Name) of the resource that was attacked.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource that was attacked.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^arn:aws.*<br/>
     *
     * @param resourceArn <p>
     *            The ARN (Amazon Resource Name) of the resource that was
     *            attacked.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource that was attacked.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^arn:aws.*<br/>
     *
     * @param resourceArn <p>
     *            The ARN (Amazon Resource Name) of the resource that was
     *            attacked.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttackDetail withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * If applicable, additional detail about the resource being attacked, for
     * example, IP address or URL.
     * </p>
     *
     * @return <p>
     *         If applicable, additional detail about the resource being
     *         attacked, for example, IP address or URL.
     *         </p>
     */
    public java.util.List<SubResourceSummary> getSubResources() {
        return subResources;
    }

    /**
     * <p>
     * If applicable, additional detail about the resource being attacked, for
     * example, IP address or URL.
     * </p>
     *
     * @param subResources <p>
     *            If applicable, additional detail about the resource being
     *            attacked, for example, IP address or URL.
     *            </p>
     */
    public void setSubResources(java.util.Collection<SubResourceSummary> subResources) {
        if (subResources == null) {
            this.subResources = null;
            return;
        }

        this.subResources = new java.util.ArrayList<SubResourceSummary>(subResources);
    }

    /**
     * <p>
     * If applicable, additional detail about the resource being attacked, for
     * example, IP address or URL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subResources <p>
     *            If applicable, additional detail about the resource being
     *            attacked, for example, IP address or URL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttackDetail withSubResources(SubResourceSummary... subResources) {
        if (getSubResources() == null) {
            this.subResources = new java.util.ArrayList<SubResourceSummary>(subResources.length);
        }
        for (SubResourceSummary value : subResources) {
            this.subResources.add(value);
        }
        return this;
    }

    /**
     * <p>
     * If applicable, additional detail about the resource being attacked, for
     * example, IP address or URL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subResources <p>
     *            If applicable, additional detail about the resource being
     *            attacked, for example, IP address or URL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttackDetail withSubResources(java.util.Collection<SubResourceSummary> subResources) {
        setSubResources(subResources);
        return this;
    }

    /**
     * <p>
     * The time the attack started, in Unix time in seconds. For more
     * information see <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp</a>.
     * </p>
     *
     * @return <p>
     *         The time the attack started, in Unix time in seconds. For more
     *         information see <a href=
     *         "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *         >timestamp</a>.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The time the attack started, in Unix time in seconds. For more
     * information see <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp</a>.
     * </p>
     *
     * @param startTime <p>
     *            The time the attack started, in Unix time in seconds. For more
     *            information see <a href=
     *            "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *            >timestamp</a>.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time the attack started, in Unix time in seconds. For more
     * information see <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The time the attack started, in Unix time in seconds. For more
     *            information see <a href=
     *            "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *            >timestamp</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttackDetail withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The time the attack ended, in Unix time in seconds. For more information
     * see <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp</a>.
     * </p>
     *
     * @return <p>
     *         The time the attack ended, in Unix time in seconds. For more
     *         information see <a href=
     *         "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *         >timestamp</a>.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The time the attack ended, in Unix time in seconds. For more information
     * see <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp</a>.
     * </p>
     *
     * @param endTime <p>
     *            The time the attack ended, in Unix time in seconds. For more
     *            information see <a href=
     *            "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *            >timestamp</a>.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time the attack ended, in Unix time in seconds. For more information
     * see <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The time the attack ended, in Unix time in seconds. For more
     *            information see <a href=
     *            "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *            >timestamp</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttackDetail withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * List of counters that describe the attack for the specified time period.
     * </p>
     *
     * @return <p>
     *         List of counters that describe the attack for the specified time
     *         period.
     *         </p>
     */
    public java.util.List<SummarizedCounter> getAttackCounters() {
        return attackCounters;
    }

    /**
     * <p>
     * List of counters that describe the attack for the specified time period.
     * </p>
     *
     * @param attackCounters <p>
     *            List of counters that describe the attack for the specified
     *            time period.
     *            </p>
     */
    public void setAttackCounters(java.util.Collection<SummarizedCounter> attackCounters) {
        if (attackCounters == null) {
            this.attackCounters = null;
            return;
        }

        this.attackCounters = new java.util.ArrayList<SummarizedCounter>(attackCounters);
    }

    /**
     * <p>
     * List of counters that describe the attack for the specified time period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attackCounters <p>
     *            List of counters that describe the attack for the specified
     *            time period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttackDetail withAttackCounters(SummarizedCounter... attackCounters) {
        if (getAttackCounters() == null) {
            this.attackCounters = new java.util.ArrayList<SummarizedCounter>(attackCounters.length);
        }
        for (SummarizedCounter value : attackCounters) {
            this.attackCounters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of counters that describe the attack for the specified time period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attackCounters <p>
     *            List of counters that describe the attack for the specified
     *            time period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttackDetail withAttackCounters(java.util.Collection<SummarizedCounter> attackCounters) {
        setAttackCounters(attackCounters);
        return this;
    }

    /**
     * <p>
     * The array of <a>AttackProperty</a> objects.
     * </p>
     *
     * @return <p>
     *         The array of <a>AttackProperty</a> objects.
     *         </p>
     */
    public java.util.List<AttackProperty> getAttackProperties() {
        return attackProperties;
    }

    /**
     * <p>
     * The array of <a>AttackProperty</a> objects.
     * </p>
     *
     * @param attackProperties <p>
     *            The array of <a>AttackProperty</a> objects.
     *            </p>
     */
    public void setAttackProperties(java.util.Collection<AttackProperty> attackProperties) {
        if (attackProperties == null) {
            this.attackProperties = null;
            return;
        }

        this.attackProperties = new java.util.ArrayList<AttackProperty>(attackProperties);
    }

    /**
     * <p>
     * The array of <a>AttackProperty</a> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attackProperties <p>
     *            The array of <a>AttackProperty</a> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttackDetail withAttackProperties(AttackProperty... attackProperties) {
        if (getAttackProperties() == null) {
            this.attackProperties = new java.util.ArrayList<AttackProperty>(attackProperties.length);
        }
        for (AttackProperty value : attackProperties) {
            this.attackProperties.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The array of <a>AttackProperty</a> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attackProperties <p>
     *            The array of <a>AttackProperty</a> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttackDetail withAttackProperties(java.util.Collection<AttackProperty> attackProperties) {
        setAttackProperties(attackProperties);
        return this;
    }

    /**
     * <p>
     * List of mitigation actions taken for the attack.
     * </p>
     *
     * @return <p>
     *         List of mitigation actions taken for the attack.
     *         </p>
     */
    public java.util.List<Mitigation> getMitigations() {
        return mitigations;
    }

    /**
     * <p>
     * List of mitigation actions taken for the attack.
     * </p>
     *
     * @param mitigations <p>
     *            List of mitigation actions taken for the attack.
     *            </p>
     */
    public void setMitigations(java.util.Collection<Mitigation> mitigations) {
        if (mitigations == null) {
            this.mitigations = null;
            return;
        }

        this.mitigations = new java.util.ArrayList<Mitigation>(mitigations);
    }

    /**
     * <p>
     * List of mitigation actions taken for the attack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mitigations <p>
     *            List of mitigation actions taken for the attack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttackDetail withMitigations(Mitigation... mitigations) {
        if (getMitigations() == null) {
            this.mitigations = new java.util.ArrayList<Mitigation>(mitigations.length);
        }
        for (Mitigation value : mitigations) {
            this.mitigations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of mitigation actions taken for the attack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mitigations <p>
     *            List of mitigation actions taken for the attack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttackDetail withMitigations(java.util.Collection<Mitigation> mitigations) {
        setMitigations(mitigations);
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
        if (getAttackId() != null)
            sb.append("AttackId: " + getAttackId() + ",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: " + getResourceArn() + ",");
        if (getSubResources() != null)
            sb.append("SubResources: " + getSubResources() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getAttackCounters() != null)
            sb.append("AttackCounters: " + getAttackCounters() + ",");
        if (getAttackProperties() != null)
            sb.append("AttackProperties: " + getAttackProperties() + ",");
        if (getMitigations() != null)
            sb.append("Mitigations: " + getMitigations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttackId() == null) ? 0 : getAttackId().hashCode());
        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode
                + ((getSubResources() == null) ? 0 : getSubResources().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getAttackCounters() == null) ? 0 : getAttackCounters().hashCode());
        hashCode = prime * hashCode
                + ((getAttackProperties() == null) ? 0 : getAttackProperties().hashCode());
        hashCode = prime * hashCode
                + ((getMitigations() == null) ? 0 : getMitigations().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttackDetail == false)
            return false;
        AttackDetail other = (AttackDetail) obj;

        if (other.getAttackId() == null ^ this.getAttackId() == null)
            return false;
        if (other.getAttackId() != null && other.getAttackId().equals(this.getAttackId()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getSubResources() == null ^ this.getSubResources() == null)
            return false;
        if (other.getSubResources() != null
                && other.getSubResources().equals(this.getSubResources()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getAttackCounters() == null ^ this.getAttackCounters() == null)
            return false;
        if (other.getAttackCounters() != null
                && other.getAttackCounters().equals(this.getAttackCounters()) == false)
            return false;
        if (other.getAttackProperties() == null ^ this.getAttackProperties() == null)
            return false;
        if (other.getAttackProperties() != null
                && other.getAttackProperties().equals(this.getAttackProperties()) == false)
            return false;
        if (other.getMitigations() == null ^ this.getMitigations() == null)
            return false;
        if (other.getMitigations() != null
                && other.getMitigations().equals(this.getMitigations()) == false)
            return false;
        return true;
    }
}
