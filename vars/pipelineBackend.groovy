def call(String backendStaging) {
    node {
        def remote = [:]
        remote.name = '${nameservice}'
        remote.host = 'xx.xx.xx.xx'
        remote.user = 'ubuntu'
        remote.identityFile = '/var/lib/jenkins/.ssh/id_rsa'
        remote.allowAnyHosts = true

                stage('Push Docker image') {
                    echo "hassssssi ${nameservice}"
                }
            }
}
