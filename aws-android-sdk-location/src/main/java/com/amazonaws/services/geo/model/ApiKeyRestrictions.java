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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

/**
 * <p>
 * API Restrictions on the allowed actions, resources, and referers for an API
 * key resource.
 * </p>
 */
public class ApiKeyRestrictions implements Serializable {
    /**
     * <p>
     * A list of allowed actions that an API key resource grants permissions to
     * perform. You must have at least one action for each type of resource. For
     * example, if you have a place resource, you must include at least one
     * place action.
     * </p>
     * <p>
     * The following are valid values for the actions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Map actions</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>geo:GetMap*</code> - Allows all actions needed for map rendering.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Place actions</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>geo:SearchPlaceIndexForText</code> - Allows geocoding.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>geo:SearchPlaceIndexForPosition</code> - Allows reverse geocoding.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>geo:SearchPlaceIndexForSuggestions</code> - Allows generating
     * suggestions from text.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetPlace</code> - Allows finding a place by place ID.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Route actions</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>geo:CalculateRoute</code> - Allows point to point routing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>geo:CalculateRouteMatrix</code> - Allows calculating a matrix of
     * routes.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You must use these strings exactly. For example, to provide access to map
     * rendering, the only valid action is <code>geo:GetMap*</code> as an input
     * to the list. <code>["geo:GetMap*"]</code> is valid but
     * <code>["geo:GetMapTile"]</code> is not. Similarly, you cannot use
     * <code>["geo:SearchPlaceIndexFor*"]</code> - you must list each of the
     * Place actions separately.
     * </p>
     * </note>
     */
    private java.util.List<String> allowActions;

    /**
     * <p>
     * A list of allowed resource ARNs that a API key bearer can perform actions
     * on.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The ARN must be the correct ARN for a map, place, or route ARN. You may
     * include wildcards in the resource-id to match multiple resources of the
     * same type.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resources must be in the same <code>partition</code>,
     * <code>region</code>, and <code>account-id</code> as the key that is being
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * Other than wildcards, you must include the full ARN, including the
     * <code>arn</code>, <code>partition</code>, <code>service</code>,
     * <code>region</code>, <code>account-id</code> and <code>resource-id</code>
     * delimited by colons (:).
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed, even with wildcards. For example,
     * <code>arn:aws:geo:region:<i>account-id</i>:map/ExampleMap*</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about ARN format, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs)</a>.
     * </p>
     */
    private java.util.List<String> allowResources;

    /**
     * <p>
     * An optional list of allowed HTTP referers for which requests must
     * originate from. Requests using this API key from other domains will not
     * be allowed.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0–9) or any symbols in
     * this list <code>$\-._+!*`(),;/?:@=&amp;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * May contain a percent (%) if followed by 2 hexadecimal digits (A-F, a-f,
     * 0-9); this is used for URL encoding purposes.
     * </p>
     * </li>
     * <li>
     * <p>
     * May contain wildcard characters question mark (?) and asterisk (*).
     * </p>
     * <p>
     * Question mark (?) will replace any single character (including
     * hexadecimal digits).
     * </p>
     * <p>
     * Asterisk (*) will replace any multiple characters (including multiple
     * hexadecimal digits).
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>https://example.com</code>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> allowReferers;

    /**
     * <p>
     * A list of allowed actions that an API key resource grants permissions to
     * perform. You must have at least one action for each type of resource. For
     * example, if you have a place resource, you must include at least one
     * place action.
     * </p>
     * <p>
     * The following are valid values for the actions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Map actions</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>geo:GetMap*</code> - Allows all actions needed for map rendering.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Place actions</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>geo:SearchPlaceIndexForText</code> - Allows geocoding.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>geo:SearchPlaceIndexForPosition</code> - Allows reverse geocoding.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>geo:SearchPlaceIndexForSuggestions</code> - Allows generating
     * suggestions from text.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetPlace</code> - Allows finding a place by place ID.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Route actions</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>geo:CalculateRoute</code> - Allows point to point routing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>geo:CalculateRouteMatrix</code> - Allows calculating a matrix of
     * routes.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You must use these strings exactly. For example, to provide access to map
     * rendering, the only valid action is <code>geo:GetMap*</code> as an input
     * to the list. <code>["geo:GetMap*"]</code> is valid but
     * <code>["geo:GetMapTile"]</code> is not. Similarly, you cannot use
     * <code>["geo:SearchPlaceIndexFor*"]</code> - you must list each of the
     * Place actions separately.
     * </p>
     * </note>
     *
     * @return <p>
     *         A list of allowed actions that an API key resource grants
     *         permissions to perform. You must have at least one action for
     *         each type of resource. For example, if you have a place resource,
     *         you must include at least one place action.
     *         </p>
     *         <p>
     *         The following are valid values for the actions.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Map actions</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>geo:GetMap*</code> - Allows all actions needed for map
     *         rendering.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Place actions</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>geo:SearchPlaceIndexForText</code> - Allows geocoding.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>geo:SearchPlaceIndexForPosition</code> - Allows reverse
     *         geocoding.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>geo:SearchPlaceIndexForSuggestions</code> - Allows
     *         generating suggestions from text.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GetPlace</code> - Allows finding a place by place ID.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Route actions</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>geo:CalculateRoute</code> - Allows point to point routing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>geo:CalculateRouteMatrix</code> - Allows calculating a
     *         matrix of routes.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         You must use these strings exactly. For example, to provide
     *         access to map rendering, the only valid action is
     *         <code>geo:GetMap*</code> as an input to the list.
     *         <code>["geo:GetMap*"]</code> is valid but
     *         <code>["geo:GetMapTile"]</code> is not. Similarly, you cannot use
     *         <code>["geo:SearchPlaceIndexFor*"]</code> - you must list each of
     *         the Place actions separately.
     *         </p>
     *         </note>
     */
    public java.util.List<String> getAllowActions() {
        return allowActions;
    }

