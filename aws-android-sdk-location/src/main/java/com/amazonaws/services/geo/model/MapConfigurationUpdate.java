/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the political view for the style.
 * </p>
 */
public class MapConfigurationUpdate implements Serializable {
    /**
     * <p>
     * Specifies the political view for the style. Set to an empty string to not
     * use a political view, or, for styles that support specific political
     * views, you can choose a view, such as <code>IND</code> for the Indian
     * view.
     * </p>
     * <note>
     * <p>
     * Not all map resources or styles support political view styles. See <a
     * href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#political-views"
     * >Political views</a> for more information.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     * <b>Pattern: </b>^[A-Z]{3}$|^$<br/>
     */
    private String politicalView;

    /**
     * <p>
     * Specifies the political view for the style. Set to an empty string to not
     * use a political view, or, for styles that support specific political
     * views, you can choose a view, such as <code>IND</code> for the Indian
     * view.
     * </p>
     * <note>
     * <p>
     * Not all map resources or styles support political view styles. See <a
     * href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#political-views"
     * >Political views</a> for more information.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     * <b>Pattern: </b>^[A-Z]{3}$|^$<br/>
     *
     * @return <p>
     *         Specifies the political view for the style. Set to an empty
     *         string to not use a political view, or, for styles that support
     *         specific political views, you can choose a view, such as
     *         <code>IND</code> for the Indian view.
     *         </p>
     *         <note>
     *         <p>
     *         Not all map resources or styles support political view styles.
     *         See <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#political-views"
     *         >Political views</a> for more information.
     *         </p>
     *         </note>
     */
    public String getPoliticalView() {
        return politicalView;
    }

    /**
     * <p>
     * Specifies the political view for the style. Set to an empty string to not
     * use a political view, or, for styles that support specific political
     * views, you can choose a view, such as <code>IND</code> for the Indian
     * view.
     * </p>
     * <note>
     * <p>
     * Not all map resources or styles support political view styles. See <a
     * href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#political-views"
     * >Political views</a> for more information.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     * <b>Pattern: </b>^[A-Z]{3}$|^$<br/>
     *
     * @param politicalView <p>
     *            Specifies the political view for the style. Set to an empty
     *            string to not use a political view, or, for styles that
     *            support specific political views, you can choose a view, such
     *            as <code>IND</code> for the Indian view.
     *            </p>
     *            <note>
     *            <p>
     *            Not all map resources or styles support political view styles.
     *            See <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#political-views"
     *            >Political views</a> for more information.
     *            </p>
     *            </note>
     */
    public void setPoliticalView(String politicalView) {
        this.politicalView = politicalView;
    }

    /**
     * <p>
     * Specifies the political view for the style. Set to an empty string to not
     * use a political view, or, for styles that support specific political
     * views, you can choose a view, such as <code>IND</code> for the Indian
     * view.
     * </p>
     * <note>
     * <p>
     * Not all map resources or styles support political view styles. See <a
     * href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#political-views"
     * >Political views</a> for more information.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     * <b>Pattern: </b>^[A-Z]{3}$|^$<br/>
     *
     * @param politicalView <p>
     *            Specifies the political view for the style. Set to an empty
     *            string to not use a political view, or, for styles that
     *            support specific political views, you can choose a view, such
     *            as <code>IND</code> for the Indian view.
     *            </p>
     *            <note>
     *            <p>
     *            Not all map resources or styles support political view styles.
     *            See <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#political-views"
     *            >Political views</a> for more information.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MapConfigurationUpdate withPoliticalView(String politicalView) {
        this.politicalView = politicalView;
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
        if (getPoliticalView() != null)
            sb.append("PoliticalView: " + getPoliticalView());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPoliticalView() == null) ? 0 : getPoliticalView().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MapConfigurationUpdate == false)
            return false;
        MapConfigurationUpdate other = (MapConfigurationUpdate) obj;

        if (other.getPoliticalView() == null ^ this.getPoliticalView() == null)
            return false;
        if (other.getPoliticalView() != null
                && other.getPoliticalView().equals(this.getPoliticalView()) == false)
            return false;
        return true;
    }
}
