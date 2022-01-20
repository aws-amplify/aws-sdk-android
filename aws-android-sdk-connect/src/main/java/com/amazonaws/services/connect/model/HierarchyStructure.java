/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains information about a hierarchy structure.
 * </p>
 */
public class HierarchyStructure implements Serializable {
    /**
     * <p>
     * Information about level one.
     * </p>
     */
    private HierarchyLevel levelOne;

    /**
     * <p>
     * Information about level two.
     * </p>
     */
    private HierarchyLevel levelTwo;

    /**
     * <p>
     * Information about level three.
     * </p>
     */
    private HierarchyLevel levelThree;

    /**
     * <p>
     * Information about level four.
     * </p>
     */
    private HierarchyLevel levelFour;

    /**
     * <p>
     * Information about level five.
     * </p>
     */
    private HierarchyLevel levelFive;

    /**
     * <p>
     * Information about level one.
     * </p>
     *
     * @return <p>
     *         Information about level one.
     *         </p>
     */
    public HierarchyLevel getLevelOne() {
        return levelOne;
    }

    /**
     * <p>
     * Information about level one.
     * </p>
     *
     * @param levelOne <p>
     *            Information about level one.
     *            </p>
     */
    public void setLevelOne(HierarchyLevel levelOne) {
        this.levelOne = levelOne;
    }

    /**
     * <p>
     * Information about level one.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param levelOne <p>
     *            Information about level one.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HierarchyStructure withLevelOne(HierarchyLevel levelOne) {
        this.levelOne = levelOne;
        return this;
    }

    /**
     * <p>
     * Information about level two.
     * </p>
     *
     * @return <p>
     *         Information about level two.
     *         </p>
     */
    public HierarchyLevel getLevelTwo() {
        return levelTwo;
    }

    /**
     * <p>
     * Information about level two.
     * </p>
     *
     * @param levelTwo <p>
     *            Information about level two.
     *            </p>
     */
    public void setLevelTwo(HierarchyLevel levelTwo) {
        this.levelTwo = levelTwo;
    }

    /**
     * <p>
     * Information about level two.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param levelTwo <p>
     *            Information about level two.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HierarchyStructure withLevelTwo(HierarchyLevel levelTwo) {
        this.levelTwo = levelTwo;
        return this;
    }

    /**
     * <p>
     * Information about level three.
     * </p>
     *
     * @return <p>
     *         Information about level three.
     *         </p>
     */
    public HierarchyLevel getLevelThree() {
        return levelThree;
    }

    /**
     * <p>
     * Information about level three.
     * </p>
     *
     * @param levelThree <p>
     *            Information about level three.
     *            </p>
     */
    public void setLevelThree(HierarchyLevel levelThree) {
        this.levelThree = levelThree;
    }

    /**
     * <p>
     * Information about level three.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param levelThree <p>
     *            Information about level three.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HierarchyStructure withLevelThree(HierarchyLevel levelThree) {
        this.levelThree = levelThree;
        return this;
    }

    /**
     * <p>
     * Information about level four.
     * </p>
     *
     * @return <p>
     *         Information about level four.
     *         </p>
     */
    public HierarchyLevel getLevelFour() {
        return levelFour;
    }

    /**
     * <p>
     * Information about level four.
     * </p>
     *
     * @param levelFour <p>
     *            Information about level four.
     *            </p>
     */
    public void setLevelFour(HierarchyLevel levelFour) {
        this.levelFour = levelFour;
    }

    /**
     * <p>
     * Information about level four.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param levelFour <p>
     *            Information about level four.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HierarchyStructure withLevelFour(HierarchyLevel levelFour) {
        this.levelFour = levelFour;
        return this;
    }

    /**
     * <p>
     * Information about level five.
     * </p>
     *
     * @return <p>
     *         Information about level five.
     *         </p>
     */
    public HierarchyLevel getLevelFive() {
        return levelFive;
    }

    /**
     * <p>
     * Information about level five.
     * </p>
     *
     * @param levelFive <p>
     *            Information about level five.
     *            </p>
     */
    public void setLevelFive(HierarchyLevel levelFive) {
        this.levelFive = levelFive;
    }

    /**
     * <p>
     * Information about level five.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param levelFive <p>
     *            Information about level five.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HierarchyStructure withLevelFive(HierarchyLevel levelFive) {
        this.levelFive = levelFive;
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
        if (getLevelOne() != null)
            sb.append("LevelOne: " + getLevelOne() + ",");
        if (getLevelTwo() != null)
            sb.append("LevelTwo: " + getLevelTwo() + ",");
        if (getLevelThree() != null)
            sb.append("LevelThree: " + getLevelThree() + ",");
        if (getLevelFour() != null)
            sb.append("LevelFour: " + getLevelFour() + ",");
        if (getLevelFive() != null)
            sb.append("LevelFive: " + getLevelFive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLevelOne() == null) ? 0 : getLevelOne().hashCode());
        hashCode = prime * hashCode + ((getLevelTwo() == null) ? 0 : getLevelTwo().hashCode());
        hashCode = prime * hashCode + ((getLevelThree() == null) ? 0 : getLevelThree().hashCode());
        hashCode = prime * hashCode + ((getLevelFour() == null) ? 0 : getLevelFour().hashCode());
        hashCode = prime * hashCode + ((getLevelFive() == null) ? 0 : getLevelFive().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HierarchyStructure == false)
            return false;
        HierarchyStructure other = (HierarchyStructure) obj;

        if (other.getLevelOne() == null ^ this.getLevelOne() == null)
            return false;
        if (other.getLevelOne() != null && other.getLevelOne().equals(this.getLevelOne()) == false)
            return false;
        if (other.getLevelTwo() == null ^ this.getLevelTwo() == null)
            return false;
        if (other.getLevelTwo() != null && other.getLevelTwo().equals(this.getLevelTwo()) == false)
            return false;
        if (other.getLevelThree() == null ^ this.getLevelThree() == null)
            return false;
        if (other.getLevelThree() != null
                && other.getLevelThree().equals(this.getLevelThree()) == false)
            return false;
        if (other.getLevelFour() == null ^ this.getLevelFour() == null)
            return false;
        if (other.getLevelFour() != null
                && other.getLevelFour().equals(this.getLevelFour()) == false)
            return false;
        if (other.getLevelFive() == null ^ this.getLevelFive() == null)
            return false;
        if (other.getLevelFive() != null
                && other.getLevelFive().equals(this.getLevelFive()) == false)
            return false;
        return true;
    }
}