    /**
     * <p>
     * A list of allowed actions that an API key resource grants permissions to
     * perform. You must have at least one action for each type of resource. For
     * example, if you have a place resource, you must include at least one
     * place action.
     * </p>
     * <p>
     * The following are valid values for the actions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Map actions</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>geo:GetMap*</code> - Allows all actions needed for map rendering.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Place actions</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>geo:SearchPlaceIndexForText</code> - Allows geocoding.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>geo:SearchPlaceIndexForPosition</code> - Allows reverse geocoding.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>geo:SearchPlaceIndexForSuggestions</code> - Allows generating
     * suggestions from text.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetPlace</code> - Allows finding a place by place ID.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Route actions</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>geo:CalculateRoute</code> - Allows point to point routing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>geo:CalculateRouteMatrix</code> - Allows calculating a matrix of
     * routes.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You must use these strings exactly. For example, to provide access to map
     * rendering, the only valid action is <code>geo:GetMap*</code> as an input
     * to the list. <code>["geo:GetMap*"]</code> is valid but
     * <code>["geo:GetMapTile"]</code> is not. Similarly, you cannot use
     * <code>["geo:SearchPlaceIndexFor*"]</code> - you must list each of the
     * Place actions separately.
     * </p>
     * </note>
     *
     * @param allowActions <p>
     *            A list of allowed actions that an API key resource grants
     *            permissions to perform. You must have at least one action for
     *            each type of resource. For example, if you have a place
     *            resource, you must include at least one place action.
     *            </p>
     *            <p>
     *            The following are valid values for the actions.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Map actions</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>geo:GetMap*</code> - Allows all actions needed for map
     *            rendering.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Place actions</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>geo:SearchPlaceIndexForText</code> - Allows geocoding.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>geo:SearchPlaceIndexForPosition</code> - Allows reverse
     *            geocoding.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>geo:SearchPlaceIndexForSuggestions</code> - Allows
     *            generating suggestions from text.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GetPlace</code> - Allows finding a place by place ID.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Route actions</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>geo:CalculateRoute</code> - Allows point to point
     *            routing.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>geo:CalculateRouteMatrix</code> - Allows calculating a
     *            matrix of routes.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            You must use these strings exactly. For example, to provide
     *            access to map rendering, the only valid action is
     *            <code>geo:GetMap*</code> as an input to the list.
     *            <code>["geo:GetMap*"]</code> is valid but
     *            <code>["geo:GetMapTile"]</code> is not. Similarly, you cannot
     *            use <code>["geo:SearchPlaceIndexFor*"]</code> - you must list
     *            each of the Place actions separately.
     *            </p>
     *            </note>
     */
    public void setAllowActions(java.util.Collection<String> allowActions) {
        if (allowActions == null) {
            this.allowActions = null;
            return;
        }

        this.allowActions = new java.util.ArrayList<String>(allowActions);
    }

