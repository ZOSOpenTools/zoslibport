node('linux')
{
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/ZOSOpenTools/zoslibport.git'), string(name: 'PORT_DESCRIPTION', value: 'ZOSLIB is a z/OS C/C++ library. It is an extended implementation of the z/OS LE C Runtime Library.' )]
  }
}
