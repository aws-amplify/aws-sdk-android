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
 * Contains information about the level hierarchy to update.
 * </p>
 */
public class HierarchyStructureUpdate implements Serializable {
    /**
     * <p>
     * The update for level one.
     * </p>
     */
    private HierarchyLevelUpdate levelOne;

    /**
     * <p>
     * The update for level two.
     * </p>
     */
    private HierarchyLevelUpdate levelTwo;

    /**
     * <p>
     * The update for level three.
     * </p>
     */
    private HierarchyLevelUpdate levelThree;

    /**
     * <p>
     * The update for level four.
     * </p>
     */
    private HierarchyLevelUpdate levelFour;

    /**
     * <p>
     * The update for level five.
     * </p>
     */
    private HierarchyLevelUpdate levelFive;

    /**
     * <p>
     * The update for level one.
     * </p>
     *
     * @return <p>
     *         The update for level one.
     *         </p>
     */
    public HierarchyLevelUpdate getLevelOne() {
        return levelOne;
    }

    /**
     * <p>
     * The update for level one.
     * </p>
     *
     * @param levelOne <p>
     *            The update for level one.
     *            </p>
     */
    public void setLevelOne(HierarchyLevelUpdate levelOne) {
        this.levelOne = levelOne;
    }

    /**
     * <p>
     * The update for level one.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param levelOne <p>
     *            The update for level one.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HierarchyStructureUpdate withLevelOne(HierarchyLevelUpdate levelOne) {
        this.levelOne = levelOne;
        return this;
    }

    /**
     * <p>
     * The update for level two.
     * </p>
     *
     * @return <p>
     *         The update for level two.
     *         </p>
     */
    public HierarchyLevelUpdate getLevelTwo() {
        return levelTwo;
    }

    /**
     * <p>
     * The update for level two.
     * </p>
     *
     * @param levelTwo <p>
     *            The update for level two.
     *            </p>
     */
    public void setLevelTwo(HierarchyLevelUpdate levelTwo) {
        this.levelTwo = levelTwo;
    }

    /**
     * <p>
     * The update for level two.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param levelTwo <p>
     *            The update for level two.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HierarchyStructureUpdate withLevelTwo(HierarchyLevelUpdate levelTwo) {
        this.levelTwo = levelTwo;
        return this;
    }

    /**
     * <p>
     * The update for level three.
     * </p>
     *
     * @return <p>
     *         The update for level three.
     *         </p>
     */
    public HierarchyLevelUpdate getLevelThree() {
        return levelThree;
    }

    /**
     * <p>
     * The update for level three.
     * </p>
     *
     * @param levelThree <p>
     *            The update for level three.
     *            </p>
     */
    public void setLevelThree(HierarchyLevelUpdate levelThree) {
        this.levelThree = levelThree;
    }

    /**
     * <p>
     * The update for level three.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param levelThree <p>
     *            The update for level three.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HierarchyStructureUpdate withLevelThree(HierarchyLevelUpdate levelThree) {
        this.levelThree = levelThree;
        return this;
    }

    /**
     * <p>
     * The update for level four.
     * </p>
     *
     * @return <p>
     *         The update for level four.
     *         </p>
     */
    public HierarchyLevelUpdate getLevelFour() {
        return levelFour;
    }

    /**
     * <p>
     * The update for level four.
     * </p>
     *
     * @param levelFour <p>
     *            The update for level four.
     *            </p>
     */
    public void setLevelFour(HierarchyLevelUpdate levelFour) {
        this.levelFour = levelFour;
    }

    /**
     * <p>
     * The update for level four.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param levelFour <p>
     *            The update for level four.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HierarchyStructureUpdate withLevelFour(HierarchyLevelUpdate levelFour) {
        this.levelFour = levelFour;
        return this;
    }

    /**
     * <p>
     * The update for level five.
     * </p>
     *
     * @return <p>
     *         The update for level five.
     *         </p>
     */
    public HierarchyLevelUpdate getLevelFive() {
        return levelFive;
    }

    /**
     * <p>
     * The update for level five.
     * </p>
     *
     * @param levelFive <p>
     *            The update for level five.
     *            </p>
     */
    public void setLevelFive(HierarchyLevelUpdate levelFive) {
        this.levelFive = levelFive;
    }

    /**
     * <p>
     * The update for level five.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param levelFive <p>
     *            The update for level five.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HierarchyStructureUpdate withLevelFive(HierarchyLevelUpdate levelFive) {
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

        if (obj instanceof HierarchyStructureUpdate == false)
            return false;
        HierarchyStructureUpdate other = (HierarchyStructureUpdate) obj;

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