    /**
     * <p>
     * A list of allowed actions that an API key resource grants permissions to
     * perform. You must have at least one action for each type of resource. For
     * example, if you have a place resource, you must include at least one
     * place action.
     * </p>
     * <p>
     * The following are valid values for the actions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Map actions</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>geo:GetMap*</code> - Allows all actions needed for map rendering.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Place actions</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>geo:SearchPlaceIndexForText</code> - Allows geocoding.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>geo:SearchPlaceIndexForPosition</code> - Allows reverse geocoding.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>geo:SearchPlaceIndexForSuggestions</code> - Allows generating
     * suggestions from text.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetPlace</code> - Allows finding a place by place ID.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Route actions</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>geo:CalculateRoute</code> - Allows point to point routing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>geo:CalculateRouteMatrix</code> - Allows calculating a matrix of
     * routes.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You must use these strings exactly. For example, to provide access to map
     * rendering, the only valid action is <code>geo:GetMap*</code> as an input
     * to the list. <code>["geo:GetMap*"]</code> is valid but
     * <code>["geo:GetMapTile"]</code> is not. Similarly, you cannot use
     * <code>["geo:SearchPlaceIndexFor*"]</code> - you must list each of the
     * Place actions separately.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowActions <p>
     *            A list of allowed actions that an API key resource grants
     *            permissions to perform. You must have at least one action for
     *            each type of resource. For example, if you have a place
     *            resource, you must include at least one place action.
     *            </p>
     *            <p>
     *            The following are valid values for the actions.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Map actions</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>geo:GetMap*</code> - Allows all actions needed for map
     *            rendering.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Place actions</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>geo:SearchPlaceIndexForText</code> - Allows geocoding.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>geo:SearchPlaceIndexForPosition</code> - Allows reverse
     *            geocoding.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>geo:SearchPlaceIndexForSuggestions</code> - Allows
     *            generating suggestions from text.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GetPlace</code> - Allows finding a place by place ID.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Route actions</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>geo:CalculateRoute</code> - Allows point to point
     *            routing.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>geo:CalculateRouteMatrix</code> - Allows calculating a
     *            matrix of routes.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            You must use these strings exactly. For example, to provide
     *            access to map rendering, the only valid action is
     *            <code>geo:GetMap*</code> as an input to the list.
     *            <code>["geo:GetMap*"]</code> is valid but
     *            <code>["geo:GetMapTile"]</code> is not. Similarly, you cannot
     *            use <code>["geo:SearchPlaceIndexFor*"]</code> - you must list
     *            each of the Place actions separately.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApiKeyRestrictions withAllowActions(String... allowActions) {
        if (getAllowActions() == null) {
            this.allowActions = new java.util.ArrayList<String>(allowActions.length);
        }
        for (String value : allowActions) {
            this.allowActions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of allowed actions that an API key resource grants permissions to
     * perform. You must have at least one action for each type of resource. For
     * example, if you have a place resource, you must include at least one
     * place action.
     * </p>
     * <p>
     * The following are valid values for the actions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Map actions</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>geo:GetMap*</code> - Allows all actions needed for map rendering.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Place actions</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>geo:SearchPlaceIndexForText</code> - Allows geocoding.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>geo:SearchPlaceIndexForPosition</code> - Allows reverse geocoding.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>geo:SearchPlaceIndexForSuggestions</code> - Allows generating
     * suggestions from text.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetPlace</code> - Allows finding a place by place ID.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>Route actions</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>geo:CalculateRoute</code> - Allows point to point routing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>geo:CalculateRouteMatrix</code> - Allows calculating a matrix of
     * routes.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You must use these strings exactly. For example, to provide access to map
     * rendering, the only valid action is <code>geo:GetMap*</code> as an input
     * to the list. <code>["geo:GetMap*"]</code> is valid but
     * <code>["geo:GetMapTile"]</code> is not. Similarly, you cannot use
     * <code>["geo:SearchPlaceIndexFor*"]</code> - you must list each of the
     * Place actions separately.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowActions <p>
     *            A list of allowed actions that an API key resource grants
     *            permissions to perform. You must have at least one action for
     *            each type of resource. For example, if you have a place
     *            resource, you must include at least one place action.
     *            </p>
     *            <p>
     *            The following are valid values for the actions.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Map actions</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>geo:GetMap*</code> - Allows all actions needed for map
     *            rendering.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Place actions</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>geo:SearchPlaceIndexForText</code> - Allows geocoding.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>geo:SearchPlaceIndexForPosition</code> - Allows reverse
     *            geocoding.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>geo:SearchPlaceIndexForSuggestions</code> - Allows
     *            generating suggestions from text.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>GetPlace</code> - Allows finding a place by place ID.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Route actions</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>geo:CalculateRoute</code> - Allows point to point
     *            routing.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>geo:CalculateRouteMatrix</code> - Allows calculating a
     *            matrix of routes.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            You must use these strings exactly. For example, to provide
     *            access to map rendering, the only valid action is
     *            <code>geo:GetMap*</code> as an input to the list.
     *            <code>["geo:GetMap*"]</code> is valid but
     *            <code>["geo:GetMapTile"]</code> is not. Similarly, you cannot
     *            use <code>["geo:SearchPlaceIndexFor*"]</code> - you must list
     *            each of the Place actions separately.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApiKeyRestrictions withAllowActions(java.util.Collection<String> allowActions) {
        setAllowActions(allowActions);
        return this;
    }

    /**
     * <p>
     * A list of allowed resource ARNs that a API key bearer can perform actions
     * on.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The ARN must be the correct ARN for a map, place, or route ARN. You may
     * include wildcards in the resource-id to match multiple resources of the
     * same type.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resources must be in the same <code>partition</code>,
     * <code>region</code>, and <code>account-id</code> as the key that is being
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * Other than wildcards, you must include the full ARN, including the
     * <code>arn</code>, <code>partition</code>, <code>service</code>,
     * <code>region</code>, <code>account-id</code> and <code>resource-id</code>
     * delimited by colons (:).
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed, even with wildcards. For example,
     * <code>arn:aws:geo:region:<i>account-id</i>:map/ExampleMap*</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about ARN format, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs)</a>.
     * </p>
     *
     * @return <p>
     *         A list of allowed resource ARNs that a API key bearer can perform
     *         actions on.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The ARN must be the correct ARN for a map, place, or route ARN.
     *         You may include wildcards in the resource-id to match multiple
     *         resources of the same type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The resources must be in the same <code>partition</code>,
     *         <code>region</code>, and <code>account-id</code> as the key that
     *         is being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Other than wildcards, you must include the full ARN, including
     *         the <code>arn</code>, <code>partition</code>,
     *         <code>service</code>, <code>region</code>,
     *         <code>account-id</code> and <code>resource-id</code> delimited by
     *         colons (:).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         No spaces allowed, even with wildcards. For example,
     *         <code>arn:aws:geo:region:<i>account-id</i>:map/ExampleMap*</code>
     *         .
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about ARN format, see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Names (ARNs)</a>.
     *         </p>
     */
    public java.util.List<String> getAllowResources() {
        return allowResources;
    }

