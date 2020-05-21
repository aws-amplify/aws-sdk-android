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

package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

/**
 * <p>
 * A filter used to determine which webhooks trigger a build.
 * </p>
 */
public class WebhookFilter implements Serializable {
    /**
     * <p>
     * The type of webhook filter. There are five webhook filter types:
     * <code>EVENT</code>, <code>ACTOR_ACCOUNT_ID</code>, <code>HEAD_REF</code>,
     * <code>BASE_REF</code>, and <code>FILE_PATH</code>.
     * </p>
     * <dl>
     * <dt>EVENT</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the provided <code>pattern</code>
     * matches one of five event types: <code>PUSH</code>,
     * <code>PULL_REQUEST_CREATED</code>, <code>PULL_REQUEST_UPDATED</code>,
     * <code>PULL_REQUEST_REOPENED</code>, and <code>PULL_REQUEST_MERGED</code>.
     * The <code>EVENT</code> patterns are specified as a comma-separated
     * string. For example,
     * <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code> filters all
     * push, pull request created, and pull request updated events.
     * </p>
     * <note>
     * <p>
     * The <code>PULL_REQUEST_REOPENED</code> works with GitHub and GitHub
     * Enterprise only.
     * </p>
     * </note></dd>
     * <dt>ACTOR_ACCOUNT_ID</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when a GitHub, GitHub Enterprise, or
     * Bitbucket account ID matches the regular expression <code>pattern</code>.
     * </p>
     * </dd>
     * <dt>HEAD_REF</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the head reference matches the
     * regular expression <code>pattern</code>. For example,
     * <code>refs/heads/branch-name</code> and <code>refs/tags/tag-name</code>.
     * </p>
     * <p>
     * Works with GitHub and GitHub Enterprise push, GitHub and GitHub
     * Enterprise pull request, Bitbucket push, and Bitbucket pull request
     * events.
     * </p>
     * </dd>
     * <dt>BASE_REF</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the base reference matches the
     * regular expression <code>pattern</code>. For example,
     * <code>refs/heads/branch-name</code>.
     * </p>
     * <note>
     * <p>
     * Works with pull request events only.
     * </p>
     * </note></dd>
     * <dt>FILE_PATH</dt>
     * <dd>
     * <p>
     * A webhook triggers a build when the path of a changed file matches the
     * regular expression <code>pattern</code>.
     * </p>
     * <note>
     * <p>
     * Works with GitHub and GitHub Enterprise push events only.
     * </p>
     * </note></dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVENT, BASE_REF, HEAD_REF, ACTOR_ACCOUNT_ID,
     * FILE_PATH, COMMIT_MESSAGE
     */
    private String type;

    /**
     * <p>
     * For a <code>WebHookFilter</code> that uses <code>EVENT</code> type, a
     * comma-separated string that specifies one or more events. For example,
     * the webhook filter
     * <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code> allows all
     * push, pull request created, and pull request updated events to trigger a
     * build.
     * </p>
     * <p>
     * For a <code>WebHookFilter</code> that uses any of the other filter types,
     * a regular expression pattern. For example, a <code>WebHookFilter</code>
     * that uses <code>HEAD_REF</code> for its <code>type</code> and the pattern
     * <code>^refs/heads/</code> triggers a build when the head reference is a
     * branch with a reference name <code>refs/heads/branch-name</code>.
     * </p>
     */
    private String pattern;

    /**
     * <p>
     * Used to indicate that the <code>pattern</code> determines which webhook
     * events do not trigger a build. If true, then a webhook event that does
     * not match the <code>pattern</code> triggers a build. If false, then a
     * webhook event that matches the <code>pattern</code> triggers a build.
     * </p>
     */
    private Boolean excludeMatchedPattern;

