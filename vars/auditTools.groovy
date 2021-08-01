def call() {
    node {
        echo 'Hello from the common library'
        sh '''
           git version
           java -version
        '''
    }
}