    /**
     * <p>
     * A list of allowed resource ARNs that a API key bearer can perform actions
     * on.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The ARN must be the correct ARN for a map, place, or route ARN. You may
     * include wildcards in the resource-id to match multiple resources of the
     * same type.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resources must be in the same <code>partition</code>,
     * <code>region</code>, and <code>account-id</code> as the key that is being
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * Other than wildcards, you must include the full ARN, including the
     * <code>arn</code>, <code>partition</code>, <code>service</code>,
     * <code>region</code>, <code>account-id</code> and <code>resource-id</code>
     * delimited by colons (:).
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed, even with wildcards. For example,
     * <code>arn:aws:geo:region:<i>account-id</i>:map/ExampleMap*</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about ARN format, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs)</a>.
     * </p>
     *
     * @param allowResources <p>
     *            A list of allowed resource ARNs that a API key bearer can
     *            perform actions on.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The ARN must be the correct ARN for a map, place, or route
     *            ARN. You may include wildcards in the resource-id to match
     *            multiple resources of the same type.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The resources must be in the same <code>partition</code>,
     *            <code>region</code>, and <code>account-id</code> as the key
     *            that is being created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Other than wildcards, you must include the full ARN, including
     *            the <code>arn</code>, <code>partition</code>,
     *            <code>service</code>, <code>region</code>,
     *            <code>account-id</code> and <code>resource-id</code> delimited
     *            by colons (:).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            No spaces allowed, even with wildcards. For example,
     *            <code>arn:aws:geo:region:<i>account-id</i>:map/ExampleMap*</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about ARN format, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs)</a>.
     *            </p>
     */
    public void setAllowResources(java.util.Collection<String> allowResources) {
        if (allowResources == null) {
            this.allowResources = null;
            return;
        }

        this.allowResources = new java.util.ArrayList<String>(allowResources);
    }

