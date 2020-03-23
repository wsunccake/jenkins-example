node {
    library (
		identifier: 'dynamic-libary@master', retriever: modernSCM(
            [$class: 'GitSCMSource',
            remote: 'https://github.com/wsunccake/jenkins-example.git'])
	)
	
    stage('vars') {
        sayHello 'Jenkins'
        log.info 'info message'
    }
    
    stage('src-function') {
        library (
            identifier: 'dynamic-libary@master', retriever: modernSCM(
                [$class: 'GitSCMSource',
                remote: 'https://github.com/wsunccake/jenkins-example.git'])
        ).org.foo.Zot.new().showMessage 'show zot'
    }
    
    stage('src-class') {
        def bar = library (
            identifier: 'dynamic-libary@master', retriever: modernSCM(
                [$class: 'GitSCMSource',
                remote: 'https://github.com/wsunccake/jenkins-example.git'])
        ).org.foo.Bar.new(this)
        bar.barRun('bar')
    }
}
