/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.services.s3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.CanonicalGrantee;
import com.amazonaws.services.s3.model.CreateBucketRequest;
import com.amazonaws.services.s3.model.EmailAddressGrantee;
import com.amazonaws.services.s3.model.Grant;
import com.amazonaws.services.s3.model.Grantee;
import com.amazonaws.services.s3.model.GroupGrantee;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.Owner;
import com.amazonaws.services.s3.model.Permission;
import com.amazonaws.util.StringUtils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Date;
import java.util.Set;

/**
 * Integration tests for S3 ACL operations on buckets and objects.
 */
public class AclIntegrationTest extends S3IntegrationTestBase {

    /** The name of the bucket these tests will create, test on and delete */
    private final String bucketName = "acl-integration-test-" + new Date().getTime();

    /** The key of the object these tests will create, test on and delete */
    private final String key = "key";

    /** Releases all test resources */
    @After
    public void tearDown() {
        s3.deleteObject(bucketName, key);
        s3.deleteBucket(bucketName);
    }

    /**
     * Tests that we can set and read custom ACLs on buckets and objects.
     */
    @Test
    public void testCustomAcls() throws Exception {
        s3.createBucket(bucketName);
        S3IntegrationTestBase.waitForBucketCreation(bucketName);

        s3.putObject(bucketName, key,
                new ByteArrayInputStream("foobarbazbar".getBytes(StringUtils.UTF8)),
                new ObjectMetadata());

        final AccessControlList customAcl = s3.getBucketAcl(bucketName);
        customAcl.grantPermission(new EmailAddressGrantee("aws-dr-eclipse@amazon.com"),
                Permission.Read);
        customAcl.grantPermission(GroupGrantee.AllUsers, Permission.ReadAcp);

        s3.setBucketAcl(bucketName, customAcl);
        s3.setObjectAcl(bucketName, key, customAcl);
        final AccessControlList bucketAcl = s3.getBucketAcl(bucketName);
        final AccessControlList objectAcl = s3.getBucketAcl(bucketName);

        final AccessControlList[] accessControls = new AccessControlList[] {
                bucketAcl, objectAcl
        };
        for (int index = 0; index < accessControls.length; index++) {
            final AccessControlList acl = accessControls[index];

            // S3 converts email grantees to canonical grantees, so we have to
            // do a little more work to validate them
            assertEquals(customAcl.getOwner(), acl.getOwner());
            assertTrue(doesAclContainsCanonicalGrant(acl, "aws-dr-eclipse", Permission.Read));
            assertTrue(doesAclContainGroupGrant(acl, GroupGrantee.AllUsers, Permission.ReadAcp));
            assertEquals(3, acl.getGrants().size());
        }
    }

    @Test
    public void testCreateBucketWithAcl() throws Exception {
        final AccessControlList acl = new AccessControlList();

        for (final Permission permission : Permission.values()) {
            acl.grantPermission(new CanonicalGrantee(AWS_DR_ECLIPSE_ACCT_ID), permission);
            acl.grantPermission(GroupGrantee.AuthenticatedUsers, permission);
            acl.grantPermission(new EmailAddressGrantee(AWS_DR_TOOLS_EMAIL_ADDRESS), permission);
        }

        s3.createBucket(new CreateBucketRequest(bucketName).withAccessControlList(acl));
        S3IntegrationTestBase.waitForBucketCreation(bucketName);

        final AccessControlList aclRead = s3.getBucketAcl(bucketName);

        assertEquals(15, aclRead.getGrants().size());

        final Set<Grant> expectedGrants = translateEmailAclsIntoCanonical(acl);

        for (final Grant expected : expectedGrants) {
            assertTrue("Didn't find expectd grant " + expected,
                    aclRead.getGrants().contains(expected));
        }
    }

    /**
     * Tests that we can set and read canned ACLs on buckets and objects.
     */
    @Test
    public void testCannedAcls() throws Exception {
        s3.createBucket(bucketName);
        S3IntegrationTestBase.waitForBucketCreation(bucketName);

        s3.putObject(bucketName, key,
                new ByteArrayInputStream("foobarbazbar".getBytes(StringUtils.UTF8)),
                new ObjectMetadata());
        final Owner bucketOwner = s3.getBucketAcl(bucketName).getOwner();

        // Public Read Canned ACL
        s3.setBucketAcl(bucketName, CannedAccessControlList.PublicRead);
        s3.setObjectAcl(bucketName, key, CannedAccessControlList.PublicRead);
        AccessControlList bucketAcl = s3.getBucketAcl(bucketName);
        AccessControlList objectAcl = s3.getObjectAcl(bucketName, key);

        AccessControlList[] accessControls = new AccessControlList[] {
                bucketAcl, objectAcl
        };
        for (int index = 0; index < accessControls.length; index++) {
            final AccessControlList acl = accessControls[index];
            assertEquals(bucketOwner, acl.getOwner());
            assertTrue(doesAclContainGroupGrant(acl, GroupGrantee.AllUsers, Permission.Read));
            assertEquals(2, acl.getGrants().size());
        }

        // Authenticated Read Canned ACL
        s3.setBucketAcl(bucketName, CannedAccessControlList.AuthenticatedRead);
        s3.setObjectAcl(bucketName, key, CannedAccessControlList.AuthenticatedRead);
        bucketAcl = s3.getBucketAcl(bucketName);
        objectAcl = s3.getObjectAcl(bucketName, key);

        accessControls = new AccessControlList[] {
                bucketAcl, objectAcl
        };
        for (int index = 0; index < accessControls.length; index++) {
            final AccessControlList acl = accessControls[index];
            assertEquals(bucketOwner, acl.getOwner());
            assertTrue(doesAclContainGroupGrant(acl, GroupGrantee.AuthenticatedUsers,
                    Permission.Read));
            assertEquals(2, acl.getGrants().size());
        }

        // Private Canned ACL
        s3.setBucketAcl(bucketName, CannedAccessControlList.Private);
        s3.setObjectAcl(bucketName, key, CannedAccessControlList.Private);
        bucketAcl = s3.getBucketAcl(bucketName);
        objectAcl = s3.getObjectAcl(bucketName, key);

        accessControls = new AccessControlList[] {
                bucketAcl, objectAcl
        };
        for (int index = 0; index < accessControls.length; index++) {
            final AccessControlList acl = accessControls[index];
            assertEquals(bucketOwner, acl.getOwner());
            assertEquals(1, acl.getGrants().size());
        }
    }

    /*
     * Private Test Helper Methods
     */

    /**
     * Returns true if the specified ACL contains a canonical grant with the
     * specified display name and permission.
     *
     * @param acl The AccessControlList to check.
     * @param expectedDisplayName The canonical grantee's display name being
     *            searched for.
     * @param expectedPermission The grantee's permission being searched for.
     * @return True if the specified ACL contains a canonical grant with the
     *         specified display name and permission, otherwise false.
     */
    private boolean doesAclContainsCanonicalGrant(AccessControlList acl, 
        String expectedDisplayName, 
        Permission expectedPermission) {

        for (final java.util.Iterator iterator = acl.getGrants().iterator(); iterator.hasNext();) {
            final Grant grant = (Grant) iterator.next();

            final Grantee grantee = grant.getGrantee();
            final Permission permission = grant.getPermission();

            if (grantee instanceof CanonicalGrantee) {
                final CanonicalGrantee canonicalGrantee = (CanonicalGrantee) grantee;
                if (canonicalGrantee.getDisplayName().equals(expectedDisplayName)
                        && permission.equals(expectedPermission)) {
                    return true;
                }
            }
        }

        return false;
    }

}
