def call(String backendStaging) {
    node {
        def remote = [:]
        remote.name = '${nameservice}'
        remote.host = '34.1.196.45'
        remote.user = 'ubuntu'
        remote.identityFile = '/var/lib/jenkins/.ssh/id_rsa'
        remote.allowAnyHosts = true

                stage('Push Docker image') {
                    echo "hai ${nameservice}"
                }
            }
}
