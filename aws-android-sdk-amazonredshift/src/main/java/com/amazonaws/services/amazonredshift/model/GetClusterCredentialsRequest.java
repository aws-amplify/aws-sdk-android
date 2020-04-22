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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a database user name and temporary password with temporary
 * authorization to log on to an Amazon Redshift database. The action returns
 * the database user name prefixed with <code>IAM:</code> if
 * <code>AutoCreate</code> is <code>False</code> or <code>IAMA:</code> if
 * <code>AutoCreate</code> is <code>True</code>. You can optionally specify one
 * or more database user groups that the user will join at log on. By default,
 * the temporary credentials expire in 900 seconds. You can optionally specify a
 * duration between 900 seconds (15 minutes) and 3600 seconds (60 minutes). For
 * more information, see <a href=
 * "https://docs.aws.amazon.com/redshift/latest/mgmt/generating-user-credentials.html"
 * >Using IAM Authentication to Generate Database User Credentials</a> in the
 * Amazon Redshift Cluster Management Guide.
 * </p>
 * <p>
 * The AWS Identity and Access Management (IAM)user or role that executes
 * GetClusterCredentials must have an IAM policy attached that allows access to
 * all necessary actions and resources. For more information about permissions,
 * see <a href=
 * "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html#redshift-policy-resources.getclustercredentials-resources"
 * >Resource Policies for GetClusterCredentials</a> in the Amazon Redshift
 * Cluster Management Guide.
 * </p>
 * <p>
 * If the <code>DbGroups</code> parameter is specified, the IAM policy must
 * allow the <code>redshift:JoinGroup</code> action with access to the listed
 * <code>dbgroups</code>.
 * </p>
 * <p>
 * In addition, if the <code>AutoCreate</code> parameter is set to
 * <code>True</code>, then the policy must include the
 * <code>redshift:CreateClusterUser</code> privilege.
 * </p>
 * <p>
 * If the <code>DbName</code> parameter is specified, the IAM policy must allow
 * access to the resource <code>dbname</code> for the specified database name.
 * </p>
 */
