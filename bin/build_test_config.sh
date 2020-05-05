#!/usr/bin/env bash

set -e

DEST_DIR=./aws-android-sdk-testutils/src/main/res/raw
FILENAME=testconfiguration.json
REPO=https://github.com/aws-amplify/amplify-ci-support
SCRIPT=support/src/integ_test_resources/common/device_config_builder.py
TMP_DIR=$HOME/.aws-amplify

# Make directories if they don't exist
mkdir -p "$TMP_DIR" "$DEST_DIR"

# Remove previous repo
rm -rf "${TMP_DIR}/support"

# Clone the support repo into the temporary directory
(cd "$TMP_DIR" && git clone "$REPO" support)

# Generate file
(cd "$TMP_DIR" && python "$SCRIPT" android > "$FILENAME")

# Create symbolic link
ln -f -s "${TMP_DIR}/${FILENAME}" "${DEST_DIR}/${FILENAME}"