    /**
     * <p>
     * A list of allowed resource ARNs that a API key bearer can perform actions
     * on.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The ARN must be the correct ARN for a map, place, or route ARN. You may
     * include wildcards in the resource-id to match multiple resources of the
     * same type.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resources must be in the same <code>partition</code>,
     * <code>region</code>, and <code>account-id</code> as the key that is being
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * Other than wildcards, you must include the full ARN, including the
     * <code>arn</code>, <code>partition</code>, <code>service</code>,
     * <code>region</code>, <code>account-id</code> and <code>resource-id</code>
     * delimited by colons (:).
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed, even with wildcards. For example,
     * <code>arn:aws:geo:region:<i>account-id</i>:map/ExampleMap*</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about ARN format, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs)</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowResources <p>
     *            A list of allowed resource ARNs that a API key bearer can
     *            perform actions on.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The ARN must be the correct ARN for a map, place, or route
     *            ARN. You may include wildcards in the resource-id to match
     *            multiple resources of the same type.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The resources must be in the same <code>partition</code>,
     *            <code>region</code>, and <code>account-id</code> as the key
     *            that is being created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Other than wildcards, you must include the full ARN, including
     *            the <code>arn</code>, <code>partition</code>,
     *            <code>service</code>, <code>region</code>,
     *            <code>account-id</code> and <code>resource-id</code> delimited
     *            by colons (:).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            No spaces allowed, even with wildcards. For example,
     *            <code>arn:aws:geo:region:<i>account-id</i>:map/ExampleMap*</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about ARN format, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs)</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApiKeyRestrictions withAllowResources(String... allowResources) {
        if (getAllowResources() == null) {
            this.allowResources = new java.util.ArrayList<String>(allowResources.length);
        }
        for (String value : allowResources) {
            this.allowResources.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of allowed resource ARNs that a API key bearer can perform actions
     * on.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The ARN must be the correct ARN for a map, place, or route ARN. You may
     * include wildcards in the resource-id to match multiple resources of the
     * same type.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resources must be in the same <code>partition</code>,
     * <code>region</code>, and <code>account-id</code> as the key that is being
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * Other than wildcards, you must include the full ARN, including the
     * <code>arn</code>, <code>partition</code>, <code>service</code>,
     * <code>region</code>, <code>account-id</code> and <code>resource-id</code>
     * delimited by colons (:).
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed, even with wildcards. For example,
     * <code>arn:aws:geo:region:<i>account-id</i>:map/ExampleMap*</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about ARN format, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs)</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowResources <p>
     *            A list of allowed resource ARNs that a API key bearer can
     *            perform actions on.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The ARN must be the correct ARN for a map, place, or route
     *            ARN. You may include wildcards in the resource-id to match
     *            multiple resources of the same type.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The resources must be in the same <code>partition</code>,
     *            <code>region</code>, and <code>account-id</code> as the key
     *            that is being created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Other than wildcards, you must include the full ARN, including
     *            the <code>arn</code>, <code>partition</code>,
     *            <code>service</code>, <code>region</code>,
     *            <code>account-id</code> and <code>resource-id</code> delimited
     *            by colons (:).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            No spaces allowed, even with wildcards. For example,
     *            <code>arn:aws:geo:region:<i>account-id</i>:map/ExampleMap*</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about ARN format, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs)</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApiKeyRestrictions withAllowResources(java.util.Collection<String> allowResources) {
        setAllowResources(allowResources);
        return this;
    }

    /**
     * <p>
     * An optional list of allowed HTTP referers for which requests must
     * originate from. Requests using this API key from other domains will not
     * be allowed.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0–9) or any symbols in
     * this list <code>$\-._+!*`(),;/?:@=&amp;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * May contain a percent (%) if followed by 2 hexadecimal digits (A-F, a-f,
     * 0-9); this is used for URL encoding purposes.
     * </p>
     * </li>
     * <li>
     * <p>
     * May contain wildcard characters question mark (?) and asterisk (*).
     * </p>
     * <p>
     * Question mark (?) will replace any single character (including
     * hexadecimal digits).
     * </p>
     * <p>
     * Asterisk (*) will replace any multiple characters (including multiple
     * hexadecimal digits).
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>https://example.com</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         An optional list of allowed HTTP referers for which requests must
     *         originate from. Requests using this API key from other domains
     *         will not be allowed.
     *         </p>
     *         <p>
     *         Requirements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Contain only alphanumeric characters (A–Z, a–z, 0–9) or any
     *         symbols in this list <code>$\-._+!*`(),;/?:@=&amp;</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         May contain a percent (%) if followed by 2 hexadecimal digits
     *         (A-F, a-f, 0-9); this is used for URL encoding purposes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         May contain wildcard characters question mark (?) and asterisk
     *         (*).
     *         </p>
     *         <p>
     *         Question mark (?) will replace any single character (including
     *         hexadecimal digits).
     *         </p>
     *         <p>
     *         Asterisk (*) will replace any multiple characters (including
     *         multiple hexadecimal digits).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         No spaces allowed. For example, <code>https://example.com</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getAllowReferers() {
        return allowReferers;
    }

    /**
     * <p>
     * An optional list of allowed HTTP referers for which requests must
     * originate from. Requests using this API key from other domains will not
     * be allowed.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0–9) or any symbols in
     * this list <code>$\-._+!*`(),;/?:@=&amp;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * May contain a percent (%) if followed by 2 hexadecimal digits (A-F, a-f,
     * 0-9); this is used for URL encoding purposes.
     * </p>
     * </li>
     * <li>
     * <p>
     * May contain wildcard characters question mark (?) and asterisk (*).
     * </p>
     * <p>
     * Question mark (?) will replace any single character (including
     * hexadecimal digits).
     * </p>
     * <p>
     * Asterisk (*) will replace any multiple characters (including multiple
     * hexadecimal digits).
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>https://example.com</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @param allowReferers <p>
     *            An optional list of allowed HTTP referers for which requests
     *            must originate from. Requests using this API key from other
     *            domains will not be allowed.
     *            </p>
     *            <p>
     *            Requirements:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Contain only alphanumeric characters (A–Z, a–z, 0–9) or any
     *            symbols in this list <code>$\-._+!*`(),;/?:@=&amp;</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            May contain a percent (%) if followed by 2 hexadecimal digits
     *            (A-F, a-f, 0-9); this is used for URL encoding purposes.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            May contain wildcard characters question mark (?) and asterisk
     *            (*).
     *            </p>
     *            <p>
     *            Question mark (?) will replace any single character (including
     *            hexadecimal digits).
     *            </p>
     *            <p>
     *            Asterisk (*) will replace any multiple characters (including
     *            multiple hexadecimal digits).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            No spaces allowed. For example,
     *            <code>https://example.com</code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setAllowReferers(java.util.Collection<String> allowReferers) {
        if (allowReferers == null) {
            this.allowReferers = null;
            return;
        }

        this.allowReferers = new java.util.ArrayList<String>(allowReferers);
    }

    /**
     * <p>
     * An optional list of allowed HTTP referers for which requests must
     * originate from. Requests using this API key from other domains will not
     * be allowed.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0–9) or any symbols in
     * this list <code>$\-._+!*`(),;/?:@=&amp;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * May contain a percent (%) if followed by 2 hexadecimal digits (A-F, a-f,
     * 0-9); this is used for URL encoding purposes.
     * </p>
     * </li>
     * <li>
     * <p>
     * May contain wildcard characters question mark (?) and asterisk (*).
     * </p>
     * <p>
     * Question mark (?) will replace any single character (including
     * hexadecimal digits).
     * </p>
     * <p>
     * Asterisk (*) will replace any multiple characters (including multiple
     * hexadecimal digits).
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>https://example.com</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowReferers <p>
     *            An optional list of allowed HTTP referers for which requests
     *            must originate from. Requests using this API key from other
     *            domains will not be allowed.
     *            </p>
     *            <p>
     *            Requirements:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Contain only alphanumeric characters (A–Z, a–z, 0–9) or any
     *            symbols in this list <code>$\-._+!*`(),;/?:@=&amp;</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            May contain a percent (%) if followed by 2 hexadecimal digits
     *            (A-F, a-f, 0-9); this is used for URL encoding purposes.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            May contain wildcard characters question mark (?) and asterisk
     *            (*).
     *            </p>
     *            <p>
     *            Question mark (?) will replace any single character (including
     *            hexadecimal digits).
     *            </p>
     *            <p>
     *            Asterisk (*) will replace any multiple characters (including
     *            multiple hexadecimal digits).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            No spaces allowed. For example,
     *            <code>https://example.com</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApiKeyRestrictions withAllowReferers(String... allowReferers) {
        if (getAllowReferers() == null) {
            this.allowReferers = new java.util.ArrayList<String>(allowReferers.length);
        }
        for (String value : allowReferers) {
            this.allowReferers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An optional list of allowed HTTP referers for which requests must
     * originate from. Requests using this API key from other domains will not
     * be allowed.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0–9) or any symbols in
     * this list <code>$\-._+!*`(),;/?:@=&amp;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * May contain a percent (%) if followed by 2 hexadecimal digits (A-F, a-f,
     * 0-9); this is used for URL encoding purposes.
     * </p>
     * </li>
     * <li>
     * <p>
     * May contain wildcard characters question mark (?) and asterisk (*).
     * </p>
     * <p>
     * Question mark (?) will replace any single character (including
     * hexadecimal digits).
     * </p>
     * <p>
     * Asterisk (*) will replace any multiple characters (including multiple
     * hexadecimal digits).
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>https://example.com</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowReferers <p>
     *            An optional list of allowed HTTP referers for which requests
     *            must originate from. Requests using this API key from other
     *            domains will not be allowed.
     *            </p>
     *            <p>
     *            Requirements:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Contain only alphanumeric characters (A–Z, a–z, 0–9) or any
     *            symbols in this list <code>$\-._+!*`(),;/?:@=&amp;</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            May contain a percent (%) if followed by 2 hexadecimal digits
     *            (A-F, a-f, 0-9); this is used for URL encoding purposes.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            May contain wildcard characters question mark (?) and asterisk
     *            (*).
     *            </p>
     *            <p>
     *            Question mark (?) will replace any single character (including
     *            hexadecimal digits).
     *            </p>
     *            <p>
     *            Asterisk (*) will replace any multiple characters (including
     *            multiple hexadecimal digits).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            No spaces allowed. For example,
     *            <code>https://example.com</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApiKeyRestrictions withAllowReferers(java.util.Collection<String> allowReferers) {
        setAllowReferers(allowReferers);
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
        if (getAllowActions() != null)
            sb.append("AllowActions: " + getAllowActions() + ",");
        if (getAllowResources() != null)
            sb.append("AllowResources: " + getAllowResources() + ",");
        if (getAllowReferers() != null)
            sb.append("AllowReferers: " + getAllowReferers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAllowActions() == null) ? 0 : getAllowActions().hashCode());
        hashCode = prime * hashCode
                + ((getAllowResources() == null) ? 0 : getAllowResources().hashCode());
        hashCode = prime * hashCode
                + ((getAllowReferers() == null) ? 0 : getAllowReferers().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApiKeyRestrictions == false)
            return false;
        ApiKeyRestrictions other = (ApiKeyRestrictions) obj;

        if (other.getAllowActions() == null ^ this.getAllowActions() == null)
            return false;
        if (other.getAllowActions() != null
                && other.getAllowActions().equals(this.getAllowActions()) == false)
            return false;
        if (other.getAllowResources() == null ^ this.getAllowResources() == null)
            return false;
        if (other.getAllowResources() != null
                && other.getAllowResources().equals(this.getAllowResources()) == false)
            return false;
        if (other.getAllowReferers() == null ^ this.getAllowReferers() == null)
            return false;
        if (other.getAllowReferers() != null
                && other.getAllowReferers().equals(this.getAllowReferers()) == false)
            return false;
        return true;
    }
}