public class GetClusterCredentialsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of a database user. If a user name matching <code>DbUser</code>
     * exists in the database, the temporary user credentials have the same
     * permissions as the existing user. If <code>DbUser</code> doesn't exist in
     * the database and <code>Autocreate</code> is <code>True</code>, a new user
     * is created using the value for <code>DbUser</code> with PUBLIC
     * permissions. If a database user matching the value for
     * <code>DbUser</code> doesn't exist and <code>Autocreate</code> is
     * <code>False</code>, then the command succeeds but the connection attempt
     * will fail because the user doesn't exist in the database.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/redshift/latest/dg/r_CREATE_USER.html"
     * >CREATE USER</a> in the Amazon Redshift Database Developer Guide.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens. The user name can't
     * be <code>PUBLIC</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters, numbers, underscore, plus sign,
     * period (dot), at symbol (@), or hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">
     * Reserved Words</a> in the Amazon Redshift Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     */
    private String dbUser;

    /**
     * <p>
     * The name of a database that <code>DbUser</code> is authorized to log on
     * to. If <code>DbName</code> is not specified, <code>DbUser</code> can log
     * on to any existing database.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters, numbers, underscore, plus sign,
     * period (dot), at symbol (@), or hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">
     * Reserved Words</a> in the Amazon Redshift Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     */
    private String dbName;

    /**
     * <p>
     * The unique identifier of the cluster that contains the database for which
     * your are requesting credentials. This parameter is case sensitive.
     * </p>
     */
    private String clusterIdentifier;

    /**
     * <p>
     * The number of seconds until the returned temporary password expires.
     * </p>
     * <p>
     * Constraint: minimum 900, maximum 3600.
     * </p>
     * <p>
     * Default: 900
     * </p>
     */
    private Integer durationSeconds;

    /**
     * <p>
     * Create a database user with the name specified for the user named in
     * <code>DbUser</code> if one does not exist.
     * </p>
     */
    private Boolean autoCreate;

    /**
     * <p>
     * A list of the names of existing database groups that the user named in
     * <code>DbUser</code> will join for the current session, in addition to any
     * group memberships for an existing user. If not specified, a new user is
     * added only to PUBLIC.
     * </p>
     * <p>
     * Database group name constraints
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters, numbers, underscore, plus sign,
     * period (dot), at symbol (@), or hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">
     * Reserved Words</a> in the Amazon Redshift Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> dbGroups;

    /**
     * <p>
     * The name of a database user. If a user name matching <code>DbUser</code>
     * exists in the database, the temporary user credentials have the same
     * permissions as the existing user. If <code>DbUser</code> doesn't exist in
     * the database and <code>Autocreate</code> is <code>True</code>, a new user
     * is created using the value for <code>DbUser</code> with PUBLIC
     * permissions. If a database user matching the value for
     * <code>DbUser</code> doesn't exist and <code>Autocreate</code> is
     * <code>False</code>, then the command succeeds but the connection attempt
     * will fail because the user doesn't exist in the database.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/redshift/latest/dg/r_CREATE_USER.html"
     * >CREATE USER</a> in the Amazon Redshift Database Developer Guide.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens. The user name can't
     * be <code>PUBLIC</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters, numbers, underscore, plus sign,
     * period (dot), at symbol (@), or hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">
     * Reserved Words</a> in the Amazon Redshift Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The name of a database user. If a user name matching
     *         <code>DbUser</code> exists in the database, the temporary user
     *         credentials have the same permissions as the existing user. If
     *         <code>DbUser</code> doesn't exist in the database and
     *         <code>Autocreate</code> is <code>True</code>, a new user is
     *         created using the value for <code>DbUser</code> with PUBLIC
     *         permissions. If a database user matching the value for
     *         <code>DbUser</code> doesn't exist and <code>Autocreate</code> is
     *         <code>False</code>, then the command succeeds but the connection
     *         attempt will fail because the user doesn't exist in the database.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/redshift/latest/dg/r_CREATE_USER.html"
     *         >CREATE USER</a> in the Amazon Redshift Database Developer Guide.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 64 alphanumeric characters or hyphens. The user name
     *         can't be <code>PUBLIC</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must contain only lowercase letters, numbers, underscore, plus
     *         sign, period (dot), at symbol (@), or hyphen.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must not contain a colon ( : ) or slash ( / ).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be a reserved word. A list of reserved words can be found
     *         in <a href=
     *         "http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html"
     *         >Reserved Words</a> in the Amazon Redshift Database Developer
     *         Guide.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getDbUser() {
        return dbUser;
    }

    /**
     * <p>
     * The name of a database user. If a user name matching <code>DbUser</code>
     * exists in the database, the temporary user credentials have the same
     * permissions as the existing user. If <code>DbUser</code> doesn't exist in
     * the database and <code>Autocreate</code> is <code>True</code>, a new user
     * is created using the value for <code>DbUser</code> with PUBLIC
     * permissions. If a database user matching the value for
     * <code>DbUser</code> doesn't exist and <code>Autocreate</code> is
     * <code>False</code>, then the command succeeds but the connection attempt
     * will fail because the user doesn't exist in the database.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/redshift/latest/dg/r_CREATE_USER.html"
     * >CREATE USER</a> in the Amazon Redshift Database Developer Guide.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens. The user name can't
     * be <code>PUBLIC</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters, numbers, underscore, plus sign,
     * period (dot), at symbol (@), or hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">
     * Reserved Words</a> in the Amazon Redshift Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     *
     * @param dbUser <p>
     *            The name of a database user. If a user name matching
     *            <code>DbUser</code> exists in the database, the temporary user
     *            credentials have the same permissions as the existing user. If
     *            <code>DbUser</code> doesn't exist in the database and
     *            <code>Autocreate</code> is <code>True</code>, a new user is
     *            created using the value for <code>DbUser</code> with PUBLIC
     *            permissions. If a database user matching the value for
     *            <code>DbUser</code> doesn't exist and <code>Autocreate</code>
     *            is <code>False</code>, then the command succeeds but the
     *            connection attempt will fail because the user doesn't exist in
     *            the database.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/dg/r_CREATE_USER.html"
     *            >CREATE USER</a> in the Amazon Redshift Database Developer
     *            Guide.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 64 alphanumeric characters or hyphens. The user
     *            name can't be <code>PUBLIC</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must contain only lowercase letters, numbers, underscore, plus
     *            sign, period (dot), at symbol (@), or hyphen.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must not contain a colon ( : ) or slash ( / ).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot be a reserved word. A list of reserved words can be
     *            found in <a href=
     *            "http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html"
     *            >Reserved Words</a> in the Amazon Redshift Database Developer
     *            Guide.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    /**
     * <p>
     * The name of a database user. If a user name matching <code>DbUser</code>
     * exists in the database, the temporary user credentials have the same
     * permissions as the existing user. If <code>DbUser</code> doesn't exist in
     * the database and <code>Autocreate</code> is <code>True</code>, a new user
     * is created using the value for <code>DbUser</code> with PUBLIC
     * permissions. If a database user matching the value for
     * <code>DbUser</code> doesn't exist and <code>Autocreate</code> is
     * <code>False</code>, then the command succeeds but the connection attempt
     * will fail because the user doesn't exist in the database.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/redshift/latest/dg/r_CREATE_USER.html"
     * >CREATE USER</a> in the Amazon Redshift Database Developer Guide.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens. The user name can't
     * be <code>PUBLIC</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters, numbers, underscore, plus sign,
     * period (dot), at symbol (@), or hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">
     * Reserved Words</a> in the Amazon Redshift Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dbUser <p>
     *            The name of a database user. If a user name matching
     *            <code>DbUser</code> exists in the database, the temporary user
     *            credentials have the same permissions as the existing user. If
     *            <code>DbUser</code> doesn't exist in the database and
     *            <code>Autocreate</code> is <code>True</code>, a new user is
     *            created using the value for <code>DbUser</code> with PUBLIC
     *            permissions. If a database user matching the value for
     *            <code>DbUser</code> doesn't exist and <code>Autocreate</code>
     *            is <code>False</code>, then the command succeeds but the
     *            connection attempt will fail because the user doesn't exist in
     *            the database.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/dg/r_CREATE_USER.html"
     *            >CREATE USER</a> in the Amazon Redshift Database Developer
     *            Guide.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 64 alphanumeric characters or hyphens. The user
     *            name can't be <code>PUBLIC</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must contain only lowercase letters, numbers, underscore, plus
     *            sign, period (dot), at symbol (@), or hyphen.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must not contain a colon ( : ) or slash ( / ).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot be a reserved word. A list of reserved words can be
     *            found in <a href=
     *            "http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html"
     *            >Reserved Words</a> in the Amazon Redshift Database Developer
     *            Guide.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetClusterCredentialsRequest withDbUser(String dbUser) {
        this.dbUser = dbUser;
        return this;
    }

    /**
     * <p>
     * The name of a database that <code>DbUser</code> is authorized to log on
     * to. If <code>DbName</code> is not specified, <code>DbUser</code> can log
     * on to any existing database.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters, numbers, underscore, plus sign,
     * period (dot), at symbol (@), or hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">
     * Reserved Words</a> in the Amazon Redshift Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The name of a database that <code>DbUser</code> is authorized to
     *         log on to. If <code>DbName</code> is not specified,
     *         <code>DbUser</code> can log on to any existing database.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 64 alphanumeric characters or hyphens
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must contain only lowercase letters, numbers, underscore, plus
     *         sign, period (dot), at symbol (@), or hyphen.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must not contain a colon ( : ) or slash ( / ).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be a reserved word. A list of reserved words can be found
     *         in <a href=
     *         "http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html"
     *         >Reserved Words</a> in the Amazon Redshift Database Developer
     *         Guide.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * <p>
     * The name of a database that <code>DbUser</code> is authorized to log on
     * to. If <code>DbName</code> is not specified, <code>DbUser</code> can log
     * on to any existing database.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters, numbers, underscore, plus sign,
     * period (dot), at symbol (@), or hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">
     * Reserved Words</a> in the Amazon Redshift Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     *
     * @param dbName <p>
     *            The name of a database that <code>DbUser</code> is authorized
     *            to log on to. If <code>DbName</code> is not specified,
     *            <code>DbUser</code> can log on to any existing database.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 64 alphanumeric characters or hyphens
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must contain only lowercase letters, numbers, underscore, plus
     *            sign, period (dot), at symbol (@), or hyphen.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must not contain a colon ( : ) or slash ( / ).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot be a reserved word. A list of reserved words can be
     *            found in <a href=
     *            "http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html"
     *            >Reserved Words</a> in the Amazon Redshift Database Developer
     *            Guide.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    /**
     * <p>
     * The name of a database that <code>DbUser</code> is authorized to log on
     * to. If <code>DbName</code> is not specified, <code>DbUser</code> can log
     * on to any existing database.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters, numbers, underscore, plus sign,
     * period (dot), at symbol (@), or hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">
     * Reserved Words</a> in the Amazon Redshift Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dbName <p>
     *            The name of a database that <code>DbUser</code> is authorized
     *            to log on to. If <code>DbName</code> is not specified,
     *            <code>DbUser</code> can log on to any existing database.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 64 alphanumeric characters or hyphens
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must contain only lowercase letters, numbers, underscore, plus
     *            sign, period (dot), at symbol (@), or hyphen.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must not contain a colon ( : ) or slash ( / ).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot be a reserved word. A list of reserved words can be
     *            found in <a href=
     *            "http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html"
     *            >Reserved Words</a> in the Amazon Redshift Database Developer
     *            Guide.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetClusterCredentialsRequest withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * <p>
     * The unique identifier of the cluster that contains the database for which
     * your are requesting credentials. This parameter is case sensitive.
     * </p>
     *
     * @return <p>
     *         The unique identifier of the cluster that contains the database
     *         for which your are requesting credentials. This parameter is case
     *         sensitive.
     *         </p>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster that contains the database for which
     * your are requesting credentials. This parameter is case sensitive.
     * </p>
     *
     * @param clusterIdentifier <p>
     *            The unique identifier of the cluster that contains the
     *            database for which your are requesting credentials. This
     *            parameter is case sensitive.
     *            </p>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster that contains the database for which
     * your are requesting credentials. This parameter is case sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterIdentifier <p>
     *            The unique identifier of the cluster that contains the
     *            database for which your are requesting credentials. This
     *            parameter is case sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetClusterCredentialsRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The number of seconds until the returned temporary password expires.
     * </p>
     * <p>
     * Constraint: minimum 900, maximum 3600.
     * </p>
     * <p>
     * Default: 900
     * </p>
     *
     * @return <p>
     *         The number of seconds until the returned temporary password
     *         expires.
     *         </p>
     *         <p>
     *         Constraint: minimum 900, maximum 3600.
     *         </p>
     *         <p>
     *         Default: 900
     *         </p>
     */
    public Integer getDurationSeconds() {
        return durationSeconds;
    }

    /**
     * <p>
     * The number of seconds until the returned temporary password expires.
     * </p>
     * <p>
     * Constraint: minimum 900, maximum 3600.
     * </p>
     * <p>
     * Default: 900
     * </p>
     *
     * @param durationSeconds <p>
     *            The number of seconds until the returned temporary password
     *            expires.
     *            </p>
     *            <p>
     *            Constraint: minimum 900, maximum 3600.
     *            </p>
     *            <p>
     *            Default: 900
     *            </p>
     */
    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The number of seconds until the returned temporary password expires.
     * </p>
     * <p>
     * Constraint: minimum 900, maximum 3600.
     * </p>
     * <p>
     * Default: 900
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param durationSeconds <p>
     *            The number of seconds until the returned temporary password
     *            expires.
     *            </p>
     *            <p>
     *            Constraint: minimum 900, maximum 3600.
     *            </p>
     *            <p>
     *            Default: 900
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetClusterCredentialsRequest withDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

    /**
     * <p>
     * Create a database user with the name specified for the user named in
     * <code>DbUser</code> if one does not exist.
     * </p>
     *
     * @return <p>
     *         Create a database user with the name specified for the user named
     *         in <code>DbUser</code> if one does not exist.
     *         </p>
     */
    public Boolean isAutoCreate() {
        return autoCreate;
    }

    /**
     * <p>
     * Create a database user with the name specified for the user named in
     * <code>DbUser</code> if one does not exist.
     * </p>
     *
     * @return <p>
     *         Create a database user with the name specified for the user named
     *         in <code>DbUser</code> if one does not exist.
     *         </p>
     */
    public Boolean getAutoCreate() {
        return autoCreate;
    }

    /**
     * <p>
     * Create a database user with the name specified for the user named in
     * <code>DbUser</code> if one does not exist.
     * </p>
     *
     * @param autoCreate <p>
     *            Create a database user with the name specified for the user
     *            named in <code>DbUser</code> if one does not exist.
     *            </p>
     */
    public void setAutoCreate(Boolean autoCreate) {
        this.autoCreate = autoCreate;
    }

    /**
     * <p>
     * Create a database user with the name specified for the user named in
     * <code>DbUser</code> if one does not exist.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoCreate <p>
     *            Create a database user with the name specified for the user
     *            named in <code>DbUser</code> if one does not exist.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetClusterCredentialsRequest withAutoCreate(Boolean autoCreate) {
        this.autoCreate = autoCreate;
        return this;
    }

    /**
     * <p>
     * A list of the names of existing database groups that the user named in
     * <code>DbUser</code> will join for the current session, in addition to any
     * group memberships for an existing user. If not specified, a new user is
     * added only to PUBLIC.
     * </p>
     * <p>
     * Database group name constraints
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters, numbers, underscore, plus sign,
     * period (dot), at symbol (@), or hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">
     * Reserved Words</a> in the Amazon Redshift Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A list of the names of existing database groups that the user
     *         named in <code>DbUser</code> will join for the current session,
     *         in addition to any group memberships for an existing user. If not
     *         specified, a new user is added only to PUBLIC.
     *         </p>
     *         <p>
     *         Database group name constraints
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 64 alphanumeric characters or hyphens
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must contain only lowercase letters, numbers, underscore, plus
     *         sign, period (dot), at symbol (@), or hyphen.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must not contain a colon ( : ) or slash ( / ).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be a reserved word. A list of reserved words can be found
     *         in <a href=
     *         "http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html"
     *         >Reserved Words</a> in the Amazon Redshift Database Developer
     *         Guide.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getDbGroups() {
        return dbGroups;
    }

    /**
     * <p>
     * A list of the names of existing database groups that the user named in
     * <code>DbUser</code> will join for the current session, in addition to any
     * group memberships for an existing user. If not specified, a new user is
     * added only to PUBLIC.
     * </p>
     * <p>
     * Database group name constraints
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters, numbers, underscore, plus sign,
     * period (dot), at symbol (@), or hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">
     * Reserved Words</a> in the Amazon Redshift Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     *
     * @param dbGroups <p>
     *            A list of the names of existing database groups that the user
     *            named in <code>DbUser</code> will join for the current
     *            session, in addition to any group memberships for an existing
     *            user. If not specified, a new user is added only to PUBLIC.
     *            </p>
     *            <p>
     *            Database group name constraints
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 64 alphanumeric characters or hyphens
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must contain only lowercase letters, numbers, underscore, plus
     *            sign, period (dot), at symbol (@), or hyphen.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must not contain a colon ( : ) or slash ( / ).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot be a reserved word. A list of reserved words can be
     *            found in <a href=
     *            "http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html"
     *            >Reserved Words</a> in the Amazon Redshift Database Developer
     *            Guide.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDbGroups(java.util.Collection<String> dbGroups) {
        if (dbGroups == null) {
            this.dbGroups = null;
            return;
        }

        this.dbGroups = new java.util.ArrayList<String>(dbGroups);
    }

    /**
     * <p>
     * A list of the names of existing database groups that the user named in
     * <code>DbUser</code> will join for the current session, in addition to any
     * group memberships for an existing user. If not specified, a new user is
     * added only to PUBLIC.
     * </p>
     * <p>
     * Database group name constraints
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters, numbers, underscore, plus sign,
     * period (dot), at symbol (@), or hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">
     * Reserved Words</a> in the Amazon Redshift Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dbGroups <p>
     *            A list of the names of existing database groups that the user
     *            named in <code>DbUser</code> will join for the current
     *            session, in addition to any group memberships for an existing
     *            user. If not specified, a new user is added only to PUBLIC.
     *            </p>
     *            <p>
     *            Database group name constraints
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 64 alphanumeric characters or hyphens
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must contain only lowercase letters, numbers, underscore, plus
     *            sign, period (dot), at symbol (@), or hyphen.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must not contain a colon ( : ) or slash ( / ).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot be a reserved word. A list of reserved words can be
     *            found in <a href=
     *            "http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html"
     *            >Reserved Words</a> in the Amazon Redshift Database Developer
     *            Guide.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetClusterCredentialsRequest withDbGroups(String... dbGroups) {
        if (getDbGroups() == null) {
            this.dbGroups = new java.util.ArrayList<String>(dbGroups.length);
        }
        for (String value : dbGroups) {
            this.dbGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the names of existing database groups that the user named in
     * <code>DbUser</code> will join for the current session, in addition to any
     * group memberships for an existing user. If not specified, a new user is
     * added only to PUBLIC.
     * </p>
     * <p>
     * Database group name constraints
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters, numbers, underscore, plus sign,
     * period (dot), at symbol (@), or hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">
     * Reserved Words</a> in the Amazon Redshift Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dbGroups <p>
     *            A list of the names of existing database groups that the user
     *            named in <code>DbUser</code> will join for the current
     *            session, in addition to any group memberships for an existing
     *            user. If not specified, a new user is added only to PUBLIC.
     *            </p>
     *            <p>
     *            Database group name constraints
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 64 alphanumeric characters or hyphens
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must contain only lowercase letters, numbers, underscore, plus
     *            sign, period (dot), at symbol (@), or hyphen.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must not contain a colon ( : ) or slash ( / ).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot be a reserved word. A list of reserved words can be
     *            found in <a href=
     *            "http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html"
     *            >Reserved Words</a> in the Amazon Redshift Database Developer
     *            Guide.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetClusterCredentialsRequest withDbGroups(java.util.Collection<String> dbGroups) {
        setDbGroups(dbGroups);
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
        if (getDbUser() != null)
            sb.append("DbUser: " + getDbUser() + ",");
        if (getDbName() != null)
            sb.append("DbName: " + getDbName() + ",");
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: " + getDurationSeconds() + ",");
        if (getAutoCreate() != null)
            sb.append("AutoCreate: " + getAutoCreate() + ",");
        if (getDbGroups() != null)
            sb.append("DbGroups: " + getDbGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDbUser() == null) ? 0 : getDbUser().hashCode());
        hashCode = prime * hashCode + ((getDbName() == null) ? 0 : getDbName().hashCode());
        hashCode = prime * hashCode
                + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getAutoCreate() == null) ? 0 : getAutoCreate().hashCode());
        hashCode = prime * hashCode + ((getDbGroups() == null) ? 0 : getDbGroups().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetClusterCredentialsRequest == false)
            return false;
        GetClusterCredentialsRequest other = (GetClusterCredentialsRequest) obj;

        if (other.getDbUser() == null ^ this.getDbUser() == null)
            return false;
        if (other.getDbUser() != null && other.getDbUser().equals(this.getDbUser()) == false)
            return false;
        if (other.getDbName() == null ^ this.getDbName() == null)
            return false;
        if (other.getDbName() != null && other.getDbName().equals(this.getDbName()) == false)
            return false;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null
                && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null
                && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        if (other.getAutoCreate() == null ^ this.getAutoCreate() == null)
            return false;
        if (other.getAutoCreate() != null
                && other.getAutoCreate().equals(this.getAutoCreate()) == false)
            return false;
        if (other.getDbGroups() == null ^ this.getDbGroups() == null)
            return false;
        if (other.getDbGroups() != null && other.getDbGroups().equals(this.getDbGroups()) == false)
            return false;
        return true;
    }
}
