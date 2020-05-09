#!/usr/bin/env python3

import json
import os
import sys
from collections import namedtuple

import boto3


class DeviceConfigBuilder:
    """
    Builds a JSON document that a mobile device will read while it is
    executing on-device tests. The document contains information about
    arranged external resources, and it includes session credentials for
    interacting with AWS services.
    """

    STACK_PREFIX_BASE = '/mobile-sdk'
    """
    The test resource creation scripts will store resource
    identifiers into the SSM Parameter Store.  Any such parameters
    are expected to begin with this prefix.  Any parameters in the
    account that do not begin with this prefix will be ignored by
    the script.
    """

    def __init__(self, platform: str):
        if not platform in ['android', 'ios']:
            raise Exception('Platform must be one of: android, ios.')
        self.platform = platform

    AWSConfig = namedtuple('AWSConfig', 'accessKey secretKey sessionToken defaultRegion')

    def build_package_data(self, prefix: str, parameters: dict) -> dict:
        all_packages_data = dict()
        for parameter in parameters:
            name = parameter['Name'][len(prefix):]
            value = parameter['Value']
            self.add_package_data(all_packages_data, name, value)
        return all_packages_data

    def add_package_data(self, all_package_data: dict, key: str, value: str) -> None:
        """
        This is a helper method used by build_package_data.
        This is called recursively to explore a nested key path, as
        described below.

        Given a key of the form /suitename/foo/bar/baz,
        /suitename/foo/bar/baz is considered to be a key-path into a
        nested dicitonary structure. The provided ssm_value is stored as
        a string in its leaf:
        {
          "suitename": {
            "foo": {
              "bar": {
                "baz": ssm_value
              }
            }
          }
        }
        """
        key = key.strip('/')
        first_slash_pos = key.find('/')
        if first_slash_pos == -1:
            # If the key didn't have a '/', its just a simple leaf, and
            # we can store the value, here.
            all_package_data[key] = value
        else:
            # Otherwise, we need to nest. Pull out the next part of the
            # path, wrap a dict, and repeat the process on the remainder
            # of the key.
            first_part = key[:first_slash_pos]
            the_rest = key[(first_slash_pos + 1):]
            if not first_part in all_package_data:
                all_package_data[first_part] = dict()
            self.add_package_data(all_package_data[first_part], the_rest, value)

    def get_parameters_with_prefix(self, parameter_prefix: str, ssm) -> dict:
        """
        Call SSM and get all parameters that begin with a given path.
        """
        parameters = list()
        paginator = ssm.get_paginator('get_parameters_by_path')
        page_iterator = paginator.paginate(Path=parameter_prefix, Recursive=True)
        for page in page_iterator:
            for parameter in page['Parameters']:
                parameters.append(parameter)
        return parameters

    def ssm_client(self, aws_config: AWSConfig):
        """
        Builds an SSM client using the provided Config.
        """
        session = boto3.session.Session(
            aws_access_key_id=aws_config.accessKey,
            aws_secret_access_key=aws_config.secretKey,
            aws_session_token=aws_config.sessionToken,
            region_name=aws_config.defaultRegion
        )
        return session.client('ssm')

    def aws_config_from_environment(self) -> AWSConfig:
        """
        Inpsects the environment for four well-known AWS environment
        variables, and populates their value into an Config bundle.

        These credentials are used for two purposes:
          1. To call get-parameters-by-path against SSM, to understand
             the resource outputs of the various CDK scripts;
          2. For the execution of the test suites themselves, on the device.

        As a consequence, these credentials must have permissions
        sufficient to read data out of SSM Parameter Store, as well as
        to execute all of the various test suites, both.

        The default region is used only while talking to SSM. The
        provided region should be the same as what was used while
        running the CDK scripts.
        """
        return DeviceConfigBuilder.AWSConfig(
            os.environ['AWS_ACCESS_KEY_ID'],
            os.environ['AWS_SECRET_ACCESS_KEY'],
            os.environ['AWS_SESSION_TOKEN'],
            os.environ['AWS_DEFAULT_REGION']
       )

    def get_package_data(self) -> dict:
        aws_config = self.aws_config_from_environment()
        parameter_prefix = self.STACK_PREFIX_BASE + '/' + self.platform
        ssm = self.ssm_client(aws_config)
        parameters = self.get_parameters_with_prefix(parameter_prefix, ssm)
        package_data = self.build_package_data(parameter_prefix, parameters)
        return package_data

    def get_credentials_data(self) -> dict:
        aws_config = self.aws_config_from_environment()
        credentials_data = {
            'accessKey': aws_config.accessKey,
            'secretKey': aws_config.secretKey,
            'sessionToken': aws_config.sessionToken
        }
        return credentials_data

    def print_device_config(self) -> None:
        """
        Obtains credentials from the environment (only). Builds a Simple
        Systems Manager client, and uses it to read test resources out
        of the SSM Parameter Store.

        Bundles the credentials and the parameter values into an
        established JSON structure, suitable for being read on a mobile
        device running the SDK integration tests. The output of this
        function may be piped to a file.
        """
        package_data = self.get_package_data()
        credentials_data = self.get_credentials_data()
        print(json.dumps({
            'credentials': credentials_data,
            'packages': package_data
        }, indent=2))

if __name__ == "__main__":
    if len(sys.argv) != 2:
        raise Exception('Usage: ' + sys.argv[0] + ' <ios|android>')
    config_builder = DeviceConfigBuilder(sys.argv[1])
    config_builder.print_device_config()
