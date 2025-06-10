def call(String backendStaging) {
    node {
        def remote = [:]
        remote.name = '${nameservice}'
        remote.host = '34.1.196.45'
        remote.user = 'ubuntu'
        remote.identityFile = '/var/lib/jenkins/.ssh/id_rsa'
        remote.allowAnyHosts = true

        try {
                stage('Push Docker image') {
                    echo "hai ${nameservice}"
                }
            }
        } catch (Exception e) {
            currentBuild.result = 'FAILURE'
            echo 'Build failed!'
            throw e
        }

        echo 'Build succeeded!'
    }
}
