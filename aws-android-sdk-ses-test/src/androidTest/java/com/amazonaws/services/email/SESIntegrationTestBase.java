/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.email;

import android.support.test.InstrumentationRegistry;

import static org.junit.Assert.fail;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient;
import com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesResult;
import com.amazonaws.services.simpleemail.model.VerifyEmailAddressRequest;
import com.amazonaws.sestest.R;
import com.amazonaws.testutils.AWSTestBase;

import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.BeforeClass;

import java.io.InputStream;

/**
 * Base class for AWS Email integration tests; responsible for loading AWS
 * account credentials for running the tests, instantiating clients, etc.
 */
public abstract class SESIntegrationTestBase extends AWSTestBase {

	public static String HUDSON_EMAIL_LIST;
	protected static String EMAIL_TO_VERIFY;
	protected static String[] EMAILS = new String[2];

	public static String DESTINATION;
	public static String SOURCE;
	protected static String RAW_MESSAGE = "To: @DESTINATION@\n" +
			"From: @SOURCE@\n" +
			"Subject: Raw Test :draft-ietf-mailext-pipeline-01.txt\n" +
			"Date: Thu, 05 Jan 95 10:53:24 -0500\n" +
			"Message-ID: <9501051053.aa04167@IETF.CNR I.Reston.VA.US>\n" +
			"Mime-Version: 1.0\n" +
			"Content-type: Multipart/Mixed; boundary=\"NextPart\"\n" +
			"\n" +
			"--NextPart\n" +
			"\n" +
			"Content-type: text/plain; charset=\"us-ascii\"\n" +
			"\n" +
			"A Revised Internet-Draft is available from the on-line Internet-Drafts directories.\n" +
			"This draft is a work item of the Mail Extensions Working Group of the IETF.\n" +
			"Title           : SMTP Service Extension for Command Pipelining\n" +
			"Author(s)       : N. Freed, A. Cargille\n" +
			"Filename        : draft-ietf-mailext-pipeline-01.txt\n" +
			"Pages           : 9\n" +
			"Date            : 01/04/1995\n" +
			"\n" +
			"This memo defines an extension to the SMTP service whereby a server can indicate\n" +
			"the extent of its ability to accept multiple commands in a single TCP send operation.\n" +
			"Using a single TCP send operation for multiple commands can improve SMTP\n" +
			"performance significantly.\n" +
			"\n" +
			"--NextPart\n" +
			"\n" +
			"Content-type: Message/External-body;\n" +
			"name=\"draft-ietf-mailext-pipeline-01.txt\";\n" +
			"site=\"ds.internic.net\"; access-type=\"anon-ftp\"; directory=\"internet-drafts\"\n" +
			"\n" +
			"Content-Type: text/plain\n" +
			"Content-ID: <19950104161302.I-D@CNRI.Reston.VA.US>\n" +
			"\n" +
			"--NextPart";

	protected static AmazonSimpleEmailService email;

	/** Package name in testconfiguration.json */
	protected static final String PACKAGE_NAME = InstrumentationRegistry.getTargetContext().
													getResources().getString(R.string.package_name);

	public static JSONObject getPackageConfigure()  {
		return getPackageConfigure(PACKAGE_NAME);
	}

	/**
	 * Loads the AWS account info for the integration tests and creates client
	 * objects for tests to use.
	 */
	@BeforeClass
	public static void setUp() throws JSONException {
		setUpCredentials();

		HUDSON_EMAIL_LIST = getPackageConfigure().getString("hudson_email_list");
		EMAILS[0] = getPackageConfigure().getString("ios_test_email");
		EMAILS[1] = getPackageConfigure().getString("android_test_email");
		EMAIL_TO_VERIFY = getPackageConfigure().getString("ios_test_email");

		if (DESTINATION == null) {
			DESTINATION = System.getProperty("user.name").equals("webuser") ? HUDSON_EMAIL_LIST
					: System.getProperty("user.name") + "@amazon.com";
			if ("nobody@amazon.com".equalsIgnoreCase(DESTINATION)) {
				DESTINATION = HUDSON_EMAIL_LIST;
			}
			SOURCE = DESTINATION;
		}
		System.out.println("Destination for test: " + DESTINATION);
		email = new AmazonSimpleEmailServiceClient(credentials);

		sendVerificationEmail();
	}

	private static void sendVerificationEmail() {
		email.setEndpoint("https://email.us-east-1.amazonaws.com");
		ListVerifiedEmailAddressesResult verifiedEmails = email.listVerifiedEmailAddresses();
		for (String email : verifiedEmails.getVerifiedEmailAddresses()) {
			if (email.equals(DESTINATION)) {
				return;
			}
		}

		email.verifyEmailAddress(new VerifyEmailAddressRequest().withEmailAddress(DESTINATION));
		fail("Please check your email and verify your email address.");
	}

	protected String loadRawMessage(String rawMessage) {
		rawMessage = rawMessage.replace("@DESTINATION@", DESTINATION);
		rawMessage = rawMessage.replace("@SOURCE@", SOURCE);
		return rawMessage;
	}

	protected InputStream loadRawMessageAsStream(String messagePath) throws Exception {
		return IOUtils.toInputStream(loadRawMessage(messagePath));
	}
}
