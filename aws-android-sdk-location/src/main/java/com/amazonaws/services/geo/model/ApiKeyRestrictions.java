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
 * API Restrictions on the allowed actions, resources, and referers for an API
 * key resource.
 * </p>
 */
public class ApiKeyRestrictions implements Serializable {
    /**
     * <p>
     * A list of allowed actions that an API key resource grants permissions to
     * perform
     * </p>
     * <note>
     * <p>
     * Currently, the only valid action is <code>geo:GetMap*</code> as an input
     * to the list. For example, <code>["geo:GetMap*"]</code> is valid but
     * <code>["geo:GetMapTile"]</code> is not.
     * </p>
     * </note>
     */
    private java.util.List<String> allowActions;

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
     * A list of allowed resource ARNs that a API key bearer can perform actions
     * on
     * </p>
     * <p>
     * For more information about ARN format, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs)</a>.
     * </p>
     * <note>
     * <p>
     * In this preview, you can allow only map resources.
     * </p>
     * </note>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be prefixed with <code>arn</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>partition</code> and <code>service</code> must not be empty and
     * should begin with only alphanumeric characters (A–Z, a–z, 0–9) and
     * contain only alphanumeric numbers, hyphens (-) and periods (.).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region</code> and <code>account-id</code> can be empty or should
     * begin with only alphanumeric characters (A–Z, a–z, 0–9) and contain only
     * alphanumeric numbers, hyphens (-) and periods (.).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource-id</code> can begin with any character except for forward
     * slash (/) and contain any characters after, including forward slashes to
     * form a path.
     * </p>
     * <p>
     * <code>resource-id</code> can also include wildcard characters, denoted by
     * an asterisk (*).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn</code>, <code>partition</code>, <code>service</code>,
     * <code>region</code>, <code>account-id</code> and <code>resource-id</code>
     * must be delimited by a colon (:).
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example,
     * <code>arn:aws:geo:region:<i>account-id</i>:map/ExampleMap*</code>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> allowResources;

    /**
     * <p>
     * A list of allowed actions that an API key resource grants permissions to
     * perform
     * </p>
     * <note>
     * <p>
     * Currently, the only valid action is <code>geo:GetMap*</code> as an input
     * to the list. For example, <code>["geo:GetMap*"]</code> is valid but
     * <code>["geo:GetMapTile"]</code> is not.
     * </p>
     * </note>
     *
     * @return <p>
     *         A list of allowed actions that an API key resource grants
     *         permissions to perform
     *         </p>
     *         <note>
     *         <p>
     *         Currently, the only valid action is <code>geo:GetMap*</code> as
     *         an input to the list. For example, <code>["geo:GetMap*"]</code>
     *         is valid but <code>["geo:GetMapTile"]</code> is not.
     *         </p>
     *         </note>
     */
    public java.util.List<String> getAllowActions() {
        return allowActions;
    }

    /**
     * <p>
     * A list of allowed actions that an API key resource grants permissions to
     * perform
     * </p>
     * <note>
     * <p>
     * Currently, the only valid action is <code>geo:GetMap*</code> as an input
     * to the list. For example, <code>["geo:GetMap*"]</code> is valid but
     * <code>["geo:GetMapTile"]</code> is not.
     * </p>
     * </note>
     *
     * @param allowActions <p>
     *            A list of allowed actions that an API key resource grants
     *            permissions to perform
     *            </p>
     *            <note>
     *            <p>
     *            Currently, the only valid action is <code>geo:GetMap*</code>
     *            as an input to the list. For example,
     *            <code>["geo:GetMap*"]</code> is valid but
     *            <code>["geo:GetMapTile"]</code> is not.
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
     * perform
     * </p>
     * <note>
     * <p>
     * Currently, the only valid action is <code>geo:GetMap*</code> as an input
     * to the list. For example, <code>["geo:GetMap*"]</code> is valid but
     * <code>["geo:GetMapTile"]</code> is not.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowActions <p>
     *            A list of allowed actions that an API key resource grants
     *            permissions to perform
     *            </p>
     *            <note>
     *            <p>
     *            Currently, the only valid action is <code>geo:GetMap*</code>
     *            as an input to the list. For example,
     *            <code>["geo:GetMap*"]</code> is valid but
     *            <code>["geo:GetMapTile"]</code> is not.
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
     * perform
     * </p>
     * <note>
     * <p>
     * Currently, the only valid action is <code>geo:GetMap*</code> as an input
     * to the list. For example, <code>["geo:GetMap*"]</code> is valid but
     * <code>["geo:GetMapTile"]</code> is not.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowActions <p>
     *            A list of allowed actions that an API key resource grants
     *            permissions to perform
     *            </p>
     *            <note>
     *            <p>
     *            Currently, the only valid action is <code>geo:GetMap*</code>
     *            as an input to the list. For example,
     *            <code>["geo:GetMap*"]</code> is valid but
     *            <code>["geo:GetMapTile"]</code> is not.
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
     * <p>
     * A list of allowed resource ARNs that a API key bearer can perform actions
     * on
     * </p>
     * <p>
     * For more information about ARN format, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs)</a>.
     * </p>
     * <note>
     * <p>
     * In this preview, you can allow only map resources.
     * </p>
     * </note>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be prefixed with <code>arn</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>partition</code> and <code>service</code> must not be empty and
     * should begin with only alphanumeric characters (A–Z, a–z, 0–9) and
     * contain only alphanumeric numbers, hyphens (-) and periods (.).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region</code> and <code>account-id</code> can be empty or should
     * begin with only alphanumeric characters (A–Z, a–z, 0–9) and contain only
     * alphanumeric numbers, hyphens (-) and periods (.).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource-id</code> can begin with any character except for forward
     * slash (/) and contain any characters after, including forward slashes to
     * form a path.
     * </p>
     * <p>
     * <code>resource-id</code> can also include wildcard characters, denoted by
     * an asterisk (*).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn</code>, <code>partition</code>, <code>service</code>,
     * <code>region</code>, <code>account-id</code> and <code>resource-id</code>
     * must be delimited by a colon (:).
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example,
     * <code>arn:aws:geo:region:<i>account-id</i>:map/ExampleMap*</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A list of allowed resource ARNs that a API key bearer can perform
     *         actions on
     *         </p>
     *         <p>
     *         For more information about ARN format, see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Names (ARNs)</a>.
     *         </p>
     *         <note>
     *         <p>
     *         In this preview, you can allow only map resources.
     *         </p>
     *         </note>
     *         <p>
     *         Requirements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be prefixed with <code>arn</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>partition</code> and <code>service</code> must not be empty
     *         and should begin with only alphanumeric characters (A–Z, a–z,
     *         0–9) and contain only alphanumeric numbers, hyphens (-) and
     *         periods (.).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>region</code> and <code>account-id</code> can be empty or
     *         should begin with only alphanumeric characters (A–Z, a–z, 0–9)
     *         and contain only alphanumeric numbers, hyphens (-) and periods
     *         (.).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>resource-id</code> can begin with any character except for
     *         forward slash (/) and contain any characters after, including
     *         forward slashes to form a path.
     *         </p>
     *         <p>
     *         <code>resource-id</code> can also include wildcard characters,
     *         denoted by an asterisk (*).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn</code>, <code>partition</code>, <code>service</code>,
     *         <code>region</code>, <code>account-id</code> and
     *         <code>resource-id</code> must be delimited by a colon (:).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         No spaces allowed. For example,
     *         <code>arn:aws:geo:region:<i>account-id</i>:map/ExampleMap*</code>
     *         .
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getAllowResources() {
        return allowResources;
    }

    /**
     * <p>
     * A list of allowed resource ARNs that a API key bearer can perform actions
     * on
     * </p>
     * <p>
     * For more information about ARN format, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs)</a>.
     * </p>
     * <note>
     * <p>
     * In this preview, you can allow only map resources.
     * </p>
     * </note>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be prefixed with <code>arn</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>partition</code> and <code>service</code> must not be empty and
     * should begin with only alphanumeric characters (A–Z, a–z, 0–9) and
     * contain only alphanumeric numbers, hyphens (-) and periods (.).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region</code> and <code>account-id</code> can be empty or should
     * begin with only alphanumeric characters (A–Z, a–z, 0–9) and contain only
     * alphanumeric numbers, hyphens (-) and periods (.).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource-id</code> can begin with any character except for forward
     * slash (/) and contain any characters after, including forward slashes to
     * form a path.
     * </p>
     * <p>
     * <code>resource-id</code> can also include wildcard characters, denoted by
     * an asterisk (*).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn</code>, <code>partition</code>, <code>service</code>,
     * <code>region</code>, <code>account-id</code> and <code>resource-id</code>
     * must be delimited by a colon (:).
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example,
     * <code>arn:aws:geo:region:<i>account-id</i>:map/ExampleMap*</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @param allowResources <p>
     *            A list of allowed resource ARNs that a API key bearer can
     *            perform actions on
     *            </p>
     *            <p>
     *            For more information about ARN format, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs)</a>.
     *            </p>
     *            <note>
     *            <p>
     *            In this preview, you can allow only map resources.
     *            </p>
     *            </note>
     *            <p>
     *            Requirements:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be prefixed with <code>arn</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>partition</code> and <code>service</code> must not be
     *            empty and should begin with only alphanumeric characters (A–Z,
     *            a–z, 0–9) and contain only alphanumeric numbers, hyphens (-)
     *            and periods (.).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>region</code> and <code>account-id</code> can be empty
     *            or should begin with only alphanumeric characters (A–Z, a–z,
     *            0–9) and contain only alphanumeric numbers, hyphens (-) and
     *            periods (.).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>resource-id</code> can begin with any character except
     *            for forward slash (/) and contain any characters after,
     *            including forward slashes to form a path.
     *            </p>
     *            <p>
     *            <code>resource-id</code> can also include wildcard characters,
     *            denoted by an asterisk (*).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn</code>, <code>partition</code>, <code>service</code>, <code>region</code>, <code>account-id</code> and
     *            <code>resource-id</code> must be delimited by a colon (:).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            No spaces allowed. For example,
     *            <code>arn:aws:geo:region:<i>account-id</i>:map/ExampleMap*</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
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
     * on
     * </p>
     * <p>
     * For more information about ARN format, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs)</a>.
     * </p>
     * <note>
     * <p>
     * In this preview, you can allow only map resources.
     * </p>
     * </note>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be prefixed with <code>arn</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>partition</code> and <code>service</code> must not be empty and
     * should begin with only alphanumeric characters (A–Z, a–z, 0–9) and
     * contain only alphanumeric numbers, hyphens (-) and periods (.).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region</code> and <code>account-id</code> can be empty or should
     * begin with only alphanumeric characters (A–Z, a–z, 0–9) and contain only
     * alphanumeric numbers, hyphens (-) and periods (.).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource-id</code> can begin with any character except for forward
     * slash (/) and contain any characters after, including forward slashes to
     * form a path.
     * </p>
     * <p>
     * <code>resource-id</code> can also include wildcard characters, denoted by
     * an asterisk (*).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn</code>, <code>partition</code>, <code>service</code>,
     * <code>region</code>, <code>account-id</code> and <code>resource-id</code>
     * must be delimited by a colon (:).
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example,
     * <code>arn:aws:geo:region:<i>account-id</i>:map/ExampleMap*</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowResources <p>
     *            A list of allowed resource ARNs that a API key bearer can
     *            perform actions on
     *            </p>
     *            <p>
     *            For more information about ARN format, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs)</a>.
     *            </p>
     *            <note>
     *            <p>
     *            In this preview, you can allow only map resources.
     *            </p>
     *            </note>
     *            <p>
     *            Requirements:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be prefixed with <code>arn</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>partition</code> and <code>service</code> must not be
     *            empty and should begin with only alphanumeric characters (A–Z,
     *            a–z, 0–9) and contain only alphanumeric numbers, hyphens (-)
     *            and periods (.).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>region</code> and <code>account-id</code> can be empty
     *            or should begin with only alphanumeric characters (A–Z, a–z,
     *            0–9) and contain only alphanumeric numbers, hyphens (-) and
     *            periods (.).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>resource-id</code> can begin with any character except
     *            for forward slash (/) and contain any characters after,
     *            including forward slashes to form a path.
     *            </p>
     *            <p>
     *            <code>resource-id</code> can also include wildcard characters,
     *            denoted by an asterisk (*).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn</code>, <code>partition</code>, <code>service</code>, <code>region</code>, <code>account-id</code> and
     *            <code>resource-id</code> must be delimited by a colon (:).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            No spaces allowed. For example,
     *            <code>arn:aws:geo:region:<i>account-id</i>:map/ExampleMap*</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
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
     * on
     * </p>
     * <p>
     * For more information about ARN format, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs)</a>.
     * </p>
     * <note>
     * <p>
     * In this preview, you can allow only map resources.
     * </p>
     * </note>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be prefixed with <code>arn</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>partition</code> and <code>service</code> must not be empty and
     * should begin with only alphanumeric characters (A–Z, a–z, 0–9) and
     * contain only alphanumeric numbers, hyphens (-) and periods (.).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region</code> and <code>account-id</code> can be empty or should
     * begin with only alphanumeric characters (A–Z, a–z, 0–9) and contain only
     * alphanumeric numbers, hyphens (-) and periods (.).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource-id</code> can begin with any character except for forward
     * slash (/) and contain any characters after, including forward slashes to
     * form a path.
     * </p>
     * <p>
     * <code>resource-id</code> can also include wildcard characters, denoted by
     * an asterisk (*).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn</code>, <code>partition</code>, <code>service</code>,
     * <code>region</code>, <code>account-id</code> and <code>resource-id</code>
     * must be delimited by a colon (:).
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example,
     * <code>arn:aws:geo:region:<i>account-id</i>:map/ExampleMap*</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowResources <p>
     *            A list of allowed resource ARNs that a API key bearer can
     *            perform actions on
     *            </p>
     *            <p>
     *            For more information about ARN format, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs)</a>.
     *            </p>
     *            <note>
     *            <p>
     *            In this preview, you can allow only map resources.
     *            </p>
     *            </note>
     *            <p>
     *            Requirements:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be prefixed with <code>arn</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>partition</code> and <code>service</code> must not be
     *            empty and should begin with only alphanumeric characters (A–Z,
     *            a–z, 0–9) and contain only alphanumeric numbers, hyphens (-)
     *            and periods (.).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>region</code> and <code>account-id</code> can be empty
     *            or should begin with only alphanumeric characters (A–Z, a–z,
     *            0–9) and contain only alphanumeric numbers, hyphens (-) and
     *            periods (.).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>resource-id</code> can begin with any character except
     *            for forward slash (/) and contain any characters after,
     *            including forward slashes to form a path.
     *            </p>
     *            <p>
     *            <code>resource-id</code> can also include wildcard characters,
     *            denoted by an asterisk (*).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>arn</code>, <code>partition</code>, <code>service</code>, <code>region</code>, <code>account-id</code> and
     *            <code>resource-id</code> must be delimited by a colon (:).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            No spaces allowed. For example,
     *            <code>arn:aws:geo:region:<i>account-id</i>:map/ExampleMap*</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApiKeyRestrictions withAllowResources(java.util.Collection<String> allowResources) {
        setAllowResources(allowResources);
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
        if (getAllowReferers() != null)
            sb.append("AllowReferers: " + getAllowReferers() + ",");
        if (getAllowResources() != null)
            sb.append("AllowResources: " + getAllowResources());
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
                + ((getAllowReferers() == null) ? 0 : getAllowReferers().hashCode());
        hashCode = prime * hashCode
                + ((getAllowResources() == null) ? 0 : getAllowResources().hashCode());
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
        if (other.getAllowReferers() == null ^ this.getAllowReferers() == null)
            return false;
        if (other.getAllowReferers() != null
                && other.getAllowReferers().equals(this.getAllowReferers()) == false)
            return false;
        if (other.getAllowResources() == null ^ this.getAllowResources() == null)
            return false;
        if (other.getAllowResources() != null
                && other.getAllowResources().equals(this.getAllowResources()) == false)
            return false;
        return true;
    }
}
