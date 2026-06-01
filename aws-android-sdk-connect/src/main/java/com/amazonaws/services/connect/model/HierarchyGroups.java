/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the agent hierarchy. Hierarchies can be configured with up
 * to five levels.
 * </p>
 */
public class HierarchyGroups implements Serializable {
    /**
     * <p>
     * The group at level one of the agent hierarchy.
     * </p>
     */
    private AgentHierarchyGroup level1;

    /**
     * <p>
     * The group at level two of the agent hierarchy.
     * </p>
     */
    private AgentHierarchyGroup level2;

    /**
     * <p>
     * The group at level three of the agent hierarchy.
     * </p>
     */
    private AgentHierarchyGroup level3;

    /**
     * <p>
     * The group at level four of the agent hierarchy.
     * </p>
     */
    private AgentHierarchyGroup level4;

    /**
     * <p>
     * The group at level five of the agent hierarchy.
     * </p>
     */
    private AgentHierarchyGroup level5;

    /**
     * <p>
     * The group at level one of the agent hierarchy.
     * </p>
     *
     * @return <p>
     *         The group at level one of the agent hierarchy.
     *         </p>
     */
    public AgentHierarchyGroup getLevel1() {
        return level1;
    }

    /**
     * <p>
     * The group at level one of the agent hierarchy.
     * </p>
     *
     * @param level1 <p>
     *            The group at level one of the agent hierarchy.
     *            </p>
     */
    public void setLevel1(AgentHierarchyGroup level1) {
        this.level1 = level1;
    }

    /**
     * <p>
     * The group at level one of the agent hierarchy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param level1 <p>
     *            The group at level one of the agent hierarchy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HierarchyGroups withLevel1(AgentHierarchyGroup level1) {
        this.level1 = level1;
        return this;
    }

    /**
     * <p>
     * The group at level two of the agent hierarchy.
     * </p>
     *
     * @return <p>
     *         The group at level two of the agent hierarchy.
     *         </p>
     */
    public AgentHierarchyGroup getLevel2() {
        return level2;
    }

    /**
     * <p>
     * The group at level two of the agent hierarchy.
     * </p>
     *
     * @param level2 <p>
     *            The group at level two of the agent hierarchy.
     *            </p>
     */
    public void setLevel2(AgentHierarchyGroup level2) {
        this.level2 = level2;
    }

    /**
     * <p>
     * The group at level two of the agent hierarchy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param level2 <p>
     *            The group at level two of the agent hierarchy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HierarchyGroups withLevel2(AgentHierarchyGroup level2) {
        this.level2 = level2;
        return this;
    }

    /**
     * <p>
     * The group at level three of the agent hierarchy.
     * </p>
     *
     * @return <p>
     *         The group at level three of the agent hierarchy.
     *         </p>
     */
    public AgentHierarchyGroup getLevel3() {
        return level3;
    }

    /**
     * <p>
     * The group at level three of the agent hierarchy.
     * </p>
     *
     * @param level3 <p>
     *            The group at level three of the agent hierarchy.
     *            </p>
     */
    public void setLevel3(AgentHierarchyGroup level3) {
        this.level3 = level3;
    }

    /**
     * <p>
     * The group at level three of the agent hierarchy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param level3 <p>
     *            The group at level three of the agent hierarchy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HierarchyGroups withLevel3(AgentHierarchyGroup level3) {
        this.level3 = level3;
        return this;
    }

    /**
     * <p>
     * The group at level four of the agent hierarchy.
     * </p>
     *
     * @return <p>
     *         The group at level four of the agent hierarchy.
     *         </p>
     */
    public AgentHierarchyGroup getLevel4() {
        return level4;
    }

    /**
     * <p>
     * The group at level four of the agent hierarchy.
     * </p>
     *
     * @param level4 <p>
     *            The group at level four of the agent hierarchy.
     *            </p>
     */
    public void setLevel4(AgentHierarchyGroup level4) {
        this.level4 = level4;
    }

    /**
     * <p>
     * The group at level four of the agent hierarchy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param level4 <p>
     *            The group at level four of the agent hierarchy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HierarchyGroups withLevel4(AgentHierarchyGroup level4) {
        this.level4 = level4;
        return this;
    }

    /**
     * <p>
     * The group at level five of the agent hierarchy.
     * </p>
     *
     * @return <p>
     *         The group at level five of the agent hierarchy.
     *         </p>
     */
    public AgentHierarchyGroup getLevel5() {
        return level5;
    }

    /**
     * <p>
     * The group at level five of the agent hierarchy.
     * </p>
     *
     * @param level5 <p>
     *            The group at level five of the agent hierarchy.
     *            </p>
     */
    public void setLevel5(AgentHierarchyGroup level5) {
        this.level5 = level5;
    }

    /**
     * <p>
     * The group at level five of the agent hierarchy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param level5 <p>
     *            The group at level five of the agent hierarchy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HierarchyGroups withLevel5(AgentHierarchyGroup level5) {
        this.level5 = level5;
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
        if (getLevel1() != null)
            sb.append("Level1: " + getLevel1() + ",");
        if (getLevel2() != null)
            sb.append("Level2: " + getLevel2() + ",");
        if (getLevel3() != null)
            sb.append("Level3: " + getLevel3() + ",");
        if (getLevel4() != null)
            sb.append("Level4: " + getLevel4() + ",");
        if (getLevel5() != null)
            sb.append("Level5: " + getLevel5());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLevel1() == null) ? 0 : getLevel1().hashCode());
        hashCode = prime * hashCode + ((getLevel2() == null) ? 0 : getLevel2().hashCode());
        hashCode = prime * hashCode + ((getLevel3() == null) ? 0 : getLevel3().hashCode());
        hashCode = prime * hashCode + ((getLevel4() == null) ? 0 : getLevel4().hashCode());
        hashCode = prime * hashCode + ((getLevel5() == null) ? 0 : getLevel5().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HierarchyGroups == false)
            return false;
        HierarchyGroups other = (HierarchyGroups) obj;

        if (other.getLevel1() == null ^ this.getLevel1() == null)
            return false;
        if (other.getLevel1() != null && other.getLevel1().equals(this.getLevel1()) == false)
            return false;
        if (other.getLevel2() == null ^ this.getLevel2() == null)
            return false;
        if (other.getLevel2() != null && other.getLevel2().equals(this.getLevel2()) == false)
            return false;
        if (other.getLevel3() == null ^ this.getLevel3() == null)
            return false;
        if (other.getLevel3() != null && other.getLevel3().equals(this.getLevel3()) == false)
            return false;
        if (other.getLevel4() == null ^ this.getLevel4() == null)
            return false;
        if (other.getLevel4() != null && other.getLevel4().equals(this.getLevel4()) == false)
            return false;
        if (other.getLevel5() == null ^ this.getLevel5() == null)
            return false;
        if (other.getLevel5() != null && other.getLevel5().equals(this.getLevel5()) == false)
            return false;
        return true;
    }
}