    /**
     * <p>
     * The type of webhook filter. There are five webhook filter types:
     * <code>EVENT</code>, <code>ACTOR_ACCOUNT_ID</code>, <code>HEAD_REF</code>,
     * <code>BASE_REF</code>, and <code>FILE_PATH</code>.
     * </p>
     * <dl>
     * <dt>EVENT</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the provided <code>pattern</code>
     * matches one of five event types: <code>PUSH</code>,
     * <code>PULL_REQUEST_CREATED</code>, <code>PULL_REQUEST_UPDATED</code>,
     * <code>PULL_REQUEST_REOPENED</code>, and <code>PULL_REQUEST_MERGED</code>.
     * The <code>EVENT</code> patterns are specified as a comma-separated
     * string. For example,
     * <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code> filters all
     * push, pull request created, and pull request updated events.
     * </p>
     * <note>
     * <p>
     * The <code>PULL_REQUEST_REOPENED</code> works with GitHub and GitHub
     * Enterprise only.
     * </p>
     * </note></dd>
     * <dt>ACTOR_ACCOUNT_ID</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when a GitHub, GitHub Enterprise, or
     * Bitbucket account ID matches the regular expression <code>pattern</code>.
     * </p>
     * </dd>
     * <dt>HEAD_REF</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the head reference matches the
     * regular expression <code>pattern</code>. For example,
     * <code>refs/heads/branch-name</code> and <code>refs/tags/tag-name</code>.
     * </p>
     * <p>
     * Works with GitHub and GitHub Enterprise push, GitHub and GitHub
     * Enterprise pull request, Bitbucket push, and Bitbucket pull request
     * events.
     * </p>
     * </dd>
     * <dt>BASE_REF</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the base reference matches the
     * regular expression <code>pattern</code>. For example,
     * <code>refs/heads/branch-name</code>.
     * </p>
     * <note>
     * <p>
     * Works with pull request events only.
     * </p>
     * </note></dd>
     * <dt>FILE_PATH</dt>
     * <dd>
     * <p>
     * A webhook triggers a build when the path of a changed file matches the
     * regular expression <code>pattern</code>.
     * </p>
     * <note>
     * <p>
     * Works with GitHub and GitHub Enterprise push events only.
     * </p>
     * </note></dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVENT, BASE_REF, HEAD_REF, ACTOR_ACCOUNT_ID,
     * FILE_PATH, COMMIT_MESSAGE
     *
     * @return <p>
     *         The type of webhook filter. There are five webhook filter types:
     *         <code>EVENT</code>, <code>ACTOR_ACCOUNT_ID</code>,
     *         <code>HEAD_REF</code>, <code>BASE_REF</code>, and
     *         <code>FILE_PATH</code>.
     *         </p>
     *         <dl>
     *         <dt>EVENT</dt>
     *         <dd>
     *         <p>
     *         A webhook event triggers a build when the provided
     *         <code>pattern</code> matches one of five event types:
     *         <code>PUSH</code>, <code>PULL_REQUEST_CREATED</code>,
     *         <code>PULL_REQUEST_UPDATED</code>,
     *         <code>PULL_REQUEST_REOPENED</code>, and
     *         <code>PULL_REQUEST_MERGED</code>. The <code>EVENT</code> patterns
     *         are specified as a comma-separated string. For example,
     *         <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code>
     *         filters all push, pull request created, and pull request updated
     *         events.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>PULL_REQUEST_REOPENED</code> works with GitHub and
     *         GitHub Enterprise only.
     *         </p>
     *         </note></dd>
     *         <dt>ACTOR_ACCOUNT_ID</dt>
     *         <dd>
     *         <p>
     *         A webhook event triggers a build when a GitHub, GitHub
     *         Enterprise, or Bitbucket account ID matches the regular
     *         expression <code>pattern</code>.
     *         </p>
     *         </dd>
     *         <dt>HEAD_REF</dt>
     *         <dd>
     *         <p>
     *         A webhook event triggers a build when the head reference matches
     *         the regular expression <code>pattern</code>. For example,
     *         <code>refs/heads/branch-name</code> and
     *         <code>refs/tags/tag-name</code>.
     *         </p>
     *         <p>
     *         Works with GitHub and GitHub Enterprise push, GitHub and GitHub
     *         Enterprise pull request, Bitbucket push, and Bitbucket pull
     *         request events.
     *         </p>
     *         </dd>
     *         <dt>BASE_REF</dt>
     *         <dd>
     *         <p>
     *         A webhook event triggers a build when the base reference matches
     *         the regular expression <code>pattern</code>. For example,
     *         <code>refs/heads/branch-name</code>.
     *         </p>
     *         <note>
     *         <p>
     *         Works with pull request events only.
     *         </p>
     *         </note></dd>
     *         <dt>FILE_PATH</dt>
     *         <dd>
     *         <p>
     *         A webhook triggers a build when the path of a changed file
     *         matches the regular expression <code>pattern</code>.
     *         </p>
     *         <note>
     *         <p>
     *         Works with GitHub and GitHub Enterprise push events only.
     *         </p>
     *         </note></dd>
     *         </dl>
     * @see WebhookFilterType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of webhook filter. There are five webhook filter types:
     * <code>EVENT</code>, <code>ACTOR_ACCOUNT_ID</code>, <code>HEAD_REF</code>,
     * <code>BASE_REF</code>, and <code>FILE_PATH</code>.
     * </p>
     * <dl>
     * <dt>EVENT</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the provided <code>pattern</code>
     * matches one of five event types: <code>PUSH</code>,
     * <code>PULL_REQUEST_CREATED</code>, <code>PULL_REQUEST_UPDATED</code>,
     * <code>PULL_REQUEST_REOPENED</code>, and <code>PULL_REQUEST_MERGED</code>.
     * The <code>EVENT</code> patterns are specified as a comma-separated
     * string. For example,
     * <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code> filters all
     * push, pull request created, and pull request updated events.
     * </p>
     * <note>
     * <p>
     * The <code>PULL_REQUEST_REOPENED</code> works with GitHub and GitHub
     * Enterprise only.
     * </p>
     * </note></dd>
     * <dt>ACTOR_ACCOUNT_ID</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when a GitHub, GitHub Enterprise, or
     * Bitbucket account ID matches the regular expression <code>pattern</code>.
     * </p>
     * </dd>
     * <dt>HEAD_REF</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the head reference matches the
     * regular expression <code>pattern</code>. For example,
     * <code>refs/heads/branch-name</code> and <code>refs/tags/tag-name</code>.
     * </p>
     * <p>
     * Works with GitHub and GitHub Enterprise push, GitHub and GitHub
     * Enterprise pull request, Bitbucket push, and Bitbucket pull request
     * events.
     * </p>
     * </dd>
     * <dt>BASE_REF</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the base reference matches the
     * regular expression <code>pattern</code>. For example,
     * <code>refs/heads/branch-name</code>.
     * </p>
     * <note>
     * <p>
     * Works with pull request events only.
     * </p>
     * </note></dd>
     * <dt>FILE_PATH</dt>
     * <dd>
     * <p>
     * A webhook triggers a build when the path of a changed file matches the
     * regular expression <code>pattern</code>.
     * </p>
     * <note>
     * <p>
     * Works with GitHub and GitHub Enterprise push events only.
     * </p>
     * </note></dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVENT, BASE_REF, HEAD_REF, ACTOR_ACCOUNT_ID,
     * FILE_PATH, COMMIT_MESSAGE
     *
     * @param type <p>
     *            The type of webhook filter. There are five webhook filter
     *            types: <code>EVENT</code>, <code>ACTOR_ACCOUNT_ID</code>,
     *            <code>HEAD_REF</code>, <code>BASE_REF</code>, and
     *            <code>FILE_PATH</code>.
     *            </p>
     *            <dl>
     *            <dt>EVENT</dt>
     *            <dd>
     *            <p>
     *            A webhook event triggers a build when the provided
     *            <code>pattern</code> matches one of five event types:
     *            <code>PUSH</code>, <code>PULL_REQUEST_CREATED</code>,
     *            <code>PULL_REQUEST_UPDATED</code>,
     *            <code>PULL_REQUEST_REOPENED</code>, and
     *            <code>PULL_REQUEST_MERGED</code>. The <code>EVENT</code>
     *            patterns are specified as a comma-separated string. For
     *            example,
     *            <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code>
     *            filters all push, pull request created, and pull request
     *            updated events.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>PULL_REQUEST_REOPENED</code> works with GitHub and
     *            GitHub Enterprise only.
     *            </p>
     *            </note></dd>
     *            <dt>ACTOR_ACCOUNT_ID</dt>
     *            <dd>
     *            <p>
     *            A webhook event triggers a build when a GitHub, GitHub
     *            Enterprise, or Bitbucket account ID matches the regular
     *            expression <code>pattern</code>.
     *            </p>
     *            </dd>
     *            <dt>HEAD_REF</dt>
     *            <dd>
     *            <p>
     *            A webhook event triggers a build when the head reference
     *            matches the regular expression <code>pattern</code>. For
     *            example, <code>refs/heads/branch-name</code> and
     *            <code>refs/tags/tag-name</code>.
     *            </p>
     *            <p>
     *            Works with GitHub and GitHub Enterprise push, GitHub and
     *            GitHub Enterprise pull request, Bitbucket push, and Bitbucket
     *            pull request events.
     *            </p>
     *            </dd>
     *            <dt>BASE_REF</dt>
     *            <dd>
     *            <p>
     *            A webhook event triggers a build when the base reference
     *            matches the regular expression <code>pattern</code>. For
     *            example, <code>refs/heads/branch-name</code>.
     *            </p>
     *            <note>
     *            <p>
     *            Works with pull request events only.
     *            </p>
     *            </note></dd>
     *            <dt>FILE_PATH</dt>
     *            <dd>
     *            <p>
     *            A webhook triggers a build when the path of a changed file
     *            matches the regular expression <code>pattern</code>.
     *            </p>
     *            <note>
     *            <p>
     *            Works with GitHub and GitHub Enterprise push events only.
     *            </p>
     *            </note></dd>
     *            </dl>
     * @see WebhookFilterType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of webhook filter. There are five webhook filter types:
     * <code>EVENT</code>, <code>ACTOR_ACCOUNT_ID</code>, <code>HEAD_REF</code>,
     * <code>BASE_REF</code>, and <code>FILE_PATH</code>.
     * </p>
     * <dl>
     * <dt>EVENT</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the provided <code>pattern</code>
     * matches one of five event types: <code>PUSH</code>,
     * <code>PULL_REQUEST_CREATED</code>, <code>PULL_REQUEST_UPDATED</code>,
     * <code>PULL_REQUEST_REOPENED</code>, and <code>PULL_REQUEST_MERGED</code>.
     * The <code>EVENT</code> patterns are specified as a comma-separated
     * string. For example,
     * <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code> filters all
     * push, pull request created, and pull request updated events.
     * </p>
     * <note>
     * <p>
     * The <code>PULL_REQUEST_REOPENED</code> works with GitHub and GitHub
     * Enterprise only.
     * </p>
     * </note></dd>
     * <dt>ACTOR_ACCOUNT_ID</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when a GitHub, GitHub Enterprise, or
     * Bitbucket account ID matches the regular expression <code>pattern</code>.
     * </p>
     * </dd>
     * <dt>HEAD_REF</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the head reference matches the
     * regular expression <code>pattern</code>. For example,
     * <code>refs/heads/branch-name</code> and <code>refs/tags/tag-name</code>.
     * </p>
     * <p>
     * Works with GitHub and GitHub Enterprise push, GitHub and GitHub
     * Enterprise pull request, Bitbucket push, and Bitbucket pull request
     * events.
     * </p>
     * </dd>
     * <dt>BASE_REF</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the base reference matches the
     * regular expression <code>pattern</code>. For example,
     * <code>refs/heads/branch-name</code>.
     * </p>
     * <note>
     * <p>
     * Works with pull request events only.
     * </p>
     * </note></dd>
     * <dt>FILE_PATH</dt>
     * <dd>
     * <p>
     * A webhook triggers a build when the path of a changed file matches the
     * regular expression <code>pattern</code>.
     * </p>
     * <note>
     * <p>
     * Works with GitHub and GitHub Enterprise push events only.
     * </p>
     * </note></dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVENT, BASE_REF, HEAD_REF, ACTOR_ACCOUNT_ID,
     * FILE_PATH, COMMIT_MESSAGE
     *
     * @param type <p>
     *            The type of webhook filter. There are five webhook filter
     *            types: <code>EVENT</code>, <code>ACTOR_ACCOUNT_ID</code>,
     *            <code>HEAD_REF</code>, <code>BASE_REF</code>, and
     *            <code>FILE_PATH</code>.
     *            </p>
     *            <dl>
     *            <dt>EVENT</dt>
     *            <dd>
     *            <p>
     *            A webhook event triggers a build when the provided
     *            <code>pattern</code> matches one of five event types:
     *            <code>PUSH</code>, <code>PULL_REQUEST_CREATED</code>,
     *            <code>PULL_REQUEST_UPDATED</code>,
     *            <code>PULL_REQUEST_REOPENED</code>, and
     *            <code>PULL_REQUEST_MERGED</code>. The <code>EVENT</code>
     *            patterns are specified as a comma-separated string. For
     *            example,
     *            <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code>
     *            filters all push, pull request created, and pull request
     *            updated events.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>PULL_REQUEST_REOPENED</code> works with GitHub and
     *            GitHub Enterprise only.
     *            </p>
     *            </note></dd>
     *            <dt>ACTOR_ACCOUNT_ID</dt>
     *            <dd>
     *            <p>
     *            A webhook event triggers a build when a GitHub, GitHub
     *            Enterprise, or Bitbucket account ID matches the regular
     *            expression <code>pattern</code>.
     *            </p>
     *            </dd>
     *            <dt>HEAD_REF</dt>
     *            <dd>
     *            <p>
     *            A webhook event triggers a build when the head reference
     *            matches the regular expression <code>pattern</code>. For
     *            example, <code>refs/heads/branch-name</code> and
     *            <code>refs/tags/tag-name</code>.
     *            </p>
     *            <p>
     *            Works with GitHub and GitHub Enterprise push, GitHub and
     *            GitHub Enterprise pull request, Bitbucket push, and Bitbucket
     *            pull request events.
     *            </p>
     *            </dd>
     *            <dt>BASE_REF</dt>
     *            <dd>
     *            <p>
     *            A webhook event triggers a build when the base reference
     *            matches the regular expression <code>pattern</code>. For
     *            example, <code>refs/heads/branch-name</code>.
     *            </p>
     *            <note>
     *            <p>
     *            Works with pull request events only.
     *            </p>
     *            </note></dd>
     *            <dt>FILE_PATH</dt>
     *            <dd>
     *            <p>
     *            A webhook triggers a build when the path of a changed file
     *            matches the regular expression <code>pattern</code>.
     *            </p>
     *            <note>
     *            <p>
     *            Works with GitHub and GitHub Enterprise push events only.
     *            </p>
     *            </note></dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WebhookFilterType
     */
    public WebhookFilter withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of webhook filter. There are five webhook filter types:
     * <code>EVENT</code>, <code>ACTOR_ACCOUNT_ID</code>, <code>HEAD_REF</code>,
     * <code>BASE_REF</code>, and <code>FILE_PATH</code>.
     * </p>
     * <dl>
     * <dt>EVENT</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the provided <code>pattern</code>
     * matches one of five event types: <code>PUSH</code>,
     * <code>PULL_REQUEST_CREATED</code>, <code>PULL_REQUEST_UPDATED</code>,
     * <code>PULL_REQUEST_REOPENED</code>, and <code>PULL_REQUEST_MERGED</code>.
     * The <code>EVENT</code> patterns are specified as a comma-separated
     * string. For example,
     * <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code> filters all
     * push, pull request created, and pull request updated events.
     * </p>
     * <note>
     * <p>
     * The <code>PULL_REQUEST_REOPENED</code> works with GitHub and GitHub
     * Enterprise only.
     * </p>
     * </note></dd>
     * <dt>ACTOR_ACCOUNT_ID</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when a GitHub, GitHub Enterprise, or
     * Bitbucket account ID matches the regular expression <code>pattern</code>.
     * </p>
     * </dd>
     * <dt>HEAD_REF</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the head reference matches the
     * regular expression <code>pattern</code>. For example,
     * <code>refs/heads/branch-name</code> and <code>refs/tags/tag-name</code>.
     * </p>
     * <p>
     * Works with GitHub and GitHub Enterprise push, GitHub and GitHub
     * Enterprise pull request, Bitbucket push, and Bitbucket pull request
     * events.
     * </p>
     * </dd>
     * <dt>BASE_REF</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the base reference matches the
     * regular expression <code>pattern</code>. For example,
     * <code>refs/heads/branch-name</code>.
     * </p>
     * <note>
     * <p>
     * Works with pull request events only.
     * </p>
     * </note></dd>
     * <dt>FILE_PATH</dt>
     * <dd>
     * <p>
     * A webhook triggers a build when the path of a changed file matches the
     * regular expression <code>pattern</code>.
     * </p>
     * <note>
     * <p>
     * Works with GitHub and GitHub Enterprise push events only.
     * </p>
     * </note></dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVENT, BASE_REF, HEAD_REF, ACTOR_ACCOUNT_ID,
     * FILE_PATH, COMMIT_MESSAGE
     *
     * @param type <p>
     *            The type of webhook filter. There are five webhook filter
     *            types: <code>EVENT</code>, <code>ACTOR_ACCOUNT_ID</code>,
     *            <code>HEAD_REF</code>, <code>BASE_REF</code>, and
     *            <code>FILE_PATH</code>.
     *            </p>
     *            <dl>
     *            <dt>EVENT</dt>
     *            <dd>
     *            <p>
     *            A webhook event triggers a build when the provided
     *            <code>pattern</code> matches one of five event types:
     *            <code>PUSH</code>, <code>PULL_REQUEST_CREATED</code>,
     *            <code>PULL_REQUEST_UPDATED</code>,
     *            <code>PULL_REQUEST_REOPENED</code>, and
     *            <code>PULL_REQUEST_MERGED</code>. The <code>EVENT</code>
     *            patterns are specified as a comma-separated string. For
     *            example,
     *            <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code>
     *            filters all push, pull request created, and pull request
     *            updated events.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>PULL_REQUEST_REOPENED</code> works with GitHub and
     *            GitHub Enterprise only.
     *            </p>
     *            </note></dd>
     *            <dt>ACTOR_ACCOUNT_ID</dt>
     *            <dd>
     *            <p>
     *            A webhook event triggers a build when a GitHub, GitHub
     *            Enterprise, or Bitbucket account ID matches the regular
     *            expression <code>pattern</code>.
     *            </p>
     *            </dd>
     *            <dt>HEAD_REF</dt>
     *            <dd>
     *            <p>
     *            A webhook event triggers a build when the head reference
     *            matches the regular expression <code>pattern</code>. For
     *            example, <code>refs/heads/branch-name</code> and
     *            <code>refs/tags/tag-name</code>.
     *            </p>
     *            <p>
     *            Works with GitHub and GitHub Enterprise push, GitHub and
     *            GitHub Enterprise pull request, Bitbucket push, and Bitbucket
     *            pull request events.
     *            </p>
     *            </dd>
     *            <dt>BASE_REF</dt>
     *            <dd>
     *            <p>
     *            A webhook event triggers a build when the base reference
     *            matches the regular expression <code>pattern</code>. For
     *            example, <code>refs/heads/branch-name</code>.
     *            </p>
     *            <note>
     *            <p>
     *            Works with pull request events only.
     *            </p>
     *            </note></dd>
     *            <dt>FILE_PATH</dt>
     *            <dd>
     *            <p>
     *            A webhook triggers a build when the path of a changed file
     *            matches the regular expression <code>pattern</code>.
     *            </p>
     *            <note>
     *            <p>
     *            Works with GitHub and GitHub Enterprise push events only.
     *            </p>
     *            </note></dd>
     *            </dl>
     * @see WebhookFilterType
     */
    public void setType(WebhookFilterType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of webhook filter. There are five webhook filter types:
     * <code>EVENT</code>, <code>ACTOR_ACCOUNT_ID</code>, <code>HEAD_REF</code>,
     * <code>BASE_REF</code>, and <code>FILE_PATH</code>.
     * </p>
     * <dl>
     * <dt>EVENT</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the provided <code>pattern</code>
     * matches one of five event types: <code>PUSH</code>,
     * <code>PULL_REQUEST_CREATED</code>, <code>PULL_REQUEST_UPDATED</code>,
     * <code>PULL_REQUEST_REOPENED</code>, and <code>PULL_REQUEST_MERGED</code>.
     * The <code>EVENT</code> patterns are specified as a comma-separated
     * string. For example,
     * <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code> filters all
     * push, pull request created, and pull request updated events.
     * </p>
     * <note>
     * <p>
     * The <code>PULL_REQUEST_REOPENED</code> works with GitHub and GitHub
     * Enterprise only.
     * </p>
     * </note></dd>
     * <dt>ACTOR_ACCOUNT_ID</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when a GitHub, GitHub Enterprise, or
     * Bitbucket account ID matches the regular expression <code>pattern</code>.
     * </p>
     * </dd>
     * <dt>HEAD_REF</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the head reference matches the
     * regular expression <code>pattern</code>. For example,
     * <code>refs/heads/branch-name</code> and <code>refs/tags/tag-name</code>.
     * </p>
     * <p>
     * Works with GitHub and GitHub Enterprise push, GitHub and GitHub
     * Enterprise pull request, Bitbucket push, and Bitbucket pull request
     * events.
     * </p>
     * </dd>
     * <dt>BASE_REF</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the base reference matches the
     * regular expression <code>pattern</code>. For example,
     * <code>refs/heads/branch-name</code>.
     * </p>
     * <note>
     * <p>
     * Works with pull request events only.
     * </p>
     * </note></dd>
     * <dt>FILE_PATH</dt>
     * <dd>
     * <p>
     * A webhook triggers a build when the path of a changed file matches the
     * regular expression <code>pattern</code>.
     * </p>
     * <note>
     * <p>
     * Works with GitHub and GitHub Enterprise push events only.
     * </p>
     * </note></dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVENT, BASE_REF, HEAD_REF, ACTOR_ACCOUNT_ID,
     * FILE_PATH, COMMIT_MESSAGE
     *
     * @param type <p>
     *            The type of webhook filter. There are five webhook filter
     *            types: <code>EVENT</code>, <code>ACTOR_ACCOUNT_ID</code>,
     *            <code>HEAD_REF</code>, <code>BASE_REF</code>, and
     *            <code>FILE_PATH</code>.
     *            </p>
     *            <dl>
     *            <dt>EVENT</dt>
     *            <dd>
     *            <p>
     *            A webhook event triggers a build when the provided
     *            <code>pattern</code> matches one of five event types:
     *            <code>PUSH</code>, <code>PULL_REQUEST_CREATED</code>,
     *            <code>PULL_REQUEST_UPDATED</code>,
     *            <code>PULL_REQUEST_REOPENED</code>, and
     *            <code>PULL_REQUEST_MERGED</code>. The <code>EVENT</code>
     *            patterns are specified as a comma-separated string. For
     *            example,
     *            <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code>
     *            filters all push, pull request created, and pull request
     *            updated events.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>PULL_REQUEST_REOPENED</code> works with GitHub and
     *            GitHub Enterprise only.
     *            </p>
     *            </note></dd>
     *            <dt>ACTOR_ACCOUNT_ID</dt>
     *            <dd>
     *            <p>
     *            A webhook event triggers a build when a GitHub, GitHub
     *            Enterprise, or Bitbucket account ID matches the regular
     *            expression <code>pattern</code>.
     *            </p>
     *            </dd>
     *            <dt>HEAD_REF</dt>
     *            <dd>
     *            <p>
     *            A webhook event triggers a build when the head reference
     *            matches the regular expression <code>pattern</code>. For
     *            example, <code>refs/heads/branch-name</code> and
     *            <code>refs/tags/tag-name</code>.
     *            </p>
     *            <p>
     *            Works with GitHub and GitHub Enterprise push, GitHub and
     *            GitHub Enterprise pull request, Bitbucket push, and Bitbucket
     *            pull request events.
     *            </p>
     *            </dd>
     *            <dt>BASE_REF</dt>
     *            <dd>
     *            <p>
     *            A webhook event triggers a build when the base reference
     *            matches the regular expression <code>pattern</code>. For
     *            example, <code>refs/heads/branch-name</code>.
     *            </p>
     *            <note>
     *            <p>
     *            Works with pull request events only.
     *            </p>
     *            </note></dd>
     *            <dt>FILE_PATH</dt>
     *            <dd>
     *            <p>
     *            A webhook triggers a build when the path of a changed file
     *            matches the regular expression <code>pattern</code>.
     *            </p>
     *            <note>
     *            <p>
     *            Works with GitHub and GitHub Enterprise push events only.
     *            </p>
     *            </note></dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WebhookFilterType
     */
    public WebhookFilter withType(WebhookFilterType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * For a <code>WebHookFilter</code> that uses <code>EVENT</code> type, a
     * comma-separated string that specifies one or more events. For example,
     * the webhook filter
     * <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code> allows all
     * push, pull request created, and pull request updated events to trigger a
     * build.
     * </p>
     * <p>
     * For a <code>WebHookFilter</code> that uses any of the other filter types,
     * a regular expression pattern. For example, a <code>WebHookFilter</code>
     * that uses <code>HEAD_REF</code> for its <code>type</code> and the pattern
     * <code>^refs/heads/</code> triggers a build when the head reference is a
     * branch with a reference name <code>refs/heads/branch-name</code>.
     * </p>
     *
     * @return <p>
     *         For a <code>WebHookFilter</code> that uses <code>EVENT</code>
     *         type, a comma-separated string that specifies one or more events.
     *         For example, the webhook filter
     *         <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code>
     *         allows all push, pull request created, and pull request updated
     *         events to trigger a build.
     *         </p>
     *         <p>
     *         For a <code>WebHookFilter</code> that uses any of the other
     *         filter types, a regular expression pattern. For example, a
     *         <code>WebHookFilter</code> that uses <code>HEAD_REF</code> for
     *         its <code>type</code> and the pattern <code>^refs/heads/</code>
     *         triggers a build when the head reference is a branch with a
     *         reference name <code>refs/heads/branch-name</code>.
     *         </p>
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * <p>
     * For a <code>WebHookFilter</code> that uses <code>EVENT</code> type, a
     * comma-separated string that specifies one or more events. For example,
     * the webhook filter
     * <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code> allows all
     * push, pull request created, and pull request updated events to trigger a
     * build.
     * </p>
     * <p>
     * For a <code>WebHookFilter</code> that uses any of the other filter types,
     * a regular expression pattern. For example, a <code>WebHookFilter</code>
     * that uses <code>HEAD_REF</code> for its <code>type</code> and the pattern
     * <code>^refs/heads/</code> triggers a build when the head reference is a
     * branch with a reference name <code>refs/heads/branch-name</code>.
     * </p>
     *
     * @param pattern <p>
     *            For a <code>WebHookFilter</code> that uses <code>EVENT</code>
     *            type, a comma-separated string that specifies one or more
     *            events. For example, the webhook filter
     *            <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code>
     *            allows all push, pull request created, and pull request
     *            updated events to trigger a build.
     *            </p>
     *            <p>
     *            For a <code>WebHookFilter</code> that uses any of the other
     *            filter types, a regular expression pattern. For example, a
     *            <code>WebHookFilter</code> that uses <code>HEAD_REF</code> for
     *            its <code>type</code> and the pattern
     *            <code>^refs/heads/</code> triggers a build when the head
     *            reference is a branch with a reference name
     *            <code>refs/heads/branch-name</code>.
     *            </p>
     */
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     * <p>
     * For a <code>WebHookFilter</code> that uses <code>EVENT</code> type, a
     * comma-separated string that specifies one or more events. For example,
     * the webhook filter
     * <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code> allows all
     * push, pull request created, and pull request updated events to trigger a
     * build.
     * </p>
     * <p>
     * For a <code>WebHookFilter</code> that uses any of the other filter types,
     * a regular expression pattern. For example, a <code>WebHookFilter</code>
     * that uses <code>HEAD_REF</code> for its <code>type</code> and the pattern
     * <code>^refs/heads/</code> triggers a build when the head reference is a
     * branch with a reference name <code>refs/heads/branch-name</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pattern <p>
     *            For a <code>WebHookFilter</code> that uses <code>EVENT</code>
     *            type, a comma-separated string that specifies one or more
     *            events. For example, the webhook filter
     *            <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code>
     *            allows all push, pull request created, and pull request
     *            updated events to trigger a build.
     *            </p>
     *            <p>
     *            For a <code>WebHookFilter</code> that uses any of the other
     *            filter types, a regular expression pattern. For example, a
     *            <code>WebHookFilter</code> that uses <code>HEAD_REF</code> for
     *            its <code>type</code> and the pattern
     *            <code>^refs/heads/</code> triggers a build when the head
     *            reference is a branch with a reference name
     *            <code>refs/heads/branch-name</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WebhookFilter withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * <p>
     * Used to indicate that the <code>pattern</code> determines which webhook
     * events do not trigger a build. If true, then a webhook event that does
     * not match the <code>pattern</code> triggers a build. If false, then a
     * webhook event that matches the <code>pattern</code> triggers a build.
     * </p>
     *
     * @return <p>
     *         Used to indicate that the <code>pattern</code> determines which
     *         webhook events do not trigger a build. If true, then a webhook
     *         event that does not match the <code>pattern</code> triggers a
     *         build. If false, then a webhook event that matches the
     *         <code>pattern</code> triggers a build.
     *         </p>
     */
    public Boolean isExcludeMatchedPattern() {
        return excludeMatchedPattern;
    }

    /**
     * <p>
     * Used to indicate that the <code>pattern</code> determines which webhook
     * events do not trigger a build. If true, then a webhook event that does
     * not match the <code>pattern</code> triggers a build. If false, then a
     * webhook event that matches the <code>pattern</code> triggers a build.
     * </p>
     *
     * @return <p>
     *         Used to indicate that the <code>pattern</code> determines which
     *         webhook events do not trigger a build. If true, then a webhook
     *         event that does not match the <code>pattern</code> triggers a
     *         build. If false, then a webhook event that matches the
     *         <code>pattern</code> triggers a build.
     *         </p>
     */
    public Boolean getExcludeMatchedPattern() {
        return excludeMatchedPattern;
    }

    /**
     * <p>
     * Used to indicate that the <code>pattern</code> determines which webhook
     * events do not trigger a build. If true, then a webhook event that does
     * not match the <code>pattern</code> triggers a build. If false, then a
     * webhook event that matches the <code>pattern</code> triggers a build.
     * </p>
     *
     * @param excludeMatchedPattern <p>
     *            Used to indicate that the <code>pattern</code> determines
     *            which webhook events do not trigger a build. If true, then a
     *            webhook event that does not match the <code>pattern</code>
     *            triggers a build. If false, then a webhook event that matches
     *            the <code>pattern</code> triggers a build.
     *            </p>
     */
    public void setExcludeMatchedPattern(Boolean excludeMatchedPattern) {
        this.excludeMatchedPattern = excludeMatchedPattern;
    }

    /**
     * <p>
     * Used to indicate that the <code>pattern</code> determines which webhook
     * events do not trigger a build. If true, then a webhook event that does
     * not match the <code>pattern</code> triggers a build. If false, then a
     * webhook event that matches the <code>pattern</code> triggers a build.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param excludeMatchedPattern <p>
     *            Used to indicate that the <code>pattern</code> determines
     *            which webhook events do not trigger a build. If true, then a
     *            webhook event that does not match the <code>pattern</code>
     *            triggers a build. If false, then a webhook event that matches
     *            the <code>pattern</code> triggers a build.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WebhookFilter withExcludeMatchedPattern(Boolean excludeMatchedPattern) {
        this.excludeMatchedPattern = excludeMatchedPattern;
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
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getPattern() != null)
            sb.append("pattern: " + getPattern() + ",");
        if (getExcludeMatchedPattern() != null)
            sb.append("excludeMatchedPattern: " + getExcludeMatchedPattern());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getPattern() == null) ? 0 : getPattern().hashCode());
        hashCode = prime
                * hashCode
                + ((getExcludeMatchedPattern() == null) ? 0 : getExcludeMatchedPattern().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WebhookFilter == false)
            return false;
        WebhookFilter other = (WebhookFilter) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getPattern() == null ^ this.getPattern() == null)
            return false;
        if (other.getPattern() != null && other.getPattern().equals(this.getPattern()) == false)
            return false;
        if (other.getExcludeMatchedPattern() == null ^ this.getExcludeMatchedPattern() == null)
            return false;
        if (other.getExcludeMatchedPattern() != null
                && other.getExcludeMatchedPattern().equals(this.getExcludeMatchedPattern()) == false)
            return false;
        return true;
    }
}
