SUMMARY = "The AWS IoT client establishes a connection to AWS IoT, executes jobs and sends status information."

LICENSE = "CLOSED"

SRC_URI = "gitsm://git@github.com/osb-cc-esec/awsclient.git;protocol=ssh"

SRCREV = "badec8ececfd2cc5a7c0bad5d727a5e772561f82"
S = "${WORKDIR}/git"

DEPENDS = "curl glib-2.0 glib-2.0-native json-glib openssl"

inherit cmake

OECMAKE_GENERATOR = "Unix Makefiles"

do_install () {
    install -d ${D}${bindir}/
    install -m 0755 ${B}/src/awsclient ${D}${bindir}/
}
