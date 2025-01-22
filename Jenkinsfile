pipeline {
    agent any  // This means the pipeline can run on any available Jenkins agent.

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from your Git repository
                git branch: 'main', url: 'https://github.com/siripatchava/helloworldJava.git'
            }
        }
  }
}
